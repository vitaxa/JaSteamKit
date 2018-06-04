package uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callback;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverFriends.CMsgClientFriendProfileInfoResponse;
import uk.co.thomasc.steamkit.base.generated.enums.EResult;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.JobID;
import uk.co.thomasc.steamkit.types.SteamID;

import java.util.Date;

/**
 * This callback is fired in response to requesting profile info for a user.
 */
public class ProfileInfoCallback extends CallbackMsg {
    private EResult result;

    private SteamID steamID;

    private Date timeCreated;
    ;

    private String realName;

    private String cityName;

    private String stateName;

    private String countryName;

    private String headline;

    private String summary;

    public ProfileInfoCallback(JobID jobID, CMsgClientFriendProfileInfoResponse.Builder response) {
        setJobID(jobID);

        result = EResult.from(response.getEresult());

        steamID = new SteamID(response.getSteamidFriend());

        timeCreated = new Date(response.getTimeCreated() * 1000L);

        realName = response.getRealName();

        cityName = response.getCityName();
        stateName = response.getStateName();
        countryName = response.getCountryName();

        headline = response.getHeadline();

        summary = response.getSummary();
    }

    public ProfileInfoCallback(EResult result, SteamID steamID, Date timeCreated, String realName, String cityName, String stateName, String countryName, String headline, String summary) {
        this.result = result;
        this.steamID = steamID;
        this.timeCreated = timeCreated;
        this.realName = realName;
        this.cityName = cityName;
        this.stateName = stateName;
        this.countryName = countryName;
        this.headline = headline;
        this.summary = summary;
    }

    public EResult getResult() {
        return result;
    }

    public SteamID getSteamID() {
        return steamID;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public String getRealName() {
        return realName;
    }

    public String getCityName() {
        return cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getHeadline() {
        return headline;
    }

    public String getSummary() {
        return summary;
    }
}
