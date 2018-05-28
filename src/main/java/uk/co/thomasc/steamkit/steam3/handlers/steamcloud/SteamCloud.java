package uk.co.thomasc.steamkit.steam3.handlers.steamcloud;

import uk.co.thomasc.steamkit.base.ClientMsgProtobuf;
import uk.co.thomasc.steamkit.base.IPacketMsg;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver.*;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EMsg;
import uk.co.thomasc.steamkit.steam3.handlers.ClientMsgHandler;
import uk.co.thomasc.steamkit.steam3.handlers.steamcloud.callback.ShareFileCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamcloud.callback.SingleFileInfoCallback;
import uk.co.thomasc.steamkit.steam3.handlers.steamcloud.callback.UGCDetailsCallback;
import uk.co.thomasc.steamkit.types.JobID;
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

        dispatchMap.put(EMsg.ClientUFSGetUGCDetailsResponse, new Consumer<IPacketMsg>() {
            @Override
            public void accept(IPacketMsg packetMsg) {
                handleUGCDetailsResponse(packetMsg);
            }
        });
        dispatchMap.put(EMsg.ClientUFSGetSingleFileInfoResponse, new Consumer<IPacketMsg>() {
            @Override
            public void accept(IPacketMsg packetMsg) {
                handleSingleFileInfoResponse(packetMsg);
            }
        });
        dispatchMap.put(EMsg.ClientUFSShareFileResponse, new Consumer<IPacketMsg>() {
            @Override
            public void accept(IPacketMsg packetMsg) {
                handleShareFileResponse(packetMsg);
            }
        });

        dispatchMap = Collections.unmodifiableMap(dispatchMap);
    }

    /**
     * Requests details for a specific item of user generated content from the Steam servers.
     * Results are returned in a {@link UGCDetailsCallback}.
     *
     * @param ugcId The unique user generated content id.
     * @return The Job ID of the request. This can be used to find the appropriate {@link UGCDetailsCallback}.
     */
    public JobID requestUGCDetails(UGCHandle ugcId) {
        if (ugcId == null) {
            throw new IllegalArgumentException("ugcId is null");
        }

        ClientMsgProtobuf<CMsgClientUFSGetUGCDetails.Builder> request =
                new ClientMsgProtobuf<>(CMsgClientUFSGetUGCDetails.class, EMsg.ClientUFSGetUGCDetails);
        JobID jobID = client.getNextJobID();
        request.setSourceJobID(jobID);

        request.getBody().setHcontent(ugcId.getValue());

        client.send(request);

        return jobID;
    }

    /**
     * Requests details for a specific file in the user's Cloud storage.
     * Results are returned in a {@link SingleFileInfoCallback}.
     *
     * @param appId    The app id of the game.
     * @param filename The path to the file being requested.
     * @return The Job ID of the request. This can be used to find the appropriate {@link SingleFileInfoCallback}.
     */
    public JobID getSingleFileInfo(int appId, String filename) {
        ClientMsgProtobuf<CMsgClientUFSGetSingleFileInfo.Builder> request =
                new ClientMsgProtobuf<>(CMsgClientUFSGetSingleFileInfo.class, EMsg.ClientUFSGetSingleFileInfo);
        JobID jobID = client.getNextJobID();
        request.setSourceJobID(jobID);

        request.getBody().setAppId(appId);
        request.getBody().setFileName(filename);

        client.send(request);

        return jobID;
    }

    /**
     * Commit a Cloud file at the given path to make its UGC handle publicly visible.
     * Results are returned in a {@link ShareFileCallback}.
     *
     * @param appId    The app id of the game.
     * @param filename The path to the file being requested.
     * @return The Job ID of the request. This can be used to find the appropriate {@link ShareFileCallback}.
     */
    public JobID shareFile(int appId, String filename) {
        ClientMsgProtobuf<CMsgClientUFSShareFile.Builder> request =
                new ClientMsgProtobuf<>(CMsgClientUFSShareFile.class, EMsg.ClientUFSShareFile);
        JobID jobID = client.getNextJobID();
        request.setSourceJobID(jobID);

        request.getBody().setAppId(appId);
        request.getBody().setFileName(filename);

        client.send(request);

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
