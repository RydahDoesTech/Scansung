package com.idm.core.tnds;

import A3.f;

/* loaded from: classes.dex */
public class IDMTndsNodeInfo {
    private String acl;
    private int depth;
    private String format;
    private String name;
    private String path;
    private String type;
    private String value;

    public IDMTndsNodeInfo() {
        this.path = "";
        this.name = "";
        this.acl = "";
        this.format = "";
        this.type = "";
        this.value = "";
    }

    public String idmTndsNodeGetAcl() {
        return this.acl;
    }

    public int idmTndsNodeGetDepth() {
        return this.depth;
    }

    public String idmTndsNodeGetFormat() {
        return this.format;
    }

    public String idmTndsNodeGetName() {
        return this.name;
    }

    public String idmTndsNodeGetPath() {
        return this.path;
    }

    public String idmTndsNodeGetType() {
        return this.type;
    }

    public String idmTndsNodeGetValue() {
        return this.value;
    }

    public void idmTndsNodeSetAcl(String str) {
        this.acl = str;
    }

    public void idmTndsNodeSetDepth(int i5) {
        this.depth = i5;
    }

    public void idmTndsNodeSetFormat(String str) {
        this.format = str;
    }

    public void idmTndsNodeSetName(String str) {
        this.name = str;
    }

    public void idmTndsNodeSetPath(String str) {
        this.path = str;
    }

    public void idmTndsNodeSetType(String str) {
        this.type = str;
    }

    public void idmTndsNodeSetValue(String str) {
        this.value = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IDMMoNodeInfo [path=");
        sb.append(this.path);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", acl=");
        sb.append(this.acl);
        sb.append(", format=");
        sb.append(this.format);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", depth=");
        sb.append(this.depth);
        sb.append(", value=");
        return f.p(sb, this.value, "]");
    }

    public IDMTndsNodeInfo(String str, String str2, String str3, String str4, String str5, int i5, String str6) {
        this.path = str;
        this.name = str2;
        this.acl = str3;
        this.format = str4;
        this.type = str5;
        this.depth = i5;
        this.value = str6;
    }
}
