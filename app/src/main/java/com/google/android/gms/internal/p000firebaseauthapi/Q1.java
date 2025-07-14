package com.google.android.gms.internal.p000firebaseauthapi;

import A3.f;

/* loaded from: classes.dex */
public final class Q1 extends m5 {
    private static final Q1 zzb;
    private int zze;
    private int zzf;

    static {
        Q1 q12 = new Q1();
        zzb = q12;
        m5.f(Q1.class, q12);
    }

    public static P1 o() {
        return (P1) zzb.i();
    }

    public static Q1 p() {
        return zzb;
    }

    public static void q(Q1 q12, int i5) {
        if (i5 == 7) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        q12.zze = f.i(i5);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m5
    public final Object h(int i5) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new C0377z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
        }
        if (i6 == 3) {
            return new Q1();
        }
        if (i6 == 4) {
            return new P1(zzb);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }

    public final int m() {
        return this.zzf;
    }

    public final int n() {
        int iC = f.c(this.zze);
        if (iC == 0) {
            return 7;
        }
        return iC;
    }
}
