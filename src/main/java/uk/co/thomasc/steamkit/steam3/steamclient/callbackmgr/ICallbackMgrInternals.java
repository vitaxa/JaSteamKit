package uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr;

public interface ICallbackMgrInternals {
    void register(CallbackBase callback);

    void unregister(CallbackBase callback);
}
