package uk.co.thomasc.steamkit.steam3.handlers.steamtrading.callbacks;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgTrading_InitiateTradeResponse;
import uk.co.thomasc.steamkit.base.generated.steamlanguage.EEconTradeResponse;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.SteamID;

/**
 * This callback is fired when this client receives the response from a trade
 * proposal.
 */
public final class TradeResultCallback extends CallbackMsg {
    private int tradeID;

    private EEconTradeResponse response;

    private SteamID otherClient;

    private int numDaysSteamGuardRequired;

    private int numDaysNewDeviceCooldown;

    private int defaultNumDaysPasswordResetProbation;

    private int numDaysPasswordResetProbation;

    public TradeResultCallback(CMsgTrading_InitiateTradeResponse.Builder msg) {
        tradeID = msg.getTradeRequestId();
        response = EEconTradeResponse.from(msg.getResponse());
        otherClient = new SteamID(msg.getOtherSteamid());
        numDaysSteamGuardRequired = msg.getSteamguardRequiredDays();
        numDaysNewDeviceCooldown = msg.getNewDeviceCooldownDays();
        defaultNumDaysPasswordResetProbation = msg.getDefaultPasswordResetProbationDays();
        numDaysPasswordResetProbation = msg.getPasswordResetProbationDays();
    }

    public int getTradeID() {
        return tradeID;
    }

    public EEconTradeResponse getResponse() {
        return response;
    }

    public SteamID getOtherClient() {
        return otherClient;
    }

    public int getNumDaysSteamGuardRequired() {
        return numDaysSteamGuardRequired;
    }

    public int getNumDaysNewDeviceCooldown() {
        return numDaysNewDeviceCooldown;
    }

    public int getDefaultNumDaysPasswordResetProbation() {
        return defaultNumDaysPasswordResetProbation;
    }

    public int getNumDaysPasswordResetProbation() {
        return numDaysPasswordResetProbation;
    }
}
