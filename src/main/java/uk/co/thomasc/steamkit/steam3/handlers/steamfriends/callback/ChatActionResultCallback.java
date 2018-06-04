package uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callback;

import uk.co.thomasc.steamkit.base.generated.enums.EChatAction;
import uk.co.thomasc.steamkit.base.generated.enums.EChatActionResult;
import uk.co.thomasc.steamkit.base.generated.internal.MsgClientChatActionResult;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.SteamID;

/**
 * This callback is fired when a chat action has completed.
 */
public class ChatActionResultCallback extends CallbackMsg {
    private SteamID chatRoomID;

    private SteamID chatterID;

    private EChatAction action;

    private EChatActionResult result;

    public ChatActionResultCallback(MsgClientChatActionResult result) {
        chatRoomID = result.getSteamIdChat();
        chatterID = result.getSteamIdUserActedOn();

        action = result.getChatAction();
        this.result = result.getActionResult();
    }

    public ChatActionResultCallback(SteamID chatRoomID, SteamID chatterID, EChatAction action, EChatActionResult result) {
        this.chatRoomID = chatRoomID;
        this.chatterID = chatterID;
        this.action = action;
        this.result = result;
    }

    public SteamID getChatRoomID() {
        return chatRoomID;
    }

    public SteamID getChatterID() {
        return chatterID;
    }

    public EChatAction getAction() {
        return action;
    }

    public EChatActionResult getResult() {
        return result;
    }
}
