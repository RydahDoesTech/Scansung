package com.samsung.android.knox.container;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.pm.Signature;
import android.os.Bundle;
import java.util.List;

/* loaded from: classes.dex */
public class ContainerConfigurationPolicy {
    public static final int ERROR_INTERNAL_ERROR = -2;
    public static final int ERROR_INVALID_KEY = -1;
    public static final int ERROR_NONE = 0;
    public static final String FIDO_REQUEST_URI = "fido_request_uri";
    public static final String FIDO_RESPONSE_URI = "fido_response_uri";
    public static final String KEY_IMAGE = "key-image";
    public static final String KEY_NAME = "key-name";
    public static final String OPTION_CALLER_INFO = "option_callerinfo";
    public static final int RES_TYPE_BADGE = 1;
    public static final int RES_TYPE_PERSONAL_MODE_NAME = 5;
    public static final int RES_TYPE_PROFILE_NAME = 4;
    public static final int RES_TYPE_PROFILE_SWITCH_ICON = 2;

    public ContainerConfigurationPolicy() {
        throw new RuntimeException("Stub!");
    }

    public void addCrossProfileIntentFilter(ComponentName componentName, IntentFilter intentFilter, int i5) {
        throw new RuntimeException("Stub!");
    }

    public boolean addHomeShortcutToPersonal(String str, String str2) {
        throw new RuntimeException("Stub!");
    }

    public boolean addNetworkSSID(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean addPackageToExternalStorageSBABlackList(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean addPackageToExternalStorageWhiteList(String str, Signature[] signatureArr) {
        throw new RuntimeException("Stub!");
    }

    public boolean addPackageToInstallWhiteList(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowLayoutSwitching(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowRemoteControl(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public void clearCrossProfileIntentFilters(ComponentName componentName) {
        throw new RuntimeException("Stub!");
    }

    public boolean clearNetworkSSID() {
        throw new RuntimeException("Stub!");
    }

    public boolean clearPackagesFromExternalStorageSBABlackList() {
        throw new RuntimeException("Stub!");
    }

    public boolean clearPackagesFromExternalStorageWhiteList() {
        throw new RuntimeException("Stub!");
    }

    public boolean deleteHomeShortcutFromPersonal(String str, String str2) {
        throw new RuntimeException("Stub!");
    }

    public boolean enableBluetooth(boolean z4, Bundle bundle) {
        throw new RuntimeException("Stub!");
    }

    public boolean enableExternalStorage(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean enableNFC(boolean z4, Bundle bundle) {
        throw new RuntimeException("Stub!");
    }

    public boolean enableUsbAccess(boolean z4, Bundle bundle) {
        throw new RuntimeException("Stub!");
    }

    public void enforceMultifactorAuthentication(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean getEnforceAuthForContainer() {
        throw new RuntimeException("Stub!");
    }

    public Bundle getFIDOInfo() {
        throw new RuntimeException("Stub!");
    }

    public long getHibernationTimeout() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getNetworkSSID() {
        throw new RuntimeException("Stub!");
    }

    public Signature[] getPackageSignaturesFromExternalStorageWhiteList(String str) {
        throw new RuntimeException("Stub!");
    }

    public List<String> getPackagesFromExternalStorageSBABlackList() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getPackagesFromExternalStorageWhiteList() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getPackagesFromInstallWhiteList() {
        throw new RuntimeException("Stub!");
    }

    public boolean isBluetoothEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isContactsSharingEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isExternalStorageEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isLayoutSwitchingAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isMultifactorAuthenticationEnforced() {
        throw new RuntimeException("Stub!");
    }

    public boolean isNFCEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isPackageInInstallWhiteList(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean isRemoteControlAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isResetContainerOnRebootEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isSettingsOptionEnabled(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean isUsbAccessEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isUseSecureKeypadEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean removeNetworkSSID(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean removePackageFromExternalStorageSBABlackList(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean removePackageFromExternalStorageWhiteList(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean removePackageFromInstallWhiteList(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean resetContainerOnReboot(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean resetContainerPassword() {
        throw new RuntimeException("Stub!");
    }

    public boolean setContactsSharingEnabled(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public int setCustomResource(int i5, Bundle bundle) {
        throw new RuntimeException("Stub!");
    }

    public boolean setEnforceAuthForContainer(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setFIDOInfo(Bundle bundle) {
        throw new RuntimeException("Stub!");
    }

    public boolean setHibernationTimeout(long j5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setSettingsOptionEnabled(String str, boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setUseSecureKeypad(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public int resetContainerPassword(String str, int i5) {
        throw new RuntimeException("Stub!");
    }
}
