package uk.co.thomasc.steamkit.steam3;

import uk.co.thomasc.steamkit.base.*;
import uk.co.thomasc.steamkit.base.generated.SteammessagesBase.CMsgMulti;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver.CMsgClientServerList;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver.CMsgClientSessionToken;
import uk.co.thomasc.steamkit.base.generated.enums.EMsg;
import uk.co.thomasc.steamkit.base.generated.enums.EResult;
import uk.co.thomasc.steamkit.base.generated.enums.EServerType;
import uk.co.thomasc.steamkit.base.generated.enums.EUniverse;
import uk.co.thomasc.steamkit.networking.steam3.*;
import uk.co.thomasc.steamkit.steam3.discovery.ServerInfo;
import uk.co.thomasc.steamkit.steam3.discovery.ServerQuality;
import uk.co.thomasc.steamkit.steam3.discovery.ServerRecord;
import uk.co.thomasc.steamkit.steam3.discovery.SmartCMServerList;
import uk.co.thomasc.steamkit.steam3.steamclient.SteamClient;
import uk.co.thomasc.steamkit.steam3.steamclient.callbacks.ConnectedCallback;
import uk.co.thomasc.steamkit.steam3.steamclient.callbacks.DisconnectedCallback;
import uk.co.thomasc.steamkit.steam3.steamclient.configuration.SteamConfiguration;
import uk.co.thomasc.steamkit.types.SteamID;
import uk.co.thomasc.steamkit.util.ScheduledFunction;
import uk.co.thomasc.steamkit.util.cSharp.events.EventArgs;
import uk.co.thomasc.steamkit.util.cSharp.events.EventHandler;
import uk.co.thomasc.steamkit.util.logging.DebugLog;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.util.MsgUtil;
import uk.co.thomasc.steamkit.util.util.NetHelpers;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.zip.GZIPInputStream;

import static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver.CMsgClientCMList;
import static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.*;

/**
 * This base client handles the underlying connection to a CM server. This class
 * should not be use directly, but through the {@link SteamClient} class.
 */
public abstract class CMClient {

    private final static ThreadFactory THREAD_FACTORY;

    private final static ExecutorService THREAD_POOL;

    private SteamConfiguration configuration;

    private boolean isConnected;

    private long sessionToken;

    private Integer cellID;

    private Integer sessionID;

    private SteamID steamID;

    private boolean expectDisconnection;

    // connection lock around the setup and tear down of the connection task
    private final Object connectionLock = new Object();

    private Connection connection;

    private ScheduledFunction heartBeatFunc;

    private Map<EServerType, Set<InetSocketAddress>> serverMap;

    static {
        THREAD_FACTORY = r -> {
            final Thread thread = new Thread(r, "CMClient Thread");
            thread.setDaemon(true);
            return thread;
        };
        THREAD_POOL = Executors.newCachedThreadPool(THREAD_FACTORY);
    }

    private final EventHandler<NetMsgEventArgs> netMsgReceived = new EventHandler<NetMsgEventArgs>() {
        @Override
        public void handleEvent(Object sender, NetMsgEventArgs e) {
            onClientMsgReceived(getPacketMsg(e.getData()));
        }
    };

    private final EventHandler<EventArgs> connected = new EventHandler<EventArgs>() {
        @Override
        public void handleEvent(Object sender, EventArgs e) {
            getServers().tryMark(connection.getCurrentEndPoint(), connection.getProtocolType(), ServerQuality.GOOD);

            isConnected = true;
            onClientConnected();
        }
    };

    private final EventHandler<DisconnectedEventArgs> disconnected = new EventHandler<DisconnectedEventArgs>() {
        @Override
        public void handleEvent(Object sender, DisconnectedEventArgs e) {
            isConnected = false;

            if (!e.isUserInitiated() && !expectDisconnection) {
                getServers().tryMark(connection.getCurrentEndPoint(), connection.getProtocolType(), ServerQuality.BAD);
            }

            sessionID = null;
            steamID = null;

            connection.getNetMsgReceived().removeEventHandler(netMsgReceived);
            connection.getConnected().removeEventHandler(connected);
            connection.getDisconnected().removeEventHandler(this);
            connection = null;

            heartBeatFunc.stop();

            onClientDisconnected(e.isUserInitiated() || expectDisconnection);
        }
    };

    public CMClient(SteamConfiguration configuration) {
        if (configuration == null) {
            throw new IllegalArgumentException("configuration is null");
        }

        this.configuration = configuration;
        this.serverMap = new HashMap<>();

        heartBeatFunc = new ScheduledFunction(() -> {
            send(new ClientMsgProtobuf<CMsgClientHeartBeat.Builder>(CMsgClientHeartBeat.class, EMsg.ClientHeartBeat));
        }, 5000);
    }

