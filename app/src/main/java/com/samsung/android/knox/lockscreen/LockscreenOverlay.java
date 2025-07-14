package com.samsung.android.knox.lockscreen;

import android.widget.ImageView;

/* loaded from: classes.dex */
public class LockscreenOverlay {
    public static final float DEFAULT_ALPHA_LEVEL = 1.0f;
    public static final int ERROR_BAD_STATE = -6;
    public static final int ERROR_FAILED = -4;
    public static final int ERROR_NONE = 0;
    public static final int ERROR_NOT_ALLOWED = -1;
    public static final int ERROR_NOT_READY = -5;
    public static final int ERROR_NOT_SUPPORTED = -3;
    public static final int ERROR_PERMISSION_DENIED = -2;
    public static final int ERROR_UNKNOWN = -2000;

    public static class LSOEmergencyPhoneInfo {
        public int bottomPosition;
        public int gravity;
        public String icon;
        public String phoneNumber;
        public boolean showBackground;
        public boolean showDefaultText;
        public String text;
        public int topPosition;

        public LSOEmergencyPhoneInfo(String str) {
            throw new RuntimeException("Stub!");
        }

        public LSOEmergencyPhoneInfo(String str, String str2) {
            throw new RuntimeException("Stub!");
        }

        public LSOEmergencyPhoneInfo(String str, int i5, String str2, int i6) {
            throw new RuntimeException("Stub!");
        }
    }

    public static class LSOImage {
        public int bottomPosition;
        public String filePath;
        public ImageView.ScaleType scaleType;
        public int topPosition;

        public LSOImage() {
            throw new RuntimeException("Stub!");
        }

        public LSOImage(String str) {
            throw new RuntimeException("Stub!");
        }

        public LSOImage(int i5, String str, int i6) {
            throw new RuntimeException("Stub!");
        }

        public LSOImage(int i5, String str, int i6, ImageView.ScaleType scaleType) {
            throw new RuntimeException("Stub!");
        }
    }

    public LockscreenOverlay() {
        throw new RuntimeException("Stub!");
    }

    public boolean canConfigure() {
        throw new RuntimeException("Stub!");
    }

    public boolean changeLockScreenString(String str) {
        throw new RuntimeException("Stub!");
    }

    public int configure(String str, String str2, String str3, String str4) {
        throw new RuntimeException("Stub!");
    }

    public float getAlpha() {
        throw new RuntimeException("Stub!");
    }

    public String getCurrentLockScreenString() {
        throw new RuntimeException("Stub!");
    }

    public String getEmergencyPhone() {
        throw new RuntimeException("Stub!");
    }

    public LSOEmergencyPhoneInfo getEmergencyPhoneInfo() {
        throw new RuntimeException("Stub!");
    }

    public boolean isConfigured() {
        throw new RuntimeException("Stub!");
    }

    public void removeEmergencyPhone() {
        throw new RuntimeException("Stub!");
    }

    public void resetAll() {
        throw new RuntimeException("Stub!");
    }

    public void resetOverlay() {
        throw new RuntimeException("Stub!");
    }

    public void resetWallpaper() {
        throw new RuntimeException("Stub!");
    }

    public int setAlpha(float f) {
        throw new RuntimeException("Stub!");
    }

    public int setEmergencyPhone(String str) {
        throw new RuntimeException("Stub!");
    }

    public int setEmergencyPhoneInfo(LSOEmergencyPhoneInfo lSOEmergencyPhoneInfo) {
        throw new RuntimeException("Stub!");
    }

    public int setWallpaper(String str) {
        throw new RuntimeException("Stub!");
    }

    public int configure(LSOImage[] lSOImageArr) {
        throw new RuntimeException("Stub!");
    }
}
