package uk.co.thomasc.steamkit.steam3.handlers.steamnotifications.callback;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver2.CMsgClientCommentNotifications;
import uk.co.thomasc.steamkit.steam3.handlers.steamnotifications.SteamNotifications;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;

/**
 * Fired in response to calling {@link SteamNotifications#requestCommentNotifications()}.
 */
public class CommentNotificationsCallback extends CallbackMsg {

    private int commentCount;

    private int commentOwnerCount;

    private int commentSubscriptionsCount;

    public CommentNotificationsCallback(CMsgClientCommentNotifications.Builder msg) {
        commentCount = msg.getCountNewComments();
        commentOwnerCount = msg.getCountNewCommentsOwner();
        commentSubscriptionsCount = msg.getCountNewCommentsSubscriptions();
    }

    /**
     * @return the number of new comments
     */
    public int getCommentCount() {
        return commentCount;
    }

    /**
     * @return the number of new comments on the users profile
     */
    public int getCommentOwnerCount() {
        return commentOwnerCount;
    }

    /**
     * @return the number of new comments on subscribed threads
     */
    public int getCommentSubscriptionsCount() {
        return commentSubscriptionsCount;
    }
}
