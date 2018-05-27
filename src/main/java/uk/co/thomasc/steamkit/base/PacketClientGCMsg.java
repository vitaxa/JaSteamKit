package uk.co.thomasc.steamkit.base;

import uk.co.thomasc.steamkit.base.gc.IPacketGCMsg;
import uk.co.thomasc.steamkit.base.generated.steamlanguageinternal.MsgGCHdr;
import uk.co.thomasc.steamkit.types.JobID;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * Represents a packet message with extended header information.
 */
public final class PacketClientGCMsg implements IPacketGCMsg {
    /**
     * Gets a value indicating whether this packet message is protobuf backed.
     * This type of message is never protobuf backed.
     */
    @Override
    public boolean isProto() {
        return false;
    }

    /**
     * Gets the network message type of this packet message.
     */
    private final int msgType;
    /**
     * Gets the target job id for this packet message.
     */
    private JobID targetJobID;
    /**
     * Gets the source job id for this packet message.
     */
    private JobID sourceJobID;
    byte[] payload;

    /**
     * Initializes a new instance of the {@link PacketClientGCMsg} class.
     *
     * @param eMsg The network message type for this packet message.
     * @param data The data.
     */
    public PacketClientGCMsg(int eMsg, byte[] data) {
        if (data == null) {
            throw new IllegalArgumentException("data is null");
        }

        msgType = eMsg;
        payload = data;

        MsgGCHdr gcHdr = new MsgGCHdr();

        // we need to pull out the job ids, so we deserialize the protobuf header
        try (ByteArrayInputStream bais = new ByteArrayInputStream(data)) {
            gcHdr.deserialize(bais);
        } catch (IOException ignored) {
        }

        targetJobID = new JobID(gcHdr.getTargetJobID());
        sourceJobID = new JobID(gcHdr.getSourceJobID());
    }

    /**
     * Gets the underlying data that represents this packet message.
     *
     * @return The data.
     */
    @Override
    public byte[] getData() {
        return payload;
    }

    /**
     * Gets the network message type of this packet message.
     */
    public int msgType() {
        return this.msgType;
    }

    /**
     * Gets the target job id for this packet message.
     */
    public JobID getTargetJobID() {
        return this.targetJobID;
    }

    /**
     * Gets the target job id for this packet message.
     */
    public void setTargetJobID(final JobID targetJobID) {
        this.targetJobID = targetJobID;
    }

    /**
     * Gets the source job id for this packet message.
     */
    public JobID getSourceJobID() {
        return this.sourceJobID;
    }

    /**
     * Gets the source job id for this packet message.
     */
    public void setSourceJobID(final JobID sourceJobID) {
        this.sourceJobID = sourceJobID;
    }
}
