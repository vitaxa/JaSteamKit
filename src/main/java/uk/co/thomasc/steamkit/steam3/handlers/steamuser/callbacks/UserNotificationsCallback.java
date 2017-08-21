package uk.co.thomasc.steamkit.steam3.handlers.steamuser.callbacks;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgClientUserNotifications;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;

public class UserNotificationsCallback extends CallbackMsg {
    /**
     * An array of the notifications from steam
     */
    private final UserNotification[] notifications;

    public UserNotificationsCallback(CMsgClientUserNotifications msg) {
        notifications = new UserNotification[msg.getNotificationsList().size()];
        for (int i = 0; i < msg.getNotificationsList().size(); i++) {
            int count = msg.getNotifications(i).getCount();
            int type = msg.getNotifications(i).getUserNotificationType();
            notifications[i] = new UserNotification(count, type);
        }
    }


    private static class UserNotification {
        public final int count;
        public final int type;

        UserNotification(int count, int type) {
            this.count = count;
            this.type = type;
        }
    }

    /**
     * An array of the notifications from steam
     */
    public UserNotification[] getNotifications() {
        return this.notifications;
    }
}
