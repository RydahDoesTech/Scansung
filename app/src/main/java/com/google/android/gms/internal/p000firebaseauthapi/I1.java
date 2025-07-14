package com.google.android.gms.internal.p000firebaseauthapi;

import A3.f;

/* loaded from: classes.dex */
public final class I1 extends m5 {
    private static final I1 zzb;
    private int zze;
    private int zzf;
    private Z4 zzg = Z4.f5416e;

    static {
        I1 i12 = new I1();
        zzb = i12;
        m5.f(I1.class, i12);
    }

    public static H1 m() {
        return (H1) zzb.i();
    }

    public static I1 n() {
        return zzb;
    }

    public static void r(I1 i12) {
        int i5;
        switch (2) {
            case 1:
                i5 = 0;
                break;
            case 2:
                i5 = 2;
                break;
            case 3:
                i5 = 3;
                break;
            case 4:
                i5 = 4;
                break;
            case 5:
                i5 = 5;
                break;
            case 6:
                i5 = -1;
                break;
            default:
                throw null;
        }
        i12.zze = i5;
    }

    public static void s(I1 i12) {
        i12.zzf = f.i(4);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m5
    public final Object h(int i5) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new C0377z(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i6 == 3) {
            return new I1();
        }
        if (i6 == 4) {
            return new H1(zzb);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }

    public final int o() {
        int i5;
        int i6 = this.zze;
        if (i6 != 0) {
            i5 = 2;
            if (i6 != 2) {
                i5 = 3;
                if (i6 != 3) {
                    i5 = 4;
                    if (i6 != 4) {
                        i5 = 5;
                        if (i6 != 5) {
                            i5 = 0;
                        }
                    }
                }
            }
        } else {
            i5 = 1;
        }
        if (i5 == 0) {
            return 6;
        }
        return i5;
    }

    public final int p() {
        int iC = f.c(this.zzf);
        if (iC == 0) {
            return 7;
        }
        return iC;
    }

    public final Z4 q() {
        return this.zzg;
    }
}
