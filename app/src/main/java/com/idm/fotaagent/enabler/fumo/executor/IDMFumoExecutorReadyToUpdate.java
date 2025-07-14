package com.idm.fotaagent.enabler.fumo.executor;

import com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskInstallConfirm;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class IDMFumoExecutorReadyToUpdate extends IDMFumoExecutor {
    private final int nDownloadType;

    public IDMFumoExecutorReadyToUpdate(String str, int i5) {
        super(str);
        this.nDownloadType = i5;
    }

    private void idmCallbackExecuteDownloadAndUpdate() {
        Log.I("");
        idmExecute(null);
    }

    private void idmCallbackExecuteUpdate() {
        Log.I("");
        idmExecute(null);
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public String getDefaultResultCode() {
        return null;
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void idmCallbackExecute(String str) {
        Log.I("");
        int i5 = this.nDownloadType;
        if (i5 == 1) {
            idmCallbackExecuteDownloadAndUpdate();
        } else if (i5 == 3) {
            idmCallbackExecuteUpdate();
        }
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void idmExecute(String str) {
        Log.I("");
        this.actionInfoDao.setFumoStatus(50);
        new IDMFumoTaskInstallConfirm(this.taskId).execute();
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void idmFumoStart() {
        Log.I("");
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void resumeByBattery() {
        Log.I("");
        new IDMFumoTaskInstallConfirm(this.taskId).execute();
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void resumeByNetwork() {
        Log.I("");
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void resumeByReboot() {
        Log.I("");
        new IDMFumoTaskInstallConfirm(this.taskId).execute();
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void updateActionInfo(String str) {
        Log.I("do nothing");
    }
}
