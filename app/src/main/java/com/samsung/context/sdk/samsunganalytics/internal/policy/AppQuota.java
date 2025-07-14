package com.samsung.context.sdk.samsunganalytics.internal.policy;

/* loaded from: classes.dex */
public class AppQuota {
    private int dataQuota;
    private int dataUsed;
    private int loadedSize;
    private int wifiQuota;
    private int wifiUsed;

    public int getDataQuota() {
        return this.dataQuota;
    }

    public int getDataUsed() {
        return this.dataUsed;
    }

    public int getLoadedSize() {
        return this.loadedSize;
    }

    public int getWifiQuota() {
        return this.wifiQuota;
    }

    public int getWifiUsed() {
        return this.wifiUsed;
    }

    public void setDataQuota(int i5) {
        this.dataQuota = i5;
    }

    public void setDataUsed(int i5) {
        this.dataUsed = i5;
    }

    public void setLoadedSize(int i5) {
        this.loadedSize = i5;
    }

    public void setWifiQuota(int i5) {
        this.wifiQuota = i5;
    }

    public void setWifiUsed(int i5) {
        this.wifiUsed = i5;
    }
}
