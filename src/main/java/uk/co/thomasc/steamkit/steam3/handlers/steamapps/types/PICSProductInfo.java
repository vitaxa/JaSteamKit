package uk.co.thomasc.steamkit.steam3.handlers.steamapps.types;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver.CMsgClientPICSProductInfoResponse;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.keyvalue.KeyValue;
import uk.co.thomasc.steamkit.util.StringHelper;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.MemoryStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URI;

/**
 * Represents the information for a single app or package
 */
public class PICSProductInfo extends CallbackMsg {

    private int id;

    private int changeNumber;

    private boolean missingToken;

    private byte[] shaHash;

    private KeyValue keyValues;

    private boolean onlyPublic;

    private boolean useHttp;

    private URI httpUri;

    public PICSProductInfo(CMsgClientPICSProductInfoResponse.Builder parentResponse, CMsgClientPICSProductInfoResponse.AppInfo appInfo) {
        id = appInfo.getAppid();
        changeNumber = appInfo.getChangeNumber();
        missingToken = appInfo.getMissingToken();
        shaHash = appInfo.getSha().toByteArray();

        keyValues = new KeyValue();
        if (appInfo.hasBuffer() && !appInfo.getBuffer().isEmpty()) {
            // we don't want to read the trailing null byte
            try (MemoryStream ms = new MemoryStream(appInfo.getBuffer().toByteArray(), 0, appInfo.getBuffer().size() - 1)) {
                keyValues.readAsText(ms);
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to read buffer", e);
            }
        }

        onlyPublic = appInfo.getOnlyPublic();

        // We should have all these fields set for the response to a metadata-only request, but guard here just in case.
        if (shaHash != null && shaHash.length > 0 && !StringHelper.isNullOrEmpty(parentResponse.getHttpHost())) {
            String shaString = StringHelper.toHex(shaHash).replace("-", "").toLowerCase();
            String uriString = String.format("http://%s/appinfo/%d/sha/%s.txt.gz", parentResponse.getHttpHost(), id, shaString);
            httpUri = URI.create(uriString);
        }

        useHttp = httpUri != null && appInfo.getSize() >= parentResponse.getHttpMinSize();
    }

    public PICSProductInfo(CMsgClientPICSProductInfoResponse.PackageInfo packageInfo) {
        id = packageInfo.getPackageid();
        changeNumber = packageInfo.getChangeNumber();
        missingToken = packageInfo.getMissingToken();
        shaHash = packageInfo.getSha().toByteArray();

        keyValues = new KeyValue();
        if (packageInfo.hasBuffer()) {
            try (BinaryReader br = new BinaryReader(new ByteArrayInputStream(packageInfo.getBuffer().toByteArray()))) {
                br.readInt();
                keyValues.readAsBinary(br);
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to read buffer", e);
            }
        }
    }

    public int getId() {
        return id;
    }

    public int getChangeNumber() {
        return changeNumber;
    }

    public boolean isMissingToken() {
        return missingToken;
    }

    public byte[] getShaHash() {
        return shaHash;
    }

    public KeyValue getKeyValues() {
        return keyValues;
    }

    public boolean isOnlyPublic() {
        return onlyPublic;
    }

    public boolean isUseHttp() {
        return useHttp;
    }

    public URI getHttpUri() {
        return httpUri;
    }
}
