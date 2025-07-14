package com.idm.fotaagent.enabler.fumo.executor;

import android.text.TextUtils;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import com.idm.agent.dl.DLResultCode;
import com.idm.fotaagent.LibraryStarter;
import com.idm.fotaagent.utils.GeneralUtils;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class IDMFumoExecutorDownloadInCancel extends IDMFumoExecutor {
    private final int nDownloadType;

    public IDMFumoExecutorDownloadInCancel(String str, int i5) {
        super(str);
        this.nDownloadType = i5;
    }

    private void idmCallbackExecuteDownload() {
        Log.I("");
        this.actionInfoDao.setFumoStatus(IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_IN_CANCEL);
    }

    private void idmCallbackExecuteDownloadAndUpdate() {
        Log.I("");
        this.actionInfoDao.setFumoStatus(IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_IN_CANCEL);
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public String getDefaultResultCode() {
        return String.valueOf(DLResultCode.CANCELLED_BY_USER.getIndex());
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void idmCallbackExecute(String str) {
        Log.I("");
        int i5 = this.nDownloadType;
        if (i5 == 1) {
            idmCallbackExecuteDownloadAndUpdate();
        } else if (i5 == 2) {
            idmCallbackExecuteDownload();
        }
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
        LibraryStarter.startDLTask(this.actionInfoDao.getActionInfo());
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
        this.actionInfoDao.setAppId(1);
        this.actionInfoDao.setCommand(IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_IN_CANCEL);
        this.actionInfoDao.setFumoStatus(IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_IN_CANCEL);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.actionInfoDao.setDlReportCode(GeneralUtils.parseInt(str, Integer.valueOf(getDefaultResultCode()).intValue()));
    }
}
