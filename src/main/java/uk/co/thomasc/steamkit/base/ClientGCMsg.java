package uk.co.thomasc.steamkit.base;

import uk.co.thomasc.steamkit.base.generated.enums.EMsg;
import uk.co.thomasc.steamkit.base.generated.internal.MsgGCHdr;
import uk.co.thomasc.steamkit.types.JobID;
import uk.co.thomasc.steamkit.util.logging.DebugLog;
import uk.co.thomasc.steamkit.util.stream.MemoryStream;
import uk.co.thomasc.steamkit.util.stream.SeekOrigin;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Represents a struct backed game coordinator message.
 *
 * @param <T> The body type of this message.
 */
public class ClientGCMsg<T extends IGCSerializableMessage> extends GCMsgBase<MsgGCHdr> {

    private int msgType;

    private T body;

    /**
     * Initializes a new instance of the {@link ClientGCMsg} class.
     *
     * @param bodyType body type
     */
    public ClientGCMsg(Class<? extends T> bodyType) {
        this(bodyType, 64);
    }

    /**
     * Initializes a new instance of the {@link ClientGCMsg} class.
     *
     * @param bodyType       body type
     * @param payloadReserve The number of bytes to initialize the payload capacity to.
     */
    public ClientGCMsg(Class<? extends T> bodyType, int payloadReserve) {
        super(MsgGCHdr.class, payloadReserve);

        try {
            body = bodyType.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            DebugLog.printStackTrace("ClientGCMsg", e);
        }

        msgType = body.getEMsg();
    }

    /**
     * Initializes a new instance of the {@link ClientGCMsg} class.
     * This a reply constructor.
     *
     * @param bodyType body type
     * @param msg      The message that this instance is a reply for.
     */
    public ClientGCMsg(Class<? extends T> bodyType, GCMsgBase<MsgGCHdr> msg) {
        this(bodyType, msg, 64);
    }

    /**
     * Initializes a new instance of the {@link ClientGCMsg} class.
     * This a reply constructor.
     *
     * @param bodyType       body type
     * @param msg            The message that this instance is a reply for.
     * @param payloadReserve The number of bytes to initialize the payload capacity to.
     */
    public ClientGCMsg(Class<? extends T> bodyType, GCMsgBase<MsgGCHdr> msg, int payloadReserve) {
        this(bodyType, payloadReserve);

        if (msg == null) {
            throw new IllegalArgumentException("msg is null");
        }

        // our target is where the message came from
        getHeader().setTargetJobID(msg.getHeader().getSourceJobID());
    }

    /**
     * Initializes a new instance of the {@link ClientGCMsg} class.
     * This a receive constructor.
     *
     * @param bodyType body type
     * @param msg      The packet message to build this client message from.
     */
    public ClientGCMsg(Class<? extends T> bodyType, IPacketGCMsg msg) {
        this(bodyType);

        if (msg == null) {
            throw new IllegalArgumentException("msg is null");
        }

        if (msg.isProto()) {
            DebugLog.writeLine("ClientGCMsg", "ClientMsg<" + bodyType.getName() + "> used for proto message!");
        }

        deserialize(msg.getData());
    }

    @Override
    public boolean isProto() {
        return false;
    }

    @Override
    public EMsg getMsgType() {
        return EMsg.from(msgType);
    }

    @Override
    public JobID getTargetJobID() {
        return new JobID(getHeader().getTargetJobID());
    }

    @Override
    public void setTargetJobID(JobID jobID) {
        if (jobID == null) {
            throw new IllegalArgumentException("jobID is null");
        }
        getHeader().setTargetJobID(jobID.getValue());
    }

    @Override
    public JobID getSourceJobID() {
        return new JobID(getHeader().getSourceJobID());
    }

    @Override
    public void setSourceJobID(JobID jobID) {
        if (jobID == null) {
            throw new IllegalArgumentException("jobID is null");
        }
        getHeader().setSourceJobID(jobID.getValue());
    }

    @Override
    public byte[] serialize() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream(0);

        try {
            getHeader().serialize(baos);
            body.serialize(baos);
            baos.write(payload.toByteArray());
        } catch (IOException e) {
            DebugLog.printStackTrace("ClientGCMsg", e);
        }

        return baos.toByteArray();
    }

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
            DebugLog.printStackTrace("ClientGCMsg", e);
        }

        payload.write(data, (int) ms.getPosition(), ms.available());
        payload.seek(0, SeekOrigin.BEGIN);
    }
}
