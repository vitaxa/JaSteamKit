package uk.co.thomasc.steamkit.steam3.handlers.steamnotifications.callback;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgClientUserNotifications;
import uk.co.thomasc.steamkit.steam3.handlers.steamnotifications.Notification;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;

import java.util.ArrayList;
import java.util.List;

/**
 * Fired when the client receives user notifications.
 */
public class UserNotificationsCallback extends CallbackMsg {

    private List<Notification> notifications;

    public UserNotificationsCallback(CMsgClientUserNotifications.Builder msg) {
        notifications = new ArrayList<>();
        for (CMsgClientUserNotifications.Notification notification : msg.getNotificationsList()) {
            notifications.add(new Notification(notification));
        }
    }

    /**
     * @return the notifications
     */
    public List<Notification> getNotifications() {
        return notifications;
    }
}
