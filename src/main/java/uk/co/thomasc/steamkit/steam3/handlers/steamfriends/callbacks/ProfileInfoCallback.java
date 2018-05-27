package uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callbacks;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverFriends.CMsgClientFriendProfileInfoResponse;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EResult;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.JobID;
import uk.co.thomasc.steamkit.types.steamid.SteamID;

import java.util.Date;

/**
 * This callback is fired in response to requesting profile info for a user.
 */
public final class ProfileInfoCallback extends CallbackMsg {
    /**
     * Gets the result of requesting profile info.
     */
    private final EResult result;
    /**
     * Gets the SteamID this info belongs to.
     */
    private final SteamID steamID;
    /**
     * Gets the time this account was created.
     */
    private final Date timeCreated;
    /**
     * Gets the real name.
     */
    private final String realName;
    /**
     * Gets the name of the city.
     */
    private final String cityName;
    /**
     * Gets the name of the state.
     */
    private final String stateName;
    /**
     * Gets the name of the country.
     */
    private final String countryName;
    /**
     * Gets the headline.
     */
    private final String headline;
    /**
     * Gets the summary.
     */
    private final String summary;

    public ProfileInfoCallback(JobID jobID, CMsgClientFriendProfileInfoResponse response) {
        result = EResult.from(response.getEresult());
        steamID = new SteamID(response.getSteamidFriend());
        timeCreated = new Date((long) response.getTimeCreated() * 1000L);
        realName = response.getRealName();
        cityName = response.getCityName();
        stateName = response.getStateName();
        countryName = response.getCountryName();
        headline = response.getHeadline();
        summary = response.getSummary();
    }

    /**
     * Gets the result of requesting profile info.
     */
    public EResult getResult() {
        return this.result;
    }

    /**
     * Gets the SteamID this info belongs to.
     */
    public SteamID getSteamID() {
        return this.steamID;
    }

    /**
     * Gets the time this account was created.
     */
    public Date getTimeCreated() {
        return this.timeCreated;
    }

    /**
     * Gets the real name.
     */
    public String getRealName() {
        return this.realName;
    }

    /**
     * Gets the name of the city.
     */
    public String getCityName() {
        return this.cityName;
    }

    /**
     * Gets the name of the state.
     */
    public String getStateName() {
        return this.stateName;
    }

    /**
     * Gets the name of the country.
     */
    public String getCountryName() {
        return this.countryName;
    }

    /**
     * Gets the headline.
     */
    public String getHeadline() {
        return this.headline;
    }

    /**
     * Gets the summary.
     */
    public String getSummary() {
        return this.summary;
    }
}
