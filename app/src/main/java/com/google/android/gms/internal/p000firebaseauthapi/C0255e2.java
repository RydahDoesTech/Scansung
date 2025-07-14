package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.e2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0255e2 extends m5 {
    private static final C0255e2 zzb;
    private int zze;
    private InterfaceC0240c zzf = C0371y.f5684g;

    static {
        C0255e2 c0255e2 = new C0255e2();
        zzb = c0255e2;
        m5.f(C0255e2.class, c0255e2);
    }

    public static C0237b2 m() {
        return (C0237b2) zzb.i();
    }

    public static void p(C0255e2 c0255e2, C0249d2 c0249d2) {
        InterfaceC0240c interfaceC0240c = c0255e2.zzf;
        if (!((V4) interfaceC0240c).f5400d) {
            int size = interfaceC0240c.size();
            c0255e2.zzf = interfaceC0240c.d(size == 0 ? 10 : size + size);
        }
        c0255e2.zzf.add(c0249d2);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m5
    public final Object h(int i5) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new C0377z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", C0249d2.class});
        }
        if (i6 == 3) {
            return new C0255e2();
        }
        if (i6 == 4) {
            return new C0237b2(zzb);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }

    public final C0249d2 n() {
        return (C0249d2) this.zzf.get(0);
    }
}
