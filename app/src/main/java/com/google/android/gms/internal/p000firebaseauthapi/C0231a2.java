package com.google.android.gms.internal.p000firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.a2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0231a2 extends m5 {
    private static final C0231a2 zzb;
    private int zze;
    private InterfaceC0240c zzf = C0371y.f5684g;

    static {
        C0231a2 c0231a2 = new C0231a2();
        zzb = c0231a2;
        m5.f(C0231a2.class, c0231a2);
    }

    public static X1 o() {
        return (X1) zzb.i();
    }

    public static C0231a2 q(byte[] bArr, g5 g5Var) {
        return (C0231a2) m5.l(zzb, bArr, g5Var);
    }

    public static void t(C0231a2 c0231a2, Z1 z1) {
        InterfaceC0240c interfaceC0240c = c0231a2.zzf;
        if (!((V4) interfaceC0240c).f5400d) {
            int size = interfaceC0240c.size();
            c0231a2.zzf = interfaceC0240c.d(size == 0 ? 10 : size + size);
        }
        c0231a2.zzf.add(z1);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m5
    public final Object h(int i5) {
        int i6 = i5 - 1;
        if (i6 == 0) {
            return (byte) 1;
        }
        if (i6 == 2) {
            return new C0377z(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", Z1.class});
        }
        if (i6 == 3) {
            return new C0231a2();
        }
        if (i6 == 4) {
            return new X1(zzb);
        }
        if (i6 != 5) {
            return null;
        }
        return zzb;
    }

    public final int m() {
        return this.zzf.size();
    }

    public final int n() {
        return this.zze;
    }

    public final Z1 p(int i5) {
        return (Z1) this.zzf.get(i5);
    }

    public final InterfaceC0240c r() {
        return this.zzf;
    }
}
