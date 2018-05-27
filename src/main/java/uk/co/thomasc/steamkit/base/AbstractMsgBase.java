package uk.co.thomasc.steamkit.base;

import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;
import uk.co.thomasc.steamkit.util.stream.MemoryStream;
import uk.co.thomasc.steamkit.util.stream.SeekOrigin;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * This class provides a payload backing to client messages.
 */
public abstract class AbstractMsgBase {
    protected MemoryStream payload;

    private final BinaryReader reader;

    private final BinaryWriter writer;

    /**
     * Initializes a new instance of the {@link AbstractMsgBase} class.
     */
    public AbstractMsgBase() {
        this(0);
    }

    /**
     * Initializes a new instance of the {@link AbstractMsgBase} class.
     *
     * @param payloadReserve The number of bytes to initialize the payload capacity to.
     */
    public AbstractMsgBase(int payloadReserve) {
        payload = new MemoryStream(payloadReserve);

        reader = new BinaryReader(payload);
        writer = new BinaryWriter(payload.asOutputStream());
    }

    public long seek(long offset, SeekOrigin seekOrigin) {
        return payload.seek(offset, seekOrigin);
    }

    public void write(byte data) throws IOException {
        writer.write(data);
    }

    public void write(short data) throws IOException {
        writer.write(data);
    }

    public void write(int data) throws IOException {
        writer.write(data);
    }

    public void write(long data) throws IOException {
        writer.write(data);
    }

    public void write(byte[] data) throws IOException {
        writer.write(data);
    }

    public void write(String data) throws IOException {
        write(data, Charset.defaultCharset());
    }

    public void write(String data, Charset charset) throws IOException {
        if (data == null) {
            return;
        }

        if (charset == null) {
            throw new IllegalArgumentException("charset is null");
        }

        write(data.getBytes(charset));
    }

    public void writeNullTermString(String data) throws IOException {
        writeNullTermString(data, Charset.defaultCharset());
    }

    public void writeNullTermString(String data, Charset charset) throws IOException {
        write(data, charset);
        write("\0", charset);
    }

    public byte readByte() throws IOException {
        return reader.readByte();
    }

    public byte[] readBytes(int numBytes) throws IOException {
        return reader.readBytes(numBytes);
    }

    public short readShort() throws IOException {
        return reader.readShort();
    }

    public int readInt() throws IOException {
        return reader.readInt();
    }

    public long readLong() throws IOException {
        return reader.readLong();
    }

    public float readFloat() throws IOException {
        return reader.readFloat();
    }

    public String readNullTermString() throws IOException {
        return reader.readNullTermString();
    }

    public MemoryStream getPayload() {
        return payload;
    }
}
