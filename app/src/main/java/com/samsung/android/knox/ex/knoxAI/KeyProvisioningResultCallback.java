package com.samsung.android.knox.ex.knoxAI;

import com.samsung.android.knox.ex.knoxAI.KnoxAiManager;

/* loaded from: classes.dex */
public abstract class KeyProvisioningResultCallback {
    public KeyProvisioningResultCallback() {
        throw new RuntimeException("Stub!");
    }

    public abstract void onFinished(KnoxAiManager.ErrorCodes errorCodes);
}
