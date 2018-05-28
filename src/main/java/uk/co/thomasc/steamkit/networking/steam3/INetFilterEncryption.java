package uk.co.thomasc.steamkit.networking.steam3;

public interface INetFilterEncryption {
    byte[] processIncoming(byte[] data);
    byte[] processOutgoing(byte[] data);
}
