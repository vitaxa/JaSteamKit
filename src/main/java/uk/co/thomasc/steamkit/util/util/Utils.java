package uk.co.thomasc.steamkit.util.util;

import uk.co.thomasc.steamkit.base.generated.enums.EOSType;

import java.util.zip.CRC32;
import java.util.zip.Checksum;

public class Utils {

    private static String OS = System.getProperty("os.name").toLowerCase();

    public static EOSType getOSType() {
        if (isWindows()) {
            return EOSType.Windows10;
        }
        if (isMac()) {
            return EOSType.MacOSUnknown;
        }
        if (isUnix()) {
            return EOSType.LinuxUnknown;
        }
        return EOSType.Unknown;
    }

    private static boolean isWindows() {
        return (OS.contains("win"));
    }

    private static boolean isMac() {
        return (OS.contains("mac"));
    }

    private static boolean isUnix() {
        return (OS.contains("nix") || OS.contains("nux") || OS.indexOf("aix") > 0 );
    }

    /**
     * Convenience method for calculating the CRC32 checksum of a string.
     *
     * @param s the string
     * @return long value of the CRC32
     */
    public static long crc32(String s) {
        Checksum checksum = new CRC32();
        byte[] bytes = s.getBytes();
        checksum.update(bytes, 0, bytes.length);
        return checksum.getValue();
    }

}
