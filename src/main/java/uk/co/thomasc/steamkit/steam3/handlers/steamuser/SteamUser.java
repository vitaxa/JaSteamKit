package uk.co.thomasc.steamkit.steam3.handlers.steamuser;

import com.google.protobuf.ByteString;
import uk.co.thomasc.steamkit.base.ClientMsg;
import uk.co.thomasc.steamkit.base.ClientMsgProtobuf;
import uk.co.thomasc.steamkit.base.IPacketMsg;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver.CMsgClientSessionToken;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver.CMsgClientWalletInfoUpdate;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgClientUpdateMachineAuth;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgClientUpdateMachineAuthResponse;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.*;
import uk.co.thomasc.steamkit.base.generated.enums.EAccountType;
import uk.co.thomasc.steamkit.base.generated.enums.EMsg;
import uk.co.thomasc.steamkit.base.generated.enums.EResult;
import uk.co.thomasc.steamkit.base.generated.internal.MsgClientLogOnResponse;
import uk.co.thomasc.steamkit.base.generated.internal.MsgClientLoggedOff;
import uk.co.thomasc.steamkit.base.generated.internal.MsgClientLogon;
import uk.co.thomasc.steamkit.base.generated.internal.MsgClientMarketingMessageUpdate2;
import uk.co.thomasc.steamkit.steam3.handlers.ClientMsgHandler;
import uk.co.thomasc.steamkit.steam3.handlers.steamuser.callbacks.*;
import uk.co.thomasc.steamkit.steam3.handlers.steamuser.types.AnonymousLogOnDetails;
import uk.co.thomasc.steamkit.steam3.handlers.steamuser.types.LogOnDetails;
import uk.co.thomasc.steamkit.steam3.handlers.steamuser.types.MachineAuthDetails;
import uk.co.thomasc.steamkit.steam3.steamclient.callbacks.DisconnectedCallback;
import uk.co.thomasc.steamkit.types.AsyncJob;
import uk.co.thomasc.steamkit.types.JobID;
import uk.co.thomasc.steamkit.types.SimpleAsyncJob;
import uk.co.thomasc.steamkit.types.SteamID;
import uk.co.thomasc.steamkit.util.HardwareUtils;
import uk.co.thomasc.steamkit.util.StringHelper;
import uk.co.thomasc.steamkit.util.util.NetHelpers;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 * This handler handles all user log on/log off related actions and callbacks.
 */
public class SteamUser extends ClientMsgHandler {

    private Map<EMsg, Consumer<IPacketMsg>> dispatchMap;

    public SteamUser() {
        dispatchMap = new HashMap<>();

        dispatchMap.put(EMsg.ClientLogOnResponse, this::handleLogOnResponse);
        dispatchMap.put(EMsg.ClientLoggedOff, this::handleLoggedOff);
        dispatchMap.put(EMsg.ClientNewLoginKey, this::handleLoginKey);
        dispatchMap.put(EMsg.ClientSessionToken, this::handleSessionToken);
        dispatchMap.put(EMsg.ClientUpdateMachineAuth, this::handleUpdateMachineAuth);
        dispatchMap.put(EMsg.ClientAccountInfo, this::handleAccountInfo);
        dispatchMap.put(EMsg.ClientWalletInfoUpdate, this::handleWalletInfo);
        dispatchMap.put(EMsg.ClientRequestWebAPIAuthenticateUserNonceResponse, this::handleWebAPIUserNonce);
        dispatchMap.put(EMsg.ClientMarketingMessageUpdate2, this::handleMarketingMessageUpdate);

        dispatchMap = Collections.unmodifiableMap(dispatchMap);
    }

