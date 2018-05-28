package uk.co.thomasc.steamkit.base.generated.steamlanguageinternal;

import uk.co.thomasc.steamkit.base.ISteamSerializableMessage;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EAppUsageEvent;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EMsg;
import uk.co.thomasc.steamkit.types.GameID;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MsgClientAppUsageEvent implements ISteamSerializableMessage {

    private EAppUsageEvent appUsageEvent = EAppUsageEvent.from(0);

    private long gameID = 0L;

    private short offline = (short) 0;

    @Override
    public EMsg getEMsg() {
        return EMsg.ClientAppUsageEvent;
    }

    public EAppUsageEvent getAppUsageEvent() {
        return this.appUsageEvent;
    }

    public void setAppUsageEvent(EAppUsageEvent appUsageEvent) {
        this.appUsageEvent = appUsageEvent;
    }

    public GameID getGameID() {
        return new GameID(this.gameID);
    }

    public void setGameID(GameID gameId) {
        this.gameID = gameId.toUInt64();
    }

    public short getOffline() {
        return this.offline;
    }

    public void setOffline(short offline) {
        this.offline = offline;
    }

    @Override
    public void serialize(OutputStream stream) throws IOException {
        BinaryWriter bw = new BinaryWriter(stream);

        bw.writeInt(appUsageEvent.code());
        bw.writeLong(gameID);
        bw.writeShort(offline);
    }

    @Override
    public void deserialize(InputStream stream) throws IOException {
        BinaryReader br = new BinaryReader(stream);

        appUsageEvent = EAppUsageEvent.from(br.readInt());
        gameID = br.readLong();
        offline = br.readShort();
    }
}
