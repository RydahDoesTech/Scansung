package com.idm.agent.dm;

import com.idm.adapter.logmanager.IDMDebug;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class IDMDmAbortInfo {
    private int errorCode;
    private String exceptionMessage;
    private Map<String, List<String>> httpResponse;
    private int responseCode;
    private int retryCount;

    public String getExceptionMessage() {
        return this.exceptionMessage;
    }

    public Map<String, List<String>> getHttpResponse() {
        return this.httpResponse;
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
        IDMDebug.I("SDK Dm Abort Info idmSetErrorCode : " + i5);
        this.errorCode = i5;
    }

    public void idmSetResponseCode(int i5) {
        this.responseCode = i5;
    }

    public void idmSetRetryCount(int i5) {
        this.retryCount = i5;
    }

    public void setExceptionMessage(String str) {
        this.exceptionMessage = str;
    }

    public void setResponseHttpHeader(Map<String, List<String>> map) {
        this.httpResponse = map;
    }
}
