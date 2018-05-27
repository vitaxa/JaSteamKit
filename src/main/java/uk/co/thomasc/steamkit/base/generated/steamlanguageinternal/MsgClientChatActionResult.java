package uk.co.thomasc.steamkit.base.generated.steamlanguageinternal;

import uk.co.thomasc.steamkit.base.generated.steamlanguage.EChatAction;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EChatActionResult;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EMsg;
import uk.co.thomasc.steamkit.types.steamid.SteamID;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MsgClientChatActionResult implements ISteamSerializableMessage {

    private long steamIdChat = 0L;

    private long steamIdUserActedOn = 0L;

    private EChatAction chatAction = EChatAction.from(0);

    private EChatActionResult actionResult = EChatActionResult.from(0);

    @Override
    public EMsg getEMsg() {
        return EMsg.ClientChatActionResult;
    }

    public SteamID getSteamIdChat() {
        return new SteamID(this.steamIdChat);
    }

    public void setSteamIdChat(SteamID steamId) {
        this.steamIdChat = steamId.convertToLong();
    }

    public SteamID getSteamIdUserActedOn() {
        return new SteamID(this.steamIdUserActedOn);
    }

    public void setSteamIdUserActedOn(SteamID steamId) {
        this.steamIdUserActedOn = steamId.convertToLong();
    }

    public EChatAction getChatAction() {
        return this.chatAction;
    }

    public void setChatAction(EChatAction chatAction) {
        this.chatAction = chatAction;
    }

    public EChatActionResult getActionResult() {
        return this.actionResult;
    }

    public void setActionResult(EChatActionResult actionResult) {
        this.actionResult = actionResult;
    }

    @Override
    public void serialize(OutputStream stream) throws IOException {
        BinaryWriter bw = new BinaryWriter(stream);

        bw.write(steamIdChat);
        bw.write(steamIdUserActedOn);
        bw.write(chatAction.code());
        bw.write(actionResult.code());
    }

    @Override
    public void deserialize(InputStream stream) throws IOException {
        BinaryReader br = new BinaryReader(stream);

        steamIdChat = br.readLong();
        steamIdUserActedOn = br.readLong();
        chatAction = EChatAction.from(br.readInt());
        actionResult = EChatActionResult.from(br.readInt());
    }
}
