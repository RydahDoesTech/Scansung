package com.idm.agent.dm;

/* loaded from: classes.dex */
public class IDMDmEventInfo {
    private Object data;
    private String serverId;
    private int state;

    public Object idmGetData() {
        return this.data;
    }

    public String idmGetServerId() {
        return this.serverId;
    }

    public int idmGetState() {
        return this.state;
    }

    public void idmSetData(Object obj) {
        this.data = obj;
    }

    public void idmSetServerId(String str) {
        this.serverId = str;
    }

    public void idmSetState(int i5) {
        this.state = i5;
    }

    public String toString() {
        return "EventInfo [serverId=" + this.serverId + ", data=" + this.data + ", state=" + this.state + "]";
    }
}
