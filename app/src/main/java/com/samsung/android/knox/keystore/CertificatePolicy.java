package com.samsung.android.knox.keystore;

import java.security.cert.X509Certificate;
import java.util.List;

/* loaded from: classes.dex */
public class CertificatePolicy {
    public static final String ACTION_CERTIFICATE_FAILURE = "com.samsung.android.knox.intent.action.CERTIFICATE_FAILURE";
    public static final String ACTION_CERTIFICATE_REMOVED = "com.samsung.android.knox.intent.action.CERTIFICATE_REMOVED";
    public static final String EXTRA_CERTIFICATE_FAILURE_MESSAGE = "com.samsung.android.knox.intent.extra.CERTIFICATE_FAILURE_MESSAGE";
    public static final String EXTRA_CERTIFICATE_FAILURE_MODULE = "com.samsung.android.knox.intent.extra.CERTIFICATE_FAILURE_MODULE";
    public static final String EXTRA_CERTIFICATE_REMOVED_SUBJECT = "com.samsung.android.knox.intent.extra.CERTIFICATE_REMOVED_SUBJECT";
    public static final String EXTRA_USER_ID = "com.samsung.android.knox.intent.extra.USER_ID";

    public CertificatePolicy() {
        throw new RuntimeException("Stub!");
    }

    public boolean addPermissionApplicationPrivateKey(PermissionApplicationPrivateKey permissionApplicationPrivateKey) {
        throw new RuntimeException("Stub!");
    }

    public boolean addTrustedCaCertificateList(List<X509Certificate> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean addUntrustedCertificateList(List<X509Certificate> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean allowUserRemoveCertificates(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean clearPermissionApplicationPrivateKey() {
        throw new RuntimeException("Stub!");
    }

    public boolean clearTrustedCaCertificateList() {
        throw new RuntimeException("Stub!");
    }

    public boolean clearUntrustedCertificateList() {
        throw new RuntimeException("Stub!");
    }

    public boolean enableCertificateFailureNotification(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean enableCertificateValidationAtInstall(boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean enableOcspCheck(String str, boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean enableRevocationCheck(String str, boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public List<PermissionApplicationPrivateKey> getListPermissionApplicationPrivateKey() {
        throw new RuntimeException("Stub!");
    }

    public List<CertificateControlInfo> getTrustedCaCertificateList() {
        throw new RuntimeException("Stub!");
    }

    public List<CertificateControlInfo> getUntrustedCertificateList() {
        throw new RuntimeException("Stub!");
    }

    public boolean isCertificateFailureNotificationEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isCertificateValidationAtInstallEnabled() {
        throw new RuntimeException("Stub!");
    }

    public boolean isNonTrustedAppInstallBlocked() {
        throw new RuntimeException("Stub!");
    }

    public boolean isOcspCheckEnabled(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean isRevocationCheckEnabled(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean isUserRemoveCertificatesAllowed() {
        throw new RuntimeException("Stub!");
    }

    public boolean removePermissionApplicationPrivateKey(PermissionApplicationPrivateKey permissionApplicationPrivateKey) {
        throw new RuntimeException("Stub!");
    }

    public boolean removeTrustedCaCertificateList(List<X509Certificate> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean removeUntrustedCertificateList(List<X509Certificate> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean setNonTrustedAppInstallBlock(boolean z4) {
        throw new RuntimeException("Stub!");
    }
}
