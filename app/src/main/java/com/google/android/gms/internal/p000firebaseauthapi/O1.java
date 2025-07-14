package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class O1 extends m5 {
    private static final O1 zzb;
    private Q1 zze;
    private int zzf;
    private int zzg;

    static {
        O1 o12 = new O1();
        zzb = o12;
        m5.f(O1.class, o12);
    }

    public static N1 n() {
        return (N1) zzb.i();
    }

    public static O1 o() {
        return zzb;
    }

    public static O1 p(Z4 z4, g5 g5Var) {
        return (O1) m5.k(zzb, z4, g5Var);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m5
    public final Object h(int i5) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new C0377z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i6 == 3) {
            return new O1();
        }
        if (i6 == 4) {
            return new N1(zzb);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }

    public final int m() {
        return this.zzf;
    }

    public final Q1 q() {
        Q1 q12 = this.zze;
        return q12 == null ? Q1.p() : q12;
    }
}
