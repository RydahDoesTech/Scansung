package com.idm.fotaagent.scheduler.jobschedule;

import android.app.job.JobParameters;
import android.app.job.JobService;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.scheduler.IDMSchedulerHandler;
import com.idm.fotaagent.scheduler.intentresume.IDMIntentResumeExecutor;
import com.idm.fotaagent.scheduler.interfaces.IDMSchedulerInterface;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class NetworkResumeJobService extends JobService {
    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Log.I("");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        Log.I("");
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        Log.I("");
        String string = jobParameters.getExtras().getString("TASKID");
        if (string == null) {
            Log.W("task ID should be not null. network resume is not executed.");
            return false;
        }
        if (new ActionInfoDao().exists(string)) {
            IDMSchedulerHandler.getInstance().idmSendMessage(IDMSchedulerInterface.IDM_SCHEDULE_EVENT.SCHEDULE_EVENT_INTENT_RESUME, IDMIntentResumeExecutor.NETWORK_RESUME, 0L);
            return false;
        }
        Log.W("actionInfo for taskId " + string + " doesn't exist. It may have changed the taskId before the Job Scheduler worked so that network resume is not executed.");
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        Log.I("");
        return true;
    }
}
