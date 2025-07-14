package com.idm.fotaagent.enabler.fumo.executor;

import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.analytics.samsunganalytics.SALogging;
import com.idm.fotaagent.database.room.data.repository.InstallParamRepository;
import com.idm.fotaagent.enabler.fumo.IDMFumoExecuteHandler;
import com.idm.fotaagent.utils.DeviceUtils;
import com.idm.fotaagent.utils.GeneralUtils;
import com.idm.fotaagent.utils.UpdateResultUtils;
import com.idm.fotaagent.utils.temperature.TemperatureChecker;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class IDMFumoExecutorUpdateInProgress extends IDMFumoExecutor {
    public IDMFumoExecutorUpdateInProgress(String str) {
        super(str);
    }

    private void report() {
        updateInformation(null);
        new IDMFumoExecuteHandler(this.taskId).executeIfPossible(65, (String) null);
        if (new UpdateResultUtils().isUpdateSucceeded()) {
            printAuditSuccessfulLog();
        } else {
            printAuditFailedLog();
        }
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
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void idmFumoStart() {
        Log.I("");
        report();
    }

    public void printAuditFailedLog() {
        Log.I("UPDATE_FAILED");
        GeneralUtils.printAuditLog(this.context, "Software update " + new InstallParamRepository(this.context).getUpdateFwVersion() + " failed", false);
    }

    public void printAuditSuccessfulLog() {
        Log.I("SUCCESSFUL_UPDATE");
        GeneralUtils.printAuditLog(this.context, "Software update " + DeviceUtils.readFirmwareVersion() + " succeeded", true);
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void resumeByNetwork() {
        Log.I("");
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void resumeByReboot() {
        Log.I("");
        TemperatureChecker temperatureChecker = IDMApplication.getEnablerFactory().getTemperatureChecker();
        SALogging.send(temperatureChecker.getEventIdFinishReboot(), temperatureChecker.getTemperature());
        report();
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void updateActionInfo(String str) {
        this.actionInfoDao.setFumoStatus(65);
        this.actionInfoDao.setIsContinuousUpdateSession(true);
    }
}
