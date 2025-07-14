package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class M0 extends m5 {
    private static final M0 zzb;
    private int zze;
    private Z4 zzf = Z4.f5416e;
    private Q0 zzg;

    static {
        M0 m0 = new M0();
        zzb = m0;
        m5.f(M0.class, m0);
    }

    public static L0 n() {
        return (L0) zzb.i();
    }

    public static M0 o(Z4 z4, g5 g5Var) {
        return (M0) m5.k(zzb, z4, g5Var);
    }

    public static /* synthetic */ void t(M0 m0, Q0 q0) {
        q0.getClass();
        m0.zzg = q0;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m5
    public final Object h(int i5) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new C0377z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i6 == 3) {
            return new M0();
        }
        if (i6 == 4) {
            return new L0(zzb);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }

    public final int m() {
        return this.zze;
    }

    public final Q0 p() {
        Q0 q0 = this.zzg;
        return q0 == null ? Q0.o() : q0;
    }

    public final Z4 q() {
        return this.zzf;
    }
}
