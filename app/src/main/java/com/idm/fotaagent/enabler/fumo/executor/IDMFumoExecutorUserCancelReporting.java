package com.idm.fotaagent.enabler.fumo.executor;

import android.text.TextUtils;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import com.idm.fotaagent.LibraryStarter;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTypeManager;
import com.idm.fotaagent.scheduler.jobschedule.NetworkResumeJobScheduleManager;
import com.idm.fotaagent.utils.NetworkUtil;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class IDMFumoExecutorUserCancelReporting extends IDMFumoExecutor {
    public IDMFumoExecutorUserCancelReporting(String str) {
        super(str, new IDMFumoExecutor.HistoryUpdater(str));
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public String getDefaultResultCode() {
        return "401";
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void idmCallbackExecute(String str) {
        Log.I("");
        updateInformation(str);
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void idmExecute(String str) {
        Log.I("");
        updateInformation(str);
        if (NetworkUtil.isAnyNetworkConnected(this.context)) {
            idmFumoStart();
        } else {
            NotificationTypeManager.cancelAll();
            NetworkResumeJobScheduleManager.schedule(this.context);
        }
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
        idmFumoStart();
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void updateActionInfo(String str) {
        this.actionInfoDao.setAppId(0);
        this.actionInfoDao.setCommand(IDMCallbackStatusInterface.IDM_DL_STATE_USER_CANCEL_REPORTING);
        this.actionInfoDao.setFumoStatus(IDMCallbackStatusInterface.IDM_DL_STATE_USER_CANCEL_REPORTING);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.actionInfoDao.setDmResultCode(str);
    }
}
