package com.idm.fotaagent.enabler.fumo.uimanager.taskevent;

import com.idm.fotaagent.BundleWrapper;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.enabler.fumo.uimanager.IDMFumoTaskCommon;
import com.idm.fotaagent.enabler.ui.IDMUIManager;
import com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationType;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTypeManager;
import com.idm.fotaagent.scheduler.jobschedule.NetworkResumeJobScheduleManager;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class IDMFumoTaskDownloadFailedWifiDisconnected extends IDMFumoTaskCommon {
    public IDMFumoTaskDownloadFailedWifiDisconnected(String str) {
        super(str);
    }

    @Override // com.idm.fotaagent.enabler.fumo.uimanager.IDMFumoTaskCommon
    public void doTaskEvent() {
        NetworkResumeJobScheduleManager.schedule(IDMApplication.idmGetContext());
        NotificationTypeManager.notify(NotificationType.IDM_NOTIFICATION_DOWNLOAD_FAIL_WIFI_DISCONNECTED, this.taskId);
        if (this.actionInfoDao.getUiMode() != 2) {
            IDMUIManager.getInstance().sendDialogMessage(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_DOWNLOAD_FAILED_WIFI_DISCONNECTED, new BundleWrapper().setTaskId(this.taskId));
        } else {
            IDMUIManager.getInstance().finish(IDMUIEventInterface.UIACTIVITY.CHECKING_FOR_UPDATE);
            Log.I("no pop-up");
        }
    }
}
