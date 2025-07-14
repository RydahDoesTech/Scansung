package com.idm.fotaagent.enabler.fumo.policy.checkers;

import android.content.Context;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.fumo.IDMFumoExecuteHandler;
import com.idm.fotaagent.enabler.fumo.policy.afw.SystemPolicy;
import com.idm.fotaagent.enabler.fumo.policy.exceptions.DownloadNotAllowedByPolicyException;
import com.idm.fotaagent.enabler.fumo.policy.exceptions.InstallFailedByPolicyException;
import com.idm.fotaagent.enabler.fumo.policy.exceptions.InstallSuspendedByPolicyException;
import com.idm.fotaagent.enabler.fumo.policy.interfaces.ActionForException;
import com.idm.fotaagent.enabler.fumo.postpone.PostponeManager;
import com.idm.fotaagent.enabler.fumo.postpone.PostponeReason;
import com.idm.fotaagent.enabler.fumo.postpone.PostponeType;
import com.idm.fotaagent.enabler.ui.IDMUIManager;
import com.idm.fotaagent.enabler.ui.interfaces.IDMUIEventInterface;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationId;
import com.idm.fotaagent.enabler.ui.notification.manager.NotificationTypeManager;
import com.idm.fotaagent.utils.EpochTime;
import com.idm.fotaagent.utils.UpdateResultUtils;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public class Action {

    public static class DownloadNotAllowed implements ActionForException<DownloadNotAllowedByPolicyException> {
        private final String taskId;

        public DownloadNotAllowed(String str) {
            this.taskId = str;
        }

        @Override // com.idm.fotaagent.enabler.fumo.policy.interfaces.ActionForException
        public Consumer<DownloadNotAllowedByPolicyException> act() {
            return new a(this, 0);
        }

        @Override // com.idm.fotaagent.enabler.fumo.policy.interfaces.ActionForException
        public Class<DownloadNotAllowedByPolicyException> getExceptionClass() {
            return DownloadNotAllowedByPolicyException.class;
        }

        public void reportAndShowUiIfNeeded(DownloadNotAllowedByPolicyException downloadNotAllowedByPolicyException) {
            Log.I("");
            new IDMFumoExecuteHandler(this.taskId).executeIfPossible(35, downloadNotAllowedByPolicyException.getDlResultCode());
            if (new ActionInfoDao(this.taskId).getUiMode() == 1) {
                IDMUIManager.getInstance().sendDialogMessage(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_BLOCKED_DEVICE_BY_POLICY);
            }
        }
    }

    public static abstract class Install {
        protected final String taskId;

        public Install(String str) {
            this.taskId = str;
        }

        public void removeNotificationAndShowPolicyDialogIfNeeded() {
            NotificationTypeManager.cancel(NotificationId.NOTIFICATION_ID_PRIMARY);
            if (new ActionInfoDao(this.taskId).getUiMode() == 1) {
                IDMUIManager.getInstance().sendDialogMessage(IDMUIEventInterface.UIDIALOG.IDM_DIALOG_BLOCKED_DEVICE_BY_POLICY);
            }
        }
    }

    public static class InstallFailed extends Install implements ActionForException<InstallFailedByPolicyException> {
        public InstallFailed(String str) {
            super(str);
        }

        @Override // com.idm.fotaagent.enabler.fumo.policy.interfaces.ActionForException
        public Consumer<InstallFailedByPolicyException> act() {
            return new a(this, 1);
        }

        @Override // com.idm.fotaagent.enabler.fumo.policy.interfaces.ActionForException
        public Class<InstallFailedByPolicyException> getExceptionClass() {
            return InstallFailedByPolicyException.class;
        }

        public void reportAndShowUiIfNeeded(InstallFailedByPolicyException installFailedByPolicyException) {
            Log.I("");
            new UpdateResultUtils().setUpdateResultCode(installFailedByPolicyException.getDmResultCode());
            new IDMFumoExecuteHandler(this.taskId).executeIfPossible(80, installFailedByPolicyException.getDmResultCode());
            removeNotificationAndShowPolicyDialogIfNeeded();
        }
    }

    public static class InstallSuspended extends Install implements ActionForException<InstallSuspendedByPolicyException> {
        public InstallSuspended(String str) {
            super(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$act$0(InstallSuspendedByPolicyException installSuspendedByPolicyException) {
            setAlarmAndShowUiIfNeeded();
        }

        @Override // com.idm.fotaagent.enabler.fumo.policy.interfaces.ActionForException
        public Consumer<InstallSuspendedByPolicyException> act() {
            return new a(this, 2);
        }

        @Override // com.idm.fotaagent.enabler.fumo.policy.interfaces.ActionForException
        public Class<InstallSuspendedByPolicyException> getExceptionClass() {
            return InstallSuspendedByPolicyException.class;
        }

        public void setAlarmAndShowUiIfNeeded() {
            Log.I("");
            Context contextIdmGetContext = IDMApplication.idmGetContext();
            PostponeManager.set(new PostponeType.Install.PolicyWindowed(), EpochTime.getNextRandomlyBetween(SystemPolicy.getInstallStartMinute(contextIdmGetContext), SystemPolicy.getInstallEndMinute(contextIdmGetContext)).getTimeInMillis(), PostponeReason.BY_POLICY, this.taskId);
            removeNotificationAndShowPolicyDialogIfNeeded();
        }
    }
}
