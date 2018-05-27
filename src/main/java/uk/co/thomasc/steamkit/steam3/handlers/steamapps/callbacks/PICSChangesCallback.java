package uk.co.thomasc.steamkit.steam3.handlers.steamapps.callbacks;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver.CMsgClientPICSChangesSinceResponse;
import uk.co.thomasc.steamkit.steam3.handlers.steamapps.types.PICSChangeData;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.JobID;

import java.util.HashMap;
import java.util.Map;

/**
 * This callback is fired when the PICS returns the changes since the last change number
 */
public class PICSChangesCallback extends CallbackMsg {

    private int lastChangeNumber;

    private int currentChangeNumber;

    private boolean requiresFullUpdate;

    private Map<Integer, PICSChangeData> packageChanges;

    private Map<Integer, PICSChangeData> appChanges;

    public PICSChangesCallback(JobID jobID, CMsgClientPICSChangesSinceResponse.Builder msg) {
        setJobID(jobID);

        lastChangeNumber = msg.getSinceChangeNumber();
        currentChangeNumber = msg.getCurrentChangeNumber();
        requiresFullUpdate = msg.getForceFullUpdate();
        packageChanges = new HashMap<>();
        appChanges = new HashMap<>();

        for (CMsgClientPICSChangesSinceResponse.PackageChange packageChange : msg.getPackageChangesList()) {
            packageChanges.put(packageChange.getPackageid(), new PICSChangeData(packageChange));
        }

        for (CMsgClientPICSChangesSinceResponse.AppChange appChange : msg.getAppChangesList()) {
            appChanges.put(appChange.getAppid(), new PICSChangeData(appChange));
        }
    }

    public int getLastChangeNumber() {
        return lastChangeNumber;
    }

    public int getCurrentChangeNumber() {
        return currentChangeNumber;
    }

    public boolean isRequiresFullUpdate() {
        return requiresFullUpdate;
    }

    public Map<Integer, PICSChangeData> getPackageChanges() {
        return packageChanges;
    }

    public Map<Integer, PICSChangeData> getAppChanges() {
        return appChanges;
    }
}
