package com.samsung.android.fotaagent.common.cipher;

import android.util.Base64;
import android.util.Log;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes.dex */
public class AESWithRSA {
    private static AES aes;
    private static byte[] encryptedKey;

    static {
        try {
            AES aesNewWithGeneratedKey = AES.newWithGeneratedKey();
            aes = aesNewWithGeneratedKey;
            encryptedKey = RSA.encrypt(aesNewWithGeneratedKey.getKey());
        } catch (RuntimeException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e5) {
            Log.e("IDM_FOTA", e5.toString());
        }
    }

    public static String encrypt(String str) {
        return new String(Base64.encode(encrypt(str.getBytes(Charset.defaultCharset())), 2), Charset.defaultCharset());
    }

    private static byte[] encrypt(byte[] bArr) {
        return Bytes.mergeBytes(encryptedKey, aes.encrypt(bArr));
    }
}
