package uk.co.thomasc.steamkit.steam3.handlers.steamuserstats.callbacks;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgDPGetNumberOfCurrentPlayersResponse;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EResult;
import uk.co.thomasc.steamkit.steam3.handlers.steamuserstats.SteamUserStats;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.JobID;

/**
 * This callback is fired in response to {@link SteamUserStats#getNumberOfCurrentPlayers(int)}.
 */
public class NumberOfPlayersCallback extends CallbackMsg {
    /**
     * Gets the result of the request.
     */
    private final EResult result;
    /**
     * Gets the current number of players according to Steam.
     */
    private final int numPlayers;

    public NumberOfPlayersCallback(JobID jobID, CMsgDPGetNumberOfCurrentPlayersResponse.Builder resp) {
        setJobID(jobID);
        result = EResult.from(resp.getEresult());
        numPlayers = resp.getPlayerCount();
    }

    /**
     * Gets the result of the request.
     */
    public EResult getResult() {
        return this.result;
    }

    /**
     * Gets the current number of players according to Steam.
     */
    public int getNumPlayers() {
        return this.numPlayers;
    }
}
