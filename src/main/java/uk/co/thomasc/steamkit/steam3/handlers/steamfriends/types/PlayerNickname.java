package uk.co.thomasc.steamkit.steam3.handlers.steamfriends.types;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverFriends.CMsgClientPlayerNicknameList;
import uk.co.thomasc.steamkit.types.SteamID;

/**
 * Represents a nickname of a friend
 */
public class PlayerNickname {

    private SteamID steamID;

    private String nickname;

    public PlayerNickname(CMsgClientPlayerNicknameList.PlayerNickname nickname) {
        this.nickname = nickname.getNickname();
        steamID = new SteamID(nickname.getSteamid());
    }

    /**
     * @return the steam id of the friend
     */
    public SteamID getSteamID() {
        return steamID;
    }

    /**
     * @return the nickname of the friend
     */
    public String getNickname() {
        return nickname;
    }
}
