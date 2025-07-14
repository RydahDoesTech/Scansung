package com.idm.agent.dm;

import A3.f;

/* loaded from: classes.dex */
public class IDMDmAppSvcNodeInfo {
    private String data;
    private String format;
    private String path;

    public IDMDmAppSvcNodeInfo() {
    }

    public String idmGetData() {
        return this.data;
    }

    public String idmGetFormat() {
        return this.format;
    }

    public String idmGetPath() {
        return this.path;
    }

    public void idmSetData(String str) {
        this.data = str;
    }

    public void idmSetFormat(String str) {
        this.format = str;
    }

    public void idmSetPath(String str) {
        this.path = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IDMDmAppSvcNodeInfo [Path=");
        sb.append(this.path);
        sb.append(", Data=");
        sb.append(this.data);
        sb.append(", Format=");
        return f.p(sb, this.format, "]");
    }

    public IDMDmAppSvcNodeInfo(String str, String str2, String str3) {
        this.path = str;
        this.data = str2;
        this.format = str3;
    }
}
