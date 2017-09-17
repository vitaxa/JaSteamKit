package uk.co.thomasc.steamkit.steam3.discovery;

import uk.co.thomasc.steamkit.util.cSharp.ip.IPEndPoint;

import java.time.LocalDate;

public class ServerInfo {
    private IPEndPoint ipEndPoint;
    private LocalDate lastBadConnectionTime;

    public ServerInfo(IPEndPoint ipEndPoint) {
        this.ipEndPoint = ipEndPoint;
        this.lastBadConnectionTime = null;
    }

    public ServerInfo(IPEndPoint ipEndPoint, LocalDate lastBadConnectionTime) {
        this.ipEndPoint = ipEndPoint;
        this.lastBadConnectionTime = lastBadConnectionTime;
    }

    public IPEndPoint getIpEndPoint() {
        return ipEndPoint;
    }

    public ServerInfo setIpEndPoint(IPEndPoint ipEndPoint) {
        this.ipEndPoint = ipEndPoint;
        return this;
    }

    public LocalDate getLastBadConnectionTime() {
        return lastBadConnectionTime;
    }

    public ServerInfo setLastBadConnectionTime(LocalDate lastBadConnectionTime) {
        this.lastBadConnectionTime = lastBadConnectionTime;
        return this;
    }
}