    /**
     * Logs the client into the Steam3 network.
     * The client should already have been connected at this point.
     * Results are returned in a {@link LoggedOnCallback}.
     *
     * @param details The details to use for logging on.
     */
    public void logOn(LogOnDetails details) {
        if (details == null) {
            throw new IllegalArgumentException("details is null");
        }

        if (StringHelper.isNullOrEmpty(details.getUsername()) || StringHelper.isNullOrEmpty(details.getPassword()) && StringHelper.isNullOrEmpty(details.getLoginKey())) {
            throw new IllegalArgumentException("LogOn requires a username and password to be set in 'details'.");
        }

        if (!StringHelper.isNullOrEmpty(details.getLoginKey()) && !details.isShouldRememberPassword()) {
            // Prevent consumers from screwing this up.
            // If should_remember_password is false, the login_key is ignored server-side.
            // The inverse is not applicable (you can log in with should_remember_password and no login_key).
            throw new IllegalArgumentException("ShouldRememberPassword is required to be set to true in order to use LoginKey.");
        }

        if (!getClient().isConnected()) {
            getClient().postCallback(new LoggedOnCallback(EResult.NoConnection));
            return;
        }

        ClientMsgProtobuf<CMsgClientLogon.Builder> logon = new ClientMsgProtobuf<>(CMsgClientLogon.class, EMsg.ClientLogon);

        SteamID steamID = new SteamID(details.getAccountID(), details.getAccountInstance(), getClient().getUniverse(), EAccountType.Individual);

        if (details.getLoginID() != null) {
            logon.getBody().setObfustucatedPrivateIp(details.getLoginID());
        } else {
            int localIp = NetHelpers.getIPAddress(getClient().getLocalIP());
            logon.getBody().setObfustucatedPrivateIp(localIp ^ MsgClientLogon.ObfuscationMask);
        }

        logon.getProtoHeader().setClientSessionid(0);
        logon.getProtoHeader().setSteamid(steamID.convertToUInt64());

        logon.getBody().setAccountName(details.getUsername());
        if (!StringHelper.isNullOrEmpty(details.getPassword())) {
            logon.getBody().setPassword(details.getPassword());
        }
        logon.getBody().setShouldRememberPassword(details.isShouldRememberPassword());

        logon.getBody().setProtocolVersion(MsgClientLogon.CurrentProtocol);
        logon.getBody().setClientOsType(details.getClientOSType().code());
        logon.getBody().setClientLanguage(details.getClientLanguage());
        logon.getBody().setCellId(details.getCellID());

        logon.getBody().setSteam2TicketRequest(details.isRequestSteam2Ticket());

        // we're now using the latest steamclient package version, this is required to get a proper sentry file for steam guard
        logon.getBody().setClientPackageVersion(1771); // todo: determine if this is still required
        logon.getBody().setSupportsRateLimitResponse(true);
        logon.getBody().setMachineId(ByteString.copyFrom(HardwareUtils.getMachineID()));

        // steam guard
        if (!StringHelper.isNullOrEmpty(details.getAuthCode())) {
            logon.getBody().setAuthCode(details.getAuthCode());
        }

        if (!StringHelper.isNullOrEmpty(details.getTwoFactorCode())) {
            logon.getBody().setTwoFactorCode(details.getTwoFactorCode());
        }

        if (!StringHelper.isNullOrEmpty(details.getLoginKey())) {
            logon.getBody().setLoginKey(details.getLoginKey());
        }

        if (details.getSentryFileHash() != null) {
            logon.getBody().setShaSentryfile(ByteString.copyFrom(details.getSentryFileHash()));
        }
        logon.getBody().setEresultSentryfile(details.getSentryFileHash() != null ? EResult.OK.code() : EResult.FileNotFound.code());

        getClient().send(logon);
    }

    /**
     * Logs the client into the Steam3 network as an anonymous user.
     * The client should already have been connected at this point.
     * Results are returned in a {@link LoggedOnCallback}.
     */
    public void logOnAnonymous() {
        logOnAnonymous(new AnonymousLogOnDetails());
    }

