package com.idm.fotaagent.enabler.fumo.uimanager.taskevent;

import com.idm.fotaagent.BundleWrapper;
import com.idm.fotaagent.enabler.fumo.uimanager.IDMFumoTaskCommon;
import com.idm.fotaagent.enabler.ui.IDMUIManager;
import com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationType;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTypeManager;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class IDMFumoTaskDownloadFailedNetworkDisconnected extends IDMFumoTaskCommon {
    public IDMFumoTaskDownloadFailedNetworkDisconnected(String str) {
        super(str);
    }

    @Override // com.idm.fotaagent.enabler.fumo.uimanager.IDMFumoTaskCommon
    public void doTaskEvent() {
        NotificationTypeManager.notify(NotificationType.IDM_NOTIFICATION_DOWNLOAD_FAIL_NETWORK_DISCONNECTED, this.taskId);
        if (this.actionInfoDao.getUiMode() == 2) {
            Log.I("no pop-up");
        } else {
            IDMUIManager.getInstance().sendDialogMessage(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_DOWNLOAD_FAILED_NETWORK_DISCONNECTED, new BundleWrapper().setTaskId(this.taskId));
        }
    }
}
