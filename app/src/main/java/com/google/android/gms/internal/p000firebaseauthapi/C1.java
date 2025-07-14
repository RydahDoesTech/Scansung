package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class C1 extends m5 {
    private static final C1 zzb;
    private I1 zze;
    private C0373y1 zzf;
    private int zzg;

    static {
        C1 c12 = new C1();
        zzb = c12;
        m5.f(C1.class, c12);
    }

    public static B1 o() {
        return (B1) zzb.i();
    }

    public static C1 p() {
        return zzb;
    }

    public static void t(C1 c12, int i5) {
        if (i5 == 5) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        int i6 = 1;
        if (i5 == 1) {
            i6 = 0;
        } else if (i5 != 2) {
            i6 = 3;
            if (i5 == 3) {
                i6 = 2;
            } else if (i5 != 4) {
                if (i5 != 5) {
                    throw null;
                }
                i6 = -1;
            }
        }
        c12.zzg = i6;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m5
    public final Object h(int i5) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new C0377z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i6 == 3) {
            return new C1();
        }
        if (i6 == 4) {
            return new B1(zzb);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }

    public final int m() {
        int i5 = this.zzg;
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

    public final C0373y1 n() {
        C0373y1 c0373y1 = this.zzf;
        return c0373y1 == null ? C0373y1.n() : c0373y1;
    }

    public final I1 q() {
        I1 i12 = this.zze;
        return i12 == null ? I1.n() : i12;
    }
}
