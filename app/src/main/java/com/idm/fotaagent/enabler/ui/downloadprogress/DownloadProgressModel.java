package com.idm.fotaagent.enabler.ui.downloadprogress;

import E2.b;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import com.idm.exception.file.IDMExceptionFileNotFound;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.analytics.samsunganalytics.SAConstants;
import com.idm.fotaagent.analytics.samsunganalytics.SALogging;
import com.idm.fotaagent.database.room.data.repository.FotaJobRepository;
import com.idm.fotaagent.database.room.data.repository.h;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.fumo.IDMFumoExecuteHandler;
import com.idm.fotaagent.enabler.fumo.expiration.SessionExpiration;
import com.idm.fotaagent.enabler.fumo.expiration.SessionExpirationManager;
import com.idm.fotaagent.utils.Formatted;
import com.idm.fotaagent.utils.storage.FileManager;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.Flavor;
import com.wssyncmldm.R;
import java.util.Optional;

/* loaded from: classes.dex */
public class DownloadProgressModel {
    private final ActionInfoDao actionInfoDao;
    private final FotaJobRepository fotaJobRepository = new FotaJobRepository(IDMApplication.idmGetContext());
    private final String taskId;

    public static class TitleBodyAndButtons {
        private static final int NULL = -1;
        private final int mainBodyId;
        private final int mainTitleId;
        private final int pauseButtonId;
        private final int resumeButtonId;
        static final TitleBodyAndButtons DOWNLOADING = new TitleBodyAndButtons(R.string.STR_DOWNLOADING_UPDATE, -1, R.string.STR_BTN_PAUSE, -1);
        static final TitleBodyAndButtons DOWNLOADING_EMERGENCY = new TitleBodyAndButtons(R.string.STR_DOWNLOADING_UPDATE, -1, -1, -1);
        static final TitleBodyAndButtons PAUSE = new TitleBodyAndButtons(R.string.STR_DOWNLOAD_PAUSED, -1, -1, R.string.STR_BTN_RESUME_DOWNLOAD);
        static final TitleBodyAndButtons DOWNLOADING_WITHOUT_PAUSE = new TitleBodyAndButtons(R.string.STR_DOWNLOADING_UPDATE, -1, -1, -1);
        static final TitleBodyAndButtons PAUSE_EXPIRATION = new TitleBodyAndButtons(R.string.STR_DOWNLOAD_PAUSED, R.string.STR_DOWNLOADED_SOFTWARE_DELETED, -1, R.string.STR_BTN_RESUME_DOWNLOAD);

        private TitleBodyAndButtons(int i5, int i6, int i7, int i8) {
            this.mainTitleId = i5;
            this.mainBodyId = i6;
            this.pauseButtonId = i7;
            this.resumeButtonId = i8;
        }

        public String getMainBody() {
            if (this.mainBodyId == -1) {
                return null;
            }
            Context contextIdmGetContext = IDMApplication.idmGetContext();
            return Formatted.Android.longDateWeekDayAndTime(DownloadProgressModel.getScheduledExpirationTime(contextIdmGetContext), this.mainBodyId, contextIdmGetContext);
        }

        public String getMainTitle() {
            return IDMApplication.idmGetContext().getString(this.mainTitleId);
        }

        public String getPauseButton() {
            if (this.pauseButtonId == -1) {
                return null;
            }
            return IDMApplication.idmGetContext().getString(this.pauseButtonId);
        }

        public String getResumeButton() {
            if (this.resumeButtonId == -1) {
                return null;
            }
            return IDMApplication.idmGetContext().getString(this.resumeButtonId);
        }
    }

    public DownloadProgressModel(String str) {
        this.taskId = str;
        this.actionInfoDao = new ActionInfoDao(str);
    }

