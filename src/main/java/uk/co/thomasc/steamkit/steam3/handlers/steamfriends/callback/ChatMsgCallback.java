package uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callback;

import uk.co.thomasc.steamkit.base.generated.enums.EChatEntryType;
import uk.co.thomasc.steamkit.base.generated.internal.MsgClientChatMsg;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.SteamID;

import java.nio.charset.Charset;

/**
 * This callback is fired when a chat room message arrives.
 */
public class ChatMsgCallback extends CallbackMsg {
    private SteamID chatterID;

    private SteamID chatRoomID;

    private EChatEntryType chatMsgType;

    private String message;

    public ChatMsgCallback(MsgClientChatMsg msg, byte[] payload) {
        chatterID = msg.getSteamIdChatter();
        chatRoomID = msg.getSteamIdChatRoom();
        chatMsgType = msg.getChatMsgType();

        message = new String(payload, Charset.forName("UTF-8")).replaceAll("\0+$", ""); // trim any extra null chars from the end
    }

    public SteamID getChatterID() {
        return chatterID;
    }

    public SteamID getChatRoomID() {
        return chatRoomID;
    }

    public EChatEntryType getChatMsgType() {
        return chatMsgType;
    }

    public String getMessage() {
        return message;
    }
}
