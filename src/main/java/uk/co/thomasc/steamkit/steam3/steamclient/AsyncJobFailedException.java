package uk.co.thomasc.steamkit.steam3.steamclient;

public class AsyncJobFailedException extends RuntimeException {

    public AsyncJobFailedException() {
    }

    public AsyncJobFailedException(String message) {
        super(message);
    }

    public AsyncJobFailedException(String message, Throwable cause) {
        super(message, cause);
    }
}
