package uk.co.thomasc.steamkit.base.generated.steamlanguageinternal;

import uk.co.thomasc.steamkit.base.ISteamSerializableMessage;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EMsg;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MsgClientVACBanStatus implements ISteamSerializableMessage {

    private int numBans = 0;

    @Override
    public EMsg getEMsg() {
        return EMsg.ClientVACBanStatus;
    }

    public int getNumBans() {
        return this.numBans;
    }

    public void setNumBans(int numBans) {
        this.numBans = numBans;
    }

    @Override
    public void serialize(OutputStream stream) throws IOException {
        BinaryWriter bw = new BinaryWriter(stream);

        bw.write(numBans);
    }

    @Override
    public void deserialize(InputStream stream) throws IOException {
        BinaryReader br = new BinaryReader(stream);

        numBans = br.readInt();
    }
}
