package com.idm.fotaagent.utils.rangerequest.exception;

/* loaded from: classes.dex */
public class HttpResponseCodeException extends RuntimeException {
    private final int responseCode;

    public HttpResponseCodeException(int i5, String str) {
        super(str);
        this.responseCode = i5;
    }

    public boolean allowsRetry() {
        int i5 = this.responseCode;
        return i5 >= 200 && i5 < 300;
    }

    public int getResponseCode() {
        return this.responseCode;
    }
}
