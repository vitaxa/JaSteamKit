package uk.co.thomasc.steamkit.steam3.handlers.steamuser.types;

import uk.co.thomasc.steamkit.base.generated.enums.EResult;
import uk.co.thomasc.steamkit.types.JobID;

/**
 * Represents details required to complete a machine auth request.
 */
public class MachineAuthDetails {
    private JobID jobID;

    private EResult eResult;

    private int bytesWritten;

    private int offset;

    private String fileName = "";

    private int fileSize;

    private int lastError;

    private byte[] sentryFileHash;

    private OTPDetails oneTimePassword = new OTPDetails();

    public JobID getJobID() {
        return jobID;
    }

    public void setJobID(JobID jobID) {
        this.jobID = jobID;
    }

    public EResult geteResult() {
        return eResult;
    }

    public void seteResult(EResult eResult) {
        this.eResult = eResult;
    }

    public int getBytesWritten() {
        return bytesWritten;
    }

    public void setBytesWritten(int bytesWritten) {
        this.bytesWritten = bytesWritten;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public int getLastError() {
        return lastError;
    }

    public void setLastError(int lastError) {
        this.lastError = lastError;
    }

    public byte[] getSentryFileHash() {
        return sentryFileHash;
    }

    public void setSentryFileHash(byte[] sentryFileHash) {
        this.sentryFileHash = sentryFileHash;
    }

    public OTPDetails getOneTimePassword() {
        return oneTimePassword;
    }

    public void setOneTimePassword(OTPDetails oneTimePassword) {
        this.oneTimePassword = oneTimePassword;
    }
}
