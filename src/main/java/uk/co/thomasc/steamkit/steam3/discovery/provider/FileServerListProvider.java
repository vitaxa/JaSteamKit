package uk.co.thomasc.steamkit.steam3.discovery.provider;

import uk.co.thomasc.steamkit.base.generated.discovery.BasicServerListProtos;
import uk.co.thomasc.steamkit.base.generated.discovery.BasicServerListProtos.BasicServerList;
import uk.co.thomasc.steamkit.networking.steam3.ProtocolType;
import uk.co.thomasc.steamkit.steam3.discovery.ServerRecord;
import uk.co.thomasc.steamkit.util.logging.DebugLog;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Server provider that stores servers in a file using protobuf.
 */
public class FileServerListProvider implements IServerListProvider {

    private File file;

    /**
     * Instantiates a {@link FileServerListProvider} object.
     *
     * @param file the file that will store the servers
     */
    public FileServerListProvider(File file) {
        if (file == null) {
            throw new IllegalArgumentException("file is null");
        }
        this.file = file;

        try {
            if (!file.exists()) {
                file.getAbsoluteFile().getParentFile().mkdirs();
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<ServerRecord> fetchServerList() {
        try (FileInputStream fis = new FileInputStream(file)) {
            List<ServerRecord> records = new ArrayList<>();
            BasicServerList serverList = BasicServerList.parseFrom(fis);
            for (int i = 0; i < serverList.getServersCount(); i++) {
                BasicServerListProtos.BasicServer server = serverList.getServers(i);
                records.add(ServerRecord.createServer(
                        server.getAddress(),
                        server.getPort(),
                        ProtocolType.from(server.getProtocol())
                ));
            }

            fis.close();

            return records;
        } catch (FileNotFoundException e) {
            DebugLog.writeLine("FileServerListProvider", "servers list file not found");
        } catch (IOException e) {
            DebugLog.writeLine("FileServerListProvider", "Failed to read server list file " + file.getAbsolutePath());
        }
        return null;
    }

    @Override
    public void updateServerList(List<ServerRecord> endpoints) {
        BasicServerList.Builder builder = BasicServerList.newBuilder();

        for (ServerRecord endpoint : endpoints) {
            builder.addServers(
                    BasicServerListProtos.BasicServer.newBuilder()
                            .setAddress(endpoint.getHost())
                            .setPort(endpoint.getPort())
                            .setProtocol(ProtocolType.code(endpoint.getProtocolTypes()))
            );
        }

        try (FileOutputStream fos = new FileOutputStream(file, false)) {
            builder.build().writeTo(fos);
            fos.flush();
            fos.close();
        } catch (IOException e) {
            DebugLog.writeLine("FileServerListProvider", "Failed to write servers to file " + file.getAbsolutePath());
            DebugLog.printStackTrace("FileServerListProvider", e);
        }
    }
}
