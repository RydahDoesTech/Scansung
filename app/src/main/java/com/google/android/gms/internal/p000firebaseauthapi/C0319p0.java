package com.google.android.gms.internal.p000firebaseauthapi;

import X0.j;
import a2.C0103a;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;
import k.Q0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0319p0 {

    /* renamed from: a, reason: collision with root package name */
    public final Class f5581a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5582b;

    public C0319p0(int i5, Class cls) {
        this.f5582b = i5;
        this.f5581a = cls;
    }

    public final Object a(U4 u4) throws GeneralSecurityException {
        switch (this.f5582b) {
            case 0:
                S0 s02 = (S0) u4;
                C0319p0[] c0319p0Arr = {new C0319p0(1, InterfaceC0380z2.class)};
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
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                W0 w0P = s02.p();
                C0319p0 c0319p02 = (C0319p0) mapUnmodifiableMap.get(InterfaceC0380z2.class);
                if (c0319p02 == null) {
                    String canonicalName = InterfaceC0380z2.class.getCanonicalName();
                    StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 41);
                    sb.append("Requested primitive class ");
                    sb.append(canonicalName);
                    sb.append(" not supported.");
                    throw new IllegalArgumentException(sb.toString());
                }
                InterfaceC0380z2 interfaceC0380z2 = (InterfaceC0380z2) c0319p02.a(w0P);
                C0319p0[] c0319p0Arr2 = {new C0319p0(13, InterfaceC0235b0.class)};
                HashMap map2 = new HashMap();
                for (int i6 = 0; i6 <= 0; i6++) {
                    C0319p0 c0319p03 = c0319p0Arr2[i6];
                    boolean zContainsKey2 = map2.containsKey(c0319p03.f5581a);
                    Class cls3 = c0319p03.f5581a;
                    if (zContainsKey2) {
                        String strValueOf2 = String.valueOf(cls3.getCanonicalName());
                        throw new IllegalArgumentException(strValueOf2.length() != 0 ? "KeyTypeManager constructed with duplicate factories for primitive ".concat(strValueOf2) : new String("KeyTypeManager constructed with duplicate factories for primitive "));
                    }
                    map2.put(cls3, c0319p03);
                }
                Class cls4 = c0319p0Arr2[0].f5581a;
                Map mapUnmodifiableMap2 = Collections.unmodifiableMap(map2);
                M1 m1Q = s02.q();
                C0319p0 c0319p04 = (C0319p0) mapUnmodifiableMap2.get(InterfaceC0235b0.class);
                if (c0319p04 != null) {
                    return new C0368x2(interfaceC0380z2, (InterfaceC0235b0) c0319p04.a(m1Q), s02.q().q().m());
                }
                String canonicalName2 = InterfaceC0235b0.class.getCanonicalName();
                StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName2).length() + 41);
                sb2.append("Requested primitive class ");
                sb2.append(canonicalName2);
                sb2.append(" not supported.");
                throw new IllegalArgumentException(sb2.toString());
            case 1:
                W0 w02 = (W0) u4;
                return new C0321p2(w02.q().r(), w02.p().m());
            case 2:
                C0242c1 c0242c1 = (C0242c1) u4;
                return new C0327q2(c0242c1.q().r(), c0242c1.p().m());
            case 3:
                return new C0332r2(((C0278i1) u4).p().r());
            case 4:
                return new C0354v0(((C0302m1) u4).p().r());
            case 5:
                return new C0356v2(((C0349u1) u4).p().r(), 0);
            case 6:
                String strO = ((C0267g2) u4).p().o();
                return AbstractC0229a0.a(strO).a(strO);
            case 7:
                C0285j2 c0285j2 = (C0285j2) u4;
                String strP = c0285j2.p().p();
                return new C0342t0(c0285j2.p().m(), AbstractC0229a0.a(strP).a(strP));
            case 8:
                return new C0356v2(((C0309n2) u4).p().r(), 1);
            case 9:
                return new C0338s2(((C0326q1) u4).p().r());
            case 10:
                E1 e12 = (E1) u4;
                C1 c1N = e12.p().n();
                I1 i1Q = c1N.q();
                return new C0362w2((ECPrivateKey) ((KeyFactory) C0374y2.f5693i.a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, e12.q().r()), AbstractC0335s.O(AbstractC0335s.x(i1Q.o())))), i1Q.q().r(), AbstractC0335s.g(i1Q.p()), AbstractC0335s.D(c1N.m()), new C0103a(c1N.n().o()));
            case 11:
                G1 g12 = (G1) u4;
                C1 c1N2 = g12.n();
                I1 i1Q2 = c1N2.q();
                int iX = AbstractC0335s.x(i1Q2.o());
                byte[] bArrR = g12.r().r();
                byte[] bArrR2 = g12.s().r();
                ECParameterSpec eCParameterSpecO = AbstractC0335s.O(iX);
                ECPoint eCPoint = new ECPoint(new BigInteger(1, bArrR), new BigInteger(1, bArrR2));
                AbstractC0335s.G(eCPoint, eCParameterSpecO.getCurve());
                ECPublicKey eCPublicKey = (ECPublicKey) ((KeyFactory) C0374y2.f5693i.a("EC")).generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpecO));
                new C0103a(c1N2.n().o());
                i1Q2.q().r();
                AbstractC0335s.g(i1Q2.p());
                AbstractC0335s.D(c1N2.m());
                M m4 = new M(3);
                AbstractC0335s.G(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
                return m4;
            case 12:
                M0 m0 = (M0) u4;
                return new C2(new A2(m0.q().r()), m0.p().m());
            default:
                M1 m12 = (M1) u4;
                int iN = m12.q().n();
                SecretKeySpec secretKeySpec = new SecretKeySpec(m12.r().r(), "HMAC");
                int iM = m12.q().m();
                int iC = Q0.c(iN);
                if (iC == 1) {
                    return new C2(new j("HMACSHA1", secretKeySpec), iM);
                }
                if (iC == 2) {
                    return new C2(new j("HMACSHA384", secretKeySpec), iM);
                }
                if (iC == 3) {
                    return new C2(new j("HMACSHA256", secretKeySpec), iM);
                }
                if (iC == 4) {
                    return new C2(new j("HMACSHA512", secretKeySpec), iM);
                }
                if (iC == 5) {
                    return new C2(new j("HMACSHA224", secretKeySpec), iM);
                }
                throw new GeneralSecurityException("unknown hash");
        }
    }
}
