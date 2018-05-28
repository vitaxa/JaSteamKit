package uk.co.thomasc.steamkit.steam3.handlers.steamuser.callbacks;

import uk.co.thomasc.steamkit.base.generated.steamlanguage.EResult;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.JobID;

import static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonceResponse;

/**
 * This callback is received when requesting a new WebAPI authentication user nonce.
 */
public class WebAPIUserNonceCallback extends CallbackMsg {

    private EResult result;

    private String nonce;

    public WebAPIUserNonceCallback(JobID jobID, CMsgClientRequestWebAPIAuthenticateUserNonceResponse.Builder body) {
        setJobID(jobID);

        result = EResult.from(body.getEresult());
        nonce = body.getWebapiAuthenticateUserNonce();
    }

    public EResult getResult() {
        return result;
    }

    public String getNonce() {
        return nonce;
    }
}
