package uk.co.thomasc.steamkit.base.generated.enums;


public enum EOSType {

    Unknown(-1),
    Web(-700),
    IOSUnknown(-600),
    AndroidUnknown(-500),
    UMQ(-400),
    PS3(-300),
    MacOSUnknown(-102),
    MacOS104(-101),
    MacOS105(-100),
    MacOS1058(-99),
    MacOS106(-95),
    MacOS1063(-94),
    MacOS1064_slgu(-93),
    MacOS1067(-92),
    MacOS107(-90),
    MacOS108(-89),
    MacOS109(-88),
    MacOS1010(-87),
    MacOS1011(-86),
    MacOS1012(-85),
    Macos1013(-84),
    Macos1014(-83),
    MacOSMax(-1),
    LinuxUnknown(-203),
    Linux22(-202),
    Linux24(-201),
    Linux26(-200),
    Linux32(-199),
    Linux35(-198),
    Linux36(-197),
    Linux310(-196),
    Linux316(-195),
    Linux318(-194),
    Linux3x(-193),
    Linux4x(-192),
    Linux41(-191),
    Linux44(-190),
    Linux49(-189),
    LinuxMax(-101),
    WinUnknown(0),
    Win311(1),
    Win95(2),
    Win98(3),
    WinME(4),
    WinNT(5),
    Win2000(6),
    WinXP(7),
    Win2003(8),
    WinVista(9),
    Windows7(10),
    Win2008(11),
    Win2012(12),
    Windows8(13),
    Windows81(14),
    Win2012R2(15),
    Windows10(16),
    Win2016(17),
    WinMAX(18),
    Max(26),

    ;

    private final int code;

    EOSType(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EOSType from(int code) {
        for (EOSType e : EOSType.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
