package com.idm.fotaagent.database.sqlite.database.settings;

import A3.f;
import android.content.Context;
import android.provider.Settings;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class SettingsDatabaseManager {
    public static final int DB_VALUE_AUTO_DOWNLOAD_NOT_SET = -1;
    public static final int DB_VALUE_AUTO_DOWNLOAD_OFF = 0;
    public static final int DB_VALUE_AUTO_DOWNLOAD_WIFI = 1;
    public static final int DB_VALUE_AUTO_DOWNLOAD_WIFI_AND_CELLULAR = 2;
    private static final String KEY_AUTO_DOWNLOAD = "SOFTWARE_UPDATE_WIFI_ONLY2";
    private static final String KEY_BADGE_COUNT = "badge_for_fota";
    private static final String KEY_FIRST_NET_INSTALL = "attfota_forceinstall_FN_sim";
    private static final String KEY_LAST_CHECKED_DATE = "SOFTWARE_UPDATE_LAST_CHECKED_DATE";
    private static final int VALUE_FIRSTNET_STATE_OFF = 0;
    private static final int VALUE_FIRSTNET_STATE_ON = 1;

    public static void disableFirstNetInstall(Context context) {
        Log.I("disableFirstNetInstall");
        setFirstNetInstall(context, 0);
    }

    public static void enableFirstNetInstall(Context context) {
        Log.I("enableFirstNetInstall");
        setFirstNetInstall(context, 1);
    }

    public static int getAutoDownload(Context context) {
        int i5 = -1;
        try {
            i5 = Settings.System.getInt(context.getContentResolver(), KEY_AUTO_DOWNLOAD, -1);
        } catch (Exception e5) {
            Log.printStackTrace(e5);
        }
        f.t("get auto download : ", i5);
        return i5;
    }

    public static AutoDownloadOptions getAutoDownloadOption(Context context) {
        AutoDownloadDefaultValues autoDownloadDefaultValues = AutoDownloadDefaultValues.get();
        if (autoDownloadDefaultValues.needsToRemoveAutoDownloadMenu()) {
            AutoDownloadOptions option = autoDownloadDefaultValues.getOption();
            Log.I("removed auto download, regard as " + option);
            return option;
        }
        AutoDownloadOptions autoDownloadOptionsOf = AutoDownloadOptions.of(getAutoDownload(context));
        if (autoDownloadOptionsOf != AutoDownloadOptions.NOT_SET) {
            return autoDownloadOptionsOf;
        }
        AutoDownloadOptions option2 = autoDownloadDefaultValues.getOption();
        Log.W("set default auto download : " + option2);
        setAutoDownload(context, option2.getDbValue());
        return option2;
    }

    public static boolean isDeviceProvisioned(Context context) {
        int i5;
        try {
            i5 = Settings.Global.getInt(context.getContentResolver(), "device_provisioned", 0);
        } catch (Exception e5) {
            Log.printStackTrace(e5);
            i5 = 0;
        }
        return i5 == 1;
    }

    public static boolean setAutoDownload(Context context, int i5) {
        try {
            Log.I("set auto download : " + i5);
            return Settings.System.putInt(context.getContentResolver(), KEY_AUTO_DOWNLOAD, i5);
        } catch (Exception e5) {
            Log.printStackTrace(e5);
            return false;
        }
    }

    public static void setBadgeCount(Context context, int i5) {
        f.t("set badge count : ", i5);
        try {
            Settings.System.putInt(context.getContentResolver(), KEY_BADGE_COUNT, i5);
        } catch (Exception | NoClassDefFoundError e5) {
            Log.printStackTrace(e5);
        }
    }

    private static void setFirstNetInstall(Context context, int i5) {
        try {
            Settings.System.putInt(context.getContentResolver(), KEY_FIRST_NET_INSTALL, i5);
        } catch (Exception e5) {
            Log.printStackTrace(e5);
        }
    }

    public static void setLastCheckedData(Context context, long j5) {
        try {
            Settings.System.putLong(context.getContentResolver(), KEY_LAST_CHECKED_DATE, j5);
        } catch (Exception e5) {
            Log.printStackTrace(e5);
        }
    }
}
