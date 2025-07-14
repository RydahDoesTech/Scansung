package com.idm.core.syncml;

/* loaded from: classes.dex */
public class Exec extends ItemCommand {
    private String correlator;

    public String getCorrelator() {
        return this.correlator;
    }

    public void setCorrelator(String str) {
        this.correlator = str;
    }

    public String toString() {
        return "Exec [correlator=" + this.correlator + ", itemList=" + this.itemList + ", cmdID=" + this.cmdID + ", meta=" + this.meta + "]";
    }
}
