package uk.co.thomasc.steamkit.steam3.handlers.steamfriends.types;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver.CMsgClientClanState;
import uk.co.thomasc.steamkit.types.GameID;
import uk.co.thomasc.steamkit.types.GlobalID;

import java.util.Date;

/**
 * Represents an event or announcement that was posted by a clan.
 */
public class Event {
    private GlobalID id;

    private Date eventTime;

    private String headline;

    private GameID gameID;

    private boolean justPosted;

    public Event(CMsgClientClanState.Event clanEvent) {
        id = new GlobalID(clanEvent.getGid());

        eventTime = new Date(clanEvent.getEventTime() * 1000L);
        headline = clanEvent.getHeadline();
        gameID = new GameID(clanEvent.getGameId());

        justPosted = clanEvent.getJustPosted();
    }

    public GlobalID getId() {
        return id;
    }

    public Date getEventTime() {
        return eventTime;
    }

    public String getHeadline() {
        return headline;
    }

    public GameID getGameID() {
        return gameID;
    }

    public boolean isJustPosted() {
        return justPosted;
    }
}
