package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class F0 {

    /* renamed from: a, reason: collision with root package name */
    public static final V1 f5297a;

    static {
        byte[] bArr = new byte[0];
        V1 v12 = AbstractC0301m0.f5560a;
        f5297a = a(2, v12, 2, bArr);
        a(3, v12, 4, bArr);
        a(2, AbstractC0301m0.f5561b, 2, bArr);
    }

    public static V1 a(int i5, V1 v12, int i6, byte[] bArr) {
        C0379z1 c0379z1M = A1.m();
        H1 h1M = I1.m();
        if (h1M.f) {
            h1M.d();
            h1M.f = false;
        }
        I1.r((I1) h1M.f5558e);
        if (h1M.f) {
            h1M.d();
            h1M.f = false;
        }
        I1.s((I1) h1M.f5558e);
        Y4 y4Q = Z4.q(bArr, 0, bArr.length);
        if (h1M.f) {
            h1M.d();
            h1M.f = false;
        }
        ((I1) h1M.f5558e).zzg = y4Q;
        I1 i12 = (I1) h1M.b();
        C0367x1 c0367x1M = C0373y1.m();
        if (c0367x1M.f) {
            c0367x1M.d();
            c0367x1M.f = false;
        }
        C0373y1.p((C0373y1) c0367x1M.f5558e, v12);
        C0373y1 c0373y1 = (C0373y1) c0367x1M.b();
        B1 b1O = C1.o();
        if (b1O.f) {
            b1O.d();
            b1O.f = false;
        }
        ((C1) b1O.f5558e).zze = i12;
        if (b1O.f) {
            b1O.d();
            b1O.f = false;
        }
        ((C1) b1O.f5558e).zzf = c0373y1;
        if (b1O.f) {
            b1O.d();
            b1O.f = false;
        }
        C1.t((C1) b1O.f5558e, i5);
        C1 c12 = (C1) b1O.b();
        if (c0379z1M.f) {
            c0379z1M.d();
            c0379z1M.f = false;
        }
        ((A1) c0379z1M.f5558e).zze = c12;
        A1 a12 = (A1) c0379z1M.b();
        U1 u1M = V1.m();
        C0319p0[] c0319p0Arr = {new C0319p0(10, T.class)};
        HashMap map = new HashMap();
        for (int i7 = 0; i7 <= 0; i7++) {
            C0319p0 c0319p0 = c0319p0Arr[i7];
            boolean zContainsKey = map.containsKey(c0319p0.f5581a);
            Class cls = c0319p0.f5581a;
            if (zContainsKey) {
                String strValueOf = String.valueOf(cls.getCanonicalName());
                throw new IllegalArgumentException(strValueOf.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(strValueOf) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            }
            map.put(cls, c0319p0);
        }
        Class cls2 = c0319p0Arr[0].f5581a;
        Collections.unmodifiableMap(map);
        u1M.f("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        u1M.e(i6);
        u1M.g(a12.b());
        return (V1) u1M.b();
    }
}
