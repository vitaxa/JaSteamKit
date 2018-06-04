package uk.co.thomasc.steamkit.steam3.handlers.steamapps.callbacks;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgClientCheckAppBetaPasswordResponse;
import uk.co.thomasc.steamkit.base.generated.enums.EResult;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.JobID;
import uk.co.thomasc.steamkit.util.StringHelper;

import java.util.HashMap;
import java.util.Map;

/**
 * This callback is received when a beta password check has been completed
 */
public class CheckAppBetaPasswordCallback extends CallbackMsg {

    private EResult result;

    private Map<String, byte[]> betaPasswords;

    public CheckAppBetaPasswordCallback(JobID jobID, CMsgClientCheckAppBetaPasswordResponse.Builder msg) {
        setJobID(jobID);

        result = EResult.from(msg.getEresult());
        betaPasswords = new HashMap<>();

        for (CMsgClientCheckAppBetaPasswordResponse.BetaPassword password : msg.getBetapasswordsList()) {
            betaPasswords.put(password.getBetaname(), StringHelper.decodeHex(password.getBetapassword()));
        }
    }

    public EResult getResult() {
        return result;
    }

    public Map<String, byte[]> getBetaPasswords() {
        return betaPasswords;
    }
}
