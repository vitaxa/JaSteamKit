package uk.co.thomasc.steamkit.steam3.discovery;

import uk.co.thomasc.steamkit.networking.steam3.ProtocolType;

import java.util.Date;

public class ServerInfo {
    private ServerRecord record;

    private ProtocolType protocol;

    private Date lastBadConnection;

    public ServerInfo(ServerRecord record, ProtocolType protocol) {
        this.record = record;
        this.protocol = protocol;
    }

    public ServerRecord getRecord() {
        return record;
    }

    public ProtocolType getProtocol() {
        return protocol;
    }

    public Date getLastBadConnection() {
        return lastBadConnection;
    }

    public void setLastBadConnection(Date lastBadConnection) {
        this.lastBadConnection = lastBadConnection;
    }
}
