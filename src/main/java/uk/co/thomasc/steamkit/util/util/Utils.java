package uk.co.thomasc.steamkit.util.util;

import uk.co.thomasc.steamkit.base.generated.enums.EOSType;

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

}
