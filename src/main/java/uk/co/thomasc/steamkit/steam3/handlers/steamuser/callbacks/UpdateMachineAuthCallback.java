package uk.co.thomasc.steamkit.steam3.handlers.steamuser.callbacks;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgClientUpdateMachineAuth;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;

/**
 * This callback is recieved when the backend wants the client to update it's
 * local machine authentication data.
 */
public final class UpdateMachineAuthCallback extends CallbackMsg {
    /**
     * Gets the sentry file data that should be written.
     */
    private final byte[] data;
    /**
     * Gets the number of bytes to write.
     */
    private final int bytesToWrite;
    /**
     * Gets the offset to write to.
     */
    private final int offset;
    /**
     * Gets the name of the sentry file to write.
     */
    private final String fileName;
    /**
     * Gets the one-time-password details.
     */
    private final OTPDetailsCallback oneTimePassword;

    public UpdateMachineAuthCallback(CMsgClientUpdateMachineAuth msg) {
        data = msg.getBytes().toByteArray();
        bytesToWrite = msg.getCubtowrite();
        offset = msg.getOffset();
        fileName = msg.getFilename();
        oneTimePassword = new OTPDetailsCallbackInternal();
        oneTimePassword.type = msg.getOtpType();
        oneTimePassword.identifier = msg.getOtpIdentifier();
        ((OTPDetailsCallbackInternal) oneTimePassword).setSharedSecret(msg.getOtpSharedsecret().toByteArray());
        ((OTPDetailsCallbackInternal) oneTimePassword).setTimeDrift(msg.getOtpTimedrift());
    }

    /**
     * Gets the sentry file data that should be written.
     */
    public byte[] getData() {
        return this.data;
    }

    /**
     * Gets the number of bytes to write.
     */
    public int getBytesToWrite() {
        return this.bytesToWrite;
    }

    /**
     * Gets the offset to write to.
     */
    public int getOffset() {
        return this.offset;
    }

    /**
     * Gets the name of the sentry file to write.
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * Gets the one-time-password details.
     */
    public OTPDetailsCallback getOneTimePassword() {
        return this.oneTimePassword;
    }
}
