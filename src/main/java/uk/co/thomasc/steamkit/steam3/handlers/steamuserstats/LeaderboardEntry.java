package uk.co.thomasc.steamkit.steam3.handlers.steamuserstats;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver.CMsgClientLBSGetLBEntriesResponse;
import uk.co.thomasc.steamkit.types.SteamID;
import uk.co.thomasc.steamkit.types.UGCHandle;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.MemoryStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a single package in this response.
 */
public class LeaderboardEntry {

    private SteamID steamID;

    private int globalRank;

    private int score;

    private UGCHandle ugcId;

    private List<Integer> details;

    public LeaderboardEntry(CMsgClientLBSGetLBEntriesResponse.Entry entry) {
        globalRank = entry.getGlobalRank();
        score = entry.getScore();
        steamID = new SteamID(entry.getSteamIdUser());
        ugcId = new UGCHandle(entry.getUgcId());

        details = new ArrayList<>();

        MemoryStream ms = new MemoryStream(entry.getDetails().toByteArray());
        BinaryReader br = new BinaryReader(ms);
        try {
            while (ms.getLength() - ms.getPosition() > 4) {
                details.add(br.readInt());
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("failed to read details", e);
        }

        details = Collections.unmodifiableList(details);
    }

    public SteamID getSteamID() {
        return steamID;
    }

    public int getGlobalRank() {
        return globalRank;
    }

    public int getScore() {
        return score;
    }

    public UGCHandle getUgcId() {
        return ugcId;
    }

    public List<Integer> getDetails() {
        return details;
    }
}
