package com.idm.fotaagent.enabler.ui.downloadprogress;

import android.os.SystemClock;
import androidx.lifecycle.F;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.FotaJobRepository;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationType;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTypeManager;
import com.idm.fotaagent.utils.Formatted;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class DownloadProgressInfo {
    private static final String DEFAULT_FORMATTED_REMAINING_TIME = "--:--:--";
    private static final RemainingTimeEstimator remainingTimeEstimator = new RemainingTimeEstimator();
    private static final F formattedRemainingTime = new F("");
    private static final F percent = new F(0);

    public static class RemainingTimeEstimator {
        private static final int DECAY_EXPONENT_RECIPROCAL = 6;
        private static final long MIN_REMAINING_TIME_DELTA_IN_MS = 500;
        private static final long MIN_SAMPLING_INTERVAL_IN_MS = 100;
        private static final long ON_STARTED = -1;
        private long cumulativeDownloadSize;
        private long downloadRate;
        private long remainingTimeInMillis;
        private long timestampInMillis;
        private long totalSize;

        private RemainingTimeEstimator() {
            this.remainingTimeInMillis = -1L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean estimate(long j5) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j6 = this.timestampInMillis;
            long j7 = jElapsedRealtime - j6;
            if (j6 != -1) {
                long j8 = j5 - this.cumulativeDownloadSize;
                long j9 = this.remainingTimeInMillis;
                if (estimateDownloadRate(j7, j8)) {
                    this.cumulativeDownloadSize = j5;
                    this.timestampInMillis = jElapsedRealtime;
                    this.remainingTimeInMillis = (this.totalSize - j5) / this.downloadRate;
                }
                return Math.abs(this.remainingTimeInMillis - j9) > 500;
            }
            this.cumulativeDownloadSize = j5;
            this.downloadRate = 0L;
            this.timestampInMillis = jElapsedRealtime;
            Log.V("start downloading at " + this.timestampInMillis + " with cumulative: " + this.cumulativeDownloadSize + " Byte total: " + this.totalSize + "Byte");
            return false;
        }

        private boolean estimateDownloadRate(long j5, long j6) {
            if (j5 < MIN_SAMPLING_INTERVAL_IN_MS) {
                Log.V("interval is less than 100ms; wait for another sample");
                return false;
            }
            if (j6 == 0) {
                Log.V("sampleDownload size is zero; wait for another sample");
                return false;
            }
            long j7 = j6 / j5;
            Log.V("sample time: " + j5 + "ms size: " + j6 + "Byte sampleDownloadRate: " + j7 + "kBps");
            long j8 = this.downloadRate;
            if (j8 == 0) {
                Log.V("first sample, use it without smoothing");
                this.downloadRate = j7;
            } else {
                this.downloadRate = (((j8 << 6) - j8) + j7) >> 6;
            }
            Log.V("downloadRate: " + this.downloadRate + "kBps");
            return this.downloadRate != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getRemainingTimeInMillis() {
            return this.remainingTimeInMillis + 999;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void start(String str) {
            this.totalSize = new ActionInfoDao(str).getObjectSize();
            this.timestampInMillis = -1L;
            Log.V("");
        }
    }

    public static F getFormattedRemainingTime() {
        return formattedRemainingTime;
    }

    public static Integer getPercent() {
        return (Integer) percent.d();
    }

    public static F getPercentLiveData() {
        return percent;
    }

    public static void reset() {
        formattedRemainingTime.i("");
        percent.i(0);
    }

    public static void setFormattedRemainTime(long j5) {
        Log.V("" + j5);
        formattedRemainingTime.i(j5 >= 0 ? new Formatted.RemainingTime(j5).toString() : DEFAULT_FORMATTED_REMAINING_TIME);
    }

    public static void setPercent(int i5) {
        percent.i(Integer.valueOf(i5));
    }

    public static void start(String str) {
        remainingTimeEstimator.start(str);
    }

    public static void update(long j5, int i5, String str) {
        boolean zEstimate;
        long remainingTimeInMillis;
        if (i5 == 100) {
            remainingTimeInMillis = 0;
            zEstimate = true;
        } else {
            RemainingTimeEstimator remainingTimeEstimator2 = remainingTimeEstimator;
            zEstimate = remainingTimeEstimator2.estimate(j5);
            remainingTimeInMillis = remainingTimeEstimator2.getRemainingTimeInMillis();
        }
        if (zEstimate || (getPercent().intValue() != i5)) {
            new FotaJobRepository(IDMApplication.idmGetContext()).setRemainedDownloadTime(remainingTimeInMillis);
            setFormattedRemainTime(remainingTimeInMillis);
            setPercent(i5);
            updateUI(str);
        }
    }

    private static void updateUI(String str) {
        Log.V(percent + "% " + formattedRemainingTime);
        NotificationTypeManager.notify(NotificationType.IDM_NOTIFICATION_DOWNLOAD_PROGRESS, str);
    }
}
