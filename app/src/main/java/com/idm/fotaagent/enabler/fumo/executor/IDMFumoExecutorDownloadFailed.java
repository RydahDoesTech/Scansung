package com.idm.fotaagent.enabler.fumo.executor;

import android.text.TextUtils;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import com.idm.fotaagent.enabler.fumo.IDMFumoExecuteHandler;
import com.idm.fotaagent.enabler.fumo.IDMFumoExtInterface;
import com.idm.fotaagent.enabler.ui.IDMUIManager;
import com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationType;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTypeManager;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class IDMFumoExecutorDownloadFailed extends IDMFumoExecutor {
    private final int nDownloadType;

    public IDMFumoExecutorDownloadFailed(String str, int i5) {
        super(str);
        this.nDownloadType = i5;
    }

    private void idmCallbackExecuteDownload(String str) {
        Log.I("");
        updateInformation(str);
        IDMUIManager.getInstance().finish(IDMUIEventInterface.UIACTIVITY.DOWNLOAD_PROGRESS);
        NotificationTypeManager.cancel(NotificationType.IDM_NOTIFICATION_DOWNLOAD_PROGRESS);
    }

    private void idmCallbackExecuteDownloadAndUpdate(String str) {
        Log.I("");
        this.actionInfoDao.setFumoStatus(IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_FAILED_REPORTING);
        new IDMFumoExecuteHandler(this.taskId).callbackIfPossible(IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_FAILED_REPORTING, str);
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public String getDefaultResultCode() {
        return IDMFumoExtInterface.IDM_FOTA_GENERIC_DOWNLOAD_NETWORK_UNAVAILABLE;
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void idmCallbackExecute(String str) {
        Log.I("");
        int i5 = this.nDownloadType;
        if (i5 == 1) {
            idmCallbackExecuteDownloadAndUpdate(str);
        } else if (i5 == 2) {
            idmCallbackExecuteDownload(str);
        }
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void idmExecute(String str) {
        Log.I("");
        idmCallbackExecute(str);
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void idmFumoStart() {
        Log.I("");
        idmCallbackExecute(getDefaultResultCode());
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void resumeByNetwork() {
        Log.I("");
        idmFumoStart();
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void resumeByReboot() {
        Log.I("");
        idmFumoStart();
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void updateActionInfo(String str) {
        this.actionInfoDao.setAppId(0);
        this.actionInfoDao.setCommand(20);
        this.actionInfoDao.setFumoStatus(20);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.actionInfoDao.setDmResultCode(str);
    }
}
