package uk.co.thomasc.steamkit.steam3.handlers.steamfriends.callback;

import uk.co.thomasc.steamkit.base.generated.enums.EChatInfoType;
import uk.co.thomasc.steamkit.base.generated.enums.EChatMemberStateChange;
import uk.co.thomasc.steamkit.base.generated.internal.MsgClientChatMemberInfo;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.types.ChatMemberInfo;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.SteamID;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.EnumSet;

/**
 * This callback is fired in response to chat member info being recieved.
 */
public class ChatMemberInfoCallback extends CallbackMsg {
    private SteamID chatRoomID;

    private EChatInfoType type;

    private StateChangeDetails stateChangeInfo;

    public ChatMemberInfoCallback(MsgClientChatMemberInfo msg, byte[] payload) {
        chatRoomID = msg.getSteamIdChat();
        type = msg.getType();

        switch (type) {
            case StateChange:
                stateChangeInfo = new StateChangeDetails(payload);
                break;
            // todo: handle more types
            // based off disassembly
            //   - for InfoUpdate, a ChatMemberInfo object is present
            //   - for MemberLimitChange, looks like an ignored uint64 (probably steamid) followed
            //     by an int which likely represents the member limit
        }
    }

    public SteamID getChatRoomID() {
        return chatRoomID;
    }

    public EChatInfoType getType() {
        return type;
    }

    public StateChangeDetails getStateChangeInfo() {
        return stateChangeInfo;
    }

    /**
     * Represents state change information.
     */
    public static class StateChangeDetails {
        private SteamID chatterActedOn;

        private EnumSet<EChatMemberStateChange> stateChange;

        private SteamID chatterActedBy;

        private ChatMemberInfo memberInfo;

        public StateChangeDetails(byte[] data) {
            try (BinaryReader br = new BinaryReader(new ByteArrayInputStream(data))) {
                chatterActedOn = new SteamID(br.readLong());
                stateChange = EChatMemberStateChange.from(br.readInt());
                chatterActedBy = new SteamID(br.readLong());

                if (stateChange.contains(EChatMemberStateChange.Entered)) {
                    memberInfo = new ChatMemberInfo();
                    memberInfo.readFromStream(br);
                }
            } catch (IOException ignored) {
            }
        }

        public SteamID getChatterActedOn() {
            return chatterActedOn;
        }

        public EnumSet<EChatMemberStateChange> getStateChange() {
            return stateChange;
        }

        public SteamID getChatterActedBy() {
            return chatterActedBy;
        }

        public ChatMemberInfo getMemberInfo() {
            return memberInfo;
        }
    }
}
