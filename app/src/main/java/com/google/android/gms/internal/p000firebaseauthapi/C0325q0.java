package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0325q0 extends X {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5595b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0325q0(int i5, Class cls) {
        super(cls);
        this.f5595b = i5;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.X
    public final /* bridge */ /* synthetic */ U4 a(Z4 z4) {
        switch (this.f5595b) {
            case 0:
                return U0.n(z4, g5.a());
            case 1:
                return C0254e1.o(z4, g5.a());
            case 2:
                return C0290k1.o(z4, g5.a());
            case 3:
                return C0314o1.o(z4, g5.a());
            case 4:
                return C0361w1.n(z4, g5.a());
            case 5:
                return C0273h2.n(z4, g5.a());
            case 6:
                return C0291k2.o(z4, g5.a());
            case 7:
                return C0315o2.n(z4, g5.a());
            case 8:
                return C0337s1.o(z4, g5.a());
            case 9:
                return A1.n(z4, g5.a());
            case 10:
                return O0.o(z4, g5.a());
            default:
                return O1.p(z4, g5.a());
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.X
    public final Object b(U4 u4) throws InvalidAlgorithmParameterException {
        switch (this.f5595b) {
            case 0:
                U0 u02 = (U0) u4;
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
                Collections.unmodifiableMap(map);
                Y0 y0O = u02.o();
                V0 v0N = W0.n();
                C0230a1 c0230a1P = y0O.p();
                if (v0N.f) {
                    v0N.d();
                    v0N.f = false;
                }
                W0.s((W0) v0N.f5558e, c0230a1P);
                byte[] bArrA = D2.a(y0O.m());
                Y4 y4Q = Z4.q(bArrA, 0, bArrA.length);
                if (v0N.f) {
                    v0N.d();
                    v0N.f = false;
                }
                ((W0) v0N.f5558e).zzg = y4Q;
                if (v0N.f) {
                    v0N.d();
                    v0N.f = false;
                }
                ((W0) v0N.f5558e).zze = 0;
                W0 w02 = (W0) v0N.b();
                C0319p0[] c0319p0Arr2 = {new C0319p0(13, InterfaceC0235b0.class)};
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
                Object objB = new C0325q0(11, O1.class).b(u02.p());
                R0 r0N = S0.n();
                if (r0N.f) {
                    r0N.d();
                    r0N.f = false;
                }
                ((S0) r0N.f5558e).zzf = w02;
                M1 m12 = (M1) objB;
                if (r0N.f) {
                    r0N.d();
                    r0N.f = false;
                }
                S0.t((S0) r0N.f5558e, m12);
                if (r0N.f) {
                    r0N.d();
                    r0N.f = false;
                }
                ((S0) r0N.f5558e).zze = 0;
                return (S0) r0N.b();
            case 1:
                C0254e1 c0254e1 = (C0254e1) u4;
                C0236b1 c0236b1N = C0242c1.n();
                byte[] bArrA2 = D2.a(c0254e1.m());
                Y4 y4Q2 = Z4.q(bArrA2, 0, bArrA2.length);
                if (c0236b1N.f) {
                    c0236b1N.d();
                    c0236b1N.f = false;
                }
                ((C0242c1) c0236b1N.f5558e).zzg = y4Q2;
                C0266g1 c0266g1P = c0254e1.p();
                if (c0236b1N.f) {
                    c0236b1N.d();
                    c0236b1N.f = false;
                }
                C0242c1.s((C0242c1) c0236b1N.f5558e, c0266g1P);
                if (c0236b1N.f) {
                    c0236b1N.d();
                    c0236b1N.f = false;
                }
                ((C0242c1) c0236b1N.f5558e).zze = 0;
                return (C0242c1) c0236b1N.b();
            case 2:
                C0272h1 c0272h1N = C0278i1.n();
                byte[] bArrA3 = D2.a(((C0290k1) u4).m());
                Y4 y4Q3 = Z4.q(bArrA3, 0, bArrA3.length);
                if (c0272h1N.f) {
                    c0272h1N.d();
                    c0272h1N.f = false;
                }
                ((C0278i1) c0272h1N.f5558e).zzf = y4Q3;
                if (c0272h1N.f) {
                    c0272h1N.d();
                    c0272h1N.f = false;
                }
                ((C0278i1) c0272h1N.f5558e).zze = 0;
                return (C0278i1) c0272h1N.b();
            case 3:
                C0296l1 c0296l1N = C0302m1.n();
                byte[] bArrA4 = D2.a(((C0314o1) u4).m());
                Y4 y4Q4 = Z4.q(bArrA4, 0, bArrA4.length);
                if (c0296l1N.f) {
                    c0296l1N.d();
                    c0296l1N.f = false;
                }
                ((C0302m1) c0296l1N.f5558e).zzf = y4Q4;
                if (c0296l1N.f) {
                    c0296l1N.d();
                    c0296l1N.f = false;
                }
                ((C0302m1) c0296l1N.f5558e).zze = 0;
                return (C0302m1) c0296l1N.b();
            case 4:
                C0343t1 c0343t1N = C0349u1.n();
                if (c0343t1N.f) {
                    c0343t1N.d();
                    c0343t1N.f = false;
                }
                ((C0349u1) c0343t1N.f5558e).zze = 0;
                byte[] bArrA5 = D2.a(32);
                Y4 y4Q5 = Z4.q(bArrA5, 0, bArrA5.length);
                if (c0343t1N.f) {
                    c0343t1N.d();
                    c0343t1N.f = false;
                }
                ((C0349u1) c0343t1N.f5558e).zzf = y4Q5;
                return (C0349u1) c0343t1N.b();
            case 5:
                C0273h2 c0273h2 = (C0273h2) u4;
                C0261f2 c0261f2N = C0267g2.n();
                if (c0261f2N.f) {
                    c0261f2N.d();
                    c0261f2N.f = false;
                }
                C0267g2.r((C0267g2) c0261f2N.f5558e, c0273h2);
                if (c0261f2N.f) {
                    c0261f2N.d();
                    c0261f2N.f = false;
                }
                ((C0267g2) c0261f2N.f5558e).zze = 0;
                return (C0267g2) c0261f2N.b();
            case 6:
                C0291k2 c0291k2 = (C0291k2) u4;
                C0279i2 c0279i2N = C0285j2.n();
                if (c0279i2N.f) {
                    c0279i2N.d();
                    c0279i2N.f = false;
                }
                C0285j2.r((C0285j2) c0279i2N.f5558e, c0291k2);
                if (c0279i2N.f) {
                    c0279i2N.d();
                    c0279i2N.f = false;
                }
                ((C0285j2) c0279i2N.f5558e).zze = 0;
                return (C0285j2) c0279i2N.b();
            case 7:
                C0303m2 c0303m2N = C0309n2.n();
                if (c0303m2N.f) {
                    c0303m2N.d();
                    c0303m2N.f = false;
                }
                ((C0309n2) c0303m2N.f5558e).zze = 0;
                byte[] bArrA6 = D2.a(32);
                Y4 y4Q6 = Z4.q(bArrA6, 0, bArrA6.length);
                if (c0303m2N.f) {
                    c0303m2N.d();
                    c0303m2N.f = false;
                }
                ((C0309n2) c0303m2N.f5558e).zzf = y4Q6;
                return (C0309n2) c0303m2N.b();
            case 8:
                C0320p1 c0320p1N = C0326q1.n();
                byte[] bArrA7 = D2.a(((C0337s1) u4).m());
                Y4 y4Q7 = Z4.q(bArrA7, 0, bArrA7.length);
                if (c0320p1N.f) {
                    c0320p1N.d();
                    c0320p1N.f = false;
                }
                ((C0326q1) c0320p1N.f5558e).zzf = y4Q7;
                if (c0320p1N.f) {
                    c0320p1N.d();
                    c0320p1N.f = false;
                }
                ((C0326q1) c0320p1N.f5558e).zze = 0;
                return (C0326q1) c0320p1N.b();
            case 9:
                A1 a12 = (A1) u4;
                ECParameterSpec eCParameterSpecO = AbstractC0335s.O(AbstractC0335s.x(a12.o().q().o()));
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) C0374y2.f5692h.a("EC");
                keyPairGenerator.initialize(eCParameterSpecO);
                KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
                ECPublicKey eCPublicKey = (ECPublicKey) keyPairGenerateKeyPair.getPublic();
                ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairGenerateKeyPair.getPrivate();
                ECPoint w3 = eCPublicKey.getW();
                F1 f1O = G1.o();
                if (f1O.f) {
                    f1O.d();
                    f1O.f = false;
                }
                ((G1) f1O.f5558e).zze = 0;
                C1 c1O = a12.o();
                if (f1O.f) {
                    f1O.d();
                    f1O.f = false;
                }
                G1.u((G1) f1O.f5558e, c1O);
                byte[] byteArray = w3.getAffineX().toByteArray();
                Y4 y4Q8 = Z4.q(byteArray, 0, byteArray.length);
                if (f1O.f) {
                    f1O.d();
                    f1O.f = false;
                }
                ((G1) f1O.f5558e).zzg = y4Q8;
                byte[] byteArray2 = w3.getAffineY().toByteArray();
                Y4 y4Q9 = Z4.q(byteArray2, 0, byteArray2.length);
                if (f1O.f) {
                    f1O.d();
                    f1O.f = false;
                }
                ((G1) f1O.f5558e).zzh = y4Q9;
                G1 g12 = (G1) f1O.b();
                D1 d1N = E1.n();
                if (d1N.f) {
                    d1N.d();
                    d1N.f = false;
                }
                ((E1) d1N.f5558e).zze = 0;
                if (d1N.f) {
                    d1N.d();
                    d1N.f = false;
                }
                ((E1) d1N.f5558e).zzf = g12;
                byte[] byteArray3 = eCPrivateKey.getS().toByteArray();
                Y4 y4Q10 = Z4.q(byteArray3, 0, byteArray3.length);
                if (d1N.f) {
                    d1N.d();
                    d1N.f = false;
                }
                ((E1) d1N.f5558e).zzg = y4Q10;
                return (E1) d1N.b();
            case 10:
                O0 o0 = (O0) u4;
                L0 l0N = M0.n();
                if (l0N.f) {
                    l0N.d();
                    l0N.f = false;
                }
                ((M0) l0N.f5558e).zze = 0;
                byte[] bArrA8 = D2.a(o0.m());
                Y4 y4Q11 = Z4.q(bArrA8, 0, bArrA8.length);
                if (l0N.f) {
                    l0N.d();
                    l0N.f = false;
                }
                ((M0) l0N.f5558e).zzf = y4Q11;
                Q0 q0P = o0.p();
                if (l0N.f) {
                    l0N.d();
                    l0N.f = false;
                }
                M0.t((M0) l0N.f5558e, q0P);
                return (M0) l0N.b();
            default:
                O1 o12 = (O1) u4;
                L1 l1N = M1.n();
                if (l1N.f) {
                    l1N.d();
                    l1N.f = false;
                }
                ((M1) l1N.f5558e).zze = 0;
                Q1 q1Q = o12.q();
                if (l1N.f) {
                    l1N.d();
                    l1N.f = false;
                }
                M1.t((M1) l1N.f5558e, q1Q);
                byte[] bArrA9 = D2.a(o12.m());
                Y4 y4Q12 = Z4.q(bArrA9, 0, bArrA9.length);
                if (l1N.f) {
                    l1N.d();
                    l1N.f = false;
                }
                ((M1) l1N.f5558e).zzg = y4Q12;
                return (M1) l1N.b();
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.X
    public Map c() throws GeneralSecurityException {
        switch (this.f5595b) {
            case 0:
                HashMap map = new HashMap();
                map.put("AES128_CTR_HMAC_SHA256", C0378z0.t(16, 16, 1));
                map.put("AES128_CTR_HMAC_SHA256_RAW", C0378z0.t(16, 16, 3));
                map.put("AES256_CTR_HMAC_SHA256", C0378z0.t(32, 32, 1));
                map.put("AES256_CTR_HMAC_SHA256_RAW", C0378z0.t(32, 32, 3));
                return Collections.unmodifiableMap(map);
            case 1:
                HashMap map2 = new HashMap();
                map2.put("AES128_EAX", A0.t(16, 1));
                map2.put("AES128_EAX_RAW", A0.t(16, 3));
                map2.put("AES256_EAX", A0.t(32, 1));
                map2.put("AES256_EAX_RAW", A0.t(32, 3));
                return Collections.unmodifiableMap(map2);
            case 2:
                HashMap map3 = new HashMap();
                map3.put("AES128_GCM", C0378z0.u(16, 1));
                map3.put("AES128_GCM_RAW", C0378z0.u(16, 3));
                map3.put("AES256_GCM", C0378z0.u(32, 1));
                map3.put("AES256_GCM_RAW", C0378z0.u(32, 3));
                return Collections.unmodifiableMap(map3);
            case 3:
                HashMap map4 = new HashMap();
                map4.put("AES128_GCM_SIV", A0.u(16, 1));
                map4.put("AES128_GCM_SIV_RAW", A0.u(16, 3));
                map4.put("AES256_GCM_SIV", A0.u(32, 1));
                map4.put("AES256_GCM_SIV_RAW", A0.u(32, 3));
                return Collections.unmodifiableMap(map4);
            case 4:
                HashMap map5 = new HashMap();
                map5.put("CHACHA20_POLY1305", new W(C0361w1.m(), 1));
                map5.put("CHACHA20_POLY1305_RAW", new W(C0361w1.m(), 3));
                return Collections.unmodifiableMap(map5);
            case 5:
            case 6:
            default:
                return super.c();
            case 7:
                HashMap map6 = new HashMap();
                map6.put("XCHACHA20_POLY1305", new W(C0315o2.m(), 1));
                map6.put("XCHACHA20_POLY1305_RAW", new W(C0315o2.m(), 3));
                return Collections.unmodifiableMap(map6);
            case 8:
                HashMap map7 = new HashMap();
                C0331r1 c0331r1N = C0337s1.n();
                if (c0331r1N.f) {
                    c0331r1N.d();
                    c0331r1N.f = false;
                }
                ((C0337s1) c0331r1N.f5558e).zze = 64;
                map7.put("AES256_SIV", new W((C0337s1) c0331r1N.b(), 1));
                C0331r1 c0331r1N2 = C0337s1.n();
                if (c0331r1N2.f) {
                    c0331r1N2.d();
                    c0331r1N2.f = false;
                }
                ((C0337s1) c0331r1N2.f5558e).zze = 64;
                map7.put("AES256_SIV_RAW", new W((C0337s1) c0331r1N2.b(), 3));
                return Collections.unmodifiableMap(map7);
            case 9:
                HashMap map8 = new HashMap();
                V vC = AbstractC0335s.c("AES128_GCM");
                byte[] bArr = C0378z0.f;
                map8.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", C0378z0.w(2, vC, bArr, 1));
                map8.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", C0378z0.w(2, AbstractC0335s.c("AES128_GCM"), bArr, 3));
                map8.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", C0378z0.w(3, AbstractC0335s.c("AES128_GCM"), bArr, 1));
                map8.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", C0378z0.w(3, AbstractC0335s.c("AES128_GCM"), bArr, 3));
                map8.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", C0378z0.w(3, AbstractC0335s.c("AES128_GCM"), bArr, 3));
                map8.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", C0378z0.w(2, AbstractC0335s.c("AES128_CTR_HMAC_SHA256"), bArr, 1));
                map8.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", C0378z0.w(2, AbstractC0335s.c("AES128_CTR_HMAC_SHA256"), bArr, 3));
                map8.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", C0378z0.w(3, AbstractC0335s.c("AES128_CTR_HMAC_SHA256"), bArr, 1));
                map8.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", C0378z0.w(3, AbstractC0335s.c("AES128_CTR_HMAC_SHA256"), bArr, 3));
                return Collections.unmodifiableMap(map8);
            case 10:
                HashMap map9 = new HashMap();
                N0 n0N = O0.n();
                n0N.e();
                P0 p0N = Q0.n();
                p0N.e();
                n0N.f((Q0) p0N.b());
                map9.put("AES_CMAC", new W((O0) n0N.b(), 1));
                N0 n0N2 = O0.n();
                n0N2.e();
                P0 p0N2 = Q0.n();
                p0N2.e();
                n0N2.f((Q0) p0N2.b());
                map9.put("AES256_CMAC", new W((O0) n0N2.b(), 1));
                N0 n0N3 = O0.n();
                n0N3.e();
                P0 p0N3 = Q0.n();
                p0N3.e();
                n0N3.f((Q0) p0N3.b());
                map9.put("AES256_CMAC_RAW", new W((O0) n0N3.b(), 3));
                return Collections.unmodifiableMap(map9);
            case 11:
                HashMap map10 = new HashMap();
                map10.put("HMAC_SHA256_128BITTAG", C0378z0.v(32, 16, 4, 1));
                map10.put("HMAC_SHA256_128BITTAG_RAW", C0378z0.v(32, 16, 4, 3));
                map10.put("HMAC_SHA256_256BITTAG", C0378z0.v(32, 32, 4, 1));
                map10.put("HMAC_SHA256_256BITTAG_RAW", C0378z0.v(32, 32, 4, 3));
                map10.put("HMAC_SHA512_128BITTAG", C0378z0.v(64, 16, 5, 1));
                map10.put("HMAC_SHA512_128BITTAG_RAW", C0378z0.v(64, 16, 5, 3));
                map10.put("HMAC_SHA512_256BITTAG", C0378z0.v(64, 32, 5, 1));
                map10.put("HMAC_SHA512_256BITTAG_RAW", C0378z0.v(64, 32, 5, 3));
                map10.put("HMAC_SHA512_512BITTAG", C0378z0.v(64, 64, 5, 1));
                map10.put("HMAC_SHA512_512BITTAG_RAW", C0378z0.v(64, 64, 5, 3));
                return Collections.unmodifiableMap(map10);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.X
    public final void d(U4 u4) throws GeneralSecurityException {
        switch (this.f5595b) {
            case 0:
                U0 u02 = (U0) u4;
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
                Collections.unmodifiableMap(map);
                Y0 y0O = u02.o();
                E2.b(y0O.m());
                C0230a1 c0230a1P = y0O.p();
                if (c0230a1P.m() < 12 || c0230a1P.m() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                C0319p0[] c0319p0Arr2 = {new C0319p0(13, InterfaceC0235b0.class)};
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
                O1 o1P = u02.p();
                if (o1P.m() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                C0378z0.z(o1P.q());
                E2.b(u02.o().m());
                return;
            case 1:
                C0254e1 c0254e1 = (C0254e1) u4;
                E2.b(c0254e1.m());
                if (c0254e1.p().m() != 12 && c0254e1.p().m() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 2:
                E2.b(((C0290k1) u4).m());
                return;
            case 3:
                E2.b(((C0314o1) u4).m());
                return;
            case 4:
                return;
            case 5:
                return;
            case 6:
                C0291k2 c0291k2 = (C0291k2) u4;
                if (c0291k2.p().isEmpty() || !c0291k2.q()) {
                    throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
                }
                return;
            case 7:
                return;
            case 8:
                C0337s1 c0337s1 = (C0337s1) u4;
                if (c0337s1.m() == 64) {
                    return;
                }
                int iM = c0337s1.m();
                StringBuilder sb = new StringBuilder(61);
                sb.append("invalid key size: ");
                sb.append(iM);
                sb.append(". Valid keys must have 64 bytes.");
                throw new InvalidAlgorithmParameterException(sb.toString());
            case 9:
                AbstractC0335s.s(((A1) u4).o());
                return;
            case 10:
                O0 o0 = (O0) u4;
                A0.v(o0.p());
                if (o0.m() != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                return;
            default:
                O1 o12 = (O1) u4;
                if (o12.m() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                C0378z0.z(o12.q());
                return;
        }
    }
}
