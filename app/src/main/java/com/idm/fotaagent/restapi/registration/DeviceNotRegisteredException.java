package com.idm.fotaagent.restapi.registration;

/* loaded from: classes.dex */
public class DeviceNotRegisteredException extends Exception {
    private final String errorCode;
    private final int result;

    public DeviceNotRegisteredException(String str) {
        this(str, 0);
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public int getResult() {
        return this.result;
    }

    public DeviceNotRegisteredException(String str, int i5) {
        this(str, i5, (String) null);
    }

    public DeviceNotRegisteredException(int i5, String str) {
        this((String) null, i5, str);
    }

    public DeviceNotRegisteredException(String str, int i5, String str2) {
        super(str);
        this.result = i5;
        this.errorCode = str2;
    }

    public DeviceNotRegisteredException(String str, int i5, Throwable th) {
        super(str, th);
        this.result = i5;
        this.errorCode = null;
    }
}
