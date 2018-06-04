package uk.co.thomasc.steamkit.steam3.handlers.steamfriends.types;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverFriends.CMsgClientPersonaState;
import uk.co.thomasc.steamkit.base.generated.enums.EClientPersonaStateFlag;
import uk.co.thomasc.steamkit.base.generated.enums.EPersonaState;
import uk.co.thomasc.steamkit.base.generated.enums.EPersonaStateFlag;
import uk.co.thomasc.steamkit.types.GameID;
import uk.co.thomasc.steamkit.types.SteamID;
import uk.co.thomasc.steamkit.util.util.NetHelpers;

import java.net.InetAddress;
import java.util.Date;
import java.util.EnumSet;

/**
 * Represents the persone state of a friend.
 */
public class PersonaState {
    private EnumSet<EClientPersonaStateFlag> statusFlags;

    private SteamID friendID;

    private EPersonaState state;

    private EnumSet<EPersonaStateFlag> stateFlags;

    private int gameAppID;

    private GameID gameID;

    private String gameName;

    private InetAddress gameServerIP;

    private int gameServerPort;

    private int queryPort;

    private SteamID sourceSteamID;

    private byte[] gameDataBlob;

    private String name;

    private byte[] avatarHash;

    private Date lastLogOff;

    private Date lastLogOn;

    private int clanRank;

    private String clanTag;

    private int onlineSessionInstances;

    private int publishedSessionID;

    public PersonaState(CMsgClientPersonaState.Friend friend) {
        statusFlags = EClientPersonaStateFlag.from(friend.getPersonaStateFlags());

        friendID = new SteamID(friend.getFriendid());
        state = EPersonaState.from(friend.getPersonaState());
        stateFlags = EPersonaStateFlag.from(friend.getPersonaStateFlags());

        gameAppID = friend.getGamePlayedAppId();
        gameID = new GameID(friend.getGameid());
        gameName = friend.getGameName();

        gameServerIP = NetHelpers.getIPAddress(friend.getGameServerIp());
        gameServerPort = friend.getGameServerPort();
        queryPort = friend.getQueryPort();

        sourceSteamID = new SteamID(friend.getSteamidSource());

        gameDataBlob = friend.getGameDataBlob().toByteArray();

        name = friend.getPlayerName();

        avatarHash = friend.getAvatarHash().toByteArray();

        lastLogOff = new Date(friend.getLastLogoff() * 1000L);
        lastLogOn = new Date(friend.getLastLogon() * 1000L);

        clanRank = friend.getClanRank();
        clanTag = friend.getClanTag();

        onlineSessionInstances = friend.getOnlineSessionInstances();
        publishedSessionID = friend.getPublishedInstanceId();
    }

    public EnumSet<EClientPersonaStateFlag> getStatusFlags() {
        return statusFlags;
    }

    public SteamID getFriendID() {
        return friendID;
    }

    public EPersonaState getState() {
        return state;
    }

    public EnumSet<EPersonaStateFlag> getStateFlags() {
        return stateFlags;
    }

    public int getGameAppID() {
        return gameAppID;
    }

    public GameID getGameID() {
        return gameID;
    }

    public String getGameName() {
        return gameName;
    }

    public InetAddress getGameServerIP() {
        return gameServerIP;
    }

    public int getGameServerPort() {
        return gameServerPort;
    }

    public int getQueryPort() {
        return queryPort;
    }

    public SteamID getSourceSteamID() {
        return sourceSteamID;
    }

    public byte[] getGameDataBlob() {
        return gameDataBlob;
    }

    public String getName() {
        return name;
    }

    public byte[] getAvatarHash() {
        return avatarHash;
    }

    public Date getLastLogOff() {
        return lastLogOff;
    }

    public Date getLastLogOn() {
        return lastLogOn;
    }

    public int getClanRank() {
        return clanRank;
    }

    public String getClanTag() {
        return clanTag;
    }

    public int getOnlineSessionInstances() {
        return onlineSessionInstances;
    }

    public int getPublishedSessionID() {
        return publishedSessionID;
    }
}
