package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0278i1 extends m5 {
    private static final C0278i1 zzb;
    private int zze;
    private Z4 zzf = Z4.f5416e;

    static {
        C0278i1 c0278i1 = new C0278i1();
        zzb = c0278i1;
        m5.f(C0278i1.class, c0278i1);
    }

    public static C0272h1 n() {
        return (C0272h1) zzb.i();
    }

    public static C0278i1 o(Z4 z4, g5 g5Var) {
        return (C0278i1) m5.k(zzb, z4, g5Var);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m5
    public final Object h(int i5) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new C0377z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
        }
        if (i6 == 3) {
            return new C0278i1();
        }
        if (i6 == 4) {
            return new C0272h1(zzb);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }

    public final int m() {
        return this.zze;
    }

    public final Z4 p() {
        return this.zzf;
    }
}
