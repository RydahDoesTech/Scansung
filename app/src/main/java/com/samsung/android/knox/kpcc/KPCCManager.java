package com.samsung.android.knox.kpcc;

import java.util.List;

/* loaded from: classes.dex */
public class KPCCManager {
    public static final int DRX_1280_MSEC = 3;
    public static final int DRX_2560_MSEC = 4;
    public static final int DRX_320_MSEC = 1;
    public static final int DRX_640_MSEC = 2;
    public static final int DRX_DEFAULT = 0;
    public static final int ERROR_ADMIN_ALREADY_SET = -3;
    public static final int ERROR_FAIL = -1;
    public static final int ERROR_INVALID_VALUE = -4;
    public static final int ERROR_NOT_SUPPORTED = -2;
    public static final int KEYCODE_EMERGENCY = 1079;
    public static final int KEYCODE_PTT = 1015;
    public static final int OFF = 0;
    public static final int ON = 1;
    public static final int SUCCESS = 0;

    public KPCCManager() {
        throw new RuntimeException("Stub!");
    }

    public int allowRestrictedNetworkCapability(int i5, String str, int i6) {
        throw new RuntimeException("Stub!");
    }

    public int getDrxValue() {
        throw new RuntimeException("Stub!");
    }

    public int getTelephonyDrxValue() {
        throw new RuntimeException("Stub!");
    }

    public List<Integer> getUnrestrictedNetworkCapabilities(String str) {
        throw new RuntimeException("Stub!");
    }

    public int setDrxValue(int i5) {
        throw new RuntimeException("Stub!");
    }
}
