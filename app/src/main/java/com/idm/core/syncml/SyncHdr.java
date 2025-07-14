package com.idm.core.syncml;

/* loaded from: classes.dex */
public class SyncHdr {
    private Cred cred;
    private Meta meta;
    private String msgID;
    private String respURI;
    private String sessionID;
    private Source source;
    private Target target;
    private String verDTD;
    private String verProto;

    public Cred getCred() {
        return this.cred;
    }

    public Meta getMeta() {
        return this.meta;
    }

    public String getMsgID() {
        return this.msgID;
    }

    public String getRespURI() {
        return this.respURI;
    }

    public String getSessionID() {
        return this.sessionID;
    }

    public Source getSource() {
        return this.source;
    }

    public Target getTarget() {
        return this.target;
    }

    public String getVerDTD() {
        return this.verDTD;
    }

    public String getVerProto() {
        return this.verProto;
    }

    public void setCred(Cred cred) {
        this.cred = cred;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public void setMsgID(String str) {
        this.msgID = str;
    }

    public void setRespURI(String str) {
        this.respURI = str;
    }

    public void setSessionID(String str) {
        this.sessionID = str;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public void setVerDTD(String str) {
        this.verDTD = str;
    }

    public void setVerProto(String str) {
        this.verProto = str;
    }

    public String toString() {
        return "SyncHdr [verDTD=" + this.verDTD + ", verProto=" + this.verProto + ", sessionID=" + this.sessionID + ", msgID=" + this.msgID + ", target=" + this.target + ", source=" + this.source + ", respURI=" + this.respURI + ", cred=" + this.cred + ", meta=" + this.meta + "]";
    }
}
