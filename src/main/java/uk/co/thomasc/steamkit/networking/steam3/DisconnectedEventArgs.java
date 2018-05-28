package uk.co.thomasc.steamkit.networking.steam3;

import uk.co.thomasc.steamkit.util.cSharp.events.EventArgs;

public class DisconnectedEventArgs extends EventArgs {

    private boolean userInitiated;

    public DisconnectedEventArgs(boolean userInitiated) {
        this.userInitiated = userInitiated;
    }

    public boolean isUserInitiated() {
        return userInitiated;
    }
}
