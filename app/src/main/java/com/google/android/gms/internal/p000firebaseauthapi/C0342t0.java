package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0342t0 implements Q {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f5635c = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final V1 f5636a;

    /* renamed from: b, reason: collision with root package name */
    public final C0307n0 f5637b;

    public C0342t0(V1 v12, C0307n0 c0307n0) {
        this.f5636a = v12;
        this.f5637b = c0307n0;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.Q
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i5 = byteBufferWrap.getInt();
            if (i5 <= 0 || i5 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i5];
            byteBufferWrap.get(bArr3, 0, i5);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            return ((Q) AbstractC0283j0.d(this.f5636a.q(), this.f5637b.a(bArr3, f5635c))).a(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e5) {
            throw new GeneralSecurityException("invalid ciphertext", e5);
        }
    }
}
