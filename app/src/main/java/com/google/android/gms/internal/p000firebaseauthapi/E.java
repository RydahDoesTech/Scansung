package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class E {
    public static /* bridge */ int a(D d5) {
        return d5.a();
    }

    public static /* bridge */ D b(Object obj) {
        return ((m5) obj).zzc;
    }

    public static /* bridge */ D c() {
        return D.b();
    }

    public static boolean d(Object obj, b5 b5Var) throws C0258f {
        int i5 = b5Var.f5438a;
        int i6 = i5 >>> 3;
        int i7 = i5 & 7;
        a5 a5Var = (a5) b5Var.f5441d;
        if (i7 == 0) {
            b5Var.s(0);
            ((D) obj).c(i6 << 3, Long.valueOf(a5Var.h()));
            return true;
        }
        if (i7 == 1) {
            b5Var.s(1);
            ((D) obj).c((i6 << 3) | 1, Long.valueOf(a5Var.g()));
            return true;
        }
        if (i7 == 2) {
            ((D) obj).c((i6 << 3) | 2, b5Var.u());
            return true;
        }
        if (i7 != 3) {
            if (i7 == 4) {
                return false;
            }
            if (i7 != 5) {
                throw C0258f.a();
            }
            b5Var.s(5);
            ((D) obj).c((i6 << 3) | 5, Integer.valueOf(a5Var.d()));
            return true;
        }
        D dB = D.b();
        int i8 = i6 << 3;
        int i9 = i8 | 4;
        while (b5Var.t() != Integer.MAX_VALUE && d(dB, b5Var)) {
        }
        if (i9 != b5Var.f5438a) {
            throw new C0258f("Protocol message end-group tag did not match expected tag.");
        }
        dB.f5287e = false;
        ((D) obj).c(i8 | 3, dB);
        return true;
    }

    public static /* bridge */ void e(D d5, C0306n c0306n) {
        d5.d(c0306n);
    }
}
