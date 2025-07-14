package com.samsung.android.knox.keystore;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class EnrollmentProfile {
    public String certificateAlias;
    public Bundle credentialStorageBundle;
    public String hashAlgorithmType;
    public String keyPairAlgorithm;
    public int keySize;
    public String keystoreType;
    public String profileType;

    public EnrollmentProfile() {
        throw new RuntimeException("Stub!");
    }

    public String getCertificateAlias() {
        throw new RuntimeException("Stub!");
    }

    public String getKeyPairAlgorithm() {
        throw new RuntimeException("Stub!");
    }

    public int getKeySize() {
        throw new RuntimeException("Stub!");
    }

    public String getKeystoreType() {
        throw new RuntimeException("Stub!");
    }

    public abstract String getProfileType();

    public void setCertificateAlias(String str) {
        throw new RuntimeException("Stub!");
    }

    public void setKeyPairAlgorithm(String str) {
        throw new RuntimeException("Stub!");
    }

    public void setKeySize(int i5) {
        throw new RuntimeException("Stub!");
    }

    public void setKeystoreType(String str) {
        throw new RuntimeException("Stub!");
    }
}
