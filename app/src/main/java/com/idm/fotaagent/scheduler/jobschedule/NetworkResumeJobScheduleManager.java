package com.idm.fotaagent.scheduler.jobschedule;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.PersistableBundle;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.network.DLNetworkChecker;
import com.idm.fotaagent.enabler.network.DMNetworkChecker;
import com.idm.fotaagent.enabler.network.NetworkBlockedType;
import com.idm.fotaagent.enabler.network.WifiOnlyChecker;
import com.samsung.android.fotaagent.common.feature.InRoaming;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.fotaagent.common.util.TimeConstants;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.function.IntConsumer;

/* loaded from: classes.dex */
public class NetworkResumeJobScheduleManager {
    static final String KEY_TASKID = "TASKID";
    private static final int NETWORK_RESUME_JOB_ID = 760745591;

    /* renamed from: com.idm.fotaagent.scheduler.jobschedule.NetworkResumeJobScheduleManager$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$idm$fotaagent$enabler$network$NetworkBlockedType;

        static {
            int[] iArr = new int[NetworkBlockedType.values().length];
            $SwitchMap$com$idm$fotaagent$enabler$network$NetworkBlockedType = iArr;
            try {
                iArr[NetworkBlockedType.NO_BLOCKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$enabler$network$NetworkBlockedType[NetworkBlockedType.WIFI_DISCONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$enabler$network$NetworkBlockedType[NetworkBlockedType.NETWORK_DISCONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$idm$fotaagent$enabler$network$NetworkBlockedType[NetworkBlockedType.ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface NetworkResumeType {
    }

    public static void cancel(Context context) {
        Log.I("cancel NetworkResumeJobService");
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService(JobScheduler.class);
        if (jobScheduler == null) {
            Log.W("JobScheduler is null");
        } else {
            jobScheduler.cancel(NETWORK_RESUME_JOB_ID);
        }
    }

    private static JobInfo generateJobInfo(Context context, NetworkRequest networkRequest, boolean z4) {
        ComponentName componentName = new ComponentName(context, (Class<?>) NetworkResumeJobService.class);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(KEY_TASKID, getTaskId());
        JobInfo.Builder extras = new JobInfo.Builder(NETWORK_RESUME_JOB_ID, componentName).setRequiredNetwork(networkRequest).setExtras(persistableBundle);
        if (z4) {
            extras.setMinimumLatency(TimeConstants.HOUR_IN_MILLIS);
        }
        return extras.build();
    }

    private static NetworkRequest generateNetworkRequest(int... iArr) {
        final NetworkRequest.Builder builder = new NetworkRequest.Builder();
        Arrays.stream(iArr).forEach(new IntConsumer() { // from class: com.idm.fotaagent.scheduler.jobschedule.a
            @Override // java.util.function.IntConsumer
            public final void accept(int i5) {
                builder.addTransportType(i5);
            }
        });
        builder.addCapability(12);
        builder.addCapability(16);
        builder.removeCapability(15);
        if (InRoaming.get() != InRoaming.MOBILE_ALLOWED) {
            builder.addCapability(18);
        }
        return builder.build();
    }

    private static String getTaskId() {
        return new ActionInfoDao().getSessionId();
    }

    private static boolean isPendingJobService(Context context) {
        Log.I("check NetworkResumeJobService");
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService(JobScheduler.class);
        if (jobScheduler == null) {
            Log.W("JobScheduler is null");
            return false;
        }
        if (jobScheduler.getPendingJob(NETWORK_RESUME_JOB_ID) != null) {
            Log.I("jobInfo is not null");
            return true;
        }
        Log.I("jobInfo is null");
        return false;
    }

    public static void reScheduleIfExistPendingJob(Context context) {
        if (isPendingJobService(context)) {
            schedule(context);
        }
    }

    public static void schedule(Context context) {
        NetworkBlockedType networkBlockedType;
        boolean zIsWifiOnlyForDl;
        boolean z4;
        if (new ActionInfoDao(getTaskId()).isReportFumoStatus()) {
            networkBlockedType = DMNetworkChecker.getInstance().getNetworkBlockedType(getTaskId());
            zIsWifiOnlyForDl = WifiOnlyChecker.getInstance().isWifiOnly();
        } else {
            networkBlockedType = DLNetworkChecker.getInstance().getNetworkBlockedType(getTaskId());
            zIsWifiOnlyForDl = WifiOnlyChecker.getInstance().isWifiOnlyForDl(getTaskId());
        }
        int i5 = AnonymousClass1.$SwitchMap$com$idm$fotaagent$enabler$network$NetworkBlockedType[networkBlockedType.ordinal()];
        if (i5 == 1) {
            z4 = true;
        } else if (i5 != 2) {
            z4 = false;
        } else {
            z4 = false;
            zIsWifiOnlyForDl = true;
        }
        if (zIsWifiOnlyForDl) {
            schedule(context, z4, 1);
        } else {
            schedule(context, z4, 0, 1);
        }
    }

    private static void scheduleJobInfo(Context context, JobInfo jobInfo) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService(JobScheduler.class);
        if (jobScheduler == null) {
            Log.W("JobScheduler is null");
        } else {
            Log.I("schedule - ".concat(jobScheduler.schedule(jobInfo) == 1 ? "SUCCESS" : "FAIL"));
        }
    }

    public static void scheduleWithLatencyMobileOnly(Context context) {
        schedule(context, true, 0);
    }

    public static void scheduleWithWifiOnly(Context context) {
        schedule(context, false, 1);
    }

    private static void schedule(Context context, boolean z4, int... iArr) {
        Log.I("start NetworkResumeJobService");
        for (int i5 : iArr) {
            Log.I("required network type - ".concat(i5 == 1 ? "WIFI" : "CELLULAR"));
        }
        scheduleJobInfo(context, generateJobInfo(context, generateNetworkRequest(iArr), z4));
    }
}
