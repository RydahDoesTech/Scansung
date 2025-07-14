package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0354v0 implements Q {

    /* renamed from: b, reason: collision with root package name */
    public static final C0348u0 f5650b = new C0348u0(0);

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f5651a;

    public C0354v0(byte[] bArr) throws InvalidAlgorithmParameterException {
        E2.b(bArr.length);
        this.f5651a = new SecretKeySpec(bArr, "AES");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.Q
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException, ClassNotFoundException {
        AlgorithmParameterSpec ivParameterSpec;
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            ivParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        } catch (ClassNotFoundException unused) {
            if (!AbstractC0335s.u()) {
                throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
            }
            ivParameterSpec = new IvParameterSpec(bArr, 0, 12);
        }
        C0348u0 c0348u0 = f5650b;
        ((Cipher) c0348u0.get()).init(2, this.f5651a, ivParameterSpec);
        if (bArr2.length != 0) {
            ((Cipher) c0348u0.get()).updateAAD(bArr2);
        }
        return ((Cipher) c0348u0.get()).doFinal(bArr, 12, bArr.length - 12);
    }
}
