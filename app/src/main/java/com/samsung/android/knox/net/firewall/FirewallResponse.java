package com.samsung.android.knox.net.firewall;

/* loaded from: classes.dex */
public class FirewallResponse {

    public enum ErrorCode {
        DATABASE_ERROR,
        INPUT_CHAIN_NOT_SUPPORTED_ERROR,
        INVALID_PARAMETER_ERROR,
        IPV6_NOT_SUPPORTED_ERROR,
        NOT_AUTHORIZED_ERROR,
        NO_ERROR,
        OPERATION_NOT_PERMITTED_ERROR,
        UNEXPECTED_ERROR
    }

    public enum Result {
        FAILED,
        NO_CHANGES,
        SUCCESS
    }

    public FirewallResponse() {
        throw new RuntimeException("Stub!");
    }

    public ErrorCode getErrorCode() {
        throw new RuntimeException("Stub!");
    }

    public String getMessage() {
        throw new RuntimeException("Stub!");
    }

    public Result getResult() {
        throw new RuntimeException("Stub!");
    }
}
