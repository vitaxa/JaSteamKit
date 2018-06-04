package uk.co.thomasc.steamkit.base;

import uk.co.thomasc.steamkit.base.generated.enums.EMsg;

public interface ISteamSerializableHeader extends ISteamSerializable {
    void setEMsg(EMsg msg);
}
