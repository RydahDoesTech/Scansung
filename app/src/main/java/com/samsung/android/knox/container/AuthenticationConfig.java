package com.samsung.android.knox.container;

import android.os.Bundle;

/* loaded from: classes.dex */
public class AuthenticationConfig {
    public static final int ERROR_AUTHENTICATOR_PACKAGE_NOT_INSTALLED = -4;
    public static final int ERROR_AUTHENTICATOR_SIGNATURE_MISMATCH = -13;
    public static final int ERROR_INTERNAL_FAIL = -1;
    public static final int ERROR_INVALID_INPUT = -3;
    public static final int ERROR_USER_NOT_AUTHORIZED = -2;
    public static final String SAMSUNG_KERBEROS_AUTHENTICATOR = "com.sec.android.service.singlesignon";
    public static final int SUCCESS = 0;

    public static class AuthenticationRequestKeys {
        public static final String ADMIN_SERVER = "REALMS_ADMIN_SERVER";
        public static final String CANONICALIZE = "LIBDEFAULTS_CANONICALIZE";
        public static final String DEFAULT_DOMAIN = "REALMS_DEFAULT_DOMAIN";
        public static final String DEFAULT_REALM = "LIBDEFAULTS_DEFAULT_REALM";
        public static final String DNS_CANONICALIZE_HOSTNAME = "LIBDEFAULTS_DNS_CANONICALIZE_HOSTNAME";
        public static final String DNS_LOOKUP_KDC = "LIBDEFAULTS_DNS_LOOKUP_KDC";
        public static final String DNS_LOOKUP_REALM = "LIBDEFAULTS_DNS_LOOKUP_REALM";
        public static final String FEDERATION_SERVER_URL = "FEDERATION_SERVER_URL";
        public static final String FORWARDABLE = "LIBDEFAULTS_FORWARDABLE";
        public static final String KDC = "REALMS_KDC";
        public static final String KPASSWD_SERVER = "REALMS_KPASSWD_SERVER";
        public static final String KRB5_CONFIG_DATA = "KRB5_CONFIG_DATA";
        public static final String MASTER_KDC = "REALMS_MASTER_KDC";
        public static final String NOADDRESSES = "LIBDEFAULTS_NOADDRESSES";
        public static final String PKINIT_ANCHORS = "REALMS_PKINIT_ANCHORS";
        public static final String PKINIT_IDENTITIES = "REALMS_PKINIT_IDENTITIES";
        public static final String RDNS = "LIBDEFAULTS_RDNS";
        public static final String RENEW_LIFETIME = "LIBDEFAULTS_RENEW_LIFETIME";
        public static final String TICKET_LIFETIME = "LIBDEFAULTS_TICKET_LIFETIME";
        public static final String UDP_PREFERENCE_LIMIT = "LIBDEFAULTS_UDP_PREFERENCE_LIMIT";

        public AuthenticationRequestKeys() {
            throw new RuntimeException("Stub!");
        }
    }

    public AuthenticationConfig(boolean z4, boolean z5, boolean z6, String str, String str2, Bundle bundle) {
        throw new RuntimeException("Stub!");
    }

    public Bundle getAuthenticatorConfig() {
        throw new RuntimeException("Stub!");
    }

    public String getAuthenticatorPkgName() {
        throw new RuntimeException("Stub!");
    }

    public String getAuthenticatorPkgSignature() {
        throw new RuntimeException("Stub!");
    }

    public boolean getEnforceEnterpriseIdentityLock() {
        throw new RuntimeException("Stub!");
    }

    public boolean getEnforceRemoteAuthAlways() {
        throw new RuntimeException("Stub!");
    }

    public boolean getHideEnterpriseIdentityLock() {
        throw new RuntimeException("Stub!");
    }

    public void setAuthenticatorConfig(Bundle bundle) {
        throw new RuntimeException("Stub!");
    }

    public void setAuthenticatorPkgName(String str) {
        throw new RuntimeException("Stub!");
    }

    public void setAuthenticatorPkgSignature(String str) {
        throw new RuntimeException("Stub!");
    }

    public void setEnforceRemoteAuthAlways(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public void setForceEnterpriseIdentityLock(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public void setHideEnterpriseIdentityLock(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public AuthenticationConfig() {
        throw new RuntimeException("Stub!");
    }
}
