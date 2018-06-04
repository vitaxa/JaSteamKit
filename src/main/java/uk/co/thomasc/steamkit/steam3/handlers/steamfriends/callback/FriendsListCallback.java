package uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callback;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverFriends;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.types.Friend;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This callback is fired when the client receives a list of friends.
 */
public class FriendsListCallback extends CallbackMsg {
    private boolean incremental;

    private List<Friend> friendList;

    public FriendsListCallback(SteammessagesClientserverFriends.CMsgClientFriendsList.Builder msg) {
        incremental = msg.getBincremental();

        List<Friend> list = new ArrayList<>();
        for (SteammessagesClientserverFriends.CMsgClientFriendsList.Friend friend : msg.getFriendsList()) {
            list.add(new Friend(friend));
        }

        friendList = Collections.unmodifiableList(list);
    }

    public boolean isIncremental() {
        return incremental;
    }

    public List<Friend> getFriendList() {
        return friendList;
    }
}
