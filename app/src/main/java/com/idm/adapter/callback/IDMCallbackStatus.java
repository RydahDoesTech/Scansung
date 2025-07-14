package com.idm.adapter.callback;

import com.idm.adapter.logmanager.IDMDebug;

/* loaded from: classes.dex */
public class IDMCallbackStatus implements IDMCallbackStatusInterface {
    private int results = 0;
    private int status = 0;
    private int abortCode = 0;
    private Object object = null;

    public int idmGetAbortCode() {
        return this.abortCode;
    }

    public Object idmGetObject() {
        return this.object;
    }

    public int idmGetResults() {
        return this.results;
    }

    public int idmGetStatus() {
        return this.status;
    }

    public void idmSetStatus(int i5, int i6, int i7) {
        IDMDebug.I("idmSetStatus [ results : " + i5 + " status : " + i6 + " abortCode : " + i7 + " ]");
        this.results = i5;
        this.status = i6;
        this.abortCode = i7;
    }

    public void idmSetStatus(int i5, int i6, int i7, Object obj) {
        this.results = i5;
        this.status = i6;
        this.abortCode = i7;
        this.object = obj;
    }
}
