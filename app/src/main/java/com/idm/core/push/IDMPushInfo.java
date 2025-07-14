package com.idm.core.push;

/* loaded from: classes.dex */
public class IDMPushInfo {
    private int id = 0;
    private int version = 0;
    private int uiMode = 0;
    private int initiator = 0;
    private int future = 0;
    private String sessionId = "";
    private String serverId = "";
    private int status = 0;
    private int triggerHeaderSize = 0;
    private byte[] triggerBody = null;

    public int idmPushGetFuture() {
        return this.future;
    }

    public int idmPushGetId() {
        return this.id;
    }

    public int idmPushGetInitiator() {
        return this.initiator;
    }

    public String idmPushGetServerId() {
        return this.serverId;
    }

    public String idmPushGetSessionId() {
        return this.sessionId;
    }

    public int idmPushGetStatus() {
        return this.status;
    }

    public byte[] idmPushGetTriggerBody() {
        return this.triggerBody;
    }

    public int idmPushGetTriggerHeaderSize() {
        return this.triggerHeaderSize;
    }

    public int idmPushGetUiMode() {
        return this.uiMode;
    }

    public int idmPushGetVersion() {
        return this.version;
    }

    public void idmPushSetFuture(int i5) {
        this.future = i5;
    }

    public void idmPushSetId(int i5) {
        this.id = i5;
    }

    public void idmPushSetInitiator(int i5) {
        this.initiator = i5;
    }

    public void idmPushSetServerId(String str) {
        this.serverId = str;
    }

    public void idmPushSetSessionId(String str) {
        this.sessionId = str;
    }

    public void idmPushSetStatus(int i5) {
        this.status = i5;
    }

    public void idmPushSetTriggerBody(byte[] bArr) {
        this.triggerBody = bArr;
    }

    public void idmPushSetTriggerHeaderSize(int i5) {
        this.triggerHeaderSize = i5;
    }

    public void idmPushSetUiMode(int i5) {
        this.uiMode = i5;
    }

    public void idmPushSetVersion(int i5) {
        this.version = i5;
    }

    public String toString() {
        return "IDMPushInfo [id=" + this.id + ", version=" + this.version + ", uiMode=" + this.uiMode + ", initiator=" + this.initiator + ", future=" + this.future + ", sessionId=" + this.sessionId + ", serverId=" + this.serverId + ", status=" + this.status + ", triggerBody=" + this.triggerBody + ", triggerHeaderSize=" + this.triggerHeaderSize + "]";
    }
}
