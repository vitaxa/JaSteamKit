package uk.co.thomasc.steamkit.steam3.handlers.steamchat.types;

import uk.co.thomasc.steamkit.types.steamid.SteamID;

import java.util.ArrayList;
import java.util.List;

public class Chat {
    public SteamID steamId;

    public List<ChatMemberInfo> members = new ArrayList<ChatMemberInfo>();
}
