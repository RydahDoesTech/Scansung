package com.google.android.gms.internal.p000firebaseauthapi;

import A3.f;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.Iterator;
import k.Q0;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public final X1 f5411a;

    public Y(X1 x12) {
        this.f5411a = x12;
    }

    public static int d() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i5 = 0;
        while (i5 == 0) {
            secureRandom.nextBytes(bArr);
            i5 = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i5;
    }

    public final synchronized C0306n a() {
        C0231a2 c0231a2;
        c0231a2 = (C0231a2) this.f5411a.b();
        if (c0231a2.m() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new C0306n(4, c0231a2);
    }

    public final synchronized void b(V v2) {
        Z1 z1E;
        V1 v12 = v2.f5397a;
        synchronized (this) {
            synchronized (this) {
                z1E = e(AbstractC0283j0.a(v12), v12.o());
            }
        }
        X1 x12 = this.f5411a;
        if (x12.f) {
            x12.d();
            x12.f = false;
        }
        C0231a2.t((C0231a2) x12.f5558e, z1E);
    }

    public final synchronized void c(int i5) {
        for (int i6 = 0; i6 < ((C0231a2) this.f5411a.f5558e).m(); i6++) {
            Z1 z1P = ((C0231a2) this.f5411a.f5558e).p(i6);
            if (z1P.m() == i5) {
                if (!Q0.b(z1P.o(), 2)) {
                    StringBuilder sb = new StringBuilder(63);
                    sb.append("cannot set key as primary because it's not enabled: ");
                    sb.append(i5);
                    throw new GeneralSecurityException(sb.toString());
                }
                X1 x12 = this.f5411a;
                if (x12.f) {
                    x12.d();
                    x12.f = false;
                }
                ((C0231a2) x12.f5558e).zze = i5;
            }
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("key not found: ");
        sb2.append(i5);
        throw new GeneralSecurityException(sb2.toString());
    }

    public final synchronized Z1 e(T1 t12, int i5) {
        int iD;
        synchronized (this) {
            iD = d();
            while (f(iD)) {
                iD = d();
            }
        }
        return (Z1) y1P.b();
        if (i5 == 1) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        Y1 y1P = Z1.p();
        if (y1P.f) {
            y1P.d();
            y1P.f = false;
        }
        ((Z1) y1P.f5558e).zze = t12;
        if (y1P.f) {
            y1P.d();
            y1P.f = false;
        }
        ((Z1) y1P.f5558e).zzg = iD;
        if (y1P.f) {
            y1P.d();
            y1P.f = false;
        }
        Z1.t((Z1) y1P.f5558e);
        if (y1P.f) {
            y1P.d();
            y1P.f = false;
        }
        ((Z1) y1P.f5558e).zzh = f.b(i5);
        return (Z1) y1P.b();
    }

    public final synchronized boolean f(int i5) {
        Iterator it = Collections.unmodifiableList(((C0231a2) this.f5411a.f5558e).r()).iterator();
        while (it.hasNext()) {
            if (((Z1) it.next()).m() == i5) {
                return true;
            }
        }
        return false;
    }
}
