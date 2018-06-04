package uk.co.thomasc.steamkit.steam3.handlers.steamgameserver;

import com.google.protobuf.ByteString;
import uk.co.thomasc.steamkit.base.ClientMsgProtobuf;
import uk.co.thomasc.steamkit.base.IPacketMsg;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver.CMsgClientTicketAuthComplete;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver.CMsgGSStatusReply;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon;
import uk.co.thomasc.steamkit.base.generated.enums.EAccountType;
import uk.co.thomasc.steamkit.base.generated.enums.EMsg;
import uk.co.thomasc.steamkit.base.generated.enums.EResult;
import uk.co.thomasc.steamkit.base.generated.enums.EServerFlags;
import uk.co.thomasc.steamkit.base.generated.internal.MsgClientLogon;
import uk.co.thomasc.steamkit.steam3.handlers.ClientMsgHandler;
import uk.co.thomasc.steamkit.steam3.handlers.steamgameserver.callbacks.StatusReplyCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamgameserver.callbacks.TicketAuthCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamgameserver.types.LogOnDetails;
import uk.co.thomasc.steamkit.steam3.handlers.steamgameserver.types.StatusDetails;
import uk.co.thomasc.steamkit.steam3.handlers.steamuser.callbacks.LoggedOnCallback;
import uk.co.thomasc.steamkit.steam3.steamclient.callbacks.DisconnectedCallback;
import uk.co.thomasc.steamkit.types.SteamID;
import uk.co.thomasc.steamkit.util.HardwareUtils;
import uk.co.thomasc.steamkit.util.StringHelper;
import uk.co.thomasc.steamkit.util.util.NetHelpers;
import uk.co.thomasc.steamkit.util.util.Utils;

import java.net.Inet6Address;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 * This handler is used for interacting with the Steam network as a game server.
 */
public final class SteamGameServer extends ClientMsgHandler {
    private Map<EMsg, Consumer<IPacketMsg>> dispatchMap;

    public SteamGameServer() {
        dispatchMap = new HashMap<>();

        dispatchMap.put(EMsg.GSStatusReply, this::handleStatusReply);

        dispatchMap.put(EMsg.ClientTicketAuthComplete, this::handleAuthComplete);

        dispatchMap = Collections.unmodifiableMap(dispatchMap);
    }

    /**
     * Logs onto the Steam network as a persistent game server.
     * The client should already have been connected at this point.
     * Results are return in a {@link LoggedOnCallback}.
     *
     * @param details The details to use for logging on.
     */
    public void logOn(LogOnDetails details) {
        if (details == null) {
            throw new IllegalArgumentException("details is null");
        }

        if (StringHelper.isNullOrEmpty(details.getToken())) {
            throw new IllegalArgumentException("LogOn requires a game server token to be set in 'details'.");
        }

        if (!client.isConnected()) {
            client.postCallback(new LoggedOnCallback(EResult.NoConnection));
            return;
        }

        ClientMsgProtobuf<CMsgClientLogon.Builder> logon =
                new ClientMsgProtobuf<>(CMsgClientLogon.class, EMsg.ClientLogonGameServer);

        SteamID gsId = new SteamID(0, 0, client.getUniverse(), EAccountType.GameServer);

        logon.getProtoHeader().setClientSessionid(0);
        logon.getProtoHeader().setSteamid(gsId.convertToUInt64());

        int localIp = NetHelpers.getIPAddress(client.getLocalIP());
        logon.getBody().setObfustucatedPrivateIp(localIp ^ MsgClientLogon.ObfuscationMask);

        logon.getBody().setProtocolVersion(MsgClientLogon.CurrentProtocol);

        logon.getBody().setClientOsType(Utils.getOSType().code());
        logon.getBody().setGameServerAppId(details.getAppID());
        logon.getBody().setMachineId(ByteString.copyFrom(HardwareUtils.getMachineID()));

        logon.getBody().setGameServerToken(details.getToken());

        client.send(logon);
    }

