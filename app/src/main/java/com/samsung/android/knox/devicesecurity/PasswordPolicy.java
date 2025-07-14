package com.samsung.android.knox.devicesecurity;

import android.content.ComponentName;
import com.samsung.android.knox.container.AuthenticationConfig;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class PasswordPolicy {
    public static final int BIOMETRIC_AUTHENTICATION_FACE = 4;
    public static final int BIOMETRIC_AUTHENTICATION_FINGERPRINT = 1;
    public static final int BIOMETRIC_AUTHENTICATION_IRIS = 2;

    public PasswordPolicy() {
        throw new RuntimeException("Stub!");
    }

    public boolean deleteAllRestrictions() {
        throw new RuntimeException("Stub!");
    }

    public boolean enforcePwdChange() {
        throw new RuntimeException("Stub!");
    }

    public boolean excludeExternalStorageForFailedPasswordsWipe(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public AuthenticationConfig getEnterpriseIdentityAuthentication() {
        throw new RuntimeException("Stub!");
    }

    public List<String> getForbiddenStrings(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public int getMaximumCharacterOccurences() {
        throw new RuntimeException("Stub!");
    }

    public int getMaximumCharacterSequenceLength() {
        throw new RuntimeException("Stub!");
    }

    public int getMaximumFailedPasswordsForDeviceDisable() {
        throw new RuntimeException("Stub!");
    }

    public int getMaximumNumericSequenceLength() {
        throw new RuntimeException("Stub!");
    }

    public int getMinPasswordComplexChars(ComponentName componentName) {
        throw new RuntimeException("Stub!");
    }

    public int getMinimumCharacterChangeLength() {
        throw new RuntimeException("Stub!");
    }

    public int getPasswordChangeTimeout() {
        throw new RuntimeException("Stub!");
    }

    public int getPasswordExpires(ComponentName componentName) {
        throw new RuntimeException("Stub!");
    }

    public int getPasswordHistory(ComponentName componentName) {
        throw new RuntimeException("Stub!");
    }

    public int getPasswordLockDelay() {
        throw new RuntimeException("Stub!");
    }

    public String getRequiredPwdPatternRestrictions(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public Map<Integer, String> getSupportedBiometricAuthentications() {
        throw new RuntimeException("Stub!");
    }

    public boolean isBiometricAuthenticationEnabled(int i5) {
        throw new RuntimeException("Stub!");
    }

    public boolean isExternalStorageForFailedPasswordsWipeExcluded() {
        throw new RuntimeException("Stub!");
    }

    public boolean isMultifactorAuthenticationEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isPasswordVisibilityEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isScreenLockPatternVisibilityEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean lock() {
        throw new RuntimeException("Stub!");
    }

    public void reboot(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean setBiometricAuthenticationEnabled(int i5, boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public int setEnterpriseIdentityAuthentication(AuthenticationConfig authenticationConfig) {
        throw new RuntimeException("Stub!");
    }

    public boolean setForbiddenStrings(List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean setMaximumCharacterOccurrences(int i5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setMaximumCharacterSequenceLength(int i5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setMaximumFailedPasswordsForDeviceDisable(int i5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setMaximumNumericSequenceLength(int i5) {
        throw new RuntimeException("Stub!");
    }

    public void setMinPasswordComplexChars(ComponentName componentName, int i5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setMinimumCharacterChangeLength(int i5) {
        throw new RuntimeException("Stub!");
    }

    public void setMultifactorAuthenticationEnabled(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setPasswordChangeTimeout(int i5) {
        throw new RuntimeException("Stub!");
    }

    public void setPasswordExpires(ComponentName componentName, int i5) {
        throw new RuntimeException("Stub!");
    }

    public void setPasswordHistory(ComponentName componentName, int i5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setPasswordLockDelay(int i5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setPasswordVisibilityEnabled(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setRequiredPasswordPattern(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean setScreenLockPatternVisibilityEnabled(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean unlock() {
        throw new RuntimeException("Stub!");
    }
}
