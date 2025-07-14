package com.samsung.android.knox.keystore;

import com.samsung.android.knox.AppIdentity;
import java.util.List;

/* loaded from: classes.dex */
public class CertificateProvisioning {
    public static final String CA_CERTIFICATE = "CACERT_";
    public static final int ERROR_KEYSTORE_KEY_NOT_FOUND = 7;
    public static final int ERROR_KEYSTORE_LOCKED = 2;
    public static final int ERROR_KEYSTORE_NONE = 1;
    public static final int ERROR_KEYSTORE_PERMISSION_DENIED = 6;
    public static final int ERROR_KEYSTORE_PROTOCOL = 5;
    public static final int ERROR_KEYSTORE_SYSTEM = 4;
    public static final int ERROR_KEYSTORE_UNDEFINED_ACTION = 9;
    public static final int ERROR_KEYSTORE_UNINITIALIZED = 3;
    public static final int ERROR_KEYSTORE_VALUE_CORRUPTED = 8;
    public static final int ERROR_KEYSTORE_WRONG_PASSWORD = 10;
    public static final int KEYSTORE_DEFAULT = 1;
    public static final int KEYSTORE_FOR_VPN_AND_APPS = 4;
    public static final int KEYSTORE_FOR_WIFI = 2;
    public static final String TYPE_CERTIFICATE = "CERT";
    public static final String TYPE_PKCS12 = "PKCS12";
    public static final String USER_CERTIFICATE = "USRCERT_";

    public CertificateProvisioning() {
        throw new RuntimeException("Stub!");
    }

    public boolean addPackagesToCertificateWhiteList(List<AppIdentity> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean deleteCertificateFromKeystore(CertificateInfo certificateInfo, int i5) {
        throw new RuntimeException("Stub!");
    }

    public List<CertificateInfo> getCertificatesFromKeystore(int i5) {
        throw new RuntimeException("Stub!");
    }

    public int getCredentialStorageStatus() {
        throw new RuntimeException("Stub!");
    }

    public List<AppIdentity> getPackagesFromCertificateWhiteList() {
        throw new RuntimeException("Stub!");
    }

    public List<CertificateInfo> getSystemCertificates() {
        throw new RuntimeException("Stub!");
    }

    public boolean installCertificateToKeystore(String str, byte[] bArr, String str2, String str3, int i5) {
        throw new RuntimeException("Stub!");
    }

    public void installCertificateWithType(String str, byte[] bArr) {
        throw new RuntimeException("Stub!");
    }

    public void installCertificatesFromSdCard() {
        throw new RuntimeException("Stub!");
    }

    public boolean removePackagesFromCertificateWhiteList(List<AppIdentity> list) {
        throw new RuntimeException("Stub!");
    }

    public boolean resetCredentialStorage() {
        throw new RuntimeException("Stub!");
    }

    public boolean unlockCredentialStorage(String str) {
        throw new RuntimeException("Stub!");
    }
}
