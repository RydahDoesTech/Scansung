package com.idm.fotaagent.enabler.fumo.executor;

import android.text.TextUtils;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.analytics.samsunganalytics.SALogging;
import com.idm.fotaagent.database.room.data.repository.PostponeRepository;
import com.idm.fotaagent.enabler.fumo.IDMFumoExecuteHandler;
import com.idm.fotaagent.enabler.ui.IDMUIManager;
import com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationType;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTypeManager;
import com.idm.fotaagent.utils.temperature.TemperatureChecker;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class IDMFumoExecutorDownloadComplete extends IDMFumoExecutor {
    private final int nDownloadType;

    public IDMFumoExecutorDownloadComplete(String str, int i5) {
        super(str);
        this.nDownloadType = i5;
    }

    private void idmCallbackExecuteDownload(String str) {
        Log.I("");
        new PostponeRepository(this.context).setPostponeCount(0);
        updateInformation(str);
        IDMUIManager.getInstance().finish(IDMUIEventInterface.UIACTIVITY.DOWNLOAD_PROGRESS);
        NotificationTypeManager.cancel(NotificationType.IDM_NOTIFICATION_DOWNLOAD_PROGRESS);
    }

    private void idmCallbackExecuteDownloadAndUpdate() {
        Log.I("");
        new PostponeRepository(this.context).setPostponeCount(0);
        this.actionInfoDao.setFumoStatus(40);
        TemperatureChecker temperatureChecker = IDMApplication.getEnablerFactory().getTemperatureChecker();
        SALogging.send(temperatureChecker.getEventIdReadyToRestart(), temperatureChecker.getTemperature());
        new IDMFumoExecuteHandler(this.taskId).executeIfPossible(50, (String) null);
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public String getDefaultResultCode() {
        return "200";
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void idmCallbackExecute(String str) {
        Log.I("");
        int i5 = this.nDownloadType;
        if (i5 == 1) {
            idmCallbackExecuteDownloadAndUpdate();
        } else if (i5 == 2) {
            idmCallbackExecuteDownload(str);
        }
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void idmExecute(String str) {
        Log.I("");
        idmCallbackExecuteDownloadAndUpdate();
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void idmFumoStart() {
        Log.I("");
        idmCallbackExecuteDownloadAndUpdate();
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void resumeByNetwork() {
        Log.I("");
        new IDMFumoExecuteHandler(this.taskId).executeIfPossible(50, (String) null);
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void resumeByReboot() {
        Log.I("");
        new IDMFumoExecuteHandler(this.taskId).executeIfPossible(50, (String) null);
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void updateActionInfo(String str) {
        if (this.nDownloadType != 2) {
            return;
        }
        this.actionInfoDao.setAppId(0);
        this.actionInfoDao.setCommand(40);
        this.actionInfoDao.setFumoStatus(40);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.actionInfoDao.setDmResultCode(str);
    }
}
