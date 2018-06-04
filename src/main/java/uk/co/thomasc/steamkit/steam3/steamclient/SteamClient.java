package uk.co.thomasc.steamkit.steam3.steamclient;

import uk.co.thomasc.steamkit.base.ClientMsgProtobuf;
import uk.co.thomasc.steamkit.base.IPacketMsg;
import uk.co.thomasc.steamkit.base.generated.enums.EMsg;
import uk.co.thomasc.steamkit.steam3.CMClient;
import uk.co.thomasc.steamkit.steam3.handlers.ClientMsgHandler;
import uk.co.thomasc.steamkit.steam3.handlers.steamapps.SteamApps;
import uk.co.thomasc.steamkit.steam3.handlers.steamcloud.SteamCloud;
import uk.co.thomasc.steamkit.steam3.handlers.steamfriends.SteamFriends;
import uk.co.thomasc.steamkit.steam3.handlers.steamgamecoordinator.SteamGameCoordinator;
import uk.co.thomasc.steamkit.steam3.handlers.steamgameserver.SteamGameServer;
import uk.co.thomasc.steamkit.steam3.handlers.steammasterserver.SteamMasterServer;
import uk.co.thomasc.steamkit.steam3.handlers.steamnotifications.SteamNotifications;
import uk.co.thomasc.steamkit.steam3.handlers.steamscreenshots.SteamScreenshots;
import uk.co.thomasc.steamkit.steam3.handlers.steamtrading.SteamTrading;
import uk.co.thomasc.steamkit.steam3.handlers.steamuser.SteamUser;
import uk.co.thomasc.steamkit.steam3.handlers.steamuserstats.SteamUserStats;
import uk.co.thomasc.steamkit.steam3.handlers.steamworkshop.SteamWorkshop;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.ICallbackMsg;
import uk.co.thomasc.steamkit.steam3.steamclient.callbacks.CMListCallback;
import uk.co.thomasc.steamkit.steam3.steamclient.callbacks.ConnectedCallback;
import uk.co.thomasc.steamkit.steam3.steamclient.callbacks.DisconnectedCallback;
import uk.co.thomasc.steamkit.steam3.steamclient.callbacks.ServerListCallback;
import uk.co.thomasc.steamkit.steam3.steamclient.configuration.SteamConfiguration;
import uk.co.thomasc.steamkit.types.JobID;
import uk.co.thomasc.steamkit.util.logging.DebugLog;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;

import static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver.CMsgClientCMList;
import static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver.CMsgClientServerList;

/**
 * Represents a single client that connects to the Steam3 network.
 * This class is also responsible for handling the registration of client message handlers and callbacks.
 */
public class SteamClient extends CMClient {

    private Map<Class<? extends ClientMsgHandler>, ClientMsgHandler> handlers = new HashMap<>();

    private AtomicLong currentJobId = new AtomicLong(0L);

    private Date processStartTime;

    private final Object callbackLock = new Object();

    private Queue<ICallbackMsg> callbackQueue = new LinkedList<>();

    private Map<EMsg, Consumer<IPacketMsg>> dispatchMap = new HashMap<>();

    /**
     * Initializes a new instance of the {@link SteamClient} class with the default configuration.
     */
    public SteamClient() {
        this(SteamConfiguration.createDefault());
    }

    /**
     * Initializes a new instance of the {@link SteamClient} class with a specific configuration.
     *
     * @param configuration The configuration to use for this client.
     */
    public SteamClient(SteamConfiguration configuration) {
        super(configuration);

        // add this library's handlers
        // notice: SteamFriends should be added before SteamUser due to AccountInfoCallback
        addHandler(new SteamFriends());
        addHandler(new SteamUser());
        addHandler(new SteamNotifications());
        addHandler(new SteamTrading());
        addHandler(new SteamApps());
        addHandler(new SteamCloud());
        addHandler(new SteamScreenshots());
        addHandler(new SteamUserStats());
        addHandler(new SteamWorkshop());
        addHandler(new SteamMasterServer());
        addHandler(new SteamGameServer());
        addHandler(new SteamGameCoordinator());

        processStartTime = new Date();

        dispatchMap.put(EMsg.ClientCMList, this::handleCMList);
        dispatchMap.put(EMsg.ClientServerList, this::handleServerList);
        dispatchMap.put(EMsg.JobHeartbeat, this::handleJobHeartbeat);
        dispatchMap.put(EMsg.DestJobFailed, this::handleJobFailed);
    }

