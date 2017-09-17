package uk.co.thomasc.steamkit.steam3.discovery;

import java.util.List;

@FunctionalInterface
public interface IServerListProvider {
    public List<ServerInfo> provideServerList();
}
