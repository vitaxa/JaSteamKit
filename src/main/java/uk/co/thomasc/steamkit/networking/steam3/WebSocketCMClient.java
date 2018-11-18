package uk.co.thomasc.steamkit.networking.steam3;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft_6455;
import org.java_websocket.handshake.ServerHandshake;
import uk.co.thomasc.steamkit.util.logging.DebugLog;

import java.net.URI;
import java.nio.ByteBuffer;

class WebSocketCMClient extends WebSocketClient {

    private final WSListener listener;

    WebSocketCMClient(URI serverUri, int timeout, WSListener listener) {
        super(serverUri, new Draft_6455(), null, timeout);
        this.listener = listener;
    }

    @Override
    public void onOpen(ServerHandshake handshakedata) {
        if (listener != null) {
            listener.onOpen();
        }
    }

    @Override
    public void onMessage(String message) {
        // ignore string messages
        DebugLog.writeLine("WebSocketCMClient", "got string message: " + message);
    }

    @Override
    public void onMessage(ByteBuffer bytes) {
        if (listener != null) {
            byte[] data = new byte[bytes.remaining()];
            bytes.get(data);
            listener.onData(data);
        }
    }

    @Override
    public void onClose(int code, String reason, boolean remote) {
        if (listener != null) {
            listener.onClose(remote);
        }
    }

    @Override
    public void onError(Exception ex) {
        if (listener != null) {
            listener.onError(ex);
        }
    }

    interface WSListener {
        void onData(byte[] data);
        void onClose(boolean remote);
        void onError(Exception ex);
        void onOpen();
    }
}
