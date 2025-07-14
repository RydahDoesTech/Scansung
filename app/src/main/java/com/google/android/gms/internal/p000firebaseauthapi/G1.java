package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class G1 extends m5 {
    private static final G1 zzb;
    private int zze;
    private C1 zzf;
    private Z4 zzg;
    private Z4 zzh;

    static {
        G1 g12 = new G1();
        zzb = g12;
        m5.f(G1.class, g12);
    }

    public G1() {
        Y4 y4 = Z4.f5416e;
        this.zzg = y4;
        this.zzh = y4;
    }

    public static F1 o() {
        return (F1) zzb.i();
    }

    public static G1 p() {
        return zzb;
    }

    public static G1 q(Z4 z4, g5 g5Var) {
        return (G1) m5.k(zzb, z4, g5Var);
    }

    public static /* synthetic */ void u(G1 g12, C1 c12) {
        c12.getClass();
        g12.zzf = c12;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m5
    public final Object h(int i5) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new C0377z(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i6 == 3) {
            return new G1();
        }
        if (i6 == 4) {
            return new F1(zzb);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }

    public final int m() {
        return this.zze;
    }

    public final C1 n() {
        C1 c12 = this.zzf;
        return c12 == null ? C1.p() : c12;
    }

    public final Z4 r() {
        return this.zzg;
    }

    public final Z4 s() {
        return this.zzh;
    }
}
