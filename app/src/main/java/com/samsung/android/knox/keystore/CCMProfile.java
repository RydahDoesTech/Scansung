package com.samsung.android.knox.keystore;

import java.util.List;

/* loaded from: classes.dex */
public class CCMProfile {
    public AccessControlMethod accessControlMethod;
    public List<String> packageList;
    public boolean whiteListAllPackages;

    public enum AccessControlMethod {
        LOCK_STATE
    }

    public CCMProfile() {
        throw new RuntimeException("Stub!");
    }
}
