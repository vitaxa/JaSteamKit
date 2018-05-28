package uk.co.thomasc.steamkit.steam3.steamclient.callbacks;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver;
import uk.co.thomasc.steamkit.steam3.discovery.ServerRecord;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.util.util.NetHelpers;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * This callback is received when the client has received the CM list from Steam.
 */
public class CMListCallback extends CallbackMsg {

    private final Collection<ServerRecord> servers;

    public CMListCallback(SteammessagesClientserver.CMsgClientCMList.Builder cmMsg) {
        List<Integer> addresses = cmMsg.getCmAddressesList();
        List<Integer> ports = cmMsg.getCmPortsList();

        List<ServerRecord> cmList = new ArrayList<>();
        for (int i = 0; i < Math.min(addresses.size(), ports.size()); i++) {
            cmList.add(ServerRecord.createSocketServer(new InetSocketAddress(NetHelpers.getIPAddress(addresses.get(i)), ports.get(i))));
        }

        servers = Collections.unmodifiableCollection(cmList);
    }

    /**
     * @return the CM server list.
     */
    public Collection<ServerRecord> getServers() {
        return servers;
    }
}
