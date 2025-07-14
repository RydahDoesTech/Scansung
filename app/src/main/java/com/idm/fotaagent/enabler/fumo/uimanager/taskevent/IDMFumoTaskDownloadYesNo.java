package com.idm.fotaagent.enabler.fumo.uimanager.taskevent;

import android.content.Context;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import com.idm.agent.dl.DLResultCode;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.FotaJobRepository;
import com.idm.fotaagent.enabler.fumo.IDMFumoExecuteHandler;
import com.idm.fotaagent.enabler.fumo.expiration.SessionExpirationManager;
import com.idm.fotaagent.enabler.fumo.uimanager.IDMFumoTaskCommon;
import com.idm.fotaagent.enabler.network.DLNetworkChecker;
import com.idm.fotaagent.enabler.ui.appfota.AppFotaFactory;
import com.idm.fotaagent.utils.NetworkUtil;
import com.samsung.android.fotaagent.common.feature.InRoaming;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class IDMFumoTaskDownloadYesNo extends IDMFumoTaskCommon {
    public IDMFumoTaskDownloadYesNo(String str) {
        super(str);
    }

    private void showDownloadConfirm() {
        new IDMFumoTaskDownloadConfirm(this.taskId).execute();
    }

    private void startDownloading() {
        new IDMFumoExecuteHandler(this.taskId).fumoStartIfPossible();
    }

    public boolean allowsToDownload() {
        Context contextIdmGetContext = IDMApplication.idmGetContext();
        int initType = this.actionInfoDao.getInitType();
        int pushUiMode = this.actionInfoDao.getPushUiMode();
        boolean zIsWiFiNetworkConnected = NetworkUtil.isWiFiNetworkConnected(contextIdmGetContext);
        if (new FotaJobRepository(contextIdmGetContext).isEmergencyService()) {
            Log.I("0. Emergency Service Type -> download");
            this.actionInfoDao.setUiMode(2);
            return true;
        }
        if (initType == 2) {
            if (pushUiMode != 1 && pushUiMode != 2) {
                if (pushUiMode != 4) {
                    Log.W("1-3. pushUiMode(" + pushUiMode + ") Non-urgent Push or Non push:  -> Not UrgentDownload");
                } else if (!zIsWiFiNetworkConnected) {
                    new IDMFumoTaskDownloadFailed(this.taskId).execute();
                    new IDMFumoExecuteHandler(this.taskId).executeIfPossible(35, DLResultCode.BLOCKED_BY_WIFI_BACKGROUND.getIndex());
                    Log.I("1-1. WIFIBACKGROUND push but Wi-Fi not connected -> wifibackground session failed");
                    return false;
                }
            }
            Log.I("1-2. Urgent push(" + pushUiMode + ") -> UrgentDownload");
            return true;
        }
        if (!NetworkUtil.isRoamingNetwork(contextIdmGetContext) || InRoaming.get() != InRoaming.ONLY_WIFI_PULL_ALLOWED) {
            Log.I("3. Others -> download");
            return true;
        }
        if (zIsWiFiNetworkConnected && initType == 1) {
            Log.I("2-1. roaming + onlywifipull + wifi + pull -> download");
            return true;
        }
        Log.I("2-2. roaming + onlywifipull + polling/push -> ignored");
        new IDMFumoExecuteHandler(this.taskId).executeIfPossible(IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_IN_CANCEL, DLResultCode.CANCELLED_BY_USER.getIndex());
        return false;
    }

    @Override // com.idm.fotaagent.enabler.fumo.uimanager.IDMFumoTaskCommon
    public void doTaskEvent() {
        if (allowsToDownload()) {
            AppFotaFactory.create(IDMApplication.idmGetContext()).getAppFota().informAppUpdateCenterOfTargetIfRequired();
            SessionExpirationManager.schedule(IDMApplication.idmGetContext(), this.taskId);
            if (DLNetworkChecker.getInstance().shouldShow(DLNetworkChecker.ConfirmType.DOWNLOAD_CONFIRM, this.taskId)) {
                showDownloadConfirm();
            } else {
                startDownloading();
            }
        }
    }
}
