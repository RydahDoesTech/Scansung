package com.idm.fotaagent.enabler.fumo.uimanager.taskevent;

import com.idm.fotaagent.BundleWrapper;
import com.idm.fotaagent.enabler.fumo.uimanager.IDMFumoTaskCommon;
import com.idm.fotaagent.enabler.ui.IDMUIManager;
import com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationType;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTypeManager;
import com.idm.fotaagent.receiver.dynamic.IDMDynamicReceivers;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class IDMFumoTaskDownloadPause extends IDMFumoTaskCommon {
    public IDMFumoTaskDownloadPause(String str) {
        super(str);
    }

    @Override // com.idm.fotaagent.enabler.fumo.uimanager.IDMFumoTaskCommon
    public void doTaskEvent() {
        NotificationTypeManager.notify(NotificationType.IDM_NOTIFICATION_DOWNLOAD_PAUSE, this.taskId);
        IDMDynamicReceivers.getInstance().registerTemperatureChangeReceiverIfNeeded();
        if (this.actionInfoDao.getUiMode() == 2) {
            Log.I("Do not show activity when download pause and background mode.");
        } else {
            IDMUIManager.getInstance().sendActivityMessage(IDMUIEventInterface.UIACTIVITY.DOWNLOAD_PROGRESS, new BundleWrapper().setTaskId(this.taskId));
        }
    }
}
