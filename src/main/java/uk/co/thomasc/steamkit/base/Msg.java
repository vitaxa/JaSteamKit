package uk.co.thomasc.steamkit.base;

import uk.co.thomasc.steamkit.base.generated.steamlanguage.EMsg;
import uk.co.thomasc.steamkit.base.generated.steamlanguageinternal.ISteamSerializableMessage;
import uk.co.thomasc.steamkit.base.generated.steamlanguageinternal.MsgHdr;
import uk.co.thomasc.steamkit.types.JobID;
import uk.co.thomasc.steamkit.types.steamid.SteamID;
import uk.co.thomasc.steamkit.util.stream.MemoryStream;
import uk.co.thomasc.steamkit.util.stream.SeekOrigin;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public final class Msg<T extends ISteamSerializableMessage> extends MsgBase<MsgHdr> {
    /**
     * Gets a value indicating whether this client message is protobuf backed.
     */
    @Override
    public boolean isProto() {
        return false;
    }

    /**
     * Gets the network message type of this client message.
     */
    @Override
    public EMsg getMsgType() {
        return getHeader().getMsg();
    }

    /**
     * Gets the session id for this client message.
     */
    @Override
    public int getSessionID() {
        return sessionID;
    }

    /**
     * Sets the session id for this client message.
     */
    @Override
    public void setSessionID(int sessionID) {
        this.sessionID = sessionID;
    }

    /**
     * Gets the {@link SteamID} for this client message.
     */
    @Override
    public SteamID getSteamID() {
        return steamID;
    }

    /**
     * Sets the {@link SteamID} for this client message.
     */
    @Override
    public void setSteamID(SteamID steamID) {
        this.steamID = steamID;
    }

    /**
     * Gets or sets the target job id for this client message.
     */
    @Override
    public JobID getTargetJobID() {
        return targetJobID;
    }

    /**
     * Sets the target job id for this client message.
     */
    @Override
    public void setTargetJobID(JobID jobID) {
        targetJobID = jobID;
    }

    /**
     * Gets or sets the target job id for this client message.
     */
    @Override
    public JobID getSourceJobID() {
        return sourceJobID;
    }

    /**
     * Sets the target job id for this client message.
     */
    @Override
    public void setSourceJobID(JobID jobID) {
        sourceJobID = jobID;
    }

    /**
     * The structure body of the message.
     */
    private T body;

    public Msg(Class<T> clazz) {
        this(clazz, 0);
    }

    /**
     * Initializes a new instance of the {@link Msg} class. This is a client
     * send constructor.
     *
     * @param payloadReserve The number of bytes to initialize the payload capacity to.
     */
    public Msg(Class<T> clazz, int payloadReserve) {
        super(MsgHdr.class, payloadReserve);
        try {
            body = clazz.newInstance();
        } catch (final InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        // assign our emsg
        getHeader().setMsg(body.getEMsg());
    }

    /**
     * Initializes a new instance of the {@link Msg} class. This a reply
     * constructor.
     *
     * @param msg            The message that this instance is a reply for.
     * @param payloadReserve The number of bytes to initialize the payload capacity to.
     */
    public Msg(MsgBase<MsgHdr> msg, Class<T> clazz, int payloadReserve) {
        this(clazz, payloadReserve);
        // our target is where the message came from
        getHeader().setTargetJobID(msg.getHeader().getSourceJobID());
    }

    /**
     * Initializes a new instance of the {@link Msg} class. This is a recieve
     * constructor.
     *
     * @param msg The packet message to build this client message from.
     */
    public Msg(IPacketMsg msg, Class<T> clazz) {
        this(clazz);
        deserialize(msg.getData());
    }

    /**
     * serializes this client message instance to a byte array.
     *
     * @throws IOException
     */
    @Override
    public byte[] serialize() {
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
     * Initializes this client message by deserializing the specified data.
     *
     * @throws IOException
     */
    @Override
    public void deserialize(byte[] data) {
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
     * The structure body of the message.
     */
    public T getBody() {
        return this.body;
    }
}
