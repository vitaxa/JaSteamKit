package com.vitaxa.steamkit.steam.handlers.steamuser;

import com.vitaxa.steamkit.steam.handlers.HandlerTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.junit.MockitoJUnitRunner;
import uk.co.thomasc.steamkit.base.ClientMsgProtobuf;
import uk.co.thomasc.steamkit.base.IClientMsg;
import uk.co.thomasc.steamkit.base.IPacketMsg;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgClientUpdateMachineAuthResponse;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogOff;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientLogon;
import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientRequestWebAPIAuthenticateUserNonce;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EAccountType;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.ECurrencyCode;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EMsg;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EResult;
import uk.co.thomasc.steamkit.steam3.handlers.steamuser.SteamUser;
import uk.co.thomasc.steamkit.steam3.handlers.steamuser.callbacks.*;
import uk.co.thomasc.steamkit.steam3.handlers.steamuser.types.LogOnDetails;
import uk.co.thomasc.steamkit.steam3.handlers.steamuser.types.MachineAuthDetails;
import uk.co.thomasc.steamkit.steam3.handlers.steamuser.types.OTPDetails;
import uk.co.thomasc.steamkit.types.JobID;
import uk.co.thomasc.steamkit.types.SteamID;

import java.util.Date;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.Silent.class)
public class SteamUserTest extends HandlerTestBase<SteamUser> {

    @Override
    protected SteamUser createHandler() {
        return new SteamUser();
    }

    @Test
    public void logOn() {
        LogOnDetails details = new LogOnDetails();
        details.setUsername("testusername");
        details.setPassword("testpassword");

        handler.logOn(details);

        ClientMsgProtobuf<CMsgClientLogon.Builder> msg = verifySend(EMsg.ClientLogon);

        assertEquals("testusername", msg.getBody().getAccountName());
        assertEquals("testpassword", msg.getBody().getPassword());
    }

    @Test
    public void logOnNotConnected() {
        reset(steamClient);
        when(steamClient.isConnected()).thenReturn(false);

        LogOnDetails details = new LogOnDetails();
        details.setUsername("testusername");
        details.setPassword("testpassword");

        handler.logOn(details);

        LoggedOnCallback callback = verifyCallback();

        assertEquals(EResult.NoConnection, callback.getResult());
    }

    @Test(expected = IllegalArgumentException.class)
    public void logOnNoDetails() {
        LogOnDetails details = new LogOnDetails();
        handler.logOn(details);
    }