    /**
     * Connects this client to a Steam3 server. This begins the process of connecting and encrypting the data channel
     * between the client and the server. Results are returned asynchronously in a {@link ConnectedCallback ConnectedCallback}. If the
     * server that SteamKit attempts to connect to is down, a {@link DisconnectedCallback DisconnectedCallback} will be posted instead.
     * SteamKit will not attempt to reconnect to Steam, you must handle this callback and call Connect again preferably
     * after a short delay. SteamKit will randomly select a CM server from its internal list.
     */
    public void connect() {
        connect(null);
    }

    /**
     * Connects this client to a Steam3 server. This begins the process of connecting and encrypting the data channel
     * between the client and the server. Results are returned asynchronously in a {@link ConnectedCallback ConnectedCallback}. If the
     * server that SteamKit attempts to connect to is down, a {@link DisconnectedCallback DisconnectedCallback} will be posted instead.
     * SteamKit will not attempt to reconnect to Steam, you must handle this callback and call Connect again preferably
     * after a short delay.
     *
     * @param cmServer The {@link ServerInfo} of the CM server to connect to.
     */
    public void connect(ServerRecord cmServer) {
        synchronized (connectionLock) {
            try {
                disconnect();

                assert connection != null;

                expectDisconnection = false;

                if (cmServer == null) {
                    cmServer = getServers().getNextServerCandidate(configuration.getProtocolTypes());
                }

                connection = createConnection(configuration.getProtocolTypes());
                connection.getNetMsgReceived().addEventHandler(netMsgReceived);
                connection.getConnected().addEventHandler(connected);
                connection.getDisconnected().addEventHandler(disconnected);
                connection.connect(cmServer.getEndpoint());
            } catch (Exception e) {
                DebugLog.writeLine("CMClient", "Failed to connect to Steam network: %s", e);
                onClientDisconnected(false);
            }
        }
    }

    /**
     * Disconnects this client.
     */
    public void disconnect() {
        synchronized (connectionLock) {
            heartBeatFunc.stop();

            if (connection != null) {
                connection.disconnect();
            }
        }
    }

    /**
     * Sends the specified client message to the server. This method automatically assigns the correct SessionID and
     * SteamID of the message.
     *
     * @param msg The client message to send.
     */
    public void send(IClientMsg msg) {
        if (msg == null) {
            throw new IllegalArgumentException("A value for 'msg' must be supplied");
        }

        if (sessionID != null) {
            msg.setSessionID(sessionID);
        }

        if (steamID != null) {
            msg.setSteamID(steamID);
        }

        DebugLog.writeLine("CMClient", String.format("Sent -> EMsg: %s (Proto: %s)", msg.getMsgType(), msg.isProto()));

        // we'll swallow any network failures here because they will be thrown later
        // on the network thread, and that will lead to a disconnect callback
        // down the line
        if (connection != null) {
            THREAD_POOL.execute(() -> {
                try {
                    connection.send(msg.serialize());
                } catch (Exception e) {
                    DebugLog.printStackTrace("CMClient", e);
                }
            });
        }
    }

    /**
     * Returns the list of servers matching the given type
     *
     * @param type Server type requested
     * @return List of server endpoints
     */
    public List<InetSocketAddress> getServers(EServerType type) {
        Set<InetSocketAddress> addresses = serverMap.get(type);
        if (addresses != null) {
            return new ArrayList<>(addresses);
        }

        return new ArrayList<>();
    }

    protected boolean onClientMsgReceived(IPacketMsg packetMsg) {
        if (packetMsg == null) {
            DebugLog.writeLine("CMClient", "Packet message failed to parse, shutting down connection");
            disconnect();
            return false;
        }

        DebugLog.writeLine("CMClient", String.format("<- Recv'd EMsg: %s (%d) (Proto: %s)", packetMsg.getMsgType(), packetMsg.getMsgType().code(), packetMsg.isProto()));

        switch (packetMsg.getMsgType()) {
            case Multi:
                handleMulti(packetMsg);
                break;
            case ClientLogOnResponse: // we handle this to get the SteamID/SessionID and to setup heartbeating
                handleLogOnResponse(packetMsg);
                break;
            case ClientLoggedOff: // to stop heartbeating when we get logged off
                handleLoggedOff(packetMsg);
                break;
            case ClientServerList: // Steam server list
                handleServerList(packetMsg);
                break;
            case ClientCMList:
                handleCMList(packetMsg);
                break;
            case ClientSessionToken: // am session token
                handleSessionToken(packetMsg);
                break;
        }

        return true;
    }

