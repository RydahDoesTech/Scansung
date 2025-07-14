package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.j2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0285j2 extends m5 {
    private static final C0285j2 zzb;
    private int zze;
    private C0291k2 zzf;

    static {
        C0285j2 c0285j2 = new C0285j2();
        zzb = c0285j2;
        m5.f(C0285j2.class, c0285j2);
    }

    public static C0279i2 n() {
        return (C0279i2) zzb.i();
    }

    public static C0285j2 o(Z4 z4, g5 g5Var) {
        return (C0285j2) m5.k(zzb, z4, g5Var);
    }

    public static /* synthetic */ void r(C0285j2 c0285j2, C0291k2 c0291k2) {
        c0291k2.getClass();
        c0285j2.zzf = c0291k2;
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
            return new C0285j2();
        }
        if (i6 == 4) {
            return new C0279i2(zzb);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }

    public final int m() {
        return this.zze;
    }

    public final C0291k2 p() {
        C0291k2 c0291k2 = this.zzf;
        return c0291k2 == null ? C0291k2.n() : c0291k2;
    }
}
