package com.samsung.context.sdk.samsunganalytics.internal.connection;

/* loaded from: classes.dex */
public enum Domain {
    REGISTRATION("https://regi.di.atlas.samsung.com"),
    POLICY("https://dc.di.atlas.samsung.com"),
    DLS("");

    String domain;

    Domain(String str) {
        this.domain = str;
    }

    public String getDomain() {
        return this.domain;
    }

    public void setDomain(String str) {
        this.domain = str;
    }
}
