package com.idm.core.security;

import android.text.TextUtils;
import android.util.Base64;
import com.idm.adapter.logmanager.IDMDebug;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public class IDMSecurityAESCrypt {
    private static final String CRYPTO_KEY_ALGORITHM = "AES";
    private static final int CRYPTO_KEY_SIZE = 128;
    private static String key = "";

    private SecretKey idmDeriveKey(String str, int i5) {
        return new SecretKeySpec(InsecureSHA1PRNGKeyDerivator.deriveInsecureKey(str.getBytes(StandardCharsets.US_ASCII), i5), CRYPTO_KEY_ALGORITHM);
    }

    private boolean idmIsValidBlobData(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return false;
        }
        return (bArr.length == 1 && bArr[0] == 0) ? false : true;
    }

    private String idmMealyMachine(int i5, int i6) {
        byte[] bArr = new byte[i6];
        int[][] iArr = {new int[]{11, 0}, new int[]{0, 4}, new int[]{8, 15}, new int[]{11, 2}, new int[]{0, 3}, new int[]{9, 0}, new int[]{15, 0}, new int[]{0, 0}, new int[]{5, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{1, 6}, new int[]{0, 0}, new int[]{3, 13}, new int[]{0, 0}, new int[]{2, 13}};
        char[][] cArr = {new char[]{'s', '3'}, new char[]{'v', 'n'}, new char[]{'1', '9'}, new char[]{'m', '0'}, new char[]{'e', 'c'}, new char[]{'3', 'B'}, new char[]{'7', 'N'}, new char[]{'k', '2'}, new char[]{'2', 'C'}, new char[]{'a', 'C'}, new char[]{'J', '2'}, new char[]{'y', 'l'}, new char[]{'8', 'd'}, new char[]{'1', '0'}, new char[]{'A', '^'}, new char[]{'7', '0'}};
        int i7 = i5;
        int i8 = 0;
        for (int i9 = 0; i9 < i6; i9++) {
            int i10 = i7 & 1;
            i7 >>= 1;
            bArr[i9] = (byte) cArr[i8][i10];
            i8 = iArr[i8][i10];
        }
        return new String(bArr, Charset.defaultCharset());
    }

    public String idmDecryptor(byte[] bArr, String str) {
        try {
            return idmIsValidBlobData(bArr) ? new String(idmGetCryptionResult(bArr, 2, str), Charset.defaultCharset()) : "";
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
            return "";
        }
    }

    public String idmDecryptorStrBase64(String str, String str2) {
        try {
            return !TextUtils.isEmpty(str) ? new String(idmGetCryptionResult(Base64.decode(str, 0), 2, str2), Charset.defaultCharset()) : "";
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
            return "";
        }
    }

    public byte[] idmEncryptor(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return idmGetCryptionResult(str.getBytes(Charset.defaultCharset()), 1, str2);
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
            return null;
        }
    }

    public String idmEncryptorStrBase64(String str, String str2) {
        byte[] bArrIdmGetCryptionResult;
        try {
            return (TextUtils.isEmpty(str) || (bArrIdmGetCryptionResult = idmGetCryptionResult(str.getBytes(Charset.defaultCharset()), 1, str2)) == null) ? "" : Base64.encodeToString(bArrIdmGetCryptionResult, 0);
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
            return "";
        }
    }

    public byte[] idmGetCryptionResult(byte[] bArr, int i5, String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        try {
            if (TextUtils.isEmpty(str)) {
                Cipher cipher = Cipher.getInstance(CRYPTO_KEY_ALGORITHM);
                cipher.init(i5, new SecretKeySpec(idmMealyMachine(5932, 16).getBytes(Charset.defaultCharset()), CRYPTO_KEY_ALGORITHM));
                return cipher.doFinal(bArr);
            }
            SecretKey secretKeyIdmDeriveKey = idmDeriveKey(str, 16);
            Cipher cipher2 = Cipher.getInstance(CRYPTO_KEY_ALGORITHM);
            cipher2.init(i5, secretKeyIdmDeriveKey);
            return cipher2.doFinal(bArr);
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
            return null;
        }
    }

    public byte[] idmEncryptor(String str) {
        try {
            return idmGetCryptionResult(str.getBytes(Charset.defaultCharset()), 1, null);
        } catch (Exception e5) {
            IDMDebug.printStackTrace(e5);
            return null;
        }
    }

    public String idmDecryptor(byte[] bArr) {
        if (bArr != null) {
            try {
                return new String(idmGetCryptionResult(bArr, 2, null), Charset.defaultCharset());
            } catch (Exception e5) {
                IDMDebug.printStackTrace(e5);
                return "";
            }
        }
        return "";
    }
}
