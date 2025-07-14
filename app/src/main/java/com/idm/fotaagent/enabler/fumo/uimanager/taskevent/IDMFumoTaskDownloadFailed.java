package com.idm.fotaagent.enabler.fumo.uimanager.taskevent;

import com.idm.fotaagent.enabler.fumo.uimanager.IDMFumoTaskCommon;
import com.idm.fotaagent.enabler.ui.IDMUIManager;
import com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class IDMFumoTaskDownloadFailed extends IDMFumoTaskCommon {
    public IDMFumoTaskDownloadFailed(String str) {
        super(str);
    }

    @Override // com.idm.fotaagent.enabler.fumo.uimanager.IDMFumoTaskCommon
    public void doTaskEvent() {
        if (this.actionInfoDao.getUiMode() == 2) {
            Log.I("no pop-up");
        } else {
            IDMUIManager.getInstance().sendDialogMessage(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_DOWNLOAD_FAILED);
        }
    }
}
