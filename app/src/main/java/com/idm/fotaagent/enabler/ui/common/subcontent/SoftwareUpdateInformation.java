package com.idm.fotaagent.enabler.ui.common.subcontent;

import android.content.Context;
import android.os.Build;
import android.os.SemSystemProperties;
import android.text.TextUtils;
import android.text.format.DateFormat;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import com.idm.fotaagent.IDMApplication;
import com.idm.fotaagent.database.room.data.repository.InstallParamRepository;
import com.idm.fotaagent.database.sqlite.database.dao.ActionInfoDao;
import com.idm.fotaagent.database.sqlite.database.dao.UpdateHistoryInfoDao;
import com.idm.fotaagent.database.sqlite.database.entity.IDMUpdateHistoryInfo;
import com.idm.fotaagent.enabler.ui.common.subcontent.ContentInjector;
import com.idm.fotaagent.utils.DeviceUtils;
import com.idm.providers.mo.IDMMoInterface;
import com.samsung.android.fotaagent.common.feature.FloatingFeature;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.knox.ddar.DualDARPolicy;
import com.wssyncmldm.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class SoftwareUpdateInformation extends ContentInjector.Model.TitleAndBullets {

    public static class Content {
        private final String androidVersion;
        private final Double fwSize;
        private final String fwVersion;
        private final int fwVersionMessageId;
        private final String oneUiVersion;
        private final String patchLevel;

        public Content(int i5, String str, Double d5, String str2, String str3, String str4) {
            this.fwVersionMessageId = i5;
            this.fwVersion = str;
            this.fwSize = d5;
            this.patchLevel = str2;
            this.oneUiVersion = str3;
            this.androidVersion = str4;
        }
    }

    public static class Last extends SoftwareUpdateInformation {
        public Last() {
            super(makeContent());
        }

        private static Content makeContent() {
            IDMUpdateHistoryInfo lastSuccessUpdateHistoryInfo = new UpdateHistoryInfoDao().getLastSuccessUpdateHistoryInfo();
            return new Content(R.string.STR_UPDATE_VERSION, lastSuccessUpdateHistoryInfo.version(), Double.valueOf(lastSuccessUpdateHistoryInfo.deltaSize() / 1000000.0d), lastSuccessUpdateHistoryInfo.securityPatchLevel(), lastSuccessUpdateHistoryInfo.oneUiVersion(), SoftwareUpdateInformation.parseAndroidVersion(lastSuccessUpdateHistoryInfo.androidVersion()));
        }
    }

    public static class Latest extends SoftwareUpdateInformation {
        private static final String BUILD_ONEUI = "ro.build.version.oneui";

        public Latest() {
            super(makeContent());
        }

        private static String getAndroidVersion() {
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            Log.I("Build.VERSION.RELEASE is empty");
            return "";
        }

        public static int getBuildOneUi() {
            return SemSystemProperties.getInt(BUILD_ONEUI, 0);
        }

        public static String getOneUiVersion() {
            if (getBuildOneUi() <= 0) {
                if (!isSemAvailable()) {
                    return DualDARPolicy.DUAL_DAR_VERSION_CODES.DUAL_DAR_1_0;
                }
                int i5 = Build.VERSION.SEM_PLATFORM_INT - 90000;
                return (i5 / IDMCallbackStatusInterface.IDM_RESULTS) + IDMMoInterface.IDM_MO_ROOT_PATH + ((i5 % IDMCallbackStatusInterface.IDM_RESULTS) / 100);
            }
            int buildOneUi = getBuildOneUi();
            int i6 = buildOneUi / IDMCallbackStatusInterface.IDM_RESULTS;
            int i7 = (buildOneUi % IDMCallbackStatusInterface.IDM_RESULTS) / 100;
            int i8 = buildOneUi % 100;
            if (i8 == 0) {
                return i6 + IDMMoInterface.IDM_MO_ROOT_PATH + i7;
            }
            return i6 + IDMMoInterface.IDM_MO_ROOT_PATH + i7 + IDMMoInterface.IDM_MO_ROOT_PATH + i8;
        }

        private static String getSecurityPatchLevel() {
            String str = Build.VERSION.SECURITY_PATCH;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            Log.I("Build.VERSION.SECURITY_PATCH is empty");
            return "";
        }

        public static boolean isSemAvailable() {
            return SoftwareUpdateInformation.getContext().getPackageManager().hasSystemFeature("com.samsung.feature.samsung_experience_mobile") || SoftwareUpdateInformation.getContext().getPackageManager().hasSystemFeature("com.samsung.feature.samsung_experience_mobile_lite");
        }

        private static Content makeContent() {
            return new Content(R.string.STR_CURRENT_VERSION, DeviceUtils.readFirmwareVersion(), null, getSecurityPatchLevel(), getOneUiVersion(), getAndroidVersion());
        }
    }

    public static class New extends SoftwareUpdateInformation {
        public New(String str) {
            super(makeContent(str));
        }

        private static Content makeContent(String str) {
            InstallParamRepository installParamRepository = new InstallParamRepository(SoftwareUpdateInformation.getContext());
            return new Content(R.string.STR_UPDATE_VERSION, installParamRepository.getUpdateFwVersion(), Double.valueOf(new ActionInfoDao(str).getObjectSize() / 1000000.0d), installParamRepository.getSecurityPatchVersion(), installParamRepository.getUpdateOneUiVersion(), SoftwareUpdateInformation.parseAndroidVersion(installParamRepository.getUpdateFwOsVersion()));
        }
    }

    public SoftwareUpdateInformation(Content content) {
        super(makeParagraphs(content));
    }

    private static CharSequence getAndroidVersion(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return String.format(getContext().getString(R.string.STR_ANDROID_VERSION), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Context getContext() {
        return IDMApplication.idmGetContext();
    }

    private static CharSequence getFwSizeDescription(Double d5) {
        if (d5 != null) {
            return String.format(getContext().getString(R.string.STR_UPDATE_SIZE_MB), String.format("%.2f", d5));
        }
        return null;
    }

    private static CharSequence getFwVersionDescription(int i5, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return String.format(getContext().getString(i5), str.replaceAll("/", " / "));
    }

    private static CharSequence getOneUiVersionDescription(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return String.format(getContext().getString(R.string.STR_ONE_UI_VERSION), str);
    }

    private static CharSequence getSecurityPatchLevelDescription(String str) throws ParseException {
        if (FloatingFeature.isMHSDevice()) {
            return null;
        }
        String securityPatchLevelReadable = parseSecurityPatchLevelReadable(str);
        if (TextUtils.isEmpty(securityPatchLevelReadable)) {
            return null;
        }
        return getContext().getString(R.string.STR_SECURITY_PATCH_LEVEL) + " " + securityPatchLevelReadable;
    }

    private static CharSequence[] makeParagraphs(Content content) {
        return new CharSequence[]{getOneUiVersionDescription(content.oneUiVersion), getAndroidVersion(content.androidVersion), getFwVersionDescription(content.fwVersionMessageId, content.fwVersion), getFwSizeDescription(content.fwSize), getSecurityPatchLevelDescription(content.patchLevel)};
    }

    public static String parseAndroidVersion(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.I("androidVersion is empty");
            return null;
        }
        Matcher matcher = Pattern.compile("\\((.*?)\\)").matcher(str);
        if (!matcher.find()) {
            Log.E("There is no string between '(' and ')'");
            return null;
        }
        String strReplaceAll = matcher.group(1).replaceAll("[^0-9]", "");
        if (!TextUtils.isEmpty(strReplaceAll)) {
            return strReplaceAll;
        }
        Log.I("There is no android version with numbers");
        return null;
    }

    private static String parseSecurityPatchLevelReadable(String str) throws ParseException {
        if (TextUtils.isEmpty(str)) {
            Log.I("securityPatchLevel is null or empty");
            return "";
        }
        try {
            return DateFormat.format(DateFormat.getBestDateTimePattern(Locale.getDefault(), "dMMMMyyyy"), new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).parse(str)).toString();
        } catch (ParseException e5) {
            Log.printStackTrace(e5);
            return "";
        }
    }

    @Override // com.idm.fotaagent.enabler.ui.common.subcontent.ContentInjector.Model.TitleAndBullets
    public int getTitleId() {
        return R.string.STR_UPDATE_INFO;
    }
}
