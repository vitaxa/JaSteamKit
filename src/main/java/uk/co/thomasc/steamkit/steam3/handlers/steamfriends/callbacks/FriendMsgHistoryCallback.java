package uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callbacks;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgClientChatGetFriendMessageHistoryResponse;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EAccountType;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EResult;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EUniverse;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.types.FriendMessage;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.SteamID;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * This callback is fired in response to receiving message history for a friend
 */
public final class FriendMsgHistoryCallback extends CallbackMsg {

    private EResult result;
    /**
     * Gets the steamID
     */
    private final SteamID steamId;
    /**
     * Gets the array of messages
     */
    private final List<FriendMessage> messages;

    public FriendMsgHistoryCallback(CMsgClientChatGetFriendMessageHistoryResponse.Builder msg, EUniverse universe) {
        result = EResult.from(msg.getSuccess());

        steamId = new SteamID(msg.getSteamid());

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
        return steamId;
    }

    public List<FriendMessage> getMessages() {
        return messages;
    }

}
