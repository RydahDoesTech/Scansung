package com.idm.fotaagent.enabler.fumo.executor;

import com.idm.agent.dl.DLResultCode;
import com.idm.fotaagent.LibraryStarter;
import com.idm.fotaagent.abupdate.enablerinterface.MemoryHandler;
import com.idm.fotaagent.enabler.fumo.IDMFumoExecuteHandler;
import com.idm.fotaagent.enabler.fumo.exception.insufficientmemory.InsufficientMemoryException;
import com.idm.fotaagent.enabler.fumo.exception.insufficientmemory.InvalidStateException;
import com.idm.fotaagent.enabler.fumo.memory.FumoMemoryHandler;
import com.idm.fotaagent.enabler.fumo.policy.checkers.Action;
import com.idm.fotaagent.enabler.fumo.policy.checkers.Policies;
import com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskDownloadRetryConfirm;
import com.idm.fotaagent.enabler.network.DLNetworkChecker;
import com.idm.fotaagent.enabler.ui.downloadprogress.DownloadProgressInfo;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class IDMFumoExecutorDownloadInProgress extends IDMFumoExecutor {
    private final int nDownloadType;

    public IDMFumoExecutorDownloadInProgress(String str, int i5) {
        super(str);
        this.nDownloadType = i5;
    }

    private void idmCallbackExecuteDownload() {
        Log.I("");
        updateInformation(null);
    }

    private void idmCallbackExecuteDownloadAndUpdate() {
        Log.I("");
        updateInformation(null);
    }

    private void resumeDownload(String str) {
        if (DLNetworkChecker.getInstance().shouldShow(DLNetworkChecker.ConfirmType.DOWNLOAD_RETRY_CONFIRM, str)) {
            new IDMFumoTaskDownloadRetryConfirm(str).execute();
        } else {
            idmFumoStart();
        }
    }

    public void checkMemoryAndStartDownloading() {
        try {
            MemoryHandler.createInstance(this.taskId, FumoMemoryHandler.CheckStatus.RESUMEABLE).check();
            updateInformation(null);
            LibraryStarter.startDLTask(this.actionInfoDao.getActionInfo());
            DownloadProgressInfo.start(this.taskId);
        } catch (InsufficientMemoryException e5) {
            Log.printStackTrace(e5);
            new IDMFumoExecuteHandler(this.taskId).executeIfPossible(35, DLResultCode.INSUFFICIENT_STORAGE.getIndex());
        } catch (InvalidStateException e6) {
            Log.printStackTrace(e6);
            new IDMFumoExecuteHandler(this.taskId).executeIfPossible(35, DLResultCode.ABORTED_BY_DEVICE.getIndex());
        }
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
        } else if (i5 == 2) {
            idmCallbackExecuteDownload();
        }
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void idmExecute(String str) {
        Log.I("");
        idmFumoStart();
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void idmFumoStart() {
        Log.I("");
        Action.DownloadNotAllowed downloadNotAllowed = new Action.DownloadNotAllowed(this.taskId);
        Policies.ForDownload.getExceptional().ifThrown(downloadNotAllowed.act(), downloadNotAllowed.getExceptionClass()).orElse(new C1.b(20, this));
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void resumeByNetwork() {
        Log.I("");
        resumeDownload(this.taskId);
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void resumeByReboot() {
        Log.I("");
        resumeDownload(this.taskId);
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void updateActionInfo(String str) {
        this.actionInfoDao.setCommand(30);
        this.actionInfoDao.setFumoStatus(30);
    }
}
