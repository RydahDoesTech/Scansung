package com.google.android.gms.internal.p000firebaseauthapi;

import A3.f;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.d2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0249d2 extends m5 {
    private static final C0249d2 zzb;
    private String zze = "";
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        C0249d2 c0249d2 = new C0249d2();
        zzb = c0249d2;
        m5.f(C0249d2.class, c0249d2);
    }

    public static C0243c2 n() {
        return (C0243c2) zzb.i();
    }

    public static /* synthetic */ void o(C0249d2 c0249d2, String str) {
        str.getClass();
        c0249d2.zze = str;
    }

    public static void q(C0249d2 c0249d2, int i5) {
        if (i5 == 5) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        c0249d2.zzf = f.h(i5);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m5
    public final Object h(int i5) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new C0377z(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
        }
        if (i6 == 3) {
            return new C0249d2();
        }
        if (i6 == 4) {
            return new C0243c2(zzb);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }

    public final int m() {
        return this.zzg;
    }
}
