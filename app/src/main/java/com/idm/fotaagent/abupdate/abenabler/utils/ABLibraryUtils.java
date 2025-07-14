package com.idm.fotaagent.abupdate.abenabler.utils;

import com.idm.fotaagent.abupdate.manager.EnablerManager;
import com.idm.fotaagent.utils.LibraryUtils;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class ABLibraryUtils extends LibraryUtils {
    @Override // com.idm.fotaagent.utils.LibraryUtils
    public void cancelABDownloadingAndInstalling() {
        Log.I("");
        EnablerManager.getInstance().cancelDownloadingAndInstalling();
    }

    @Override // com.idm.fotaagent.utils.LibraryUtils
    public boolean isUpdateEngineRunning() {
        Log.I("");
        return EnablerManager.getInstance().isRunning();
    }
}
