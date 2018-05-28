package uk.co.thomasc.steamkit.steam3.handlers.steamuser.callbacks;

import uk.co.thomasc.steamkit.base.generated.steamlanguage.EAccountFlags;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EResult;
import uk.co.thomasc.steamkit.base.generated.steamlanguageinternal.MsgClientLogOnResponse;
import uk.co.thomasc.steamkit.steam3.handlers.steamuser.SteamUser;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.SteamID;
import uk.co.thomasc.steamkit.util.util.NetHelpers;

import java.net.InetAddress;
import java.util.Date;
import java.util.EnumSet;

import static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogonResponse;

/**
 * This callback is returned in response to an attempt to log on to the Steam3 network through {@link SteamUser}.
 */
public class LoggedOnCallback extends CallbackMsg {

    private EResult result;

    private EResult extendedResult;

    private int outOfGameSecsPerHeartbeat;

    private int inGameSecsPerHeartbeat;

    private InetAddress publicIP;

    private Date serverTime;

    private EnumSet<EAccountFlags> accountFlags;

    private SteamID clientSteamID;

    private String emailDomain;

    private int cellID;

    private int cellIDPingThreshold;

    private byte[] steam2Ticket;

    private boolean usePICS;

    private String webAPIUserNonce;

    private String ipCountryCode;

    private String vanityURL;

    private int numLoginFailuresToMigrate;

    private int numDisconnectsToMigrate;

    public LoggedOnCallback(CMsgClientLogonResponse.Builder resp) {
        result = EResult.from(resp.getEresult());
        extendedResult = EResult.from(resp.getEresultExtended());

        outOfGameSecsPerHeartbeat = resp.getOutOfGameHeartbeatSeconds();
        inGameSecsPerHeartbeat = resp.getInGameHeartbeatSeconds();

        publicIP = NetHelpers.getIPAddress(resp.getPublicIp());
        serverTime = new Date(resp.getRtime32ServerTime() * 1000L);

        accountFlags = EAccountFlags.from(resp.getAccountFlags());

        clientSteamID = new SteamID(resp.getClientSuppliedSteamid());

        emailDomain = resp.getEmailDomain();

        cellID = resp.getCellId();
        cellIDPingThreshold = resp.getCellIdPingThreshold();

        steam2Ticket = resp.getSteam2Ticket().toByteArray();

        ipCountryCode = resp.getIpCountryCode();

        webAPIUserNonce = resp.getWebapiAuthenticateUserNonce();

        usePICS = resp.getUsePics();

        vanityURL = resp.getVanityUrl();

        numLoginFailuresToMigrate = resp.getCountLoginfailuresToMigrate();
        numDisconnectsToMigrate = resp.getCountDisconnectsToMigrate();
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

    public EResult getResult() {
        return result;
    }

    public EResult getExtendedResult() {
        return extendedResult;
    }

    public int getOutOfGameSecsPerHeartbeat() {
        return outOfGameSecsPerHeartbeat;
    }

    public int getInGameSecsPerHeartbeat() {
        return inGameSecsPerHeartbeat;
    }

    public InetAddress getPublicIP() {
        return publicIP;
    }

    public Date getServerTime() {
        return serverTime;
    }

    public EnumSet<EAccountFlags> getAccountFlags() {
        return accountFlags;
    }

    public SteamID getClientSteamID() {
        return clientSteamID;
    }

    public String getEmailDomain() {
        return emailDomain;
    }

    public int getCellID() {
        return cellID;
    }

    public int getCellIDPingThreshold() {
        return cellIDPingThreshold;
    }

    public byte[] getSteam2Ticket() {
        return steam2Ticket;
    }

    public boolean isUsePICS() {
        return usePICS;
    }

    public String getWebAPIUserNonce() {
        return webAPIUserNonce;
    }

    public String getIpCountryCode() {
        return ipCountryCode;
    }

    public String getVanityURL() {
        return vanityURL;
    }

    public int getNumLoginFailuresToMigrate() {
        return numLoginFailuresToMigrate;
    }

    public int getNumDisconnectsToMigrate() {
        return numDisconnectsToMigrate;
    }
}

