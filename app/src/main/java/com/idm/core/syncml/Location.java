package com.idm.core.syncml;

/* loaded from: classes.dex */
public abstract class Location {
    protected String locName;
    protected String locURI;

    public Location() {
    }

    public String getLocName() {
        return this.locName;
    }

    public String getLocURI() {
        return this.locURI;
    }

    public void setLocName(String str) {
        this.locName = str;
    }

    public void setLocURI(String str) {
        this.locURI = str;
    }

    public Location(String str, String str2) {
        this.locURI = str;
        this.locName = str2;
    }
}
