package uk.co.thomasc.steamkit.steam3.handlers.steamuser.callbacks;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver.CMsgClientWalletInfoUpdate;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.ECurrencyCode;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;

/**
 * This callback is recieved when wallet info is recieved from the network.
 */
public final class WalletInfoCallback extends CallbackMsg {
    /**
     * Gets a value indicating whether this instance has wallet data.
     */
    private final boolean hasWallet;
    /**
     * Gets the currency code for this wallet.
     */
    private final ECurrencyCode currency;
    /**
     * Gets the balance of the wallet, in cents.
     */
    private final int balance;

    public WalletInfoCallback(CMsgClientWalletInfoUpdate.Builder wallet) {
        hasWallet = wallet.getHasWallet();
        currency = ECurrencyCode.from(wallet.getCurrency());
        balance = wallet.getBalance();
    }

    /**
     * Gets a value indicating whether this instance has wallet data.
     */
    public boolean isHasWallet() {
        return this.hasWallet;
    }

    /**
     * Gets the currency code for this wallet.
     */
    public ECurrencyCode getCurrency() {
        return this.currency;
    }

    /**
     * Gets the balance of the wallet, in cents.
     */
    public int getBalance() {
        return this.balance;
    }
}
