package com.idm.agent.dl;

import com.idm.adapter.logmanager.IDMDebug;

/* loaded from: classes.dex */
public class IDMDlAbortInfo {
    private int errorCode;
    private int responseCode;
    private int retryCount;

    public void idmClearDlAbortInfo() {
        this.errorCode = 0;
        this.responseCode = 0;
        this.retryCount = 0;
    }

    public int idmGetErrorCode() {
        return this.errorCode;
    }

    public int idmGetResponseCode() {
        return this.responseCode;
    }

    public int idmGetRetryCount() {
        return this.retryCount;
    }

    public void idmSetErrorCode(int i5) {
        IDMDebug.I("SDK Dl Abort Info idmSetErrorCode : " + i5);
        this.errorCode = i5;
    }

    public void idmSetResponseCode(int i5) {
        this.responseCode = i5;
    }

    public void idmSetRetryCount(int i5) {
        this.retryCount = i5;
    }
}
