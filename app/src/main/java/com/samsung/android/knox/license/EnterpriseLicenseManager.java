package com.samsung.android.knox.license;

import android.content.Context;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class EnterpriseLicenseManager {
    public static final String ACTION_LICENSE_STATUS = "com.samsung.android.knox.intent.action.LICENSE_STATUS";
    public static final int ERROR_ANOTHER_PROCESS_IN_PLACE = 602;
    public static final int ERROR_INTERNAL = 301;
    public static final int ERROR_INTERNAL_SERVER = 401;
    public static final int ERROR_INVALID_LICENSE = 201;
    public static final int ERROR_INVALID_PACKAGE_NAME = 204;
    public static final int ERROR_LICENSE_TERMINATED = 203;
    public static final int ERROR_NETWORK_DISCONNECTED = 501;
    public static final int ERROR_NETWORK_GENERAL = 502;
    public static final int ERROR_NONE = 0;
    public static final int ERROR_NOT_CURRENT_DATE = 205;
    public static final int ERROR_NULL_PARAMS = 101;
    public static final int ERROR_SIGNATURE_MISMATCH = 206;
    public static final int ERROR_UNKNOWN = 102;
    public static final int ERROR_USER_DISAGREES_LICENSE_AGREEMENT = 601;
    public static final int ERROR_VERSION_CODE_MISMATCH = 207;
    public static final String EXTRA_LICENSE_ATTESTATION_STATUS = "com.samsung.android.knox.intent.extra.LICENSE_ATTESTATION_STATUS";
    public static final String EXTRA_LICENSE_ERROR_CODE = "com.samsung.android.knox.intent.extra.LICENSE_ERROR_CODE";
    public static final String EXTRA_LICENSE_GRANTED_PERMISSIONS = "com.samsung.android.knox.intent.extra.LICENSE_GRANTED_PERMISSIONS";
    public static final String EXTRA_LICENSE_RESULT_TYPE = "com.samsung.android.knox.intent.extra.LICENSE_RESULT_TYPE";
    public static final String EXTRA_LICENSE_STATUS = "com.samsung.android.knox.intent.extra.LICENSE_STATUS";
    public static final String LICENSE_LOG_API = "api_call";
    public static final String LICENSE_LOG_DATE = "log_date";
    public static final int LICENSE_RESULT_TYPE_ACTIVATION = 800;
    public static final int LICENSE_RESULT_TYPE_VALIDATION = 801;
    public static final int STATUS_ATTESTED = 0;
    public static final int STATUS_DEVICE_NOT_SUPPORTED = 2;
    public static final int STATUS_NOT_ATTESTED = 1;
    public static final int STATUS_UNKNOWN_ERROR = 3;

    public EnterpriseLicenseManager() {
        throw new RuntimeException("Stub!");
    }

    public static EnterpriseLicenseManager getInstance(Context context) {
        throw new RuntimeException("Stub!");
    }

    public void activateLicense(String str) {
        throw new RuntimeException("Stub!");
    }

    public JSONArray getApiCallDataByAdmin(String str) {
        throw new RuntimeException("Stub!");
    }

    public void activateLicense(String str, String str2) {
        throw new RuntimeException("Stub!");
    }

    public void activateLicense(String str, LicenseResultCallback licenseResultCallback) {
        throw new RuntimeException("Stub!");
    }

    public void activateLicense(String str, String str2, LicenseResultCallback licenseResultCallback) {
        throw new RuntimeException("Stub!");
    }
}
