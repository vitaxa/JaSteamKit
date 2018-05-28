package uk.co.thomasc.steamkit.steam3.handlers.steamuser.callbacks;

import uk.co.thomasc.steamkit.base.generated.steamlanguage.EAccountFlags;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EResult;
import uk.co.thomasc.steamkit.base.generated.steamlanguageinternal.MsgClientLogOnResponse;
import uk.co.thomasc.steamkit.steam3.handlers.steamuser.SteamUser;
import uk.co.thomasc.steamkit.steam3.handlers.steamuser.types.LogOnDetails;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.steam2ticket.Steam2Ticket;
import uk.co.thomasc.steamkit.types.steamid.SteamID;
import uk.co.thomasc.steamkit.util.util.NetHelpers;

import java.net.InetAddress;
import java.util.Date;
import java.util.EnumSet;

import static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse;

/**
 * This callback is returned in response to an attempt to log on to the Steam3
 * network through {@link SteamUser}.
 */
public final class LoggedOnCallback extends CallbackMsg {
    /**
     * Gets the result of the logon.
     */
    private EResult result;
    /**
     * Gets the extended result of the logon.
     */
    private EResult extendedResult;
    /**
     * Gets the out of game secs per heartbeat value. This is used internally by
     * SteamKit to initialize heartbeating.
     */
    private int outOfGameSecsPerHeartbeat;
    /**
     * Gets the in game secs per heartbeat value. This is used internally by
     * SteamKit to initialize heartbeating.
     */
    private int inGameSecsPerHeartbeat;
    /**
     * Gets or sets the public IP of the client
     */
    private InetAddress publicIP;
    /**
     * Gets the Steam3 server time.
     */
    private Date serverTime;
    /**
     * Gets the account flags assigned by the server.
     */
    private EnumSet<EAccountFlags> accountFlags;
    /**
     * Gets the client steam ID.
     */
    private SteamID clientSteamID;
    /**
     * Gets the email domain.
     */
    private String emailDomain;
    /**
     * Gets the WebAPI User Nonce
     */
    private String webAPIUserNonce;
    /**
     * Gets the Steam2 CellID.
     */
    private int cellId;
    /**
     * Gets the Steam2 ticket. This is used for authenticated content downloads
     * in Steam2. This field will only be set when
     * {@link LogOnDetails#requestSteam2Ticket} has been set to true.
     */
    private Steam2Ticket steam2Ticket = null;

    public LoggedOnCallback(CMsgClientLogonResponse.Builder resp) {
        result = EResult.from(resp.getEresult());
        extendedResult = EResult.from(resp.getEresultExtended());
        outOfGameSecsPerHeartbeat = resp.getOutOfGameHeartbeatSeconds();
        inGameSecsPerHeartbeat = resp.getInGameHeartbeatSeconds();
        publicIP = NetHelpers.getIPAddress(resp.getPublicIp());
        serverTime = new Date(resp.getRtime32ServerTime());
        accountFlags = EAccountFlags.from(resp.getAccountFlags());
        clientSteamID = new SteamID(resp.getClientSuppliedSteamid());
        emailDomain = resp.getEmailDomain();
        cellId = resp.getCellId();
        webAPIUserNonce = resp.getWebapiAuthenticateUserNonce();
        if (resp.getSteam2Ticket().size() > 0) steam2Ticket = new Steam2Ticket(resp.getSteam2Ticket().toByteArray());
    }

    public LoggedOnCallback(MsgClientLogOnResponse resp) {
        result = resp.getResult();

        outOfGameSecsPerHeartbeat = resp.getOutOfGameHeartbeatRateSec();
        inGameSecsPerHeartbeat = resp.getInGameHeartbeatRateSec();

        publicIP = NetHelpers.getIPAddress((int) resp.getIpPublic());

        serverTime = new Date(resp.getServerRealTime() * 1000L);

        clientSteamID = resp.getClientSuppliedSteamId();
    }

    public LoggedOnCallback(EResult result) {
        this.result = result;
    }

    /**
     * Gets the result of the logon.
     */
    public EResult getResult() {
        return this.result;
    }

    /**
     * Gets the extended result of the logon.
     */
    public EResult getExtendedResult() {
        return this.extendedResult;
    }

    /**
     * Gets the out of game secs per heartbeat value. This is used internally by
     * SteamKit to initialize heartbeating.
     */
    public int getOutOfGameSecsPerHeartbeat() {
        return this.outOfGameSecsPerHeartbeat;
    }

    /**
     * Gets the in game secs per heartbeat value. This is used internally by
     * SteamKit to initialize heartbeating.
     */
    public int getInGameSecsPerHeartbeat() {
        return this.inGameSecsPerHeartbeat;
    }

    /**
     * Gets or sets the public IP of the client
     */
    public InetAddress getPublicIP() {
        return this.publicIP;
    }

    /**
     * Gets the Steam3 server time.
     */
    public Date getServerTime() {
        return this.serverTime;
    }

    /**
     * Gets the account flags assigned by the server.
     */
    public EnumSet<EAccountFlags> getAccountFlags() {
        return this.accountFlags;
    }

    /**
     * Gets the client steam ID.
     */
    public SteamID getClientSteamID() {
        return this.clientSteamID;
    }

    /**
     * Gets the email domain.
     */
    public String getEmailDomain() {
        return this.emailDomain;
    }

    /**
     * Gets the WebAPI User Nonce
     */
    public String getWebAPIUserNonce() {
        return this.webAPIUserNonce;
    }

    /**
     * Gets the Steam2 CellID.
     */
    public int getCellId() {
        return this.cellId;
    }

    /**
     * Gets the Steam2 ticket. This is used for authenticated content downloads
     * in Steam2. This field will only be set when
     * {@link LogOnDetails#requestSteam2Ticket} has been set to true.
     */
    public Steam2Ticket getSteam2Ticket() {
        return this.steam2Ticket;
    }
}
