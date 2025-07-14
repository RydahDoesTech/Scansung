package com.idm.fotaagent.enabler.enablerfactory;

import android.content.Context;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import com.idm.fotaagent.abupdate.enablerinterface.MemoryHandler;
import com.idm.fotaagent.enabler.fumo.IDMFumoInstallHandler;
import com.idm.fotaagent.enabler.fumo.UserInitResume;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorDownloadComplete;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorDownloadFailed;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorDownloadFailedReporting;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorDownloadInCancel;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorFinishAndExecute;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorReadyToUpdate;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorUpdateFailedNodata;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorUpdateSuccessfulNodata;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorUserCancelReporting;
import com.idm.fotaagent.enabler.fumo.memory.FumoMemoryHandler;
import com.idm.fotaagent.enabler.ui.admin.main.hidden.executor.AdminCommandExecutor;
import com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogFragmentForDialog;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationType;
import com.idm.fotaagent.enabler.ui.postpone.PostponeModel;
import com.idm.fotaagent.utils.LibraryUtils;
import com.idm.fotaagent.utils.temperature.TemperatureChecker;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public abstract class AbstractEnablerFactory {
    public abstract IDMFumoExecutor doCreateExecutor(int i5, String str, int i6);

    public abstract AdminCommandExecutor getAdminCommandExecutor(Context context);

    public abstract NotificationType.BuilderVariant getBuilderVariant();

    public IDMFumoExecutor getExecutor(int i5, String str, int i6) {
        switch (i5) {
            case 10:
            case 30:
            case 35:
            case 60:
            case 65:
            case 200:
            case IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_PAUSE /* 242 */:
                return doCreateExecutor(i5, str, i6);
            case 20:
                return new IDMFumoExecutorDownloadFailed(str, i6);
            case 40:
                return new IDMFumoExecutorDownloadComplete(str, i6);
            case 50:
                return new IDMFumoExecutorReadyToUpdate(str, i6);
            case 80:
                return new IDMFumoExecutorUpdateFailedNodata(str);
            case 100:
                return new IDMFumoExecutorUpdateSuccessfulNodata(str);
            case IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_IN_CANCEL /* 230 */:
                return new IDMFumoExecutorDownloadInCancel(str, i6);
            case IDMCallbackStatusInterface.IDM_DL_STATE_USER_CANCEL_REPORTING /* 240 */:
                return new IDMFumoExecutorUserCancelReporting(str);
            case IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_FAILED_REPORTING /* 241 */:
                return new IDMFumoExecutorDownloadFailedReporting(str);
            case IDMCallbackStatusInterface.IDM_STATUS_FINISH_AND_EXECUTE /* 1013 */:
                return new IDMFumoExecutorFinishAndExecute(str, i6);
            default:
                Log.E("return downloadFailed executor for abnormal status to create executor");
                return new IDMFumoExecutorDownloadFailed(str, i6);
        }
    }

    public abstract IDMFumoInstallHandler getInstallHandler(Context context, String str);

    public abstract LibraryUtils getLibraryUtils();

    public abstract MemoryHandler getMemoryHandler(String str, FumoMemoryHandler.CheckStatus checkStatus);

    public abstract IDMUIDialogFragmentForDialog.ViewDialog getPleaseWaitDialog();

    public abstract PostponeModel getPostponeModel(String str);

    public abstract TemperatureChecker getTemperatureChecker();

    public abstract UserInitResume getUserInitResume(Context context, String str);
}
