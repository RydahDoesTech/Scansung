package com.samsung.android.knox.application;

import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.samsung.android.knox.AppIdentity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class ApplicationPolicy {
    public static final String ACTION_APPLICATION_FOCUS_CHANGE = "com.samsung.android.knox.intent.action.APPLICATION_FOCUS_CHANGE";
    public static final String ACTION_PREVENT_APPLICATION_START = "com.samsung.android.knox.intent.action.PREVENT_APPLICATION_START";
    public static final String ACTION_PREVENT_APPLICATION_STOP = "com.samsung.android.knox.intent.action.PREVENT_APPLICATION_STOP";
    public static final int APPLICATION_INSTALLATION_MODE_ALLOW = 1;
    public static final int APPLICATION_INSTALLATION_MODE_DISALLOW = 0;
    public static final int APPLICATION_UNINSTALLATION_MODE_ALLOW = 1;
    public static final int APPLICATION_UNINSTALLATION_MODE_DISALLOW = 0;
    public static final Intent DEVICE_ASSISTANCE_ACTIVITY_TASK = null;
    public static final Intent DEVICE_ASSISTANCE_SERVICE_TASK = null;
    public static final int ERROR_APP_NOT_INSTALLED = -5;
    public static final int ERROR_CALLER_TARGET_SDK_NOT_SUPPORTED = -4;
    public static final int ERROR_INVALID_INPUT = -1;
    public static final int ERROR_NONE = 0;
    public static final int ERROR_PROXY_NO_ADMIN_RECEIVER = -6;
    public static final int ERROR_SIGNATURE_MISMATCH = -3;
    public static final int ERROR_UNKNOWN = -2;
    public static final String EXTRA_APPLICATION_FOCUS_COMPONENT_NAME = "com.samsung.android.knox.intent.extra.APPLICATION_FOCUS_COMPONENT_NAME";
    public static final String EXTRA_APPLICATION_FOCUS_DEX_MODE = "com.samsung.android.knox.intent.extra.APPLICATION_FOCUS_DEX_MODE";
    public static final String EXTRA_APPLICATION_FOCUS_STATUS = "com.samsung.android.knox.intent.extra.APPLICATION_FOCUS_STATUS";
    public static final String EXTRA_APPLICATION_PACKAGE_NAME = "com.samsung.android.knox.intent.extra.APPLICATION_PACKAGE_NAME";
    public static final String EXTRA_ERROR_CLASS = "com.samsung.android.knox.intent.extra.ERROR_CLASS";
    public static final String EXTRA_ERROR_REASON = "com.samsung.android.knox.intent.extra.ERROR_REASON";
    public static final String EXTRA_ERROR_TYPE = "com.samsung.android.knox.intent.extra.ERROR_TYPE";
    public static final String EXTRA_USER_ID = "com.samsung.android.knox.intent.extra.USER_ID";
    public static final int FLAG_ALLOW_PROXY_FOR_PFW = 1;
    public static final Intent LAUNCHER_TASK = null;
    public static final int NOTIFICATION_MODE_BLOCK_ALL = 2;
    public static final int NOTIFICATION_MODE_BLOCK_TEXT = 3;
    public static final int NOTIFICATION_MODE_BLOCK_TEXT_AND_SOUND = 4;
    public static final Intent OPEN_DIALER_TASK = null;
    public static final Intent OPEN_PDF_TASK = null;
    public static final Intent OPEN_URL_TASK = null;
    public static final int PERMISSION_POLICY_STATE_DEFAULT = 0;
    public static final int PERMISSION_POLICY_STATE_DENY = 2;
    public static final int PERMISSION_POLICY_STATE_GRANT = 1;
    public static final Intent PLAY_AUDIO_TASK = null;
    public static final Intent PLAY_VIDEO_TASK = null;
    public static final String PROXY_FLAGS = "proxy-flags";
    public static final Intent SMS_MMS_TASK = null;
    public static final int TYPE_APPROVED_APP_INSTALLER = 1;
    public static final int TYPE_CALL_RECORDING = 3;
    public static final int TYPE_EXTERNAL_STORAGE_ACCESS = 2;

    public ApplicationPolicy() {
        throw new RuntimeException("Stub!");
    }

    public boolean addAppPackageNameToBlackList(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean addAppPackageNameToWhiteList(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean addAppPermissionToBlackList(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean addAppSignatureToBlackList(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean addAppSignatureToWhiteList(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean addHomeShortcut(String str, String str2) {
        throw new RuntimeException("Stub!");
    }

    public boolean addNewAdminActivationAppWhiteList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public int addPackageToBatteryOptimizationWhiteList(AppIdentity appIdentity) {
        throw new RuntimeException("Stub!");
    }

    public int addPackageToBlackList(int i5, AppIdentity appIdentity) {
        throw new RuntimeException("Stub!");
    }

    public int addPackageToWhiteList(int i5, AppIdentity appIdentity) {
        throw new RuntimeException("Stub!");
    }

    public boolean addPackagesToClearCacheBlackList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean addPackagesToClearCacheWhiteList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean addPackagesToClearDataBlackList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean addPackagesToClearDataWhiteList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean addPackagesToDisableClipboardBlackList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean addPackagesToDisableClipboardWhiteList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean addPackagesToDisableUpdateBlackList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean addPackagesToDisableUpdateWhiteList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean addPackagesToFocusMonitoringList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean addPackagesToForceStopBlackList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean addPackagesToForceStopWhiteList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean addPackagesToNotificationBlackList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean addPackagesToNotificationWhiteList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public List<String> addPackagesToPreventStartBlackList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean addPackagesToWidgetBlackList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean addPackagesToWidgetWhiteList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean addUsbDevicesForDefaultAccess(String str, List<UsbDeviceConfig> list) {
        throw new RuntimeException("Stub!");
    }

    public int applyRuntimePermissions(AppIdentity appIdentity, List<String> list, int i5) {
        throw new RuntimeException("Stub!");
    }

    public boolean changeApplicationIcon(String str, byte[] bArr) {
        throw new RuntimeException("Stub!");
    }

    public boolean changeApplicationName(String str, String str2) {
        throw new RuntimeException("Stub!");
    }

    public boolean clearAppPackageNameFromList() {
        throw new RuntimeException("Stub!");
    }

    public boolean clearAppSignatureFromList() {
        throw new RuntimeException("Stub!");
    }

    public boolean clearDisableClipboardBlackList() {
        throw new RuntimeException("Stub!");
    }

    public boolean clearDisableClipboardWhiteList() {
        throw new RuntimeException("Stub!");
    }

    public boolean clearDisableUpdateBlackList() {
        throw new RuntimeException("Stub!");
    }

    public boolean clearDisableUpdateWhiteList() {
        throw new RuntimeException("Stub!");
    }

    public boolean clearFocusMonitoringList() {
        throw new RuntimeException("Stub!");
    }

    public boolean clearNewAdminActivationAppWhiteList() {
        throw new RuntimeException("Stub!");
    }

    public boolean clearPackagesFromDisableClipboardList() {
        throw new RuntimeException("Stub!");
    }

    public boolean clearPackagesFromDisableUpdateList() {
        throw new RuntimeException("Stub!");
    }

    public boolean clearPackagesFromForceStopList() {
        throw new RuntimeException("Stub!");
    }

    public boolean clearPackagesFromNotificationList() {
        throw new RuntimeException("Stub!");
    }

    public boolean clearPackagesFromWidgetList() {
        throw new RuntimeException("Stub!");
    }

    public boolean clearPreventStartBlackList() {
        throw new RuntimeException("Stub!");
    }

    public boolean clearUsbDevicesForDefaultAccess(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean deleteHomeShortcut(String str, String str2) {
        throw new RuntimeException("Stub!");
    }

    public void disableAndroidBrowser() {
        throw new RuntimeException("Stub!");
    }

    public void disableAndroidMarket() {
        throw new RuntimeException("Stub!");
    }

    public void disableVoiceDialer() {
        throw new RuntimeException("Stub!");
    }

    public void disableYouTube() {
        throw new RuntimeException("Stub!");
    }

    public void enableAndroidBrowser() {
        throw new RuntimeException("Stub!");
    }

    public void enableAndroidMarket() {
        throw new RuntimeException("Stub!");
    }

    public void enableVoiceDialer() {
        throw new RuntimeException("Stub!");
    }

    public void enableYouTube() {
        throw new RuntimeException("Stub!");
    }

    public AppInfoLastUsage[] getAllAppLastUsage() {
        throw new RuntimeException("Stub!");
    }

    public List<DefaultAppConfiguration> getAllDefaultApplications() {
        throw new RuntimeException("Stub!");
    }

    public Map<AppWidgetProviderInfo, ArrayList<Integer>> getAllWidgets(String str) {
        throw new RuntimeException("Stub!");
    }

    public List<AppControlInfo> getAppPackageNamesAllBlackLists() {
        throw new RuntimeException("Stub!");
    }

    public List<AppControlInfo> getAppPackageNamesAllWhiteLists() {
        throw new RuntimeException("Stub!");
    }

    public List<AppControlInfo> getAppPermissionsAllBlackLists() {
        throw new RuntimeException("Stub!");
    }

    public String[] getAppPermissionsBlackList() {
        throw new RuntimeException("Stub!");
    }

    public List<AppControlInfo> getAppSignaturesAllBlackLists() {
        throw new RuntimeException("Stub!");
    }

    public List<AppControlInfo> getAppSignaturesAllWhiteLists() {
        throw new RuntimeException("Stub!");
    }

    public String[] getAppSignaturesBlackList() {
        throw new RuntimeException("Stub!");
    }

    public String[] getAppSignaturesWhiteList() {
        throw new RuntimeException("Stub!");
    }

    public long getApplicationCacheSize(String str) {
        throw new RuntimeException("Stub!");
    }

    public long getApplicationCodeSize(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean getApplicationComponentState(ComponentName componentName) {
        throw new RuntimeException("Stub!");
    }

    public long getApplicationCpuUsage(String str) {
        throw new RuntimeException("Stub!");
    }

    public long getApplicationDataSize(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean getApplicationInstallationEnabled(String str) {
        throw new RuntimeException("Stub!");
    }

    public int getApplicationInstallationMode() {
        throw new RuntimeException("Stub!");
    }

    public long getApplicationMemoryUsage(String str) {
        throw new RuntimeException("Stub!");
    }

    public String getApplicationName(String str) {
        throw new RuntimeException("Stub!");
    }

    public List<NetworkStats> getApplicationNetworkStats() {
        throw new RuntimeException("Stub!");
    }

    public int getApplicationNotificationMode() {
        throw new RuntimeException("Stub!");
    }

    public Bundle getApplicationRestrictions(ComponentName componentName, String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean getApplicationStateEnabled(String str) {
        throw new RuntimeException("Stub!");
    }

    public String[] getApplicationStateList(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public long getApplicationTotalSize(String str) {
        throw new RuntimeException("Stub!");
    }

    public int getApplicationUid(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean getApplicationUninstallationEnabled(String str) {
        throw new RuntimeException("Stub!");
    }

    public int getApplicationUninstallationMode() {
        throw new RuntimeException("Stub!");
    }

    public String getApplicationVersion(String str) {
        throw new RuntimeException("Stub!");
    }

    public int getApplicationVersionCode(String str) {
        throw new RuntimeException("Stub!");
    }

    public AppInfoLastUsage[] getAvgNoAppUsagePerMonth() {
        throw new RuntimeException("Stub!");
    }

    public boolean getConcentrationMode() {
        throw new RuntimeException("Stub!");
    }

    public ComponentName getDefaultApplication(Intent intent) {
        throw new RuntimeException("Stub!");
    }

    public List<ComponentName> getHomeShortcuts(String str, boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public String[] getInstalledApplicationsIDList() {
        throw new RuntimeException("Stub!");
    }

    public List<AppInfo> getMostCpuUsageApps(int i5, boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public List<AppInfo> getMostDataUsageApps(int i5) {
        throw new RuntimeException("Stub!");
    }

    public List<AppInfo> getMostMemoryUsageApps(int i5, boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public List<String> getNewAdminActivationAppWhiteList() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getPackagesFromBatteryOptimizationWhiteList() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getPackagesFromBlackList(int i5) {
        throw new RuntimeException("Stub!");
    }

    public List<String> getPackagesFromClearCacheBlackList() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getPackagesFromClearCacheWhiteList() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getPackagesFromClearDataBlackList() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getPackagesFromClearDataWhiteList() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getPackagesFromDisableClipboardBlackList() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getPackagesFromDisableClipboardWhiteList() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getPackagesFromDisableUpdateBlackList() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getPackagesFromDisableUpdateWhiteList() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getPackagesFromFocusMonitoringList() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getPackagesFromForceStopBlackList() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getPackagesFromForceStopWhiteList() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getPackagesFromNotificationBlackList() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getPackagesFromNotificationWhiteList() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getPackagesFromPreventStartBlackList() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getPackagesFromWhiteList(int i5) {
        throw new RuntimeException("Stub!");
    }

    public List<String> getPackagesFromWidgetBlackList() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getPackagesFromWidgetWhiteList() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getRuntimePermissions(String str, int i5) {
        throw new RuntimeException("Stub!");
    }

    public List<UsbDeviceConfig> getUsbDevicesForDefaultAccess(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean installApplication(String str, boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean isApplicationInstalled(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean isApplicationRunning(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean isNewAdminActivationEnabled(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean isNewAdminInstallationEnabled(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean preventNewAdminActivation(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean preventNewAdminInstallation(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean removeAppPackageNameFromBlackList(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean removeAppPackageNameFromWhiteList(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean removeAppPermissionFromBlackList(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean removeAppSignatureFromBlackList(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean removeAppSignatureFromWhiteList(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean removeDefaultApplication(Intent intent, ComponentName componentName) {
        throw new RuntimeException("Stub!");
    }

    public int removePackageFromBatteryOptimizationWhiteList(AppIdentity appIdentity) {
        throw new RuntimeException("Stub!");
    }

    public int removePackageFromBlackList(int i5, String str) {
        throw new RuntimeException("Stub!");
    }

    public int removePackageFromWhiteList(int i5, String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean removePackagesFromClearCacheBlackList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean removePackagesFromClearCacheWhiteList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean removePackagesFromClearDataBlackList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean removePackagesFromClearDataWhiteList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean removePackagesFromDisableClipboardBlackList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean removePackagesFromDisableClipboardWhiteList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean removePackagesFromDisableUpdateBlackList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean removePackagesFromDisableUpdateWhiteList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean removePackagesFromFocusMonitoringList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean removePackagesFromForceStopBlackList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean removePackagesFromForceStopWhiteList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean removePackagesFromNotificationBlackList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean removePackagesFromNotificationWhiteList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean removePackagesFromPreventStartBlackList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean removePackagesFromWidgetBlackList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean removePackagesFromWidgetWhiteList(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public int setAfWProxy(boolean z4, AppIdentity appIdentity, Bundle bundle) {
        throw new RuntimeException("Stub!");
    }

    public boolean setApplicationComponentState(ComponentName componentName, boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public void setApplicationInstallationDisabled(String str) {
        throw new RuntimeException("Stub!");
    }

    public void setApplicationInstallationEnabled(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean setApplicationInstallationMode(int i5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setApplicationNotificationMode(int i5) {
        throw new RuntimeException("Stub!");
    }

    public void setApplicationRestrictions(ComponentName componentName, String str, Bundle bundle) {
        throw new RuntimeException("Stub!");
    }

    public String[] setApplicationStateList(String[] strArr, boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public void setApplicationUninstallationDisabled(String str) {
        throw new RuntimeException("Stub!");
    }

    public void setApplicationUninstallationEnabled(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean setApplicationUninstallationMode(int i5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setConcentrationMode(List<String> list, boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setDefaultApplication(Intent intent, ComponentName componentName) {
        throw new RuntimeException("Stub!");
    }

    public boolean setDisableApplication(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean setEnableApplication(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean startApp(String str, String str2) {
        throw new RuntimeException("Stub!");
    }

    public boolean stopApp(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean uninstallApplication(String str, boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public List<String> uninstallApplications(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean updateApplication(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean wipeApplicationData(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean addAppPackageNameToWhiteList(String str, boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean addAppSignatureToWhiteList(String str, boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean addPackagesToDisableClipboardWhiteList(List<String> list, boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean addPackagesToDisableUpdateWhiteList(List<String> list, boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean addPackagesToForceStopWhiteList(List<String> list, boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean addPackagesToNotificationWhiteList(List<String> list, boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean addPackagesToWidgetWhiteList(List<String> list, boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean installApplication(String str) {
        throw new RuntimeException("Stub!");
    }
}
