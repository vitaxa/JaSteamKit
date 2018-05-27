package uk.co.thomasc.steamkit.base.generated.steamlanguageinternal;

import uk.co.thomasc.steamkit.base.generated.steamlanguage.EChatRoomType;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EMsg;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EResult;
import uk.co.thomasc.steamkit.types.steamid.SteamID;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MsgClientCreateChatResponse implements ISteamSerializableMessage {

    private EResult result = EResult.from(0);

    private long steamIdChat = 0L;

    private EChatRoomType chatRoomType = EChatRoomType.from(0);

    private long steamIdFriendChat = 0L;

    @Override
    public EMsg getEMsg() {
        return EMsg.ClientCreateChatResponse;
    }

    public EResult getResult() {
        return this.result;
    }

    public void setResult(EResult result) {
        this.result = result;
    }

    public SteamID getSteamIdChat() {
        return new SteamID(this.steamIdChat);
    }

    public void setSteamIdChat(SteamID steamId) {
        this.steamIdChat = steamId.convertToLong();
    }

    public EChatRoomType getChatRoomType() {
        return this.chatRoomType;
    }

    public void setChatRoomType(EChatRoomType chatRoomType) {
        this.chatRoomType = chatRoomType;
    }

    public SteamID getSteamIdFriendChat() {
        return new SteamID(this.steamIdFriendChat);
    }

    public void setSteamIdFriendChat(SteamID steamId) {
        this.steamIdFriendChat = steamId.convertToLong();
    }

    @Override
    public void serialize(OutputStream stream) throws IOException {
        BinaryWriter bw = new BinaryWriter(stream);

        bw.write(result.code());
        bw.write(steamIdChat);
        bw.write(chatRoomType.code());
        bw.write(steamIdFriendChat);
    }

    @Override
    public void deserialize(InputStream stream) throws IOException {
        BinaryReader br = new BinaryReader(stream);

        result = EResult.from(br.readInt());
        steamIdChat = br.readLong();
        chatRoomType = EChatRoomType.from(br.readInt());
        steamIdFriendChat = br.readLong();
    }
}
