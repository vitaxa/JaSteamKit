package uk.co.thomasc.steamkit.steam3.steamclient;

import uk.co.thomasc.steamkit.base.generated.steamlanguage.EMsg;
import uk.co.thomasc.steamkit.base.generated.steamlanguageinternal.ISteamSerializable;
import uk.co.thomasc.steamkit.base.generated.steamlanguageinternal.ISteamSerializableMessage;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.IOException;

public class CMsgGroupInviteAction implements ISteamSerializableMessage, ISteamSerializable {

    /**
     * Group invited to.
     */
    public long groupID = 0;

    /**
     * To accept or decline the invite.
     */
    public boolean acceptInvite = true;

    @Override
    public EMsg getEMsg() {
        return EMsg.ClientAcknowledgeClanInvite;
    }

    @Override
    public void serialize(BinaryWriter stream) throws IOException {
        stream.write(groupID);
        stream.write(acceptInvite);
    }

    @Override
    public void deSerialize(BinaryReader stream) throws IOException {
        groupID = stream.readLong();
        acceptInvite = stream.readBoolean();
    }
}
