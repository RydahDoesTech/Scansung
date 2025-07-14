package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.y1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0373y1 extends m5 {
    private static final C0373y1 zzb;
    private V1 zze;

    static {
        C0373y1 c0373y1 = new C0373y1();
        zzb = c0373y1;
        m5.f(C0373y1.class, c0373y1);
    }

    public static C0367x1 m() {
        return (C0367x1) zzb.i();
    }

    public static C0373y1 n() {
        return zzb;
    }

    public static /* synthetic */ void p(C0373y1 c0373y1, V1 v12) {
        v12.getClass();
        c0373y1.zze = v12;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m5
    public final Object h(int i5) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new C0377z(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zze"});
        }
        if (i6 == 3) {
            return new C0373y1();
        }
        if (i6 == 4) {
            return new C0367x1(zzb);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }

    public final V1 o() {
        V1 v12 = this.zze;
        return v12 == null ? V1.n() : v12;
    }
}
