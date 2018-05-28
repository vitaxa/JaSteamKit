package uk.co.thomasc.steamkit.networking.steam3;

import org.bouncycastle.crypto.CryptoException;
import uk.co.thomasc.steamkit.util.crypto.CryptoHelper;
import uk.co.thomasc.steamkit.util.logging.DebugLog;

public class NetFilterEncryption implements INetFilterEncryption {

    private final byte[] sessionKey;

    public NetFilterEncryption(byte[] sessionKey) {
        if (sessionKey.length != 32) {
            DebugLog.writeLine("NetFilterEncryption", "AES session key was not 32 bytes!");
        }
        this.sessionKey = sessionKey;
    }

    @Override
    public byte[] processIncoming(byte[] data) {
        try {
            return CryptoHelper.symmetricDecrypt(data, sessionKey);
        } catch (CryptoException e) {
            throw new IllegalStateException("Unable to decrypt incoming packet", e);
        }
    }

    @Override
    public byte[] processOutgoing(byte[] data) {
        try {
            return CryptoHelper.symmetricEncrypt(data, sessionKey);
        } catch (CryptoException e) {
            throw new IllegalStateException("Unable to encrypt outgoing packet", e);
        }
    }
}
