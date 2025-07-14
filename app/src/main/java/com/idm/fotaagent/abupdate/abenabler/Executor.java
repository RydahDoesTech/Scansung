package com.idm.fotaagent.abupdate.abenabler;

import A3.f;
import C1.b;
import P0.a;
import android.text.TextUtils;
import com.idm.agent.dl.IDMDlInterface;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.abupdate.manager.EnablerManager;
import com.idm.fotaagent.abupdate.updateengine.ErrorCode;
import com.idm.fotaagent.analytics.samsunganalytics.SALogging;
import com.idm.fotaagent.database.room.data.repository.FotaJobRepository;
import com.idm.fotaagent.database.room.data.repository.GeneralRepository;
import com.idm.fotaagent.database.room.data.repository.InstallParamRepository;
import com.idm.fotaagent.enabler.fumo.DLReporter;
import com.idm.fotaagent.enabler.fumo.IDMFumoExecuteHandler;
import com.idm.fotaagent.enabler.fumo.exception.dd.InvalidDownloadDescriptorException;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorDownloadDescriptor;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorDownloadInProgress;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorDownloadPause;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorFumoStart;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorReportDownloadResult;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorUpdateInProgress;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorUpdateToReporting;
import com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskDownloadInProgress;
import com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskDownloadRetryConfirm;
import com.idm.fotaagent.enabler.network.DLNetworkChecker;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationType;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTypeManager;
import com.idm.fotaagent.scheduler.IDMSchedulerHandler;
import com.idm.fotaagent.scheduler.interfaces.IDMSchedulerInterface;
import com.idm.fotaagent.utils.DeviceUtils;
import com.idm.fotaagent.utils.RebootChecker;
import com.idm.fotaagent.utils.ToastHelper;
import com.idm.fotaagent.utils.UpdateResultUtils;
import com.idm.fotaagent.utils.network.WifiNetworkId;
import com.idm.fotaagent.utils.temperature.TemperatureChecker;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class Executor {

    public static class AB {

        public static class DownloadDescriptor extends IDMFumoExecutorDownloadDescriptor {
            public DownloadDescriptor(String str) {
                super(str);
            }

            private Runnable getStarter() {
                return new a(2);
            }

            private Runnable getTemperatureChecker() {
                return new a(1);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$getCheckAndStarter$0() {
                ABUpdateStarter.checkAndStart(this.taskId, getStarter(), getTemperatureChecker());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void lambda$getStarter$1() {
                EnablerManager.getInstance().applyPayload(WifiNetworkId.getNetworkId());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void lambda$getTemperatureChecker$2() {
                TemperatureChecker temperatureChecker = IDMApplication.getEnablerFactory().getTemperatureChecker();
                SALogging.send(temperatureChecker.getEventIdStartDownload(), temperatureChecker.getTemperature());
            }

            @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorDownloadDescriptor
            public void checkMemoryAndStartDownloading() {
                new IDMFumoExecuteHandler(this.taskId).callbackIfPossible(30, null);
                if (ABDownloadableChecker.isMetadataDownloadPossible(this.taskId)) {
                    new IDMFumoTaskDownloadInProgress(this.taskId).execute();
                    new Thread(getCheckAndStarter()).start();
                }
            }

            public Runnable getCheckAndStarter() {
                return new b(14, this);
            }
        }

        public static class DownloadPause extends IDMFumoExecutorDownloadPause {
            public DownloadPause(String str) {
                super(str);
            }

            @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorDownloadPause
            public void startFumo() {
                Log.I("");
                EnablerManager.getInstance().suspendWithPauseFumoStatus();
            }
        }

        public static class DownloadProgress extends IDMFumoExecutorDownloadInProgress {
            public DownloadProgress(String str, int i5) {
                super(str, i5);
            }

            private Runnable getStarter() {
                return new a(3);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$getCheckAndStarter$0() {
                ABUpdateStarter.checkAndStart(this.taskId, getStarter());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void lambda$getStarter$1() {
                EnablerManager.getInstance().resume(WifiNetworkId.getNetworkId());
            }

            private void resumeUpdate() {
                if (ABDownloadableChecker.needsNetwork() && DLNetworkChecker.getInstance().shouldShow(DLNetworkChecker.ConfirmType.DOWNLOAD_RETRY_CONFIRM, this.taskId)) {
                    new IDMFumoTaskDownloadRetryConfirm(this.taskId).execute();
                } else {
                    idmFumoStart();
                }
            }

            @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorDownloadInProgress
            public void checkMemoryAndStartDownloading() {
                updateInformation(null);
                if (ABDownloadableChecker.isMetadataDownloadPossible(this.taskId)) {
                    new IDMFumoTaskDownloadInProgress(this.taskId).execute();
                    new Thread(getCheckAndStarter()).start();
                }
            }

            public Runnable getCheckAndStarter() {
                return new b(15, this);
            }

            @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
            public void resumeByBattery() {
                resumeUpdate();
            }

            @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorDownloadInProgress, com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
            public void resumeByReboot() {
                resumeUpdate();
            }
        }

        public static class FumoStart extends IDMFumoExecutorFumoStart {
            public FumoStart(String str, int i5) {
                super(str, i5);
            }

            @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorFumoStart
            public void check(InstallParamRepository installParamRepository) throws InvalidDownloadDescriptorException {
                super.check(installParamRepository);
                if (installParamRepository.getOffset() < 0 || TextUtils.isEmpty(installParamRepository.getFileHash()) || installParamRepository.getFileSize() <= 0 || TextUtils.isEmpty(installParamRepository.getMetadataHash()) || installParamRepository.getMetadataSize() <= 0) {
                    throw new InvalidDownloadDescriptorException("AB update's attributes not found or invalid");
                }
            }
        }

        public static class ReportDownloadResult extends IDMFumoExecutorReportDownloadResult {
            public ReportDownloadResult(String str, int i5) {
                super(str, i5);
            }

            @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorReportDownloadResult, com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
            public void idmFumoStart() {
                Log.I("");
                NotificationTypeManager.notify(NotificationType.IDM_NOTIFICATION_SYNC_DM, this.taskId);
                DLReporter.getInstance().report(this.taskId);
            }
        }

        public static class UpdateInProgress extends IDMFumoExecutorUpdateInProgress {
            private static boolean mergeNow = false;
            private final UpdateResultUtils updateResultUtils;

            public UpdateInProgress(String str) {
                super(str);
                this.updateResultUtils = new UpdateResultUtils();
            }

            private boolean changesDeviceVersion() {
                Log.I("prevDeviceVersion: " + new GeneralRepository(this.context).getPreviousFirmwareVersion() + ", currentDeviceVersion: " + DeviceUtils.readFirmwareVersion());
                return !r0.equals(r3);
            }

            private boolean changesSlotSuffix() {
                String slotSuffix = new FotaJobRepository(this.context).getSlotSuffix();
                String slotSuffix2 = DeviceUtils.getSlotSuffix();
                Log.I("prevSlotSuffix : " + slotSuffix + ", currentSlotSuffix : " + slotSuffix2);
                if (TextUtils.isEmpty(slotSuffix) || TextUtils.isEmpty(slotSuffix2)) {
                    Log.W("SlotSuffix is empty");
                    return false;
                }
                if (slotSuffix.equalsIgnoreCase(slotSuffix2)) {
                    Log.I("Same SlotSuffix");
                    return false;
                }
                Log.I("SlotSuffix has changed");
                return true;
            }

            private String convertResultCode(int i5) {
                if (i5 != 0) {
                    if (i5 == 1) {
                        return ErrorCode.MERGE_NEEDS_REBOOT.getDmResultCode();
                    }
                    if (i5 != 61) {
                        return IDMDlInterface.IDM_FOTA_GENERIC_UPDATE_FAILED;
                    }
                }
                return ErrorCode.of(i5).getDmResultCode();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$setNotificationAndStartMergeCallbackListenerService$0() {
                synchronized (UpdateInProgress.class) {
                    waitMergeAndReport();
                }
            }

            private void setNotificationAndStartMergeCallbackListenerService() {
                if (mergeNow) {
                    Log.I("Already merging");
                    return;
                }
                NotificationTypeManager.notify(NotificationType.IDM_NOTIFICATION_AB_UPDATE_MERGE, this.taskId);
                new Thread(new b(16, this)).start();
                mergeNow = true;
            }

            private boolean updatesSuccessfully() {
                return changesSlotSuffix() || changesDeviceVersion();
            }

            private void waitMergeAndReport() {
                int iCleanupSuccessfulUpdate = EnablerManager.getInstance().cleanupSuccessfulUpdate();
                f.t("merge result : ", iCleanupSuccessfulUpdate);
                this.updateResultUtils.setUpdateResultCode(convertResultCode(iCleanupSuccessfulUpdate));
                super.resumeByReboot();
                mergeNow = false;
            }

            @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorUpdateInProgress, com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
            public void idmFumoStart() {
                Log.I("");
                if (updatesSuccessfully()) {
                    setNotificationAndStartMergeCallbackListenerService();
                    ToastHelper.showShortToast(this.context, this.context.getString(R.string.STR_FINISHING_PREVIOUS_UPDATE));
                } else if (RebootChecker.isBootIdChanged(this.context)) {
                    ErrorCode.SLOT_NOT_CHANGED.reportForFailureToDM();
                } else {
                    ErrorCode.REBOOT_FAILED.reportForFailureToDM();
                }
            }

            @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorUpdateInProgress, com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
            public void resumeByReboot() {
                Log.I("");
                TemperatureChecker temperatureChecker = IDMApplication.getEnablerFactory().getTemperatureChecker();
                SALogging.send(temperatureChecker.getEventIdFinishReboot(), temperatureChecker.getTemperature());
                if (updatesSuccessfully()) {
                    setNotificationAndStartMergeCallbackListenerService();
                } else if (RebootChecker.isBootIdChanged(this.context)) {
                    ErrorCode.SLOT_NOT_CHANGED.reportForFailureToDM();
                } else {
                    ErrorCode.REBOOT_FAILED.reportForFailureToDM();
                }
            }
        }

        public static class UpdateToReporting extends IDMFumoExecutorUpdateToReporting {
            public UpdateToReporting(String str) {
                super(str);
            }

            @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorUpdateToReporting
            public void report() {
                if (!this.actionInfoDao.isTriggeredBySideload()) {
                    super.report();
                } else {
                    Log.I("download via the local file. do not report");
                    IDMSchedulerHandler.getInstance().idmSendMessage(IDMSchedulerInterface.IDM_SCHEDULE_EVENT.SCHEDULE_EVENT_SCHEDULE_FINISH, this.taskId, 0L);
                }
            }
        }
    }
}
