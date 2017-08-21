package uk.co.thomasc.steamkit.steam3.handlers.steamnotifications;

import uk.co.thomasc.steamkit.base.ClientMsgProtobuf;
import uk.co.thomasc.steamkit.base.IPacketMsg;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.*;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgClientUserNotifications.Notification;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EMsg;
import uk.co.thomasc.steamkit.steam3.handlers.ClientMsgHandler;
import uk.co.thomasc.steamkit.steam3.handlers.steamnotifications.callbacks.NotificationOfflineMsgCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamnotifications.callbacks.NotificationUpdateCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamnotifications.types.NotificationType;

import java.util.HashMap;
import java.util.Map;

/**
 * This handler is used for grabbing/processing user notifications from steam
 */
public final class SteamNotifications extends ClientMsgHandler {
    private final Map<NotificationType, Integer> notificationCounts;

    public SteamNotifications() {
        // Initialize the array of notificaitons
        notificationCounts = new HashMap<NotificationType, Integer>();
        for (NotificationType notificationType : NotificationType.values()) notificationCounts.put(notificationType, 0);
    }

    /**
     * Gets the total number of user notifications
     */
    public int getTotalNotificationCount() {
        int count = 0;
        for (Integer num : notificationCounts.values()) count += num;
        // subtract the generic comment notification, to avoid double counting
        count -= notificationCounts.get(NotificationType.COMMENTS);
        return count;
    }

    /**
     * Requests the notification for offline messages
     */
    public void requestNotificationOfflineMessages() {
        final ClientMsgProtobuf<CMsgClientRequestOfflineMessageCount.Builder> request = new ClientMsgProtobuf<CMsgClientRequestOfflineMessageCount.Builder>(CMsgClientRequestOfflineMessageCount.class, EMsg.ClientFSRequestOfflineMessageCount);
        getClient().send(request);
    }

    /**
     * Requests the notification for new comments
     */
    public void requestNotificationComments() {
        final ClientMsgProtobuf<CMsgClientRequestCommentNotifications.Builder> request = new ClientMsgProtobuf<CMsgClientRequestCommentNotifications.Builder>(CMsgClientRequestCommentNotifications.class, EMsg.ClientRequestCommentNotifications);
        getClient().send(request);
    }

    /**
     * Requests the notification for new items
     */
    public void requestNotificationItem() {
        final ClientMsgProtobuf<CMsgClientRequestItemAnnouncements.Builder> request = new ClientMsgProtobuf<CMsgClientRequestItemAnnouncements.Builder>(CMsgClientRequestItemAnnouncements.class, EMsg.ClientRequestItemAnnouncements);
        getClient().send(request);
    }

    /**
     * Requests the notification for new items
     */
    public void requestNotificationGeneric() {
    }

    /**
     * Handles a client message. This should not be called directly.
     */
    @Override
    public void handleMsg(IPacketMsg packetMsg) {
        switch (packetMsg.getMsgType()) {
            case ClientFSOfflineMessageNotification:
                handleNotificationOfflineMessage(packetMsg);
                break;

            case ClientCommentNotifications:
                handleNotificationComment(packetMsg);
                break;

            case ClientItemAnnouncements:
                handleNotificationItem(packetMsg);
                break;

            case ClientUserNotifications:
                handleNotificationGeneric(packetMsg);
        }
    }

    void handleNotificationOfflineMessage(IPacketMsg packetMsg) {
        final ClientMsgProtobuf<CMsgClientOfflineMessageNotification.Builder> infoResponse = new ClientMsgProtobuf<CMsgClientOfflineMessageNotification.Builder>(CMsgClientOfflineMessageNotification.class, packetMsg);
        notificationCounts.put(NotificationType.OFFLINE_MSGS, infoResponse.getBody().getOfflineMessages());
        final NotificationOfflineMsgCallback callback = new NotificationOfflineMsgCallback(infoResponse.getBody().build());
        getClient().postCallback(callback);
        final NotificationUpdateCallback genericCallback = new NotificationUpdateCallback(this);
        getClient().postCallback(genericCallback);
    }

    void handleNotificationComment(IPacketMsg packetMsg) {
        final ClientMsgProtobuf<CMsgClientCommentNotifications.Builder> infoResponse = new ClientMsgProtobuf<CMsgClientCommentNotifications.Builder>(CMsgClientCommentNotifications.class, packetMsg);
        notificationCounts.put(NotificationType.COMMENTS, infoResponse.getBody().getCountNewComments());
        notificationCounts.put(NotificationType.COMMENTS_OWNER, infoResponse.getBody().getCountNewCommentsOwner());
        notificationCounts.put(NotificationType.COMMENTS_SUBSCRIPTIONS, infoResponse.getBody().getCountNewCommentsSubscriptions());
        final NotificationUpdateCallback genericCallback = new NotificationUpdateCallback(this);
        getClient().postCallback(genericCallback);
    }

    void handleNotificationItem(IPacketMsg packetMsg) {
        final ClientMsgProtobuf<CMsgClientItemAnnouncements.Builder> infoResponse = new ClientMsgProtobuf<CMsgClientItemAnnouncements.Builder>(CMsgClientItemAnnouncements.class, packetMsg);
        notificationCounts.put(NotificationType.ITEMS, infoResponse.getBody().getCountNewItems());
        final NotificationUpdateCallback genericCallback = new NotificationUpdateCallback(this);
        getClient().postCallback(genericCallback);
    }

    // this is for trade offers.
    void handleNotificationGeneric(IPacketMsg packetMsg) {
        final ClientMsgProtobuf<CMsgClientUserNotifications.Builder> infoResponse = new ClientMsgProtobuf<CMsgClientUserNotifications.Builder>(CMsgClientUserNotifications.class, packetMsg);
        notificationCounts.remove(NotificationType.TRADE_OFFERS);
        for (Notification notification : infoResponse.getBody().getNotificationsList()) {
            if (notification.getUserNotificationType() == 1) {
                notificationCounts.put(NotificationType.TRADE_OFFERS, notification.getCount());
            }
        }
        if (!notificationCounts.containsKey(NotificationType.TRADE_OFFERS))
            notificationCounts.put(NotificationType.TRADE_OFFERS, 0);
        final NotificationUpdateCallback genericCallback = new NotificationUpdateCallback(this);
        getClient().postCallback(genericCallback);
    }

    public Map<NotificationType, Integer> getNotificationCounts() {
        return this.notificationCounts;
    }
}
