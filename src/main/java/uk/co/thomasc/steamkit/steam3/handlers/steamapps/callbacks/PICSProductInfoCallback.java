package uk.co.thomasc.steamkit.steam3.handlers.steamapps.callbacks;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver.CMsgClientPICSProductInfoResponse;
import uk.co.thomasc.steamkit.steam3.handlers.steamapps.types.PICSProductInfo;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.JobID;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This callback is fired when the PICS returns the product information requested
 */
public class PICSProductInfoCallback extends CallbackMsg {

    private boolean metaDataOnly;

    private boolean responsePending;

    private List<Integer> unknownPackages;

    private List<Integer> unknownApps;

    private Map<Integer, PICSProductInfo> apps;

    private Map<Integer, PICSProductInfo> packages;

    public PICSProductInfoCallback(JobID jobID, CMsgClientPICSProductInfoResponse.Builder msg) {
        setJobID(jobID);

        metaDataOnly = msg.getMetaDataOnly();
        responsePending = msg.getResponsePending();
        unknownPackages = Collections.unmodifiableList(msg.getUnknownPackageidsList());
        unknownApps = Collections.unmodifiableList(msg.getUnknownAppidsList());
        apps = new HashMap<>();
        packages = new HashMap<>();

        for (CMsgClientPICSProductInfoResponse.PackageInfo packageInfo : msg.getPackagesList()) {
            packages.put(packageInfo.getPackageid(), new PICSProductInfo(packageInfo));
        }

        for (CMsgClientPICSProductInfoResponse.AppInfo appInfo : msg.getAppsList()) {
            apps.put(appInfo.getAppid(), new PICSProductInfo(msg, appInfo));
        }
    }

    public boolean isMetaDataOnly() {
        return metaDataOnly;
    }

    public boolean isResponsePending() {
        return responsePending;
    }

    public List<Integer> getUnknownPackages() {
        return unknownPackages;
    }

    public List<Integer> getUnknownApps() {
        return unknownApps;
    }

    public Map<Integer, PICSProductInfo> getApps() {
        return apps;
    }

    public Map<Integer, PICSProductInfo> getPackages() {
        return packages;
    }
}
