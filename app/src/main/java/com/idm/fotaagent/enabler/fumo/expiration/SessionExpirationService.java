package com.idm.fotaagent.enabler.fumo.expiration;

import android.app.ActivityManager;
import android.app.job.JobParameters;
import android.app.job.JobService;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.FotaJobRepository;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.ui.installconfirm.InstallCountDown;
import com.idm.fotaagent.scheduler.SoftwareUpdateCanceller;
import com.idm.fotaagent.scheduler.exception.WrongInitTypeException;
import com.idm.fotaagent.scheduler.interfaces.IDMSchedulerInterface;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class SessionExpirationService extends JobService {

    public static class ForCancel extends SessionExpirationService {
        private String getCurrentTaskId() {
            return new ActionInfoDao().getSessionId();
        }

        private boolean isCancellableFumoStatus(String str) {
            int[] iArr = {200, 30, IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_PAUSE, 35, 40, 50};
            int fumoStatus = new ActionInfoDao(str).getFumoStatus();
            for (int i5 = 0; i5 < 6; i5++) {
                if (fumoStatus == iArr[i5]) {
                    return true;
                }
            }
            return false;
        }

        private boolean isFotaAgentScreen() {
            return loadTopPackageName().contains(getApplicationContext().getPackageName());
        }

        private boolean isNotAllowedExecuteCancel(String str) {
            int fumoStatus = new ActionInfoDao(str).getFumoStatus();
            if (fumoStatus == 30 && IDMApplication.getEnablerFactory().getLibraryUtils().isTaskRunning(str)) {
                Log.I("Download in progress. ignore");
                return true;
            }
            if (fumoStatus == 50 && InstallCountDown.get().isRunning()) {
                Log.I("Install countdown is running. ignore");
                return true;
            }
            if (!isFotaAgentScreen()) {
                return false;
            }
            Log.I("FotaAgent screen is showing. ignore");
            return true;
        }

        public String loadTopPackageName() throws SecurityException {
            try {
                ActivityManager activityManager = (ActivityManager) getApplicationContext().getSystemService(ActivityManager.class);
                Objects.requireNonNull(activityManager, "am should not be null");
                List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
                Objects.requireNonNull(runningTasks, "tasks should not be null");
                return runningTasks.get(0).topActivity.getPackageName();
            } catch (IndexOutOfBoundsException | NullPointerException e5) {
                Log.printStackTrace(e5);
                return "";
            }
        }

        @Override // android.app.job.JobService
        public boolean onStartJob(JobParameters jobParameters) {
            Log.I("");
            String string = jobParameters.getExtras().getString("TASKID");
            String currentTaskId = getCurrentTaskId();
            if (!isCancellableFumoStatus(currentTaskId)) {
                Log.W("Not cancelable fumo status. ignore");
                return false;
            }
            if (!currentTaskId.equals(string)) {
                Log.W("different taskId. reschedule 30 days");
                if (new FotaJobRepository(getApplicationContext()).getExpirationNotify()) {
                    SessionExpirationManager.reschedule(getApplicationContext(), currentTaskId, SessionExpiration.EXPIRATION_CANCEL);
                    return false;
                }
                SessionExpirationManager.schedule(getApplicationContext(), currentTaskId);
                return false;
            }
            if (isNotAllowedExecuteCancel(currentTaskId)) {
                Log.I("Not allowed to execute cancellation. reschedule 1 day");
                SessionExpirationManager.reschedule(getApplicationContext(), currentTaskId, SessionExpiration.RESCHEDULE_CANCEL);
                return false;
            }
            try {
                SoftwareUpdateCanceller.forScheduleType(IDMSchedulerInterface.IDM_SCHEDULE_TYPE.SCHEDULE_TYPE_SU_CANCEL_BY_SESSION_EXPIRATION).execute();
            } catch (WrongInitTypeException e5) {
                Log.printStackTrace(e5);
            }
            return false;
        }
    }

    public static class ForNotify extends SessionExpirationService {
        @Override // android.app.job.JobService
        public boolean onStartJob(JobParameters jobParameters) {
            Log.I("");
            new FotaJobRepository(getApplicationContext()).setExpirationNotify(true);
            return false;
        }
    }

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
    public boolean onStopJob(JobParameters jobParameters) {
        Log.E("should not reach here: " + jobParameters);
        return false;
    }
}
