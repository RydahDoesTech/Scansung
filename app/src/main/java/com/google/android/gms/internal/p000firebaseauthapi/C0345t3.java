package com.google.android.gms.internal.p000firebaseauthapi;

import G3.c;
import V1.a;
import a4.k;
import com.google.firebase.messaging.q;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.t3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0345t3 implements InterfaceC0257e4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5638d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ H3 f5639e;
    public final /* synthetic */ C0306n f;

    public /* synthetic */ C0345t3(C0306n c0306n, H3 h3, int i5) {
        this.f5638d = i5;
        this.f = c0306n;
        this.f5639e = h3;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0257e4
    public final void b(String str) {
        switch (this.f5638d) {
            case 0:
                this.f5639e.b(a.q0(str));
                break;
            case 1:
                this.f5639e.b(a.q0(str));
                break;
            case 2:
                this.f5639e.b(a.q0(str));
                break;
            default:
                this.f5639e.b(a.q0(str));
                break;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0257e4
    public final void e(Z3 z32) throws IOException {
        switch (this.f5638d) {
            case 0:
                C0382z4 c0382z4 = (C0382z4) z32;
                k kVar = new k();
                kVar.d(c0382z4.f5703e);
                M4 m4 = (M4) kVar.f3063j;
                m4.f5353e.add("EMAIL");
                m4.f5353e.add("PASSWORD");
                C0306n.p(kVar, this.f, this.f5639e, this, c0382z4);
                break;
            case 1:
                P4 p42 = (P4) z32;
                C0382z4 c0382z42 = new C0382z4(p42.f5383e, p42.f5382d, Long.valueOf(p42.f), "Bearer", Long.valueOf(System.currentTimeMillis()));
                Boolean boolValueOf = Boolean.valueOf(p42.f5384g);
                H3 h3 = this.f5639e;
                C0306n c0306n = this.f;
                c0306n.getClass();
                ((c) c0306n.f5568e).i(new C0311n4(c0382z42.f5703e, 3), new q(this, boolValueOf, h3, c0382z42, 11));
                break;
            case 2:
                C0382z4 c0382z43 = (C0382z4) z32;
                ((c) this.f.f5568e).i(new C0311n4(c0382z43.f5703e, 3), new A2(this, this, c0382z43, 7));
                break;
            default:
                C0311n4 c0311n4 = new C0311n4(((C0382z4) z32).f5703e, 1);
                c cVar = (c) this.f.f5568e;
                U u4 = new U(this, this, 4);
                cVar.getClass();
                W3 w3 = (W3) cVar.f740e;
                AbstractC0335s.l(w3.j("/deleteAccount", (String) cVar.f744j), c0311n4, u4, Void.class, (C0239b4) w3.f5381b);
                break;
        }
    }
}
