package com.samsung.android.fotaagent.common.cipher;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.idm.fotaagent.enabler.security.IDMSecurityAESCryptImpl;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public class AESCrypt {
    public static String decrypt(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return new IDMSecurityAESCryptImpl().idmDecryptor(Base64.decode(str, 2));
        } catch (Exception e5) {
            Log.e("IDM_FOTA", e5.toString());
            return "";
        }
    }

    public static String encrypt(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return new String(Base64.encode(new IDMSecurityAESCryptImpl().idmEncryptor(str), 2), StandardCharsets.UTF_8);
        } catch (Exception e5) {
            Log.e("IDM_FOTA", e5.toString());
            return "";
        }
    }
}
