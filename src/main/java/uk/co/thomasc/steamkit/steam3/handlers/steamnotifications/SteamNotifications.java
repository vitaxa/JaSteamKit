package uk.co.thomasc.steamkit.steam3.handlers.steamnotifications;

import uk.co.thomasc.steamkit.base.ClientMsgProtobuf;
import uk.co.thomasc.steamkit.base.IPacketMsg;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.*;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EMsg;
import uk.co.thomasc.steamkit.steam3.handlers.ClientMsgHandler;
import uk.co.thomasc.steamkit.steam3.handlers.steamnotifications.callback.CommentNotificationsCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamnotifications.callback.ItemAnnouncementsCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamnotifications.callback.OfflineMessageNotificationCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamnotifications.callback.UserNotificationsCallback;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 * This handler handles steam notifications.
 */
public class SteamNotifications extends ClientMsgHandler {

    private Map<EMsg, Consumer<IPacketMsg>> dispatchMap;

    public SteamNotifications() {
        dispatchMap = new HashMap<>();

        dispatchMap.put(EMsg.ClientUserNotifications, this::handleUserNotifications);
        dispatchMap.put(EMsg.ClientFSOfflineMessageNotification, this::handleOfflineMessageNotification);
        dispatchMap.put(EMsg.ClientCommentNotifications, this::handleCommentNotifications);
        dispatchMap.put(EMsg.ClientItemAnnouncements, this::handleItemAnnouncements);

        dispatchMap = Collections.unmodifiableMap(dispatchMap);
    }

    /**
     * Request comment notifications.
     * Results are returned in a {@link CommentNotificationsCallback}.
     */
    public void requestCommentNotifications() {
        ClientMsgProtobuf<CMsgClientRequestCommentNotifications.Builder> request =
                new ClientMsgProtobuf<>(CMsgClientRequestCommentNotifications.class, EMsg.ClientRequestCommentNotifications);

        client.send(request);
    }

    /**
     * Request new items notifications.
     * Results are returned in a {@link ItemAnnouncementsCallback}.
     */
    public void requestItemAnnouncements() {
        ClientMsgProtobuf<CMsgClientRequestItemAnnouncements.Builder> request =
                new ClientMsgProtobuf<>(CMsgClientRequestItemAnnouncements.class, EMsg.ClientRequestItemAnnouncements);

        client.send(request);
    }

    /**
     * Request offline message count.
     * Results are returned in a {@link OfflineMessageNotificationCallback}.
     */
    public void requestOfflineMessageCount() {
        ClientMsgProtobuf<CMsgClientRequestOfflineMessageCount.Builder> request =
                new ClientMsgProtobuf<>(CMsgClientRequestOfflineMessageCount.class, EMsg.ClientFSRequestOfflineMessageCount);

        client.send(request);
    }

    @Override
    public void handleMsg(IPacketMsg packetMsg) {
        if (packetMsg == null) {
            throw new IllegalArgumentException("packetMsg is null");
        }

        Consumer<IPacketMsg> dispatcher = dispatchMap.get(packetMsg.getMsgType());
        if (dispatcher != null) {
            dispatcher.accept(packetMsg);
        }
    }

    private void handleUserNotifications(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientUserNotifications.Builder> msg =
                new ClientMsgProtobuf<>(CMsgClientUserNotifications.class, packetMsg);

        client.postCallback(new UserNotificationsCallback(msg.getBody()));
    }

    private void handleOfflineMessageNotification(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientOfflineMessageNotification.Builder> msg =
                new ClientMsgProtobuf<>(CMsgClientOfflineMessageNotification.class, packetMsg);

        client.postCallback(new OfflineMessageNotificationCallback(msg.getBody()));
    }

    private void handleCommentNotifications(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientCommentNotifications.Builder> msg =
                new ClientMsgProtobuf<>(CMsgClientCommentNotifications.class, packetMsg);

        client.postCallback(new CommentNotificationsCallback(msg.getBody()));
    }

    private void handleItemAnnouncements(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientItemAnnouncements.Builder> msg =
                new ClientMsgProtobuf<>(CMsgClientItemAnnouncements.class, packetMsg);

        client.postCallback(new ItemAnnouncementsCallback(msg.getBody()));
    }
}
