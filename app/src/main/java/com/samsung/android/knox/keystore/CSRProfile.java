package com.samsung.android.knox.keystore;

/* loaded from: classes.dex */
public class CSRProfile {
    public String commonName;
    public String country;
    public CSRFormat csrFormat;
    public String domainComponent;
    public String emailAddress;
    public KeyAlgorithm keyAlgType;
    public int keyLength;
    public String locality;
    public String organization;
    public ProfileType profileType;
    public String state;
    public String templateName;

    public enum CSRFormat {
        PKCS10
    }

    public enum KeyAlgorithm {
        RSA
    }

    public enum ProfileType {
        CMC,
        CMP,
        PROPRIETARY,
        SCEP
    }

    public CSRProfile() {
        throw new RuntimeException("Stub!");
    }
}
