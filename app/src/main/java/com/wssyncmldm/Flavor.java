package com.wssyncmldm;

import android.content.Context;
import android.os.SemSystemProperties;
import android.text.TextUtils;
import com.samsung.android.fotaagent.common.feature.CarrierFeature;

/* loaded from: classes.dex */
public class Flavor {
    public static final String SERVICE_ID = "x6g1q14r75";
    public static final String SIMPLE_PKGNAME = "wssyncmldm";

    public static class Apn {
        public static boolean usesConfiguredApn(int i5) {
            return !TextUtils.isEmpty(CarrierFeature.getConfigApnType(i5));
        }
    }

    public static class DeviceUtils {
        public static String readPDAVersion(String str) {
            return SemSystemProperties.get(str, "");
        }
    }

    public static class DownloadAndInstallProgressModel {
        public static boolean isHMDDevice() {
            return false;
        }
    }

    public static class DownloadProgressModel {
        public static boolean isHMDDevice() {
            return false;
        }
    }

    public static class IDMEnablerInterface {
        public static final String IDM_FOTA_DELTA_FILE_NAME = "update.zip";
    }

    public static class LocalTest {
        public static void disableUpdateResultDialogIfUtAgent(Context context) {
        }

        public static void enableUpdateResultDialogIfUtAgent(Context context) {
        }
    }

    public static class Log {
        public static final String TAG_NAME = "IDM_FOTA";
    }

    public static class SettingsDatabaseManager {
        public static final boolean needsBadge = true;
    }

    public static class SilentReboot {
        public static boolean supportsSilentReboot() {
            return true;
        }
    }
}
