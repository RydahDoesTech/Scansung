package com.idm.fotaagent.enabler.network;

import android.content.Context;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.FotaJobRepository;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.utils.NetworkUtil;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
abstract class NetworkChecker {
    private boolean isEmergency() {
        if (!new FotaJobRepository(IDMApplication.idmGetContext()).isEmergencyService()) {
            return false;
        }
        Log.I("0. Emergency Service Type -> UrgentDownload");
        return true;
    }

    private boolean isUrgentPush(String str) {
        int pushUiMode = new ActionInfoDao(str).getPushUiMode();
        if (pushUiMode == 1 || pushUiMode == 2 || pushUiMode == 4) {
            Log.I("1. Urgent push(" + pushUiMode + ") -> UrgentDownload");
            return true;
        }
        Log.W("2. pushUiMode(" + pushUiMode + ") Non-urgent Push or Non push:  -> Not UrgentDownload");
        return false;
    }

    public abstract NetworkBlockedType getBlockedTypeOfWifiBackgroundPush(String str);

    public abstract NetworkBlockedType getBlockedTypeOfWifiOnlyForDl(String str);

    public NetworkBlockedType getNetworkBlockedType(String str) {
        Log.I("");
        Context contextIdmGetContext = IDMApplication.idmGetContext();
        if (new ActionInfoDao(str).isTriggeredBySideload()) {
            return NetworkBlockedType.NO_BLOCKING;
        }
        if (NetworkUtil.isWiFiNetworkConnected(contextIdmGetContext)) {
            Log.I("wifi connected");
            return NetworkBlockedType.NO_BLOCKING;
        }
        if (NetworkUtil.isBlockedByRoaming(contextIdmGetContext)) {
            Log.I("blocked due to roaming");
            return NetworkBlockedType.ROAMING;
        }
        if (!NetworkUtil.isMobileNetworkConnected(contextIdmGetContext)) {
            Log.I("Both wifi and mobile network disconnected");
            return NetworkBlockedType.NETWORK_DISCONNECTED;
        }
        if (isEmergency()) {
            Log.I("allowed by emergency concept");
            return NetworkBlockedType.NO_BLOCKING;
        }
        if (isUrgentPush(str)) {
            Log.I("allowed by urgent concept");
            return getBlockedTypeOfWifiBackgroundPush(str);
        }
        if (!WifiOnlyChecker.getInstance().isWifiOnly()) {
            return getBlockedTypeOfWifiOnlyForDl(str);
        }
        Log.I("Wifi only, wifi disconnected : blocked");
        return NetworkBlockedType.WIFI_DISCONNECTED;
    }

    public boolean isUrgentDownload(String str) {
        return isEmergency() || isUrgentPush(str);
    }
}
