package uk.co.thomasc.steamkit.steam3.discovery;

import uk.co.thomasc.steamkit.networking.steam3.ProtocolType;

import java.net.InetSocketAddress;
import java.util.EnumSet;

/**
 * Represents the information needed to connect to a CM server
 */
public class ServerRecord {

    private InetSocketAddress endpoint;

    private EnumSet<ProtocolType> protocolTypes;

    ServerRecord(InetSocketAddress endpoint, ProtocolType protocolTypes) {
        this(endpoint, EnumSet.of(protocolTypes));
    }

    private ServerRecord(InetSocketAddress endpoint, EnumSet<ProtocolType> protocolTypes) {
        if (endpoint == null) {
            throw new IllegalArgumentException("endpoint is null");
        }

        this.endpoint = endpoint;
        this.protocolTypes = protocolTypes;
    }

    public String getHost() {
        return this.endpoint.getHostString();
    }

    public int getPort() {
        return endpoint.getPort();
    }

    public InetSocketAddress getEndpoint() {
        return endpoint;
    }

    public EnumSet<ProtocolType> getProtocolTypes() {
        return protocolTypes;
    }

    public static ServerRecord createServer(String host, int port, ProtocolType protocolTypes) {
        return createServer(host, port, EnumSet.of(protocolTypes));
    }

    public static ServerRecord createServer(String host, int port, EnumSet<ProtocolType> protocolTypes) {
        return new ServerRecord(new InetSocketAddress(host, port), protocolTypes);
    }

    public static ServerRecord createSocketServer(InetSocketAddress endpoint) {
        return new ServerRecord(endpoint, EnumSet.of(ProtocolType.TCP, ProtocolType.UDP));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ServerRecord that = (ServerRecord) o;

        if (endpoint != null ? !endpoint.equals(that.endpoint) : that.endpoint != null) return false;
        return protocolTypes != null ? protocolTypes.equals(that.protocolTypes) : that.protocolTypes == null;
    }

    @Override
    public int hashCode() {
        int result = endpoint != null ? endpoint.hashCode() : 0;
        result = 31 * result + (protocolTypes != null ? protocolTypes.hashCode() : 0);
        return result;
    }
}
