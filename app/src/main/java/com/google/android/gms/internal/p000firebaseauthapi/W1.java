package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class W1 extends m5 {
    private static final W1 zzb;
    private int zzg;
    private boolean zzh;
    private String zze = "";
    private String zzf = "";
    private String zzi = "";

    static {
        W1 w12 = new W1();
        zzb = w12;
        m5.f(W1.class, w12);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m5
    public final Object h(int i5) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new C0377z(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i6 == 3) {
            return new W1();
        }
        if (i6 == 4) {
            return new C0355v1(zzb);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }
}
