package com.vitaxa.steamkit.steam.steamclient.callbackmgr;

import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;

import java.util.UUID;

public class CallbackForTest extends CallbackMsg {
    public CallbackForTest(UUID uuid) {
        this.uuid = uuid;
    }

    private UUID uuid;

    public CallbackForTest() {

    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
