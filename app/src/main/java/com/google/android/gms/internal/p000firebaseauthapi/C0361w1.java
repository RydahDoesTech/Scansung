package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.w1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0361w1 extends m5 {
    private static final C0361w1 zzb;

    static {
        C0361w1 c0361w1 = new C0361w1();
        zzb = c0361w1;
        m5.f(C0361w1.class, c0361w1);
    }

    public static C0361w1 m() {
        return zzb;
    }

    public static C0361w1 n(Z4 z4, g5 g5Var) {
        return (C0361w1) m5.k(zzb, z4, g5Var);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m5
    public final Object h(int i5) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new C0377z(zzb, "\u0000\u0000", null);
        }
        if (i6 == 3) {
            return new C0361w1();
        }
        if (i6 == 4) {
            return new C0355v1(zzb);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }
}
