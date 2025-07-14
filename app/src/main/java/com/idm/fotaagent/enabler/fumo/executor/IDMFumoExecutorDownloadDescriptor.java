package com.idm.fotaagent.enabler.fumo.executor;

import com.idm.agent.dl.DLResultCode;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.LibraryStarter;
import com.idm.fotaagent.abupdate.enablerinterface.MemoryHandler;
import com.idm.fotaagent.analytics.samsunganalytics.SALogging;
import com.idm.fotaagent.database.room.data.repository.PostponeRepository;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseManager;
import com.idm.fotaagent.enabler.fumo.IDMFumoExecuteHandler;
import com.idm.fotaagent.enabler.fumo.exception.insufficientmemory.InsufficientMemoryException;
import com.idm.fotaagent.enabler.fumo.exception.insufficientmemory.InvalidStateException;
import com.idm.fotaagent.enabler.fumo.memory.FumoMemoryHandler;
import com.idm.fotaagent.enabler.fumo.policy.checkers.Action;
import com.idm.fotaagent.enabler.fumo.policy.checkers.Policies;
import com.idm.fotaagent.enabler.fumo.postpone.PostponeManager;
import com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskDownloadYesNo;
import com.idm.fotaagent.enabler.ui.downloadprogress.DownloadProgressInfo;
import com.idm.fotaagent.utils.temperature.TemperatureChecker;
import com.samsung.android.fotaagent.common.log.Log;
import java.io.FileWriter;
import java.io.IOException;

/* loaded from: classes.dex */
public class IDMFumoExecutorDownloadDescriptor extends IDMFumoExecutor {
    public IDMFumoExecutorDownloadDescriptor(String str) {
        super(str);
    }

    private void makeDeltaFile() throws IOException {
        try {
            new FileWriter(this.actionInfoDao.getDownloadPath()).close();
        } catch (IOException e5) {
            Log.printStackTrace(e5);
        }
    }

    public void checkMemoryAndStartDownloading() {
        try {
            MemoryHandler.createInstance(this.taskId, FumoMemoryHandler.CheckStatus.DOWNLOADABLE).check();
            makeDeltaFile();
            LibraryStarter.startDLTask(this.actionInfoDao.getActionInfo());
            TemperatureChecker temperatureChecker = IDMApplication.getEnablerFactory().getTemperatureChecker();
            SALogging.send(temperatureChecker.getEventIdStartDownload(), temperatureChecker.getTemperature());
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
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void idmExecute(String str) {
        Log.I("");
        idmFumoStart();
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void idmFumoStart() {
        Log.I("");
        if (!new PostponeRepository(this.context).isNone()) {
            PostponeManager.cancel();
        }
        Action.DownloadNotAllowed downloadNotAllowed = new Action.DownloadNotAllowed(this.taskId);
        Policies.ForDownload.getExceptional().ifThrown(downloadNotAllowed.act(), downloadNotAllowed.getExceptionClass()).orElse(new C1.b(19, this));
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void resumeByNetwork() {
        Log.I("");
        new IDMFumoTaskDownloadYesNo(this.taskId).execute();
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void resumeByReboot() {
        Log.I("");
        new IDMFumoTaskDownloadYesNo(this.taskId).execute();
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void updateActionInfo(String str) {
        IDMDatabaseManager.getInstance().idmGetEnablerDatabase().beginTransactionNonExclusive();
        try {
            this.actionInfoDao.setAppId(1);
            this.actionInfoDao.setCommand(200);
            this.actionInfoDao.setFumoStatus(200);
            IDMDatabaseManager.getInstance().idmGetEnablerDatabase().setTransactionSuccessful();
        } finally {
            IDMDatabaseManager.getInstance().idmGetEnablerDatabase().endTransaction();
        }
    }
}
