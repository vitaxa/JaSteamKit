package uk.co.thomasc.steamkit.util.cSharp.events;

public interface EventHandler<T extends EventArgs> {
    void handleEvent(Object sender, T e);
}
