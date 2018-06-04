package uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callback;

import uk.co.thomasc.steamkit.base.generated.enums.EChatInfoType;
import uk.co.thomasc.steamkit.base.generated.internal.MsgClientChatRoomInfo;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.SteamID;

/**
 * This callback is fired in response to chat room info being recieved.
 */
public class ChatRoomInfoCallback extends CallbackMsg {

    private SteamID chatRoomID;

    private EChatInfoType type;

    public ChatRoomInfoCallback(MsgClientChatRoomInfo msg, byte[] payload) {
        chatRoomID = msg.getSteamIdChat();
        type = msg.getType();
        // todo: handle inner payload based on the type similar to ChatMemberInfoCallback
    }

    public SteamID getChatRoomID() {
        return chatRoomID;
    }

    public EChatInfoType getType() {
        return type;
    }
}
