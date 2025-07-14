package com.google.android.gms.internal.p000firebaseauthapi;

import a4.v;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class A0 extends v {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5254e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A0(Class cls, C0319p0[] c0319p0Arr, int i5) {
        super(cls, c0319p0Arr);
        this.f5254e = i5;
    }

    public static W t(int i5, int i6) {
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
        return new W((C0254e1) c0248d1N.b(), i6);
    }

    public static W u(int i5, int i6) {
        C0308n1 c0308n1N = C0314o1.n();
        if (c0308n1N.f) {
            c0308n1N.d();
            c0308n1N.f = false;
        }
        ((C0314o1) c0308n1N.f5558e).zze = i5;
        return new W((C0314o1) c0308n1N.b(), i6);
    }

    public static void v(Q0 q0) throws GeneralSecurityException {
        if (q0.m() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (q0.m() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    @Override // a4.v
    public X n() {
        switch (this.f5254e) {
            case 1:
                return new C0325q0(1, C0254e1.class);
            case 2:
                return new C0325q0(3, C0314o1.class);
            case 3:
                return new C0325q0(5, C0273h2.class);
            case 4:
                return new C0325q0(7, C0315o2.class);
            case 5:
                return new C0325q0(10, O0.class);
            default:
                return super.n();
        }
    }

    @Override // a4.v
    public final int o() {
        switch (this.f5254e) {
        }
        return 2;
    }

    @Override // a4.v
    public final /* bridge */ /* synthetic */ U4 p(Z4 z4) {
        switch (this.f5254e) {
            case 0:
                return G1.q(z4, g5.a());
            case 1:
                return C0242c1.o(z4, g5.a());
            case 2:
                return C0302m1.o(z4, g5.a());
            case 3:
                return C0267g2.o(z4, g5.a());
            case 4:
                return C0309n2.o(z4, g5.a());
            default:
                return M0.o(z4, g5.a());
        }
    }

    @Override // a4.v
    public final String r() {
        switch (this.f5254e) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
            case 1:
                return "type.googleapis.com/google.crypto.tink.AesEaxKey";
            case 2:
                return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
            case 3:
                return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
            case 4:
                return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
            default:
                return "type.googleapis.com/google.crypto.tink.AesCmacKey";
        }
    }

    @Override // a4.v
    public final void s(U4 u4) {
        switch (this.f5254e) {
            case 0:
                G1 g12 = (G1) u4;
                E2.c(g12.m());
                AbstractC0335s.s(g12.n());
                return;
            case 1:
                C0242c1 c0242c1 = (C0242c1) u4;
                E2.c(c0242c1.m());
                E2.b(c0242c1.q().n());
                if (c0242c1.p().m() != 12 && c0242c1.p().m() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 2:
                C0302m1 c0302m1 = (C0302m1) u4;
                E2.c(c0302m1.m());
                E2.b(c0302m1.p().n());
                return;
            case 3:
                E2.c(((C0267g2) u4).m());
                return;
            case 4:
                C0309n2 c0309n2 = (C0309n2) u4;
                E2.c(c0309n2.m());
                if (c0309n2.p().n() != 32) {
                    throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
                }
                return;
            default:
                M0 m0 = (M0) u4;
                E2.c(m0.m());
                if (m0.q().n() != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                v(m0.p());
                return;
        }
    }
}
