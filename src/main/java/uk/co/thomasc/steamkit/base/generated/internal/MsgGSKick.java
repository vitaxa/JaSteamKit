package uk.co.thomasc.steamkit.base.generated.internal;

import uk.co.thomasc.steamkit.base.ISteamSerializableMessage;
import uk.co.thomasc.steamkit.base.generated.enums.EDenyReason;
import uk.co.thomasc.steamkit.base.generated.enums.EMsg;
import uk.co.thomasc.steamkit.types.SteamID;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MsgGSKick implements ISteamSerializableMessage {

    private long steamId = 0L;

    private EDenyReason denyReason = EDenyReason.from(0);

    private int waitTilMapChange = 0;

    @Override
    public EMsg getEMsg() {
        return EMsg.GSKick;
    }

    public SteamID getSteamId() {
        return new SteamID(this.steamId);
    }

    public void setSteamId(SteamID steamId) {
        this.steamId = steamId.convertToUInt64();
    }

    public EDenyReason getDenyReason() {
        return this.denyReason;
    }

    public void setDenyReason(EDenyReason denyReason) {
        this.denyReason = denyReason;
    }

    public int getWaitTilMapChange() {
        return this.waitTilMapChange;
    }

    public void setWaitTilMapChange(int waitTilMapChange) {
        this.waitTilMapChange = waitTilMapChange;
    }

    @Override
    public void serialize(OutputStream stream) throws IOException {
        BinaryWriter bw = new BinaryWriter(stream);

        bw.writeLong(steamId);
        bw.writeInt(denyReason.code());
        bw.writeInt(waitTilMapChange);
    }

    @Override
    public void deserialize(InputStream stream) throws IOException {
        BinaryReader br = new BinaryReader(stream);

        steamId = br.readLong();
        denyReason = EDenyReason.from(br.readInt());
        waitTilMapChange = br.readInt();
    }
}
