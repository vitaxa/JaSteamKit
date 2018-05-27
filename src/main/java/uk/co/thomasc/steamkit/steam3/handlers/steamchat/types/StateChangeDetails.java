package uk.co.thomasc.steamkit.steam3.handlers.steamchat.types;

import uk.co.thomasc.steamkit.base.generated.steamlanguage.EChatMemberStateChange;
import uk.co.thomasc.steamkit.types.steamid.SteamID;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;

import java.io.IOException;
import java.util.EnumSet;

/**
 * Represents state change information.
 */
public final class StateChangeDetails {
    /**
     * Gets the SteamID of the chatter that was acted on.
     */
    private SteamID chatterActedOn;
    /**
     * Gets the state change for the acted on SteamID.
     */
    private EnumSet<EChatMemberStateChange> stateChange;
    /**
     * Gets the SteamID of the chatter that acted on {@link #chatterActedOn}.
     */
    private SteamID chatterActedBy;
    /**
     * Gets the member information for a user that has joined the chat room.
     * This field is only populated when StateChange is EChatMemberStateChange.Entered
     */
    private ChatMemberInfo memberInfo;

    public StateChangeDetails(byte[] data) {
        final BinaryReader is = new BinaryReader(data);
        try {
            chatterActedOn = new SteamID(is.readLong());
            stateChange = EChatMemberStateChange.from(is.readInt());
            chatterActedBy = new SteamID(is.readLong());
            if (stateChange.contains(EChatMemberStateChange.Entered)) {
                memberInfo = new ChatMemberInfo();
                memberInfo.readFromBinary(is);
            }
        } catch (final IOException e) {
            e.printStackTrace();
        }
        // based off disassembly
        //  - for InfoUpdate, a ChatMemberInfo object is present
        //  - for MemberLimitChange, looks like an ignored uint64 (probably steamid) followed
        //     by an int which likely represents the member limit
    }

    /**
     * Gets the SteamID of the chatter that was acted on.
     */
    public SteamID getChatterActedOn() {
        return this.chatterActedOn;
    }

    /**
     * Gets the state change for the acted on SteamID.
     */
    public EnumSet<EChatMemberStateChange> getStateChange() {
        return stateChange;
    }

    /**
     * Gets the SteamID of the chatter that acted on {@link #chatterActedOn}.
     */
    public SteamID getChatterActedBy() {
        return this.chatterActedBy;
    }

    /**
     * Gets the member information for a user that has joined the chat room.
     * This field is only populated when StateChange is EChatMemberStateChange.Entered
     */
    public ChatMemberInfo getMemberInfo() {
        return this.memberInfo;
    }
}
