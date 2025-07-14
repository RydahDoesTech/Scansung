package com.idm.providers.mo;

import A3.f;

/* loaded from: classes.dex */
public class IDMMoNodeInfo {
    private String acl;
    private int depth;
    private String format;
    private String name;
    private String path;
    private int scope;
    private String type;
    private String value;

    public IDMMoNodeInfo() {
    }

    public String idmMoNodeGetAcl() {
        return this.acl;
    }

    public int idmMoNodeGetDepth() {
        return this.depth;
    }

    public String idmMoNodeGetFormat() {
        return this.format;
    }

    public String idmMoNodeGetName() {
        return this.name;
    }

    public String idmMoNodeGetPath() {
        return this.path;
    }

    public int idmMoNodeGetScope() {
        return this.scope;
    }

    public String idmMoNodeGetType() {
        return this.type;
    }

    public String idmMoNodeGetValue() {
        return this.value;
    }

    public void idmMoNodeSetAcl(String str) {
        this.acl = str;
    }

    public void idmMoNodeSetDepth(int i5) {
        this.depth = i5;
    }

    public void idmMoNodeSetFormat(String str) {
        this.format = str;
    }

    public void idmMoNodeSetName(String str) {
        this.name = str;
    }

    public void idmMoNodeSetPath(String str) {
        this.path = str;
    }

    public void idmMoNodeSetScope(int i5) {
        this.scope = i5;
    }

    public void idmMoNodeSetType(String str) {
        this.type = str;
    }

    public void idmMoNodeSetValue(String str) {
        this.value = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IDMMoNodeInfo{path='");
        sb.append(this.path);
        sb.append("', name='");
        sb.append(this.name);
        sb.append("', acl='");
        sb.append(this.acl);
        sb.append("', format='");
        sb.append(this.format);
        sb.append("', type='");
        sb.append(this.type);
        sb.append("', depth=");
        sb.append(this.depth);
        sb.append(", value='");
        return f.p(sb, this.value, "'}");
    }

    public IDMMoNodeInfo(String str, String str2, String str3, int i5, String str4, String str5, int i6, String str6) {
        this.path = str;
        this.name = str2;
        this.acl = str3;
        this.scope = i5;
        this.format = str4;
        this.type = str5;
        this.depth = i6;
        this.value = str6;
    }
}
