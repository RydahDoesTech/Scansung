package com.google.android.gms.internal.p000firebaseauthapi;

import A3.f;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0289k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f5535a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static C0255e2 a(C0231a2 c0231a2) {
        C0237b2 c0237b2M = C0255e2.m();
        int iN = c0231a2.n();
        if (c0237b2M.f) {
            c0237b2M.d();
            c0237b2M.f = false;
        }
        ((C0255e2) c0237b2M.f5558e).zze = iN;
        for (Z1 z1 : c0231a2.r()) {
            C0243c2 c0243c2N = C0249d2.n();
            String strQ = z1.n().q();
            if (c0243c2N.f) {
                c0243c2N.d();
                c0243c2N.f = false;
            }
            C0249d2.o((C0249d2) c0243c2N.f5558e, strQ);
            int iO = z1.o();
            if (c0243c2N.f) {
                c0243c2N.d();
                c0243c2N.f = false;
            }
            C0249d2.q((C0249d2) c0243c2N.f5558e, iO);
            int iQ = z1.q();
            if (c0243c2N.f) {
                c0243c2N.d();
                c0243c2N.f = false;
            }
            ((C0249d2) c0243c2N.f5558e).zzh = f.b(iQ);
            int iM = z1.m();
            if (c0243c2N.f) {
                c0243c2N.d();
                c0243c2N.f = false;
            }
            ((C0249d2) c0243c2N.f5558e).zzg = iM;
            C0249d2 c0249d2 = (C0249d2) c0243c2N.b();
            if (c0237b2M.f) {
                c0237b2M.d();
                c0237b2M.f = false;
            }
            C0255e2.p((C0255e2) c0237b2M.f5558e, c0249d2);
        }
        return (C0255e2) c0237b2M.b();
    }
}
