package uk.co.thomasc.steamkit.networking.steam3;

import uk.co.thomasc.steamkit.base.IClientMsg;
import uk.co.thomasc.steamkit.util.cSharp.events.EventArgs;
import uk.co.thomasc.steamkit.util.cSharp.ip.IPEndPoint;
import uk.co.thomasc.steamkit.util.logging.DebugLog;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpConnection extends Connection {
    private final static int MAGIC = 0x31305456; // "VT01"

    private volatile boolean isConnected;

    private Socket sock;

    private BinaryReader netReader;
    private BinaryWriter netWriter;

    private Thread netThread;

    private final Object netLock = new Object();

    /**
     * Connects to the specified end point.
     *
     * @param endPoint
     *            The end point.
     */
    @Override
    public void connect(IPEndPoint endPoint) {
        // if we're connected, disconnect
        disconnect();

        DebugLog.writeLine("TcpConnection", "Connecting to %s...", endPoint);
        Socket socket = null;
        try {
            socket = new Socket();
            socket.connect(new InetSocketAddress(endPoint.getIpAddress(), endPoint.getPort()), 15000); // 15 second timeout
        } catch (final IOException e) {
            DebugLog.writeLine("TcpConnection", "Error connecting (1): %s", e);
        }

        try {
            connectCompleted(socket);
        } catch (final IOException e) {
            DebugLog.writeLine("TcpConnection", "Error connecting (2): %s", e);
        }
    }

    /**
     * Disconnects this instance.
     */
    @Override
    public void disconnect() {
        if (!isConnected) {
            return;
        }

        cleanup();

        netThread = null;
    }

    /**
     * Sends the specified client net message.
     * @param clientMsg The client net message.
     */
    @Override
    public void send(IClientMsg clientMsg) {
        try {
            if (!isConnected) {
                DebugLog.writeLine("TcpConnection", "Attempting to send client message when not connected: %s", clientMsg.getMsgType());
                return;
            }

            byte[] data = clientMsg.serialize();

            // encrypt outgoing traffic if we need to
            if (netFilter != null) {
                data = netFilter.processOutgoing(data);
            }

            synchronized (netLock) {
                // write header
                netWriter.write(data.length);
                netWriter.write(TcpConnection.MAGIC);

                netWriter.write(data);

                netWriter.flush();
            }
        } catch (final IOException ex) {
            DebugLog.writeLine("TcpConnection", "Socket exception occurred while writing packet: %s", ex);
            cleanup();
        }
    }

    @Override
    public InetAddress getLocalIP() {
        if (sock == null) {
            try {
                return InetAddress.getLocalHost();
            } catch (UnknownHostException e) {
                e.printStackTrace();
            } // Return a InetAddress. The request will fail anyway so it doesn't matter
        }
        return sock.getLocalAddress();
    }

    private void connectCompleted(Socket socket) throws IOException {

        sock = socket;

        if (sock == null || !sock.isConnected()) {
            DebugLog.writeLine("TcpConnection", "Socket already connected or null");
            onDisconnected(false);
            return;
        }

        DebugLog.writeLine("TcpConnection", "Connected!");

        isConnected = true;

        netReader = new BinaryReader(sock.getInputStream());
        netWriter = new BinaryWriter(sock.getOutputStream());

        // initialize our network thread
        netThread = new Thread(new NetLoop());
        netThread.setName("TcpConnection Thread");
        netThread.start();

        onConnected(EventArgs.Empty);
    }

    private final class NetLoop implements Runnable {
        /**
         * Nets the loop.
         */
        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {

                if (!isConnected) {
                    break;
                }

                boolean canRead = false;
                try {
                    canRead = !netReader.isAtEnd();
                } catch (final IOException ignored) {
                    // Do nothing
                }

                if (!canRead) {
                    // nothing to read yet
                    continue;
                }

                // read the packet off the network
                try {
                    final byte[] packData = readPacket();
                    if (packData.length > 0) {
                        onNetMsgReceived(new NetMsgEventArgs(packData, new IPEndPoint(sock.getInetAddress().getHostAddress(), sock.getPort())));
                    }
                } catch (IOException e) {
                    if(!sock.isClosed()) {
                        DebugLog.writeLine("TcpConnection", "Socket exception occurred while reading packet: %s", e);
                        cleanup();
                    }
                }
            }
        }
    }

    private byte[] readPacket() throws IOException {
        // the tcp packet header is considerably less complex than the udp one
        // it only consists of the packet length, followed by the "VT01" magic
        int packetLen = 0;
        int packetMagic = 0;

        byte[] packData = null;

        try {
            packetLen = netReader.readInt();
            packetMagic = netReader.readInt();
        } catch (final IOException ex) {
            throw new IOException("Connection lost while reading packet header.", ex);
        }

        if (packetMagic != TcpConnection.MAGIC) {
            throw new IOException("Got a packet with invalid magic!");
        }

        // rest of the packet is the physical data
        packData = netReader.readBytes(packetLen);

        if (packData.length != packetLen) {
            throw new IOException("Connection lost while reading packet payload");
        }

        // decrypt the data off the wire if needed
        if (netFilter != null) {
            packData = netFilter.processIncoming(packData);
        }

        return packData;
    }

    private void cleanup() {
        synchronized(netLock) {
            if (sock != null) {
                // cleanup socket
                try {
                    if (sock.isConnected()) {
                        sock.shutdownInput();
                        sock.shutdownOutput();
                    }
                    sock.close();
                } catch (final IOException e) {
                    DebugLog.writeLine("TcpConnection", "Socket exception occurred while cleanup: %s", e);
                    e.printStackTrace();
                }

                sock = null;
            }
            // signal that our connection is dead
            isConnected = false;
            onDisconnected(false);
        }
    }
}
