package com.samsung.android.knox.dex;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Rect;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes.dex */
public class DexManager {
    public static final int DEX_APP_ALREADY_SET_POLICY = 3;
    public static final int DEX_APP_NOT_INSTALLED = 2;
    public static final int DEX_APP_NOT_SET_POLICY = 4;
    public static final int DEX_POLICY_FAIL = 1;
    public static final int DEX_POLICY_SUCCESS = 0;

    public DexManager() {
        throw new RuntimeException("Stub!");
    }

    public int addPackageToDisableList(String str) {
        throw new RuntimeException("Stub!");
    }

    public int addShortcut(int i5, int i6, ComponentName componentName) {
        throw new RuntimeException("Stub!");
    }

    public int addURLShortcut(int i5, int i6, String str, String str2, ComponentName componentName) {
        throw new RuntimeException("Stub!");
    }

    public int allowAutoOpenLastApp(int i5) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowScreenTimeoutChange(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public int clearLoadingLogo() {
        throw new RuntimeException("Stub!");
    }

    public boolean enforceEthernetOnly(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean enforceVirtualMacAddress(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public List<String> getForegroundModePackageList() {
        throw new RuntimeException("Stub!");
    }

    public int getHDMIAutoEnterState() {
        throw new RuntimeException("Stub!");
    }

    public int getHomeAlignment() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getPackagesFromDisableList() {
        throw new RuntimeException("Stub!");
    }

    public int getScreenTimeout() {
        throw new RuntimeException("Stub!");
    }

    public int getShowIMEWithHardKeyboard() {
        throw new RuntimeException("Stub!");
    }

    public String getVirtualMacAddress() {
        throw new RuntimeException("Stub!");
    }

    public int isAutoOpenLastAppAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isDexActivated() {
        throw new RuntimeException("Stub!");
    }

    public boolean isDexDisabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isEthernetOnlyEnforced() {
        throw new RuntimeException("Stub!");
    }

    public boolean isScreenTimeoutChangeAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isVirtualMacAddressEnforced() {
        throw new RuntimeException("Stub!");
    }

    public int removePackageFromDisableList(String str) {
        throw new RuntimeException("Stub!");
    }

    public int removeShortcut(ComponentName componentName) {
        throw new RuntimeException("Stub!");
    }

    public int removeURLShortcut(String str, ComponentName componentName) {
        throw new RuntimeException("Stub!");
    }

    public boolean setDexDisabled(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public int setForegroundModePackageList(int i5, List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public int setHDMIAutoEnterState(int i5) {
        throw new RuntimeException("Stub!");
    }

    public int setHomeAlignment(int i5) {
        throw new RuntimeException("Stub!");
    }

    public int setLoadingLogo(ParcelFileDescriptor parcelFileDescriptor) {
        throw new RuntimeException("Stub!");
    }

    public int setScreenTimeout(int i5) {
        throw new RuntimeException("Stub!");
    }

    public int setShowIMEWithHardKeyboard(int i5) {
        throw new RuntimeException("Stub!");
    }

    public int setWallpaper(Context context, InputStream inputStream, Rect rect, boolean z4, int i5) {
        throw new RuntimeException("Stub!");
    }

    public int addURLShortcut(int i5, int i6, String str, String str2, String str3, ComponentName componentName, ParcelFileDescriptor parcelFileDescriptor) {
        throw new RuntimeException("Stub!");
    }
}
