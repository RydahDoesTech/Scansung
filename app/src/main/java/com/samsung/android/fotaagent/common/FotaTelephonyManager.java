package com.samsung.android.fotaagent.common;

import A2.b;
import android.content.Context;
import android.os.SemSystemProperties;
import android.telephony.ServiceState;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.idm.fotaagent.enabler.ui.whatsnew.a;
import com.samsung.android.fotaagent.common.log.Log;
import java.util.Objects;
import java.util.Optional;

/* loaded from: classes.dex */
public class FotaTelephonyManager {
    private static final String DEFAULT_MCC = "901";
    private static final String DEFAULT_MNC = "00";
    private static final String EXCEPTION_MCC_LIST = "001,002,999,@65,000";
    private static final String EXCEPTION_MNC_LIST = "@5";
    private static final String SIMSLOT_COUNT = "ro.multisim.simslotcount";

    public static int getCurrentDataRoamingType(Context context) {
        TelephonyManager telephonyManager = getTelephonyManager(context, getDataSubId());
        if (telephonyManager == null) {
            Log.W("tm should not be null");
            return 0;
        }
        ServiceState serviceState = telephonyManager.getServiceState();
        if (serviceState != null) {
            return serviceState.semGetCurrentDataRoamingType();
        }
        Log.W("serviceState should not be null");
        return 0;
    }

    public static int getCurrentPhoneType(Context context) {
        TelephonyManager telephonyManager = getTelephonyManager(context, 0);
        if (telephonyManager != null) {
            return telephonyManager.getPhoneType();
        }
        return 1;
    }

    public static int getDataNetworkType(Context context) {
        TelephonyManager telephonyManager = getTelephonyManager(context, getDataSubId());
        if (telephonyManager != null) {
            return telephonyManager.getDataNetworkType();
        }
        return 0;
    }

    public static int getDataSimSlotId(Context context) {
        if (isDualSim()) {
            return ((Integer) Optional.ofNullable((SubscriptionManager) context.getSystemService(SubscriptionManager.class)).map(new a(5)).map(new a(6)).orElseGet(new b(2))).intValue();
        }
        Log.I("device is not dual sim, so return 0");
        return 0;
    }

    public static int getDataSubId() {
        int defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId();
        if (defaultDataSubscriptionId > -1) {
            return defaultDataSubscriptionId;
        }
        return 0;
    }

    public static String getIMEI(Context context) {
        TelephonyManager telephonyManager = getTelephonyManager(context);
        if (telephonyManager == null) {
            return "";
        }
        try {
            return telephonyManager.getPrimaryImei();
        } catch (RuntimeException e5) {
            Log.E(e5.toString());
            return "";
        }
    }

    public static String getMEID(Context context) {
        TelephonyManager telephonyManager = getTelephonyManager(context);
        return telephonyManager != null ? telephonyManager.getMeid(0) : "";
    }

    public static String getNetworkOperator(Context context) {
        TelephonyManager telephonyManager = getTelephonyManager(context, getDataSubId());
        if (telephonyManager != null) {
            return telephonyManager.getNetworkOperator();
        }
        return null;
    }

    public static String getSimOperator(Context context) {
        TelephonyManager telephonyManager = getTelephonyManager(context, getDataSubId());
        if (telephonyManager != null) {
            return telephonyManager.getSimOperator();
        }
        return null;
    }

    public static String getSimOperatorName(Context context) {
        TelephonyManager telephonyManager = getTelephonyManager(context, getDataSubId());
        return telephonyManager != null ? telephonyManager.getSimOperatorName() : "";
    }

    public static int getSimState(Context context) {
        TelephonyManager telephonyManager = getTelephonyManager(context, getDataSubId());
        if (telephonyManager != null) {
            return telephonyManager.getSimState();
        }
        return 0;
    }

    private static TelephonyManager getTelephonyManager(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(TelephonyManager.class);
            Objects.requireNonNull(telephonyManager);
            return telephonyManager;
        } catch (Exception e5) {
            Log.printStackTrace(e5);
            return null;
        }
    }

    public static boolean isDualSim() {
        return SemSystemProperties.getInt(SIMSLOT_COUNT, 0) == 2;
    }

    public static boolean isRoamingNetwork(Context context) {
        TelephonyManager telephonyManager = getTelephonyManager(context, getDataSubId());
        return telephonyManager != null && telephonyManager.isNetworkRoaming();
    }

    public static boolean isVoiceCapable(Context context) {
        TelephonyManager telephonyManager = getTelephonyManager(context, getDataSubId());
        return telephonyManager != null && telephonyManager.isVoiceCapable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SubscriptionInfo lambda$getDataSimSlotId$0(SubscriptionManager subscriptionManager) {
        return subscriptionManager.getActiveSubscriptionInfo(getDataSubId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$getDataSimSlotId$1(SubscriptionInfo subscriptionInfo) {
        Log.I("subscriptionID : " + getDataSubId() + ", slotId : " + subscriptionInfo.getSimSlotIndex());
        return Integer.valueOf(subscriptionInfo.getSimSlotIndex());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$getDataSimSlotId$2() {
        Log.W("SubscriptionManager or subscriptionInfo is null, so return 0");
        return 0;
    }

    public static String readMCC(String str) {
        if (TextUtils.isEmpty(str)) {
            return DEFAULT_MCC;
        }
        String strSubstring = str.substring(0, 3);
        if (!EXCEPTION_MCC_LIST.contains(strSubstring)) {
            return strSubstring;
        }
        Log.I("Change Except MCC to Default");
        return DEFAULT_MCC;
    }

    public static String readMNC(String str) {
        if (TextUtils.isEmpty(str)) {
            return DEFAULT_MNC;
        }
        String strSubstring = str.substring(3);
        if (!EXCEPTION_MNC_LIST.equals(strSubstring)) {
            return strSubstring;
        }
        Log.I("Change Except MNC to Default");
        return DEFAULT_MNC;
    }

    public static String readNetworkMCC(Context context) {
        try {
            String networkOperator = getNetworkOperator(context);
            Objects.requireNonNull(networkOperator);
            return readMCC(networkOperator);
        } catch (Exception e5) {
            Log.printStackTrace(e5);
            return "";
        }
    }

    public static String readNetworkMNC(Context context) {
        try {
            String networkOperator = getNetworkOperator(context);
            Objects.requireNonNull(networkOperator);
            return readMNC(networkOperator);
        } catch (Exception e5) {
            Log.printStackTrace(e5);
            return "";
        }
    }

    public static String readSimMCC(Context context) {
        if (getSimState(context) != 5) {
            return DEFAULT_MCC;
        }
        try {
            String simOperator = getSimOperator(context);
            Objects.requireNonNull(simOperator);
            return readMCC(simOperator);
        } catch (Exception e5) {
            Log.printStackTrace(e5);
            return DEFAULT_MCC;
        }
    }

    public static String readSimMNC(Context context) {
        if (getSimState(context) != 5) {
            return DEFAULT_MNC;
        }
        try {
            String simOperator = getSimOperator(context);
            Objects.requireNonNull(simOperator);
            return readMNC(simOperator);
        } catch (Exception e5) {
            Log.printStackTrace(e5);
            return DEFAULT_MNC;
        }
    }

    private static TelephonyManager getTelephonyManager(Context context, int i5) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(TelephonyManager.class);
            Objects.requireNonNull(telephonyManager);
            return telephonyManager.createForSubscriptionId(i5);
        } catch (Exception e5) {
            Log.printStackTrace(e5);
            return null;
        }
    }
}
