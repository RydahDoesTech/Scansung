package com.idm.tool.bootstrap;

/* loaded from: classes.dex */
public class IDMBootstrapInfo {
    private boolean result = false;
    private String serverID = "";
    private int CmdCount = 0;
    private int itemCount = 0;
    private boolean bNeedDefaultNode = false;

    public int idmGetCmdCount() {
        return this.CmdCount;
    }

    public int idmGetItemCount() {
        return this.itemCount;
    }

    public String idmGetServerID() {
        return this.serverID;
    }

    public boolean idmIsNeedDefaultNode() {
        return this.bNeedDefaultNode;
    }

    public boolean idmIsResult() {
        return this.result;
    }

    public void idmSetCmdCount(int i5) {
        this.CmdCount = i5;
    }

    public void idmSetItemCount(int i5) {
        this.itemCount = i5;
    }

    public void idmSetNeedDefaultNode(boolean z4) {
        this.bNeedDefaultNode = z4;
    }

    public void idmSetResult(boolean z4) {
        this.result = z4;
    }

    public void idmSetServerID(String str) {
        this.serverID = str;
    }

    public String toString() {
        return "IDMBootstrapInfo{result=" + this.result + ", serverID='" + this.serverID + "', CmdCount=" + this.CmdCount + ", itemCount=" + this.itemCount + ", bNeedDefaultNode=" + this.bNeedDefaultNode + '}';
    }
}
