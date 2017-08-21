package uk.co.thomasc.steamkit.steam3.steamclient;

import uk.co.thomasc.steamkit.base.generated.steamlanguage.EMsg;
import uk.co.thomasc.steamkit.base.generated.steamlanguageinternal.ISteamSerializable;
import uk.co.thomasc.steamkit.base.generated.steamlanguageinternal.ISteamSerializableMessage;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.IOException;

public class CMsgInviteUserToGroup implements ISteamSerializableMessage, ISteamSerializable {

    /**
     * Who is being invited.
     */
    public long invitee = 0;

    /**
     * Group to invite to
     */
    public long groupID = 0;

    /**
     * Not known yet. All data seen shows this as being true.
     * See what happens if its false?
     */
    public boolean unknownInfo = true;

    @Override
    public EMsg getEMsg() {
        return null;
    }

    @Override
    public void serialize(BinaryWriter stream) throws IOException {
        stream.write(invitee);
        stream.write(groupID);
        stream.write(unknownInfo);
    }

    @Override
    public void deSerialize(BinaryReader stream) throws IOException {
        invitee = stream.readLong();
        groupID = stream.readLong();
        unknownInfo = stream.readBoolean();
    }
}
