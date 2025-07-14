package com.idm.fotaagent.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.SemSystemProperties;
import com.idm.fotaagent.database.room.data.repository.AdminRepository;
import com.idm.fotaagent.enabler.adapter.IDMAdapterDeviceInfoImpl;
import com.samsung.android.fotaagent.common.FotaTelephonyManager;
import com.samsung.android.fotaagent.common.feature.CarrierFeature;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.knox.net.wifi.WifiAdminProfile;

/* loaded from: classes.dex */
public class NetworkUtil {
    public static int getCapabilityType(Context context) {
        String configApnType = CarrierFeature.getConfigApnType(FotaTelephonyManager.getDataSimSlotId(context));
        configApnType.getClass();
        switch (configApnType) {
            case "CAPTIVE_PORTAL":
                return 17;
            case "NOT_VPN":
                return 15;
            case "WIFI_P2P":
                return 6;
            case "TRUSTED":
                return 14;
            case "IA":
                return 7;
            case "CBS":
                return 5;
            case "DUN":
                return 2;
            case "IMS":
                return 4;
            case "MMS":
                return 0;
            case "RCS":
                return 8;
            case "EIMS":
                return 10;
            case "FOTA":
                return 3;
            case "SUPL":
                return 1;
            case "XCAP":
                return 9;
            case "NOT_RESTRICTED":
                return 13;
            case "NOT_METERED":
                return 11;
            case "VALIDATED":
                return 16;
            default:
                return 12;
        }
    }

    public static boolean isAnyNetworkConnected(Context context) {
        if (context != null) {
            return isWiFiNetworkConnected(context) || isMobileNetworkConnected(context);
        }
        Log.W("Context is null. The network is treated as not connected.");
        return false;
    }

    public static boolean isBlockedByRoaming(Context context) {
        return !new IDMAdapterDeviceInfoImpl().idmIsAvailableFOTAWithRoamingNetwork(context, "");
    }

    public static boolean isConnectedDataNetworkDomesticRoaming(Context context) {
        return isConnectedDataNetworkRoaming(context) && FotaTelephonyManager.getCurrentDataRoamingType(context) == 2;
    }

    public static boolean isConnectedDataNetworkRoaming(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
        if (connectivityManager == null) {
            Log.W("connectivityManager should not be null");
            return false;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities != null) {
            return networkCapabilities.hasCapability(12) && networkCapabilities.hasTransport(0) && !networkCapabilities.hasCapability(18);
        }
        Log.W("capabilities is null");
        return false;
    }

    public static boolean isMobileNetworkConnected(Context context) {
        return isNetworkConnected(context, 0);
    }

    private static boolean isNetworkConnected(Context context, int i5) {
        if (context == null) {
            Log.W("Context is null. The network is treated as not connected.");
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
            boolean zHasTransport = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()).hasTransport(i5);
            Log.I("networkType " + i5 + " is connected : " + zHasTransport);
            return zHasTransport;
        } catch (NullPointerException e5) {
            Log.printStackTrace(e5);
            return false;
        }
    }

    public static boolean isRoamingNetwork(Context context) {
        if (new AdminRepository(context).isRoamingCheckEnabled()) {
            return FotaTelephonyManager.isRoamingNetwork(context);
        }
        Log.I("Roaming check is false");
        return false;
    }

    public static boolean isUiccMobilityLocked(Context context) {
        if (SemSystemProperties.get("gsm.facilitylock.state", WifiAdminProfile.PHASE1_NONE).equals(Boolean.toString(true)) || FotaTelephonyManager.getSimState(context) == 2) {
            Log.I("PinLock ON !!");
            return true;
        }
        Log.I("PinLock OFF !!");
        return false;
    }

    public static boolean isWiFiNetworkConnected(Context context) {
        if (!isNetworkConnected(context, 1)) {
            return false;
        }
        Log.I("Wifi Network is connected");
        return true;
    }
}
