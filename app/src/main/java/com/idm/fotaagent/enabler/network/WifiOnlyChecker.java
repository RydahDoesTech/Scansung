package com.idm.fotaagent.enabler.network;

import E2.b;
import android.content.Context;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.AdminRepository;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.database.sqlite.database.mo.Feature;
import com.idm.fotaagent.database.sqlite.database.mo.MoFumoExtDao;
import com.idm.fotaagent.utils.DeviceUtils;
import com.samsung.android.fotaagent.common.feature.CarrierFeature;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class WifiOnlyChecker {

    public static class LazyInstanceHolder {
        private static final WifiOnlyChecker INSTANCE = new WifiOnlyChecker();

        private LazyInstanceHolder() {
        }
    }

    private Context getContext() {
        return IDMApplication.idmGetContext();
    }

    public static WifiOnlyChecker getInstance() {
        return LazyInstanceHolder.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean lambda$isWifiOnlyByDevice$0(AdminRepository.WifiOnlyDevice wifiOnlyDevice) {
        return Boolean.valueOf(wifiOnlyDevice.equals(AdminRepository.WifiOnlyDevice.WIFI_ONLY_DEVICE_ON));
    }

    public boolean isWifiOnly() {
        return isWifiOnlyByDevice();
    }

    public boolean isWifiOnlyByDevice() {
        return ((Boolean) new Feature.MockWifiOnlyDevice(getContext()).getValue().map(new b(22)).orElse(Boolean.valueOf(DeviceUtils.isWifiOnly()))).booleanValue();
    }

    public boolean isWifiOnlyForDl(String str) {
        if (isWifiOnly()) {
            return true;
        }
        if (new MoFumoExtDao(new ActionInfoDao(str).getServerId()).getWifiOnlyForDl()) {
            Log.I("Wifi Only For DL by FUMO");
            return true;
        }
        if (!CarrierFeature.isWifiOnlyForDl()) {
            return false;
        }
        Log.I("Wifi Only For DL by CarrierFeature");
        return true;
    }

    private WifiOnlyChecker() {
    }
}
