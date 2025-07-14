package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class Y0 extends m5 {
    private static final Y0 zzb;
    private C0230a1 zze;
    private int zzf;

    static {
        Y0 y02 = new Y0();
        zzb = y02;
        m5.f(Y0.class, y02);
    }

    public static X0 n() {
        return (X0) zzb.i();
    }

    public static Y0 o() {
        return zzb;
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
            return new Y0();
        }
        if (i6 == 4) {
            return new X0(zzb);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }

    public final int m() {
        return this.zzf;
    }

    public final C0230a1 p() {
        C0230a1 c0230a1 = this.zze;
        return c0230a1 == null ? C0230a1.o() : c0230a1;
    }
}
