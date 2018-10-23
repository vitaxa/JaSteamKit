package uk.co.thomasc.steamkit.steam3.handlers.steamapps.callbacks;

import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;

import static uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver.CMsgClientIsLimitedAccount;

public class AccountLimitCallback extends CallbackMsg {

    private final boolean limited;

    private final boolean communityBanned;

    private final boolean locked;

    private final boolean canInviteFriends;

    public AccountLimitCallback(CMsgClientIsLimitedAccount.Builder msg) {
        this.limited = msg.getBisLimitedAccount();
        this.communityBanned = msg.getBisCommunityBanned();
        this.locked = msg.getBisLockedAccount();
        this.canInviteFriends = msg.getBisLimitedAccountAllowedToInviteFriends();
    }

    public boolean isLimited() {
        return limited;
    }

    public boolean isCommunityBanned() {
        return communityBanned;
    }

    public boolean isLocked() {
        return locked;
    }

    public boolean isCanInviteFriends() {
        return canInviteFriends;
    }
}
