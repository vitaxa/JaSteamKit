package uk.co.thomasc.steamkit.base.generated.steamlanguage;


public enum EClanRelationship {

    None(0),
    Blocked(1),
    Invited(2),
    Member(3),
    Kicked(4),
    KickAcknowledged(5),

    ;

    private final int code;

    EClanRelationship(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

    public static EClanRelationship from(int code) {
        for (EClanRelationship e : EClanRelationship.values()) {
            if (e.code == code) {
                return e;
            }
        }
        return null;
    }
}