    /**
     * Adds a new handler to the internal list of message handlers.
     *
     * @param handler The handler to add.
     */
    public void addHandler(ClientMsgHandler handler) {
        if (handlers.containsKey(handler.getClass())) {
            throw new IllegalArgumentException("A handler of type " + handler.getClass() + " is already registered.");
        }

        handler.setup(this);
        handlers.put(handler.getClass(), handler);
    }

    /**
     * Removes a registered handler by name.
     *
     * @param handler The handler name to remove.
     */
    public void removeHandler(Class<? extends ClientMsgHandler> handler) {
        handlers.remove(handler);
    }

    /**
     * Removes a registered handler.
     *
     * @param handler The handler name to remove.
     */
    public void removeHandler(ClientMsgHandler handler) {
        removeHandler(handler.getClass());
    }

    /**
     * Returns a registered handler.
     *
     * @param type The type of the handler to cast to. Must derive from ClientMsgHandler.
     * @param <T>  The type of the handler to cast to. Must derive from ClientMsgHandler.
     * @return A registered handler on success, or null if the handler could not be found.
     */
    @SuppressWarnings("unchecked")
    public <T extends ClientMsgHandler> T getHandler(Class<T> type) {
        return (T) handlers.get(type);
    }

    /**
     * Gets the next callback object in the queue.
     * This function does not dequeue the callback, you must call FreeLastCallback after processing it.
     *
     * @return The next callback in the queue, or null if no callback is waiting.
     */
    public ICallbackMsg getCallback() {
        return getCallback(false);
    }

    /**
     * Gets the next callback object in the queue, and optionally frees it.
     *
     * @param freeLast if set to <b>true</b> this function also frees the last callback if one existed.
     * @return The next callback in the queue, or null if no callback is waiting.
     */
    public ICallbackMsg getCallback(boolean freeLast) {
        synchronized (callbackLock) {
            if (!callbackQueue.isEmpty()) {
                return freeLast ? callbackQueue.poll() : callbackQueue.peek();
            }
        }

        return null;
    }

    /**
     * Blocks the calling thread until a callback object is posted to the queue.
     * This function does not dequeue the callback, you must call FreeLastCallback after processing it.
     *
     * @return The callback object from the queue.
     */
    public ICallbackMsg waitForCallback() {
        return waitForCallback(false);
    }

    /**
     * Blocks the calling thread until a callback object is posted to the queue, or null after the timeout has elapsed.
     * This function does not dequeue the callback, you must call FreeLastCallback after processing it.
     *
     * @param timeout The length of time to block in ms.
     * @return A callback object from the queue if a callback has been posted, or null if the timeout has elapsed.
     */
    public ICallbackMsg waitForCallback(long timeout) {
        synchronized (callbackLock) {
            if (callbackQueue.isEmpty()) {
                try {
                    callbackLock.wait(timeout);
                } catch (final InterruptedException e) {
                    DebugLog.printStackTrace("SteamClient", e);
                }

                if (callbackQueue.isEmpty()) {
                    return null;
                }
            }

            return callbackQueue.peek();
        }
    }

    /**
     * Blocks the calling thread until a callback object is posted to the queue, and optionally frees it.
     *
     * @param freeLast if set to <b>true</b> this function also frees the last callback if one existed.
     * @return The callback object from the queue.
     */
    public ICallbackMsg waitForCallback(boolean freeLast) {
        synchronized (callbackLock) {
            if (callbackQueue.isEmpty()) {
                try {
                    callbackLock.wait();
                } catch (final InterruptedException e) {
                    DebugLog.printStackTrace("SteamClient", e);
                }

                if (callbackQueue.isEmpty()) {
                    return null;
                }
            }

            return freeLast ? callbackQueue.poll() : callbackQueue.peek();
        }
    }