    /**
     * Logs the client into the Steam3 network as an anonymous game server.
     * The client should already have been connected at this point.
     * Results are return in a {@link LoggedOnCallback}.
     */
    public void logOnAnonymous() {
        logOnAnonymous(0);
    }

    /**
     * Logs the client into the Steam3 network as an anonymous game server.
     * The client should already have been connected at this point.
     * Results are return in a {@link LoggedOnCallback}.
     *
     * @param appId The AppID served by this game server, or 0 for the default.
     */
    public void logOnAnonymous(int appId) {

        if (!client.isConnected()) {
            client.postCallback(new LoggedOnCallback(EResult.NoConnection));
            return;
        }

        ClientMsgProtobuf<CMsgClientLogon.Builder> logon =
                new ClientMsgProtobuf<>(CMsgClientLogon.class, EMsg.ClientLogonGameServer);

        SteamID gsId = new SteamID(0, 0, client.getUniverse(), EAccountType.AnonGameServer);

        logon.getProtoHeader().setClientSessionid(0);
        logon.getProtoHeader().setSteamid(gsId.convertToUInt64());

        int localIp = NetHelpers.getIPAddress(client.getLocalIP());
        logon.getBody().setObfustucatedPrivateIp(localIp ^ MsgClientLogon.ObfuscationMask);

        logon.getBody().setProtocolVersion(MsgClientLogon.CurrentProtocol);

        logon.getBody().setClientOsType(Utils.getOSType().code());
        logon.getBody().setGameServerAppId(appId);
        logon.getBody().setMachineId(ByteString.copyFrom(HardwareUtils.getMachineID()));

        client.send(logon);
    }

    /**
     * Informs the Steam servers that this client wishes to log off from the network.
     * The Steam server will disconnect the client, and a {@link DisconnectedCallback} will be posted.
     */
    public void logOff() {
        setExpectDisconnection(true);

        ClientMsgProtobuf<CMsgClientLogOff.Builder> logOff = new ClientMsgProtobuf<>(CMsgClientLogOff.class, EMsg.ClientLogOff);
        client.send(logOff);

        // TODO: it seems like the socket is not closed after getting logged of or I am doing something horribly wrong, let's disconnect here
        client.disconnect();
    }

    /**
     * Sends the server's status to the Steam network.
     * Results are returned in a {@link StatusReplyCallback} callback.
     * @param details A {@link StatusDetails} object containing the server's status.
     */
    public void sendStatus(StatusDetails details) {
        if (details == null) {
            throw new IllegalArgumentException("details is null");
        }

        if (details.getAddress() != null && details.getAddress() instanceof Inet6Address) {
            throw new IllegalArgumentException("Only IPv4 addresses are supported.");
        }

        ClientMsgProtobuf<SteammessagesClientserver.CMsgGSServerType.Builder> status = new ClientMsgProtobuf<>(SteammessagesClientserver.CMsgGSServerType.class, EMsg.GSServerType);
        status.getBody().setAppIdServed(details.getAppID());
        status.getBody().setFlags(EServerFlags.code(details.getServerFlags()));
        status.getBody().setGameDir(details.getGameDirectory());
        status.getBody().setGamePort(details.getPort());
        status.getBody().setGameQueryPort(details.getQueryPort());
        status.getBody().setGameVersion(details.getVersion());

        if (details.getAddress() != null) {
            status.getBody().setGameIpAddress(NetHelpers.getIPAddress(details.getAddress()));
        }

        client.send(status);
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

    private void handleStatusReply(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgGSStatusReply.Builder> statusReply =
                new ClientMsgProtobuf<>(CMsgGSStatusReply.class, packetMsg);

        client.postCallback(new StatusReplyCallback(statusReply.getBody()));
    }

    private void handleAuthComplete(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientTicketAuthComplete.Builder> statusReply =
                new ClientMsgProtobuf<>(CMsgClientTicketAuthComplete.class, packetMsg);

        client.postCallback(new TicketAuthCallback(statusReply.getBody()));
    }
}
