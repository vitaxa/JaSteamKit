package uk.co.thomasc.steamkit.base.generated.steamlanguageinternal;

import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.IOException;

public interface ISteamSerializable {
    void serialize(BinaryWriter stream) throws IOException;

    void deSerialize(BinaryReader stream) throws IOException;
}
