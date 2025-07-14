package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class U0 extends m5 {
    private static final U0 zzb;
    private Y0 zze;
    private O1 zzf;

    static {
        U0 u02 = new U0();
        zzb = u02;
        m5.f(U0.class, u02);
    }

    public static T0 m() {
        return (T0) zzb.i();
    }

    public static U0 n(Z4 z4, g5 g5Var) {
        return (U0) m5.k(zzb, z4, g5Var);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m5
    public final Object h(int i5) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new C0377z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zze", "zzf"});
        }
        if (i6 == 3) {
            return new U0();
        }
        if (i6 == 4) {
            return new T0(zzb);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }

    public final Y0 o() {
        Y0 y02 = this.zze;
        return y02 == null ? Y0.o() : y02;
    }

    public final O1 p() {
        O1 o12 = this.zzf;
        return o12 == null ? O1.o() : o12;
    }
}
