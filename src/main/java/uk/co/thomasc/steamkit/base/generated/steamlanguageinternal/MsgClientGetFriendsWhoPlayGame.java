package uk.co.thomasc.steamkit.base.generated.steamlanguageinternal;

import uk.co.thomasc.steamkit.base.ISteamSerializableMessage;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EMsg;
import uk.co.thomasc.steamkit.types.GameID;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MsgClientGetFriendsWhoPlayGame implements ISteamSerializableMessage {

    private long gameId = 0L;

    @Override
    public EMsg getEMsg() {
        return EMsg.ClientGetFriendsWhoPlayGame;
    }

    public GameID getGameId() {
        return new GameID(this.gameId);
    }

    public void setGameId(GameID gameId) {
        this.gameId = gameId.toUInt64();
    }

    @Override
    public void serialize(OutputStream stream) throws IOException {
        BinaryWriter bw = new BinaryWriter(stream);

        bw.writeLong(gameId);
    }

    @Override
    public void deserialize(InputStream stream) throws IOException {
        BinaryReader br = new BinaryReader(stream);

        gameId = br.readLong();
    }
}
