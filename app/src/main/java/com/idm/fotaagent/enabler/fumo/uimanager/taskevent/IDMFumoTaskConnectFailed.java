package com.idm.fotaagent.enabler.fumo.uimanager.taskevent;

import A3.f;
import com.idm.fotaagent.enabler.fumo.uimanager.IDMFumoTaskCommon;
import com.idm.fotaagent.enabler.ui.IDMUIManager;
import com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationId;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTypeManager;

/* loaded from: classes.dex */
public class IDMFumoTaskConnectFailed extends IDMFumoTaskCommon {
    public IDMFumoTaskConnectFailed(String str) {
        super(str);
    }

    @Override // com.idm.fotaagent.enabler.fumo.uimanager.IDMFumoTaskCommon
    public void doTaskEvent() {
        int uiMode = this.actionInfoDao.getUiMode();
        if (uiMode == 2 || this.actionInfoDao.isReportFumoStatus()) {
            f.t("no pop-up, Ui Mode : ", uiMode);
        } else {
            IDMUIManager.getInstance().sendDialogMessage(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_CONNECT_FAIL);
        }
        NotificationTypeManager.cancel(NotificationId.NOTIFICATION_ID_PRIMARY);
    }
}
