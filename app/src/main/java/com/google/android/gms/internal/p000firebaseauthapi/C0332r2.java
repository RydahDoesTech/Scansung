package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.InvalidAlgorithmParameterException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.r2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0332r2 implements Q {

    /* renamed from: b, reason: collision with root package name */
    public static final C0348u0 f5608b = new C0348u0(4);

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f5609a;

    public C0332r2(byte[] bArr) throws InvalidAlgorithmParameterException {
        E2.b(bArr.length);
        this.f5609a = new SecretKeySpec(bArr, "AES");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.Q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] a(byte[] r7, byte[] r8) throws java.lang.IllegalAccessException, java.security.GeneralSecurityException, java.lang.IllegalArgumentException {
        /*
            r6 = this;
            int r0 = r7.length
            r1 = 28
            if (r0 < r1) goto L59
            boolean r1 = com.google.android.gms.internal.p000firebaseauthapi.AbstractC0335s.u()
            r2 = 0
            r3 = 12
            if (r1 == 0) goto L2b
            java.lang.String r1 = "android.os.Build$VERSION"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r4 = "SDK_INT"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L20
            r4 = 0
            int r1 = r1.getInt(r4)     // Catch: java.lang.Throwable -> L20
            goto L21
        L20:
            r1 = -1
        L21:
            r4 = 19
            if (r1 > r4) goto L2b
            javax.crypto.spec.IvParameterSpec r1 = new javax.crypto.spec.IvParameterSpec
            r1.<init>(r7, r2, r3)
            goto L32
        L2b:
            javax.crypto.spec.GCMParameterSpec r1 = new javax.crypto.spec.GCMParameterSpec
            r4 = 128(0x80, float:1.8E-43)
            r1.<init>(r4, r7, r2, r3)
        L32:
            com.google.android.gms.internal.firebase-auth-api.u0 r2 = com.google.android.gms.internal.p000firebaseauthapi.C0332r2.f5608b
            java.lang.Object r4 = r2.get()
            javax.crypto.Cipher r4 = (javax.crypto.Cipher) r4
            javax.crypto.spec.SecretKeySpec r6 = r6.f5609a
            r5 = 2
            r4.init(r5, r6, r1)
            int r6 = r8.length
            if (r6 == 0) goto L4c
            java.lang.Object r6 = r2.get()
            javax.crypto.Cipher r6 = (javax.crypto.Cipher) r6
            r6.updateAAD(r8)
        L4c:
            java.lang.Object r6 = r2.get()
            javax.crypto.Cipher r6 = (javax.crypto.Cipher) r6
            int r0 = r0 + (-12)
            byte[] r6 = r6.doFinal(r7, r3, r0)
            return r6
        L59:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.String r7 = "ciphertext too short"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.C0332r2.a(byte[], byte[]):byte[]");
    }
}
