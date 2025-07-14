package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class A1 extends m5 {
    private static final A1 zzb;
    private C1 zze;

    static {
        A1 a12 = new A1();
        zzb = a12;
        m5.f(A1.class, a12);
    }

    public static C0379z1 m() {
        return (C0379z1) zzb.i();
    }

    public static A1 n(Z4 z4, g5 g5Var) {
        return (A1) m5.k(zzb, z4, g5Var);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m5
    public final Object h(int i5) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new C0377z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        }
        if (i6 == 3) {
            return new A1();
        }
        if (i6 == 4) {
            return new C0379z1(zzb);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }

    public final C1 o() {
        C1 c12 = this.zze;
        return c12 == null ? C1.p() : c12;
    }
}
