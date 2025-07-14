package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.g2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0267g2 extends m5 {
    private static final C0267g2 zzb;
    private int zze;
    private C0273h2 zzf;

    static {
        C0267g2 c0267g2 = new C0267g2();
        zzb = c0267g2;
        m5.f(C0267g2.class, c0267g2);
    }

    public static C0261f2 n() {
        return (C0261f2) zzb.i();
    }

    public static C0267g2 o(Z4 z4, g5 g5Var) {
        return (C0267g2) m5.k(zzb, z4, g5Var);
    }

    public static /* synthetic */ void r(C0267g2 c0267g2, C0273h2 c0273h2) {
        c0273h2.getClass();
        c0267g2.zzf = c0273h2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m5
    public final Object h(int i5) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new C0377z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
        }
        if (i6 == 3) {
            return new C0267g2();
        }
        if (i6 == 4) {
            return new C0261f2(zzb);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }

    public final int m() {
        return this.zze;
    }

    public final C0273h2 p() {
        C0273h2 c0273h2 = this.zzf;
        return c0273h2 == null ? C0273h2.m() : c0273h2;
    }
}
