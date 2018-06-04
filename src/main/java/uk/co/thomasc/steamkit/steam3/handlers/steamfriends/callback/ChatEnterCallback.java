package uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callback;

import uk.co.thomasc.steamkit.base.generated.enums.EChatRoomEnterResponse;
import uk.co.thomasc.steamkit.base.generated.enums.EChatRoomType;
import uk.co.thomasc.steamkit.base.generated.internal.MsgClientChatEnter;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.types.ChatMemberInfo;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.SteamID;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This callback is fired in response to attempting to join a chat.
 */
public class ChatEnterCallback extends CallbackMsg {
    private SteamID chatID;

    private SteamID friendID;

    private EChatRoomType chatRoomType;

    private SteamID ownerID;

    private SteamID clanID;

    private byte chatFlags;

    private EChatRoomEnterResponse enterResponse;

    private int numChatMembers;

    private String chatRoomName;

    private List<ChatMemberInfo> chatMembers;

    public ChatEnterCallback(MsgClientChatEnter msg, byte[] payload) {
        chatID = msg.getSteamIdChat();
        friendID = msg.getSteamIdFriend();

        chatRoomType = msg.getChatRoomType();

        ownerID = msg.getSteamIdOwner();
        clanID = msg.getSteamIdClan();

        chatFlags = msg.getChatFlags();

        enterResponse = msg.getEnterResponse();

        numChatMembers = msg.getNumMembers();

        ByteArrayInputStream bais = new ByteArrayInputStream(payload);

        try (BinaryReader br = new BinaryReader(bais)) {
            // steamclient always attempts to read the chat room name, regardless of the enter response
            chatRoomName = br.readNullTermString(Charset.forName("UTF-8"));

            if (enterResponse != EChatRoomEnterResponse.Success) {
                // the rest of the payload depends on a successful chat enter
                return;
            }

            List<ChatMemberInfo> memberList = new ArrayList<>();

            for (int i = 0; i < numChatMembers; i++) {
                ChatMemberInfo memberInfo = new ChatMemberInfo();
                memberInfo.readFromStream(br);

                memberList.add(memberInfo);
            }

            chatMembers = Collections.unmodifiableList(memberList);
        } catch (IOException ignored) {
        }
    }

    public SteamID getChatID() {
        return chatID;
    }

    public SteamID getFriendID() {
        return friendID;
    }

    public EChatRoomType getChatRoomType() {
        return chatRoomType;
    }

    public SteamID getOwnerID() {
        return ownerID;
    }

    public SteamID getClanID() {
        return clanID;
    }

    public byte getChatFlags() {
        return chatFlags;
    }

    public EChatRoomEnterResponse getEnterResponse() {
        return enterResponse;
    }

    public int getNumChatMembers() {
        return numChatMembers;
    }

    public String getChatRoomName() {
        return chatRoomName;
    }

    public List<ChatMemberInfo> getChatMembers() {
        return chatMembers;
    }
}
