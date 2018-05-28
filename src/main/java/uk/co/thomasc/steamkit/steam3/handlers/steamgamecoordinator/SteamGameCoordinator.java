package uk.co.thomasc.steamkit.steam3.handlers.steamgamecoordinator;

import com.google.protobuf.ByteString;
import uk.co.thomasc.steamkit.base.ClientMsgProtobuf;
import uk.co.thomasc.steamkit.base.IClientGCMsg;
import uk.co.thomasc.steamkit.base.IPacketMsg;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgGCClient;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EMsg;
import uk.co.thomasc.steamkit.steam3.handlers.ClientMsgHandler;
import uk.co.thomasc.steamkit.steam3.handlers.steamgamecoordinator.callbacks.MessageCallback;
import uk.co.thomasc.steamkit.util.util.MsgUtil;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 * This handler handles all game coordinator messaging.
 */
public final class SteamGameCoordinator extends ClientMsgHandler {

    private Map<EMsg, Consumer<IPacketMsg>> dispatchMap;

    public SteamGameCoordinator() {
        dispatchMap = new HashMap<>();

        dispatchMap.put(EMsg.ClientFromGC, new Consumer<IPacketMsg>() {
            @Override
            public void accept(IPacketMsg packetMsg) {
                handleFromGC(packetMsg);
            }
        });

        dispatchMap = Collections.unmodifiableMap(dispatchMap);
    }

    /**
     * Sends a game coordinator message for a specific appid.
     *
     * @param msg   The GC message to send.
     * @param appId The app id of the game coordinator to send to.
     */
    public void send(IClientGCMsg msg, int appId) {
        if (msg == null) {
            throw new IllegalArgumentException("msg is null");
        }

        ClientMsgProtobuf<CMsgGCClient.Builder> clientMsg = new ClientMsgProtobuf<>(CMsgGCClient.class, EMsg.ClientToGC);

        clientMsg.getProtoHeader().setRoutingAppid(appId);
        clientMsg.getBody().setMsgtype(MsgUtil.makeGCMsg(msg.getMsgType().code(), msg.isProto()));
        clientMsg.getBody().setAppid(appId);

        clientMsg.getBody().setPayload(ByteString.copyFrom(msg.serialize()));

        client.send(clientMsg);
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

    private void handleFromGC(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgGCClient.Builder> msg = new ClientMsgProtobuf<>(CMsgGCClient.class, packetMsg);

        client.postCallback(new MessageCallback(msg.getBody()));
    }
}
