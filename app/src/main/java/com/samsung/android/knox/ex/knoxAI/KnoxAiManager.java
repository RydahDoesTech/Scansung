package com.samsung.android.knox.ex.knoxAI;

import android.content.Context;

/* loaded from: classes.dex */
public class KnoxAiManager {

    public enum ErrorCodes {
        DEVICE_NOT_PROVISIONED,
        DEVICE_PROVISION_FAILED,
        KNOX_AI_INCOMPATIBLE_DEVICE_MODEL,
        KNOX_AI_INTERNAL_ERROR,
        KNOX_AI_INVALID_ARGUMENTS,
        KNOX_AI_MODEL_KEY_REVOKED,
        KNOX_AI_MODEL_PACKAGE_ERROR,
        KNOX_AI_MODEL_POLICY_VIOLATION,
        KNOX_AI_SERVICE_FAILURE,
        KNOX_AI_UNKNOWN_ERROR,
        KNOX_AI_UNSUPPORTED_COMPUTEUNIT,
        KNOX_AI_UNSUPPORTED_MODEL_TYPE,
        KNOX_AI_UNSUPPORTED_OP,
        SUCCESS;

        public static ErrorCodes getCodeFromValue(int i5) {
            throw new RuntimeException("Stub!");
        }

        public int getValue() {
            throw new RuntimeException("Stub!");
        }
    }

    public KnoxAiManager() {
        throw new RuntimeException("Stub!");
    }

    public static KnoxAiManager getInstance(Context context) {
        throw new RuntimeException("Stub!");
    }

    public KnoxAiSession createKnoxAiSession() {
        throw new RuntimeException("Stub!");
    }

    public ErrorCodes destroyKnoxAiSession(KnoxAiSession knoxAiSession) {
        throw new RuntimeException("Stub!");
    }

    public void getKeyProvisioning(KeyProvisioningResultCallback keyProvisioningResultCallback) {
        throw new RuntimeException("Stub!");
    }
}
