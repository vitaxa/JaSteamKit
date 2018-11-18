package uk.co.thomasc.steamkit.networking.steam3;

import uk.co.thomasc.steamkit.base.IPacketMsg;
import uk.co.thomasc.steamkit.base.Msg;
import uk.co.thomasc.steamkit.base.generated.enums.EMsg;
import uk.co.thomasc.steamkit.base.generated.enums.EResult;
import uk.co.thomasc.steamkit.base.generated.enums.EUniverse;
import uk.co.thomasc.steamkit.base.generated.internal.MsgChannelEncryptRequest;
import uk.co.thomasc.steamkit.base.generated.internal.MsgChannelEncryptResponse;
import uk.co.thomasc.steamkit.base.generated.internal.MsgChannelEncryptResult;
import uk.co.thomasc.steamkit.steam3.CMClient;
import uk.co.thomasc.steamkit.util.KeyDictionary;
import uk.co.thomasc.steamkit.util.cSharp.events.EventArgs;
import uk.co.thomasc.steamkit.util.cSharp.events.EventHandler;
import uk.co.thomasc.steamkit.util.crypto.CryptoHelper;
import uk.co.thomasc.steamkit.util.crypto.RSACrypto;
import uk.co.thomasc.steamkit.util.logging.DebugLog;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;

public class EnvelopeEncryptedConnection extends Connection {

    private final Connection inner;
    private final EUniverse universe;
    private EncryptionState state;
    private INetFilterEncryption encryption;

    private final EventHandler<EventArgs> onConnected = new EventHandler<EventArgs>() {
        @Override
        public void handleEvent(Object sender, EventArgs e) {
            state = EncryptionState.CONNECTED;
        }
    };

    private final EventHandler<DisconnectedEventArgs> onDisconnected = new EventHandler<DisconnectedEventArgs>() {
        @Override
        public void handleEvent(Object sender, DisconnectedEventArgs e) {
            state = EncryptionState.DISCONNECTED;
            encryption = null;

            disconnected.handleEvent(EnvelopeEncryptedConnection.this, e);
        }
    };

    private final EventHandler<NetMsgEventArgs> onNetMsgReceived = new EventHandler<NetMsgEventArgs>() {
        @Override
        public void handleEvent(Object sender, NetMsgEventArgs e) {
            if (state == EncryptionState.ENCRYPTED) {
                byte[] plaintextData = encryption.processIncoming(e.getData());
                netMsgReceived.handleEvent(EnvelopeEncryptedConnection.this, e.withData(plaintextData));
                return;
            }

            IPacketMsg packetMsg = CMClient.getPacketMsg(e.getData());

            if (!isExpectedEMsg(packetMsg.getMsgType())) {
                DebugLog.writeLine("EnvelopeEncryptedConnection", "Rejected EMsg: " + packetMsg.getMsgType() + " during channel setup");
                return;
            }

            switch (packetMsg.getMsgType()) {
                case ChannelEncryptRequest:
                    handleEncryptRequest(packetMsg);
                    break;
                case ChannelEncryptResult:
                    handleEncryptResult(packetMsg);
                    break;
            }
        }
    };

    public EnvelopeEncryptedConnection(Connection inner, EUniverse universe) {
        if (inner == null) {
            throw new IllegalArgumentException("inner connection is null");
        }
        this.inner = inner;
        this.universe = universe;

        inner.getNetMsgReceived().addEventHandler(onNetMsgReceived);
        inner.getConnected().addEventHandler(onConnected);
        inner.getDisconnected().addEventHandler(onDisconnected);
    }

