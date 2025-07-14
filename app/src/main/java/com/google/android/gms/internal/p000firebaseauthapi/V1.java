package com.google.android.gms.internal.p000firebaseauthapi;

import A3.f;

/* loaded from: classes.dex */
public final class V1 extends m5 {
    private static final V1 zzb;
    private String zze = "";
    private Z4 zzf = Z4.f5416e;
    private int zzg;

    static {
        V1 v12 = new V1();
        zzb = v12;
        m5.f(V1.class, v12);
    }

    public static U1 m() {
        return (U1) zzb.i();
    }

    public static V1 n() {
        return zzb;
    }

    public static /* synthetic */ void r(V1 v12, String str) {
        str.getClass();
        v12.zze = str;
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
            return new V1();
        }
        if (i6 == 4) {
            return new U1(zzb);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }

    public final int o() {
        int iD = f.d(this.zzg);
        if (iD == 0) {
            return 6;
        }
        return iD;
    }

    public final Z4 p() {
        return this.zzf;
    }

    public final String q() {
        return this.zze;
    }
}
