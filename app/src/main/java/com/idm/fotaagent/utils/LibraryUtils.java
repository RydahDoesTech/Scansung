package com.idm.fotaagent.utils;

import com.idm.service.actioninfo.IDMActionInfo;
import com.idm.service.provider.IDMProviderService;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class LibraryUtils {
    public void cancelABDownloadingAndInstalling() {
    }

    public void cancelRunningTask(IDMActionInfo iDMActionInfo) {
        Log.I("");
        IDMProviderService.idmSendMessageCancelTask(iDMActionInfo);
        cancelABDownloadingAndInstalling();
    }

    public boolean isTaskRunning(String str) {
        return IDMProviderService.idmIsExistTaskThread(str) || isUpdateEngineRunning();
    }

    public boolean isUpdateEngineRunning() {
        Log.I("");
        return false;
    }
}
