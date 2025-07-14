package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* loaded from: classes.dex */
public abstract class B0 {
    static {
        C0319p0[] c0319p0Arr = {new C0319p0(11, M.class)};
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
        C0319p0[] c0319p0Arr2 = {new C0319p0(10, T.class)};
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
        int i7 = C0297l2.f5550a;
        try {
            a();
        } catch (GeneralSecurityException e5) {
            throw new ExceptionInInitializerError(e5);
        }
    }

    public static void a() {
        Class clsC;
        AbstractC0283j0.f(new D0());
        AbstractC0283j0.f(new E0());
        AbstractC0295l0.a();
        C0378z0 c0378z0 = new C0378z0(E1.class, new C0319p0[]{new C0319p0(10, T.class)}, 0);
        A0 a02 = new A0(G1.class, new C0319p0[]{new C0319p0(11, M.class)}, 0);
        synchronized (AbstractC0283j0.class) {
            try {
                AbstractC0283j0.i("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", C0378z0.class, c0378z0.n().c(), true);
                AbstractC0283j0.i("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", A0.class, Collections.emptyMap(), false);
                ConcurrentHashMap concurrentHashMap = AbstractC0283j0.f5523b;
                if (concurrentHashMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") && (clsC = ((InterfaceC0277i0) concurrentHashMap.get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")).c()) != null && !clsC.getName().equals(A0.class.getName())) {
                    AbstractC0283j0.f5522a.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey with inconsistent public key type type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
                    throw new GeneralSecurityException("public key manager corresponding to " + C0378z0.class.getName() + " is already registered with " + clsC.getName() + ", cannot be re-registered with " + A0.class.getName());
                }
                if (!concurrentHashMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey") || ((InterfaceC0277i0) concurrentHashMap.get("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")).c() == null) {
                    concurrentHashMap.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new C0271h0(c0378z0, a02));
                    AbstractC0283j0.f5524c.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", new M(1));
                    AbstractC0283j0.j("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", c0378z0.n().c());
                }
                ConcurrentHashMap concurrentHashMap2 = AbstractC0283j0.f5525d;
                concurrentHashMap2.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", Boolean.TRUE);
                if (!concurrentHashMap.containsKey("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                    concurrentHashMap.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", new C0265g0(a02));
                }
                concurrentHashMap2.put("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", Boolean.FALSE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
