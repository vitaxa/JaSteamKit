package uk.co.thomasc.steamkit.steam3.handlers.steamuserstats;

import uk.co.thomasc.steamkit.base.ClientMsgProtobuf;
import uk.co.thomasc.steamkit.base.IPacketMsg;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver.CMsgClientLBSFindOrCreateLB;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver.CMsgClientLBSFindOrCreateLBResponse;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver.CMsgClientLBSGetLBEntries;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver.CMsgClientLBSGetLBEntriesResponse;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgDPGetNumberOfCurrentPlayers;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgDPGetNumberOfCurrentPlayersResponse;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.ELeaderboardDataRequest;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.ELeaderboardDisplayType;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.ELeaderboardSortMethod;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EMsg;
import uk.co.thomasc.steamkit.steam3.handlers.ClientMsgHandler;
import uk.co.thomasc.steamkit.steam3.handlers.steamuserstats.callbacks.FindOrCreateLeaderboardCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamuserstats.callbacks.LeaderboardEntriesCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamuserstats.callbacks.NumberOfPlayersCallback;
import uk.co.thomasc.steamkit.types.JobID;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 * This handler handles Steam user statistic related actions.
 */
public class SteamUserStats extends ClientMsgHandler {

    private Map<EMsg, Consumer<IPacketMsg>> dispatchMap;

    public SteamUserStats() {
        dispatchMap = new HashMap<>();

        dispatchMap.put(EMsg.ClientGetNumberOfCurrentPlayersDPResponse, new Consumer<IPacketMsg>() {
            @Override
            public void accept(IPacketMsg packetMsg) {
                handleNumberOfPlayersResponse(packetMsg);
            }
        });
        dispatchMap.put(EMsg.ClientLBSFindOrCreateLBResponse, new Consumer<IPacketMsg>() {
            @Override
            public void accept(IPacketMsg packetMsg) {
                handleFindOrCreateLBResponse(packetMsg);
            }
        });
        dispatchMap.put(EMsg.ClientLBSGetLBEntriesResponse, new Consumer<IPacketMsg>() {
            @Override
            public void accept(IPacketMsg packetMsg) {
                handleGetLBEntriesResponse(packetMsg);
            }
        });

        dispatchMap = Collections.unmodifiableMap(dispatchMap);
    }

    /**
     * Retrieves the number of current players for a given app id.
     * Results are returned in a {@link NumberOfPlayersCallback}.
     *
     * @param appId The app id to request the number of players for.
     * @return The Job ID of the request. This can be used to find the appropriate {@link NumberOfPlayersCallback}.
     */
    public JobID getNumberOfCurrentPlayers(int appId) {
        ClientMsgProtobuf<CMsgDPGetNumberOfCurrentPlayers.Builder> msg =
                new ClientMsgProtobuf<>(CMsgDPGetNumberOfCurrentPlayers.class, EMsg.ClientGetNumberOfCurrentPlayersDP);
        JobID jobID = getClient().getNextJobID();
        msg.setSourceJobID(jobID);

        msg.getBody().setAppid(appId);

        getClient().send(msg);

        return jobID;
    }

    /**
     * Asks the Steam back-end for a leaderboard by name for a given appid.
     * Results are returned in a {@link FindOrCreateLeaderboardCallback}.
     *
     * @param appId The AppID to request a leaderboard for.
     * @param name  Name of the leaderboard to request.
     * @return The Job ID of the request. This can be used to find the appropriate {@link FindOrCreateLeaderboardCallback}.
     */
    public JobID findLeaderBoard(int appId, String name) {
        ClientMsgProtobuf<CMsgClientLBSFindOrCreateLB.Builder> msg =
                new ClientMsgProtobuf<>(CMsgClientLBSFindOrCreateLB.class, EMsg.ClientLBSFindOrCreateLB);
        JobID jobID = getClient().getNextJobID();
        msg.setSourceJobID(jobID);

        // routing_appid has to be set correctly to receive a response
        msg.getProtoHeader().setRoutingAppid(appId);

        msg.getBody().setAppId(appId);
        msg.getBody().setLeaderboardName(name);
        msg.getBody().setCreateIfNotFound(false);

        getClient().send(msg);

        return jobID;
    }

