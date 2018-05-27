package uk.co.thomasc.steamkit.base.generated.steamlanguageinternal;

import uk.co.thomasc.steamkit.base.generated.steamlanguage.EMsg;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EResult;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MsgClientUpdateGuestPassesList implements ISteamSerializableMessage {

    private EResult result = EResult.from(0);

    private int countGuestPassesToGive = 0;

    private int countGuestPassesToRedeem = 0;

    @Override
    public EMsg getEMsg() {
        return EMsg.ClientUpdateGuestPassesList;
    }

    public EResult getResult() {
        return this.result;
    }

    public void setResult(EResult result) {
        this.result = result;
    }

    public int getCountGuestPassesToGive() {
        return this.countGuestPassesToGive;
    }

    public void setCountGuestPassesToGive(int countGuestPassesToGive) {
        this.countGuestPassesToGive = countGuestPassesToGive;
    }

    public int getCountGuestPassesToRedeem() {
        return this.countGuestPassesToRedeem;
    }

    public void setCountGuestPassesToRedeem(int countGuestPassesToRedeem) {
        this.countGuestPassesToRedeem = countGuestPassesToRedeem;
    }

    @Override
    public void serialize(OutputStream stream) throws IOException {
        BinaryWriter bw = new BinaryWriter(stream);

        bw.write(result.code());
        bw.write(countGuestPassesToGive);
        bw.write(countGuestPassesToRedeem);
    }

    @Override
    public void deserialize(InputStream stream) throws IOException {
        BinaryReader br = new BinaryReader(stream);

        result = EResult.from(br.readInt());
        countGuestPassesToGive = br.readInt();
        countGuestPassesToRedeem = br.readInt();
    }
}
