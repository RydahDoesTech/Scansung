package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public final V1 f5397a;

    public V(V1 v12) {
        this.f5397a = v12;
    }

    public static V a(byte[] bArr, int i5, String str) {
        U1 u1M = V1.m();
        u1M.f(str);
        u1M.g(Z4.q(bArr, 0, bArr.length));
        int i6 = i5 - 1;
        u1M.e(i6 != 0 ? i6 != 1 ? i6 != 2 ? 5 : 4 : 3 : 2);
        return new V((V1) u1M.b());
    }
}
