package uk.co.thomasc.steamkit.steam3.handlers.steamfriends.types;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverFriends.CMsgClientFriendsList;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EFriendRelationship;
import uk.co.thomasc.steamkit.types.steamid.SteamID;

/**
 * Represents a single friend entry in a client's friendlist.
 */
public class Friend {
    private SteamID steamID;

    private EFriendRelationship relationship;

    public Friend(CMsgClientFriendsList.Friend friend) {
        steamID = new SteamID(friend.getUlfriendid());
        relationship = EFriendRelationship.from(friend.getEfriendrelationship());
    }

    public SteamID getSteamID() {
        return steamID;
    }

    public EFriendRelationship getRelationship() {
        return relationship;
    }
}
