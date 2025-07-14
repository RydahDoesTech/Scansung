package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class E1 extends m5 {
    private static final E1 zzb;
    private int zze;
    private G1 zzf;
    private Z4 zzg = Z4.f5416e;

    static {
        E1 e12 = new E1();
        zzb = e12;
        m5.f(E1.class, e12);
    }

    public static D1 n() {
        return (D1) zzb.i();
    }

    public static E1 o(Z4 z4, g5 g5Var) {
        return (E1) m5.k(zzb, z4, g5Var);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m5
    public final Object h(int i5) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new C0377z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i6 == 3) {
            return new E1();
        }
        if (i6 == 4) {
            return new D1(zzb);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }

    public final int m() {
        return this.zze;
    }

    public final G1 p() {
        G1 g12 = this.zzf;
        return g12 == null ? G1.p() : g12;
    }

    public final Z4 q() {
        return this.zzg;
    }
}
