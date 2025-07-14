package com.samsung.android.knox.devicesecurity;

import com.samsung.android.knox.AppIdentity;
import java.util.List;

/* loaded from: classes.dex */
public class APMPolicy {
    public static final int APM_ENFORCE_NONE = 0;
    public static final int APM_ENFORCE_OFF = 1;
    public static final int APM_ENFORCE_ON = 2;
    public static final int APM_ENFORCING_ON = 3;
    public static final int APM_FAILED = -1;
    public static final int APM_SUCCESS = 0;

    public APMPolicy() {
        throw new RuntimeException("Stub!");
    }

    public int addAppToAPMWhiteList(List<AppIdentity> list) {
        throw new RuntimeException("Stub!");
    }

    public int getAPMStatus() {
        throw new RuntimeException("Stub!");
    }

    public List<AppIdentity> getAPMWhiteList() {
        throw new RuntimeException("Stub!");
    }

    public int removeAppFromAPMWhiteList(List<AppIdentity> list) {
        throw new RuntimeException("Stub!");
    }

    public int setAPMStatus(int i5) {
        throw new RuntimeException("Stub!");
    }
}
