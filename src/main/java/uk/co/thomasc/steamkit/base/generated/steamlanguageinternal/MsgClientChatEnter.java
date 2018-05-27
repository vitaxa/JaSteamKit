package uk.co.thomasc.steamkit.base.generated.steamlanguageinternal;

import uk.co.thomasc.steamkit.base.generated.steamlanguage.EChatRoomEnterResponse;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EChatRoomType;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EMsg;
import uk.co.thomasc.steamkit.types.steamid.SteamID;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MsgClientChatEnter implements ISteamSerializableMessage {

    private long steamIdChat = 0L;

    private long steamIdFriend = 0L;

    private EChatRoomType chatRoomType = EChatRoomType.from(0);

    private long steamIdOwner = 0L;

    private long steamIdClan = 0L;

    private byte chatFlags = (byte) 0;

    private EChatRoomEnterResponse enterResponse = EChatRoomEnterResponse.from(0);

    private int numMembers = 0;

    @Override
    public EMsg getEMsg() {
        return EMsg.ClientChatEnter;
    }

    public SteamID getSteamIdChat() {
        return new SteamID(this.steamIdChat);
    }

    public void setSteamIdChat(SteamID steamId) {
        this.steamIdChat = steamId.convertToLong();
    }

    public SteamID getSteamIdFriend() {
        return new SteamID(this.steamIdFriend);
    }

    public void setSteamIdFriend(SteamID steamId) {
        this.steamIdFriend = steamId.convertToLong();
    }

    public EChatRoomType getChatRoomType() {
        return this.chatRoomType;
    }

    public void setChatRoomType(EChatRoomType chatRoomType) {
        this.chatRoomType = chatRoomType;
    }

    public SteamID getSteamIdOwner() {
        return new SteamID(this.steamIdOwner);
    }

    public void setSteamIdOwner(SteamID steamId) {
        this.steamIdOwner = steamId.convertToLong();
    }

    public SteamID getSteamIdClan() {
        return new SteamID(this.steamIdClan);
    }

    public void setSteamIdClan(SteamID steamId) {
        this.steamIdClan = steamId.convertToLong();
    }

    public byte getChatFlags() {
        return this.chatFlags;
    }

    public void setChatFlags(byte chatFlags) {
        this.chatFlags = chatFlags;
    }

    public EChatRoomEnterResponse getEnterResponse() {
        return this.enterResponse;
    }

    public void setEnterResponse(EChatRoomEnterResponse enterResponse) {
        this.enterResponse = enterResponse;
    }

    public int getNumMembers() {
        return this.numMembers;
    }

    public void setNumMembers(int numMembers) {
        this.numMembers = numMembers;
    }

    @Override
    public void serialize(OutputStream stream) throws IOException {
        BinaryWriter bw = new BinaryWriter(stream);

        bw.write(steamIdChat);
        bw.write(steamIdFriend);
        bw.write(chatRoomType.code());
        bw.write(steamIdOwner);
        bw.write(steamIdClan);
        bw.write(chatFlags);
        bw.write(enterResponse.code());
        bw.write(numMembers);
    }

    @Override
    public void deserialize(InputStream stream) throws IOException {
        BinaryReader br = new BinaryReader(stream);

        steamIdChat = br.readLong();
        steamIdFriend = br.readLong();
        chatRoomType = EChatRoomType.from(br.readInt());
        steamIdOwner = br.readLong();
        steamIdClan = br.readLong();
        chatFlags = br.readByte();
        enterResponse = EChatRoomEnterResponse.from(br.readInt());
        numMembers = br.readInt();
    }
}
