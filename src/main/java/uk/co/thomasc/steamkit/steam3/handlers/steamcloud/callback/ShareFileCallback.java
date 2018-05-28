package uk.co.thomasc.steamkit.steam3.handlers.steamcloud.callback;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver.CMsgClientUFSShareFileResponse;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EResult;
import uk.co.thomasc.steamkit.steam3.handlers.steamcloud.SteamCloud;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.JobID;

/**
 * This callback is received in response to calling {@link SteamCloud#shareFile(int, String)}.
 */
public class ShareFileCallback extends CallbackMsg {

    private EResult result;

    private long ugcId;

    public ShareFileCallback(JobID jobID, CMsgClientUFSShareFileResponse.Builder msg) {
        setJobID(jobID);

        result = EResult.from(msg.getEresult());
        ugcId = msg.getHcontent();
    }

    public EResult getResult() {
        return result;
    }

    public long getUgcId() {
        return ugcId;
    }
}
