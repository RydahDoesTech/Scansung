package com.idm.core.syncml;

/* loaded from: classes.dex */
public class Status extends ResponseCommand {
    protected Chal chal;
    protected String cmd;
    protected String data;

    public Chal getChal() {
        return this.chal;
    }

    public String getCmd() {
        return this.cmd;
    }

    public String getData() {
        return this.data;
    }

    public void setChal(Chal chal) {
        this.chal = chal;
    }

    public void setCmd(String str) {
        this.cmd = str;
    }

    public void setData(String str) {
        this.data = str;
    }

    public String toString() {
        return "Status [cmd=" + this.cmd + ", chal=" + this.chal + ", data=" + this.data + ", MsgRef=" + this.MsgRef + ", CmdRef=" + this.CmdRef + ", TargetRef=" + this.TargetRef + ", SourceRef=" + this.SourceRef + ", itemList=" + this.itemList + ", cmdID=" + this.cmdID + ", meta=" + this.meta + "]";
    }
}
