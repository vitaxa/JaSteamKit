package uk.co.thomasc.steamkit.steam3.discovery.provider;

import uk.co.thomasc.steamkit.steam3.discovery.IServerListProvider;
import uk.co.thomasc.steamkit.steam3.webapi.WebAPI;
import uk.co.thomasc.steamkit.types.keyvalue.KeyValue;
import uk.co.thomasc.steamkit.util.cSharp.ip.IPEndPoint;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SteamDirectoryProvider implements IServerListProvider {

    @Override
    public List<IPEndPoint> provideServerList() throws IOException {
        Map<String, String> args = new HashMap<>(1);
        args.put("cellid", "0");
        final KeyValue call = new WebAPI("ISteamDirectory").call("GetCMList", 1, args, "GET", true);

        final KeyValue serverlist = call.get("serverlist");

        List<IPEndPoint> ipList = new ArrayList<>(serverlist.getChildren().size());
        for (int i = 0; i <= serverlist.getChildren().size(); i++) {
            String host = serverlist.get(String.valueOf(i)).value;
            if (host != null && !host.equalsIgnoreCase("null")) {
                ipList.add(IPEndPoint.fromString(host));
            }
        }

        return ipList;
    }
}
