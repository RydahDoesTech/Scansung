package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class T1 extends m5 {
    private static final T1 zzb;
    private String zze = "";
    private Z4 zzf = Z4.f5416e;
    private int zzg;

    static {
        T1 t12 = new T1();
        zzb = t12;
        m5.f(T1.class, t12);
    }

    public static S1 m() {
        return (S1) zzb.i();
    }

    public static T1 o() {
        return zzb;
    }

    public static void t(T1 t12, int i5) {
        int i6;
        if (i5 == 6) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        switch (i5) {
            case 1:
                i6 = 0;
                break;
            case 2:
                i6 = 1;
                break;
            case 3:
                i6 = 2;
                break;
            case 4:
                i6 = 3;
                break;
            case 5:
                i6 = 4;
                break;
            case 6:
                i6 = -1;
                break;
            default:
                throw null;
        }
        t12.zzg = i6;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m5
    public final Object h(int i5) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new C0377z(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
        }
        if (i6 == 3) {
            return new T1();
        }
        if (i6 == 4) {
            return new S1(zzb);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0014 A[PHI: r1
  0x0014: PHI (r1v1 int) = (r1v0 int), (r1v2 int) binds: [B:5:0x0006, B:9:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int n() {
        /*
            r2 = this;
            int r2 = r2.zzg
            r0 = 1
            if (r2 == 0) goto L15
            r1 = 2
            if (r2 == r0) goto L14
            r0 = 3
            if (r2 == r1) goto L15
            r1 = 4
            if (r2 == r0) goto L14
            if (r2 == r1) goto L12
            r0 = 0
            goto L15
        L12:
            r0 = 5
            goto L15
        L14:
            r0 = r1
        L15:
            if (r0 != 0) goto L19
            r2 = 6
            return r2
        L19:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.T1.n():int");
    }

    public final Z4 p() {
        return this.zzf;
    }

    public final String q() {
        return this.zze;
    }
}
