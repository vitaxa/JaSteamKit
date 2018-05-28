package uk.co.thomasc.steamkit.networking.steam3;

import uk.co.thomasc.steamkit.util.cSharp.events.EventArgs;

import java.net.InetSocketAddress;

/**
 * Represents data that has been received over the network.
 */
public class NetMsgEventArgs extends EventArgs {
    private final byte[] data;
    private final InetSocketAddress endPoint;

    public NetMsgEventArgs(byte[] data, InetSocketAddress endPoint) {
        this.data = data;
        this.endPoint = endPoint;
    }

    public NetMsgEventArgs withData(byte[] data) {
        return new NetMsgEventArgs(data, this.endPoint);
    }

    public byte[] getData() {
        return this.data;
    }

    public InetSocketAddress getEndPoint() {
        return this.endPoint;
    }
}
