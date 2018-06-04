package uk.co.thomasc.steamkit.steam3.handlers.steamuser.callbacks;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserverLogin.CMsgClientAccountInfo;
import uk.co.thomasc.steamkit.base.generated.enums.EAccountFlags;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;

import java.util.EnumSet;

/**
 * This callback is recieved when account information is recieved from the
 * network. This generally happens after logon.
 */
public final class AccountInfoCallback extends CallbackMsg {
    /**
     * Gets the last recorded persona name used by this account.
     */
    private final String personaName;
    /**
     * Gets the country this account is connected from.
     */
    private final String country;
    /**
     * Gets the count of SteamGuard authenticated computers.
     */
    private final int countAuthedComputers;
    /**
     * Gets the account flags for this account.
     */
    private final EnumSet<EAccountFlags> accountFlags;
    /**
     * Gets the facebook ID of this account if it is linked with facebook.
     */
    private final long facebookID;
    /**
     * Gets the facebook name if this account is linked with facebook.
     */
    private final String facebookName;

    public AccountInfoCallback(CMsgClientAccountInfo.Builder msg) {
        personaName = msg.getPersonaName();
        country = msg.getIpCountry();
        countAuthedComputers = msg.getCountAuthedComputers();
        accountFlags = EAccountFlags.from(msg.getAccountFlags());
        facebookID = msg.getFacebookId();
        facebookName = msg.getFacebookName();
    }

    /**
     * Gets the last recorded persona name used by this account.
     */
    public String getPersonaName() {
        return this.personaName;
    }

    /**
     * Gets the country this account is connected from.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Gets the count of SteamGuard authenticated computers.
     */
    public int getCountAuthedComputers() {
        return this.countAuthedComputers;
    }

    /**
     * Gets the account flags for this account.
     */
    public EnumSet<EAccountFlags> getAccountFlags() {
        return this.accountFlags;
    }

    /**
     * Gets the facebook ID of this account if it is linked with facebook.
     */
    public long getFacebookID() {
        return this.facebookID;
    }

    /**
     * Gets the facebook name if this account is linked with facebook.
     */
    public String getFacebookName() {
        return this.facebookName;
    }
}
