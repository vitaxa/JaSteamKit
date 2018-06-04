package uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callback;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverFriends;
import uk.co.thomasc.steamkit.base.generated.enums.EResult;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.SteamFriends;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.JobID;
import uk.co.thomasc.steamkit.types.SteamID;

/**
 * This callback is fired in response to setting a nickname of a player by calling {@link SteamFriends#setFriendNickname(SteamID, String)}.
 */
public class NicknameCallback extends CallbackMsg {

    private EResult result;

    public NicknameCallback(JobID jobID, SteammessagesClientserverFriends.CMsgClientSetPlayerNicknameResponse.Builder body) {
        setJobID(jobID);
        result = EResult.from(body.getEresult());
    }

    /**
     * @return the result of setting a nickname
     */
    public EResult getResult() {
        return result;
    }
}
