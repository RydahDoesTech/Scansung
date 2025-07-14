package com.google.android.gms.internal.p000firebaseauthapi;

import G3.c;
import V1.a;
import a4.k;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.u3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0351u3 implements InterfaceC0257e4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f5648e;
    public final /* synthetic */ H3 f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0306n f5649g;

    public /* synthetic */ C0351u3(C0306n c0306n, String str, H3 h3, int i5) {
        this.f5647d = i5;
        this.f5649g = c0306n;
        this.f5648e = str;
        this.f = h3;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0257e4
    public final void b(String str) {
        switch (this.f5647d) {
            case 0:
                this.f.b(a.q0(str));
                break;
            case 1:
                this.f.b(a.q0(str));
                break;
            case 2:
                this.f.b(a.q0(str));
                break;
            default:
                this.f.b(a.q0(str));
                break;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.InterfaceC0257e4
    public final void e(Z3 z32) throws IOException {
        switch (this.f5647d) {
            case 0:
                C0382z4 c0382z4 = (C0382z4) z32;
                ((c) this.f5649g.f5568e).i(new C0311n4(c0382z4.f5703e, 3), new A2(this, this, c0382z4, 5));
                break;
            case 1:
                C0263f4 c0263f4 = new C0263f4(2, ((C0382z4) z32).f5703e, this.f5648e);
                c cVar = (c) this.f5649g.f5568e;
                C0306n c0306n = new C0306n(10, this);
                cVar.getClass();
                W3 w3 = (W3) cVar.f;
                AbstractC0335s.l(w3.j("/mfaEnrollment:withdraw", (String) cVar.f744j), c0263f4, c0306n, T4.class, (C0239b4) w3.f5381b);
                break;
            case 2:
                C0382z4 c0382z42 = (C0382z4) z32;
                k kVar = new k();
                kVar.d(c0382z42.f5703e);
                String str = this.f5648e;
                if (str == null) {
                    ((M4) kVar.f3063j).f5353e.add("EMAIL");
                } else {
                    kVar.f = str;
                }
                C0306n.p(kVar, this.f5649g, this.f, this, c0382z42);
                break;
            default:
                C0382z4 c0382z43 = (C0382z4) z32;
                String str2 = c0382z43.f5703e;
                k kVar2 = new k();
                kVar2.d(str2);
                String str3 = this.f5648e;
                if (str3 == null) {
                    ((M4) kVar2.f3063j).f5353e.add("PASSWORD");
                } else {
                    kVar2.f3060g = str3;
                }
                C0306n.p(kVar2, this.f5649g, this.f, this, c0382z43);
                break;
        }
    }
}
