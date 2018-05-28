package uk.co.thomasc.steamkit.util.util;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;

public class NetHelpers {
    public static InetAddress getIPAddress(long ipAddr) {
        final ByteBuffer buff = ByteBuffer.allocate(4);
        buff.putInt((int) ipAddr);

        try {
            return InetAddress.getByAddress(buff.array());
        } catch (final UnknownHostException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static int getIPAddress(InetAddress ip) {
        final ByteBuffer buff = ByteBuffer.wrap(ip.getAddress());
        return (int) (buff.getInt() & 0xFFFFFFFFL);
    }

    public static long ipToLong(String ipAddress) {
        String[] ipAddressInArray = ipAddress.split("\\.");
        long result = 0;
        for (int i = 0; i < ipAddressInArray.length; i++) {
            int power = 3 - i;
            int ip = Integer.parseInt(ipAddressInArray[i]);
            result += ip * Math.pow(256, power);

        }
        return result;
    }
}
