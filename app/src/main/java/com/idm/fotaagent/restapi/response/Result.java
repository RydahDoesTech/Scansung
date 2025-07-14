package com.idm.fotaagent.restapi.response;

import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
public class Result {
    static final String ERROR_TYPE_DEVICE_NOT_REGISTERED = "FUD_3000";
    static final String ERROR_TYPE_INVALID_AUTH_CATEGORY1 = "SSO_";
    static final String ERROR_TYPE_INVALID_AUTH_CATEGORY2 = "ACC_";
    static final String ERROR_TYPE_INVALID_PARAMETER = "FUD_1";
    public static final String ERROR_TYPE_INVALID_TIMESTAMP = "SSO_8005";
    public static final String ERROR_TYPE_MODEL_CC_NOT_EXIST = "FUD_3007";
    private static final String ERROR_TYPE_SAK_ALREADY_REGISTERED = "FUD_3064";
    static final String ERROR_TYPE_SAK_CERTIFICATE_CHAIN_REQUIRED = "FUD_3062";
    public static final String ERROR_TYPE_SAK_CERTIFICATE_CHAIN_RETRIEVAL_FAILED = "SAK_0002";
    static final String ERROR_TYPE_SAK_CHALLENGE_NOT_MATCHED = "FUD_3061";
    static final String ERROR_TYPE_SAK_INVALID_CERTIFICATE_CHAIN = "FUD_3060";
    public static final String ERROR_TYPE_SAK_NOT_SUPPORTED = "SAK_0001";
    static final String ERROR_TYPE_UNEXPECTED_MODEL_DEVICE_ID = "FUD_3025";
    public static final int FAIL_ABNORMAL_DATA = 501;
    public static final int FAIL_NEED_SAK = 406;
    public static final int FAIL_NETWORK = 100;
    public static final int FAIL_PROCESS = 400;
    public static final int FAIL_SERVICE = 500;
    public static final int FAIL_UNKNOWN = 900;
    public static final int INIT = 0;
    public static final int SUCCESS = 200;
    private final int result;

    public Result() {
        this(0);
    }

    public static Result getResultFrom(int i5) {
        Log.E("httpResponseCode:" + i5);
        return i5 != -1 ? i5 != 404 ? new Result(500) : new Result(400) : new Result(100);
    }

    public int getValue() {
        return this.result;
    }

    public boolean isAbnormalData() {
        return this.result == 501;
    }

    public boolean isNetworkFailed() {
        return this.result == 100;
    }

    public boolean isProcessFailed() {
        return this.result == 400;
    }

    public boolean isSAKNeeded() {
        return this.result == 406;
    }

    public boolean isServiceFailed() {
        return this.result == 500;
    }

    public boolean isSuccess() {
        return this.result == 200;
    }

    public boolean isUnknownFailed() {
        return this.result == 900;
    }

    public Result(int i5) {
        this.result = i5;
    }

    public static Result getResultFrom(String str) {
        int i5;
        i5 = 400;
        switch (String.valueOf(str)) {
            case "":
            case "null":
                i5 = FAIL_UNKNOWN;
                break;
            case "FUD_3000":
            case "FUD_3007":
            case "FUD_3025":
            case "FUD_3060":
            case "FUD_3061":
            case "FUD_3064":
                break;
            case "FUD_3062":
                i5 = FAIL_NEED_SAK;
                break;
            default:
                if (!str.startsWith(ERROR_TYPE_INVALID_PARAMETER) && !str.startsWith(ERROR_TYPE_INVALID_AUTH_CATEGORY1) && !str.startsWith(ERROR_TYPE_INVALID_AUTH_CATEGORY2)) {
                    i5 = 500;
                    break;
                }
                break;
        }
        return new Result(i5);
    }
}
