package uk.co.thomasc.steamkit.base;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface ISteamSerializable {

    void serialize(OutputStream stream) throws IOException;

    void deserialize(InputStream stream) throws IOException;
}
