package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class O0 extends m5 {
    private static final O0 zzb;
    private int zze;
    private Q0 zzf;

    static {
        O0 o0 = new O0();
        zzb = o0;
        m5.f(O0.class, o0);
    }

    public static N0 n() {
        return (N0) zzb.i();
    }

    public static O0 o(Z4 z4, g5 g5Var) {
        return (O0) m5.k(zzb, z4, g5Var);
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
            return new O0();
        }
        if (i6 == 4) {
            return new N0(zzb);
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
        Q0 q0 = this.zzf;
        return q0 == null ? Q0.o() : q0;
    }
}
