package uk.co.thomasc.steamkit.base;

import uk.co.thomasc.steamkit.base.generated.steamlanguage.EMsg;

public interface ISteamSerializableMessage extends ISteamSerializable {
    EMsg getEMsg();
}
