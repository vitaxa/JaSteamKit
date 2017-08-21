package uk.co.thomasc.steamkit.steam3.handlers.steamapps.callbacks;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver.CMsgClientAppInfoChanges;
import uk.co.thomasc.steamkit.steam3.handlers.steamapps.SteamApps;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;

import java.util.Collections;
import java.util.List;

/**
 * This callback is received in response to calling
 * {@link SteamApps#getAppChanges()}.
 */
public final class AppChangesCallback extends CallbackMsg {
    /**
     * Gets the list of AppIDs that have changed since the last change number
     * request.
     */
    private final List<Integer> appIDs;
    /**
     * Gets the current change number.
     */
    private final int currentChangeNumber;
    /**
     * Gets a value indicating whether the backend wishes for the client to
     * perform a full update.
     */
    public boolean forceFullUpdate;

    public AppChangesCallback(CMsgClientAppInfoChanges msg) {
        appIDs = Collections.unmodifiableList(msg.getAppIDsList());
        currentChangeNumber = msg.getCurrentChangeNumber();
        forceFullUpdate = msg.getForceFullUpdate();
    }

    /**
     * Gets the list of AppIDs that have changed since the last change number
     * request.
     */
    public List<Integer> getAppIDs() {
        return this.appIDs;
    }

    /**
     * Gets the current change number.
     */
    public int getCurrentChangeNumber() {
        return this.currentChangeNumber;
    }
}
