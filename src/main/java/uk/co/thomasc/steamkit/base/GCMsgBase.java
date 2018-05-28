package uk.co.thomasc.steamkit.base;

import uk.co.thomasc.steamkit.util.logging.DebugLog;

/**
 * This is the abstract base class for all available game coordinator messages.
 * It's used to maintain packet payloads and provide a header for all gc messages.
 *
 * @param <T> The header type for this gc message.
 */
public abstract class GCMsgBase<T extends IGCSerializableHeader> extends AbstractMsgBase implements IClientGCMsg {

    private T header;

    /**
     * Initializes a new instance of the {@link GCMsgBase} class.
     *
     * @param clazz the type of the header
     */
    public GCMsgBase(Class<T> clazz) {
        this(clazz, 0);
    }

    /**
     * Initializes a new instance of the {@link GCMsgBase} class.
     *
     * @param clazz          the type of the header
     * @param payloadReserve The number of bytes to initialize the payload capacity to.
     */
    public GCMsgBase(Class<T> clazz, int payloadReserve) {
        super(payloadReserve);
        try {
            header = clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            DebugLog.printStackTrace("GCMsgBase", e);
        }
    }

    /**
     * @return the header for this message type.
     */
    public T getHeader() {
        return header;
    }
}
