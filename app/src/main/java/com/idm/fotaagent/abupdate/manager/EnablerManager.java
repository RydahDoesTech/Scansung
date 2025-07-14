package com.idm.fotaagent.abupdate.manager;

import A.p;
import A3.f;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.lifecycle.C;
import androidx.lifecycle.F;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import com.idm.agent.dl.DLResultCode;
import com.idm.fotaagent.abupdate.manager.EnablerManager;
import com.idm.fotaagent.abupdate.updateengine.ErrorCode;
import com.idm.fotaagent.abupdate.updateengine.UpdateStatus;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.fumo.IDMFumoExecuteHandler;
import com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskConnectFailed;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* loaded from: classes.dex */
public class EnablerManager {
    private static final EnablerManager instance = new EnablerManager();
    private final Handler handler;
    private final F pendingPause = new F(Boolean.FALSE);
    private volatile int status;
    private final UpdateEngineManager updateEngineManager;

    public enum ApplyPayloadError {
        NETWORK_ID_ERROR("(code 1)") { // from class: com.idm.fotaagent.abupdate.manager.EnablerManager.ApplyPayloadError.1
            @Override // com.idm.fotaagent.abupdate.manager.EnablerManager.ApplyPayloadError
            public void handle(UpdateEngineManager updateEngineManager) {
                Log.I(name());
                updateEngineManager.executeCallbackIfPossible(ErrorCode.DOWNLOAD_TRANSFER_ERROR);
                EnablerManager.getInstance().setUpdateStatus(UpdateStatus.EngineStatus.IDLE.getStatus());
            }
        },
        ALREADY_PROCESSING_ERROR("(code 65)") { // from class: com.idm.fotaagent.abupdate.manager.EnablerManager.ApplyPayloadError.2
            @Override // com.idm.fotaagent.abupdate.manager.EnablerManager.ApplyPayloadError
            public void handle(UpdateEngineManager updateEngineManager) {
                Log.I(name());
            }
        },
        NEED_REBOOT_ERROR("(code 66)") { // from class: com.idm.fotaagent.abupdate.manager.EnablerManager.ApplyPayloadError.3
            @Override // com.idm.fotaagent.abupdate.manager.EnablerManager.ApplyPayloadError
            public void handle(UpdateEngineManager updateEngineManager) {
                Log.I(name());
                EnablerManager.getInstance().cancelAndShowDialog();
            }
        };

        private final String printedCode;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$of$0(String str, ApplyPayloadError applyPayloadError) {
            return str.contains(applyPayloadError.printedCode);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ApplyPayloadError of(final String str) {
            return (ApplyPayloadError) Stream.of((Object[]) values()).filter(new Predicate() { // from class: com.idm.fotaagent.abupdate.manager.d
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return EnablerManager.ApplyPayloadError.lambda$of$0(str, (EnablerManager.ApplyPayloadError) obj);
                }
            }).findFirst().orElse(NEED_REBOOT_ERROR);
        }

        public abstract void handle(UpdateEngineManager updateEngineManager);

        ApplyPayloadError(String str) {
            this.printedCode = str;
        }
    }

    private EnablerManager() {
        HandlerThread handlerThread = new HandlerThread("EnablerManager");
        handlerThread.setDaemon(true);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), new b());
        this.handler = handler;
        this.updateEngineManager = new UpdateEngineManager(handler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelAndShowDialog() {
        new IDMFumoTaskConnectFailed(getTaskId()).execute();
        new IDMFumoExecuteHandler(getTaskId()).executeIfPossible(IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_IN_CANCEL, DLResultCode.CANCELLED_BY_USER.getIndex());
    }

    private void checkFumoStatus(int i5) {
        int fumoStatus = getFumoStatus();
        if (fumoStatus != i5) {
            throw new IllegalStateException(f.l(fumoStatus, "unexpected FumoStatus : "));
        }
    }

    private int getFumoStatus() {
        return new ActionInfoDao().getFumoStatus();
    }

    public static EnablerManager getInstance() {
        return instance;
    }

    private String getTaskId() {
        return new ActionInfoDao().getSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyPayload$1(long j5) {
        try {
            checkFumoStatus(30);
            this.updateEngineManager.applyPayload(j5);
        } catch (IllegalStateException e5) {
            Log.printStackTrace(e5);
            if (getFumoStatus() == 242) {
                Log.W("do nothing since now is pause state");
            } else {
                cancelAndShowDialog();
            }
        } catch (Exception e6) {
            Log.printStackTrace(e6);
            ApplyPayloadError.of(e6.toString()).handle(this.updateEngineManager);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$cancelDownloadingAndInstalling$3() {
        try {
            this.updateEngineManager.cancel();
        } catch (Exception e5) {
            Log.I(e5.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$new$0(Message message) {
        Log.W("message doesn't support");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resetUpdateEngine$4() {
        try {
            this.updateEngineManager.reset();
        } catch (Exception e5) {
            Log.I(e5.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$suspend$2(int i5) {
        try {
            checkFumoStatus(i5);
            this.updateEngineManager.cancel();
        } catch (IllegalStateException e5) {
            Log.printStackTrace(e5);
            cancelAndShowDialog();
        } catch (Exception e6) {
            setPaused();
            Log.I(e6.toString());
        }
    }

    private void setPendingPause() {
        setPendingPause(true);
    }

    private void suspend(int i5) {
        setPendingPause();
        this.handler.post(new p(i5, this, 2));
    }

    public long allocateSpaceAndGetRequiredFreeMemory(String str) {
        return this.updateEngineManager.allocateSpaceForPayload(str);
    }

    public void applyPayload(long j5) {
        this.handler.post(new c(0, j5, this));
    }

    public void bind() {
        Handler handler = this.handler;
        UpdateEngineManager updateEngineManager = this.updateEngineManager;
        Objects.requireNonNull(updateEngineManager);
        handler.post(new a(2, updateEngineManager));
    }

    public void bindForSlotSwitch(CompletableFuture<Void> completableFuture) {
        this.updateEngineManager.bindForSlotSwitch(completableFuture);
    }

    public void cancelDownloadingAndInstalling() {
        this.handler.post(new a(1, this));
    }

    public int cleanupSuccessfulUpdate() {
        return this.updateEngineManager.cleanupSuccessfulUpdate();
    }

    public C getPendingPause() {
        return this.pendingPause;
    }

    public UpdateStatus.EngineStatus getUpdateEngineStatus() {
        return UpdateStatus.EngineStatus.of(this.status);
    }

    public boolean isRunning() {
        return getUpdateEngineStatus().isRunning();
    }

    public void resetShouldSwitchSlotOnReboot() {
        this.updateEngineManager.resetShouldSwitchSlotOnReboot();
    }

    public void resetUpdateEngine() {
        this.handler.post(new a(0, this));
        setUpdateStatus(UpdateStatus.EngineStatus.IDLE.getStatus());
    }

    public void resume(long j5) {
        applyPayload(j5);
    }

    public void setPaused() {
        setPendingPause(false);
    }

    public void setShouldSwitchSlotOnReboot(String str) {
        this.updateEngineManager.setShouldSwitchSlotOnReboot(str);
    }

    public synchronized void setUpdateStatus(int i5) {
        this.status = i5;
    }

    public void suspendWithDownloadingFumoStatus() {
        suspend(30);
    }

    public void suspendWithPauseFumoStatus() {
        suspend(IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_PAUSE);
    }

    public void triggerPostinstall(String str) {
        this.updateEngineManager.triggerPostinstall(str);
    }

    private synchronized void setPendingPause(boolean z4) {
        this.pendingPause.i(Boolean.valueOf(z4));
    }
}
