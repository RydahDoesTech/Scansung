package com.samsung.android.knox.keystore;

import java.util.List;

/* loaded from: classes.dex */
public class CertificateProfile {
    public String alias;
    public boolean allowAllPackages;
    public boolean allowWiFi;
    public boolean isCSRResponse;
    public List<String> packageList;

    public CertificateProfile() {
        throw new RuntimeException("Stub!");
    }
}
