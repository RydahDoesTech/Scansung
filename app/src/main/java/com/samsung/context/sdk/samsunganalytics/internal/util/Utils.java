package com.samsung.context.sdk.samsunganalytics.internal.util;

import I2.b;
import Y0.h;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Trace;
import android.provider.Settings;
import android.text.TextUtils;
import com.samsung.context.sdk.samsunganalytics.AnalyticsException;
import com.samsung.context.sdk.samsunganalytics.Configuration;
import com.samsung.context.sdk.samsunganalytics.internal.property.PropertyLogRegister;
import com.samsung.context.sdk.samsunganalytics.internal.property.PropertyLogSender;
import com.samsung.context.sdk.samsunganalytics.internal.sender.LogType;
import com.samsung.context.sdk.samsunganalytics.internal.setting.SettingLogRegister;
import com.samsung.context.sdk.samsunganalytics.internal.setting.SettingLogSender;
import com.samsung.context.sdk.samsunganalytics.internal.terms.RegisterLogSender;
import com.samsung.context.sdk.samsunganalytics.internal.terms.RegisterType;
import e1.AbstractC0415a;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class Utils {
    private static final int DMA_VERSION_NOT_SUPPORTED_APP_COMMON = 712601000;
    private static final int DMA_VERSION_PROVIDING_DATA = 710000000;
    private static final int DMA_VERSION_SUPPORTED_DELETE_SENSITIVE_DATA = 910701000;
    public static final String LOG_DELIMITER = "\u000e";
    private static BroadcastReceiver br;

    public enum Depth {
        ONE_DEPTH("\u0002", "\u0003"),
        TWO_DEPTH("\u0004", "\u0005"),
        THREE_DEPTH("\u0006", "\u0007");

        private final String collDlm;
        private final String keyValueDlm;

        Depth(String str, String str2) {
            this.collDlm = str;
            this.keyValueDlm = str2;
        }

        public String getCollectionDLM() {
            return this.collDlm;
        }

        public String getKeyValueDLM() {
            return this.keyValueDlm;
        }
    }

    public static void addAppCommonData(Context context, ContentValues contentValues, Configuration configuration) {
        HashMap map = new HashMap();
        map.put("av", AbstractC0415a.y(context));
        map.put("uv", configuration.getVersion());
        map.put("v", "6.05.077");
        Depth depth = Depth.ONE_DEPTH;
        contentValues.put("appCommon_data", makeDelimiterString(map, depth));
        if (TextUtils.isEmpty(configuration.getDeviceId())) {
            return;
        }
        HashMap map2 = new HashMap();
        map2.put("auid", configuration.getDeviceId());
        map2.put("at", String.valueOf(configuration.getAuidType()));
        contentValues.put("appCommon_did", makeDelimiterString(map2, depth));
    }

    public static boolean compareDays(int i5, Long l4) {
        return System.currentTimeMillis() > (((long) i5) * 86400000) + l4.longValue();
    }

    public static boolean compareHours(int i5, Long l4) {
        return System.currentTimeMillis() > (((long) i5) * 3600000) + l4.longValue();
    }

    public static long getDaysAgo(int i5) {
        return System.currentTimeMillis() - (i5 * 86400000);
    }

    public static long getTimeZoneOffset() {
        return TimeUnit.MILLISECONDS.toMinutes(TimeZone.getDefault().getRawOffset() + android.icu.util.TimeZone.getDefault().getDSTSavings());
    }

    public static LogType getTypeForServer(String str) {
        return "dl".equals(str) ? LogType.DEVICE : LogType.UIX;
    }

    public static boolean isAddingContentValueKeyAllowed(Context context) {
        return !isSendingAppCommonSupported(context);
    }

    public static boolean isAppVersionChanged(Context context, String str) {
        String strY = AbstractC0415a.y(context);
        String string = Preferences.getPreferences(context).getString(str, "");
        if (TextUtils.isEmpty(string)) {
            Preferences.getPreferences(context).edit().putString(str, strY).apply();
            return false;
        }
        if (string.equals(strY) || TextUtils.isEmpty(strY)) {
            return false;
        }
        Preferences.getPreferences(context).edit().putString(str, strY).apply();
        return true;
    }

    public static boolean isDeletionOfSensitiveDataSupported(Context context) {
        return DMA_VERSION_SUPPORTED_DELETE_SENSITIVE_DATA <= AbstractC0415a.q(context);
    }

    public static boolean isDev() {
        return !Build.TYPE.equals("user");
    }

    public static boolean isDiagnosticAgree(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "samsung_errorlog_agree", 0) == 1;
    }

    public static boolean isMultipleTcTypeSupported(Context context) {
        return !isSendingAppCommonSupported(context);
    }

    public static boolean isProvidingDataSupported(Context context) {
        return DMA_VERSION_PROVIDING_DATA <= AbstractC0415a.q(context);
    }

    public static boolean isSendingAppCommonSupported(Context context) {
        return DMA_VERSION_NOT_SUPPORTED_APP_COMMON > AbstractC0415a.q(context);
    }

    public static boolean isTcTypeChanged(Context context, Configuration configuration, Configuration configuration2) {
        if (!isMultipleTcTypeSupported(context)) {
            return false;
        }
        if (configuration == null) {
            return true;
        }
        return (configuration2 == null || configuration.isEnableUseInAppLogging() == configuration2.isEnableUseInAppLogging()) ? false : true;
    }

    public static String makeDelimiterString(Map<String, String> map, Depth depth) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append(depth.getCollectionDLM());
            }
            sb.append(entry.getKey());
            sb.append(depth.getKeyValueDLM());
            sb.append(entry.getValue());
        }
        return sb.toString();
    }

    public static Map<String, String> parseDelimiterString(String str, Depth depth) {
        HashMap map = new HashMap();
        for (String str2 : str.split(depth.getCollectionDLM())) {
            String[] strArrSplit = str2.split(depth.getKeyValueDLM());
            if (strArrSplit.length > 1) {
                map.put(strArrSplit[0], strArrSplit[1]);
            }
        }
        return map;
    }

    public static void registerProperties(Context context, Map<String, String> map) {
        new PropertyLogRegister(context).registerLog(map);
    }

    public static void registerReceiver(Context context, final Configuration configuration) {
        Debug.LogENG("register BR");
        if (br != null) {
            Debug.LogENG("BR is already registered");
            return;
        }
        br = new BroadcastReceiver() { // from class: com.samsung.context.sdk.samsunganalytics.internal.util.Utils.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(final Context context2, Intent intent) {
                StringBuilder sb = new StringBuilder("receive BR ");
                sb.append(intent != null ? intent.getAction() : "null");
                Debug.LogENG(sb.toString());
                if (intent == null || !"android.intent.action.ACTION_POWER_CONNECTED".equals(intent.getAction())) {
                    return;
                }
                h.f().e(new b() { // from class: com.samsung.context.sdk.samsunganalytics.internal.util.Utils.1.1
                    @Override // I2.b
                    public int onFinish() {
                        return 0;
                    }

                    @Override // I2.b
                    public void run() {
                        Utils.sendSettings(context2, configuration);
                        Utils.sendProperties(context2, configuration);
                    }
                });
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        context.registerReceiver(br, intentFilter);
    }

    public static void registerSettings(Context context, Map<String, Set<String>> map) {
        new SettingLogRegister(context).registerLog(map);
    }

    public static void sendProperties(Context context, Configuration configuration) {
        Trace.beginSection("PropertyLogSender sendLog");
        new PropertyLogSender(context, configuration).sendLog();
        Trace.endSection();
    }

    public static void sendRegistration(Application application, Configuration configuration, RegisterType registerType) {
        Trace.beginSection("RegisterLogSender sendLog");
        new RegisterLogSender(application, configuration, registerType).sendLog();
        Trace.endSection();
    }

    public static void sendSettings(Context context, Configuration configuration) {
        Trace.beginSection("SettingLogSender sendLog");
        new SettingLogSender(context, configuration).sendLog();
        Trace.endSection();
    }

    public static void throwException(String str) {
        if (isDev()) {
            throw new AnalyticsException(str);
        }
        Debug.LogE(str);
    }
}
