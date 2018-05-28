package uk.co.thomasc.steamkit.steam3.handlers.steamcloud.callback;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EResult;
import uk.co.thomasc.steamkit.steam3.handlers.steamcloud.SteamCloud;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.JobID;
import uk.co.thomasc.steamkit.types.SteamID;
import uk.co.thomasc.steamkit.types.UGCHandle;

/**
 * This callback is received in response to calling {@link SteamCloud#requestUGCDetails(UGCHandle)}.
 */
public class UGCDetailsCallback extends CallbackMsg {

    private EResult result;

    private int appID;

    private SteamID creator;

    private String url;

    private String fileName;

    private int fileSize;

    public UGCDetailsCallback(JobID jobID, SteammessagesClientserver.CMsgClientUFSGetUGCDetailsResponse.Builder msg) {
        setJobID(jobID);

        result = EResult.from(msg.getEresult());

        appID = msg.getAppId();
        creator = new SteamID(msg.getSteamidCreator());

        url = msg.getUrl();

        fileName = msg.getFilename();
        fileSize = msg.getFileSize();
    }

    public EResult getResult() {
        return result;
    }

    public int getAppID() {
        return appID;
    }

    public SteamID getCreator() {
        return creator;
    }

    public String getUrl() {
        return url;
    }

    public String getFileName() {
        return fileName;
    }

    public int getFileSize() {
        return fileSize;
    }
}