    /**
     * Blocks the calling thread until a callback object is posted to the queue, and optionally frees it.
     *
     * @param freeLast if set to <b>true</b> this function also frees the last callback if one existed.
     * @param timeout  The length of time to block.
     * @return A callback object from the queue if a callback has been posted, or null if the timeout has elapsed.
     */
    public ICallbackMsg waitForCallback(boolean freeLast, long timeout) {
        synchronized (callbackLock) {
            if (callbackQueue.isEmpty()) {
                try {
                    callbackLock.wait(timeout);
                } catch (final InterruptedException e) {
                    DebugLog.printStackTrace("SteamClient", e);
                }
            }

            return freeLast ? callbackQueue.poll() : callbackQueue.peek();
        }
    }

    /**
     * Blocks the calling thread until the queue contains a callback object. Returns all callbacks, and optionally frees them.
     *
     * @param freeLast if set to <b>true</b> this function also frees all callbacks.
     * @param timeout  The length of time to block.
     * @return All current callback objects in the queue.
     */
    public List<ICallbackMsg> getAllCallbacks(boolean freeLast, long timeout) {
        List<ICallbackMsg> callbacks;

        synchronized (callbackLock) {
            if (callbackQueue.isEmpty()) {
                try {
                    callbackLock.wait(timeout);
                } catch (InterruptedException e) {
                    DebugLog.printStackTrace("SteamClient", e);
                }

                if (callbackQueue.isEmpty()) {
                    return new ArrayList<>();
                }
            }

            callbacks = new ArrayList<>(callbackQueue);

            if (freeLast) {
                callbackQueue.clear();
            }
        }

        return callbacks;
    }

    /**
     * Frees the last callback in the queue.
     */
    public void freeLastCallback() {
        synchronized (callbackLock) {
            if (callbackQueue.isEmpty()) {
                return;
            }

            callbackQueue.poll();
        }
    }

    /**
     * Posts a callback to the queue. This is normally used directly by client message handlers.
     *
     * @param msg The message.
     */
    public void postCallback(CallbackMsg msg) {
        if (msg == null) {
            return;
        }

        synchronized (callbackLock) {
            callbackQueue.offer(msg);
            callbackLock.notify();
        }
    }

    /**
     * Returns the next available JobID for job based messages.
     *
     * @return The next available JobID.
     */
    public JobID getNextJobID() {
        long sequence = currentJobId.incrementAndGet();

        JobID jobID = new JobID();
        jobID.setBoxID(0L);
        jobID.setProcessID(0L);
        jobID.setSequentialCount(sequence);
        jobID.setStartTime(processStartTime);

        return jobID;
    }

    @Override
    protected boolean onClientMsgReceived(IPacketMsg packetMsg) {
        if (!super.onClientMsgReceived(packetMsg)) {
            return false;
        }

        Consumer<IPacketMsg> dispatcher = dispatchMap.get(packetMsg.getMsgType());
        if (dispatcher != null) {
            // we want to handle some of the clientmsgs before we pass them along to registered handlers
            dispatcher.accept(packetMsg);
        }

        for (Map.Entry<Class<? extends ClientMsgHandler>, ClientMsgHandler> entry : handlers.entrySet()) {
            try {
                entry.getValue().handleMsg(packetMsg);
            } catch (Exception e) {
                DebugLog.writeLine("SteamClient", "Unhandled exception from " + entry.getKey().getName() + " handlers: %s", e);
                SteamClient.this.disconnect();
                return false;
            }
        }

        return true;
    }

    @Override
    protected void onClientConnected() {
        super.onClientConnected();

        postCallback(new ConnectedCallback());
    }

    @Override
    protected void onClientDisconnected(boolean userInitiated) {
        super.onClientDisconnected(userInitiated);

        postCallback(new DisconnectedCallback(userInitiated));
    }

    private void handleCMList(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientCMList.Builder> cmMsg = new ClientMsgProtobuf<>(CMsgClientCMList.class, packetMsg);

        postCallback(new CMListCallback(cmMsg.getBody()));
    }

    private void handleServerList(IPacketMsg packetMsg) {
        ClientMsgProtobuf<CMsgClientServerList.Builder> listMsg = new ClientMsgProtobuf<>(CMsgClientServerList.class, packetMsg);

        postCallback(new ServerListCallback(listMsg.getBody()));
    }

    private void handleJobHeartbeat(IPacketMsg packetMsg) {
        // TODO:
    }

    private void handleJobFailed(IPacketMsg packetMsg) {
        // TODO:
    }
}
