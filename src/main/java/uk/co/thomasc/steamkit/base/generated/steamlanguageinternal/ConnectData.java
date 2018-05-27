package uk.co.thomasc.steamkit.base.generated.steamlanguageinternal;

import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ConnectData implements ISteamSerializable {

    public static final int CHALLENGE_MASK = ChallengeData.CHALLENGE_MASK;

    private int challengeValue = 0;

    public int getChallengeValue() {
        return this.challengeValue;
    }

    public void setChallengeValue(int challengeValue) {
        this.challengeValue = challengeValue;
    }

    @Override
    public void serialize(OutputStream stream) throws IOException {
        BinaryWriter bw = new BinaryWriter(stream);

        bw.write(challengeValue);
    }

    @Override
    public void deserialize(InputStream stream) throws IOException {
        BinaryReader br = new BinaryReader(stream);

        challengeValue = br.readInt();
    }
}
