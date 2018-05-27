package uk.co.thomasc.steamkit.base.generated.steamlanguageinternal;

import uk.co.thomasc.steamkit.base.generated.steamlanguage.EMsg;
import uk.co.thomasc.steamkit.types.steamid.SteamID;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MsgClientSetIgnoreFriend implements ISteamSerializableMessage {

    private long mySteamId = 0L;

    private long steamIdFriend = 0L;

    private byte ignore = (byte) 0;

    @Override
    public EMsg getEMsg() {
        return EMsg.ClientSetIgnoreFriend;
    }

    public SteamID getMySteamId() {
        return new SteamID(this.mySteamId);
    }

    public void setMySteamId(SteamID steamId) {
        this.mySteamId = steamId.convertToLong();
    }

    public SteamID getSteamIdFriend() {
        return new SteamID(this.steamIdFriend);
    }

    public void setSteamIdFriend(SteamID steamId) {
        this.steamIdFriend = steamId.convertToLong();
    }

    public byte getIgnore() {
        return this.ignore;
    }

    public void setIgnore(byte ignore) {
        this.ignore = ignore;
    }

    @Override
    public void serialize(OutputStream stream) throws IOException {
        BinaryWriter bw = new BinaryWriter(stream);

        bw.write(mySteamId);
        bw.write(steamIdFriend);
        bw.write(ignore);
    }

    @Override
    public void deserialize(InputStream stream) throws IOException {
        BinaryReader br = new BinaryReader(stream);

        mySteamId = br.readLong();
        steamIdFriend = br.readLong();
        ignore = br.readByte();
    }
}
