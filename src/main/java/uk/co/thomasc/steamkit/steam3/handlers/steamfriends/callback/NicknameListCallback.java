package uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callback;

import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.types.PlayerNickname;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverFriends.CMsgClientPlayerNicknameList;

/**
 * This callback is fired when the client receives a list of friend nicknames.
 */
public class NicknameListCallback extends CallbackMsg {

    private List<PlayerNickname> nicknames;

    public NicknameListCallback(CMsgClientPlayerNicknameList.Builder msg) {
        nicknames = new ArrayList<>();
        for (CMsgClientPlayerNicknameList.PlayerNickname nickname : msg.getNicknamesList()) {
            nicknames.add(new PlayerNickname(nickname));
        }

        nicknames = Collections.unmodifiableList(nicknames);
    }

    /**
     * @return the list of nicknames
     */
    public List<PlayerNickname> getNicknames() {
        return nicknames;
    }
}
