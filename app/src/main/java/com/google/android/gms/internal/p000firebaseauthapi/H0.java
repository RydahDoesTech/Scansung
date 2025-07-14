package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class H0 {
    static {
        C0319p0[] c0319p0Arr = {new C0319p0(13, InterfaceC0235b0.class)};
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
        int i6 = C0297l2.f5550a;
        try {
            a();
        } catch (GeneralSecurityException e5) {
            throw new ExceptionInInitializerError(e5);
        }
    }

    public static void a() {
        AbstractC0283j0.f(new J0());
        AbstractC0283j0.e(new C0378z0());
        AbstractC0283j0.e(new A0(M0.class, new C0319p0[]{new C0319p0(12, InterfaceC0235b0.class)}, 5));
    }
}
