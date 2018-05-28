package uk.co.thomasc.steamkit.base;

import uk.co.thomasc.steamkit.base.generated.steamlanguage.EMsg;
import uk.co.thomasc.steamkit.base.generated.steamlanguageinternal.ExtendedClientMsgHdr;
import uk.co.thomasc.steamkit.base.generated.steamlanguageinternal.ISteamSerializableMessage;
import uk.co.thomasc.steamkit.types.JobID;
import uk.co.thomasc.steamkit.types.steamid.SteamID;
import uk.co.thomasc.steamkit.util.logging.Debug;
import uk.co.thomasc.steamkit.util.stream.MemoryStream;
import uk.co.thomasc.steamkit.util.stream.SeekOrigin;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Represents a struct backed client message.
 *
 * @param <T> The body type of this message.
 */
public final class ClientMsg<T extends ISteamSerializableMessage> extends MsgBase<ExtendedClientMsgHdr> {
    /**
     * Gets a value indicating whether this client message is protobuf backed.
     */
    @Override
    public boolean isProto() {
        return false;
    }

    @Override
    public EMsg getMsgType() {
        return getHeader().getMsg();
    }

    /**
     * Gets the session id for this client message.
     */
    @Override
    public int getSessionID() {
        return getHeader().getSessionID();
    }

    /**
     * Sets the session id for this client message.
     */
    @Override
    public void setSessionID(int sessionID) {
        getHeader().setSessionID(sessionID);
    }

    /**
     * Gets the {@link SteamID} for this client message.
     */
    @Override
    public SteamID getSteamID() {
        return getHeader().getSteamID();
    }

    /**
     * Sets the {@link SteamID} for this client message.
     */
    @Override
    public void setSteamID(SteamID steamID) {
        getHeader().setSteamID(steamID);
    }

    /**
     * Gets or sets the target job id for this client message.
     */
    @Override
    public JobID getTargetJobID() {
        return new JobID(getHeader().getTargetJobID());
    }

    /**
     * Sets the target job id for this client message.
     */
    @Override
    public void setTargetJobID(JobID jobID) {
        getHeader().setTargetJobID(jobID.getValue());
    }

    /**
     * Gets or sets the target job id for this client message.
     */
    @Override
    public JobID getSourceJobID() {
        return new JobID(getHeader().getSourceJobID());
    }

    /**
     * Sets the target job id for this client message.
     */
    @Override
    public void setSourceJobID(JobID jobID) {
        getHeader().setSourceJobID(jobID.getValue());
    }

    /**
     * Gets the body structure of this message.
     */
    private T body;

    public ClientMsg(Class<T> clazz) {
        this(clazz, 64);
    }

    /**
     * Initializes a new instance of the {@link ClientMsg} class. This is a
     * client send constructor.
     *
     * @param payloadReserve The number of bytes to initialize the payload capacity to.
     */
    public ClientMsg(Class<T> clazz, int payloadReserve) {
        super(ExtendedClientMsgHdr.class, payloadReserve);
        try {
            body = clazz.newInstance();
        } catch (final InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        // assign our emsg
        getHeader().setMsg(body.getEMsg());
    }

    public ClientMsg(Class<T> clazz, MsgBase<ExtendedClientMsgHdr> msg) {
        this(clazz, msg, 64);
    }

    /**
     * Initializes a new instance of the {@link ClientMsg} class. This a reply
     * constructor.
     *
     * @param msg            The message that this instance is a reply for.
     * @param payloadReserve The number of bytes to initialize the payload capacity to.
     */
    public ClientMsg(Class<T> clazz, MsgBase<ExtendedClientMsgHdr> msg, int payloadReserve) {
        this(clazz, payloadReserve);
        // our target is where the message came from
        getHeader().setTargetJobID(msg.getHeader().getSourceJobID());
    }

    /**
     * Initializes a new instance of the {@link ClientMsg} class. This is a
     * recieve constructor.
     *
     * @param msg The packet message to build this client message from.
     */
    public ClientMsg(IPacketMsg msg, Class<T> clazz) {
        this(clazz);
        Debug.Assert(!msg.isProto(), "ClientMsg used for proto message!");
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
     * Gets the body structure of this message.
     */
    public T getBody() {
        return this.body;
    }
}
