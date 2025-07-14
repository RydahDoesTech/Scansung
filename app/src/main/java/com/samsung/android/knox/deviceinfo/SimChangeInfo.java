package com.samsung.android.knox.deviceinfo;

/* loaded from: classes.dex */
public class SimChangeInfo {
    public static final int SIM_CHANGED = 2;
    public static final int SIM_INSERTED = 3;
    public static final int SIM_REMOVED = 1;
    public int changeOperation;
    public long changeTime;
    public SimInfo currentSimInfo;
    public SimInfo previousSimInfo;

    public SimChangeInfo() {
        throw new RuntimeException("Stub!");
    }
}
