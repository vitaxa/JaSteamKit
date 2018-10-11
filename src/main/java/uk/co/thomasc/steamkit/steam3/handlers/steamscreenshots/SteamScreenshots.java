package uk.co.thomasc.steamkit.steam3.handlers.steamscreenshots;

import uk.co.thomasc.steamkit.base.ClientMsgProtobuf;
import uk.co.thomasc.steamkit.base.IPacketMsg;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgClientUCMAddScreenshotResponse;
import uk.co.thomasc.steamkit.base.generated.enums.EMsg;
import uk.co.thomasc.steamkit.steam3.handlers.ClientMsgHandler;
import uk.co.thomasc.steamkit.steam3.handlers.steamscreenshots.callback.ScreenshotAddedCallback;
import uk.co.thomasc.steamkit.types.AsyncJob;
import uk.co.thomasc.steamkit.types.JobID;
import uk.co.thomasc.steamkit.types.SimpleAsyncJob;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 * This handler is used for screenshots.
 */
public class SteamScreenshots extends ClientMsgHandler {

    /**
     * Width of a screenshot thumnail
     */
    public static final int SCREENSHOT_THUMBNAIL_WIDTH = 200;

    private Map<EMsg, Consumer<IPacketMsg>> dispatchMap;

    public SteamScreenshots() {
        dispatchMap = new HashMap<>();

        dispatchMap.put(EMsg.ClientUCMAddScreenshotResponse, this::handleUCMAddScreenshot);

        dispatchMap = Collections.unmodifiableMap(dispatchMap);
    }

    /**
     * Adds a screenshot to the user's screenshot library. The screenshot image and thumbnail must already exist on the UFS.
     * Results are returned in a {@link ScreenshotAddedCallback}.
     *
     * @param details The details of the screenshot.
     * @return The Job ID of the request. This can be used to find the appropriate {@link ScreenshotAddedCallback}.
     */
    public AsyncJob<ScreenshotAddedCallback> addScreenshot(ScreenshotDetails details) {
        if (details == null) {
            throw new IllegalArgumentException("details is null");
        }

        ClientMsgProtobuf<SteammessagesClientserver2.CMsgClientUCMAddScreenshot.Builder> msg =
                new ClientMsgProtobuf<>(SteammessagesClientserver2.CMsgClientUCMAddScreenshot.class, EMsg.ClientUCMAddScreenshot);
        JobID jobID = client.getNextJobID();
        msg.setSourceJobID(jobID);

        if (details.getGameID() != null) {
            msg.getBody().setAppid(details.getGameID().getAppID());
        }

        msg.getBody().setCaption(details.getCaption());
        msg.getBody().setFilename(details.getUfsImageFilePath());
        msg.getBody().setPermissions(details.getPrivacy().code());
        msg.getBody().setThumbname(details.getUsfThumbnailFilePath());
        msg.getBody().setWidth(details.getWidth());
        msg.getBody().setHeight(details.getHeight());
        msg.getBody().setRtime32Created((int) (details.getCreationTime().getTime() / 1000L));

        client.send(msg);

        return new SimpleAsyncJob<ScreenshotAddedCallback>(client, msg.getSourceJobID());
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

    private void handleUCMAddScreenshot(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientUCMAddScreenshotResponse.Builder> resp =
                new ClientMsgProtobuf<>(CMsgClientUCMAddScreenshotResponse.class, packetMsg);

        client.postCallback(new ScreenshotAddedCallback(resp.getTargetJobID(), resp.getBody()));
    }
}
