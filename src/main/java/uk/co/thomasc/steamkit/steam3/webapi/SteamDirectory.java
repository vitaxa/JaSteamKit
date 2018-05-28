package uk.co.thomasc.steamkit.steam3.webapi;

import uk.co.thomasc.steamkit.base.generated.steamlanguage.EResult;
import uk.co.thomasc.steamkit.steam3.discovery.ServerRecord;
import uk.co.thomasc.steamkit.steam3.steamclient.configuration.SteamConfiguration;
import uk.co.thomasc.steamkit.types.keyvalue.KeyValue;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class to load servers from the Steam Directory Web API.
 */
public class SteamDirectory {

    /**
     * Load a list of servers from the Steam Directory.
     *
     * @param configuration Configuration Object
     * @return the list of servers
     * @throws IOException if the request could not be executed
     */
    public static List<ServerRecord> load(SteamConfiguration configuration) throws IOException {
        if (configuration == null) {
            throw new IllegalArgumentException("configuration null");
        }

        WebAPI api = configuration.getWebAPI("ISteamDirectory");

        Map<String, String> params = new HashMap<>(1);
        params.put("cellid", String.valueOf(configuration.getCellID()));

        KeyValue response = api.call("GetCMList", 1, params, "GET", true);

        EResult result = EResult.from(response.get("result").asInteger(EResult.Invalid.code()));

        if (result != EResult.OK) {
            throw new IllegalStateException("Steam Web API returned EResult." + result);
        }

        final KeyValue serverlist = response.get("serverlist");
        List<ServerRecord> records = new ArrayList<>(serverlist.getChildren().size());
        for (KeyValue server : serverlist.getChildren()) {
            String[] split = server.getValue().split(":");
            records.add(ServerRecord.createSocketServer(new InetSocketAddress(split[0], Integer.parseInt(split[1]))));
        }

        return records;
    }
}
