package com.idm.core.syncml;

/* loaded from: classes.dex */
public abstract class ResponseCommand extends ItemCommand {
    protected String CmdRef;
    protected String MsgRef;
    protected String SourceRef;
    protected String TargetRef;

    public String getCmdRef() {
        return this.CmdRef;
    }

    public String getMsgRef() {
        return this.MsgRef;
    }

    public String getSourceRef() {
        return this.SourceRef;
    }

    public String getTargetRef() {
        return this.TargetRef;
    }

    public void setCmdRef(String str) {
        this.CmdRef = str;
    }

    public void setMsgRef(String str) {
        this.MsgRef = str;
    }

    public void setSourceRef(String str) {
        this.SourceRef = str;
    }

    public void setTargetRef(String str) {
        this.TargetRef = str;
    }
}
