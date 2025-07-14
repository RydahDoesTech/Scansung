package com.idm.fotaagent.enabler.fumo.uimanager.taskevent;

import android.content.Context;
import com.idm.fotaagent.BundleWrapper;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.sqlite.database.settings.AutoDownloadOptions;
import com.idm.fotaagent.database.sqlite.database.settings.SettingsDatabaseManager;
import com.idm.fotaagent.enabler.fumo.uimanager.IDMFumoTaskCommon;
import com.idm.fotaagent.enabler.network.DLNetworkChecker;
import com.idm.fotaagent.enabler.network.NetworkBlockedType;
import com.idm.fotaagent.enabler.ui.IDMUIManager;
import com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationId;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationType;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTypeManager;
import com.idm.fotaagent.scheduler.jobschedule.NetworkResumeJobScheduleManager;
import com.idm.fotaagent.utils.NetworkUtil;

/* loaded from: classes.dex */
public class IDMFumoTaskDownloadRetryConfirm extends IDMFumoTaskCommon {
    public IDMFumoTaskDownloadRetryConfirm(String str) {
        super(str);
    }

    @Override // com.idm.fotaagent.enabler.fumo.uimanager.IDMFumoTaskCommon
    public void doTaskEvent() {
        Context contextIdmGetContext = IDMApplication.idmGetContext();
        NotificationTypeManager.cancel(NotificationId.NOTIFICATION_ID_PRIMARY);
        NetworkBlockedType networkBlockedType = DLNetworkChecker.getInstance().getNetworkBlockedType(this.taskId);
        if (networkBlockedType.isBlocked()) {
            NetworkResumeJobScheduleManager.schedule(contextIdmGetContext);
            networkBlockedType.getFumoTaskEvent(this.taskId).execute();
            return;
        }
        boolean zIsWiFiNetworkConnected = NetworkUtil.isWiFiNetworkConnected(contextIdmGetContext);
        AutoDownloadOptions autoDownloadOption = SettingsDatabaseManager.getAutoDownloadOption(contextIdmGetContext);
        if (!zIsWiFiNetworkConnected && (autoDownloadOption == AutoDownloadOptions.WIFI || autoDownloadOption == AutoDownloadOptions.WIFI_AND_CELLULAR)) {
            NetworkResumeJobScheduleManager.scheduleWithWifiOnly(contextIdmGetContext);
        }
        this.actionInfoDao.setUiMode(1);
        NotificationTypeManager.notify(NotificationType.IDM_NOTIFICATION_DOWNLOAD_RETRY_CONFIRM, this.taskId);
        IDMUIManager.getInstance().sendDialogMessage(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_DOWNLOAD_RETRY_CONFIRM, new BundleWrapper().setTaskId(this.taskId));
    }
}
