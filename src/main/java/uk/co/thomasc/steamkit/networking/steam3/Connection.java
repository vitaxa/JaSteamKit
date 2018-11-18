package uk.co.thomasc.steamkit.networking.steam3;

import uk.co.thomasc.steamkit.util.cSharp.events.Event;
import uk.co.thomasc.steamkit.util.cSharp.events.EventArgs;

import java.net.InetAddress;
import java.net.InetSocketAddress;

public abstract class Connection {
    /**
     * Occurs when a net message is received over the network.
     */
    final Event<NetMsgEventArgs> netMsgReceived = new Event<NetMsgEventArgs>();

    /**
     * Occurs when the physical connection is established.
     */
    final Event<EventArgs> connected = new Event<>();

    /**
     * Occurs when the physical connection is broken.
     */
    final Event<DisconnectedEventArgs> disconnected = new Event<>();

    /**
     * Raises the {@link #netMsgReceived} event.
     *
     * @param e The {@link NetMsgEventArgs} instance containing the event
     *          data.
     */
    void onNetMsgReceived(NetMsgEventArgs e) {
        netMsgReceived.handleEvent(this, e);
    }

    void onConnected(EventArgs e) {
        connected.handleEvent(this, e);
    }

    void onConnected() {
        connected.handleEvent(this, null);
    }

    void onDisconnected(boolean e) {
        disconnected.handleEvent(this, new DisconnectedEventArgs(e));
    }

    /**
     * Connects to the specified end point.
     *
     * @param endPoint The end point.
     */
    public abstract void connect(InetSocketAddress endPoint, int timeout);

    /**
     * Connects to the specified end point.
     *
     * @param endPoint The end point to connect to.
     */
    public final void connect(InetSocketAddress endPoint) {
        connect(endPoint, 5000);
    }

    /**
     * Disconnects this instance.
     */
    public abstract void disconnect();

    /**
     * Sends the specified data packet.
     *
     * @param data The data packet to send.
     */
    public abstract void send(byte[] data);

    /**
     * Gets the local IP.
     *
     * @return The local IP
     */
    public abstract InetAddress getLocalIP();

    public abstract InetSocketAddress getCurrentEndPoint();

    public Event<NetMsgEventArgs> getNetMsgReceived() {
        return netMsgReceived;
    }

    public abstract ProtocolType getProtocolType();

    public Event<EventArgs> getConnected() {
        return connected;
    }

    public Event<DisconnectedEventArgs> getDisconnected() {
        return disconnected;
    }
}
