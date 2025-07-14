package com.idm.fotaagent.abupdate.abenabler;

import android.text.TextUtils;
import com.idm.adapter.filesystem.c;
import com.idm.fotaagent.abupdate.abenabler.fumo.exception.insufficientmemory.AllocateFailedException;
import com.idm.fotaagent.abupdate.abenabler.utils.UpdateEngineWakeLockManager;
import com.idm.fotaagent.abupdate.abenabler.utils.metadata.MetadataDownloader;
import com.idm.fotaagent.abupdate.enablerinterface.MemoryHandler;
import com.idm.fotaagent.abupdate.manager.EnablerManager;
import com.idm.fotaagent.abupdate.updateengine.ErrorCode;
import com.idm.fotaagent.abupdate.updateengine.UpdateStatus;
import com.idm.fotaagent.enabler.fumo.exception.insufficientmemory.InsufficientMemoryException;
import com.idm.fotaagent.enabler.fumo.exception.insufficientmemory.InvalidStateException;
import com.idm.fotaagent.enabler.fumo.memory.FumoMemoryHandler;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.Optional;

/* loaded from: classes.dex */
public class ABUpdateStarter {
    public static void checkAndStart(String str, Runnable runnable) {
        checkAndStart(str, runnable, null);
    }

    public static void checkAndStart(String str, Runnable runnable, Runnable runnable2) {
        try {
            UpdateEngineWakeLockManager.get().acquireWakeLockIfNeeded();
            EnablerManager.getInstance().setUpdateStatus(UpdateStatus.EngineStatus.PREPARING_UPDATE.getStatus());
            MemoryHandler.createInstance(str, FumoMemoryHandler.CheckStatus.DOWNLOADABLE).check();
            if (!ABDownloadableChecker.isUpdateEngineDownloadPossible(str)) {
                EnablerManager.getInstance().setUpdateStatus(UpdateStatus.EngineStatus.IDLE.getStatus());
            } else {
                runnable.run();
                Optional.ofNullable(runnable2).ifPresent(new c(1));
            }
        } catch (InsufficientMemoryException e5) {
            Log.printStackTrace(e5);
            EnablerManager.getInstance().setUpdateStatus(UpdateStatus.EngineStatus.IDLE.getStatus());
            UpdateEngineWakeLockManager.get().releaseWakeLock();
            ErrorCode.NOT_ENOUGH_SPACE.reportForFailure();
        } catch (InvalidStateException e6) {
            Log.printStackTrace(e6);
            EnablerManager enablerManager = EnablerManager.getInstance();
            UpdateStatus.EngineStatus engineStatus = UpdateStatus.EngineStatus.IDLE;
            enablerManager.setUpdateStatus(engineStatus.getStatus());
            UpdateEngineWakeLockManager.get().releaseWakeLock();
            if (e6 instanceof AllocateFailedException) {
                ErrorCode.of(((AllocateFailedException) e6).getErrorCode()).reportForFailure();
                return;
            }
            if (e6 instanceof MetadataDownloader.DownloadFailedException) {
                if (TextUtils.isEmpty(e6.getMessage()) || !e6.getMessage().contains("No space left on device")) {
                    ((MetadataDownloader.DownloadFailedException) e6).getErrorCode().reportForFailure();
                    return;
                } else {
                    ErrorCode.NOT_ENOUGH_SPACE.reportForFailure();
                    return;
                }
            }
            if (e6 instanceof MetadataDownloader.DownloadSuspendedException) {
                EnablerManager.getInstance().setUpdateStatus(engineStatus.getStatus());
            } else {
                if (e6 instanceof MetadataDownloader.AlreadyDownloadingException) {
                    return;
                }
                ErrorCode.ERROR.reportForFailure();
            }
        }
    }
}
