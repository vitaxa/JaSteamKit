package uk.co.thomasc.steamkit.base;

import uk.co.thomasc.steamkit.util.logging.DebugLog;

/**
 * This is the abstract base class for all available client messages.
 * It's used to maintain packet payloads and provide a header for all client messages.
 */
public abstract class MsgBase<T extends ISteamSerializable> extends AbstractMsgBase implements IClientMsg {

    private T header;

    /**
     * Initializes a new instance of the {@link MsgBase} class.
     *
     * @param clazz the type of the header
     */
    public MsgBase(Class<T> clazz) {
        this(clazz, 0);
    }

    /**
     * Initializes a new instance of the {@link MsgBase} class.
     *
     * @param clazz          the type of the header
     * @param payloadReserve The number of bytes to initialize the payload capacity to.
     */
    public MsgBase(Class<T> clazz, int payloadReserve) {
        super(payloadReserve);
        try {
            header = clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            DebugLog.printStackTrace("MsgBase", e);
        }
    }

    /**
     * @return the header for this message type.
     */
    public T getHeader() {
        return header;
    }
}
