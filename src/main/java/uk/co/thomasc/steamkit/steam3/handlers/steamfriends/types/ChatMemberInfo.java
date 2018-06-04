package uk.co.thomasc.steamkit.steam3.handlers.steamfriends.types;

import uk.co.thomasc.steamkit.base.generated.enums.EChatPermission;
import uk.co.thomasc.steamkit.base.generated.enums.EClanPermission;
import uk.co.thomasc.steamkit.types.KeyValue;
import uk.co.thomasc.steamkit.types.MessageObject;
import uk.co.thomasc.steamkit.types.SteamID;

import java.util.EnumSet;

/**
 * Represents the details of a user which is a member of a chatroom.
 */
public class ChatMemberInfo extends MessageObject {
    public ChatMemberInfo(KeyValue keyValues) {
        super(keyValues);
    }

    public ChatMemberInfo() {
        super();
    }

    public EnumSet<EClanPermission> getDetails() {
        return keyValues.get("Details").asEnum(EClanPermission.class, EnumSet.of(EClanPermission.Nobody));
    }

    public EnumSet<EChatPermission> getPermissions() {
        return keyValues.get("Details").asEnum(EChatPermission.class, EChatPermission.EveryoneDefault);
    }

    public SteamID steamID() {
        return new SteamID(keyValues.get("SteamID").asLong());
    }
}
