package com.idm.fotaagent.enabler.fumo.uimanager.taskevent;

import com.idm.fotaagent.BundleWrapper;
import com.idm.fotaagent.enabler.fumo.uimanager.IDMFumoTaskCommon;
import com.idm.fotaagent.enabler.ui.IDMUIManager;
import com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationId;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTypeManager;
import com.idm.fotaagent.scheduler.IDMSchedulerHandler;
import com.idm.fotaagent.scheduler.interfaces.IDMSchedulerInterface;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class IDMFumoTaskDownloadFailedRoaming extends IDMFumoTaskCommon {
    public IDMFumoTaskDownloadFailedRoaming(String str) {
        super(str);
    }

    @Override // com.idm.fotaagent.enabler.fumo.uimanager.IDMFumoTaskCommon
    public void doTaskEvent() {
        if (this.actionInfoDao.getUiMode() == 2) {
            Log.I("UI BACKGROUND Mode, not show popup");
        } else {
            IDMUIManager.getInstance().sendDialogMessage(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_DOWNLOAD_FAILED_ROAMING, new BundleWrapper().setTaskId(this.taskId));
        }
        NotificationTypeManager.cancel(NotificationId.NOTIFICATION_ID_PRIMARY);
        if (this.actionInfoDao.getFumoStatus() == 0) {
            Log.I("IDMFumoTaskDownloadFailedRoaming FumoStatus None");
            IDMSchedulerHandler.getInstance().idmSendMessage(IDMSchedulerInterface.IDM_SCHEDULE_EVENT.SCHEDULE_EVENT_SCHEDULE_FINISH, this.taskId, 0L);
        }
    }
}
