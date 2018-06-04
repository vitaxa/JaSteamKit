package uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callback;

import uk.co.thomasc.steamkit.base.generated.enums.EResult;
import uk.co.thomasc.steamkit.base.generated.internal.MsgClientSetIgnoreFriendResponse;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.JobID;

/**
 * This callback is fired in response to an attempt at ignoring a friend.
 */
public class IgnoreFriendCallback extends CallbackMsg {

    private EResult result;

    public IgnoreFriendCallback(JobID jobID, MsgClientSetIgnoreFriendResponse response) {
        setJobID(jobID);
        result = response.getResult();
    }

    public EResult getResult() {
        return result;
    }
}
