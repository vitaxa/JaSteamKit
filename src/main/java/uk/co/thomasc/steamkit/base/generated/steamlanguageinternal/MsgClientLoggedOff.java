package uk.co.thomasc.steamkit.base.generated.steamlanguageinternal;

import uk.co.thomasc.steamkit.base.generated.steamlanguage.EMsg;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EResult;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MsgClientLoggedOff implements ISteamSerializableMessage {

    private EResult result = EResult.from(0);

    private int secMinReconnectHint = 0;

    private int secMaxReconnectHint = 0;

    @Override
    public EMsg getEMsg() {
        return EMsg.ClientLoggedOff;
    }

    public EResult getResult() {
        return this.result;
    }

    public void setResult(EResult result) {
        this.result = result;
    }

    public int getSecMinReconnectHint() {
        return this.secMinReconnectHint;
    }

    public void setSecMinReconnectHint(int secMinReconnectHint) {
        this.secMinReconnectHint = secMinReconnectHint;
    }

    public int getSecMaxReconnectHint() {
        return this.secMaxReconnectHint;
    }

    public void setSecMaxReconnectHint(int secMaxReconnectHint) {
        this.secMaxReconnectHint = secMaxReconnectHint;
    }

    @Override
    public void serialize(OutputStream stream) throws IOException {
        BinaryWriter bw = new BinaryWriter(stream);

        bw.write(result.code());
        bw.write(secMinReconnectHint);
        bw.write(secMaxReconnectHint);
    }

    @Override
    public void deserialize(InputStream stream) throws IOException {
        BinaryReader br = new BinaryReader(stream);

        result = EResult.from(br.readInt());
        secMinReconnectHint = br.readInt();
        secMaxReconnectHint = br.readInt();
    }
}
