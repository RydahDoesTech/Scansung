package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public final class C2 implements InterfaceC0235b0 {

    /* renamed from: a, reason: collision with root package name */
    public final K0 f5279a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5280b;

    public C2(K0 k0, int i5) throws InvalidAlgorithmParameterException {
        this.f5279a = k0;
        this.f5280b = i5;
        if (i5 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        k0.a(i5, new byte[0]);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0235b0
    public final void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!AbstractC0335s.v(this.f5279a.a(this.f5280b, bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
