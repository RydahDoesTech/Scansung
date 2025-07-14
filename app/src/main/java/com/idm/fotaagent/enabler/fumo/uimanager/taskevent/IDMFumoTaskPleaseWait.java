package com.idm.fotaagent.enabler.fumo.uimanager.taskevent;

import com.idm.fotaagent.enabler.fumo.uimanager.IDMFumoTaskCommon;
import com.idm.fotaagent.enabler.ui.IDMUIManager;
import com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationType;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTypeManager;

/* loaded from: classes.dex */
public class IDMFumoTaskPleaseWait extends IDMFumoTaskCommon {
    public IDMFumoTaskPleaseWait(String str) {
        super(str);
    }

    @Override // com.idm.fotaagent.enabler.fumo.uimanager.IDMFumoTaskCommon
    public void doTaskEvent() {
        NotificationTypeManager.notify(NotificationType.IDM_NOTIFICATION_PLEASE_WAIT, this.taskId);
        IDMUIManager.getInstance().sendDialogMessage(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_INSTALL_PLEASE_WAIT);
    }
}
