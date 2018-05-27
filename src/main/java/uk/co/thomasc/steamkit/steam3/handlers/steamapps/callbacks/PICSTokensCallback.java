package uk.co.thomasc.steamkit.steam3.handlers.steamapps.callbacks;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver.CMsgClientPICSAccessTokenResponse;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.JobID;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This callback is fired when the PICS returns access tokens for a list of appids and packageids
 */
public class PICSTokensCallback extends CallbackMsg {

    private List<Integer> packageTokensDenied;

    private List<Integer> appTokensDenied;

    private Map<Integer, Long> packageTokens;

    private Map<Integer, Long> appTokens;

    public PICSTokensCallback(JobID jobID, CMsgClientPICSAccessTokenResponse.Builder msg) {
        setJobID(jobID);

        packageTokensDenied = Collections.unmodifiableList(msg.getPackageDeniedTokensList());
        appTokensDenied = Collections.unmodifiableList(msg.getAppDeniedTokensList());

        packageTokens = new HashMap<>();
        appTokens = new HashMap<>();

        for (CMsgClientPICSAccessTokenResponse.PackageToken packageToken : msg.getPackageAccessTokensList()) {
            packageTokens.put(packageToken.getPackageid(), packageToken.getAccessToken());
        }

        for (CMsgClientPICSAccessTokenResponse.AppToken appToken : msg.getAppAccessTokensList()) {
            packageTokens.put(appToken.getAppid(), appToken.getAccessToken());
        }
    }

    public List<Integer> getPackageTokensDenied() {
        return packageTokensDenied;
    }

    public List<Integer> getAppTokensDenied() {
        return appTokensDenied;
    }

    public Map<Integer, Long> getPackageTokens() {
        return packageTokens;
    }

    public Map<Integer, Long> getAppTokens() {
        return appTokens;
    }
}
