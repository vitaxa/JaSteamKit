package uk.co.thomasc.steamkit.base.gc;

import uk.co.thomasc.steamkit.base.generated.steamlanguageinternal.IGCSerializableMessage;
import uk.co.thomasc.steamkit.base.generated.steamlanguageinternal.MsgGCHdr;
import uk.co.thomasc.steamkit.types.JobID;
import uk.co.thomasc.steamkit.util.logging.Debug;
import uk.co.thomasc.steamkit.util.stream.MemoryStream;
import uk.co.thomasc.steamkit.util.stream.SeekOrigin;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Represents a struct backed game coordinator message.
 *
 * @param <T> The body type of this message.
 */
public final class ClientGCMsg<T extends IGCSerializableMessage> extends GCMsgBase<MsgGCHdr> {
    /**
     * Gets a value indicating whether this gc message is protobuf backed.
     *
     * @return true if this instance is protobuf backed; otherwise, false.
     */
    @Override
    public boolean isProto() {
        return false;
    }

    int msgType;

    /**
     * Gets the network message type of this gc message.
     *
     * @return The network message type.
     */
    @Override
    public int getMsgType() {
        return msgType;
    }

    /**
     * Gets the target job id for this gc message.
     *
     * @return The target job id
     */
    @Override
    public JobID getTargetJobID() {
        return new JobID(getHeader().getTargetJobID());
    }

    /**
     * Sets the target job id for this gc message.
     *
     * @param value The target job id
     */
    @Override
    public void setTargetJobID(JobID value) {
        getHeader().setTargetJobID(value.getValue());
    }

    /**
     * Gets the source job id for this gc message.
     *
     * @return The source job id
     */
    @Override
    public JobID getSourceJobID() {
        return new JobID(getHeader().getSourceJobID());
    }

    /**
     * Sets the source job id for this gc message.
     *
     * @param value The source job id
     */
    @Override
    public void setSourceJobID(JobID value) {
        getHeader().setSourceJobID(value.getValue());
    }

    /**
     * Gets the body structure of this message.
     */
    private T body;

    /**
     * Initializes a new instance of the {@link ClientGCMsg} class. This is a
     * client send constructor.
     *
     * @param payloadReserve The number of bytes to initialize the payload capacity to.
     */
    public ClientGCMsg(Class<T> clazz, int payloadReserve) {
        super(MsgGCHdr.class, payloadReserve);
        try {
            body = clazz.newInstance();
        } catch (final InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        // assign our emsg
        msgType = body.getEMsg();
    }

    public ClientGCMsg(Class<T> clazz) {
        this(clazz, 64);
    }

    /**
     * Initializes a new instance of the {@link ClientGCMsg} class. This a reply
     * constructor.
     *
     * @param msg            The message that this instance is a reply for.
     * @param payloadReserve The number of bytes to initialize the payload capacity to.
     */
    public ClientGCMsg(Class<T> clazz, GCMsgBase<MsgGCHdr> msg, int payloadReserve) {
        this(clazz, payloadReserve);
        // our target is where the message came from
        getHeader().setTargetJobID(msg.getHeader().getSourceJobID());
    }

    public ClientGCMsg(Class<T> clazz, GCMsgBase<MsgGCHdr> msg) {
        this(clazz, msg, 64);
    }

    /**
     * Initializes a new instance of the {@link ClientGCMsg} class. This is a
     * recieve constructor.
     *
     * @param msg The packet message to build this gc message from.
     */
    public ClientGCMsg(Class<T> clazz, IPacketGCMsg msg) {
        this(clazz);
        Debug.Assert(!msg.isProto(), "ClientGCMsg used for proto message!");
        try {
            deserialize(msg.getData());
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Serializes this gc message instance to a byte array.
     *
     * @return Data representing a client message.
     */
    @Override
    public byte[] serialize() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream(0);

        try {
            getHeader().serialize(baos);
            body.serialize(baos);
            baos.write(payload.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return baos.toByteArray();
    }

    /**
     * Initializes this gc message by deserializing the specified data.
     *
     * @param data The data representing a client message.
     */
    @Override
    public void deserialize(byte[] data) throws IOException {
        if (data == null) {
            throw new IllegalArgumentException("data is null");
        }
        MemoryStream ms = new MemoryStream(data);

        try {
            getHeader().deserialize(ms);
            body.deserialize(ms);
        } catch (IOException e) {
            e.printStackTrace();
        }

        payload.write(data, (int) ms.getPosition(), ms.available());
        payload.seek(0, SeekOrigin.BEGIN);
    }

    public static byte[] copyOfRange(byte[] from, int start, int end) {
        int length = end - start;
        byte[] result = new byte[length];
        System.arraycopy(from, start, result, 0, length);
        return result;
    }

    /**
     * Gets the body structure of this message.
     */
    public T getBody() {
        return this.body;
    }
}
