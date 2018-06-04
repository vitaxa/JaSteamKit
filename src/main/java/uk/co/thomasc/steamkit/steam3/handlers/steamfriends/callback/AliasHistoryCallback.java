package uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callback;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver.CMsgClientAMGetPersonaNameHistoryResponse;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.SteamFriends;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.types.NameTableInstance;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.JobID;
import uk.co.thomasc.steamkit.types.SteamID;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Callback fired in response to calling {@link SteamFriends#requestAliasHistory(SteamID)}.
 */
public class AliasHistoryCallback extends CallbackMsg {

    private List<NameTableInstance> responses;

    public AliasHistoryCallback(JobID jobID, CMsgClientAMGetPersonaNameHistoryResponse.Builder msg) {
        setJobID(jobID);
        responses = new ArrayList<>();

        for (CMsgClientAMGetPersonaNameHistoryResponse.NameTableInstance instance : msg.getResponsesList()) {
            responses.add(new NameTableInstance(instance));
        }

        responses = Collections.unmodifiableList(responses);
    }

    /**
     * @return the responses to the steam ids
     */
    public List<NameTableInstance> getResponses() {
        return responses;
    }
}
