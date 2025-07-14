package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0360w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5658a;

    static {
        C0319p0[] c0319p0Arr = {new C0319p0(9, S.class)};
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
        f5658a = "type.googleapis.com/google.crypto.tink.AesSivKey";
        int i6 = C0297l2.f5550a;
        try {
            AbstractC0283j0.f(new C0372y0());
            AbstractC0283j0.e(new C0378z0(C0326q1.class, new C0319p0[]{new C0319p0(9, S.class)}, 5));
        } catch (GeneralSecurityException e5) {
            throw new ExceptionInInitializerError(e5);
        }
    }
}
