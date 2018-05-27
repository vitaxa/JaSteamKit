package uk.co.thomasc.steamkit.base.generated.steamlanguageinternal;

import uk.co.thomasc.steamkit.base.generated.steamlanguage.EChatInfoType;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EMsg;
import uk.co.thomasc.steamkit.types.steamid.SteamID;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MsgClientChatMemberInfo implements ISteamSerializableMessage {

    private long steamIdChat = 0L;

    private EChatInfoType type = EChatInfoType.from(0);

    @Override
    public EMsg getEMsg() {
        return EMsg.ClientChatMemberInfo;
    }

    public SteamID getSteamIdChat() {
        return new SteamID(this.steamIdChat);
    }

    public void setSteamIdChat(SteamID steamId) {
        this.steamIdChat = steamId.convertToLong();
    }

    public EChatInfoType getType() {
        return this.type;
    }

    public void setType(EChatInfoType type) {
        this.type = type;
    }

    @Override
    public void serialize(OutputStream stream) throws IOException {
        BinaryWriter bw = new BinaryWriter(stream);

        bw.write(steamIdChat);
        bw.write(type.code());
    }

    @Override
    public void deserialize(InputStream stream) throws IOException {
        BinaryReader br = new BinaryReader(stream);

        steamIdChat = br.readLong();
        type = EChatInfoType.from(br.readInt());
    }
}
