package uk.co.thomasc.steamkit.steam3.handlers.steamapps.types;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver.CMsgClientPICSChangesSinceResponse;

/**
 * Holds the change data for a single app or package
 */
public class PICSChangeData {

    private int id;

    private int changeNumber;

    private boolean needsToken;

    public PICSChangeData(CMsgClientPICSChangesSinceResponse.AppChange change) {
        id = change.getAppid();
        changeNumber = change.getChangeNumber();
        needsToken = change.getNeedsToken();
    }

    public PICSChangeData(CMsgClientPICSChangesSinceResponse.PackageChange change) {
        id = change.getPackageid();
        changeNumber = change.getChangeNumber();
        needsToken = change.getNeedsToken();
    }

    public int getId() {
        return id;
    }

    public int getChangeNumber() {
        return changeNumber;
    }

    public boolean isNeedsToken() {
        return needsToken;
    }
}
