package com.samsung.android.knox.net.billing;

import java.util.List;

/* loaded from: classes.dex */
public class EnterpriseBillingPolicy {
    public static final String ALL_APPS_IN_SCOPE = "*";

    public EnterpriseBillingPolicy() {
        throw new RuntimeException("Stub!");
    }

    public boolean activateProfile(String str, boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowRoaming(String str, boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean bindAppsToProfile(String str, List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean bindVpnToProfile(String str, String str2, String str3) {
        throw new RuntimeException("Stub!");
    }

    public boolean createProfile(EnterpriseBillingProfile enterpriseBillingProfile) {
        throw new RuntimeException("Stub!");
    }

    public List<String> getAppsBoundToProfile(String str) {
        throw new RuntimeException("Stub!");
    }

    public List<String> getAvailableProfiles() {
        throw new RuntimeException("Stub!");
    }

    public EnterpriseBillingProfile getBoundedProfile(String str) {
        throw new RuntimeException("Stub!");
    }

    public EnterpriseBillingProfile getProfileDetails(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean isProfileActive(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean isRoamingAllowed(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean removeProfile(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean unbindAppsFromProfile(String str, List<String> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean unbindVpnFromProfile(String str, String str2) {
        throw new RuntimeException("Stub!");
    }

    public boolean updateProfile(EnterpriseBillingProfile enterpriseBillingProfile) {
        throw new RuntimeException("Stub!");
    }
}
