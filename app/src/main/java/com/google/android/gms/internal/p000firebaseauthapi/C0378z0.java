package com.google.android.gms.internal.p000firebaseauthapi;

import a4.v;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;
import k.Q0;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0378z0 extends v {
    public static final byte[] f = new byte[0];

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5700e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0378z0(Class cls, C0319p0[] c0319p0Arr, int i5) {
        super(cls, c0319p0Arr);
        this.f5700e = i5;
    }

    public static W t(int i5, int i6, int i7) {
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
        return new W((U0) t0M.b(), i7);
    }

    public static W u(int i5, int i6) {
        C0284j1 c0284j1N = C0290k1.n();
        if (c0284j1N.f) {
            c0284j1N.d();
            c0284j1N.f = false;
        }
        ((C0290k1) c0284j1N.f5558e).zze = i5;
        return new W((C0290k1) c0284j1N.b(), i6);
    }

    public static /* synthetic */ W v(int i5, int i6, int i7, int i8) {
        N1 n1N = O1.n();
        P1 p1O = Q1.o();
        p1O.e(i7);
        p1O.f(i6);
        n1N.f((Q1) p1O.b());
        n1N.e(i5);
        return new W((O1) n1N.b(), i8);
    }

    public static W w(int i5, V v2, byte[] bArr, int i6) {
        int i7;
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
        U1 u1M = V1.m();
        u1M.f(v2.f5397a.q());
        V1 v12 = v2.f5397a;
        byte[] bArrR = v12.p().r();
        u1M.g(Z4.q(bArrR, 0, bArrR.length));
        int iC = Q0.c(v12.o());
        int i8 = 4;
        if (iC == 1) {
            i7 = 1;
        } else if (iC == 2) {
            i7 = 2;
        } else if (iC == 3) {
            i7 = 3;
        } else {
            if (iC != 4) {
                throw new IllegalArgumentException("Unknown output prefix type");
            }
            i7 = 4;
        }
        int i9 = i7 - 1;
        if (i9 == 0) {
            i8 = 2;
        } else if (i9 == 1) {
            i8 = 3;
        } else if (i9 != 2) {
            i8 = 5;
        }
        u1M.e(i8);
        V1 v13 = (V1) u1M.b();
        C0367x1 c0367x1M = C0373y1.m();
        if (c0367x1M.f) {
            c0367x1M.d();
            c0367x1M.f = false;
        }
        C0373y1.p((C0373y1) c0367x1M.f5558e, v13);
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
        return new W((A1) c0379z1M.b(), i6);
    }

    public static final void x(E1 e12) {
        if (e12.q().n() == 0) {
            throw new GeneralSecurityException("invalid ECIES private key");
        }
        E2.c(e12.m());
        AbstractC0335s.s(e12.p().n());
    }

    public static final void y(M1 m12) throws GeneralSecurityException {
        E2.c(m12.m());
        if (m12.r().n() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        z(m12.q());
    }

    public static void z(Q1 q12) throws GeneralSecurityException {
        if (q12.m() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int iC = Q0.c(q12.n());
        if (iC == 1) {
            if (q12.m() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (iC == 2) {
            if (q12.m() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (iC == 3) {
            if (q12.m() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (iC == 4) {
            if (q12.m() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (iC != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (q12.m() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // a4.v
    public final X n() {
        switch (this.f5700e) {
            case 0:
                return new C0325q0(9, A1.class);
            case 1:
                return new C0325q0(0, U0.class);
            case 2:
                return new C0325q0(2, C0290k1.class);
            case 3:
                return new C0325q0(4, C0361w1.class);
            case 4:
                return new C0325q0(6, C0291k2.class);
            case 5:
                return new C0325q0(8, C0337s1.class);
            default:
                return new C0325q0(11, O1.class);
        }
    }

    @Override // a4.v
    public final int o() {
        switch (this.f5700e) {
        }
        return 2;
    }

    @Override // a4.v
    public final /* bridge */ /* synthetic */ U4 p(Z4 z4) {
        switch (this.f5700e) {
            case 0:
                return E1.o(z4, g5.a());
            case 1:
                return S0.o(z4, g5.a());
            case 2:
                return C0278i1.o(z4, g5.a());
            case 3:
                return C0349u1.o(z4, g5.a());
            case 4:
                return C0285j2.o(z4, g5.a());
            case 5:
                return C0326q1.o(z4, g5.a());
            default:
                return M1.p(z4, g5.a());
        }
    }

    @Override // a4.v
    public final String r() {
        switch (this.f5700e) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
            case 1:
                return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
            case 2:
                return "type.googleapis.com/google.crypto.tink.AesGcmKey";
            case 3:
                return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
            case 4:
                return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
            case 5:
                return "type.googleapis.com/google.crypto.tink.AesSivKey";
            default:
                return "type.googleapis.com/google.crypto.tink.HmacKey";
        }
    }

    @Override // a4.v
    public final void s(U4 u4) throws GeneralSecurityException {
        switch (this.f5700e) {
            case 0:
                x((E1) u4);
                return;
            case 1:
                S0 s02 = (S0) u4;
                E2.c(s02.m());
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
                W0 w0P = s02.p();
                E2.c(w0P.m());
                E2.b(w0P.q().n());
                C0230a1 c0230a1P = w0P.p();
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
                y(s02.q());
                return;
            case 2:
                C0278i1 c0278i1 = (C0278i1) u4;
                E2.c(c0278i1.m());
                E2.b(c0278i1.p().n());
                return;
            case 3:
                C0349u1 c0349u1 = (C0349u1) u4;
                E2.c(c0349u1.m());
                if (c0349u1.p().n() != 32) {
                    throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
                }
                return;
            case 4:
                E2.c(((C0285j2) u4).m());
                return;
            case 5:
                C0326q1 c0326q1 = (C0326q1) u4;
                E2.c(c0326q1.m());
                if (c0326q1.p().n() == 64) {
                    return;
                }
                int iN = c0326q1.p().n();
                StringBuilder sb = new StringBuilder(61);
                sb.append("invalid key size: ");
                sb.append(iN);
                sb.append(". Valid keys must have 64 bytes.");
                throw new InvalidKeyException(sb.toString());
            default:
                y((M1) u4);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0378z0() {
        super(M1.class, new C0319p0[]{new C0319p0(13, InterfaceC0235b0.class)});
        this.f5700e = 6;
    }
}
