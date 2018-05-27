package uk.co.thomasc.steamkit.steam3.handlers.steamapps.callbacks;

import in.dragonbra.javasteam.steam.handlers.steamapps.SteamApps;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver.CMsgClientGetAppOwnershipTicketResponse;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EResult;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.JobID;

/**
 * This callback is received in response to calling {@link SteamApps#getAppOwnershipTicket(int)}
 */
public class AppOwnershipTicketCallback extends CallbackMsg {

    private EResult result;

    private int appID;

    private byte[] ticket;

    public AppOwnershipTicketCallback(JobID jobID, CMsgClientGetAppOwnershipTicketResponse.Builder msg) {
        setJobID(jobID);

        result = EResult.from(msg.getEresult());
        appID = msg.getAppId();
        ticket = msg.getTicket().toByteArray();
    }

    public EResult getResult() {
        return result;
    }

    public int getAppID() {
        return appID;
    }

    public byte[] getTicket() {
        return ticket;
    }
}
