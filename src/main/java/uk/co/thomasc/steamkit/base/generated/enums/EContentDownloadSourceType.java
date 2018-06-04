package uk.co.thomasc.steamkit.base.generated.enums;


public enum EContentDownloadSourceType {

    Invalid(0),
    CS(1),
    CDN(2),
    LCS(3),
    ProxyCache(4),
    LANPeer(5),
    Max(5),

    ;

    private final int code;

    EContentDownloadSourceType(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EContentDownloadSourceType from(int code) {
        for (EContentDownloadSourceType e : EContentDownloadSourceType.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
