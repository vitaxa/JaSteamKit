package uk.co.thomasc.steamkit.steam3.handlers.steamapps.callbacks;

import uk.co.thomasc.steamkit.base.generated.internal.MsgClientVACBanStatus;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This callback is fired when the client receives it's VAC banned status.
 */
public class VACStatusCallback extends CallbackMsg {

    private List<Integer> bannedApps;

    public VACStatusCallback(MsgClientVACBanStatus msg, byte[] payload) {
        List<Integer> tempList = new ArrayList<>();

        try (BinaryReader br = new BinaryReader(new ByteArrayInputStream(payload))) {
            for (int i = 0; i < msg.getNumBans(); i++) {
                tempList.add(br.readInt());
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("failed to read bans", e);
        }
        bannedApps = Collections.unmodifiableList(tempList);
    }

    public List<Integer> getBannedApps() {
        return bannedApps;
    }
}