    /**
     * Logs the client into the Steam3 network as an anonymous user.
     * The client should already have been connected at this point.
     * Results are returned in a {@link LoggedOnCallback}.
     *
     * @param details The details to use for logging on.
     */
    public void logOnAnonymous(AnonymousLogOnDetails details) {
        if (details == null) {
            throw new IllegalArgumentException("details is null");
        }

        if (!getClient().isConnected()) {
            getClient().postCallback(new LoggedOnCallback(EResult.NoConnection));
            return;
        }

        ClientMsgProtobuf<CMsgClientLogon.Builder> logon = new ClientMsgProtobuf<>(CMsgClientLogon.class, EMsg.ClientLogon);

        SteamID auId = new SteamID(0, 0, getClient().getUniverse(), EAccountType.AnonUser);

        logon.getProtoHeader().setClientSessionid(0);
        logon.getProtoHeader().setSteamid(auId.convertToUInt64());

        logon.getBody().setProtocolVersion(MsgClientLogon.CurrentProtocol);
        logon.getBody().setClientOsType(details.getClientOSType().code());
        logon.getBody().setClientLanguage(details.getClientLanguage());
        logon.getBody().setCellId(details.getCellID());

        logon.getBody().setMachineId(ByteString.copyFrom(HardwareUtils.getMachineID()));

        getClient().send(logon);
    }

    /**
     * Informs the Steam servers that this client wishes to log off from the network.
     * The Steam server will disconnect the client, and a
     * {@link DisconnectedCallback} will be posted.
     */
    public void logOff() {
        setExpectDisconnection(true);

        ClientMsgProtobuf<CMsgClientLogOff.Builder> logOff = new ClientMsgProtobuf<>(CMsgClientLogOff.class, EMsg.ClientLogOff);
        getClient().send(logOff);

        // TODO: it seems like the socket is not closed after getting logged of or I am doing something horribly wrong, let's disconnect here
        getClient().disconnect();
    }

    /**
     * Sends a machine auth response.
     * This should normally be used in response to a {@link UpdateMachineAuthCallback}.
     *
     * @param details The details pertaining to the response.
     */
    public void sendMachineAuthResponse(MachineAuthDetails details) {
        if (details == null) {
            throw new IllegalArgumentException("details is null");
        }

        ClientMsgProtobuf<CMsgClientUpdateMachineAuthResponse.Builder> response = new ClientMsgProtobuf<>(CMsgClientUpdateMachineAuthResponse.class, EMsg.ClientUpdateMachineAuthResponse);

        // so we respond to the correct message
        response.getProtoHeader().setJobidTarget(details.getJobID().getValue());

        response.getBody().setCubwrote(details.getBytesWritten());
        response.getBody().setEresult(details.geteResult().code());

        response.getBody().setFilename(details.getFileName());
        response.getBody().setFilesize(details.getFileSize());

        response.getBody().setGetlasterror(details.getLastError());
        response.getBody().setOffset(details.getOffset());

        response.getBody().setShaFile(ByteString.copyFrom(details.getSentryFileHash()));

        response.getBody().setOtpIdentifier(details.getOneTimePassword().getIdentifier());
        response.getBody().setOtpType(details.getOneTimePassword().getType());
        response.getBody().setOtpValue(details.getOneTimePassword().getValue());

        getClient().send(response);
    }

    /**
     * Requests a new WebAPI authentication user nonce.
     * Results are returned in a {@link WebAPIUserNonceCallback}.
     *
     * @return The Job ID of the request. This can be used to find the appropriate {@link WebAPIUserNonceCallback}.
     */
    public AsyncJob<WebAPIUserNonceCallback> requestWebAPIUserNonce() {
        ClientMsgProtobuf<CMsgClientRequestWebAPIAuthenticateUserNonce.Builder> reqMsg =
                new ClientMsgProtobuf<>(CMsgClientRequestWebAPIAuthenticateUserNonce.class, EMsg.ClientRequestWebAPIAuthenticateUserNonce);
        JobID jobID = client.getNextJobID();
        reqMsg.setSourceJobID(jobID);

        client.send(reqMsg);

        return new SimpleAsyncJob<WebAPIUserNonceCallback>(client, reqMsg.getSourceJobID());
    }

    /**
     * Accepts the new Login Key provided by a {@link LoginKeyCallback}.
     *
     * @param callback The callback containing the new Login Key.
     */
    public void acceptNewLoginKey(LoginKeyCallback callback) {
        if (callback == null) {
            throw new IllegalArgumentException("callback is null");
        }

        ClientMsgProtobuf<CMsgClientNewLoginKeyAccepted.Builder> acceptance = new ClientMsgProtobuf<>(CMsgClientNewLoginKeyAccepted.class, EMsg.ClientNewLoginKeyAccepted);
        acceptance.getBody().setUniqueId(callback.getUniqueID());

        client.send(acceptance);
    }

