package uk.co.thomasc.steamkit.base.generated.steamlanguageinternal;

import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.IOException;

public class ConnectData implements ISteamSerializable {
    public static final int CHALLENGE_MASK = ChallengeData.CHALLENGE_MASK;
    // Static size: 4
    public int challengeValue = 0;

    public ConnectData() {
        challengeValue = 0;
    }

    @Override
    public void serialize(BinaryWriter stream) throws IOException {
        stream.write(challengeValue);
    }

    @Override
    public void deSerialize(BinaryReader stream) throws IOException {
        challengeValue = stream.readInt();
    }
}
