package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0295l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5548a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f5549b;

    static {
        C0319p0[] c0319p0Arr = {new C0319p0(0, Q.class)};
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
        f5548a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        C0319p0[] c0319p0Arr2 = {new C0319p0(3, Q.class)};
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
        f5549b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        C0319p0[] c0319p0Arr3 = {new C0319p0(4, Q.class)};
        HashMap map3 = new HashMap();
        for (int i7 = 0; i7 <= 0; i7++) {
            C0319p0 c0319p03 = c0319p0Arr3[i7];
            boolean zContainsKey3 = map3.containsKey(c0319p03.f5581a);
            Class cls5 = c0319p03.f5581a;
            if (zContainsKey3) {
                String strValueOf3 = String.valueOf(cls5.getCanonicalName());
                throw new IllegalArgumentException(strValueOf3.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(strValueOf3) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            }
            map3.put(cls5, c0319p03);
        }
        Class cls6 = c0319p0Arr3[0].f5581a;
        Collections.unmodifiableMap(map3);
        C0319p0[] c0319p0Arr4 = {new C0319p0(2, Q.class)};
        HashMap map4 = new HashMap();
        for (int i8 = 0; i8 <= 0; i8++) {
            C0319p0 c0319p04 = c0319p0Arr4[i8];
            boolean zContainsKey4 = map4.containsKey(c0319p04.f5581a);
            Class cls7 = c0319p04.f5581a;
            if (zContainsKey4) {
                String strValueOf4 = String.valueOf(cls7.getCanonicalName());
                throw new IllegalArgumentException(strValueOf4.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(strValueOf4) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            }
            map4.put(cls7, c0319p04);
        }
        Class cls8 = c0319p0Arr4[0].f5581a;
        Collections.unmodifiableMap(map4);
        C0319p0[] c0319p0Arr5 = {new C0319p0(6, Q.class)};
        HashMap map5 = new HashMap();
        for (int i9 = 0; i9 <= 0; i9++) {
            C0319p0 c0319p05 = c0319p0Arr5[i9];
            boolean zContainsKey5 = map5.containsKey(c0319p05.f5581a);
            Class cls9 = c0319p05.f5581a;
            if (zContainsKey5) {
                String strValueOf5 = String.valueOf(cls9.getCanonicalName());
                throw new IllegalArgumentException(strValueOf5.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(strValueOf5) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            }
            map5.put(cls9, c0319p05);
        }
        Class cls10 = c0319p0Arr5[0].f5581a;
        Collections.unmodifiableMap(map5);
        C0319p0[] c0319p0Arr6 = {new C0319p0(7, Q.class)};
        HashMap map6 = new HashMap();
        for (int i10 = 0; i10 <= 0; i10++) {
            C0319p0 c0319p06 = c0319p0Arr6[i10];
            boolean zContainsKey6 = map6.containsKey(c0319p06.f5581a);
            Class cls11 = c0319p06.f5581a;
            if (zContainsKey6) {
                String strValueOf6 = String.valueOf(cls11.getCanonicalName());
                throw new IllegalArgumentException(strValueOf6.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(strValueOf6) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            }
            map6.put(cls11, c0319p06);
        }
        Class cls12 = c0319p0Arr6[0].f5581a;
        Collections.unmodifiableMap(map6);
        C0319p0[] c0319p0Arr7 = {new C0319p0(5, Q.class)};
        HashMap map7 = new HashMap();
        for (int i11 = 0; i11 <= 0; i11++) {
            C0319p0 c0319p07 = c0319p0Arr7[i11];
            boolean zContainsKey7 = map7.containsKey(c0319p07.f5581a);
            Class cls13 = c0319p07.f5581a;
            if (zContainsKey7) {
                String strValueOf7 = String.valueOf(cls13.getCanonicalName());
                throw new IllegalArgumentException(strValueOf7.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(strValueOf7) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            }
            map7.put(cls13, c0319p07);
        }
        Class cls14 = c0319p0Arr7[0].f5581a;
        Collections.unmodifiableMap(map7);
        C0319p0[] c0319p0Arr8 = {new C0319p0(8, Q.class)};
        HashMap map8 = new HashMap();
        for (int i12 = 0; i12 <= 0; i12++) {
            C0319p0 c0319p08 = c0319p0Arr8[i12];
            boolean zContainsKey8 = map8.containsKey(c0319p08.f5581a);
            Class cls15 = c0319p08.f5581a;
            if (zContainsKey8) {
                String strValueOf8 = String.valueOf(cls15.getCanonicalName());
                throw new IllegalArgumentException(strValueOf8.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(strValueOf8) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
            }
            map8.put(cls15, c0319p08);
        }
        Class cls16 = c0319p0Arr8[0].f5581a;
        Collections.unmodifiableMap(map8);
        int i13 = C0297l2.f5550a;
        try {
            a();
        } catch (GeneralSecurityException e5) {
            throw new ExceptionInInitializerError(e5);
        }
    }

    public static void a() throws NoSuchPaddingException, NoSuchAlgorithmException {
        AbstractC0283j0.f(new C0313o0());
        H0.a();
        AbstractC0283j0.e(new C0378z0(S0.class, new C0319p0[]{new C0319p0(0, Q.class)}, 1));
        AbstractC0283j0.e(new C0378z0(C0278i1.class, new C0319p0[]{new C0319p0(3, Q.class)}, 2));
        AbstractC0283j0.e(new A0(C0242c1.class, new C0319p0[]{new C0319p0(2, Q.class)}, 1));
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            AbstractC0283j0.e(new A0(C0302m1.class, new C0319p0[]{new C0319p0(4, Q.class)}, 2));
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
        AbstractC0283j0.e(new C0378z0(C0349u1.class, new C0319p0[]{new C0319p0(5, Q.class)}, 3));
        AbstractC0283j0.e(new A0(C0267g2.class, new C0319p0[]{new C0319p0(6, Q.class)}, 3));
        AbstractC0283j0.e(new C0378z0(C0285j2.class, new C0319p0[]{new C0319p0(7, Q.class)}, 4));
        AbstractC0283j0.e(new A0(C0309n2.class, new C0319p0[]{new C0319p0(8, Q.class)}, 4));
    }
}
