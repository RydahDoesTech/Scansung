package com.idm.fotaagent.enabler.enablerfactory;

import A3.f;
import android.content.Context;
import com.idm.fotaagent.abupdate.enablerinterface.MemoryHandler;
import com.idm.fotaagent.enabler.fumo.IDMFumoInstallHandler;
import com.idm.fotaagent.enabler.fumo.UserInitResume;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorDownloadDescriptor;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorDownloadFailed;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorDownloadInProgress;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorDownloadPause;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorFumoStart;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorReportDownloadResult;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorUpdateInProgress;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorUpdateToReporting;
import com.idm.fotaagent.enabler.fumo.memory.FumoMemoryHandler;
import com.idm.fotaagent.enabler.ui.admin.main.hidden.executor.AdminCommandExecutor;
import com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogFragmentForDialog;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationBuilderVariant;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationType;
import com.idm.fotaagent.enabler.ui.postpone.PostponeModel;
import com.idm.fotaagent.utils.LibraryUtils;
import com.idm.fotaagent.utils.temperature.TemperatureChecker;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class NonABEnablerFactory extends AbstractEnablerFactory {
    @Override // com.idm.fotaagent.enabler.enablerfactory.AbstractEnablerFactory
    public IDMFumoExecutor doCreateExecutor(int i5, String str, int i6) {
        f.t("return Non AB executor - status : ", i5);
        if (i5 == 10) {
            return new IDMFumoExecutorFumoStart(str, i6);
        }
        if (i5 == 30) {
            return new IDMFumoExecutorDownloadInProgress(str, i6);
        }
        if (i5 == 35) {
            return new IDMFumoExecutorReportDownloadResult(str, i6);
        }
        if (i5 == 60) {
            return new IDMFumoExecutorUpdateInProgress(str);
        }
        if (i5 == 65) {
            return new IDMFumoExecutorUpdateToReporting(str);
        }
        if (i5 == 200) {
            return new IDMFumoExecutorDownloadDescriptor(str);
        }
        if (i5 == 242) {
            return new IDMFumoExecutorDownloadPause(str);
        }
        Log.E("return downloadFailed executor for abnormal status to create executor");
        return new IDMFumoExecutorDownloadFailed(str, i6);
    }

    @Override // com.idm.fotaagent.enabler.enablerfactory.AbstractEnablerFactory
    public AdminCommandExecutor getAdminCommandExecutor(Context context) {
        return new AdminCommandExecutor(context);
    }

    @Override // com.idm.fotaagent.enabler.enablerfactory.AbstractEnablerFactory
    public NotificationType.BuilderVariant getBuilderVariant() {
        return new NotificationBuilderVariant();
    }

    @Override // com.idm.fotaagent.enabler.enablerfactory.AbstractEnablerFactory
    public IDMFumoInstallHandler getInstallHandler(Context context, String str) {
        return new IDMFumoInstallHandler(context, str);
    }

    @Override // com.idm.fotaagent.enabler.enablerfactory.AbstractEnablerFactory
    public LibraryUtils getLibraryUtils() {
        return new LibraryUtils();
    }

    @Override // com.idm.fotaagent.enabler.enablerfactory.AbstractEnablerFactory
    public MemoryHandler getMemoryHandler(String str, FumoMemoryHandler.CheckStatus checkStatus) {
        return FumoMemoryHandler.get(str, checkStatus);
    }

    @Override // com.idm.fotaagent.enabler.enablerfactory.AbstractEnablerFactory
    public IDMUIDialogFragmentForDialog.ViewDialog getPleaseWaitDialog() {
        return new IDMUIDialogFragmentForDialog.NonABPleaseWaitDialog();
    }

    @Override // com.idm.fotaagent.enabler.enablerfactory.AbstractEnablerFactory
    public PostponeModel getPostponeModel(String str) {
        return new PostponeModel(str);
    }

    @Override // com.idm.fotaagent.enabler.enablerfactory.AbstractEnablerFactory
    public TemperatureChecker getTemperatureChecker() {
        return new TemperatureChecker();
    }

    @Override // com.idm.fotaagent.enabler.enablerfactory.AbstractEnablerFactory
    public UserInitResume getUserInitResume(Context context, String str) {
        return new UserInitResume(context, str);
    }
}
