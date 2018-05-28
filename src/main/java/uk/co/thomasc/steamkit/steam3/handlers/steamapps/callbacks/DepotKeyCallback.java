package uk.co.thomasc.steamkit.steam3.handlers.steamapps.callbacks;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgClientGetDepotDecryptionKeyResponse;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EResult;
import uk.co.thomasc.steamkit.steam3.handlers.steamapps.SteamApps;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.JobID;

/**
 * This callback is recieved in response to calling {@link SteamApps#getDepotDecryptionKey(int, int)}
 */
public class DepotKeyCallback extends CallbackMsg {

    private EResult result;

    private int depotID;

    private byte[] depotKey;

    public DepotKeyCallback(JobID jobID, CMsgClientGetDepotDecryptionKeyResponse.Builder msg) {
        setJobID(jobID);

        result = EResult.from(msg.getEresult());
        depotID = msg.getDepotId();
        depotKey = msg.getDepotEncryptionKey().toByteArray();
    }

    public EResult getResult() {
        return result;
    }

    public int getDepotID() {
        return depotID;
    }

    public byte[] getDepotKey() {
        return depotKey;
    }
}
