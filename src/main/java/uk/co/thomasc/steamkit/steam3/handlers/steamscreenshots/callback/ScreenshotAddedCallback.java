package uk.co.thomasc.steamkit.steam3.handlers.steamscreenshots.callback;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2;
import uk.co.thomasc.steamkit.base.generated.enums.EResult;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.JobID;
import uk.co.thomasc.steamkit.types.UGCHandle;

/**
 * This callback is fired when a new screenshot is added.
 */
public class ScreenshotAddedCallback extends CallbackMsg {

    private EResult result;

    private UGCHandle screenshotID;

    public ScreenshotAddedCallback(JobID jobID, SteammessagesClientserver2.CMsgClientUCMAddScreenshotResponse.Builder msg) {
        setJobID(jobID);

        result = EResult.from(msg.getEresult());
        screenshotID = new UGCHandle(msg.getScreenshotid());
    }

    public EResult getResult() {
        return result;
    }

    public UGCHandle getScreenshotID() {
        return screenshotID;
    }
}
