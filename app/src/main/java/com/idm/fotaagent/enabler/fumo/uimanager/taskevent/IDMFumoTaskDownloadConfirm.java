package com.idm.fotaagent.enabler.fumo.uimanager.taskevent;

import android.content.Context;
import com.idm.fotaagent.BundleWrapper;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.enabler.feature.ResourceGenerator;
import com.idm.fotaagent.enabler.fumo.IdleChecker;
import com.idm.fotaagent.enabler.fumo.uimanager.IDMFumoTaskCommon;
import com.idm.fotaagent.enabler.ui.IDMUIManager;
import com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationType;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTypeManager;
import com.idm.fotaagent.utils.ToastHelper;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class IDMFumoTaskDownloadConfirm extends IDMFumoTaskCommon {
    public IDMFumoTaskDownloadConfirm(String str) {
        super(str);
    }

    @Override // com.idm.fotaagent.enabler.fumo.uimanager.IDMFumoTaskCommon
    public void doTaskEvent() {
        if (this.actionInfoDao.getUiMode() == 1) {
            IDMUIManager.getInstance().sendActivityMessage(IDMUIEventInterface.UIACTIVITY.DOWNLOAD_CONFIRM, new BundleWrapper().setTaskId(this.taskId));
            return;
        }
        Context contextIdmGetContext = IDMApplication.idmGetContext();
        if (new IdleChecker(contextIdmGetContext).isIdle()) {
            IDMUIManager.getInstance().sendActivityMessage(IDMUIEventInterface.UIACTIVITY.DOWNLOAD_CONFIRM, new BundleWrapper().setTaskId(this.taskId));
            return;
        }
        Log.I("not idle");
        NotificationTypeManager.notify(NotificationType.IDM_NOTIFICATION_DOWNLOAD_CONFIRM, this.taskId);
        ToastHelper.showLongToast(contextIdmGetContext, contextIdmGetContext.getString(ResourceGenerator.get().getDownloadConfirmTitleId()));
        IDMUIManager.getInstance().finish(IDMUIEventInterface.UIACTIVITY.CHECKING_FOR_UPDATE);
    }
}
