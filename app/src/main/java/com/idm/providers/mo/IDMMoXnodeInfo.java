package com.idm.providers.mo;

import A3.f;

/* loaded from: classes.dex */
public class IDMMoXnodeInfo {
    private String serverID;
    private String xAddr;
    private String xClientAuth;
    private String xConRef;
    private String xDMAcc;
    private String xFumo;
    private String xPort;
    private String xServerAuth;

    public IDMMoXnodeInfo() {
        this.serverID = "";
        this.xDMAcc = "";
        this.xConRef = "";
        this.xAddr = "";
        this.xPort = "";
        this.xClientAuth = "";
        this.xServerAuth = "";
        this.xFumo = "";
    }

    public String idmMoGetxAddr() {
        return this.xAddr;
    }

    public String idmMoGetxClientAuth() {
        return this.xClientAuth;
    }

    public String idmMoGetxConRef() {
        return this.xConRef;
    }

    public String idmMoGetxDMAcc() {
        return this.xDMAcc;
    }

    public String idmMoGetxFumo() {
        return this.xFumo;
    }

    public String idmMoGetxPort() {
        return this.xPort;
    }

    public String idmMoGetxServerAuth() {
        return this.xServerAuth;
    }

    public void idmMoSetxAddr(String str) {
        this.xAddr = str;
    }

    public void idmMoSetxClientAuth(String str) {
        this.xClientAuth = str;
    }

    public void idmMoSetxConRef(String str) {
        this.xConRef = str;
    }

    public void idmMoSetxDMAcc(String str) {
        this.xDMAcc = str;
    }

    public void idmMoSetxFumo(String str) {
        this.xFumo = str;
    }

    public void idmMoSetxPort(String str) {
        this.xPort = str;
    }

    public void idmMoSetxServerAuth(String str) {
        this.xServerAuth = str;
    }

    public String idmMoXnodeGetServerID() {
        return this.serverID;
    }

    public void idmMoXnodeSetServerID(String str) {
        this.serverID = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IDMMoXnodeInfo{serverID='");
        sb.append(this.serverID);
        sb.append("', xDMAcc='");
        sb.append(this.xDMAcc);
        sb.append("', xConRef='");
        sb.append(this.xConRef);
        sb.append("', xAddr='");
        sb.append(this.xAddr);
        sb.append("', xPort='");
        sb.append(this.xPort);
        sb.append("', xClientAuth='");
        sb.append(this.xClientAuth);
        sb.append("', xServerAuth='");
        sb.append(this.xServerAuth);
        sb.append("', xFumo='");
        return f.p(sb, this.xFumo, "'}");
    }

    public IDMMoXnodeInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.serverID = str;
        this.xDMAcc = str2;
        this.xConRef = str3;
        this.xAddr = str4;
        this.xPort = str5;
        this.xClientAuth = str6;
        this.xServerAuth = str7;
        this.xFumo = str8;
    }

    public IDMMoXnodeInfo(String str, String str2) {
        this.serverID = str;
        this.xFumo = str2;
    }
}
