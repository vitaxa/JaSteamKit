package uk.co.thomasc.steamkit.steam3.handlers.steammasterserver.callbacks;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgGMSClientServerQueryResponse;
import uk.co.thomasc.steamkit.steam3.handlers.steammasterserver.SteamMasterServer;
import uk.co.thomasc.steamkit.steam3.handlers.steammasterserver.types.QueryDetails;
import uk.co.thomasc.steamkit.steam3.handlers.steammasterserver.types.Server;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.JobID;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This callback is received in response to calling {@link SteamMasterServer#serverQuery(QueryDetails)}.
 */
public class QueryCallback extends CallbackMsg {

    private List<Server> servers;

    public QueryCallback(JobID jobID, CMsgGMSClientServerQueryResponse.Builder msg) {
        setJobID(jobID);

        List<Server> serverList = new ArrayList<>();
        for (CMsgGMSClientServerQueryResponse.Server s : msg.getServersList()) {
            serverList.add(new Server(s));
        }

        servers = Collections.unmodifiableList(serverList);
    }

    /**
     * @return the list of servers
     */
    public List<Server> getServers() {
        return servers;
    }
}
