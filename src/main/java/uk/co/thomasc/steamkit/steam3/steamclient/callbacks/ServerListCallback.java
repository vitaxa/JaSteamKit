package uk.co.thomasc.steamkit.steam3.steamclient.callbacks;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver.CMsgClientServerList;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EServerType;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.util.util.NetHelpers;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * This callback is fired when the client receives a list of all publically available Steam3 servers.
 * This callback may be fired multiple times for different server lists.
 */
public class ServerListCallback extends CallbackMsg {

    private final Map<EServerType, Collection<InetSocketAddress>> servers = new HashMap<>();

    public ServerListCallback(CMsgClientServerList.Builder serverList) {
        for (CMsgClientServerList.Server s : serverList.getServersList()) {
            EServerType type = EServerType.from(s.getServerType());

            Collection<InetSocketAddress> addresses = servers.get(type);
            if (addresses == null) {
                addresses = new ArrayList<>();
                servers.put(type, addresses);
            }

            addresses.add(new InetSocketAddress(
                    NetHelpers.getIPAddress(s.getServerIp()), s.getServerPort()
            ));
        }
    }

    public Map<EServerType, Collection<InetSocketAddress>> getServers() {
        return servers;
    }
}
