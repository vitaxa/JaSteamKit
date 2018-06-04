package uk.co.thomasc.steamkit.base.generated.internal;

import uk.co.thomasc.steamkit.base.ISteamSerializableMessage;
import uk.co.thomasc.steamkit.base.generated.enums.EChatAction;
import uk.co.thomasc.steamkit.base.generated.enums.EMsg;
import uk.co.thomasc.steamkit.types.SteamID;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MsgClientChatAction implements ISteamSerializableMessage {

    private long steamIdChat = 0L;

    private long steamIdUserToActOn = 0L;

    private EChatAction chatAction = EChatAction.from(0);

    @Override
    public EMsg getEMsg() {
        return EMsg.ClientChatAction;
    }

    public SteamID getSteamIdChat() {
        return new SteamID(this.steamIdChat);
    }

    public void setSteamIdChat(SteamID steamId) {
        this.steamIdChat = steamId.convertToUInt64();
    }

    public SteamID getSteamIdUserToActOn() {
        return new SteamID(this.steamIdUserToActOn);
    }

    public void setSteamIdUserToActOn(SteamID steamId) {
        this.steamIdUserToActOn = steamId.convertToUInt64();
    }

    public EChatAction getChatAction() {
        return this.chatAction;
    }

    public void setChatAction(EChatAction chatAction) {
        this.chatAction = chatAction;
    }

    @Override
    public void serialize(OutputStream stream) throws IOException {
        BinaryWriter bw = new BinaryWriter(stream);

        bw.writeLong(steamIdChat);
        bw.writeLong(steamIdUserToActOn);
        bw.writeInt(chatAction.code());
    }

    @Override
    public void deserialize(InputStream stream) throws IOException {
        BinaryReader br = new BinaryReader(stream);

        steamIdChat = br.readLong();
        steamIdUserToActOn = br.readLong();
        chatAction = EChatAction.from(br.readInt());
    }
}