    private void handleEncryptRequest(IPacketMsg packetMsg) {
        Msg<MsgChannelEncryptRequest> request = new Msg<>(MsgChannelEncryptRequest.class, packetMsg);

        EUniverse connectedUniverse = request.getBody().getUniverse();
        long protoVersion = request.getBody().getProtocolVersion();

        DebugLog.writeLine("EnvelopeEncryptedConnection", "Got encryption request. Universe: " + connectedUniverse + " Protocol ver: " + protoVersion);

        if (protoVersion != MsgChannelEncryptRequest.PROTOCOL_VERSION) {
            DebugLog.writeLine("EnvelopeEncryptedConnection", "Encryption handshake protocol version mismatch!");
        }

        if (connectedUniverse != universe) {
            DebugLog.writeLine("EnvelopeEncryptedConnection", "Expected universe " + universe + " but server reported universe " + connectedUniverse);
        }

        byte[] randomChallenge = null;
        if (request.getPayload().getLength() >= 16) {
            randomChallenge = request.getPayload().toByteArray();
        }

        byte[] publicKey = KeyDictionary.getPublicKey(connectedUniverse);

        if (publicKey == null) {
            DebugLog.writeLine("EnvelopeEncryptedConnection", "HandleEncryptRequest got request for invalid universe! Universe: " + connectedUniverse + " Protocol ver: " + protoVersion);
            disconnect();
        }

        Msg<MsgChannelEncryptResponse> response = new Msg<>(MsgChannelEncryptResponse.class);

        byte[] tempSessionKey = CryptoHelper.generateRandomBlock(32);
        byte[] encryptedHandshakeBlob = null;

        RSACrypto rsa = new RSACrypto(publicKey);

        if (randomChallenge != null) {
            byte[] blobToEncrypt = new byte[tempSessionKey.length + randomChallenge.length];

            System.arraycopy(tempSessionKey, 0, blobToEncrypt, 0, tempSessionKey.length);
            System.arraycopy(randomChallenge, 0, blobToEncrypt, tempSessionKey.length, randomChallenge.length);

            encryptedHandshakeBlob = rsa.encrypt(blobToEncrypt);
        } else {
            encryptedHandshakeBlob = rsa.encrypt(tempSessionKey);
        }

        byte[] keyCrc = CryptoHelper.crcHash(encryptedHandshakeBlob);

        try {
            response.write(encryptedHandshakeBlob);
            response.write(keyCrc);
            response.write(0);
        } catch (IOException e) {
            DebugLog.printStackTrace("EnvelopeEncryptedConnection", e);
        }

        if (randomChallenge != null) {
            encryption = new NetFilterEncryptionWithHMAC(tempSessionKey);
        } else {
            encryption = new NetFilterEncryption(tempSessionKey);
        }

        state = EncryptionState.CHALLENGED;

        send(response.serialize());
    }

    private void handleEncryptResult(IPacketMsg packetMsg) {
        Msg<MsgChannelEncryptResult> result = new Msg<>(MsgChannelEncryptResult.class, packetMsg);

        DebugLog.writeLine("EnvelopeEncryptedConnection", "Encryption result: " + result.getBody().getResult());

        assert encryption != null;

        if (result.getBody().getResult() == EResult.OK && encryption != null) {
            state = EncryptionState.ENCRYPTED;
            connected.handleEvent(this, EventArgs.EMPTY);
        } else {
            DebugLog.writeLine("EnvelopeEncryptedConnection", "Encryption channel setup failed");
            disconnect();
        }
    }

    private boolean isExpectedEMsg(EMsg msg) {
        switch (state) {
            case DISCONNECTED:
                return false;
            case CONNECTED:
                return msg == EMsg.ChannelEncryptRequest;
            case CHALLENGED:
                return msg == EMsg.ChannelEncryptResult;
            case ENCRYPTED:
                return true;
            default:
                throw new IllegalStateException("Unreachable - landed up in undefined state.");
        }
    }

    @Override
    public void connect(InetSocketAddress endPoint, int timeout) {
        inner.connect(endPoint, timeout);
    }

    @Override
    public void disconnect() {
        inner.disconnect();
    }

    @Override
    public void send(byte[] data) {
        if (state == EncryptionState.ENCRYPTED) {
            data = encryption.processOutgoing(data);
        }

        inner.send(data);
    }

    @Override
    public InetAddress getLocalIP() {
        return inner.getLocalIP();
    }

    @Override
    public InetSocketAddress getCurrentEndPoint() {
        return inner.getCurrentEndPoint();
    }

    @Override
    public ProtocolType getProtocolType() {
        return inner.getProtocolType();
    }

    private enum EncryptionState {
        DISCONNECTED,
        CONNECTED,
        CHALLENGED,
        ENCRYPTED
    }
}
