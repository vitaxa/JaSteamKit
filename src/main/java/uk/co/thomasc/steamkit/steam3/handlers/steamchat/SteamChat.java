package uk.co.thomasc.steamkit.steam3.handlers.steamchat;

import uk.co.thomasc.steamkit.base.ClientMsg;
import uk.co.thomasc.steamkit.base.ClientMsgProtobuf;
import uk.co.thomasc.steamkit.base.IPacketMsg;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.*;
import uk.co.thomasc.steamkit.base.generated.steamlanguageinternal.*;
import uk.co.thomasc.steamkit.steam3.handlers.ClientMsgHandler;
import uk.co.thomasc.steamkit.steam3.handlers.steamchat.callbacks.*;
import uk.co.thomasc.steamkit.steam3.handlers.steamchat.types.Chat;
import uk.co.thomasc.steamkit.types.steamid.SteamID;
import uk.co.thomasc.steamkit.util.logging.DebugLog;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * This handler is used for handling MUC/group/clan chat
 */
public final class SteamChat extends ClientMsgHandler {
    private final List<Chat> chats;

    public SteamChat() {
        chats = new ArrayList<Chat>();
    }

    /**
     * Attempts to join a chat room.
     *
     * @param steamID The SteamID of the chat room.
     */
    public void joinChat(SteamID steamID) {
        if (steamID == null) {
            throw new IllegalArgumentException("steamID is null");
        }

        SteamID chatID = fixChatID(steamID); // copy the steamid so we don't modify it

        ClientMsg<MsgClientJoinChat> joinChat = new ClientMsg<>(MsgClientJoinChat.class);

        joinChat.getBody().setSteamIdChat(chatID);

        client.send(joinChat);
    }

    /**
     * Attempts to create a chat room from a one-on-one chat.
     *
     * @param steamIdFriendChat the SteamID of the friend you are currently chatting with
     * @param steamIdInvited    the SteamID of the friend to invite to the chat
     */
    public void createChat(SteamID steamIdFriendChat, SteamID steamIdClan, SteamID steamIdInvited) {
        final ClientMsg<MsgClientCreateChat> createChat = new ClientMsg<MsgClientCreateChat>(MsgClientCreateChat.class);
        if (steamIdFriendChat != null) {
            createChat.getBody().setSteamIdFriendChat(steamIdFriendChat);
        }
        if (steamIdClan != null) {
            createChat.getBody().setSteamIdClan(steamIdClan);
        }
        if (steamIdInvited != null) {
            createChat.getBody().setSteamIdInvited(steamIdInvited);
        }
        createChat.getBody().setChatRoomType(EChatRoomType.MUC);
        createChat.getBody().setPermissionOfficer(EChatPermission.MemberDefault);
        createChat.getBody().setPermissionMember(EChatPermission.MemberDefault);
        createChat.getBody().setPermissionAll(EChatPermission.EveryoneDefault);
        createChat.getBody().setMembersMax(0);
        createChat.getBody().setChatFlags((byte) 1); // ?? Is this maybe EChatFlags?
        try {
            createChat.writeNullTermString("", Charset.forName("UTF8")); // ?? we need a \0
        } catch (final IOException e) {
            e.printStackTrace();
        }
        getClient().send(createChat);
    }

    /**
     * Attempts to leave a chat room.
     *
     * @param steamID The SteamID of the chat room.
     */
    public void leaveChat(SteamID steamID) {
        if (steamID == null) {
            throw new IllegalArgumentException("steamID is null");
        }

        SteamID chatID = fixChatID(steamID); // copy the steamid so we don't modify it

        ClientMsg<MsgClientChatMemberInfo> leaveChat = new ClientMsg<>(MsgClientChatMemberInfo.class);

        leaveChat.getBody().setSteamIdChat(chatID);
        leaveChat.getBody().setType(EChatInfoType.StateChange);

        try {
            leaveChat.write(client.getSteamID().convertToUInt64()); // ChatterActedOn
            leaveChat.write(EChatMemberStateChange.Left.code()); // StateChange
            leaveChat.write(client.getSteamID().convertToUInt64()); // ChatterActedBy
        } catch (IOException e) {
            DebugLog.printStackTrace("SteamChat", e);
        }

        client.send(leaveChat);
    }


