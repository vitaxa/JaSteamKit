package uk.co.thomasc.steamkit.steam3.handlers.steamgamecoordinator;

import com.google.protobuf.ByteString;
import uk.co.thomasc.steamkit.base.ClientMsgProtobuf;
import uk.co.thomasc.steamkit.base.IPacketMsg;
import uk.co.thomasc.steamkit.base.gc.ClientGCMsg;
import uk.co.thomasc.steamkit.base.gc.EGCMsgBase;
import uk.co.thomasc.steamkit.base.gc.IClientGCMsg;
import uk.co.thomasc.steamkit.base.gc.tf2.GCMsgCraftItemResponse;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgGCClient;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EMsg;
import uk.co.thomasc.steamkit.steam3.handlers.ClientMsgHandler;
import uk.co.thomasc.steamkit.steam3.handlers.steamgamecoordinator.callbacks.CraftResponseCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamgamecoordinator.callbacks.MessageCallback;
import uk.co.thomasc.steamkit.util.util.MsgUtil;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * This handler handles all game coordinator messaging.
 */
public final class SteamGameCoordinator extends ClientMsgHandler {

    private final Map<EMsg, Action<IPacketMsg>> dispatchMap;

    public SteamGameCoordinator() {
        this.dispatchMap = new HashMap<>(6);
        this.dispatchMap.put(EMsg.ClientFromGC, this::handleFromGC);
    }

    /**
     * Sends a game coordinator message for a specific appid.
     *
     * @param msg
     *            The GC message to send.
     * @param appId
     *            The app id of the game coordinator to send to.
     */
    public void send(IClientGCMsg msg, int appId) {
        final ClientMsgProtobuf<CMsgGCClient.Builder> clientMsg = new ClientMsgProtobuf<CMsgGCClient.Builder>(CMsgGCClient.class, EMsg.ClientToGC);

        clientMsg.getBody().setMsgtype(MsgUtil.makeGCMsg(msg.getMsgType(), msg.isProto()));
        clientMsg.getBody().setAppid(appId);

        try {
            clientMsg.getBody().setPayload(ByteString.copyFrom(msg.serialize()));

            getClient().send(clientMsg);
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Handles a client message. This should not be called directly.
     *
     * @param packetMsg
     *            The packet message that contains the data.
     */
    @Override
    public void handleMsg(IPacketMsg packetMsg) {
        final Action<IPacketMsg> iPacketMsgAction = dispatchMap.get(packetMsg.getMsgType());
        boolean haveFunc = dispatchMap.containsKey(packetMsg.getMsgType());
        if (!haveFunc) {
            // ignore messages that we don't have a handler function for
            return;
        }

        dispatchMap.get(packetMsg.getMsgType()).handle(packetMsg);
    }

    private void handleFromGC(IPacketMsg packetMsg) {
        final ClientMsgProtobuf<CMsgGCClient.Builder> msg = new ClientMsgProtobuf<>(CMsgGCClient.class, packetMsg);

        final MessageCallback messageCallback = new MessageCallback(msg.getBody().build());
        getClient().postCallback(messageCallback);
        if (messageCallback.getEMsg() == EGCMsgBase.CraftResponse) {
            final ClientGCMsg<GCMsgCraftItemResponse> craftMsg = new ClientGCMsg<GCMsgCraftItemResponse>(GCMsgCraftItemResponse.class);
            try {
                craftMsg.deSerialize(msg.getBody().getPayload().toByteArray());

                final CraftResponseCallback craftCallback = new CraftResponseCallback(craftMsg.getBody());
                getClient().postCallback(craftCallback);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private interface Action<T> {
        public void handle(T msg);
    }
}
