package uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr;

import uk.co.thomasc.steamkit.types.JobID;

/**
 * A callback message
 */
public interface ICallbackMsg {
    JobID getJobID();

    void setJobID(JobID jobID);
}
