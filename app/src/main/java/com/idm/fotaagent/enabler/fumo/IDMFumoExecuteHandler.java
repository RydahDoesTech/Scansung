package com.idm.fotaagent.enabler.fumo;

import com.idm.agent.dl.IDMDlInterface;
import com.idm.agent.dm.IDMDmExecInfo;
import com.idm.core.dd.IDMDDDataInfo;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.abupdate.updateengine.ErrorCode;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseManager;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorFumoStart;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorReportDownloadResult;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.Optional;
import java.util.function.Function;

/* loaded from: classes.dex */
public class IDMFumoExecuteHandler {
    private final String taskId;

    public static class AbnormalExecCommandException extends Exception {
        private static final long serialVersionUID = -4190737266625538534L;
    }

    public IDMFumoExecuteHandler(String str) {
        this.taskId = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int convertToUpdateType(IDMDmExecInfo iDMDmExecInfo) {
        if (iDMDmExecInfo.idmGetPath().endsWith(IDMDlInterface.IDM_FUMO_DOWNLOADANDUPDATE_PATH)) {
            return 1;
        }
        if (iDMDmExecInfo.idmGetPath().endsWith(IDMDlInterface.IDM_FUMO_DOWNLOAD_PATH)) {
            return 2;
        }
        return iDMDmExecInfo.idmGetPath().endsWith(IDMDlInterface.IDM_FUMO_UPDATE_PATH) ? 3 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getExecCommand$0(Integer num) {
        return num.intValue() != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbnormalExecCommandException lambda$getExecCommand$1() {
        Log.W("Exec is abnormal");
        return new AbnormalExecCommandException();
    }

    public void callbackIfPossible(int i5, String str) {
        A3.f.t("status : ", i5);
        try {
            getExecutor(i5, this.taskId, getExecCommand()).idmCallbackExecute(str);
        } catch (AbnormalExecCommandException e5) {
            Log.printStackTrace(e5);
        }
    }

    public void executeCallbackForDDIfPossible(IDMDDDataInfo iDMDDDataInfo) {
        try {
            ((IDMFumoExecutorFumoStart) getExecutor(10, this.taskId, getExecCommand())).callbackForDD(iDMDDDataInfo);
        } catch (AbnormalExecCommandException e5) {
            Log.printStackTrace(e5);
        }
    }

    public void executeForDlReportIfPossible(ErrorCode errorCode) {
        try {
            ((IDMFumoExecutorReportDownloadResult) getExecutor(35, this.taskId, getExecCommand())).execute(errorCode);
        } catch (AbnormalExecCommandException e5) {
            Log.printStackTrace(e5);
        }
    }

    public void executeIfPossible(int i5, int i6) {
        Log.I("");
        try {
            getExecutor(i5, this.taskId, getExecCommand()).idmExecute(String.valueOf(i6));
        } catch (AbnormalExecCommandException e5) {
            Log.printStackTrace(e5);
        }
    }

    public void fumoStartIfPossible() {
        fumoStartIfPossible(new ActionInfoDao(this.taskId).getFumoStatus());
    }

    public int getExecCommand() {
        return ((Integer) Optional.ofNullable(IDMDatabaseManager.getInstance().getExecInfo(this.taskId)).map(new Function() { // from class: com.idm.fotaagent.enabler.fumo.b
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(this.f6282a.convertToUpdateType((IDMDmExecInfo) obj));
            }
        }).filter(new c()).orElseThrow(new d())).intValue();
    }

    public IDMFumoExecutor getExecutor(int i5, String str, int i6) {
        return IDMApplication.getEnablerFactory().getExecutor(i5, str, i6);
    }

    public void resumeByBatteryIfPossible(int i5) {
        try {
            getExecutor(i5, this.taskId, getExecCommand()).resumeByBattery();
        } catch (AbnormalExecCommandException e5) {
            Log.printStackTrace(e5);
        }
    }

    public void resumeByBootCompleteIfPossible(int i5) {
        try {
            getExecutor(i5, this.taskId, getExecCommand()).resumeByReboot();
        } catch (AbnormalExecCommandException e5) {
            Log.printStackTrace(e5);
        }
    }

    public void resumeByNetworkIfPossible(int i5) {
        try {
            getExecutor(i5, this.taskId, getExecCommand()).resumeByNetwork();
        } catch (AbnormalExecCommandException e5) {
            Log.printStackTrace(e5);
        }
    }

    public void updateInformationIfPossible(int i5, String str) {
        try {
            getExecutor(i5, this.taskId, getExecCommand()).updateInformation(str);
        } catch (AbnormalExecCommandException e5) {
            Log.printStackTrace(e5);
        }
    }

    public void fumoStartIfPossible(int i5) {
        Log.I("");
        try {
            getExecutor(i5, this.taskId, getExecCommand()).idmFumoStart();
        } catch (AbnormalExecCommandException e5) {
            Log.printStackTrace(e5);
        }
    }

    public void executeIfPossible(int i5, String str) {
        Log.I("");
        try {
            getExecutor(i5, this.taskId, getExecCommand()).idmExecute(str);
        } catch (AbnormalExecCommandException e5) {
            Log.printStackTrace(e5);
        }
    }
}
