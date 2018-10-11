package uk.co.thomasc.steamkit.types;

import uk.co.thomasc.steamkit.steam3.steamclient.SteamClient;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.ICallbackMsg;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.function.Consumer;

public abstract class AsyncJob<T extends ICallbackMsg> {

    private static long TIMEOUT_SEC = 10;

    protected final SteamClient steamClient;
    protected final JobID jobID;

    protected LocalDateTime jobStart;

    AsyncJob(SteamClient steamClient, JobID jobID) {
        this.steamClient = Objects.requireNonNull(steamClient, "steamClient can't be null");
        this.jobID = Objects.requireNonNull(jobID, "jobID can't be null");
        this.jobStart = LocalDateTime.now();

        steamClient.startJob(this);
    }

    /**
     * Adds a callback to the async job's result set
     *
     * @param callbackMsg The callback
     * @return <code>true</code> if this result completes the set; otherwise, <code>false</code>
     */
    public abstract boolean addResult(T callbackMsg);

    public abstract T getResult();

    public abstract void getResult(Consumer<? super T> consumer);

    /**
     * Sets this job as failed, either remotely or due to a message timeout
     *
     * @param dueToRemoteFailure if set to <code>true</code> this job is marked as failed because Steam
     *                           informed us of a job failure; otherwise, this job has failed due to a message timeout
     */
    public abstract void setFailed(boolean dueToRemoteFailure);

    /**
     * Gets or sets the period of time before this job will be considered timed out and will be canceled
     */
    public boolean isTimeout() {
        final LocalDateTime now = LocalDateTime.now();
        final LocalDateTime timeOut = jobStart.plus(Duration.ofSeconds(TIMEOUT_SEC));
        return now.isAfter(timeOut) || now.equals(timeOut);
    }

    /**
     * Marks this job as having received a heartbeat and extends the job's timeout
     */
    public void heartbeat() {
        TIMEOUT_SEC += TIMEOUT_SEC + 10;
    }

    public SteamClient getSteamClient() {
        return steamClient;
    }

    public JobID getJobID() {
        return jobID;
    }

}
