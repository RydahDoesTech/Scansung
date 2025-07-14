package com.samsung.android.fotaagent.common.cipher;

import android.util.Base64;
import android.util.Log;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes.dex */
class RSA {
    private static final String CIPHER_ALGORITHM = "RSA/ECB/PKCS1Padding";
    private static final String KEY_ALGORITHM = "RSA";
    private static final String PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA4hCCVWWB2/kpBfkG/hhaHT/TeyND99Fj4owwfEk+vNKmP6WAmq5QA32ctQY4MvXDHDRssjQ9Y+Bxg1c4ciaQ9StgpMAnn4epuO+p6q+aHnRNHeMLOkqDHwfMfyzMq57cK/Az/yfVDjNwZrDxZ4lsE+RtTX8QUtvbdwU8O4H+KoT352mlC1kgrNTK8aJEwaEVnpD5LFG9gvWx/insJO7dr7cjk2fyj1d/aYRe2+mjSkaQX9QlYVW+COnAcRnIg9XDIOyW5tGtepFYX6w/621dQT6eoferwegH54glfIf78/GJMUUBwN/FPmOgN3siHZIZH4iv51XfOXyAb0KHlb3UswIDAQAB";
    private static RSA rsa;
    private Cipher rsaCipher;

    static {
        resetPublicKey(PUBLIC_KEY);
    }

    private RSA(String str) throws InvalidKeySpecException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        byte[] bArrDecode = Base64.decode(str, 2);
        if (bArrDecode == null) {
            throw new InvalidKeyException("Key BASE64 decoding failed");
        }
        PublicKey publicKeyGeneratePublic = keyFactory.generatePublic(new X509EncodedKeySpec(bArrDecode));
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        this.rsaCipher = cipher;
        cipher.init(1, publicKeyGeneratePublic);
    }

    public static byte[] encrypt(byte[] bArr) {
        return rsa.encrypt_(bArr);
    }

    private synchronized byte[] encrypt_(byte[] bArr) {
        return this.rsaCipher.doFinal(bArr);
    }

    private static void resetPublicKey(String str) {
        try {
            rsa = new RSA(str);
        } catch (InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | NoSuchPaddingException e5) {
            e5.printStackTrace();
            Log.e("IDM_FOTA", e5.toString());
        }
    }
}
