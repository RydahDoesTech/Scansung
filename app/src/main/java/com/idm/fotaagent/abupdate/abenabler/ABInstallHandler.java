package com.idm.fotaagent.abupdate.abenabler;

import android.content.Context;
import android.os.PowerManager;
import com.idm.fotaagent.abupdate.abenabler.utils.metadata.MetadataDownloader;
import com.idm.fotaagent.abupdate.manager.EnablerManager;
import com.idm.fotaagent.abupdate.updateengine.ErrorCode;
import com.idm.fotaagent.database.room.data.repository.FotaJobRepository;
import com.idm.fotaagent.enabler.fumo.IDMFumoInstallHandler;
import com.idm.fotaagent.utils.DeviceUtils;
import com.idm.fotaagent.utils.RebootChecker;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.Flavor;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class ABInstallHandler extends IDMFumoInstallHandler {
    public ABInstallHandler(Context context, String str) {
        super(context, str);
    }

    @Override // com.idm.fotaagent.enabler.fumo.IDMFumoInstallHandler
    public void changeFumoStatusAndInstallPackage() {
        try {
            try {
                FotaJobRepository fotaJobRepository = new FotaJobRepository(this.context);
                fotaJobRepository.resetUpdateInfo();
                MetadataDownloader metadataDownloader = MetadataDownloader.getInstance();
                metadataDownloader.download(this.taskId);
                fotaJobRepository.setSlotSuffix(DeviceUtils.getSlotSuffix());
                CompletableFuture<Void> completableFuture = new CompletableFuture<>();
                EnablerManager.getInstance().bindForSlotSwitch(completableFuture);
                EnablerManager.getInstance().setShouldSwitchSlotOnReboot(metadataDownloader.downloadPath().toString());
                completableFuture.get();
                if (this.actionInfoDao.isTriggeredBySideload()) {
                    Flavor.LocalTest.enableUpdateResultDialogIfUtAgent(this.context);
                }
                RebootChecker.saveBootIdAndStartTimer(this.context);
                this.actionInfoDao.setFumoStatus(60);
                TimeUnit.MILLISECONDS.sleep(500L);
                reboot();
                EnablerManager.getInstance().bind();
            } catch (Exception e5) {
                throw new RuntimeException(e5);
            }
        } catch (Throwable th) {
            EnablerManager.getInstance().bind();
            throw th;
        }
    }

    @Override // com.idm.fotaagent.enabler.fumo.IDMFumoInstallHandler
    public void clearCommandAndUncryptFile() {
        Log.I("do nothing in ABUpdate");
    }

    @Override // com.idm.fotaagent.enabler.fumo.IDMFumoInstallHandler
    public String getErrorCodeForRebootFailed() {
        return ErrorCode.REBOOT_FAILED.getDmResultCode();
    }

    @Override // com.idm.fotaagent.enabler.fumo.IDMFumoInstallHandler
    public void reboot() {
        try {
            Log.I("");
            PowerManager powerManager = (PowerManager) this.context.getSystemService(PowerManager.class);
            Objects.requireNonNull(powerManager);
            powerManager.reboot("abfotaupdate");
        } catch (NullPointerException e5) {
            Log.printStackTrace(e5);
        }
    }

    @Override // com.idm.fotaagent.enabler.fumo.IDMFumoInstallHandler
    public void resetReverifyInfo() {
        new FotaJobRepository(this.context).resetReverifyInfo();
    }

    @Override // com.idm.fotaagent.enabler.fumo.IDMFumoInstallHandler
    public void verifyPackage() {
        Log.I("do nothing in ABUpdate");
    }

    @Override // com.idm.fotaagent.enabler.fumo.IDMFumoInstallHandler
    public void verifyUpdatableDelta() {
        Log.I("do nothing in ABUpdate");
    }
}
