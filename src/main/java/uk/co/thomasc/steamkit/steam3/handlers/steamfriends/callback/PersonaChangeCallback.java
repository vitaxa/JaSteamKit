package uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callback;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverFriends;
import uk.co.thomasc.steamkit.base.generated.enums.EPersonaState;
import uk.co.thomasc.steamkit.base.generated.enums.EResult;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.SteamFriends;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.JobID;

/**
 * This callback is fired in response to setting this client's persona name or state
 * with {@link SteamFriends#setPersonaName(String)} or {@link SteamFriends#setPersonaState(EPersonaState)}.
 */
public class PersonaChangeCallback extends CallbackMsg {
    private EResult result;

    private String name;

    public PersonaChangeCallback(JobID jobID, SteammessagesClientserverFriends.CMsgPersonaChangeResponse.Builder msg) {
        setJobID(jobID);

        result = EResult.from(msg.getResult());
        name = msg.getPlayerName();
    }

    public EResult getResult() {
        return result;
    }

    public String getName() {
        return name;
    }
}
