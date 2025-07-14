package com.idm.core.syncml;

import A3.f;

/* loaded from: classes.dex */
public class Cred {
    private String data;
    private Meta meta;

    public String getData() {
        return this.data;
    }

    public Meta getMeta() {
        return this.meta;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Cred [Meta=");
        sb.append(this.meta);
        sb.append(", Data=");
        return f.p(sb, this.data, "]");
    }
}
