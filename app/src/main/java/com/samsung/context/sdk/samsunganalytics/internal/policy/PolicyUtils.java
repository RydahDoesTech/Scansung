package com.samsung.context.sdk.samsunganalytics.internal.policy;

import I2.c;
import Y0.h;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.samsung.context.sdk.samsunganalytics.Configuration;
import com.samsung.context.sdk.samsunganalytics.LogBuilders;
import com.samsung.context.sdk.samsunganalytics.internal.Callback;
import com.samsung.context.sdk.samsunganalytics.internal.connection.API;
import com.samsung.context.sdk.samsunganalytics.internal.device.DeviceInfo;
import com.samsung.context.sdk.samsunganalytics.internal.util.AuthUtil;
import com.samsung.context.sdk.samsunganalytics.internal.util.ClientUtil;
import com.samsung.context.sdk.samsunganalytics.internal.util.Debug;
import com.samsung.context.sdk.samsunganalytics.internal.util.Preferences;
import com.samsung.context.sdk.samsunganalytics.internal.util.Utils;
import e1.AbstractC0415a;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class PolicyUtils {
    private static final int ALL_NEW_DMA_VERSION = 600000000;
    public static final int DLS = 0;
    public static final int DMA_B = 2;
    public static final int DMA_P = 3;
    private static final int DMA_SUPPORT_VERSION = 540000000;
    public static final int NONE = -1;
    private static int senderType = -1;

    private static PolicyClient buildPolicyClient(Context context, Configuration configuration, DeviceInfo deviceInfo, Callback<Void, Boolean> callback) {
        Debug.LogENG("Build policy client, trid: " + configuration.getTrackingId().substring(0, 7) + ", uv: " + configuration.getVersion());
        return new PolicyClient(API.GET_POLICY, makePolicyParam(context, deviceInfo, configuration), Preferences.getPreferences(context), callback);
    }

    private static String getCSC() {
        return getSystemProperties("ro.csc.sales_code");
    }

    private static String getCountryIso() {
        return getSystemProperties("ro.csc.countryiso_code");
    }

    public static int getRemainingQuota(Context context, int i5) {
        int i6;
        int i7;
        int i8;
        SharedPreferences preferences = Preferences.getPreferences(context);
        int i9 = 0;
        if (i5 == 1) {
            i7 = preferences.getInt(Constants.KEY_WIFI_QUOTA, 0);
            i8 = preferences.getInt(Constants.KEY_WIFI_USED, 0);
        } else {
            if (i5 != 0) {
                i6 = 0;
                return i9 - i6;
            }
            i7 = preferences.getInt(Constants.KEY_DATA_QUOTA, 0);
            i8 = preferences.getInt(Constants.KEY_DATA_USED, 0);
        }
        i6 = i8;
        i9 = i7;
        return i9 - i6;
    }

    public static int getSenderType() {
        return senderType;
    }

    private static String getSystemProperties(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e5) {
            Debug.logwingW("failed to get system properties : " + str + ", error : " + e5.getMessage());
            return "";
        }
    }

    public static int hasQuota(Context context, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        SharedPreferences preferences = Preferences.getPreferences(context);
        if (i5 == 1) {
            i8 = preferences.getInt(Constants.KEY_WIFI_QUOTA, 0);
            i9 = preferences.getInt(Constants.KEY_WIFI_USED, 0);
            i7 = preferences.getInt(Constants.KEY_WIFI_ONCE_QUOTA, 0);
        } else if (i5 == 0) {
            i8 = preferences.getInt(Constants.KEY_DATA_QUOTA, 0);
            i9 = preferences.getInt(Constants.KEY_DATA_USED, 0);
            i7 = preferences.getInt(Constants.KEY_DATA_ONCE_QUOTA, 0);
        } else {
            i7 = 0;
            i8 = 0;
            i9 = 0;
        }
        Debug.LogENG("Quota : " + i8 + "/ Uploaded : " + i9 + "/ limit : " + i7 + "/ size : " + i6);
        if (i8 < i9 + i6) {
            Debug.LogD("DLS Sender", "send result fail : Over daily quota (quota: " + i8 + "/ uploaded: " + i9 + "/ size: " + i6 + ")");
            return -1;
        }
        if (i7 >= i6) {
            return 0;
        }
        Debug.LogD("DLS Sender", "send result fail : Over once quota (limit: " + i7 + "/ size: " + i6 + ")");
        return -11;
    }

    public static boolean isPolicyExpired(Context context) {
        SharedPreferences preferences = Preferences.getPreferences(context);
        if (Utils.compareDays(1, Long.valueOf(preferences.getLong(Constants.LAST_QUOTA_RESET_DATE, 0L)))) {
            resetQuota(preferences);
        }
        return Utils.compareDays(preferences.getInt(Constants.POLICY_RINT, 1), Long.valueOf(preferences.getLong(Constants.POLICY_RECEIVED_DATE, 0L)));
    }

    private static Map<String, String> makePolicyParam(Context context, DeviceInfo deviceInfo, Configuration configuration) {
        HashMap map = new HashMap();
        map.put("pkn", context.getPackageName());
        map.put("dm", deviceInfo.getDeviceModel());
        if (!TextUtils.isEmpty(deviceInfo.getMcc())) {
            map.put("mcc", deviceInfo.getMcc());
        }
        if (!TextUtils.isEmpty(deviceInfo.getMnc())) {
            map.put("mnc", deviceInfo.getMnc());
        }
        map.put("uv", configuration.getVersion());
        map.put("sv", "6.05.077");
        map.put("tid", configuration.getTrackingId());
        String strValueOf = String.valueOf(System.currentTimeMillis());
        map.put("ts", strValueOf);
        map.put("hc", AuthUtil.sha256(configuration.getTrackingId() + strValueOf + ClientUtil.SALT));
        String csc = getCSC();
        if (!TextUtils.isEmpty(csc)) {
            map.put("csc", csc);
        }
        String countryIso = getCountryIso();
        if (!TextUtils.isEmpty(countryIso)) {
            map.put(LogBuilders.Property.COUNTRY_CODE, countryIso);
        }
        return map;
    }

    private static void resetQuota(SharedPreferences sharedPreferences) {
        sharedPreferences.edit().putLong(Constants.LAST_QUOTA_RESET_DATE, System.currentTimeMillis()).putInt(Constants.KEY_DATA_USED, 0).putInt(Constants.KEY_WIFI_USED, 0).apply();
    }

    public static void setSenderType(Context context, Configuration configuration) {
        if (senderType != -1) {
            return;
        }
        int iQ = AbstractC0415a.q(context);
        if (iQ >= DMA_SUPPORT_VERSION) {
            senderType = iQ >= ALL_NEW_DMA_VERSION ? 3 : 2;
        } else {
            senderType = configuration.isEnableUseInAppLogging() ? 0 : -1;
        }
    }

    public static void updatePolicy(Context context, Configuration configuration, c cVar, DeviceInfo deviceInfo, Callback<Void, Boolean> callback) {
        ((h) cVar).e(buildPolicyClient(context, configuration, deviceInfo, callback));
    }

    public static void useQuota(Context context, int i5, int i6) {
        SharedPreferences preferences = Preferences.getPreferences(context);
        if (i5 == 1) {
            preferences.edit().putInt(Constants.KEY_WIFI_USED, preferences.getInt(Constants.KEY_WIFI_USED, 0) + i6).apply();
        } else if (i5 == 0) {
            preferences.edit().putInt(Constants.KEY_DATA_USED, Preferences.getPreferences(context).getInt(Constants.KEY_DATA_USED, 0) + i6).apply();
        }
    }

    public static void updatePolicy(Context context, Configuration configuration, c cVar, DeviceInfo deviceInfo) {
        updatePolicy(context, configuration, cVar, deviceInfo, null);
    }
}
