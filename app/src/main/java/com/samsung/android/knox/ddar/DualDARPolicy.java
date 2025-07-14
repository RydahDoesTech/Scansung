package com.samsung.android.knox.ddar;

import android.os.Bundle;

/* loaded from: classes.dex */
public class DualDARPolicy {
    public static final int ERROR_FAILURE_IN_SETTING_DATA_LOCK_TIMEOUT = -1;
    public static final int ERROR_FAILURE_IN_SETTING_DE_RESTRICTION = -3;
    public static final int ERROR_FAILURE_IN_SETTING_WHITELIST_PACKAGES = -2;
    public static final int ERROR_NONE = 0;
    public static final String KEY_CONFIG_CLIENT_LOCATION = "dualdar-config-client-location";
    public static final String KEY_CONFIG_CLIENT_PACKAGE = "dualdar-config-client-package";
    public static final String KEY_CONFIG_CLIENT_SIGNATURE = "dualdar-config-client-signature";
    public static final String KEY_CONFIG_DATA_LOCK_TIMEOUT = "dualdar-config-datalock-timeout";
    public static final String KEY_CONFIG_DE_RESTRICTION = "dualdar-config-de-restriction";
    public static final String KEY_CONFIG_WHITELISTED_DATA_LOCK_STATE_PACKAGES = "dualdar-config-datalock-whitelistpackages";
    public static final String KEY_DUAL_DAR_CONFIG = "dualdar-config";

    public static class DUAL_DAR_VERSION_CODES {
        public static final String DUAL_DAR_1_0 = "1.0";

        public DUAL_DAR_VERSION_CODES() {
            throw new RuntimeException("Stub!");
        }
    }

    public DualDARPolicy() {
        throw new RuntimeException("Stub!");
    }

    public static String getDualDARVersion() {
        throw new RuntimeException("Stub!");
    }

    public boolean clearResetPasswordTokenForInner() {
        throw new RuntimeException("Stub!");
    }

    public Bundle getConfig() {
        throw new RuntimeException("Stub!");
    }

    public int getPasswordMinimumLengthForInner() {
        throw new RuntimeException("Stub!");
    }

    public boolean isActivePasswordSufficientForInner() {
        throw new RuntimeException("Stub!");
    }

    public boolean isResetPasswordTokenActiveForInner() {
        throw new RuntimeException("Stub!");
    }

    public boolean resetPasswordWithTokenForInner(String str, byte[] bArr) {
        throw new RuntimeException("Stub!");
    }

    public int setConfig(Bundle bundle) {
        throw new RuntimeException("Stub!");
    }

    public boolean setPasswordMinimumLengthForInner(int i5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setResetPasswordTokenForInner(byte[] bArr) {
        throw new RuntimeException("Stub!");
    }
}
