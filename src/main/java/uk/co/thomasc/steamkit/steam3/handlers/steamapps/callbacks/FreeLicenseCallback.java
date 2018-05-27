package uk.co.thomasc.steamkit.steam3.handlers.steamapps.callbacks;

import in.dragonbra.javasteam.steam.handlers.steamapps.SteamApps;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgClientRequestFreeLicenseResponse;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EResult;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.JobID;

import java.util.Collections;
import java.util.List;

/**
 * This callback is received in response to calling {@link SteamApps#requestFreeLicense}, informing the client of newly granted packages, if any.
 */
public class FreeLicenseCallback extends CallbackMsg {

    private EResult result;

    private List<Integer> grantedApps;

    private List<Integer> grantedPackages;

    public FreeLicenseCallback(JobID jobID, CMsgClientRequestFreeLicenseResponse.Builder msg) {
        setJobID(jobID);

        result = EResult.from(msg.getEresult());

        grantedApps = Collections.unmodifiableList(msg.getGrantedAppidsList());
        grantedPackages = Collections.unmodifiableList(msg.getGrantedPackageidsList());
    }

    public EResult getResult() {
        return result;
    }

    public List<Integer> getGrantedApps() {
        return grantedApps;
    }

    public List<Integer> getGrantedPackages() {
        return grantedPackages;
    }
}
