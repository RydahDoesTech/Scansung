package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class M1 extends m5 {
    private static final M1 zzb;
    private int zze;
    private Q1 zzf;
    private Z4 zzg = Z4.f5416e;

    static {
        M1 m12 = new M1();
        zzb = m12;
        m5.f(M1.class, m12);
    }

    public static L1 n() {
        return (L1) zzb.i();
    }

    public static M1 o() {
        return zzb;
    }

    public static M1 p(Z4 z4, g5 g5Var) {
        return (M1) m5.k(zzb, z4, g5Var);
    }

    public static /* synthetic */ void t(M1 m12, Q1 q12) {
        q12.getClass();
        m12.zzf = q12;
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
            return new M1();
        }
        if (i6 == 4) {
            return new L1(zzb);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }

    public final int m() {
        return this.zze;
    }

    public final Q1 q() {
        Q1 q12 = this.zzf;
        return q12 == null ? Q1.p() : q12;
    }

    public final Z4 r() {
        return this.zzg;
    }
}
