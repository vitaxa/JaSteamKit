package uk.co.thomasc.steamkit.steam3.handlers.steamuserstats.callbacks;

import uk.co.thomasc.steamkit.base.generated.steamlanguage.ELeaderboardDataRequest;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EResult;
import uk.co.thomasc.steamkit.steam3.handlers.steamuserstats.LeaderboardEntry;
import uk.co.thomasc.steamkit.steam3.handlers.steamuserstats.SteamUserStats;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.JobID;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver.CMsgClientLBSGetLBEntriesResponse;

/**
 * This callback is fired in response to {@link SteamUserStats#getLeaderboardEntries(int, int, int, int, ELeaderboardDataRequest)}.
 */
public class LeaderboardEntriesCallback extends CallbackMsg {

    private EResult result;

    private int entryCount;

    private List<LeaderboardEntry> entries;

    public LeaderboardEntriesCallback(JobID jobID, CMsgClientLBSGetLBEntriesResponse.Builder resp) {
        setJobID(jobID);

        result = EResult.from(resp.getEresult());
        entryCount = resp.getLeaderboardEntryCount();

        List<LeaderboardEntry> list = new ArrayList<>();

        for (CMsgClientLBSGetLBEntriesResponse.Entry entry : resp.getEntriesList()) {
            list.add(new LeaderboardEntry(entry));
        }

        entries = Collections.unmodifiableList(list);
    }

    public EResult getResult() {
        return result;
    }

    public int getEntryCount() {
        return entryCount;
    }

    public List<LeaderboardEntry> getEntries() {
        return entries;
    }
}
