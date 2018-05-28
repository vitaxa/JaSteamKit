package uk.co.thomasc.steamkit.base.generated.steamlanguageinternal;

import uk.co.thomasc.steamkit.base.ISteamSerializableMessage;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EMsg;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EUniverse;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MsgChannelEncryptRequest implements ISteamSerializableMessage {

    public static final int PROTOCOL_VERSION = 1;

    private int protocolVersion = MsgChannelEncryptRequest.PROTOCOL_VERSION;

    private EUniverse universe = EUniverse.Invalid;

    @Override
    public EMsg getEMsg() {
        return EMsg.ChannelEncryptRequest;
    }

    public int getProtocolVersion() {
        return this.protocolVersion;
    }

    public void setProtocolVersion(int protocolVersion) {
        this.protocolVersion = protocolVersion;
    }

    public EUniverse getUniverse() {
        return this.universe;
    }

    public void setUniverse(EUniverse universe) {
        this.universe = universe;
    }

    @Override
    public void serialize(OutputStream stream) throws IOException {
        BinaryWriter bw = new BinaryWriter(stream);

        bw.write(protocolVersion);
        bw.write(universe.code());
    }

    @Override
    public void deserialize(InputStream stream) throws IOException {
        BinaryReader br = new BinaryReader(stream);

        protocolVersion = br.readInt();
        universe = EUniverse.from(br.readInt());
    }
}
