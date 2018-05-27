package uk.co.thomasc.steamkit.types;

import uk.co.thomasc.steamkit.types.ugc.GlobalID;

public final class JobID extends GlobalID {

    /**
     * Represents an invalid JobID.
     */
    public static final JobID INVALID = new JobID();

    /**
     * Initializes a new instance of the {@link JobID} class.
     */
    public JobID() {
        super();
    }

    /**
     * Initializes a new instance of the {@link JobID} class.
     *
     * @param gid The Job ID to initialize this instance with.
     */
    public JobID(long gid) {
        super(gid);
    }

}
