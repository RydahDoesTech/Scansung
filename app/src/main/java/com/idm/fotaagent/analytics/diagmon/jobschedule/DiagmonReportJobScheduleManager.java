package com.idm.fotaagent.analytics.diagmon.jobschedule;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.PersistableBundle;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class DiagmonReportJobScheduleManager {
    private static final int DIAGMON_REPORT_JOB_ID = 760745592;

    private static JobInfo generateJobInfo(Context context, NetworkRequest networkRequest, PersistableBundle persistableBundle) {
        return new JobInfo.Builder(DIAGMON_REPORT_JOB_ID, new ComponentName(context, (Class<?>) DiagmonReportJobService.class)).setRequiredNetwork(networkRequest).setExtras(persistableBundle).setPersisted(true).build();
    }

    private static NetworkRequest generateNetworkRequest() {
        return new NetworkRequest.Builder().addCapability(12).addCapability(16).addCapability(11).removeCapability(15).addTransportType(1).build();
    }

    public static void schedule(Context context, PersistableBundle persistableBundle) {
        scheduleJobInfo(context, generateJobInfo(context, generateNetworkRequest(), persistableBundle));
    }

    private static void scheduleJobInfo(Context context, JobInfo jobInfo) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService(JobScheduler.class);
        if (jobScheduler == null) {
            Log.W("JobScheduler is null");
        } else {
            Log.I("DiagmonReportJobSchedule - ".concat(jobScheduler.schedule(jobInfo) == 1 ? "SUCCESS" : "FAIL"));
        }
    }
}
