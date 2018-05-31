package com.vitaxa.steamkit.steam;

import uk.co.thomasc.steamkit.base.IClientMsg;
import uk.co.thomasc.steamkit.steam3.CMClient;
import uk.co.thomasc.steamkit.steam3.steamclient.configuration.SteamConfiguration;

public class DummyClient extends CMClient {
    public DummyClient() {
        super(SteamConfiguration.createDefault());
    }

    public void dummyDisconnect() {
        disconnect();
        onClientDisconnected(true);
    }

    public void handleClientMsg(IClientMsg clientMsg) {
        onClientMsgReceived(getPacketMsg(clientMsg.serialize()));
    }
}

