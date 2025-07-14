package com.samsung.android.knox.kiosk;

import java.util.List;

/* loaded from: classes.dex */
public class KioskMode {
    public static final String ACTION_DISABLE_KIOSK_MODE_RESULT = "com.samsung.android.knox.intent.action.DISABLE_KIOSK_MODE_RESULT";
    public static final String ACTION_ENABLE_KIOSK_MODE_RESULT = "com.samsung.android.knox.intent.action.ENABLE_KIOSK_MODE_RESULT";
    public static final String ACTION_UNEXPECTED_KIOSK_BEHAVIOR = "com.samsung.android.knox.intent.action.UNEXPECTED_KIOSK_BEHAVIOR";
    public static final int EDGE_FUNCTION_ALL = 31;
    public static final int ERROR_BUSY = -4;
    public static final int ERROR_KIOSK_ALREADY_ENABLED = -1;
    public static final int ERROR_NONE = 0;
    public static final int ERROR_PACKAGE_NOT_FOUND = -3;
    public static final int ERROR_PERMISSION_DENIED = -2;
    public static final int ERROR_UNKNOWN = -2000;
    public static final String EXTRA_KIOSK_RESULT = "com.samsung.android.knox.intent.extra.KIOSK_RESULT";

    public KioskMode() {
        throw new RuntimeException("Stub!");
    }

    public boolean allowAirCommandMode(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowAirViewMode(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowEdgeScreen(int i5, boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public List<Integer> allowHardwareKeys(List<Integer> list, boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowMultiWindowMode(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowTaskManager(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean clearAllNotifications() {
        throw new RuntimeException("Stub!");
    }

    public void disableKioskMode() {
        throw new RuntimeException("Stub!");
    }

    public void enableKioskMode() {
        throw new RuntimeException("Stub!");
    }

    public List<Integer> getAllBlockedHardwareKeys() {
        throw new RuntimeException("Stub!");
    }

    public int getBlockedEdgeScreen() {
        throw new RuntimeException("Stub!");
    }

    public List<Integer> getHardwareKeyList() {
        throw new RuntimeException("Stub!");
    }

    public String getKioskHomePackage() {
        throw new RuntimeException("Stub!");
    }

    public boolean hideNavigationBar(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean hideStatusBar(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean hideSystemBar(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean isAirCommandModeAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isAirViewModeAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isHardwareKeyAllowed(int i5) {
        throw new RuntimeException("Stub!");
    }

    public boolean isKioskModeEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isMultiWindowModeAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean isNavigationBarHidden() {
        throw new RuntimeException("Stub!");
    }

    public boolean isStatusBarHidden() {
        throw new RuntimeException("Stub!");
    }

    public boolean isSystemBarHidden() {
        throw new RuntimeException("Stub!");
    }

    public boolean isTaskManagerAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean wipeRecentTasks() {
        throw new RuntimeException("Stub!");
    }

    public void disableKioskMode(KioskSetting kioskSetting) {
        throw new RuntimeException("Stub!");
    }

    public void enableKioskMode(String str) {
        throw new RuntimeException("Stub!");
    }

    public void enableKioskMode(KioskSetting kioskSetting) {
        throw new RuntimeException("Stub!");
    }
}
