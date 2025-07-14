package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class Q0 extends m5 {
    private static final Q0 zzb;
    private int zze;

    static {
        Q0 q0 = new Q0();
        zzb = q0;
        m5.f(Q0.class, q0);
    }

    public static P0 n() {
        return (P0) zzb.i();
    }

    public static Q0 o() {
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
            return new Q0();
        }
        if (i6 == 4) {
            return new P0(zzb);
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
