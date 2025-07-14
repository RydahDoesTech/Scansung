package com.idm.fotaagent.abupdate.abenabler.ui.downloadandinstallprogress;

import androidx.lifecycle.C;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.abupdate.manager.UpdateInfo;
import com.idm.fotaagent.abupdate.updateengine.UpdateStatus;
import com.idm.fotaagent.analytics.samsunganalytics.SAConstants;
import com.idm.fotaagent.analytics.samsunganalytics.SALogging;
import com.idm.fotaagent.database.room.data.repository.FotaJobRepository;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.fumo.IDMFumoExecuteHandler;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class DownloadAndInstallProgressModel {
    private final ActionInfoDao actionInfoDao;
    private final FotaJobRepository repository = new FotaJobRepository(IDMApplication.idmGetContext());
    private final String taskId;

    public DownloadAndInstallProgressModel(String str) {
        this.taskId = str;
        this.actionInfoDao = new ActionInfoDao(str);
    }

    private int getFumoStatus() {
        return this.actionInfoDao.getFumoStatus();
    }

    private String getTaskId() {
        return this.taskId;
    }

    private void resetUpdateInfo() {
        if (this.repository.isDownloadingFinished()) {
            this.repository.setUpdateInfo(new UpdateInfo(UpdateStatus.InstallationStep.VERIFYING.getStatus(), 0));
        } else {
            this.repository.setUpdateInfo(new UpdateInfo(UpdateStatus.InstallationStep.DOWNLOADING.getStatus(), getUpdateInfo().percent()));
        }
    }

    public void download() {
        Log.I("Download restart!!");
        SALogging.send(SAConstants.ScreedId.SCREEN_ID_DOWNLOAD_PROGRESS, SAConstants.EventId.EVENT_ID_RESUME_BUTTON, null);
        new IDMFumoExecuteHandler(getTaskId()).executeIfPossible(30, (String) null);
    }

    public int getProgressBarsVisible() {
        return getProgressBarsVisible(getUpdateInfo().installationStep());
    }

    public UpdateInfo getUpdateInfo() {
        return this.repository.getUpdateInfo();
    }

    public C getUpdateInfoLiveData() {
        return this.repository.getUpdateInfoLiveData();
    }

    public boolean isEmergencyServiceType() {
        return this.repository.isEmergencyService();
    }

    public boolean needsBlockToPause() {
        UpdateInfo updateInfo = getUpdateInfo();
        return updateInfo.installationStep() == UpdateStatus.InstallationStep.OPTIMIZING.getStatus() && updateInfo.percent() >= 99;
    }

    public boolean needsConfirmToPause() {
        int iInstallationStep = getUpdateInfo().installationStep();
        if (iInstallationStep != UpdateStatus.InstallationStep.IDLE.getStatus() && iInstallationStep != UpdateStatus.InstallationStep.DOWNLOADING.getStatus()) {
            return true;
        }
        A3.f.t("pausing during download should be allowed or no button. step : ", iInstallationStep);
        return false;
    }

    public void pause() {
        Log.I("Download pause!!");
        SALogging.send(SAConstants.ScreedId.SCREEN_ID_DOWNLOAD_PROGRESS, SAConstants.EventId.EVENT_ID_PAUSE_BUTTON, null);
        new IDMFumoExecuteHandler(getTaskId()).executeIfPossible(IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_PAUSE, (String) null);
        resetUpdateInfo();
    }

    public void refreshAnimatorBy(boolean z4, Runnable runnable, Runnable runnable2) {
        if (getFumoStatus() != 242) {
            return;
        }
        if (z4) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    public int getProgressBarsVisible(int i5) {
        return (getFumoStatus() != 242 && i5 == UpdateStatus.InstallationStep.IDLE.getStatus()) ? 8 : 0;
    }
}
