package com.vitaxa.steamkit.steam.handlers;

import com.vitaxa.steamkit.TestBase;
import com.vitaxa.steamkit.TestPackets;
import org.junit.Before;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import uk.co.thomasc.steamkit.base.IClientMsg;
import uk.co.thomasc.steamkit.base.IPacketMsg;
import uk.co.thomasc.steamkit.base.generated.enums.EMsg;
import uk.co.thomasc.steamkit.base.generated.enums.EUniverse;
import uk.co.thomasc.steamkit.steam3.CMClient;
import uk.co.thomasc.steamkit.steam3.handlers.ClientMsgHandler;
import uk.co.thomasc.steamkit.steam3.steamclient.SteamClient;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.steam3.steamclient.configuration.SteamConfiguration;
import uk.co.thomasc.steamkit.types.JobID;
import uk.co.thomasc.steamkit.types.SteamID;

import java.net.InetAddress;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public abstract class HandlerTestBase<T extends ClientMsgHandler> extends TestBase {

    protected static final JobID SOURCE_JOB_ID = new JobID(916351965);

    @Mock
    protected SteamClient steamClient;

    protected T handler;

    @Before
    public void setUp() {
        handler = createHandler();
        handler.setup(steamClient);
        when(steamClient.getSteamID()).thenReturn(new SteamID(123L));
        when(steamClient.getConfiguration()).thenReturn(SteamConfiguration.createDefault());
        when(steamClient.isConnected()).thenReturn(true);
        when(steamClient.getNextJobID()).thenReturn(SOURCE_JOB_ID);
        when(steamClient.getUniverse()).thenReturn(EUniverse.Public);
        when(steamClient.getLocalIP()).thenReturn(InetAddress.getLoopbackAddress());
    }

    protected abstract T createHandler();

    protected <M extends IClientMsg> M verifySend(EMsg msgType) {
        ArgumentCaptor<IClientMsg> msgCaptor = ArgumentCaptor.forClass(IClientMsg.class);
        verify(steamClient, atLeast(1)).send(msgCaptor.capture());

        IClientMsg msg = msgCaptor.getValue();
        assertEquals(msgType, msg.getMsgType());

        //noinspection unchecked
        return (M) msg;
    }

    protected <C extends CallbackMsg> C verifyCallback() {
        ArgumentCaptor<CallbackMsg> callbackCaptor = ArgumentCaptor.forClass(CallbackMsg.class);
        verify(steamClient, atLeast(1)).postCallback(callbackCaptor.capture());

        CallbackMsg callback = callbackCaptor.getValue();

        //noinspection unchecked
        return (C) callback;
    }

    protected IPacketMsg getPacket(EMsg msgType, boolean isProto) {
        return CMClient.getPacketMsg(TestPackets.getPacket(msgType, isProto));
    }
}

