package uk.co.thomasc.steamkit.steam3.handlers.steamuser.callbacks;

import uk.co.thomasc.steamkit.base.generated.enums.EResult;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;

/**
 * This callback is returned when the client is told to log off by the server.
 */
public class LoggedOffCallback extends CallbackMsg {

    private EResult result;

    public LoggedOffCallback(EResult result) {
        this.result = result;
    }

    public EResult getResult() {
        return result;
    }
}