    /**
     * Sends a message to a chat room.
     *
     * @param steamIdChat The SteamID of the chat room.
     * @param type        The message type.
     * @param message     The message.
     */
    public void sendChatRoomMessage(SteamID steamIdChat, EChatEntryType type, String message) {
        if (steamIdChat == null) {
            throw new IllegalArgumentException("steamIdChat is null");
        }

        if (type == null) {
            throw new IllegalArgumentException("type is null");
        }

        if (message == null) {
            throw new IllegalArgumentException("message is null");
        }

        SteamID chatID = fixChatID(steamIdChat); // copy the steamid so we don't modify it

        ClientMsg<MsgClientChatMsg> chatMsg = new ClientMsg<>(MsgClientChatMsg.class);

        chatMsg.getBody().setChatMsgType(type);
        chatMsg.getBody().setSteamIdChatRoom(chatID);
        chatMsg.getBody().setSteamIdChatter(client.getSteamID());

        try {
            chatMsg.writeNullTermString(message, Charset.forName("UTF-8"));
        } catch (IOException e) {
            DebugLog.printStackTrace("SteamChat", e);
        }

        client.send(chatMsg);
    }

    /**
     * Kicks the specified chat member from the given chat room.
     *
     * @param steamIdChat   The SteamID of chat room to kick the member from.
     * @param steamIdMember The SteamID of the member to kick from the chat.
     */
    public void kickChatMember(SteamID steamIdChat, SteamID steamIdMember) {
        if (steamIdChat == null) {
            throw new IllegalArgumentException("steamIdChat is null");
        }

        if (steamIdMember == null) {
            throw new IllegalArgumentException("steamIdMember is null");
        }

        SteamID chatID = fixChatID(steamIdChat); // copy the steamid so we don't modify it

        ClientMsg<MsgClientChatAction> kickMember = new ClientMsg<>(MsgClientChatAction.class);

        kickMember.getBody().setSteamIdChat(chatID);
        kickMember.getBody().setSteamIdUserToActOn(steamIdMember);

        kickMember.getBody().setChatAction(EChatAction.Kick);

        client.send(kickMember);
    }

    /**
     * Bans the specified chat member from the given chat room.
     *
     * @param steamIdChat   The SteamID of chat room to ban the member from.
     * @param steamIdMember The SteamID of the member to ban from the chat.
     */
    public void banChatMember(SteamID steamIdChat, SteamID steamIdMember) {
        if (steamIdChat == null) {
            throw new IllegalArgumentException("steamIdChat is null");
        }

        if (steamIdMember == null) {
            throw new IllegalArgumentException("steamIdMember is null");
        }

        SteamID chatID = fixChatID(steamIdChat); // copy the steamid so we don't modify it

        ClientMsg<MsgClientChatAction> kickMember = new ClientMsg<>(MsgClientChatAction.class);

        kickMember.getBody().setSteamIdChat(chatID);
        kickMember.getBody().setSteamIdUserToActOn(steamIdMember);

        kickMember.getBody().setChatAction(EChatAction.Ban);

        client.send(kickMember);
    }

    /**
     * Unbans the specified chat member from the given chat room.
     *
     * @param steamIdChat   The SteamID of chat room to unban the member from.
     * @param steamIdMember The SteamID of the member to unban from the chat.
     */
    public void unbanChatMember(SteamID steamIdChat, SteamID steamIdMember) {
        if (steamIdChat == null) {
            throw new IllegalArgumentException("steamIdChat is null");
        }

        if (steamIdMember == null) {
            throw new IllegalArgumentException("steamIdMember is null");
        }

        SteamID chatID = fixChatID(steamIdChat); // copy the steamid so we don't modify it

        ClientMsg<MsgClientChatAction> kickMember = new ClientMsg<>(MsgClientChatAction.class);

        kickMember.getBody().setSteamIdChat(chatID);
        kickMember.getBody().setSteamIdUserToActOn(steamIdMember);

        kickMember.getBody().setChatAction(EChatAction.UnBan);

        client.send(kickMember);
    }


