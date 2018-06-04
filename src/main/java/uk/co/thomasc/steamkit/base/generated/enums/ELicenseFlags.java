package uk.co.thomasc.steamkit.base.generated.enums;

import java.util.EnumSet;

public enum ELicenseFlags {

    None(0),
    Renew(0x01),
    RenewalFailed(0x02),
    Pending(0x04),
    Expired(0x08),
    CancelledByUser(0x10),
    CancelledByAdmin(0x20),
    LowViolenceContent(0x40),
    ImportedFromSteam2(0x80),
    ForceRunRestriction(0x100),
    RegionRestrictionExpired(0x200),
    CancelledByFriendlyFraudLock(0x400),
    NotActivated(0x800),

    ;

    private final int code;

    ELicenseFlags(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EnumSet<ELicenseFlags> from(int code) {
        EnumSet<ELicenseFlags> set = EnumSet.noneOf(ELicenseFlags.class);
        for (ELicenseFlags e : ELicenseFlags.values()) {
            if ((e.code & code) == e.code) {
                set.add(e);
            }
        }
        return set;
    }

    public static int code(EnumSet<ELicenseFlags> flags) {
        int code = 0;
        for (ELicenseFlags flag : flags) {
            code |= flag.code;
        }
        return code;
    }
}
