package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.h2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0273h2 extends m5 {
    private static final C0273h2 zzb;
    private String zze = "";

    static {
        C0273h2 c0273h2 = new C0273h2();
        zzb = c0273h2;
        m5.f(C0273h2.class, c0273h2);
    }

    public static C0273h2 m() {
        return zzb;
    }

    public static C0273h2 n(Z4 z4, g5 g5Var) {
        return (C0273h2) m5.k(zzb, z4, g5Var);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m5
    public final Object h(int i5) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new C0377z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
        }
        if (i6 == 3) {
            return new C0273h2();
        }
        if (i6 == 4) {
            return new C0355v1(zzb);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }

    public final String o() {
        return this.zze;
    }
}