    private int getFumoStatus() {
        return this.actionInfoDao.getFumoStatus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long getScheduledExpirationTime(Context context) {
        return ((Long) Optional.ofNullable((JobScheduler) context.getSystemService(JobScheduler.class)).map(new b(24)).map(new b(25)).map(new h(11)).orElse(-1L)).longValue();
    }

    private String getTaskId() {
        return this.taskId;
    }

    private boolean isEmergencyServiceType() {
        return this.fotaJobRepository.isEmergencyService();
    }

    private boolean isExpirationNotify() {
        Context contextIdmGetContext = IDMApplication.idmGetContext();
        return new FotaJobRepository(contextIdmGetContext).getExpirationNotify() && getScheduledExpirationTime(contextIdmGetContext) > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ JobInfo lambda$getScheduledExpirationTime$0(JobScheduler jobScheduler) {
        return jobScheduler.getPendingJob(SessionExpiration.EXPIRATION_CANCEL.getJobId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getScheduledExpirationTime$1(JobInfo jobInfo) {
        return jobInfo.getExtras().getString(SessionExpirationManager.KEY_SCHEDULED_TIME);
    }

    public void downloadOrPause() {
        int fumoStatus = getFumoStatus();
        if (fumoStatus == 30) {
            Log.I("Download pause!!");
            SALogging.send(SAConstants.ScreedId.SCREEN_ID_DOWNLOAD_PROGRESS, SAConstants.EventId.EVENT_ID_PAUSE_BUTTON, null);
            new IDMFumoExecuteHandler(getTaskId()).executeIfPossible(IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_PAUSE, (String) null);
        } else if (fumoStatus == 242) {
            Log.I("Download restart!!");
            SALogging.send(SAConstants.ScreedId.SCREEN_ID_DOWNLOAD_PROGRESS, SAConstants.EventId.EVENT_ID_RESUME_BUTTON, null);
            new IDMFumoExecuteHandler(getTaskId()).executeIfPossible(30, (String) null);
        } else {
            Log.W("Unexpected FumoStatus : " + getFumoStatus());
            SALogging.send(SAConstants.ScreedId.SCREEN_ID_DOWNLOAD_PROGRESS, SAConstants.EventId.EVENT_ID_PAUSE_BUTTON, null);
            new IDMFumoExecuteHandler(getTaskId()).executeIfPossible(IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_PAUSE, (String) null);
        }
    }

    public TitleBodyAndButtons getTitleBodyAndButtons() {
        if (isEmergencyServiceType()) {
            if (getFumoStatus() != 30) {
                Log.W("unexpected fumo status: " + getFumoStatus());
            }
            return TitleBodyAndButtons.DOWNLOADING_EMERGENCY;
        }
        if (Flavor.DownloadProgressModel.isHMDDevice()) {
            if (getFumoStatus() != 30) {
                Log.W("unexpected fumo status: " + getFumoStatus());
            }
            return TitleBodyAndButtons.DOWNLOADING_WITHOUT_PAUSE;
        }
        int fumoStatus = getFumoStatus();
        if (fumoStatus == 30) {
            return TitleBodyAndButtons.DOWNLOADING;
        }
        if (fumoStatus == 242) {
            return isExpirationNotify() ? TitleBodyAndButtons.PAUSE_EXPIRATION : TitleBodyAndButtons.PAUSE;
        }
        Log.W("Unexpected FumoStatus : " + getFumoStatus());
        return TitleBodyAndButtons.PAUSE;
    }

    public void restoreLastInformation() {
        long deltaFileSize;
        try {
            deltaFileSize = new FileManager().getDeltaFileSize(this.actionInfoDao.getDeltaIndex());
        } catch (IDMExceptionFileNotFound unused) {
            Log.E("IDMExceptionFileNotFound fail");
            deltaFileSize = 0;
        }
        DownloadProgressInfo.setPercent((int) ((deltaFileSize * 100) / this.actionInfoDao.getObjectSize()));
        DownloadProgressInfo.setFormattedRemainTime(this.fotaJobRepository.remainedDownloadTime());
    }
}
