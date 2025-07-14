package com.idm.fotaagent.abupdate.manager.callbacks;

import com.idm.fotaagent.abupdate.abenabler.utils.UpdateEngineWakeLockManager;
import com.idm.fotaagent.abupdate.manager.EnablerManager;
import com.idm.fotaagent.abupdate.manager.UpdateInfo;
import com.idm.fotaagent.abupdate.updateengine.ErrorCode;
import com.idm.fotaagent.abupdate.updateengine.UpdateStatus;
import com.idm.fotaagent.database.room.data.repository.AdminRepository;
import com.idm.fotaagent.database.room.data.repository.FotaJobRepository;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.fumo.IDMFumoExecuteHandler;
import com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskConnectFailed;
import com.idm.fotaagent.enabler.network.DLNetworkChecker;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationId;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationType;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTypeManager;
import com.idm.fotaagent.receiver.dynamic.IDMDynamicReceivers;
import com.idm.fotaagent.receiver.dynamic.LowBatteryReceiver;
import com.idm.fotaagent.scheduler.jobschedule.NetworkResumeJobScheduleManager;
import com.idm.fotaagent.utils.network.WifiNetworkId;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.Locale;

/* loaded from: classes.dex */
public class UpdateCallback extends AbstractCallback {
    private String getTaskId() {
        return new ActionInfoDao().getSessionId();
    }

    private boolean needsDiscard(int i5) {
        int fumoStatus = new ActionInfoDao().getFumoStatus();
        if (fumoStatus == 0) {
            return false;
        }
        if (fumoStatus != 30) {
            return true;
        }
        return !UpdateStatus.InstallationStep.containsExceptIdle(i5);
    }

    private void reportForFailure(ErrorCode errorCode) {
        NotificationTypeManager.cancel(NotificationId.NOTIFICATION_ID_PRIMARY);
        errorCode.reportForFailure();
    }

    private void updateNotification() {
        if (new ActionInfoDao().getFumoStatus() != 30) {
            return;
        }
        NotificationTypeManager.notify(NotificationType.IDM_NOTIFICATION_DOWNLOAD_PROGRESS, getTaskId());
    }

    @Override // com.idm.fotaagent.abupdate.manager.callbacks.AbstractCallback
    public void doSetResultCode(ErrorCode errorCode) {
        UpdateEngineWakeLockManager.get().releaseWakeLock();
        IDMDynamicReceivers.getInstance().unregister(LowBatteryReceiver.class);
        ActionInfoDao actionInfoDao = new ActionInfoDao();
        if (actionInfoDao.isReportFumoStatus()) {
            Log.I("ignore due to reporting");
            return;
        }
        if (errorCode != ErrorCode.DOWNLOAD_TRANSFER_ERROR) {
            if (errorCode == ErrorCode.USER_CANCELED) {
                EnablerManager.getInstance().setPaused();
                return;
            } else if (errorCode == ErrorCode.UPDATED_BUT_NOT_ACTIVE || !new AdminRepository(getContext()).isPackageVerificationEnabled()) {
                reportForSuccess(errorCode);
                return;
            } else {
                reportForFailure(errorCode);
                return;
            }
        }
        int dlCurrentRetryCount = actionInfoDao.getDlCurrentRetryCount();
        Log.I("currentRetryCount : " + dlCurrentRetryCount + ", maxRetryCount : 15");
        if (new ActionInfoDao().getFumoStatus() == 242) {
            Log.I("trying pause");
            return;
        }
        if (dlCurrentRetryCount < 15) {
            if (DLNetworkChecker.getInstance().isDLRetriable(getTaskId())) {
                startDownloadingWith(WifiNetworkId.getNetworkId());
                return;
            }
            return;
        }
        actionInfoDao.setDlCurrentRetryCount(0);
        new IDMFumoTaskConnectFailed(getTaskId()).execute();
        int dlTotalRetryCount = actionInfoDao.getDlTotalRetryCount();
        if (dlTotalRetryCount >= 1) {
            errorCode.reportForFailure();
        } else {
            actionInfoDao.setDlTotalRetryCount(dlTotalRetryCount + 1);
            NetworkResumeJobScheduleManager.schedule(getContext());
        }
    }

    public void reportForSuccess(ErrorCode errorCode) {
        String taskId = getTaskId();
        if (!new ActionInfoDao(taskId).isTriggeredBySideload()) {
            new IDMFumoExecuteHandler(taskId).executeForDlReportIfPossible(errorCode);
        } else {
            Log.I("download via the local file. skip report and change fumo status to IDM_DL_STATE_DOWNLOAD_COMPLETE directly.");
            new IDMFumoExecuteHandler(taskId).callbackIfPossible(40, null);
        }
    }

    public void setUpdateInfo(int i5, float f) {
        UpdateInfo updateInfo = new UpdateInfo(UpdateStatus.InstallationStep.ofNullable(i5).orElse(Integer.valueOf(new FotaJobRepository(getContext()).getUpdateInfo().installationStep())).intValue(), calculatePercent(f));
        Log.I(updateInfo);
        new FotaJobRepository(getContext()).setUpdateInfo(updateInfo);
        updateNotification();
    }

    @Override // com.idm.fotaagent.abupdate.updateengine.UpdateEngineCallback
    public void setUpdateStatus(int i5, float f) {
        Log.I("setUpdateStatus : status (" + i5 + ") ratio(" + String.format(Locale.US, "%f", Float.valueOf(f)) + ")");
        EnablerManager.getInstance().setUpdateStatus(i5);
        if (needsDiscard(i5)) {
            Log.W("ignore this callback");
        } else {
            setUpdateInfo(i5, f);
        }
    }

    public void startDownloadingWith(long j5) {
        EnablerManager.getInstance().applyPayload(j5);
    }

    public void setUpdateInfo(int i5) {
        setUpdateInfo(i5, 100.0f);
    }
}
