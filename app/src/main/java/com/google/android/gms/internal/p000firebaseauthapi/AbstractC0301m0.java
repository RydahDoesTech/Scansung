package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0301m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final V1 f5560a = c(16);

    /* renamed from: b, reason: collision with root package name */
    public static final V1 f5561b;

    static {
        c(32);
        b(16);
        b(32);
        f5561b = a(16, 16);
        a(32, 32);
        U1 u1M = V1.m();
        C0319p0[] c0319p0Arr = {new C0319p0(5, Q.class)};
        HashMap map = new HashMap();
        for (int i5 = 0; i5 <= 0; i5++) {
            C0319p0 c0319p0 = c0319p0Arr[i5];
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
        u1M.f("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        u1M.e(2);
        U1 u1M2 = V1.m();
        C0319p0[] c0319p0Arr2 = {new C0319p0(8, Q.class)};
        HashMap map2 = new HashMap();
        for (int i6 = 0; i6 <= 0; i6++) {
            C0319p0 c0319p02 = c0319p0Arr2[i6];
            boolean zContainsKey2 = map2.containsKey(c0319p02.f5581a);
            Class cls3 = c0319p02.f5581a;
            if (zContainsKey2) {
                String strValueOf2 = String.valueOf(cls3.getCanonicalName());
                throw new IllegalArgumentException(strValueOf2.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(strValueOf2) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            }
            map2.put(cls3, c0319p02);
        }
        Class cls4 = c0319p0Arr2[0].f5581a;
        Collections.unmodifiableMap(map2);
        u1M2.f("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        u1M2.e(2);
    }

    public static V1 a(int i5, int i6) {
        X0 x0N = Y0.n();
        Z0 z0N = C0230a1.n();
        if (z0N.f) {
            z0N.d();
            z0N.f = false;
        }
        ((C0230a1) z0N.f5558e).zze = 16;
        C0230a1 c0230a1 = (C0230a1) z0N.b();
        if (x0N.f) {
            x0N.d();
            x0N.f = false;
        }
        ((Y0) x0N.f5558e).zze = c0230a1;
        if (x0N.f) {
            x0N.d();
            x0N.f = false;
        }
        ((Y0) x0N.f5558e).zzf = i5;
        Y0 y02 = (Y0) x0N.b();
        N1 n1N = O1.n();
        P1 p1O = Q1.o();
        p1O.e(4);
        p1O.f(i6);
        n1N.f((Q1) p1O.b());
        n1N.e(32);
        O1 o12 = (O1) n1N.b();
        T0 t0M = U0.m();
        if (t0M.f) {
            t0M.d();
            t0M.f = false;
        }
        ((U0) t0M.f5558e).zze = y02;
        if (t0M.f) {
            t0M.d();
            t0M.f = false;
        }
        ((U0) t0M.f5558e).zzf = o12;
        U0 u02 = (U0) t0M.b();
        U1 u1M = V1.m();
        u1M.g(u02.b());
        C0319p0[] c0319p0Arr = {new C0319p0(0, Q.class)};
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
        u1M.f("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        u1M.e(2);
        return (V1) u1M.b();
    }

    public static void b(int i5) {
        C0248d1 c0248d1N = C0254e1.n();
        if (c0248d1N.f) {
            c0248d1N.d();
            c0248d1N.f = false;
        }
        ((C0254e1) c0248d1N.f5558e).zzf = i5;
        C0260f1 c0260f1N = C0266g1.n();
        if (c0260f1N.f) {
            c0260f1N.d();
            c0260f1N.f = false;
        }
        ((C0266g1) c0260f1N.f5558e).zze = 16;
        C0266g1 c0266g1 = (C0266g1) c0260f1N.b();
        if (c0248d1N.f) {
            c0248d1N.d();
            c0248d1N.f = false;
        }
        ((C0254e1) c0248d1N.f5558e).zze = c0266g1;
        C0254e1 c0254e1 = (C0254e1) c0248d1N.b();
        U1 u1M = V1.m();
        u1M.g(c0254e1.b());
        C0319p0[] c0319p0Arr = {new C0319p0(2, Q.class)};
        HashMap map = new HashMap();
        for (int i6 = 0; i6 <= 0; i6++) {
            C0319p0 c0319p0 = c0319p0Arr[i6];
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
        u1M.f("type.googleapis.com/google.crypto.tink.AesEaxKey");
        u1M.e(2);
    }

    public static V1 c(int i5) {
        C0284j1 c0284j1N = C0290k1.n();
        if (c0284j1N.f) {
            c0284j1N.d();
            c0284j1N.f = false;
        }
        ((C0290k1) c0284j1N.f5558e).zze = i5;
        C0290k1 c0290k1 = (C0290k1) c0284j1N.b();
        U1 u1M = V1.m();
        u1M.g(c0290k1.b());
        C0319p0[] c0319p0Arr = {new C0319p0(3, Q.class)};
        HashMap map = new HashMap();
        for (int i6 = 0; i6 <= 0; i6++) {
            C0319p0 c0319p0 = c0319p0Arr[i6];
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
        u1M.f("type.googleapis.com/google.crypto.tink.AesGcmKey");
        u1M.e(2);
        return (V1) u1M.b();
    }
}
