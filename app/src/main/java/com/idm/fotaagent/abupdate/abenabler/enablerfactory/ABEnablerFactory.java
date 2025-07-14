package com.idm.fotaagent.abupdate.abenabler.enablerfactory;

import A3.f;
import android.content.Context;
import com.idm.fotaagent.abupdate.abenabler.ABInstallHandler;
import com.idm.fotaagent.abupdate.abenabler.Executor;
import com.idm.fotaagent.abupdate.abenabler.fumo.ABUserInitResume;
import com.idm.fotaagent.abupdate.abenabler.fumo.memory.ABMemoryHandler;
import com.idm.fotaagent.abupdate.abenabler.ui.admin.main.hidden.executor.ABAdminCommandExecutor;
import com.idm.fotaagent.abupdate.abenabler.ui.notification.manager.ABNotificationBuilderVariant;
import com.idm.fotaagent.abupdate.abenabler.utils.ABLibraryUtils;
import com.idm.fotaagent.abupdate.enablerinterface.MemoryHandler;
import com.idm.fotaagent.abupdate.utils.temperature.ABTemperatureChecker;
import com.idm.fotaagent.enabler.enablerfactory.AbstractEnablerFactory;
import com.idm.fotaagent.enabler.feature.ResourceGenerator;
import com.idm.fotaagent.enabler.fumo.IDMFumoInstallHandler;
import com.idm.fotaagent.enabler.fumo.UserInitResume;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutor;
import com.idm.fotaagent.enabler.fumo.executor.IDMFumoExecutorDownloadFailed;
import com.idm.fotaagent.enabler.fumo.memory.FumoMemoryHandler;
import com.idm.fotaagent.enabler.ui.admin.main.hidden.executor.AdminCommandExecutor;
import com.idm.fotaagent.enabler.ui.dialog.IDMUIDialogFragmentForDialog;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationType;
import com.idm.fotaagent.enabler.ui.postpone.PostponeModel;
import com.idm.fotaagent.utils.LibraryUtils;
import com.idm.fotaagent.utils.temperature.TemperatureChecker;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class ABEnablerFactory extends AbstractEnablerFactory {
    @Override // com.idm.fotaagent.enabler.enablerfactory.AbstractEnablerFactory
    public IDMFumoExecutor doCreateExecutor(int i5, String str, int i6) {
        f.t("return AB executor - status : ", i5);
        if (i5 == 10) {
            return new Executor.AB.FumoStart(str, i6);
        }
        if (i5 == 30) {
            return new Executor.AB.DownloadProgress(str, i6);
        }
        if (i5 == 35) {
            return new Executor.AB.ReportDownloadResult(str, i6);
        }
        if (i5 == 60) {
            return new Executor.AB.UpdateInProgress(str);
        }
        if (i5 == 65) {
            return new Executor.AB.UpdateToReporting(str);
        }
        if (i5 == 200) {
            return new Executor.AB.DownloadDescriptor(str);
        }
        if (i5 == 242) {
            return new Executor.AB.DownloadPause(str);
        }
        Log.E("return downloadFailed executor for abnormal status to create executor");
        return new IDMFumoExecutorDownloadFailed(str, i6);
    }

    @Override // com.idm.fotaagent.enabler.enablerfactory.AbstractEnablerFactory
    public AdminCommandExecutor getAdminCommandExecutor(Context context) {
        return new ABAdminCommandExecutor(context);
    }

    @Override // com.idm.fotaagent.enabler.enablerfactory.AbstractEnablerFactory
    public NotificationType.BuilderVariant getBuilderVariant() {
        return new ABNotificationBuilderVariant();
    }

    @Override // com.idm.fotaagent.enabler.enablerfactory.AbstractEnablerFactory
    public IDMFumoInstallHandler getInstallHandler(Context context, String str) {
        return new ABInstallHandler(context, str);
    }

    @Override // com.idm.fotaagent.enabler.enablerfactory.AbstractEnablerFactory
    public LibraryUtils getLibraryUtils() {
        return new ABLibraryUtils();
    }

    @Override // com.idm.fotaagent.enabler.enablerfactory.AbstractEnablerFactory
    public MemoryHandler getMemoryHandler(String str, FumoMemoryHandler.CheckStatus checkStatus) {
        return ABMemoryHandler.get(str, checkStatus);
    }

    @Override // com.idm.fotaagent.enabler.enablerfactory.AbstractEnablerFactory
    public IDMUIDialogFragmentForDialog.ViewDialog getPleaseWaitDialog() {
        return new IDMUIDialogFragmentForDialog.ABPleaseWaitDialog();
    }

    @Override // com.idm.fotaagent.enabler.enablerfactory.AbstractEnablerFactory
    public PostponeModel getPostponeModel(String str) {
        return new PostponeModel(str, R.string.STR_AUTO_RESTART_AT_AB, ResourceGenerator.get().getUpdateScheduledDialogMessageId());
    }

    @Override // com.idm.fotaagent.enabler.enablerfactory.AbstractEnablerFactory
    public TemperatureChecker getTemperatureChecker() {
        return new ABTemperatureChecker();
    }

    @Override // com.idm.fotaagent.enabler.enablerfactory.AbstractEnablerFactory
    public UserInitResume getUserInitResume(Context context, String str) {
        return new ABUserInitResume(context, str);
    }
}
