package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.k2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0291k2 extends m5 {
    private static final C0291k2 zzb;
    private String zze = "";
    private V1 zzf;

    static {
        C0291k2 c0291k2 = new C0291k2();
        zzb = c0291k2;
        m5.f(C0291k2.class, c0291k2);
    }

    public static C0291k2 n() {
        return zzb;
    }

    public static C0291k2 o(Z4 z4, g5 g5Var) {
        return (C0291k2) m5.k(zzb, z4, g5Var);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m5
    public final Object h(int i5) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new C0377z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zze", "zzf"});
        }
        if (i6 == 3) {
            return new C0291k2();
        }
        if (i6 == 4) {
            return new C0355v1(zzb);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }

    public final V1 m() {
        V1 v12 = this.zzf;
        return v12 == null ? V1.n() : v12;
    }

    public final String p() {
        return this.zze;
    }

    public final boolean q() {
        return this.zzf != null;
    }
}
