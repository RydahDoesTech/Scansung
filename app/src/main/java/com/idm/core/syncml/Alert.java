package com.idm.core.syncml;

/* loaded from: classes.dex */
public class Alert extends ItemCommand {
    private String correlator;
    private String data;

    public String getCorrelator() {
        return this.correlator;
    }

    public String getData() {
        return this.data;
    }

    public void setCorrelator(String str) {
        this.correlator = str;
    }

    public void setData(String str) {
        this.data = str;
    }

    public String toString() {
        return "Alert [correlator=" + this.correlator + ", data=" + this.data + ", itemList=" + this.itemList + ", cmdID=" + this.cmdID + ", meta=" + this.meta + "]";
    }
}
