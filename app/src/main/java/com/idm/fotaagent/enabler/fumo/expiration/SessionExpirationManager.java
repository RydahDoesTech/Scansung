package com.idm.fotaagent.enabler.fumo.expiration;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import com.idm.fotaagent.database.room.data.repository.FotaJobRepository;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class SessionExpirationManager {
    public static final String KEY_SCHEDULED_TIME = "SCHEDULEDTIME";
    static final String KEY_TASKID = "TASKID";

    private static JobInfo buildJobInfo(Context context, String str, SessionExpiration sessionExpiration) {
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(KEY_TASKID, str);
        persistableBundle.putString(KEY_SCHEDULED_TIME, String.valueOf(sessionExpiration.getLatencyInMillis() + System.currentTimeMillis()));
        return new JobInfo.Builder(sessionExpiration.getJobId(), new ComponentName(context, sessionExpiration.getServiceClass())).setPersisted(true).setMinimumLatency(sessionExpiration.getLatencyInMillis()).setExtras(persistableBundle).build();
    }

    public static void cancel(Context context) {
        Log.I("cancel expiration timers");
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService(JobScheduler.class);
        if (jobScheduler == null) {
            Log.W("JobScheduler is null");
            return;
        }
        jobScheduler.cancel(SessionExpiration.EXPIRATION_NOTIFY.getJobId());
        jobScheduler.cancel(SessionExpiration.EXPIRATION_CANCEL.getJobId());
        new FotaJobRepository(context).setExpirationNotify(false);
    }

    public static void reschedule(Context context, String str, SessionExpiration sessionExpiration) {
        Log.I("reschedule expiration : " + sessionExpiration);
        schedule(context, str, sessionExpiration);
    }

    public static void schedule(Context context, String str) {
        Log.I("schedule expiration timers");
        if (((JobScheduler) context.getSystemService(JobScheduler.class)) == null) {
            Log.W("JobScheduler is null");
        } else {
            schedule(context, str, SessionExpiration.EXPIRATION_NOTIFY);
            schedule(context, str, SessionExpiration.EXPIRATION_CANCEL);
        }
    }

    public static void schedule(Context context, String str, SessionExpiration sessionExpiration) {
        Log.I("schedule expiration timers for : " + sessionExpiration);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService(JobScheduler.class);
        if (jobScheduler == null) {
            Log.W("JobScheduler is null");
        } else {
            Log.I("schedule - ".concat(jobScheduler.schedule(buildJobInfo(context, str, sessionExpiration)) == 1 ? "SUCCESS" : "FAIL"));
        }
    }
}
