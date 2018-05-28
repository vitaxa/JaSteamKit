package uk.co.thomasc.steamkit.base.generated.steamlanguageinternal;

import uk.co.thomasc.steamkit.base.ISteamSerializableHeader;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EMsg;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MsgHdr implements ISteamSerializableHeader {

    private EMsg msg = EMsg.Invalid;

    private long targetJobID = 0xFFFFFFFFFFFFFFFFL;

    private long sourceJobID = 0xFFFFFFFFFFFFFFFFL;

    @Override
    public void setEMsg(EMsg msg) {
        this.msg = msg;
    }

    public EMsg getMsg() {
        return this.msg;
    }

    public void setMsg(EMsg msg) {
        this.msg = msg;
    }

    public long getTargetJobID() {
        return this.targetJobID;
    }

    public void setTargetJobID(long targetJobID) {
        this.targetJobID = targetJobID;
    }

    public long getSourceJobID() {
        return this.sourceJobID;
    }

    public void setSourceJobID(long sourceJobID) {
        this.sourceJobID = sourceJobID;
    }

    @Override
    public void serialize(OutputStream stream) throws IOException {
        BinaryWriter bw = new BinaryWriter(stream);

        bw.writeInt(msg.code());
        bw.writeLong(targetJobID);
        bw.writeLong(sourceJobID);
    }

    @Override
    public void deserialize(InputStream stream) throws IOException {
        BinaryReader br = new BinaryReader(stream);

        msg = EMsg.from(br.readInt());
        targetJobID = br.readLong();
        sourceJobID = br.readLong();
    }
}
