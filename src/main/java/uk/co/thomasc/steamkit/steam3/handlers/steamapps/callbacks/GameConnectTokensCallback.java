package uk.co.thomasc.steamkit.steam3.handlers.steamapps.callbacks;

import com.google.protobuf.ByteString;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver.CMsgClientGameConnectTokens;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This callback is fired when the client receives a list of game connect tokens.
 */
public class GameConnectTokensCallback extends CallbackMsg {

    private int tokensToKeep;

    private List<byte[]> tokens;

    public GameConnectTokensCallback(CMsgClientGameConnectTokens.Builder msg) {
        tokensToKeep = msg.getMaxTokensToKeep();

        List<byte[]> temp = new ArrayList<>();
        for (ByteString token : msg.getTokensList()) {
            temp.add(token.toByteArray());
        }

        tokens = Collections.unmodifiableList(temp);
    }

    public int getTokensToKeep() {
        return tokensToKeep;
    }

    public List<byte[]> getTokens() {
        return tokens;
    }
}