    @Override
    public void handleMsg(IPacketMsg packetMsg) {
        if (packetMsg == null) {
            throw new IllegalArgumentException("packetMsg is null");
        }

        Consumer<IPacketMsg> dispatcher = dispatchMap.get(packetMsg.getMsgType());
        if (dispatcher != null) {
            dispatcher.accept(packetMsg);
        }
    }

    public SteamID getSteamID() {
        return getClient().getSteamID();
    }

    private void handleLogOnResponse(IPacketMsg packetMsg) {
        if (packetMsg.isProto()) {
            ClientMsgProtobuf<CMsgClientLogonResponse.Builder> logonResp = new ClientMsgProtobuf<>(CMsgClientLogonResponse.class, packetMsg);

            getClient().postCallback(new LoggedOnCallback(logonResp.getBody()));
        } else {
            ClientMsg<MsgClientLogOnResponse> logonResp = new ClientMsg<>(MsgClientLogOnResponse.class, packetMsg);

            getClient().postCallback(new LoggedOnCallback(logonResp.getBody()));
        }
    }

    private void handleLoggedOff(IPacketMsg packetMsg) {
        EResult result;

        if (packetMsg.isProto()) {
            ClientMsgProtobuf<CMsgClientLoggedOff.Builder> loggedOff = new ClientMsgProtobuf<>(CMsgClientLoggedOff.class, packetMsg);
            result = EResult.from(loggedOff.getBody().getEresult());
        } else {
            ClientMsg<MsgClientLoggedOff> loggedOff = new ClientMsg<>(MsgClientLoggedOff.class, packetMsg);
            result = loggedOff.getBody().getResult();
        }

        getClient().postCallback(new LoggedOffCallback(result));

        // TODO: it seems like the socket is not closed after getting logged of or I am doing something horribly wrong, let's disconnect here
        getClient().disconnect();
    }

    private void handleLoginKey(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientNewLoginKey.Builder> loginKey = new ClientMsgProtobuf<>(CMsgClientNewLoginKey.class, packetMsg);
        getClient().postCallback(new LoginKeyCallback(loginKey.getBody()));
    }

    private void handleSessionToken(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientSessionToken.Builder> sessToken = new ClientMsgProtobuf<>(CMsgClientSessionToken.class, packetMsg);
        getClient().postCallback(new SessionTokenCallback(sessToken.getBody()));
    }

    private void handleUpdateMachineAuth(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientUpdateMachineAuth.Builder> machineAuth = new ClientMsgProtobuf<>(CMsgClientUpdateMachineAuth.class, packetMsg);
        getClient().postCallback(new UpdateMachineAuthCallback(new JobID(packetMsg.getSourceJobID()), machineAuth.getBody()));
    }

    private void handleAccountInfo(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientAccountInfo.Builder> accInfo = new ClientMsgProtobuf<>(CMsgClientAccountInfo.class, packetMsg);
        getClient().postCallback(new AccountInfoCallback(accInfo.getBody()));
    }

    private void handleWalletInfo(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientWalletInfoUpdate.Builder> walletInfo = new ClientMsgProtobuf<>(CMsgClientWalletInfoUpdate.class, packetMsg);
        getClient().postCallback(new WalletInfoCallback(walletInfo.getBody()));
    }

    private void handleWebAPIUserNonce(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientRequestWebAPIAuthenticateUserNonceResponse.Builder> userNonce = new ClientMsgProtobuf<>(CMsgClientRequestWebAPIAuthenticateUserNonceResponse.class, packetMsg);
        getClient().postCallback(new WebAPIUserNonceCallback(userNonce.getTargetJobID(), userNonce.getBody()));
    }

    private void handleMarketingMessageUpdate(IPacketMsg packetMsg) {
        ClientMsg<MsgClientMarketingMessageUpdate2> marketingMessage = new ClientMsg<>(MsgClientMarketingMessageUpdate2.class, packetMsg);

        byte[] payload = marketingMessage.getPayload().toByteArray();

        client.postCallback(new MarketingMessageCallback(marketingMessage.getBody(), payload));
    }
}
