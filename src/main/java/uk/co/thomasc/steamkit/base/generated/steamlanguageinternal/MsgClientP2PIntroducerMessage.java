package uk.co.thomasc.steamkit.base.generated.steamlanguageinternal;

import uk.co.thomasc.steamkit.base.generated.steamlanguage.EIntroducerRouting;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EMsg;
import uk.co.thomasc.steamkit.types.steamid.SteamID;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MsgClientP2PIntroducerMessage implements ISteamSerializableMessage {

    private long steamID = 0L;

    private EIntroducerRouting routingType = EIntroducerRouting.from(0);

    private byte[] data = new byte[1450];

    private int dataLen = 0;

    @Override
    public EMsg getEMsg() {
        return EMsg.ClientP2PIntroducerMessage;
    }

    public SteamID getSteamID() {
        return new SteamID(this.steamID);
    }

    public void setSteamID(SteamID steamId) {
        this.steamID = steamId.convertToLong();
    }

    public EIntroducerRouting getRoutingType() {
        return this.routingType;
    }

    public void setRoutingType(EIntroducerRouting routingType) {
        this.routingType = routingType;
    }

    public byte[] getData() {
        return this.data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public int getDataLen() {
        return this.dataLen;
    }

    public void setDataLen(int dataLen) {
        this.dataLen = dataLen;
    }

    @Override
    public void serialize(OutputStream stream) throws IOException {
        BinaryWriter bw = new BinaryWriter(stream);

        bw.write(steamID);
        bw.write(routingType.code());
        bw.write(data.length);
        bw.write(data);
        bw.write(dataLen);
    }

    @Override
    public void deserialize(InputStream stream) throws IOException {
        BinaryReader br = new BinaryReader(stream);

        steamID = br.readLong();
        routingType = EIntroducerRouting.from(br.readInt());
        data = br.readBytes(br.readInt());
        dataLen = br.readInt();
    }
}
