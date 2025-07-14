package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.p2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0321p2 implements InterfaceC0380z2 {

    /* renamed from: d, reason: collision with root package name */
    public static final C0348u0 f5583d = new C0348u0(1);

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f5584a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5585b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5586c;

    public C0321p2(byte[] bArr, int i5) throws GeneralSecurityException {
        E2.b(bArr.length);
        this.f5584a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f5583d.get()).getBlockSize();
        this.f5586c = blockSize;
        if (i5 < 12 || i5 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f5585b = i5;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0380z2
    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i5 = this.f5585b;
        if (length < i5) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i5];
        System.arraycopy(bArr, 0, bArr2, 0, i5);
        int i6 = this.f5585b;
        int i7 = length - i6;
        byte[] bArr3 = new byte[i7];
        Cipher cipher = (Cipher) f5583d.get();
        byte[] bArr4 = new byte[this.f5586c];
        System.arraycopy(bArr2, 0, bArr4, 0, i5);
        cipher.init(2, this.f5584a, new IvParameterSpec(bArr4));
        if (cipher.doFinal(bArr, i6, i7, bArr3, 0) == i7) {
            return bArr3;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
