package com.google.android.gms.internal.p000firebaseauthapi;

import A3.f;

/* loaded from: classes.dex */
public final class Z1 extends m5 {
    private static final Z1 zzb;
    private T1 zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        Z1 z1 = new Z1();
        zzb = z1;
        m5.f(Z1.class, z1);
    }

    public static Y1 p() {
        return (Y1) zzb.i();
    }

    public static void t(Z1 z1) {
        z1.zzf = f.h(2);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m5
    public final Object h(int i5) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new C0377z(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i6 == 3) {
            return new Z1();
        }
        if (i6 == 4) {
            return new Y1(zzb);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }

    public final int m() {
        return this.zzg;
    }

    public final T1 n() {
        T1 t12 = this.zze;
        return t12 == null ? T1.o() : t12;
    }

    public final int o() {
        int i5 = this.zzf;
        int i6 = 1;
        if (i5 != 0) {
            if (i5 != 1) {
                i6 = 3;
                if (i5 != 2) {
                    i6 = i5 != 3 ? 0 : 4;
                }
            } else {
                i6 = 2;
            }
        }
        if (i6 == 0) {
            return 5;
        }
        return i6;
    }

    public final int q() {
        int iD = f.d(this.zzh);
        if (iD == 0) {
            return 6;
        }
        return iD;
    }

    public final boolean v() {
        return this.zze != null;
    }
}
