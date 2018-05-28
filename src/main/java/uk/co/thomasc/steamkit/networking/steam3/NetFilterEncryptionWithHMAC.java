package uk.co.thomasc.steamkit.networking.steam3;

import org.bouncycastle.crypto.CryptoException;
import uk.co.thomasc.steamkit.util.crypto.CryptoHelper;
import uk.co.thomasc.steamkit.util.logging.DebugLog;

public class NetFilterEncryptionWithHMAC implements INetFilterEncryption {

    private final byte[] sessionKey;
    private final byte[] hmacSecret;

    public NetFilterEncryptionWithHMAC(byte[] sessionKey) {
        if (sessionKey.length != 32) {
            DebugLog.writeLine("NetFilterEncryptionWithHMAC", "AES session key was not 32 bytes!");
        }
        this.sessionKey = sessionKey;
        this.hmacSecret = new byte[16];
        System.arraycopy(sessionKey, 0, hmacSecret, 0, hmacSecret.length);
    }

    @Override
    public byte[] processIncoming(byte[] data) {
        try {
            return CryptoHelper.symmetricDecryptHMACIV(data, sessionKey, hmacSecret);
        } catch (CryptoException e) {
            throw new IllegalStateException("Unable to decrypt incoming packet", e);
        }
    }

    @Override
    public byte[] processOutgoing(byte[] data) {
        try {
            return CryptoHelper.symmetricEncryptWithHMACIV(data, sessionKey, hmacSecret);
        } catch (CryptoException e) {
            throw new IllegalStateException("Unable to encrypt outgoing packet", e);
        }
    }
}
