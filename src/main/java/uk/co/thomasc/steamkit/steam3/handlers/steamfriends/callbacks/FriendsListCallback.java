package uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callbacks;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverFriends.CMsgClientFriendsList;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EFriendRelationship;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.steamid.SteamID;

import java.util.HashSet;
import java.util.Set;

/**
 * This callback is fired when the client receives a list of friends.
 */
public final class FriendsListCallback extends CallbackMsg {
    /**
     * Gets a value indicating whether this {@link FriendsListCallback} is an
     * incremental update.
     */
    private final boolean incremental;
    /**
     * Gets the friend list.
     */
    private final Set<Friend> friendList = new HashSet<Friend>();

    public FriendsListCallback(CMsgClientFriendsList msg) {
        incremental = msg.getBincremental();
        for (final CMsgClientFriendsList.Friend friend : msg.getFriendsList()) {
            friendList.add(new Friend(friend));
        }
    }


    /**
     * Represents a single friend entry in a client's friendlist.
     */
    public final class Friend {
        /**
         * Gets the SteamID of the friend.
         */
        private final SteamID steamId;
        /**
         * Gets the relationship to this friend.
         */
        private final EFriendRelationship relationship;

        public Friend(CMsgClientFriendsList.Friend friend) {
            steamId = new SteamID(friend.getUlfriendid());
            relationship = EFriendRelationship.from(friend.getEfriendrelationship());
        }

        public SteamID getSteamId() {
            return this.steamId;
        }

        public EFriendRelationship getRelationship() {
            return this.relationship;
        }
    }

    /**
     * Gets a value indicating whether this {@link FriendsListCallback} is an
     * incremental update.
     */
    public boolean isIncremental() {
        return this.incremental;
    }

    /**
     * Gets the friend list.
     */
    public Set<Friend> getFriendList() {
        return this.friendList;
    }
}
