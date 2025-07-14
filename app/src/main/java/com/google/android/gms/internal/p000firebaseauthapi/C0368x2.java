package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.x2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0368x2 implements Q {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0380z2 f5680a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0235b0 f5681b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5682c;

    public C0368x2(InterfaceC0380z2 interfaceC0380z2, InterfaceC0235b0 interfaceC0235b0, int i5) {
        this.f5680a = interfaceC0380z2;
        this.f5681b = interfaceC0235b0;
        this.f5682c = i5;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.Q
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i5 = this.f5682c;
        if (length < i5) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int i6 = length - i5;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, i6);
        this.f5681b.a(Arrays.copyOfRange(bArr, i6, length), AbstractC0335s.C(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
        return this.f5680a.a(bArrCopyOfRange);
    }
}
