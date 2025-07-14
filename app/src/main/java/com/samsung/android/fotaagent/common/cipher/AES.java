package com.samsung.android.fotaagent.common.cipher;

import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;

/* loaded from: classes.dex */
class AES {
    private static final String CIPHER_ALGORITHM = "AES/CBC/PKCS5Padding";
    private static final String KEY_ALGORITHM = "AES";
    private static final int KEY_LENGTH = 128;
    private static final String RANDOM_ALGORITHM = "SHA1PRNG";
    private Key key;
    private Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);
    private SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");

    private AES() {
    }

    public static AES newWithGeneratedKey() {
        return new AES().withGeneratedKey();
    }

    private AES withGeneratedKey() throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance(KEY_ALGORITHM);
        keyGenerator.init(128, this.sr);
        this.key = keyGenerator.generateKey();
        return this;
    }

    public synchronized byte[] decrypt(byte[] bArr) {
        byte[][] bArrSplitBytes;
        bArrSplitBytes = Bytes.splitBytes(bArr, this.cipher.getBlockSize());
        this.cipher.init(2, this.key, new IvParameterSpec(bArrSplitBytes[0]));
        return this.cipher.doFinal(bArrSplitBytes[1]);
    }

    public synchronized byte[] encrypt(byte[] bArr) {
        byte[] bArr2;
        bArr2 = new byte[this.cipher.getBlockSize()];
        this.sr.nextBytes(bArr2);
        this.cipher.init(1, this.key, new IvParameterSpec(bArr2));
        return Bytes.mergeBytes(bArr2, this.cipher.doFinal(bArr));
    }

    public byte[] getKey() {
        return this.key.getEncoded();
    }
}
