package uk.co.thomasc.steamkit.steam3.discovery;

import uk.co.thomasc.steamkit.util.cSharp.ip.IPEndPoint;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class SmartCMServerList {

    private static final long BAD_CONNECTION_TIMEOUT_MIN = 5;

    private IServerListProvider serverListProvider;

    private final List<ServerInfo> serverList;

    public SmartCMServerList(IServerListProvider serverListProvider) {
        this.serverListProvider = Objects.requireNonNull(serverListProvider, "ServerListProvider can't be null");
        this.serverList = Collections.synchronizedList(serverListProvider.provideServerList());
    }

    public void fetchServerList() {
        serverList.clear();
        serverList.addAll(serverListProvider.provideServerList());
    }

    public IPEndPoint getNextServerCandidate() {
        synchronized (serverList) {
            // If we have bad ips then filter them
            final List<ServerInfo> badIpList = serverList.stream()
                    .filter(serverInfo -> serverInfo.getLastBadConnectionTime() != null)
                    .collect(Collectors.toList());
            if (!badIpList.isEmpty()) {
                final List<ServerInfo> goodIpList = filterBadIpList(badIpList);
                if (!goodIpList.isEmpty()) {
                    goodIpList.forEach(serverInfo -> markServer(serverInfo.getIpEndPoint(), ServerQuality.GOOD));
                    return goodIpList.get(new Random().nextInt(goodIpList.size())).getIpEndPoint();
                }
            }
            final ServerInfo serverInfo = serverList.get(new Random().nextInt(serverList.size()));
            return serverInfo.getIpEndPoint();
        }
    }

    public void markServer(IPEndPoint ipEndPoint, ServerQuality quality) {
        synchronized (serverList) {
            final Optional<ServerInfo> serverInfoOptional = serverList.stream()
                    .filter(serverInfo -> serverInfo.getIpEndPoint().equals(ipEndPoint)).findFirst();
            serverInfoOptional.ifPresent(serverInfo -> {
                ServerInfo newServerInfo;
                if (quality == ServerQuality.BAD) {
                    newServerInfo = serverInfo.setLastBadConnectionTime(LocalDate.now());
                } else {
                    newServerInfo = serverInfo.setLastBadConnectionTime(null);
                }
                final int index = serverList.indexOf(serverInfo);
                serverList.set(index, newServerInfo);
            });
        }
    }

    public IPEndPoint[] getAllEndPoints() {
        IPEndPoint[] ipEndPoints = new IPEndPoint[serverList.size()];
        synchronized (serverList) {
            final List<IPEndPoint> ipEndPointList = serverList.stream()
                    .map(ServerInfo::getIpEndPoint).collect(Collectors.toList());
            ipEndPointList.toArray(ipEndPoints);
            return ipEndPoints;
        }
    }

    public List<ServerInfo> getUnmodifiableServerList() {
        return Collections.unmodifiableList(serverList);
    }

    private List<ServerInfo> filterBadIpList(List<ServerInfo> badIpList) {
        return badIpList.stream()
                .filter(serverInfo -> {
                    final LocalDate lastBadConnectionTime = serverInfo.getLastBadConnectionTime();
                    if (lastBadConnectionTime == null) return true;
                    final long min = ChronoUnit.MINUTES.between(lastBadConnectionTime, LocalDate.now());
                    if (min > BAD_CONNECTION_TIMEOUT_MIN) {
                        serverInfo.setLastBadConnectionTime(null);
                        return true;
                    }
                    return false;
                }).collect(Collectors.toList());
    }
}
