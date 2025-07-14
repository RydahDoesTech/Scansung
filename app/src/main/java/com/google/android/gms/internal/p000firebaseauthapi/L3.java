package com.google.android.gms.internal.p000firebaseauthapi;

import A.d;
import G3.c;
import X1.j;
import a1.C0097e;
import android.content.Context;
import android.util.Log;
import b1.AbstractC0203C;
import com.google.firebase.messaging.q;
import java.io.IOException;

/* loaded from: classes.dex */
public final class L3 extends T3 {

    /* renamed from: d, reason: collision with root package name */
    public static final d f5344d = new d("FirebaseAuth", "FirebaseAuthFallback:");

    /* renamed from: b, reason: collision with root package name */
    public final C0306n f5345b;

    /* renamed from: c, reason: collision with root package name */
    public final C0299l4 f5346c;

    public L3(Context context, String str) {
        super("com.google.firebase.auth.api.internal.IFirebaseAuthService", 0);
        AbstractC0203C.e(context);
        C0233a4 c0233a4 = new C0233a4(C0233a4.a());
        AbstractC0203C.c(str);
        this.f5345b = new C0306n(13, new c(context, str, c0233a4));
        this.f5346c = new C0299l4(context);
    }

    public static boolean z(long j5, boolean z4) {
        if (j5 > 0 && z4) {
            return true;
        }
        d dVar = f5344d;
        Log.w((String) dVar.f11b, dVar.f("App hash will not be appended to the request.", new Object[0]));
        return false;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.V3
    public final void b(C0262f3 c0262f3, R3 r32) {
        AbstractC0203C.e(c0262f3);
        X1.d dVar = c0262f3.f5475d;
        AbstractC0203C.e(dVar);
        AbstractC0203C.e(r32);
        H3 h3 = new H3(r32, f5344d);
        C0306n c0306n = this.f5345b;
        c0306n.getClass();
        if (dVar.f2720h) {
            c0306n.h(dVar.f2719g, new A2(c0306n, dVar, h3, 1));
        } else {
            c0306n.i(new C0334r4(dVar, null), h3);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.V3
    public final void h(U2 u22, R3 r32) {
        AbstractC0203C.e(u22);
        String str = u22.f5394d;
        AbstractC0203C.c(str);
        N4 n42 = u22.f5395e;
        AbstractC0203C.e(n42);
        AbstractC0203C.e(r32);
        H3 h3 = new H3(r32, f5344d);
        C0306n c0306n = this.f5345b;
        c0306n.getClass();
        AbstractC0203C.c(str);
        c0306n.h(str, new A2(c0306n, n42, h3, 4));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.V3
    public final void k(C0256e3 c0256e3, R3 r32) throws IOException {
        AbstractC0203C.e(c0256e3);
        String str = c0256e3.f5468d;
        AbstractC0203C.c(str);
        String str2 = c0256e3.f5469e;
        AbstractC0203C.c(str2);
        AbstractC0203C.e(r32);
        H3 h3 = new H3(r32, f5344d);
        C0306n c0306n = this.f5345b;
        c0306n.getClass();
        AbstractC0203C.c(str);
        AbstractC0203C.c(str2);
        C0323p4 c0323p4 = new C0323p4(3, str, str2, c0256e3.f);
        C0333r3 c0333r3 = new C0333r3(c0306n, h3, 1);
        c cVar = (c) c0306n.f5568e;
        cVar.getClass();
        W3 w3 = (W3) cVar.f740e;
        AbstractC0335s.l(w3.j("/verifyPassword", (String) cVar.f744j), c0323p4, c0333r3, Q4.class, (C0239b4) w3.f5381b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.V3
    public final void l(T2 t22, R3 r32) {
        AbstractC0203C.e(t22);
        String str = t22.f5390d;
        AbstractC0203C.c(str);
        String str2 = t22.f5391e;
        AbstractC0203C.c(str2);
        String str3 = t22.f;
        AbstractC0203C.c(str3);
        AbstractC0203C.e(r32);
        H3 h3 = new H3(r32, f5344d);
        C0306n c0306n = this.f5345b;
        c0306n.getClass();
        AbstractC0203C.c(str);
        AbstractC0203C.c(str2);
        AbstractC0203C.c(str3);
        c0306n.h(str3, new q(c0306n, str, str2, h3));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.V3
    public final void o(C0244c3 c0244c3, R3 r32) throws IOException {
        AbstractC0203C.e(c0244c3);
        N4 n42 = c0244c3.f5446d;
        AbstractC0203C.e(n42);
        AbstractC0203C.e(r32);
        H3 h3 = new H3(r32, f5344d);
        C0306n c0306n = this.f5345b;
        c0306n.getClass();
        n42.f5373r = true;
        C0333r3 c0333r3 = new C0333r3(c0306n, h3, 11);
        c cVar = (c) c0306n.f5568e;
        cVar.getClass();
        W3 w3 = (W3) cVar.f740e;
        AbstractC0335s.l(w3.j("/verifyAssertion", (String) cVar.f744j), n42, c0333r3, O4.class, (C0239b4) w3.f5381b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.V3
    public final void q(R2 r22, R3 r32) throws IOException {
        AbstractC0203C.e(r22);
        AbstractC0203C.e(r32);
        String str = r22.f5387d;
        AbstractC0203C.c(str);
        H3 h3 = new H3(r32, f5344d);
        C0306n c0306n = this.f5345b;
        c0306n.getClass();
        AbstractC0203C.c(str);
        C0311n4 c0311n4 = new C0311n4(str, 2);
        C0333r3 c0333r3 = new C0333r3(h3, 6);
        c cVar = (c) c0306n.f5568e;
        W3 w3 = (W3) cVar.f741g;
        AbstractC0335s.l(w3.j("/token", (String) cVar.f744j), c0311n4, c0333r3, C0382z4.class, (C0239b4) w3.f5381b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.V3
    public final void t(C0268g3 c0268g3, R3 r32) throws IOException {
        AbstractC0203C.e(r32);
        AbstractC0203C.e(c0268g3);
        j jVar = c0268g3.f5491d;
        AbstractC0203C.e(jVar);
        C0097e c0097eB = AbstractC0335s.b(jVar);
        H3 h3 = new H3(r32, f5344d);
        C0306n c0306n = this.f5345b;
        c0306n.getClass();
        C0333r3 c0333r3 = new C0333r3(c0306n, h3, 8);
        c cVar = (c) c0306n.f5568e;
        W3 w3 = (W3) cVar.f740e;
        AbstractC0335s.l(w3.j("/verifyPhoneNumber", (String) cVar.f744j), c0097eB, c0333r3, R4.class, (C0239b4) w3.f5381b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.V3
    public final void x(V2 v2, R3 r32) {
        AbstractC0203C.e(r32);
        AbstractC0203C.e(v2);
        j jVar = v2.f5399e;
        AbstractC0203C.e(jVar);
        String str = v2.f5398d;
        AbstractC0203C.c(str);
        C0097e c0097eB = AbstractC0335s.b(jVar);
        H3 h3 = new H3(r32, f5344d);
        C0306n c0306n = this.f5345b;
        c0306n.getClass();
        AbstractC0203C.c(str);
        c0306n.h(str, new A2(c0306n, c0097eB, h3, 3));
    }
}