    /**
     * Handles a client message. This should not be called directly.
     */
    @Override
    public void handleMsg(IPacketMsg packetMsg) {
        switch (packetMsg.getMsgType()) {
            case ClientChatEnter:
                handleChatEnter(packetMsg);
                break;

            case ClientChatMsg:
                handleChatMsg(packetMsg);
                break;

            case ClientChatMemberInfo:
                handleChatMemberInfo(packetMsg);
                break;

            case ClientChatActionResult:
                handleChatActionResult(packetMsg);
                break;

            case ClientChatInvite:
                handleChatInvite(packetMsg);
                break;

            case ClientCreateChatResponse:
                handleCreateChatResponse(packetMsg);
                break;
        }
    }

    private SteamID fixChatID(SteamID steamIdChat) {
        SteamID chatID = new SteamID(steamIdChat.convertToUInt64()); // copy the steamid so we don't modify it

        if (chatID.isClanAccount()) {
            // this steamid is incorrect, so we'll fix it up
            chatID.setAccountInstance(SteamID.ChatInstanceFlags.CLAN.code());
            chatID.setAccountType(EAccountType.Chat);
        }

        return chatID;
    }

    void handleChatEnter(IPacketMsg packetMsg) {
        final ClientMsg<MsgClientChatEnter> chatEnter = new ClientMsg<MsgClientChatEnter>(MsgClientChatEnter.class, packetMsg);
        byte[] payload = chatEnter.getPayload().toByteArray();
        final ChatEnterCallback callback = new ChatEnterCallback(chatEnter.getBody(), payload);
        getClient().postCallback(callback);
        // Add this chat to the list of chats
        if (callback.getEnterResponse() == EChatRoomEnterResponse.Success) {
            Chat newChat = new Chat();
            newChat.steamId = callback.getChatID();
            newChat.members = callback.getChatMembers();
            chats.add(newChat);
        }
    }

    void handleChatMsg(IPacketMsg packetMsg) {
        final ClientMsg<MsgClientChatMsg> chatMsg = new ClientMsg<MsgClientChatMsg>(MsgClientChatMsg.class, packetMsg);
        byte[] payload = chatMsg.getPayload().toByteArray();
        getClient().postCallback(new ChatMsgCallback(chatMsg.getBody(), payload));
    }

    void handleChatMemberInfo(IPacketMsg packetMsg) {
        final ClientMsg<MsgClientChatMemberInfo> membInfo = new ClientMsg<MsgClientChatMemberInfo>(MsgClientChatMemberInfo.class, packetMsg);
        byte[] payload = membInfo.getPayload().toByteArray();
        getClient().postCallback(new ChatMemberInfoCallback(membInfo.getBody(), payload));
    }

    void handleChatActionResult(IPacketMsg packetMsg) {
        final ClientMsg<MsgClientChatActionResult> actionResult = new ClientMsg<MsgClientChatActionResult>(MsgClientChatActionResult.class, packetMsg);
        getClient().postCallback(new ChatActionResultCallback(actionResult.getBody()));
    }

    void handleCreateChatResponse(IPacketMsg packetMsg) {
        final ClientMsg<MsgClientCreateChatResponse> actionResult = new ClientMsg<MsgClientCreateChatResponse>(MsgClientCreateChatResponse.class, packetMsg);
        final ChatCreateResponseCallback callback = new ChatCreateResponseCallback(actionResult.getBody());
        getClient().postCallback(new ChatCreateResponseCallback(actionResult.getBody()));
        if (callback.getResult() == EResult.OK) {
            joinChat(callback.getChatID());
        }
    }

    void handleChatInvite(IPacketMsg packetMsg) {
        final ClientMsgProtobuf<SteammessagesClientserver.CMsgClientChatInvite.Builder> chatInvite = new ClientMsgProtobuf<SteammessagesClientserver.CMsgClientChatInvite.Builder>(SteammessagesClientserver.CMsgClientChatInvite.class, packetMsg);
        final ChatInviteCallback callback = new ChatInviteCallback(chatInvite.getBody().build());
        getClient().postCallback(callback);
    }

    public List<Chat> getChats() {
        return this.chats;
    }
}
