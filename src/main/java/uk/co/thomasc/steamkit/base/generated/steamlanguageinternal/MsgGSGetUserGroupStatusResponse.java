package uk.co.thomasc.steamkit.base.generated.steamlanguageinternal;

import uk.co.thomasc.steamkit.base.ISteamSerializableMessage;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EClanRank;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EClanRelationship;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EMsg;
import uk.co.thomasc.steamkit.types.SteamID;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MsgGSGetUserGroupStatusResponse implements ISteamSerializableMessage {

    private long steamIdUser = 0L;

    private long steamIdGroup = 0L;

    private EClanRelationship clanRelationship = EClanRelationship.from(0);

    private EClanRank clanRank = EClanRank.from(0);

    @Override
    public EMsg getEMsg() {
        return EMsg.GSGetUserGroupStatusResponse;
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

    public EClanRelationship getClanRelationship() {
        return this.clanRelationship;
    }

    public void setClanRelationship(EClanRelationship clanRelationship) {
        this.clanRelationship = clanRelationship;
    }

    public EClanRank getClanRank() {
        return this.clanRank;
    }

    public void setClanRank(EClanRank clanRank) {
        this.clanRank = clanRank;
    }

    @Override
    public void serialize(OutputStream stream) throws IOException {
        BinaryWriter bw = new BinaryWriter(stream);

        bw.writeLong(steamIdUser);
        bw.writeLong(steamIdGroup);
        bw.writeInt(clanRelationship.code());
        bw.writeInt(clanRank.code());
    }

    @Override
    public void deserialize(InputStream stream) throws IOException {
        BinaryReader br = new BinaryReader(stream);

        steamIdUser = br.readLong();
        steamIdGroup = br.readLong();
        clanRelationship = EClanRelationship.from(br.readInt());
        clanRank = EClanRank.from(br.readInt());
    }
}
