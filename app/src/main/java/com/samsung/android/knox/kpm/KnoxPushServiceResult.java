package com.samsung.android.knox.kpm;

/* loaded from: classes.dex */
public class KnoxPushServiceResult {
    public static final int ERROR_BAD_REQUEST = 400;
    public static final int ERROR_BIND_FAIL = -2;
    public static final int ERROR_CB_EMPTY = -9;
    public static final int ERROR_CONFLICT = 409;
    public static final int ERROR_DEVICE_NOT_SUPPORTED = -7;
    public static final int ERROR_FORBIDDEN = 403;
    public static final int ERROR_FW = -5;
    public static final int ERROR_INTERNAL = -6;
    public static final int ERROR_INTERNAL_SERVER = 500;
    public static final int ERROR_NETWORK = -8;
    public static final int ERROR_NONE = 0;
    public static final int ERROR_NOT_FOUND = 404;
    public static final int ERROR_PERMISSION = -3;
    public static final int ERROR_REQUEST_NOT_FINISHED = -4;
    public static final int ERROR_SERVICE_UNAVAILABLE = 503;
    public static final int ERROR_UNAUTHORIZED = 401;
    public static final int ERROR_UNKNOWN = -1;
    public static final int NOT_REGISTERED = 2;
    public static final int REGISTERED = 1;

    public KnoxPushServiceResult() {
        throw new RuntimeException("Stub!");
    }

    public String getDeviceId() {
        throw new RuntimeException("Stub!");
    }

    public int getError() {
        throw new RuntimeException("Stub!");
    }

    public String getReason() {
        throw new RuntimeException("Stub!");
    }
}
