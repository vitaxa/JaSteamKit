package uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callback;

import uk.co.thomasc.steamkit.base.generated.enums.EAccountType;
import uk.co.thomasc.steamkit.base.generated.enums.EResult;
import uk.co.thomasc.steamkit.base.generated.enums.EUniverse;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.SteamFriends;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.types.FriendMessage;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.SteamID;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgClientChatGetFriendMessageHistoryResponse;

/**
 * This callback is fired in response to receiving historical messages.
 *
 * @see SteamFriends#requestOfflineMessages()
 */
public class FriendMsgHistoryCallback extends CallbackMsg {
    private EResult result;

    private SteamID steamID;

    private List<FriendMessage> messages;

    public FriendMsgHistoryCallback(CMsgClientChatGetFriendMessageHistoryResponse.Builder msg, EUniverse universe) {
        result = EResult.from(msg.getSuccess());

        steamID = new SteamID(msg.getSteamid());

        List<FriendMessage> messages = new ArrayList<>();
        for (CMsgClientChatGetFriendMessageHistoryResponse.FriendMessage m : msg.getMessagesList()) {
            SteamID senderID = new SteamID(m.getAccountid(), universe, EAccountType.Individual);
            Date timestamp = new Date(m.getTimestamp() * 1000L);

            messages.add(new FriendMessage(senderID, m.getUnread(), m.getMessage(), timestamp));
        }

        this.messages = Collections.unmodifiableList(messages);
    }

    public EResult getResult() {
        return result;
    }

    public SteamID getSteamID() {
        return steamID;
    }

    public List<FriendMessage> getMessages() {
        return messages;
    }
}
