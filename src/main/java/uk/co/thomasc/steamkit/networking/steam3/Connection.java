package uk.co.thomasc.steamkit.networking.steam3;

import uk.co.thomasc.steamkit.util.cSharp.events.Event;
import uk.co.thomasc.steamkit.util.cSharp.events.EventArgs;

import java.net.InetAddress;
import java.net.InetSocketAddress;

public abstract class Connection {
    /**
     * Occurs when a net message is recieved over the network.
     */
    protected Event<NetMsgEventArgs> netMsgReceived = new Event<NetMsgEventArgs>();

    /**
     * Raises the {@link #netMsgReceived} event.
     *
     * @param e
     *            The {@link NetMsgEventArgs} instance containing the event
     *            data.
     */
    protected void onNetMsgReceived(NetMsgEventArgs e) {
        if (netMsgReceived != null) {
            netMsgReceived.handleEvent(this, e);
        }
    }

    /**
     * Occurs when the physical connection is established.
     */
    Event<EventArgs> connected = new Event<>();

    protected void onConnected(EventArgs e) {
        if (connected != null) {
            connected.handleEvent(this, e);
        }
    }

    /**
     * Occurs when the physical connection is broken.
     */
    Event<DisconnectedEventArgs> disconnected = new Event<>();

    protected void onDisconnected(boolean e) {
        if (disconnected != null) {
            disconnected.handleEvent(this, new DisconnectedEventArgs(e));
        }
    }

    /**
     * Connects to the specified end point.
     *
     * @param endPoint
     *            The end point.
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

    public abstract InetSocketAddress currentIpEndPoint();

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
