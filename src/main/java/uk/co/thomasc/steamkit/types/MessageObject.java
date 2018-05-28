package uk.co.thomasc.steamkit.types;

import uk.co.thomasc.steamkit.types.keyvalue.KeyValue;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;

import java.io.IOException;

public class MessageObject {
    protected KeyValue keyValues;

    public MessageObject() {
        this.keyValues = new KeyValue("MessageObject");
    }

    public MessageObject(KeyValue keyValues) {
        this.keyValues = keyValues;
    }

    public boolean readFromBinary(BinaryReader input) {
        if (keyValues == null) {
            return false;
        }
        try {
            return keyValues.readAsBinary(input);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Populates this MessageObject instance from the data inside the given stream.
     *
     * @param stream The stream to load data from.
     * @return <b>true</b> on success; otherwise, <b>false</b>.
     * @throws IOException IO exception during reading from the stream
     */
    public boolean readFromStream(BinaryReader stream) throws IOException {
        if (stream == null) {
            throw new IllegalArgumentException("stream is null");
        }

        return keyValues.readAsBinary(stream);
    }

    public KeyValue getKeyValues() {
        return this.keyValues;
    }
}
