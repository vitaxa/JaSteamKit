package uk.co.thomasc.steamkit.base.gc.tf2;

import uk.co.thomasc.steamkit.base.gc.EGCMsgBase;
import uk.co.thomasc.steamkit.base.generated.steamlanguageinternal.IGCSerializableMessage;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;
import uk.co.thomasc.steamkit.util.stream.BinaryWriter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class GCMsgCraftItemResponse implements IGCSerializableMessage {

    @Override
    public int getEMsg() {
        return EGCMsgBase.CraftResponse;
    }

    // Static size: 2
    public ECraftingRecipe recipe = ECraftingRecipe.Unknown;

    public int unknown = 0; // Usually 0x0000000

    public List<Long> items = new ArrayList<Long>();

    public GCMsgCraftItemResponse() {

    }

    @Override
    public void serialize(OutputStream stream) throws IOException {
        BinaryWriter bw = new BinaryWriter(stream);
        bw.write(recipe.v());
        bw.write(unknown);
        bw.write((short) items.size());
        for (final Long item : items) {
            bw.write(item);
        }
    }

    @Override
    public void deserialize(InputStream stream) throws IOException {
        BinaryReader br = new BinaryReader(stream);
        recipe = ECraftingRecipe.f(br.readShort());
        unknown = br.readInt();
        final int itemCount = br.readShort();
        for (int i = 0; i < itemCount; i++) {
            items.add(br.readLong());
        }
    }

}