    /**
     * Called when the client is securely isConnected to Steam3.
     */
    protected void onClientConnected() {

    }

    /**
     * Called when the client is physically disconnected from Steam3.
     *
     * @param userInitiated whether the disconnect was initialized by the client
     */
    protected void onClientDisconnected(boolean userInitiated) {
        for (Set<InetSocketAddress> set : serverMap.values()) {
            set.clear();
        }
    }

    private Connection createConnection(EnumSet<ProtocolType> protocol) {
        if (protocol.contains(ProtocolType.WEB_SOCKET)) {
            return new WebSocketConnection();
        } else if (protocol.contains(ProtocolType.TCP)) {
            return new EnvelopeEncryptedConnection(new TcpConnection(), getUniverse());
        } else if (protocol.contains(ProtocolType.UDP)) {
            return new EnvelopeEncryptedConnection(new UdpConnection(), getUniverse());
        }

        throw new IllegalArgumentException("Protocol bitmask has no supported protocols set.");
    }

    public static IPacketMsg getPacketMsg(byte[] data) {
        if (data.length < 4) {
            DebugLog.writeLine("CMClient", "PacketMsg too small to contain a message");
            return null;
        }

        BinaryReader reader = new BinaryReader(new ByteArrayInputStream(data));

        int rawEMsg = 0;
        try {
            rawEMsg = reader.readInt();
        } catch (IOException e) {
            DebugLog.writeLine("CMClient", "Exception while getting EMsg code: %s", e);
        }
        EMsg eMsg = MsgUtil.getMsg(rawEMsg);

        switch (eMsg) {
            case ChannelEncryptRequest:
            case ChannelEncryptResponse:
            case ChannelEncryptResult:
                try {
                    return new PacketMsg(eMsg, data);
                } catch (IOException e) {
                    DebugLog.writeLine("CMClient", "Exception deserializing emsg " + eMsg + " (" + MsgUtil.isProtoBuf(rawEMsg) + "). %s", e);
                }
        }

        try {
            if (MsgUtil.isProtoBuf(rawEMsg)) {
                return new PacketClientMsgProtobuf(eMsg, data);
            } else {
                return new PacketClientMsg(eMsg, data);
            }
        } catch (IOException e) {
            DebugLog.writeLine("CMClient", "Exception deserializing emsg " + eMsg + " (" + MsgUtil.isProtoBuf(rawEMsg) + "). %s", e);
            return null;
        }
    }

