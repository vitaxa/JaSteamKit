package uk.co.thomasc.steamkit.steam3.discovery;

import uk.co.thomasc.steamkit.util.cSharp.ip.IPEndPoint;

import java.io.IOException;
import java.util.List;

@FunctionalInterface
public interface IServerListProvider {
    public List<IPEndPoint> provideServerList() throws IOException;
}
