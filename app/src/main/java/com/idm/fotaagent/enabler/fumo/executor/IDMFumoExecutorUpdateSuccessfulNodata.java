package com.idm.fotaagent.enabler.fumo.executor;

import android.text.TextUtils;
import com.idm.fotaagent.LibraryStarter;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class IDMFumoExecutorUpdateSuccessfulNodata extends IDMFumoExecutor {
    public IDMFumoExecutorUpdateSuccessfulNodata(String str) {
        super(str);
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public String getDefaultResultCode() {
        return "200";
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void idmCallbackExecute(String str) {
        Log.I("");
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void idmExecute(String str) {
        Log.I("");
        updateInformation(str);
        idmFumoStart();
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void idmFumoStart() {
        Log.I("");
        LibraryStarter.startDMTask(this.actionInfoDao.getActionInfo());
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void resumeByNetwork() {
        Log.I("");
        idmFumoStart();
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void resumeByReboot() {
        Log.I("");
        this.actionInfoDao.setIsContinuousUpdateSession(true);
        idmFumoStart();
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void updateActionInfo(String str) {
        this.actionInfoDao.setAppId(0);
        this.actionInfoDao.setCommand(100);
        this.actionInfoDao.setFumoStatus(100);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.actionInfoDao.setDmResultCode(str);
    }
}
