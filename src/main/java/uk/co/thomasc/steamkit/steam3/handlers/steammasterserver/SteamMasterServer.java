package uk.co.thomasc.steamkit.steam3.handlers.steammasterserver;

import uk.co.thomasc.steamkit.base.ClientMsgProtobuf;
import uk.co.thomasc.steamkit.base.IPacketMsg;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgClientGMSServerQuery;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgGMSClientServerQueryResponse;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EMsg;
import uk.co.thomasc.steamkit.steam3.handlers.ClientMsgHandler;
import uk.co.thomasc.steamkit.steam3.handlers.steammasterserver.callbacks.QueryCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steammasterserver.types.QueryDetails;
import uk.co.thomasc.steamkit.types.JobID;
import uk.co.thomasc.steamkit.util.util.NetHelpers;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 * This handler is used for requesting server list details from Steam.
 */
public class SteamMasterServer extends ClientMsgHandler {

    private Map<EMsg, Consumer<IPacketMsg>> dispatchMap;

    public SteamMasterServer() {
        dispatchMap = new HashMap<>();

        dispatchMap.put(EMsg.GMSClientServerQueryResponse, this::handleServerQueryResponse);

        dispatchMap = Collections.unmodifiableMap(dispatchMap);
    }

    /**
     * Requests a list of servers from the Steam game master server.
     * Results are returned in a {@link QueryCallback}.
     *
     * @param details The details for the request.
     * @return The Job ID of the request. This can be used to find the appropriate {@link QueryCallback}.
     */
    public JobID serverQuery(QueryDetails details) {
        if (details == null) {
            throw new IllegalArgumentException("details is null");
        }

        ClientMsgProtobuf<CMsgClientGMSServerQuery.Builder> query =
                new ClientMsgProtobuf<>(CMsgClientGMSServerQuery.class, EMsg.ClientGMSServerQuery);
        JobID jobID = getClient().getNextJobID();
        query.setSourceJobID(jobID);

        query.getBody().setAppId(details.getAppID());

        if (details.getGeoLocatedIP() != null) {
            query.getBody().setGeoLocationIp(NetHelpers.getIPAddress(details.getGeoLocatedIP()));
        }

        query.getBody().setFilterText(details.getFilter());
        query.getBody().setRegionCode(details.getRegion().code());

        query.getBody().setMaxServers(details.getMaxServers());

        getClient().send(query);

        return jobID;
    }

    @Override
    public void handleMsg(IPacketMsg packetMsg) {
        if (packetMsg == null) {
            throw new IllegalArgumentException("packetMsg is null");
        }

        Consumer<IPacketMsg> dispatcher = dispatchMap.get(packetMsg.getMsgType());
        if (dispatcher != null) {
            dispatcher.accept(packetMsg);
        }
    }

    private void handleServerQueryResponse(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgGMSClientServerQueryResponse.Builder> queryResponse =
                new ClientMsgProtobuf<>(CMsgGMSClientServerQueryResponse.class, packetMsg);

        getClient().postCallback(new QueryCallback(queryResponse.getTargetJobID(), queryResponse.getBody()));
    }
}
