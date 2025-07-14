package com.samsung.android.knox.integrity;

import android.content.Context;

/* loaded from: classes.dex */
public class AttestationPolicy {
    public static final String ACTION_KNOX_ATTESTATION_RESULT = "com.samsung.android.knox.intent.action.KNOX_ATTESTATION_RESULT";
    public static final int ERROR_DEVICE_NOT_SUPPORTED = -3;
    public static final int ERROR_INVALID_NONCE = -5;
    public static final int ERROR_MDM_PERMISSION = -1;
    public static final int ERROR_NONE = 0;
    public static final int ERROR_TIMA_INTERNAL = -2;
    public static final int ERROR_UNKNOWN = -4;
    public static final String EXTRA_ATTESTATION_DATA = "com.samsung.android.knox.intent.extra.ATTESTATION_DATA";
    public static final String EXTRA_ERROR_MSG = "com.samsung.android.knox.intent.extra.ERROR_MSG";
    public static final String EXTRA_NETWORK_ERROR = "com.samsung.android.knox.intent.extra.NETWORK_ERROR";
    public static final String EXTRA_RESULT = "com.samsung.android.knox.intent.extra.RESULT";

    public AttestationPolicy(Context context) {
        throw new RuntimeException("Stub!");
    }

    public void startAttestation(String str) {
        throw new RuntimeException("Stub!");
    }
}
