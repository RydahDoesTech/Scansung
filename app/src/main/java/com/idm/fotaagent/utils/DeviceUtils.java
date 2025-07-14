package com.idm.fotaagent.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SemSystemProperties;
import android.text.TextUtils;
import com.samsung.android.fotaagent.common.log.Log;
import com.wssyncmldm.Flavor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Locale;

/* loaded from: classes.dex */
public class DeviceUtils {
    private static final String AB_MODEL = "ro.build.ab_update";
    private static final String AID = "ro.boot.activatedid";
    private static final String BOOT_ID = "/proc/sys/kernel/random/boot_id";
    private static final String BUILD_TYPE = "ro.system.build.type";
    private static final String MDC_SINGLESKU = "mdc.singlesku";
    private static final String MDC_UNIFIED = "mdc.unified";
    private static final String PRODUCT_CODE = "ril.product_code";
    private static final String PRODUCT_MODEL = "ro.product.model";
    private static final String PRODUCT_SHIP = "ro.product_ship";
    private static final String SLOT_SUFFIX = "ro.boot.slot_suffix";
    private static final String UN_EMMC_CID_FILE_PATH = "/sys/block/mmcblk0/device/cid";
    private static final String UN_EMMC_MEMORYNAME_FILE_PATH = "/sys/block/mmcblk0/device/name";
    private static final String UN_EMMC_R_OS_FILE_PATH = "/sys/class/sec/mmc/un";
    private static final String UN_JDM_FILE_PATH = "sys/block/mmcblk0/device/unique_number";
    private static final String UN_UFS_FILE_PATH = "sys/class/scsi_host/host0/unique_number";
    private static final String UN_UFS_R_OS_FILE_PATH = "/sys/class/sec/ufs/un";
    private static final String VERSION_CSC = "ril.official_cscver";
    private static final String VERSION_PDA = "ro.build.PDA";
    private static final String VERSION_PHONE = "ril.sw_ver";

    public static String getActivatedId() {
        return SemSystemProperties.get(AID, "");
    }

    private static String getBuildType() {
        return SemSystemProperties.get(BUILD_TYPE, "");
    }

    public static String getCountryIsoCode() {
        return SemSystemProperties.getCountryIso();
    }

    public static String getSerialNumber() {
        try {
            return Build.getSerial();
        } catch (SecurityException e5) {
            Log.printStackTrace(e5);
            return "unknown";
        }
    }

    public static String getSlotSuffix() {
        return SemSystemProperties.get(SLOT_SUFFIX, "");
    }

    public static boolean isABModel() {
        return SemSystemProperties.getBoolean(AB_MODEL, false);
    }

    public static boolean isLiveDemoDevice() {
        String str = SemSystemProperties.get(PRODUCT_CODE, "");
        if (str.length() < 11) {
            return false;
        }
        if (str.charAt(10) != '8' && str.charAt(10) != '9') {
            return false;
        }
        Log.I("This device is LDUSKU by PRODUCT_CODE");
        return true;
    }

    private static boolean isShipBinary() {
        return SemSystemProperties.getBoolean(PRODUCT_SHIP, false);
    }

    public static boolean isTSS2_0() {
        return "true".equals(SemSystemProperties.get(MDC_SINGLESKU, "false")) && "true".equals(SemSystemProperties.get(MDC_UNIFIED, "false"));
    }

    public static boolean isUserShipBinary() {
        return "user".equals(getBuildType()) && isShipBinary();
    }

    public static boolean isWifiOnly() {
        return "wifi-only".equalsIgnoreCase(SemSystemProperties.get("ro.carrier", "Unknown").trim()) || "yes".equalsIgnoreCase(SemSystemProperties.get("ro.radio.noril", "no").trim());
    }

    public static String readAppVersionName(Context context) throws PackageManager.NameNotFoundException {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return !TextUtils.isEmpty(packageInfo.versionName) ? packageInfo.versionName : "";
        } catch (Exception e5) {
            Log.printStackTrace(e5);
            return "";
        }
    }

    public static String readBootId() throws IOException {
        return readTextFromFile(BOOT_ID);
    }

    private static String readCSCVersion() {
        return SemSystemProperties.get(VERSION_CSC, "");
    }

    public static String readFirmwareVersion() {
        return readPDAVersion() + "/" + readCSCVersion() + "/" + readPhoneVersion();
    }

    public static String readModelName() {
        String str = Build.MODEL;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = SemSystemProperties.get(PRODUCT_MODEL, "");
        return !str2.contains("/") ? str2 : str2.substring(0, str2.indexOf(47));
    }

    public static String readPDAVersion() {
        return Flavor.DeviceUtils.readPDAVersion(VERSION_PDA);
    }

    private static String readPhoneVersion() {
        return SemSystemProperties.get(VERSION_PHONE, "");
    }

    private static String readTextFromFile(String str) throws IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str), Charset.defaultCharset()));
            try {
                String line = bufferedReader.readLine();
                if (TextUtils.isEmpty(line)) {
                    bufferedReader.close();
                    return "";
                }
                String strTrim = line.trim();
                bufferedReader.close();
                return strTrim;
            } finally {
            }
        } catch (IOException e5) {
            Log.printStackTrace(e5);
            return "";
        }
    }

    public static String readUN() throws IOException {
        if (new File(UN_JDM_FILE_PATH).exists()) {
            String upperCase = readTextFromFile(UN_JDM_FILE_PATH).toUpperCase(Locale.getDefault());
            Log.H("Unique Number : " + upperCase + " from JDM");
            return upperCase;
        }
        if (new File(UN_UFS_R_OS_FILE_PATH).exists()) {
            String upperCase2 = readTextFromFile(UN_UFS_R_OS_FILE_PATH).toUpperCase(Locale.getDefault());
            Log.H("Unique Number : " + upperCase2 + " from R OS UFS");
            return upperCase2;
        }
        if (new File(UN_UFS_FILE_PATH).exists()) {
            String upperCase3 = readTextFromFile(UN_UFS_FILE_PATH).toUpperCase(Locale.getDefault());
            Log.H("Unique Number : " + upperCase3 + " from UFS");
            return upperCase3;
        }
        if (new File(UN_EMMC_R_OS_FILE_PATH).exists()) {
            String upperCase4 = readTextFromFile(UN_EMMC_R_OS_FILE_PATH).toUpperCase(Locale.getDefault());
            Log.H("Unique Number : " + upperCase4 + " from R OS eMMC");
            return upperCase4;
        }
        if (!new File(UN_EMMC_CID_FILE_PATH).exists()) {
            return "000000000000000000";
        }
        String textFromFile = readTextFromFile(UN_EMMC_CID_FILE_PATH);
        String textFromFile2 = readTextFromFile(UN_EMMC_MEMORYNAME_FILE_PATH);
        Log.H("cid : " + textFromFile + ", memory_name : " + textFromFile2);
        try {
            String strSubstring = textFromFile.substring(0, 2);
            String upperCase5 = ("c" + (strSubstring.equals("15") ? textFromFile2.substring(0, 2) : (strSubstring.equals("02") || strSubstring.equals("45")) ? textFromFile2.substring(3, 5) : (strSubstring.equals("11") || strSubstring.equals("90")) ? textFromFile2.substring(1, 3) : strSubstring.equalsIgnoreCase("FE") ? textFromFile2.substring(4, 6) : "") + textFromFile.substring(18, 30)).toUpperCase();
            Log.H("Unique Number : " + upperCase5 + " from eMMC");
            return upperCase5;
        } catch (StringIndexOutOfBoundsException e5) {
            Log.printStackTrace(e5);
            return "000000000000000000";
        }
    }
}
