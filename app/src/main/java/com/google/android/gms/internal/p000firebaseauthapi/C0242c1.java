package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0242c1 extends m5 {
    private static final C0242c1 zzb;
    private int zze;
    private C0266g1 zzf;
    private Z4 zzg = Z4.f5416e;

    static {
        C0242c1 c0242c1 = new C0242c1();
        zzb = c0242c1;
        m5.f(C0242c1.class, c0242c1);
    }

    public static C0236b1 n() {
        return (C0236b1) zzb.i();
    }

    public static C0242c1 o(Z4 z4, g5 g5Var) {
        return (C0242c1) m5.k(zzb, z4, g5Var);
    }

    public static /* synthetic */ void s(C0242c1 c0242c1, C0266g1 c0266g1) {
        c0266g1.getClass();
        c0242c1.zzf = c0266g1;
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
            return new C0242c1();
        }
        if (i6 == 4) {
            return new C0236b1(zzb);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }

    public final int m() {
        return this.zze;
    }

    public final C0266g1 p() {
        C0266g1 c0266g1 = this.zzf;
        return c0266g1 == null ? C0266g1.o() : c0266g1;
    }

    public final Z4 q() {
        return this.zzg;
    }
}
