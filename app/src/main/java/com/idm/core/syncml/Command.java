package com.idm.core.syncml;

/* loaded from: classes.dex */
public abstract class Command {
    protected String cmdID;
    protected Meta meta;

    public String getCmdID() {
        return this.cmdID;
    }

    public Meta getMeta() {
        return this.meta;
    }

    public void setCmdID(String str) {
        this.cmdID = str;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
