package uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr;

import uk.co.thomasc.steamkit.types.JobID;

import java.io.Closeable;
import java.util.function.Consumer;

public class Callback<T extends ICallbackMsg> extends CallbackBase implements Closeable {

    ICallbackMgrInternals mgr;

    private JobID jobID;

    private Consumer<T> onRun;

    private Class<? extends T> callbackType;

    public Callback(Class<? extends T> callbackType, Consumer<T> func) {
        this(callbackType, func, null);
    }

    public Callback(Class<? extends T> callbackType, Consumer<T> func, ICallbackMgrInternals mgr) {
        this(callbackType, func, mgr, JobID.INVALID);
    }

    public Callback(Class<? extends T> callbackType, Consumer<T> func, ICallbackMgrInternals mgr, JobID jobID) {
        this.jobID = jobID;
        this.onRun = func;
        this.callbackType = callbackType;

        attachTo(mgr);
    }

    void attachTo(ICallbackMgrInternals mgr) {
        if (mgr == null) {
            return;
        }

        this.mgr = mgr;
        mgr.register(this);
    }

    @Override
    Class getCallbackType() {
        return callbackType;
    }

    @Override
    void run(Object callback) {
        if (callbackType.isAssignableFrom(callback.getClass())) {
            T cb = (T) callback;

            if ((cb.getJobID().equals(jobID) || jobID.equals(JobID.INVALID)) && onRun != null) {
                onRun.accept(cb);
            }
        }
    }

    @Override
    public void close() {
        if (mgr != null) {
            mgr.unregister(this);
        }
    }
}
