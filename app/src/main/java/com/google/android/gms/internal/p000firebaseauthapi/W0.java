package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class W0 extends m5 {
    private static final W0 zzb;
    private int zze;
    private C0230a1 zzf;
    private Z4 zzg = Z4.f5416e;

    static {
        W0 w02 = new W0();
        zzb = w02;
        m5.f(W0.class, w02);
    }

    public static V0 n() {
        return (V0) zzb.i();
    }

    public static W0 o() {
        return zzb;
    }

    public static /* synthetic */ void s(W0 w02, C0230a1 c0230a1) {
        c0230a1.getClass();
        w02.zzf = c0230a1;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m5
    public final Object h(int i5) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new C0377z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i6 == 3) {
            return new W0();
        }
        if (i6 == 4) {
            return new V0(zzb);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }

    public final int m() {
        return this.zze;
    }

    public final C0230a1 p() {
        C0230a1 c0230a1 = this.zzf;
        return c0230a1 == null ? C0230a1.o() : c0230a1;
    }

    public final Z4 q() {
        return this.zzg;
    }
}
