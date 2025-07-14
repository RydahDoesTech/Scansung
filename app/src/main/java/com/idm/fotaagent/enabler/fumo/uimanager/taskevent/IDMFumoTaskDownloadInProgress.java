package com.idm.fotaagent.enabler.fumo.uimanager.taskevent;

import android.content.Context;
import com.idm.fotaagent.BundleWrapper;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.enabler.fumo.uimanager.IDMFumoTaskCommon;
import com.idm.fotaagent.enabler.ui.IDMUIManager;
import com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationType;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTypeManager;
import com.idm.fotaagent.utils.ToastHelper;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class IDMFumoTaskDownloadInProgress extends IDMFumoTaskCommon {
    public IDMFumoTaskDownloadInProgress(String str) {
        super(str);
    }

    private boolean shouldShowDownloadProgress() {
        return (this.actionInfoDao.getInitType() == 2 && this.actionInfoDao.getPushUiMode() == 2) || this.actionInfoDao.getUiMode() == 1;
    }

    @Override // com.idm.fotaagent.enabler.fumo.uimanager.IDMFumoTaskCommon
    public void doTaskEvent() {
        NotificationTypeManager.notify(NotificationType.IDM_NOTIFICATION_DOWNLOAD_PROGRESS, this.taskId);
        if (shouldShowDownloadProgress()) {
            IDMUIManager.getInstance().sendActivityMessage(IDMUIEventInterface.UIACTIVITY.DOWNLOAD_PROGRESS, new BundleWrapper().setTaskId(this.taskId));
            return;
        }
        IDMUIManager.getInstance().finishAllActivities();
        Context contextIdmGetContext = IDMApplication.idmGetContext();
        ToastHelper.showLongToast(contextIdmGetContext, contextIdmGetContext.getString(R.string.STR_DOWNLOADING_UPDATE));
    }
}