    @Test(expected = IllegalArgumentException.class)
    public void logOnNullDetails() {
        handler.logOn(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void logOnLoginKeyWithNoRemember() {
        LogOnDetails details = new LogOnDetails();
        details.setUsername("testusername");
        details.setLoginKey("loginkey");

        handler.logOn(details);
    }

    @Test
    public void logOnAnonymous() {
        handler.logOnAnonymous();

        ArgumentCaptor<IClientMsg> msgCaptor = ArgumentCaptor.forClass(IClientMsg.class);
        verify(steamClient).send(msgCaptor.capture());

        ClientMsgProtobuf<CMsgClientLogon.Builder> msg = verifySend(EMsg.ClientLogon);

        SteamID id = new SteamID(msg.getProtoHeader().getSteamid());
        assertEquals(EAccountType.AnonUser, id.getAccountType());
    }

    @Test(expected = IllegalArgumentException.class)
    public void logOnAnonymousNullDetails() {
        handler.logOnAnonymous(null);
    }

    @Test
    public void logOnAnonymousNotConnected() {
        reset(steamClient);
        when(steamClient.isConnected()).thenReturn(false);

        handler.logOnAnonymous();

        LoggedOnCallback callback = verifyCallback();

        assertEquals(EResult.NoConnection, callback.getResult());
    }

    @Test
    public void logOff() {
        handler.logOff();

        verify(steamClient).setExpectDisconnection(true);

        ClientMsgProtobuf<CMsgClientLogOff.Builder> msg = verifySend(EMsg.ClientLogOff);

        assertNotNull(msg);
    }

    @Test
    public void machineAuthResponse() {
        OTPDetails otp = new OTPDetails();
        otp.setIdentifier("testid");
        otp.setType(5);
        otp.setValue(42);

        MachineAuthDetails details = new MachineAuthDetails();

        details.setJobID(new JobID(123));
        details.setFileName("testfilename");
        details.setBytesWritten(10);
        details.setFileSize(16);
        details.setOffset(69);
        details.seteResult(EResult.OK);
        details.setLastError(1);
        details.setOneTimePassword(otp);
        details.setSentryFileHash(new byte[]{0, 1, 2, 3});

        handler.sendMachineAuthResponse(details);

        ClientMsgProtobuf<CMsgClientUpdateMachineAuthResponse.Builder> msg = verifySend(EMsg.ClientUpdateMachineAuthResponse);

        assertEquals(123, msg.getProtoHeader().getJobidTarget());
        assertEquals("testfilename", msg.getBody().getFilename());
        assertEquals(10, msg.getBody().getCubwrote());
        assertEquals(16, msg.getBody().getFilesize());
        assertEquals(69, msg.getBody().getOffset());
        assertEquals(EResult.OK.code(), msg.getBody().getEresult());
        assertEquals(1, msg.getBody().getGetlasterror());
        assertEquals(5, msg.getBody().getOtpType());
        assertEquals(42, msg.getBody().getOtpValue());
        assertEquals("testid", msg.getBody().getOtpIdentifier());
        assertArrayEquals(new byte[]{0, 1, 2, 3}, msg.getBody().getShaFile().toByteArray());
    }

    @Test(expected = IllegalArgumentException.class)
    public void machineAuthResponseNullDetails() {
        handler.sendMachineAuthResponse(null);
    }

    @Test
    public void requestWebNonce() {
        JobID jobID = handler.requestWebAPIUserNonce();

        ClientMsgProtobuf<CMsgClientRequestWebAPIAuthenticateUserNonce.Builder> msg = verifySend(EMsg.ClientRequestWebAPIAuthenticateUserNonce);

        assertEquals(SOURCE_JOB_ID, jobID);
        assertEquals(SOURCE_JOB_ID, msg.getSourceJobID());
    }

    @Test
    public void acceptNewLoginKey() {
        LoginKeyCallback callback = new LoginKeyCallback(SteammessagesClientserverLogin.CMsgClientNewLoginKey.newBuilder()
                .setLoginKey("loginkey")
                .setUniqueId(123));

        handler.acceptNewLoginKey(callback);

        ClientMsgProtobuf<SteammessagesClientserverLogin.CMsgClientNewLoginKeyAccepted.Builder> msg = verifySend(EMsg.ClientNewLoginKeyAccepted);

        assertEquals(123, msg.getBody().getUniqueId());
    }

    @Test(expected = IllegalArgumentException.class)
    public void acceptNewLoginKeyNullCallback() {
        handler.acceptNewLoginKey(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void handleNullPacket() {
        handler.handleMsg(null);
    }

    @Test
    public void handleLogonResponse() {
        IPacketMsg msg = getPacket(EMsg.ClientLogOnResponse, true);

        handler.handleMsg(msg);

        LoggedOnCallback callback = verifyCallback();

        assertEquals(EResult.OK, callback.getResult());
    }

    @Test
    public void handleLogonResponseNonProto() {
        IPacketMsg msg = getPacket(EMsg.ClientLogOnResponse, false);

        handler.handleMsg(msg);

        LoggedOnCallback callback = verifyCallback();

        assertEquals(EResult.OK, callback.getResult());
    }

    @Test
    public void handleLogOffResponse() {
        IPacketMsg msg = getPacket(EMsg.ClientLoggedOff, true);

        handler.handleMsg(msg);

        LoggedOffCallback callback = verifyCallback();

        assertEquals(EResult.OK, callback.getResult());
    }

//    @Test
//    public void handleLogOffResponseNonProto() {
//        IPacketMsg msg = getPacket(EMsg.ClientLoggedOff, false);
//
//        handler.handleMsg(msg);
//
//        LoggedOffCallback callback = verifyCallback();
//
//        assertEquals(EResult.OK, callback.getResult());
//    }

    @Test
    public void handleLoginKey() {
        IPacketMsg msg = getPacket(EMsg.ClientNewLoginKey, true);

        handler.handleMsg(msg);

        LoginKeyCallback callback = verifyCallback();

        assertEquals("testloginkey", callback.getLoginKey());
        assertEquals(69, callback.getUniqueID());
    }

    @Test
    public void handleSessionToken() {
        IPacketMsg msg = getPacket(EMsg.ClientSessionToken, true);

        handler.handleMsg(msg);

        SessionTokenCallback callback = verifyCallback();

        assertEquals(123, callback.getSessionToken());
    }

    @Test
    public void handleUpdateMachineAuth() {
        IPacketMsg msg = getPacket(EMsg.ClientUpdateMachineAuth, true);

        handler.handleMsg(msg);

        UpdateMachineAuthCallback callback = verifyCallback();

        assertEquals("ssfn746471640643517445", callback.getFileName());
        assertEquals(0, callback.getOffset());
        assertEquals(2048, callback.getBytesToWrite());
        assertEquals(2048, callback.getData().length);
    }

    @Test
    public void handleAccountInfo() {
        IPacketMsg msg = getPacket(EMsg.ClientAccountInfo, true);

        handler.handleMsg(msg);

        AccountInfoCallback callback = verifyCallback();

        assertEquals("XX", callback.getCountry());
        assertEquals("testpersonaname", callback.getPersonaName());
    }

    @Test
    public void handleWalletInfo() {
        IPacketMsg msg = getPacket(EMsg.ClientWalletInfoUpdate, true);

        handler.handleMsg(msg);

        WalletInfoCallback callback = verifyCallback();

        assertFalse(callback.isHasWallet());
        assertEquals(0, callback.getBalance());
        assertEquals(ECurrencyCode.Invalid, callback.getCurrency());
    }

    @Test
    public void handleWebAPIUserNonce() {
        IPacketMsg msg = getPacket(EMsg.ClientRequestWebAPIAuthenticateUserNonceResponse, true);

        handler.handleMsg(msg);

        WebAPIUserNonceCallback callback = verifyCallback();

        assertEquals(EResult.OK, callback.getResult());
        assertEquals("testnonce", callback.getNonce());
    }

    @Test
    public void handleMarketingMessageUpdate() {
        IPacketMsg msg = getPacket(EMsg.ClientMarketingMessageUpdate2, false);

        handler.handleMsg(msg);

        MarketingMessageCallback callback = verifyCallback();

        assertEquals(new Date(1521763200000L), callback.getUpdateTime());
        assertEquals(7, callback.getMessages().size());
    }
}
