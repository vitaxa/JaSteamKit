package uk.co.thomasc.steamkit.steam3.handlers.steamnotifications.callback;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgClientOfflineMessageNotification;
import uk.co.thomasc.steamkit.steam3.handlers.steamnotifications.SteamNotifications;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.SteamID;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Fired in response to calling {@link SteamNotifications#requestOfflineMessageCount()}.
 */
public class OfflineMessageNotificationCallback extends CallbackMsg {

    private int messageCount;

    private List<SteamID> friendsWithOfflineMessages;

    public OfflineMessageNotificationCallback(CMsgClientOfflineMessageNotification.Builder msg) {
        messageCount = msg.getOfflineMessages();

        friendsWithOfflineMessages = new ArrayList<>();
        for (Integer id : msg.getFriendsWithOfflineMessagesList()) {
            friendsWithOfflineMessages.add(new SteamID(id));
        }
        friendsWithOfflineMessages = Collections.unmodifiableList(friendsWithOfflineMessages);
    }

    /**
     * @return the number of new messages
     */
    public int getMessageCount() {
        return messageCount;
    }

    /**
     * @return the ids of friends the new messages belong to
     */
    public List<SteamID> getFriendsWithOfflineMessages() {
        return friendsWithOfflineMessages;
    }
}
