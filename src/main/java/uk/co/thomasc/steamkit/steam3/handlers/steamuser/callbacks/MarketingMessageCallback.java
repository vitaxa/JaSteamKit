package uk.co.thomasc.steamkit.steam3.handlers.steamuser.callbacks;

import uk.co.thomasc.steamkit.base.generated.enums.EMarketingMessageFlags;
import uk.co.thomasc.steamkit.base.generated.internal.MsgClientMarketingMessageUpdate2;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.GlobalID;
import uk.co.thomasc.steamkit.util.logging.DebugLog;
import uk.co.thomasc.steamkit.util.stream.BinaryReader;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.*;

/**
 * This callback is fired when the client receives a marketing message update.
 */
public class MarketingMessageCallback extends CallbackMsg {

    private Date updateTime;

    private Collection<Message> messages;

    public MarketingMessageCallback(MsgClientMarketingMessageUpdate2 body, byte[] payload) {
        updateTime = new Date(body.getMarketingMessageUpdateTime() * 1000L);

        List<Message> msgList = new ArrayList<>();

        try (BinaryReader br = new BinaryReader(new ByteArrayInputStream(payload))) {
            for (int i = 0; i < body.getCount(); i++) {
                int dataLen = br.readInt() - 4; // total length includes the 4 byte length
                byte[] messageData = br.readBytes(dataLen);

                msgList.add(new Message(messageData));
            }
        } catch (IOException e) {
            DebugLog.printStackTrace("MarketingMessageCallback", e);
        }

        messages = Collections.unmodifiableList(msgList);
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public Collection<Message> getMessages() {
        return messages;
    }

    /**
     * Represents a single marketing message.
     */
    public static class Message {
        private GlobalID id;

        private String url;

        private EnumSet<EMarketingMessageFlags> flags;

        Message(byte[] data) {
            try (BinaryReader br = new BinaryReader(new ByteArrayInputStream(data))) {
                id = new GlobalID(br.readLong());
                url = br.readNullTermString(Charset.forName("UTF-8"));
                flags = EMarketingMessageFlags.from(br.readInt());
            } catch (IOException e) {
                DebugLog.printStackTrace("MarketingMessageCallback", e);
            }
        }

        public GlobalID getId() {
            return id;
        }

        public String getUrl() {
            return url;
        }

        public EnumSet<EMarketingMessageFlags> getFlags() {
            return flags;
        }
    }
}

