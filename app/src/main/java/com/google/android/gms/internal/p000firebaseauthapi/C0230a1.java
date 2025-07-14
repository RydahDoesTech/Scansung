package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0230a1 extends m5 {
    private static final C0230a1 zzb;
    private int zze;

    static {
        C0230a1 c0230a1 = new C0230a1();
        zzb = c0230a1;
        m5.f(C0230a1.class, c0230a1);
    }

    public static Z0 n() {
        return (Z0) zzb.i();
    }

    public static C0230a1 o() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m5
    public final Object h(int i5) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new C0377z(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        }
        if (i6 == 3) {
            return new C0230a1();
        }
        if (i6 == 4) {
            return new Z0(zzb);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }

    public final int m() {
        return this.zze;
    }
}
