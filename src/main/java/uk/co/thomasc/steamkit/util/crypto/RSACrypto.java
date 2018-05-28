package uk.co.thomasc.steamkit.util.crypto;

import uk.co.thomasc.steamkit.util.crypto.asnkeyparser.AsnKeyParser;
import uk.co.thomasc.steamkit.util.crypto.asnkeyparser.BerDecodeException;
import uk.co.thomasc.steamkit.util.logging.DebugLog;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import java.util.ArrayList;
import java.util.List;

public class RSACrypto {
    private Cipher cipher;

    public RSACrypto(byte[] key) {
        if (key == null) {
            throw new IllegalArgumentException("key is null");
        }

        try {
            final List<Byte> list = new ArrayList<>();
            for (final byte b : key) {
                list.add(b);
            }
            final AsnKeyParser keyParser = new AsnKeyParser(list);
            final BigInteger[] keys = keyParser.parseRSAPublicKey();
            init(keys[0], keys[1]);
        } catch (final BerDecodeException e) {
            e.printStackTrace();
        }
    }

    private void init(BigInteger mod, BigInteger exp) {
        try {
            final RSAPublicKeySpec publicKeySpec = new RSAPublicKeySpec(mod, exp);

            final KeyFactory factory = KeyFactory.getInstance("RSA");
            RSAPublicKey rsaKey = (RSAPublicKey) factory.generatePublic(publicKeySpec);

            cipher = Cipher.getInstance("RSA/None/OAEPWithSHA1AndMGF1Padding", CryptoHelper.SEC_PROV);
            cipher.init(Cipher.ENCRYPT_MODE, rsaKey);
        } catch (final NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | InvalidKeySpecException
                | NoSuchProviderException e) {
            DebugLog.printStackTrace("RSACrypto", e);
        }
    }

    public byte[] encrypt(byte[] input) {
        try {
            return cipher.doFinal(input);
        } catch (final IllegalBlockSizeException | BadPaddingException e) {
            DebugLog.printStackTrace("RSACrypto", e);
        }
        return null;
    }
}
