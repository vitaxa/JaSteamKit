package uk.co.thomasc.steamkit.steam3.handlers.steamcloud.callback;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver.CMsgClientUFSGetSingleFileInfoResponse;
import uk.co.thomasc.steamkit.base.generated.enums.EResult;
import uk.co.thomasc.steamkit.steam3.handlers.steamcloud.SteamCloud;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.JobID;

import java.util.Date;

/**
 * This callback is received in response to calling {@link SteamCloud#getSingleFileInfo(int, String)}.
 */
public class SingleFileInfoCallback extends CallbackMsg {

    private EResult result;

    private int appID;

    private String fileName;

    private byte[] shaHash;

    private Date timestamp;

    private int fileSize;

    private boolean isExplicitDelete;

    public SingleFileInfoCallback(JobID jobID, CMsgClientUFSGetSingleFileInfoResponse.Builder msg) {
        setJobID(jobID);

        result = EResult.from(msg.getEresult());

        appID = msg.getAppId();
        fileName = msg.getFileName();
        shaHash = msg.getShaFile().toByteArray();
        timestamp = new Date(msg.getTimeStamp() * 1000L);
        fileSize = msg.getRawFileSize();
        isExplicitDelete = msg.getIsExplicitDelete();
    }

    public EResult getResult() {
        return result;
    }

    public int getAppID() {
        return appID;
    }

    public String getFileName() {
        return fileName;
    }

    public byte[] getShaHash() {
        return shaHash;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public int getFileSize() {
        return fileSize;
    }

    public boolean isExplicitDelete() {
        return isExplicitDelete;
    }
}
