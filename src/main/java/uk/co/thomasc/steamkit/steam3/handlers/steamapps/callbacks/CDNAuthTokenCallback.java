package uk.co.thomasc.steamkit.steam3.handlers.steamapps.callbacks;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgClientGetCDNAuthTokenResponse;
import uk.co.thomasc.steamkit.base.generated.enums.EResult;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.JobID;

import java.util.Date;

/**
 * This callback is received when a CDN auth token is received
 */
public class CDNAuthTokenCallback extends CallbackMsg {

    private EResult result;

    private String token;

    private Date expiration;

    public CDNAuthTokenCallback(JobID jobID, CMsgClientGetCDNAuthTokenResponse.Builder msg) {
        setJobID(jobID);

        result = EResult.from(msg.getEresult());
        token = msg.getToken();
        expiration = new Date(msg.getExpirationTime() * 1000L);
    }

    public EResult getResult() {
        return result;
    }

    public String getToken() {
        return token;
    }

    public Date getExpiration() {
        return expiration;
    }
}
