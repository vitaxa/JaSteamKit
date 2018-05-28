package uk.co.thomasc.steamkit.base;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.GeneratedMessageV3;
import uk.co.thomasc.steamkit.base.generated.SteammessagesBase;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EMsg;
import uk.co.thomasc.steamkit.base.generated.steamlanguageinternal.MsgHdrProtoBuf;
import uk.co.thomasc.steamkit.types.JobID;
import uk.co.thomasc.steamkit.types.steamid.SteamID;
import uk.co.thomasc.steamkit.util.logging.Debug;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.SeekOrigin;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Represents a protobuf backed client message.
 *
 * @param <U> The builder for T
 */
public final class ClientMsgProtobuf<U extends GeneratedMessageV3.Builder<U>> extends MsgBase<MsgHdrProtoBuf> {
    /**
     * Client messages of this type are always protobuf backed.
     */
    @Override
    public boolean isProto() {
        return true;
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
        return getProtoHeader().getClientSessionid();
    }

    /**
     * Sets the session id for this client message.
     */
    @Override
    public void setSessionID(int sessionID) {
        getProtoHeader().setClientSessionid(sessionID);
    }

    /**
     * Gets the {@link SteamID} for this client message.
     */
    @Override
    public SteamID getSteamID() {
        return new SteamID(getProtoHeader().getSteamid());
    }

    /**
     * Sets the {@link SteamID} for this client message.
     */
    @Override
    public void setSteamID(SteamID steamID) {
        getProtoHeader().setSteamid(steamID.convertToUInt64());
    }

    /**
     * Gets or sets the target job id for this client message.
     */
    @Override
    public JobID getTargetJobID() {
        return new JobID(getProtoHeader().getJobidTarget());
    }

    /**
     * Sets the target job id for this client message.
     */
    @Override
    public void setTargetJobID(JobID JobID) {
        getProtoHeader().setJobidTarget(JobID.getValue());
    }

    /**
     * Gets or sets the target job id for this client message.
     */
    @Override
    public JobID getSourceJobID() {
        return new JobID(getProtoHeader().getJobidSource());
    }

    /**
     * Sets the target job id for this client message.
     */
    @Override
    public void setSourceJobID(JobID JobID) {
        getProtoHeader().setJobidSource(JobID.getValue());
    }

    /**
     * Shorthand accessor for the protobuf header.
     */
    public SteammessagesBase.CMsgProtoBufHeader.Builder getProtoHeader() {
        return getHeader().getProto();
    }

    /**
     * Gets the body structure of this message.
     */
    private U body;
    private Class<? extends AbstractMessage> clazz;

    public ClientMsgProtobuf(Class<? extends AbstractMessage> clazz, EMsg eMsg) {
        this(clazz, eMsg, 64);
    }

    /**
     * Initializes a new instance of the {@link ClientMsgProtobuf} class. This
     * is a client send constructor.
     *
     * @param eMsg           The network message type this client message represents.
     * @param clazz          The class of T
     * @param payloadReserve The number of bytes to initialize the payload capacity to.
     */
    @SuppressWarnings("unchecked")
    public ClientMsgProtobuf(Class<? extends AbstractMessage> clazz, EMsg eMsg, int payloadReserve) {
        super(MsgHdrProtoBuf.class, payloadReserve);

        this.clazz = clazz;

        try {
            final Method m = clazz.getMethod("newBuilder");
            body = (U) m.invoke(null);
        } catch (IllegalAccessException | NoSuchMethodException | SecurityException | IllegalArgumentException | InvocationTargetException e) {
            e.printStackTrace();
        }

        // set our emsg
        getHeader().setMsg(eMsg);
    }

    public ClientMsgProtobuf(Class<? extends AbstractMessage> clazz, EMsg eMsg, MsgBase<MsgHdrProtoBuf> msg) {
        this(clazz, eMsg, msg, 64);
    }

    /**
     * Initializes a new instance of the {@link ClientMsgProtobuf} class.
     * This a reply constructor.
     * @param eMsg				The network message type this client message represents.
     * @param msg				The message that this instance is a reply for.
     * @param payloadReserve	The number of bytes to initialize the payload capacity to.
     */
    public ClientMsgProtobuf(Class<? extends AbstractMessage> clazz, EMsg eMsg, MsgBase<MsgHdrProtoBuf> msg, int payloadReserve) {
        this(clazz, eMsg, payloadReserve);
        // our target is where the message came from
        getHeader().getProto().setJobidTarget(msg.getHeader().getProto().getJobidSource());
    }

    /**
     * Initializes a new instance of the {@link ClientMsgProtobuf} class.
     * This is a recieve constructor.
     * @param msg	The packet message to build this client message from.
     */
    public ClientMsgProtobuf(Class<? extends AbstractMessage> clazz, IPacketMsg msg) {
        this(clazz, msg.getMsgType());

        Debug.Assert(msg.isProto(), "ClientMsgProtobuf used for non-proto message!");

        deserialize(msg.getData());
    }

    /**
     * serializes this client message instance to a byte array.
     * @throws IOException
     */
    @Override
    public byte[] serialize() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream(0);

        try {
            getHeader().serialize(baos);
            baos.write(body.build().toByteArray());
            baos.write(payload.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return baos.toByteArray();
    }

    /**
     * Initializes this client message by deserializing the specified data.
     * @throws IOException
     */
    @SuppressWarnings("unchecked")
    @Override
    public void deserialize(byte[] data) {
        if (data == null) {
            throw new IllegalArgumentException("data is null");
        }
        BinaryReader ms = new BinaryReader(new ByteArrayInputStream(data));

        try {
            getHeader().deserialize(ms);
            final Method m = clazz.getMethod("newBuilder");
            body = (U) m.invoke(null);
            body.mergeFrom(ms);
            payload.write(data, ms.getPosition(), ms.available());
            payload.seek(0, SeekOrigin.BEGIN);
        } catch (IOException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    /**
     * Gets the body structure of this message.
     */
    public U getBody() {
        return this.body;
    }
}
