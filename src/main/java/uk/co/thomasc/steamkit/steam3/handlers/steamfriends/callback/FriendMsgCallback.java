package uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callback;

import uk.co.thomasc.steamkit.base.generated.enums.EChatEntryType;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.SteamID;

import java.nio.charset.Charset;

import static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverFriends.CMsgClientFriendMsgIncoming;

/**
 * This callback is fired in response to receiving a message from a friend.
 */
public class FriendMsgCallback extends CallbackMsg {
    private SteamID sender;

    private EChatEntryType entryType;

    private boolean fromLimitedAccount;

    private String message;

    public FriendMsgCallback(CMsgClientFriendMsgIncoming.Builder msg) {
        sender = new SteamID(msg.getSteamidFrom());
        entryType = EChatEntryType.from(msg.getChatEntryType());

        fromLimitedAccount = msg.getFromLimitedAccount();

        if (msg.hasMessage()) {
            message = msg.getMessage().toString(Charset.forName("UTF-8"));
            message = message.replaceAll("\0+$", ""); // trim any extra null chars from the end
        }
    }

    public SteamID getSender() {
        return sender;
    }

    public EChatEntryType getEntryType() {
        return entryType;
    }

    public boolean isFromLimitedAccount() {
        return fromLimitedAccount;
    }

    public String getMessage() {
        return message;
    }
}
