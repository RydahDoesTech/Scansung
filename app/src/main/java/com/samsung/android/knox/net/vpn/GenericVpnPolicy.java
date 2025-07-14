package com.samsung.android.knox.net.vpn;

import android.os.Bundle;
import com.samsung.android.knox.keystore.CertificateInfo;
import java.util.List;

/* loaded from: classes.dex */
public class GenericVpnPolicy {
    public static final String ACTION_BIND_RESULT = "com.samsung.android.knox.intent.action.VPN_BIND_RESULT";
    public static final String EXTRA_BIND_CID = "com.samsung.android.knox.intent.extra.VPN_BIND_CID";
    public static final String EXTRA_BIND_STATUS = "com.samsung.android.knox.intent.extra.VPN_BIND_STATUS";
    public static final String EXTRA_BIND_VENDOR = "com.samsung.android.knox.intent.extra.VPN_BIND_VENDOR";
    public static final String KEY_TETHER_CA_CERTIFICATE = "key-tether-ca-certificate";
    public static final String KEY_TETHER_USER_CERTIFICATE = "key-tether-user-certificate";
    public static final String KEY_TETHER_USER_CERT_PASSWORD = "key-tether-user-cert-password";

    public GenericVpnPolicy() {
        throw new RuntimeException("Stub!");
    }

    public int activateVpnProfile(String str, boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public int addAllContainerPackagesToVpn(int i5, String str) {
        throw new RuntimeException("Stub!");
    }

    public int addAllPackagesToVpn(String str) {
        throw new RuntimeException("Stub!");
    }

    public int addContainerPackagesToVpn(int i5, String[] strArr, String str) {
        throw new RuntimeException("Stub!");
    }

    public int addPackagesToVpn(String[] strArr, String str) {
        throw new RuntimeException("Stub!");
    }

    public int allowUsbTetheringOverVpn(String str, boolean z4, Bundle bundle) {
        throw new RuntimeException("Stub!");
    }

    public int createVpnProfile(String str) {
        throw new RuntimeException("Stub!");
    }

    public String[] getAllContainerPackagesInVpnProfile(int i5, String str) {
        throw new RuntimeException("Stub!");
    }

    public String[] getAllPackagesInVpnProfile(String str) {
        throw new RuntimeException("Stub!");
    }

    public List<String> getAllVpnProfiles() {
        throw new RuntimeException("Stub!");
    }

    public CertificateInfo getCACertificate(String str) {
        throw new RuntimeException("Stub!");
    }

    public String getErrorString(String str) {
        throw new RuntimeException("Stub!");
    }

    public int getState(String str) {
        throw new RuntimeException("Stub!");
    }

    public CertificateInfo getUserCertificate(String str) {
        throw new RuntimeException("Stub!");
    }

    public int getVpnModeOfOperation(String str) {
        throw new RuntimeException("Stub!");
    }

    public String getVpnProfile(String str) {
        throw new RuntimeException("Stub!");
    }

    public int isUsbTetheringOverVpnEnabled(String str) {
        throw new RuntimeException("Stub!");
    }

    public int removeAllContainerPackagesFromVpn(int i5, String str) {
        throw new RuntimeException("Stub!");
    }

    public int removeAllPackagesFromVpn(String str) {
        throw new RuntimeException("Stub!");
    }

    public int removeContainerPackagesFromVpn(int i5, String[] strArr, String str) {
        throw new RuntimeException("Stub!");
    }

    public int removePackagesFromVpn(String[] strArr, String str) {
        throw new RuntimeException("Stub!");
    }

    public int removeVpnProfile(String str) {
        throw new RuntimeException("Stub!");
    }

    public boolean setAutoRetryOnConnectionError(String str, boolean z4) {
        throw new RuntimeException("Stub!");
    }

    public boolean setCACertificate(String str, byte[] bArr) {
        throw new RuntimeException("Stub!");
    }

    public boolean setServerCertValidationUserAcceptanceCriteria(String str, boolean z4, List<Integer> list, int i5) {
        throw new RuntimeException("Stub!");
    }

    public boolean setUserCertificate(String str, byte[] bArr, String str2) {
        throw new RuntimeException("Stub!");
    }

    public int setVpnModeOfOperation(String str, int i5) {
        throw new RuntimeException("Stub!");
    }
}
