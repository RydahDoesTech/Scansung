package com.idm.fotaagent.enabler.fumo.executor;

import com.idm.adapter.callback.IDMCallbackStatusInterface;
import com.idm.fotaagent.LibraryStarter;
import com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskDownloadPause;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationType;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTypeManager;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class IDMFumoExecutorDownloadPause extends IDMFumoExecutor {
    public IDMFumoExecutorDownloadPause(String str) {
        super(str);
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public String getDefaultResultCode() {
        return null;
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void idmCallbackExecute(String str) {
        Log.I("");
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void idmExecute(String str) {
        Log.I("");
        idmFumoStart();
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void idmFumoStart() {
        Log.I("");
        updateInformation(null);
        NotificationTypeManager.notify(NotificationType.IDM_NOTIFICATION_DOWNLOAD_PAUSE, this.taskId);
        startFumo();
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void resumeByNetwork() {
        Log.I("");
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void resumeByReboot() {
        Log.I("");
        new IDMFumoTaskDownloadPause(this.taskId).execute();
    }

    public void startFumo() {
        Log.I("");
        LibraryStarter.pauseDownloading(this.actionInfoDao.getActionInfo());
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void updateActionInfo(String str) {
        this.actionInfoDao.setCommand(IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_PAUSE);
        this.actionInfoDao.setFumoStatus(IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_PAUSE);
    }
}
