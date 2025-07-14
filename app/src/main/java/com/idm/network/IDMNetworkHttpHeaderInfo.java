package com.idm.network;

import A3.f;

/* loaded from: classes.dex */
public class IDMNetworkHttpHeaderInfo {
    private String connectionType;
    private int responseCode = 0;
    private String contentType = null;
    private String contentLength = null;
    private String macData = null;

    public String idmGetConnectionType() {
        return this.connectionType;
    }

    public String idmGetContentLength() {
        return this.contentLength;
    }

    public String idmGetContentType() {
        return this.contentType;
    }

    public String idmGetMacData() {
        return this.macData;
    }

    public int idmGetResponseCode() {
        return this.responseCode;
    }

    public void idmSetConnectionType(String str) {
        this.connectionType = str;
    }

    public void idmSetContentLength(String str) {
        this.contentLength = str;
    }

    public void idmSetContentType(String str) {
        this.contentType = str;
    }

    public void idmSetMacData(String str) {
        this.macData = str;
    }

    public void idmSetResponseCode(int i5) {
        this.responseCode = i5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IDMHttpHeaderInfo{contentType='");
        sb.append(this.contentType);
        sb.append("', macData='");
        return f.p(sb, this.macData, "'}");
    }
}
