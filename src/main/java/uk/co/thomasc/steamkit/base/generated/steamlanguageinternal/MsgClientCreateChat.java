package uk.co.thomasc.steamkit.base.generated.steamlanguageinternal;

import uk.co.thomasc.steamkit.base.generated.steamlanguage.EChatPermission;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EChatRoomType;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EMsg;
import uk.co.thomasc.steamkit.types.gameid.GameID;
import uk.co.thomasc.steamkit.types.steamid.SteamID;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.EnumSet;

public class MsgClientCreateChat implements ISteamSerializableMessage {

    private EChatRoomType chatRoomType = EChatRoomType.from(0);

    private long gameId = 0L;

    private long steamIdClan = 0L;

    private EnumSet<EChatPermission> permissionOfficer = EChatPermission.from(0);

    private EnumSet<EChatPermission> permissionMember = EChatPermission.from(0);

    private EnumSet<EChatPermission> permissionAll = EChatPermission.from(0);

    private int membersMax = 0;

    private byte chatFlags = (byte) 0;

    private long steamIdFriendChat = 0L;

    private long steamIdInvited = 0L;

    @Override
    public EMsg getEMsg() {
        return EMsg.ClientCreateChat;
    }

    public EChatRoomType getChatRoomType() {
        return this.chatRoomType;
    }

    public void setChatRoomType(EChatRoomType chatRoomType) {
        this.chatRoomType = chatRoomType;
    }

    public GameID getGameId() {
        return new GameID(this.gameId);
    }

    public void setGameId(GameID gameId) {
        this.gameId = gameId.toLong();
    }

    public SteamID getSteamIdClan() {
        return new SteamID(this.steamIdClan);
    }

    public void setSteamIdClan(SteamID steamId) {
        this.steamIdClan = steamId.convertToLong();
    }

    public EnumSet<EChatPermission> getPermissionOfficer() {
        return this.permissionOfficer;
    }

    public void setPermissionOfficer(EnumSet<EChatPermission> permissionOfficer) {
        this.permissionOfficer = permissionOfficer;
    }

    public EnumSet<EChatPermission> getPermissionMember() {
        return this.permissionMember;
    }

    public void setPermissionMember(EnumSet<EChatPermission> permissionMember) {
        this.permissionMember = permissionMember;
    }

    public EnumSet<EChatPermission> getPermissionAll() {
        return this.permissionAll;
    }

    public void setPermissionAll(EnumSet<EChatPermission> permissionAll) {
        this.permissionAll = permissionAll;
    }

    public int getMembersMax() {
        return this.membersMax;
    }

    public void setMembersMax(int membersMax) {
        this.membersMax = membersMax;
    }

    public byte getChatFlags() {
        return this.chatFlags;
    }

    public void setChatFlags(byte chatFlags) {
        this.chatFlags = chatFlags;
    }

    public SteamID getSteamIdFriendChat() {
        return new SteamID(this.steamIdFriendChat);
    }

    public void setSteamIdFriendChat(SteamID steamId) {
        this.steamIdFriendChat = steamId.convertToLong();
    }

    public SteamID getSteamIdInvited() {
        return new SteamID(this.steamIdInvited);
    }

    public void setSteamIdInvited(SteamID steamId) {
        this.steamIdInvited = steamId.convertToLong();
    }

    @Override
    public void serialize(OutputStream stream) throws IOException {
        BinaryWriter bw = new BinaryWriter(stream);

        bw.write(chatRoomType.code());
        bw.write(gameId);
        bw.write(steamIdClan);
        bw.write(EChatPermission.code(permissionOfficer));
        bw.write(EChatPermission.code(permissionMember));
        bw.write(EChatPermission.code(permissionAll));
        bw.write(membersMax);
        bw.write(chatFlags);
        bw.write(steamIdFriendChat);
        bw.write(steamIdInvited);
    }

    @Override
    public void deserialize(InputStream stream) throws IOException {
        BinaryReader br = new BinaryReader(stream);

        chatRoomType = EChatRoomType.from(br.readInt());
        gameId = br.readLong();
        steamIdClan = br.readLong();
        permissionOfficer = EChatPermission.from(br.readInt());
        permissionMember = EChatPermission.from(br.readInt());
        permissionAll = EChatPermission.from(br.readInt());
        membersMax = br.readInt();
        chatFlags = br.readByte();
        steamIdFriendChat = br.readLong();
        steamIdInvited = br.readLong();
    }
}
