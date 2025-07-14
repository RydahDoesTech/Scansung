package com.idm.fotaagent.enabler.fumo.executor;

import android.os.SemSystemProperties;
import com.idm.fotaagent.enabler.fumo.IDMFumoExecuteHandler;
import com.idm.fotaagent.enabler.fumo.IntentManager;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor;
import com.idm.fotaagent.enabler.fumo.expiration.SessionExpirationManager;
import com.idm.fotaagent.enabler.fumo.postpone.PostponeManager;
import com.idm.fotaagent.enabler.ui.IDMUIManager;
import com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationType;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTypeManager;
import com.idm.fotaagent.enabler.ui.whatsnew.MajorUpdate;
import com.idm.fotaagent.utils.GeneralUtils;
import com.idm.fotaagent.utils.UpdateResultUtils;
import com.samsung.android.fotaagent.common.feature.FloatingFeature;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.knox.custom.CustomDeviceManager;
import com.samsung.android.knox.custom.ProKioskManager;
import java.io.IOException;

/* loaded from: classes.dex */
public class IDMFumoExecutorUpdateToReporting extends IDMFumoExecutor {
    private static final String EXTRA_UPDATE_REPORT_VZW = "SOFTWARE_UPDATE_COMPLETE";

    public IDMFumoExecutorUpdateToReporting(String str) {
        super(str, new IDMFumoExecutor.HistoryUpdater(str));
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
        PostponeManager.cancel();
        SessionExpirationManager.cancel(this.context);
        report();
        if (showsUpdateReport()) {
            NotificationTypeManager.notify(NotificationType.IDM_NOTIFICATION_UPDATE_REPORT, this.taskId);
            IDMUIManager.getInstance().sendDialogMessage(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_UPDATE_REPORT);
        }
    }

    public boolean isOwnedByOrganizationOrIsKioskMode() {
        if ("true".equals(SemSystemProperties.get("ro.organization_owned", "false"))) {
            Log.I("Organization Owned");
            return true;
        }
        ProKioskManager proKioskManager = CustomDeviceManager.getInstance().getProKioskManager();
        if (proKioskManager == null || !proKioskManager.getProKioskState()) {
            return false;
        }
        Log.I("Kiosk Mode");
        return true;
    }

    public void report() {
        Log.I("");
        IDMFumoExecuteHandler iDMFumoExecuteHandler = new IDMFumoExecuteHandler(this.taskId);
        UpdateResultUtils updateResultUtils = new UpdateResultUtils();
        String updateResultCode = updateResultUtils.getUpdateResultCode();
        updateInformation(updateResultCode);
        if (!updateResultUtils.isUpdateSucceeded()) {
            iDMFumoExecuteHandler.executeIfPossible(80, updateResultCode);
        } else {
            reportUpdateSuccessIfNeeded();
            iDMFumoExecuteHandler.executeIfPossible(100, updateResultCode);
        }
    }

    public void reportUpdateSuccessIfNeeded() {
        Log.I("");
        IntentManager.sendIntentIfSdmPackageExists(EXTRA_UPDATE_REPORT_VZW);
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

    public boolean showsUpdateReport() throws IOException {
        if (!GeneralUtils.isSetupWizardInstalled(this.context)) {
            Log.W("SUW is not installed. show update report ui");
            return true;
        }
        if (isOwnedByOrganizationOrIsKioskMode()) {
            Log.W("show update report ui");
            return true;
        }
        boolean zIsMajorUpdate = MajorUpdate.FOR_WHATS_NEW.isMajorUpdate(this.context);
        boolean zIsMinorWelcomeMode = FloatingFeature.isMinorWelcomeMode();
        boolean zIsUpdateSucceeded = new UpdateResultUtils().isUpdateSucceeded();
        Log.I("isMajor : " + zIsMajorUpdate + ", isMinorWelcomeMode : " + zIsMinorWelcomeMode + ", isSuccess : " + zIsUpdateSucceeded);
        if (zIsMajorUpdate || zIsMinorWelcomeMode) {
            return !zIsUpdateSucceeded;
        }
        return true;
    }

    @Override // com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor
    public void updateActionInfo(String str) {
        Log.I("do nothing");
    }
}