    private void handleMulti(IPacketMsg packetMsg) {
        if (!packetMsg.isProto()) {
            DebugLog.writeLine("CMClient", "HandleMulti got non-proto MsgMulti!!");
            return;
        }

        ClientMsgProtobuf<CMsgMulti.Builder> msgMulti = new ClientMsgProtobuf<>(CMsgMulti.class, packetMsg);

        byte[] payload = msgMulti.getBody().getMessageBody().toByteArray();

        if (msgMulti.getBody().getSizeUnzipped() > 0) {
            try {
                GZIPInputStream gzin = new GZIPInputStream(new ByteArrayInputStream(payload));
                ByteArrayOutputStream baos = new ByteArrayOutputStream();

                int res = 0;
                byte buf[] = new byte[1024];
                while (res >= 0) {
                    res = gzin.read(buf, 0, buf.length);
                    if (res > 0) {
                        baos.write(buf, 0, res);
                    }
                }
                payload = baos.toByteArray();
            } catch (IOException e) {
                DebugLog.writeLine("CMClient", "HandleMulti encountered an exception when decompressing: %s", e);
                return;
            }
        }

        try (BinaryReader br = new BinaryReader(new ByteArrayInputStream(payload))) {
            while (br.available() > 0) {
                int subSize = br.readInt();
                byte[] subData = br.readBytes(subSize);

                if (!onClientMsgReceived(getPacketMsg(subData))) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void handleLogOnResponse(IPacketMsg packetMsg) {
        if (!packetMsg.isProto()) {
            // a non proto ClientLogonResponse can come in as a result of connecting but never sending a ClientLogon
            // in this case, it always fails, so we don't need to do anything special here
            DebugLog.writeLine("CMClient", "Got non-proto logon response, this is indicative of no logon attempt after connecting.");
            return;
        }

        ClientMsgProtobuf<CMsgClientLogonResponse.Builder> logonResp = new ClientMsgProtobuf<>(CMsgClientLogonResponse.class, packetMsg);

        if (logonResp.getBody().getEresult() == EResult.OK.code()) {
            sessionID = logonResp.getProtoHeader().getClientSessionid();
            steamID = new SteamID(logonResp.getProtoHeader().getSteamid());

            cellID = logonResp.getBody().getCellId();

            // restart heartbeat
            heartBeatFunc.stop();
            heartBeatFunc.setDelay(logonResp.getBody().getOutOfGameHeartbeatSeconds() * 1000L);
            heartBeatFunc.start();
        }
    }

    private void handleLoggedOff(IPacketMsg packetMsg) {
        sessionID = null;
        steamID = null;

        cellID = null;

        heartBeatFunc.stop();

        if (packetMsg.isProto()) {
            ClientMsgProtobuf<CMsgClientLoggedOff.Builder> logoffMsg = new ClientMsgProtobuf<>(CMsgClientLoggedOff.class, packetMsg);
            EResult logoffResult = EResult.from(logoffMsg.getBody().getEresult());

            if (logoffResult == EResult.TryAnotherCM || logoffResult == EResult.ServiceUnavailable) {
                getServers().tryMark(connection.getCurrentEndPoint(), connection.getProtocolType(), ServerQuality.BAD);
            }
        }
    }

    private void handleServerList(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientServerList.Builder> listMsg = new ClientMsgProtobuf<>(CMsgClientServerList.class, packetMsg);

        for (CMsgClientServerList.Server server : listMsg.getBody().getServersList()) {
            EServerType type = EServerType.from(server.getServerType());

            Set<InetSocketAddress> endPointSet;
            endPointSet = serverMap.computeIfAbsent(type, k -> new HashSet<>());

            endPointSet.add(new InetSocketAddress(NetHelpers.getIPAddress(server.getServerIp()), server.getServerPort()));
        }
    }

    private void handleCMList(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientCMList.Builder> cmMsg = new ClientMsgProtobuf<>(CMsgClientCMList.class, packetMsg);

        if (cmMsg.getBody().getCmPortsCount() != cmMsg.getBody().getCmAddressesCount()) {
            DebugLog.writeLine("CMClient", "HandleCMList received malformed message");
        }

        List<Integer> addresses = cmMsg.getBody().getCmAddressesList();
        List<Integer> ports = cmMsg.getBody().getCmPortsList();

        List<ServerRecord> cmList = new ArrayList<>();
        for (int i = 0; i < Math.min(addresses.size(), ports.size()); i++) {
            cmList.add(ServerRecord.createSocketServer(new InetSocketAddress(NetHelpers.getIPAddress(addresses.get(i)), ports.get(i))));
        }

        getServers().replaceList(cmList);
    }

    private void handleSessionToken(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientSessionToken.Builder> sessToken = new ClientMsgProtobuf<>(CMsgClientSessionToken.class, packetMsg);

        sessionToken = sessToken.getBody().getToken();
    }

    public SteamConfiguration getConfiguration() {
        return configuration;
    }

    /**
     * @return Bootstrap list of CM servers.
     */
    public SmartCMServerList getServers() {
        return configuration.getServerList();
    }

    /**
     * Returns the the local IP of this client.
     *
     * @return The local IP.
     */
    public InetAddress getLocalIP() {
        return connection.getLocalIP();
    }

    /**
     * Gets the universe of this client.
     *
     * @return The universe.
     */
    public EUniverse getUniverse() {
        return configuration.getUniverse();
    }

    /**
     * Gets a value indicating whether this instance is isConnected to the remote CM server.
     *
     * @return <b>true</b> if this instance is isConnected; otherwise, <b>false</b>.
     */
    public boolean isConnected() {
        return isConnected;
    }

    /**
     * @return the session token assigned to this client from the AM.
     */
    public long getSessionToken() {
        return sessionToken;
    }

    /**
     * @return the Steam recommended Cell ID of this client. This value is assigned after a logon attempt has succeeded.
     * This value will be <b>null</b> if the client is logged off of Steam.
     */
    public Integer getCellID() {
        return cellID;
    }

    /**
     * Gets the session ID of this client. This value is assigned after a logon attempt has succeeded.
     * This value will be <b>null</b> if the client is logged off of Steam.
     *
     * @return The session ID.
     */
    public Integer getSessionID() {
        return sessionID;
    }

    /**
     * Gets the SteamID of this client. This value is assigned after a logon attempt has succeeded.
     * This value will be <b>null</b> if the client is logged off of Steam.
     *
     * @return The SteamID.
     */
    public SteamID getSteamID() {
        return steamID;
    }

    /**
     * Gets or sets the connection timeout used when connecting to the Steam server.
     *
     * @return The connection timeout.
     */
    public long getConnectionTimeout() {
        return configuration.getConnectionTimeout();
    }

    public boolean isExpectDisconnection() {
        return expectDisconnection;
    }

    public void setExpectDisconnection(boolean expectDisconnection) {
        this.expectDisconnection = expectDisconnection;
    }
}
