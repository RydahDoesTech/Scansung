package com.idm.core.syncml;

import A3.f;

/* loaded from: classes.dex */
public class Meta {
    private String format;
    private String maxMsgSize;
    private String maxObjSize;
    private String nextNonce;
    private String size;
    private String type;

    public Meta() {
    }

    public String getFormat() {
        return this.format;
    }

    public String getMaxMsgSize() {
        return this.maxMsgSize;
    }

    public String getMaxObjSize() {
        return this.maxObjSize;
    }

    public String getNextNonce() {
        return this.nextNonce;
    }

    public String getSize() {
        return this.size;
    }

    public String getType() {
        return this.type;
    }

    public void setFormat(String str) {
        this.format = str;
    }

    public void setMaxMsgSize(String str) {
        this.maxMsgSize = str;
    }

    public void setMaxObjSize(String str) {
        this.maxObjSize = str;
    }

    public void setNextNonce(String str) {
        this.nextNonce = str;
    }

    public void setSize(String str) {
        this.size = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Meta [Type=");
        sb.append(this.type);
        sb.append(", Format=");
        sb.append(this.format);
        sb.append(", NextNonce=");
        sb.append(this.nextNonce);
        sb.append(", MaxMsgSize=");
        sb.append(this.maxMsgSize);
        sb.append(", MaxObjSize=");
        return f.p(sb, this.maxObjSize, "]");
    }

    public Meta(String str, String str2, String str3, String str4, String str5, String str6) {
        this.format = str;
        this.type = str2;
        this.size = str3;
        this.nextNonce = str4;
        this.maxMsgSize = str5;
        this.maxObjSize = str6;
    }
}
