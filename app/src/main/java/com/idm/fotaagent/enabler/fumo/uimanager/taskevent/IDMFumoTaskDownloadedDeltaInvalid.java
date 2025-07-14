package com.idm.fotaagent.enabler.fumo.uimanager.taskevent;

import com.idm.fotaagent.enabler.fumo.uimanager.IDMFumoTaskCommon;
import com.idm.fotaagent.enabler.ui.IDMUIManager;
import com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface;

/* loaded from: classes.dex */
public class IDMFumoTaskDownloadedDeltaInvalid extends IDMFumoTaskCommon {
    public IDMFumoTaskDownloadedDeltaInvalid(String str) {
        super(str);
    }

    @Override // com.idm.fotaagent.enabler.fumo.uimanager.IDMFumoTaskCommon
    public void doTaskEvent() {
        IDMUIManager.getInstance().sendDialogMessage(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_DOWNLOADED_DELTA_INVALID);
    }
}
