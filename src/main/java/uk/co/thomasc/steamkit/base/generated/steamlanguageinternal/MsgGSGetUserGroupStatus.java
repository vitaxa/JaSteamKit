package uk.co.thomasc.steamkit.base.generated.steamlanguageinternal;

import uk.co.thomasc.steamkit.base.ISteamSerializableMessage;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EMsg;
import uk.co.thomasc.steamkit.types.SteamID;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MsgGSGetUserGroupStatus implements ISteamSerializableMessage {

    private long steamIdUser = 0L;

    private long steamIdGroup = 0L;

    @Override
    public EMsg getEMsg() {
        return EMsg.GSGetUserGroupStatus;
    }

    public SteamID getSteamIdUser() {
        return new SteamID(this.steamIdUser);
    }

    public void setSteamIdUser(SteamID steamId) {
        this.steamIdUser = steamId.convertToUInt64();
    }

    public SteamID getSteamIdGroup() {
        return new SteamID(this.steamIdGroup);
    }

    public void setSteamIdGroup(SteamID steamId) {
        this.steamIdGroup = steamId.convertToUInt64();
    }

    @Override
    public void serialize(OutputStream stream) throws IOException {
        BinaryWriter bw = new BinaryWriter(stream);

        bw.writeLong(steamIdUser);
        bw.writeLong(steamIdGroup);
    }

    @Override
    public void deserialize(InputStream stream) throws IOException {
        BinaryReader br = new BinaryReader(stream);

        steamIdUser = br.readLong();
        steamIdGroup = br.readLong();
    }
}
