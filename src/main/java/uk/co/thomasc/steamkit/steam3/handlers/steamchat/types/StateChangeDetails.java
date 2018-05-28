package uk.co.thomasc.steamkit.steam3.handlers.steamchat.types;

import uk.co.thomasc.steamkit.base.generated.steamlanguage.EChatMemberStateChange;
import uk.co.thomasc.steamkit.types.SteamID;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;

import java.io.ByteArrayInputStream;
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
