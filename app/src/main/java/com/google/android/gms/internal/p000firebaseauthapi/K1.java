package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class K1 extends m5 {
    private static final K1 zzb;
    private Z4 zze = Z4.f5416e;
    private C0255e2 zzf;

    static {
        K1 k12 = new K1();
        zzb = k12;
        m5.f(K1.class, k12);
    }

    public static J1 m() {
        return (J1) zzb.i();
    }

    public static K1 n(byte[] bArr, g5 g5Var) {
        return (K1) m5.l(zzb, bArr, g5Var);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m5
    public final Object h(int i5) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new C0377z(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"zze", "zzf"});
        }
        if (i6 == 3) {
            return new K1();
        }
        if (i6 == 4) {
            return new J1(zzb);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }

    public final Z4 o() {
        return this.zze;
    }
}
