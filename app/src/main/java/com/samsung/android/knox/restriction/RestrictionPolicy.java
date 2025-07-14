package com.samsung.android.knox.restriction;

import android.os.Bundle;

/* loaded from: classes.dex */
public class RestrictionPolicy {
    public static final String ACTION_UPDATE_FOTA_VERSION_RESULT = "com.samsung.android.knox.intent.action.UPDATE_FOTA_VERSION_RESULT";
    public static final int ERROR_UPDATE_FOTA_ENABLED_BY_OTHER_ADMIN = 2;
    public static final int ERROR_UPDATE_FOTA_INVALID_PARAMETER = 3;
    public static final int ERROR_UPDATE_FOTA_NONE = 0;
    public static final int ERROR_UPDATE_FOTA_UNKNOWN = 4;
    public static final int ERROR_UPDATE_FOTA_UNKNOWN_SERVER = 1;
    public static final String EXTRA_UPDATE_FOTA_VERSION_STATUS = "com.samsung.android.knox.intent.extra.UPDATE_FOTA_VERSION_STATUS";
    public static final int LOCKSCREEN_MULTIPLE_WIDGET_VIEW = 1;
    public static final int LOCKSCREEN_SHORTCUTS_VIEW = 2;
    public static final int STATUS_UPDATE_FOTA_ALREADY_LATEST_VERSION = 6;
    public static final int STATUS_UPDATE_FOTA_FAILURE = 8;
    public static final int STATUS_UPDATE_FOTA_PROCESSING = 7;
    public static final int STATUS_UPDATE_FOTA_SUCCESS = 5;
    public static final String UPDATE_FOTA_CORPID = "update_fota_corpid";
    public static final int WEARABLE_GEAR_DEVICE = 1;

    public enum USBInterface {
        AUD,
        CDC,
        COM,
        HID,
        MAS,
        MIS,
        OFF,
        STI,
        VEN,
        WIR;

        public String getFullName() {
            throw new RuntimeException("Stub!");
        }

        public int getValue() {
            throw new RuntimeException("Stub!");
        }
    }

    public RestrictionPolicy() {
        throw new RuntimeException("Stub!");
    }

    public boolean allowAirplaneMode(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowAndroidBeam(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowAudioRecord(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowBackgroundProcessLimit(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowBluetooth(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowClipboardShare(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowDataSaving(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowDeveloperMode(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowFactoryReset(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowFastEncryption(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowFirmwareRecovery(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowGoogleAccountsAutoSync(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowGoogleCrashReport(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowKillingActivitiesOnLeave(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowLockScreenView(int i5, boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowOTAUpgrade(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowPowerOff(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowPowerSavingMode(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowSBeam(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowSDCardMove(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowSDCardWrite(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowSVoice(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowSafeMode(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowScreenPinning(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowSettingsChanges(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowShareList(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowSmartClipMode(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowStatusBarExpansion(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowStopSystemApp(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowUWB(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowUsbHostStorage(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowUserMobileDataLimit(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowVideoRecord(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowVpn(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowWallpaperChange(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowWiFi(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowWifiDirect(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean enableWearablePolicy(int i5, boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public String getAllowedFOTAVersion() {
        throw new RuntimeException("Stub!");
    }

    public int getUsbExceptionList() {
        throw new RuntimeException("Stub!");
    }

    public boolean isAirplaneModeAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isAndroidBeamAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isAudioRecordAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isBackgroundDataEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isBackgroundProcessLimitAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isBackupAllowed(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean isBluetoothEnabled(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean isBluetoothTetheringEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isCameraEnabled(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean isCellularDataAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isClipboardAllowed(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean isClipboardShareAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isDataSavingAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isDeveloperModeAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isFactoryResetAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isFastEncryptionAllowed(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean isFirmwareRecoveryAllowed(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean isGoogleAccountsAutoSyncAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isGoogleCrashReportAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isHeadphoneEnabled(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean isHomeKeyEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isKillingActivitiesOnLeaveAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isLockScreenEnabled(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean isLockScreenViewAllowed(int i5) {
        throw new RuntimeException("Stub!");
    }

    public boolean isMicrophoneEnabled(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean isMockLocationEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isNonMarketAppAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isOTAUpgradeAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isPowerOffAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isPowerSavingModeAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isSBeamAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isSDCardMoveAllowed(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean isSDCardWriteAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isSVoiceAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isSafeModeAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isScreenCaptureEnabled(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean isScreenPinningAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isSdCardEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isSettingsChangesAllowed(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean isShareListAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isSmartClipModeAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isStatusBarExpansionAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isStopSystemAppAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isTetheringEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isUWBAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isUsbDebuggingEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isUsbHostStorageAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isUsbMediaPlayerAvailable(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean isUsbTetheringEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isUserMobileDataLimitAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isVideoRecordAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isVpnAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isWallpaperChangeAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isWearablePolicyEnabled(int i5) {
        throw new RuntimeException("Stub!");
    }

    public boolean isWiFiEnabled(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean isWifiDirectAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isWifiTetheringEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean setAllowNonMarketApps(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setAllowedFOTAVersion(String str, Bundle bundle) {
        throw new RuntimeException("Stub!");
    }

    public boolean setBackgroundData(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setBackup(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setBluetoothTethering(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setCameraState(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setCellularData(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setClipboardEnabled(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setHeadphoneState(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setHomeKeyState(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setLockScreenState(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setMicrophoneState(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setMockLocation(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setScreenCapture(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSdCardState(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setTethering(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setUsbDebuggingEnabled(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setUsbExceptionList(int i5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setUsbMediaPlayerAvailability(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setUsbTethering(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setWifiTethering(boolean z4) {
        throw new RuntimeException("Stub!");
    }
}
