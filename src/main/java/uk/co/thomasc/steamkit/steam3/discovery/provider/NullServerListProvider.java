package uk.co.thomasc.steamkit.steam3.discovery.provider;

import uk.co.thomasc.steamkit.steam3.discovery.ServerRecord;

import java.util.List;

/**
 * @author lngtr
 * @since 2018-02-20
 */
public class NullServerListProvider implements IServerListProvider {
    @Override
    public List<ServerRecord> fetchServerList() {
        return null;
    }

    @Override
    public void updateServerList(List<ServerRecord> endpoints) {

    }
}
