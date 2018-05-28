package uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr;

import uk.co.thomasc.steamkit.types.JobID;

public class CallbackMsg implements ICallbackMsg {

    private JobID jobID = JobID.INVALID;

    @Override
    public JobID getJobID() {
        return this.jobID;
    }

    @Override
    public void setJobID(JobID jobID) {
        this.jobID = jobID;
    }
}
