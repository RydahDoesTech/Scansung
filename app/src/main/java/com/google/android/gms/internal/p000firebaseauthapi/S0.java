package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class S0 extends m5 {
    private static final S0 zzb;
    private int zze;
    private W0 zzf;
    private M1 zzg;

    static {
        S0 s02 = new S0();
        zzb = s02;
        m5.f(S0.class, s02);
    }

    public static R0 n() {
        return (R0) zzb.i();
    }

    public static S0 o(Z4 z4, g5 g5Var) {
        return (S0) m5.k(zzb, z4, g5Var);
    }

    public static /* synthetic */ void t(S0 s02, M1 m12) {
        m12.getClass();
        s02.zzg = m12;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m5
    public final Object h(int i5) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new C0377z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i6 == 3) {
            return new S0();
        }
        if (i6 == 4) {
            return new R0(zzb);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }

    public final int m() {
        return this.zze;
    }

    public final W0 p() {
        W0 w02 = this.zzf;
        return w02 == null ? W0.o() : w02;
    }

    public final M1 q() {
        M1 m12 = this.zzg;
        return m12 == null ? M1.o() : m12;
    }
}