    /**
     * Asks the Steam back-end for a leaderboard by name, and will create it if it's not yet.
     * Results are returned in a {@link FindOrCreateLeaderboardCallback}.
     *
     * @param appId       The AppID to request a leaderboard for.
     * @param name        Name of the leaderboard to create.
     * @param sortMethod  Sort method to use for this leaderboard
     * @param displayType Display type for this leaderboard.
     * @return The Job ID of the request. This can be used to find the appropriate {@link FindOrCreateLeaderboardCallback}.
     */
    public JobID createLeaderboard(int appId, String name, ELeaderboardSortMethod sortMethod, ELeaderboardDisplayType displayType) {
        ClientMsgProtobuf<CMsgClientLBSFindOrCreateLB.Builder> msg =
                new ClientMsgProtobuf<>(CMsgClientLBSFindOrCreateLB.class, EMsg.ClientLBSFindOrCreateLB);
        JobID jobID = getClient().getNextJobID();
        msg.setSourceJobID(jobID);

        // routing_appid has to be set correctly to receive a response
        msg.getProtoHeader().setRoutingAppid(appId);

        msg.getBody().setAppId(appId);
        msg.getBody().setLeaderboardName(name);
        msg.getBody().setLeaderboardDisplayType(displayType.code());
        msg.getBody().setLeaderboardSortMethod(sortMethod.code());
        msg.getBody().setCreateIfNotFound(true);

        getClient().send(msg);

        return jobID;
    }

    /**
     * Asks the Steam back-end for a set of rows in the leaderboard.
     * Results are returned in a {@link LeaderboardEntriesCallback}.
     *
     * @param appId       The AppID to request leaderboard rows for.
     * @param id          ID of the leaderboard to view.
     * @param rangeStart  Range start or 0.
     * @param rangeEnd    Range end or max leaderboard entries.
     * @param dataRequest Type of request.
     * @return The Job ID of the request. This can be used to find the appropriate {@link LeaderboardEntriesCallback}.
     */
    public JobID getLeaderboardEntries(int appId, int id, int rangeStart, int rangeEnd, ELeaderboardDataRequest dataRequest) {
        ClientMsgProtobuf<CMsgClientLBSGetLBEntries.Builder> msg =
                new ClientMsgProtobuf<>(CMsgClientLBSGetLBEntries.class, EMsg.ClientLBSGetLBEntries);
        JobID jobID = getClient().getNextJobID();
        msg.setSourceJobID(jobID);

        msg.getBody().setAppId(appId);
        msg.getBody().setLeaderboardId(id);
        msg.getBody().setLeaderboardDataRequest(dataRequest.code());
        msg.getBody().setRangeStart(rangeStart);
        msg.getBody().setRangeEnd(rangeEnd);

        getClient().send(msg);

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

    private void handleNumberOfPlayersResponse(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgDPGetNumberOfCurrentPlayersResponse.Builder> msg =
                new ClientMsgProtobuf<>(CMsgDPGetNumberOfCurrentPlayersResponse.class, packetMsg);

        getClient().postCallback(new NumberOfPlayersCallback(msg.getTargetJobID(), msg.getBody()));
    }

    private void handleFindOrCreateLBResponse(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientLBSFindOrCreateLBResponse.Builder> msg =
                new ClientMsgProtobuf<>(CMsgClientLBSFindOrCreateLBResponse.class, packetMsg);

        getClient().postCallback(new FindOrCreateLeaderboardCallback(msg.getTargetJobID(), msg.getBody()));
    }

    private void handleGetLBEntriesResponse(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientLBSGetLBEntriesResponse.Builder> msg =
                new ClientMsgProtobuf<>(CMsgClientLBSGetLBEntriesResponse.class, packetMsg);

        getClient().postCallback(new LeaderboardEntriesCallback(msg.getTargetJobID(), msg.getBody()));
    }
}
