package com.samsung.android.knox.license;

import java.util.Date;

/* loaded from: classes.dex */
public class ActivationInfo {

    public enum State {
        ACTIVE,
        EXPIRED,
        TERMINATED
    }

    public ActivationInfo() {
        throw new RuntimeException("Stub!");
    }

    public Date getActivationDate() {
        throw new RuntimeException("Stub!");
    }

    public String getMaskedLicenseKey() {
        throw new RuntimeException("Stub!");
    }

    public String getPackageName() {
        throw new RuntimeException("Stub!");
    }

    public State getState() {
        throw new RuntimeException("Stub!");
    }
}
