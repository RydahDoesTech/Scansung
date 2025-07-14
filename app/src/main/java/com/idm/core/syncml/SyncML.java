package com.idm.core.syncml;

/* loaded from: classes.dex */
public class SyncML {
    private SyncBody syncBody;
    private SyncHdr syncHdr;

    public SyncBody getSyncBody() {
        return this.syncBody;
    }

    public SyncHdr getSyncHdr() {
        return this.syncHdr;
    }

    public void setSyncBody(SyncBody syncBody) {
        this.syncBody = syncBody;
    }

    public void setSyncHdr(SyncHdr syncHdr) {
        this.syncHdr = syncHdr;
    }

    public String toString() {
        return "SyncML [SyncHdr=" + this.syncHdr + ", SyncBody=" + this.syncBody + "]";
    }
}
