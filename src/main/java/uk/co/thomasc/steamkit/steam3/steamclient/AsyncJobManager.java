package uk.co.thomasc.steamkit.steam3.steamclient;

import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.ICallbackMsg;
import uk.co.thomasc.steamkit.types.AsyncJob;
import uk.co.thomasc.steamkit.types.JobID;

import java.util.Map;
import java.util.concurrent.*;

public class AsyncJobManager {

    private final static ThreadFactory THREAD_FACTORY = r -> {
        final Thread thread = new Thread(r, "AsyncJobManager Timeout Thread");
        thread.setDaemon(true);
        return thread;
    };

    private final Map<JobID, AsyncJob> asyncJobs;

    private ScheduledExecutorService scheduledExecutorService;

    private ScheduledFuture<?> jobTimeoutFunc;

    AsyncJobManager() {
        this.asyncJobs = new ConcurrentHashMap<>();
        this.scheduledExecutorService = Executors.newScheduledThreadPool(1, THREAD_FACTORY);
    }

    /**
     * Tracks a job with this manager
     *
     * @param asyncJob The asynchronous job to track
     */
    public void startJob(AsyncJob asyncJob) {
        asyncJobs.putIfAbsent(asyncJob.getJobID(), asyncJob);
    }

    public void tryCompleteJob(JobID jobID, ICallbackMsg callbackMsg) {
        final AsyncJob asyncJob = getJob(jobID);
        if (asyncJob == null) {
            return; // Not a job we are tracking ourselves, can ignore it
        }
        // pass this callback into the job so it can determine if the job is finished (in the case of multiple responses to a job)
        final boolean jobFinished = asyncJob.addResult(callbackMsg);
        if (jobFinished) {
            // if the job is finished, we can stop tracking it
            asyncJobs.remove(jobID);
        }
    }

    /**
     * Extends the lifetime of a job
     *
     * @param jobID The job identifier
     */
    public void heartbeatJob(JobID jobID) {
        final AsyncJob asyncJob = getJob(jobID);
        if (asyncJob == null) {
            return; // ignore heartbeats for jobs we're not tracking
        }
        asyncJob.heartbeat();
    }

    /**
     * Marks a certain job as remotely failed
     *
     * @param jobID The job identifier
     */
    public void failJob(JobID jobID) {
        final AsyncJob asyncJob = getJob(jobID, true);
        if (asyncJob == null) {
            return; // ignore remote failures for jobs we're not tracking
        }
        asyncJob.setFailed(true);
    }

    /**
     * Cancels and clears all jobs being tracked
     */
    public void cancelPendingJobs() {
        asyncJobs.forEach((jobID, asyncJob) -> {
            asyncJob.setFailed(false);
        });
        asyncJobs.clear();
    }

    /**
     * Enables or disables periodic checks for job timeouts
     *
     * @param enable Whether or not job timeout checks should be enabled
     */
    public void setTimeoutsEnabled(boolean enable) {
        if (enable) {
            if (jobTimeoutFunc == null) {
                if (scheduledExecutorService.isShutdown()) {
                    scheduledExecutorService = Executors.newScheduledThreadPool(1, THREAD_FACTORY);
                }
                jobTimeoutFunc = scheduledExecutorService.scheduleAtFixedRate(this::cancelPendingJobs, 1, 1, TimeUnit.SECONDS);
            }
        } else {
            if (jobTimeoutFunc != null) {
                jobTimeoutFunc.cancel(true);
            }
        }
    }

    private Runnable cancelTimeoutJobs() {
        return () -> {
            asyncJobs.forEach((jobID, asyncJob) -> {
                if (asyncJob.isTimeout()) {
                    asyncJob.setFailed(false);
                    asyncJobs.remove(jobID);
                }
            });
        };
    }

    private AsyncJob getJob(JobID jobID) {
        return getJob(jobID, false);
    }

    /**
     * Retrieves a job from this manager, and optionally removes it from tracking.
     *
     * @param jobID  The JobID
     * @param remove If set to <c>true</c>, this job is removed from tracking.
     */
    private AsyncJob getJob(JobID jobID, boolean remove) {
        final AsyncJob asyncJob;
        if (remove) {
            asyncJob = asyncJobs.remove(jobID);
        } else {
            asyncJob = asyncJobs.get(jobID);
        }
        return asyncJob;
    }

    public void close() {
        try {
            scheduledExecutorService.awaitTermination(30, TimeUnit.SECONDS);
            scheduledExecutorService.shutdownNow();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
