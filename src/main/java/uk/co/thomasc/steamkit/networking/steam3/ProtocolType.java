package uk.co.thomasc.steamkit.networking.steam3;

import java.util.EnumSet;

public enum ProtocolType {

    TCP(1),

    UDP(1 << 1);

    public static final EnumSet<ProtocolType> ALL = EnumSet.of(TCP, UDP);

    private final int code;

    ProtocolType(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EnumSet<ProtocolType> from(int code) {
        EnumSet<ProtocolType> set = EnumSet.noneOf(ProtocolType.class);
        for (ProtocolType e : ProtocolType.values()) {
            if ((e.code & code) == e.code) {
                set.add(e);
            }
        }
        return set;
    }

    public static int code(EnumSet<ProtocolType> flags) {
        int code = 0;
        for (ProtocolType flag : flags) {
            code |= flag.code;
        }
        return code;
    }
}
