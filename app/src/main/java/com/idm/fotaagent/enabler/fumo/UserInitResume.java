package com.idm.fotaagent.enabler.fumo;

import android.content.Context;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskDownloadInProgress;
import com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskDownloadPause;
import com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskDownloadRetryConfirm;
import com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskDownloadYesNo;
import com.idm.fotaagent.enabler.fumo.uimanager.taskevent.IDMFumoTaskInstallConfirm;
import com.idm.fotaagent.enabler.network.DLNetworkChecker;
import com.idm.fotaagent.enabler.network.NetworkBlockedType;
import com.idm.fotaagent.enabler.ui.IDMUIManager;
import com.idm.fotaagent.scheduler.jobschedule.NetworkResumeJobScheduleManager;
import com.idm.fotaagent.utils.NetworkUtil;
import com.idm.fotaagent.utils.ToastHelper;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class UserInitResume {
    protected final ActionInfoDao actionInfoDao;
    protected final Context context;
    protected final String taskId;

    public UserInitResume(Context context, String str) {
        this.context = context;
        this.taskId = str;
        this.actionInfoDao = new ActionInfoDao(str);
    }

    private void showToastFor(boolean z4) {
        String string;
        if (z4) {
            string = this.context.getString(R.string.STR_DM_CONNECTING_SERVER) + "\n" + this.context.getString(R.string.STR_COMMON_PLZ_WAIT);
        } else {
            Log.I("network is not available");
            string = this.context.getString(R.string.STR_NETWORK_FAIL);
        }
        ToastHelper.showShortToast(this.context, string);
        IDMUIManager.getInstance().finishEntryActivityIfExists();
    }

    public void execute() {
        boolean z4 = true;
        this.actionInfoDao.setUiMode(1);
        int fumoStatus = this.actionInfoDao.getFumoStatus();
        A3.f.t("fumoStatus: ", fumoStatus);
        if (!NetworkUtil.isWiFiNetworkConnected(this.context) && !NetworkUtil.isMobileNetworkConnected(this.context)) {
            z4 = false;
        }
        if (IDMApplication.getEnablerFactory().getLibraryUtils().isTaskRunning(this.taskId)) {
            executeInTaskThreadRunning(fumoStatus, z4);
        } else {
            executeInTaskThreadNotRunning(fumoStatus, z4);
        }
    }

    public void executeInTaskThreadNotRunning(int i5, boolean z4) {
        Log.I("task thread not running");
        IDMFumoExecuteHandler iDMFumoExecuteHandler = new IDMFumoExecuteHandler(this.taskId);
        if (i5 == 0) {
            Log.E("should not be executed here");
            return;
        }
        if (i5 == 10) {
            NetworkResumeJobScheduleManager.cancel(this.context);
            iDMFumoExecuteHandler.fumoStartIfPossible();
            return;
        }
        if (i5 == 30) {
            if (needsNetwork() && DLNetworkChecker.getInstance().shouldShow(DLNetworkChecker.ConfirmType.DOWNLOAD_RETRY_CONFIRM, this.taskId)) {
                new IDMFumoTaskDownloadRetryConfirm(this.taskId).execute();
                return;
            } else {
                iDMFumoExecuteHandler.fumoStartIfPossible();
                return;
            }
        }
        if (i5 == 40) {
            iDMFumoExecuteHandler.executeIfPossible(50, (String) null);
            return;
        }
        if (i5 == 50) {
            new IDMFumoTaskInstallConfirm(this.taskId).execute();
            return;
        }
        if (i5 == 200) {
            NetworkBlockedType networkBlockedType = DLNetworkChecker.getInstance().getNetworkBlockedType(this.taskId);
            if (networkBlockedType.isBlocked()) {
                networkBlockedType.getFumoTaskEvent(this.taskId).execute();
                return;
            } else {
                new IDMFumoTaskDownloadYesNo(this.taskId).execute();
                return;
            }
        }
        if (i5 == 242) {
            new IDMFumoTaskDownloadPause(this.taskId).execute();
            return;
        }
        showToastFor(z4);
        if (z4) {
            NetworkResumeJobScheduleManager.cancel(this.context);
            iDMFumoExecuteHandler.fumoStartIfPossible();
        }
    }

    public void executeInTaskThreadRunning(int i5, boolean z4) {
        Log.I("task thread running");
        if (i5 == 30) {
            new IDMFumoTaskDownloadInProgress(this.taskId).execute();
            return;
        }
        if (i5 == 40) {
            showToastFor(true);
            return;
        }
        if (i5 == 50) {
            new IDMFumoTaskInstallConfirm(this.taskId).execute();
            return;
        }
        if (i5 != 200) {
            if (i5 != 242) {
                showToastFor(z4);
                return;
            } else {
                new IDMFumoTaskDownloadPause(this.taskId).execute();
                return;
            }
        }
        NetworkBlockedType networkBlockedType = DLNetworkChecker.getInstance().getNetworkBlockedType(this.taskId);
        if (networkBlockedType.isBlocked()) {
            networkBlockedType.getFumoTaskEvent(this.taskId).execute();
        } else {
            new IDMFumoTaskDownloadYesNo(this.taskId).execute();
        }
    }

    public boolean needsNetwork() {
        return true;
    }
}
