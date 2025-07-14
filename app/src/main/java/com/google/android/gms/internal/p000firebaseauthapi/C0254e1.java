package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0254e1 extends m5 {
    private static final C0254e1 zzb;
    private C0266g1 zze;
    private int zzf;

    static {
        C0254e1 c0254e1 = new C0254e1();
        zzb = c0254e1;
        m5.f(C0254e1.class, c0254e1);
    }

    public static C0248d1 n() {
        return (C0248d1) zzb.i();
    }

    public static C0254e1 o(Z4 z4, g5 g5Var) {
        return (C0254e1) m5.k(zzb, z4, g5Var);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m5
    public final Object h(int i5) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new C0377z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        if (i6 == 3) {
            return new C0254e1();
        }
        if (i6 == 4) {
            return new C0248d1(zzb);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }

    public final int m() {
        return this.zzf;
    }

    public final C0266g1 p() {
        C0266g1 c0266g1 = this.zze;
        return c0266g1 == null ? C0266g1.o() : c0266g1;
    }
}
