package com.samsung.android.knox.integrity;

/* loaded from: classes.dex */
public class EnhancedAttestationResult {
    public static final int ERROR_BAD_REQUEST = 400;
    public static final int ERROR_BIND_FAIL = -7;
    public static final int ERROR_CONFLICT = 409;
    public static final int ERROR_DEVICE_NOT_SUPPORTED = -4;
    public static final int ERROR_FORBIDDEN = 403;
    public static final int ERROR_INTERNAL_SERVER = 500;
    public static final int ERROR_INVALID_AUK = -6;
    public static final int ERROR_INVALID_NONCE = -5;
    public static final int ERROR_NETWORK = -8;
    public static final int ERROR_NONE = 0;
    public static final int ERROR_NOT_FOUND = 404;
    public static final int ERROR_PERMISSION = -2;
    public static final int ERROR_SERVICE_UNAVAILABLE = 503;
    public static final int ERROR_TIMA_INTERNAL = -3;
    public static final int ERROR_UNAUTHORIZED = 401;
    public static final int ERROR_UNKNOWN = -1;

    public EnhancedAttestationResult() {
        throw new RuntimeException("Stub!");
    }

    public byte[] getBlob() {
        throw new RuntimeException("Stub!");
    }

    public int getError() {
        throw new RuntimeException("Stub!");
    }

    public String getReason() {
        throw new RuntimeException("Stub!");
    }

    public String getResponseRawData() {
        throw new RuntimeException("Stub!");
    }

    public int getRetryAfterTime() {
        throw new RuntimeException("Stub!");
    }

    public String getServerResponseId() {
        throw new RuntimeException("Stub!");
    }

    public String getUniqueId() {
        throw new RuntimeException("Stub!");
    }

    public String getUrl() {
        throw new RuntimeException("Stub!");
    }
}
