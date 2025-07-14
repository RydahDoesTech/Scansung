package com.idm.agent.dm;

/* loaded from: classes.dex */
public class IDMDmExecInfo {
    private String correlator;
    private String data;
    private String path;
    private String serverId;
    private String taskId;

    public IDMDmExecInfo() {
    }

    public String idmGetCorrelator() {
        return this.correlator;
    }

    public String idmGetData() {
        return this.data;
    }

    public String idmGetPath() {
        return this.path;
    }

    public String idmGetServerId() {
        return this.serverId;
    }

    public String idmGetTaskId() {
        return this.taskId;
    }

    public void idmSetCorrelator(String str) {
        this.correlator = str;
    }

    public void idmSetData(String str) {
        this.data = str;
    }

    public void idmSetPath(String str) {
        this.path = str;
    }

    public void idmSetServerId(String str) {
        this.serverId = str;
    }

    public void idmSetTaskId(String str) {
        this.taskId = str;
    }

    public IDMDmExecInfo(String str, String str2, String str3, String str4, String str5) {
        this.serverId = str;
        this.taskId = str2;
        this.path = str3;
        this.correlator = str4;
        this.data = str5;
    }
}
