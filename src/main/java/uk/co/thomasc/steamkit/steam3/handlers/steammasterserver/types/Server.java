package uk.co.thomasc.steamkit.steam3.handlers.steammasterserver.types;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgGMSClientServerQueryResponse;
import uk.co.thomasc.steamkit.util.util.NetHelpers;

import java.net.InetSocketAddress;

/**
 * Represents a single server.
 */
public class Server {

    private InetSocketAddress endPoint;

    private int authedPlayers;

    public Server(CMsgGMSClientServerQueryResponse.Server server) {
        endPoint = new InetSocketAddress(NetHelpers.getIPAddress(server.getServerIp()), server.getServerPort());
        authedPlayers = server.getAuthPlayers();
    }

    /**
     * @return the IP endpoint of the server
     */
    public InetSocketAddress getEndPoint() {
        return endPoint;
    }

    /**
     * @return the number of Steam authenticated players on this server
     */
    public int getAuthedPlayers() {
        return authedPlayers;
    }
}
