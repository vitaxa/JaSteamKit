package uk.co.thomasc.steamkit.types;

import uk.co.thomasc.steamkit.steam3.steamclient.AsyncJobFailedException;
import uk.co.thomasc.steamkit.steam3.steamclient.SteamClient;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.ICallbackMsg;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

public class SimpleAsyncJob<T extends ICallbackMsg> extends AsyncJob<T> {

    private CompletableFuture<T> task;

    private final CountDownLatch countDownLatch = new CountDownLatch(1);

    private final AtomicReference<T> result = new AtomicReference<>();

    private Consumer<AsyncJobFailedException> exceptionHandler;

    public SimpleAsyncJob(SteamClient steamClient, JobID jobID) {
        this(steamClient, jobID, null);
    }

    public SimpleAsyncJob(SteamClient steamClient, JobID jobID, Consumer<AsyncJobFailedException> exceptionHandler) {
        super(steamClient, jobID);
        final ExecutorService executor = Executors.newSingleThreadExecutor();
        this.task = CompletableFuture
                .supplyAsync(() -> {
                    try {
                        countDownLatch.await();
                        return result.get();
                    } catch (InterruptedException ignored) {
                    }
                    return null;
                }, executor);
        task.thenRun(() -> {
            try {
                executor.awaitTermination(4, TimeUnit.SECONDS);
                executor.shutdownNow();
            } catch (InterruptedException ignored) {
            }
        });
        this.exceptionHandler = exceptionHandler;
    }

    @Override
    public boolean addResult(T callbackMsg) {
        if (callbackMsg == null) {
            throw new IllegalArgumentException("callbackMsg can't be null");
        }

        // we're complete with just this callback
        result.set(callbackMsg);
        countDownLatch.countDown();

        // inform steamclient that this job wishes to be removed from tracking since we've recieved the single callback we were waiting for
        return true;
    }

    @Override
    public T getResult() {
        try {
            return task.get(60, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void getResult(Consumer<? super T> consumer) {
        task.thenAccept(consumer);
    }

    @Override
    public void setFailed(boolean dueToRemoteFailure) {
        if (dueToRemoteFailure) {
            if (exceptionHandler != null) {
                exceptionHandler.accept(new AsyncJobFailedException());
            }
        } else {
            task.cancel(true);
        }
    }
}
