package uk.co.thomasc.steamkit.util.cSharp.events;

public interface ActionT<T> extends Action {

    @Override
    default void call() {
        call(null);
    };

    void call(T obj);
}
