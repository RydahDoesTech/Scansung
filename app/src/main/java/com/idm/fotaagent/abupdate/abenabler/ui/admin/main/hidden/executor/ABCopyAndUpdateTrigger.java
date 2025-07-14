package com.idm.fotaagent.abupdate.abenabler.ui.admin.main.hidden.executor;

import android.content.Context;
import com.idm.fotaagent.abupdate.manager.EnablerManager;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseManager;
import com.idm.fotaagent.enabler.fumo.IDMFumoExecuteHandler;
import com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskDownloadInProgress;
import com.idm.fotaagent.enabler.ui.admin.main.hidden.executor.CopyAndUpdateTrigger;
import com.idm.fotaagent.enabler.ui.downloadprogress.DownloadProgressInfo;
import com.idm.fotaagent.utils.ToastHelper;
import com.idm.fotaagent.utils.UpdateResultUtils;
import com.samsung.android.fotaagent.common.log.Log;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashSet;

/* loaded from: classes.dex */
public class ABCopyAndUpdateTrigger extends CopyAndUpdateTrigger {
    public ABCopyAndUpdateTrigger(Context context, String str, String str2, String str3, boolean z4) {
        super(context, str, str2, str3, z4);
    }

    private void changePermissionTo644() throws IOException {
        HashSet hashSet = new HashSet();
        hashSet.add(PosixFilePermission.OWNER_READ);
        hashSet.add(PosixFilePermission.OWNER_WRITE);
        hashSet.add(PosixFilePermission.GROUP_READ);
        hashSet.add(PosixFilePermission.OTHERS_READ);
        Files.setPosixFilePermissions(new File(this.dstPath).toPath(), hashSet);
    }

    @Override // com.idm.fotaagent.enabler.ui.admin.main.hidden.executor.CopyAndUpdateTrigger
    public void startUpdate() {
        ToastHelper.showShortToast(this.context, "Start to update");
        try {
            changePermissionTo644();
            new UpdateResultUtils().initializeUpdateResult();
            Log.I("Download and install will be started");
            new IDMFumoExecuteHandler(this.taskId).callbackIfPossible(30, null);
            new IDMFumoTaskDownloadInProgress(this.taskId).execute();
            EnablerManager.getInstance().applyPayload(0L);
            DownloadProgressInfo.start(this.taskId);
        } catch (IOException unused) {
            Log.E("Failed to change permission to 644");
            ToastHelper.showShortToast(this.context, "Failed to localtest");
            IDMDatabaseManager.getInstance().deleteEnablerEntitiesAndResetFumoExtMo();
        }
    }
}
