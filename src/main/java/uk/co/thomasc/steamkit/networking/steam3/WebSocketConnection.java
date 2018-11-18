package uk.co.thomasc.steamkit.networking.steam3;

import uk.co.thomasc.steamkit.util.logging.DebugLog;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.concurrent.atomic.AtomicReference;

public class WebSocketConnection extends Connection implements WebSocketCMClient.WSListener {

    private final AtomicReference<WebSocketCMClient> client = new AtomicReference<>(null);

    private volatile boolean userInitiated = false;

    @Override
    public void connect(InetSocketAddress endPoint, int timeout) {
        DebugLog.writeLine("WebSocketConnection", "Connecting to " + endPoint + "...");
        WebSocketCMClient newClient = new WebSocketCMClient(getUri(endPoint), timeout, this);
        WebSocketCMClient oldClient = client.getAndSet(newClient);
        if (oldClient != null) {
            DebugLog.writeLine("WebSocketConnection", "Attempted to connect while already connected. Closing old connection...");
            oldClient.close();
        }

        newClient.connect();
    }

    @Override
    public void disconnect() {
        disconnectCore(true);
    }

    @Override
    public void send(byte[] data) {
        try {
            client.get().send(data);
        } catch (Exception e) {
            DebugLog.printStackTrace("WebSocketConnection", e);
            disconnectCore(false);
        }
    }

    @Override
    public InetAddress getLocalIP() {
        return client.get().getLocalSocketAddress().getAddress();
    }

    @Override
    public InetSocketAddress getCurrentEndPoint() {
        return client.get().getRemoteSocketAddress();
    }

    @Override
    public ProtocolType getProtocolType() {
        return ProtocolType.WEB_SOCKET;
    }

    private void disconnectCore(boolean userInitiated) {
        WebSocketCMClient oldClient = client.getAndSet(null);

        if (oldClient != null) {
            oldClient.close();
            this.userInitiated = userInitiated;
        }
    }

    private static URI getUri(InetSocketAddress address) {
        return URI.create("wss://" + address.getHostString() + ":" + address.getPort() + "/cmsocket/");
    }

    @Override
    public void onData(byte[] data) {
        if (data != null && data.length > 0) {
            onNetMsgReceived(new NetMsgEventArgs(data, getCurrentEndPoint()));
        }
    }

    @Override
    public void onClose(boolean remote) {
        onDisconnected(userInitiated && !remote);
    }

    @Override
    public void onError(Exception ex) {
        DebugLog.printStackTrace("WebSocketConnection", ex);
    }

    @Override
    public void onOpen() {
        DebugLog.writeLine("WebSocketConnection", "Connected to " + getCurrentEndPoint());
        onConnected();
    }
}

