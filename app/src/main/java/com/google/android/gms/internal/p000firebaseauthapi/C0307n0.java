package com.google.android.gms.internal.p000firebaseauthapi;

import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0307n0 implements Q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5569a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5570b;

    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] a(byte[] r8, byte[] r9) throws java.security.GeneralSecurityException, java.lang.InterruptedException {
        /*
            r7 = this;
            int r0 = r7.f5569a
            switch(r0) {
                case 0: goto L23;
                default: goto L5;
            }
        L5:
            byte[] r7 = r7.c(r8, r9)     // Catch: java.lang.Throwable -> La
            goto L22
        La:
            r0 = move-exception
            java.lang.String r1 = "n0"
            java.lang.String r2 = "encountered a potentially transient KeyStore error, will wait and retry"
            android.util.Log.w(r1, r2, r0)
            double r0 = java.lang.Math.random()
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 * r2
            int r0 = (int) r0
            long r0 = (long) r0
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L1e
        L1e:
            byte[] r7 = r7.c(r8, r9)
        L22:
            return r7
        L23:
            int r0 = r8.length
            java.lang.Object r7 = r7.f5570b
            com.google.android.gms.internal.firebase-auth-api.U r7 = (com.google.android.gms.internal.p000firebaseauthapi.U) r7
            r1 = 5
            if (r0 <= r1) goto L78
            r2 = 0
            byte[] r2 = java.util.Arrays.copyOfRange(r8, r2, r1)
            byte[] r0 = java.util.Arrays.copyOfRange(r8, r1, r0)
            java.util.List r1 = r7.f(r2)
            java.util.Iterator r1 = r1.iterator()
        L3c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L78
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.firebase-auth-api.c0 r2 = (com.google.android.gms.internal.p000firebaseauthapi.C0241c0) r2
            java.lang.Object r2 = r2.f5442a     // Catch: java.security.GeneralSecurityException -> L51
            com.google.android.gms.internal.firebase-auth-api.Q r2 = (com.google.android.gms.internal.p000firebaseauthapi.Q) r2     // Catch: java.security.GeneralSecurityException -> L51
            byte[] r7 = r2.a(r0, r9)     // Catch: java.security.GeneralSecurityException -> L51
            goto L96
        L51:
            r2 = move-exception
            java.util.logging.Logger r3 = com.google.android.gms.internal.p000firebaseauthapi.C0313o0.f5576a
            java.util.logging.Level r4 = java.util.logging.Level.INFO
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r5 = r2.length()
            java.lang.String r6 = "ciphertext prefix matches a key, but cannot decrypt: "
            if (r5 == 0) goto L6b
            java.lang.String r2 = r6.concat(r2)
            goto L70
        L6b:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r6)
        L70:
            java.lang.String r5 = "com.google.crypto.tink.aead.AeadWrapper$WrappedAead"
            java.lang.String r6 = "decrypt"
            r3.logp(r4, r5, r6, r2)
            goto L3c
        L78:
            byte[] r0 = com.google.android.gms.internal.p000firebaseauthapi.AbstractC0335s.f5614a
            java.util.List r7 = r7.f(r0)
            java.util.Iterator r7 = r7.iterator()
        L82:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L97
            java.lang.Object r0 = r7.next()
            com.google.android.gms.internal.firebase-auth-api.c0 r0 = (com.google.android.gms.internal.p000firebaseauthapi.C0241c0) r0
            java.lang.Object r0 = r0.f5442a     // Catch: java.security.GeneralSecurityException -> L82
            com.google.android.gms.internal.firebase-auth-api.Q r0 = (com.google.android.gms.internal.p000firebaseauthapi.Q) r0     // Catch: java.security.GeneralSecurityException -> L82
            byte[] r7 = r0.a(r8, r9)     // Catch: java.security.GeneralSecurityException -> L82
        L96:
            return r7
        L97:
            java.security.GeneralSecurityException r7 = new java.security.GeneralSecurityException
            java.lang.String r8 = "decryption failed"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.C0307n0.a(byte[], byte[]):byte[]");
    }

    public byte[] b(byte[] bArr, byte[] bArr2) throws InterruptedException {
        try {
            return d(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e5) {
            Log.w("n0", "encountered a potentially transient KeyStore error, will wait and retry", e5);
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused) {
            }
            return this.d(bArr, bArr2);
        }
    }

    public byte[] c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, (SecretKey) this.f5570b, gCMParameterSpec);
        cipher.updateAAD(bArr2);
        return cipher.doFinal(bArr, 12, length - 12);
    }

    public byte[] d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[length + 28];
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, (SecretKey) this.f5570b);
        cipher.updateAAD(bArr2);
        cipher.doFinal(bArr, 0, length, bArr3, 12);
        System.arraycopy(cipher.getIV(), 0, bArr3, 0, 12);
        return bArr3;
    }

    public C0307n0(String str, KeyStore keyStore) throws InvalidKeyException {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.f5570b = secretKey;
        if (secretKey == null) {
            String strValueOf = String.valueOf(str);
            throw new InvalidKeyException(strValueOf.length() != 0 ? "Keystore cannot load the key with ID: ".concat(strValueOf) : new String("Keystore cannot load the key with ID: "));
        }
    }
}
