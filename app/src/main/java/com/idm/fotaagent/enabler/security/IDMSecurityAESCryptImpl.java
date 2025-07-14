package com.idm.fotaagent.enabler.security;

import android.text.TextUtils;
import com.idm.core.security.IDMSecurityAESCrypt;
import com.samsung.android.fotaagent.common.log.Log;
import com.samsung.android.fotaagent.common.util.NativeUtils;

/* loaded from: classes.dex */
public class IDMSecurityAESCryptImpl extends IDMSecurityAESCrypt {
    private String szKey = "";

    public byte[] decrypt(byte[] bArr) {
        try {
            return idmGetCryptionResult(bArr, 2, null);
        } catch (Exception e5) {
            Log.printStackTrace(e5);
            return null;
        }
    }

    public byte[] encrypt(byte[] bArr) {
        try {
            return idmGetCryptionResult(bArr, 1, null);
        } catch (Exception e5) {
            Log.printStackTrace(e5);
            return null;
        }
    }

    public String idmGetCryptionkey() {
        if (TextUtils.isEmpty(this.szKey)) {
            try {
                this.szKey = NativeUtils.getKey();
            } catch (Throwable th) {
                Log.printStackTrace(th);
            }
        }
        return this.szKey;
    }
}
