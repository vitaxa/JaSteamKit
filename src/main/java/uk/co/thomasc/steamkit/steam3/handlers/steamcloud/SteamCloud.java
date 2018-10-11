package uk.co.thomasc.steamkit.steam3.handlers.steamcloud;

import uk.co.thomasc.steamkit.base.ClientMsgProtobuf;
import uk.co.thomasc.steamkit.base.IPacketMsg;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver.*;
import uk.co.thomasc.steamkit.base.generated.enums.EMsg;
import uk.co.thomasc.steamkit.steam3.handlers.ClientMsgHandler;
import uk.co.thomasc.steamkit.steam3.handlers.steamcloud.callback.ShareFileCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamcloud.callback.SingleFileInfoCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamcloud.callback.UGCDetailsCallback;
import uk.co.thomasc.steamkit.types.AsyncJob;
import uk.co.thomasc.steamkit.types.JobID;
import uk.co.thomasc.steamkit.types.SimpleAsyncJob;
import uk.co.thomasc.steamkit.types.UGCHandle;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 * This handler is used for interacting with remote storage and user generated content.
 */
public class SteamCloud extends ClientMsgHandler {

    private Map<EMsg, Consumer<IPacketMsg>> dispatchMap;

    public SteamCloud() {
        dispatchMap = new HashMap<>();

        dispatchMap.put(EMsg.ClientUFSGetUGCDetailsResponse, this::handleUGCDetailsResponse);
        dispatchMap.put(EMsg.ClientUFSGetSingleFileInfoResponse, this::handleSingleFileInfoResponse);
        dispatchMap.put(EMsg.ClientUFSShareFileResponse, this::handleShareFileResponse);

        dispatchMap = Collections.unmodifiableMap(dispatchMap);
    }

    /**
     * Requests details for a specific item of user generated content from the Steam servers.
     * Results are returned in a {@link UGCDetailsCallback}.
     *
     * @param ugcId The unique user generated content id.
     * @return The Job ID of the request. This can be used to find the appropriate {@link UGCDetailsCallback}.
     */
    public AsyncJob<UGCDetailsCallback> requestUGCDetails(UGCHandle ugcId) {
        if (ugcId == null) {
            throw new IllegalArgumentException("ugcId is null");
        }

        ClientMsgProtobuf<CMsgClientUFSGetUGCDetails.Builder> request =
                new ClientMsgProtobuf<>(CMsgClientUFSGetUGCDetails.class, EMsg.ClientUFSGetUGCDetails);
        JobID jobID = client.getNextJobID();
        request.setSourceJobID(jobID);

        request.getBody().setHcontent(ugcId.getValue());

        client.send(request);

        return new SimpleAsyncJob<UGCDetailsCallback>(client, request.getSourceJobID());
    }

    /**
     * Requests details for a specific file in the user's Cloud storage.
     * Results are returned in a {@link SingleFileInfoCallback}.
     *
     * @param appId    The app id of the game.
     * @param filename The path to the file being requested.
     * @return The Job ID of the request. This can be used to find the appropriate {@link SingleFileInfoCallback}.
     */
    public AsyncJob<SingleFileInfoCallback> getSingleFileInfo(int appId, String filename) {
        ClientMsgProtobuf<CMsgClientUFSGetSingleFileInfo.Builder> request =
                new ClientMsgProtobuf<>(CMsgClientUFSGetSingleFileInfo.class, EMsg.ClientUFSGetSingleFileInfo);
        JobID jobID = client.getNextJobID();
        request.setSourceJobID(jobID);

        request.getBody().setAppId(appId);
        request.getBody().setFileName(filename);

        client.send(request);

        return new SimpleAsyncJob<SingleFileInfoCallback>(client, request.getSourceJobID());
    }

    /**
     * Commit a Cloud file at the given path to make its UGC handle publicly visible.
     * Results are returned in a {@link ShareFileCallback}.
     *
     * @param appId    The app id of the game.
     * @param filename The path to the file being requested.
     * @return The Job ID of the request. This can be used to find the appropriate {@link ShareFileCallback}.
     */
    public AsyncJob<ShareFileCallback> shareFile(int appId, String filename) {
        ClientMsgProtobuf<CMsgClientUFSShareFile.Builder> request =
                new ClientMsgProtobuf<>(CMsgClientUFSShareFile.class, EMsg.ClientUFSShareFile);
        JobID jobID = client.getNextJobID();
        request.setSourceJobID(jobID);

        request.getBody().setAppId(appId);
        request.getBody().setFileName(filename);

        client.send(request);

        return new SimpleAsyncJob<ShareFileCallback>(client, request.getSourceJobID());
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

    private void handleUGCDetailsResponse(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientUFSGetUGCDetailsResponse.Builder> infoResponse =
                new ClientMsgProtobuf<>(CMsgClientUFSGetUGCDetailsResponse.class, packetMsg);

        client.postCallback(new UGCDetailsCallback(infoResponse.getTargetJobID(), infoResponse.getBody()));
    }

    private void handleSingleFileInfoResponse(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientUFSGetSingleFileInfoResponse.Builder> infoResponse =
                new ClientMsgProtobuf<>(CMsgClientUFSGetSingleFileInfoResponse.class, packetMsg);

        client.postCallback(new SingleFileInfoCallback(infoResponse.getTargetJobID(), infoResponse.getBody()));
    }

    private void handleShareFileResponse(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientUFSShareFileResponse.Builder> shareResponse =
                new ClientMsgProtobuf<>(CMsgClientUFSShareFileResponse.class, packetMsg);

        client.postCallback(new ShareFileCallback(shareResponse.getTargetJobID(), shareResponse.getBody()));
    }
}
