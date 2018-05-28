package uk.co.thomasc.steamkit.steam3.handlers.steamnotifications.callback;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgClientItemAnnouncements;
import uk.co.thomasc.steamkit.steam3.handlers.steamnotifications.SteamNotifications;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;

/**
 * Fired in response to calling {@link SteamNotifications#requestItemAnnouncements()}.
 */
public class ItemAnnouncementsCallback extends CallbackMsg {

    private int count;

    public ItemAnnouncementsCallback(CMsgClientItemAnnouncements.Builder msg) {
        count = msg.getCountNewItems();
    }

    /**
     * @return the number of new items
     */
    public int getCount() {
        return count;
    }
}
