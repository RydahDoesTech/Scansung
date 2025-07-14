package com.google.android.gms.internal.p000firebaseauthapi;

import A3.f;
import I0.d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0347u implements A {

    /* renamed from: a, reason: collision with root package name */
    public final U4 f5640a;

    /* renamed from: b, reason: collision with root package name */
    public final E f5641b;

    /* renamed from: c, reason: collision with root package name */
    public final h5 f5642c;

    public C0347u(E e5, h5 h5Var, U4 u4) {
        this.f5641b = e5;
        h5Var.getClass();
        this.f5642c = h5Var;
        this.f5640a = u4;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.A
    public final Object a() {
        return ((l5) ((m5) this.f5640a).h(5)).c();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.A
    public final void b(Object obj) {
        this.f5641b.getClass();
        ((m5) obj).zzc.f5287e = false;
        this.f5642c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.A
    public final void c(Object obj, b5 b5Var, g5 g5Var) {
        this.f5641b.getClass();
        m5 m5Var = (m5) obj;
        if (m5Var.zzc == D.f) {
            m5Var.zzc = D.b();
        }
        this.f5642c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.A
    public final int d(m5 m5Var) {
        this.f5641b.getClass();
        return m5Var.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.A
    public final void e(Object obj, byte[] bArr, int i5, int i6, d dVar) {
        m5 m5Var = (m5) obj;
        if (m5Var.zzc == D.f) {
            m5Var.zzc = D.b();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.A
    public final void f(Object obj, C0306n c0306n) {
        this.f5642c.getClass();
        f.s(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.A
    public final boolean g(m5 m5Var, Object obj) {
        this.f5641b.getClass();
        return m5Var.zzc.equals(((m5) obj).zzc);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.A
    public final boolean h(Object obj) {
        this.f5642c.getClass();
        f.s(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.A
    public final void i(m5 m5Var, m5 m5Var2) {
        B.b(this.f5641b, m5Var, m5Var2);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.A
    public final int j(U4 u4) {
        this.f5641b.getClass();
        D d5 = ((m5) u4).zzc;
        int i5 = d5.f5286d;
        if (i5 != -1) {
            return i5;
        }
        int iA0 = 0;
        for (int i6 = 0; i6 < d5.f5283a; i6++) {
            int i7 = d5.f5284b[i6];
            Z4 z4 = (Z4) d5.f5285c[i6];
            int iA02 = f5.a0(8);
            int iN = z4.n();
            iA0 += f5.a0(iN) + iN + f5.a0(24) + f.j(i7 >>> 3, f5.a0(16), iA02 + iA02);
        }
        d5.f5286d = iA0;
        return iA0;
    }
}
