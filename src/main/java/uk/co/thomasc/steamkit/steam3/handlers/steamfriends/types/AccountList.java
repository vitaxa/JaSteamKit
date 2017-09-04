package uk.co.thomasc.steamkit.steam3.handlers.steamfriends.types;

import uk.co.thomasc.steamkit.types.steamid.SteamID;

import java.util.HashMap;

public final class AccountList<T extends Account> extends HashMap<SteamID, T> {
    private static final long serialVersionUID = 5801545317536856765L;

    private final Class<T> clazz;

    public AccountList(Class<T> clazz) {
        this.clazz = clazz;
    }

    public T getAccount(SteamID steamId) {
        if (!containsKey(steamId)) {
            try {
                final T account = clazz.newInstance();
                account.steamId = steamId;
                put(steamId, account);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return get(steamId);
    }
}