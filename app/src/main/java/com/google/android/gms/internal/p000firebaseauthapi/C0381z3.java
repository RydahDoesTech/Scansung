package com.google.android.gms.internal.p000firebaseauthapi;

import E0.d;
import X1.c;
import X1.j;
import Z1.t;
import android.text.TextUtils;
import b1.AbstractC0203C;
import c1.AbstractC0224a;
import com.google.firebase.messaging.q;
import e1.AbstractC0415a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.z3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0381z3 extends AbstractC0251d4 {
    public final /* synthetic */ int n = 1;

    /* renamed from: o, reason: collision with root package name */
    public final AbstractC0224a f5701o;

    public C0381z3(c cVar) {
        super(2);
        this.f5701o = AbstractC0415a.f0(cVar, null);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.AbstractC0251d4
    public final d a() {
        switch (this.n) {
            case 0:
                d dVar = new d(19, false);
                dVar.f520e = new C0306n(14, this);
                return dVar.D0();
            case 1:
                d dVar2 = new d(19, false);
                dVar2.f520e = new C0306n(16, this);
                return dVar2.D0();
            default:
                d dVar3 = new d(19, false);
                dVar3.f520e = new C0306n(17, this);
                return dVar3.D0();
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.AbstractC0251d4
    public final String b() {
        switch (this.n) {
            case 0:
                return "getAccessToken";
            case 1:
                return "linkFederatedCredential";
            default:
                return "linkPhoneAuthCredential";
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.AbstractC0251d4
    public final void c() {
        switch (this.n) {
            case 0:
                if (TextUtils.isEmpty(this.f5461g.f5702d)) {
                    C0382z4 c0382z4 = this.f5461g;
                    String str = ((R2) this.f5701o).f5387d;
                    c0382z4.getClass();
                    AbstractC0203C.c(str);
                    c0382z4.f5702d = str;
                }
                this.f5460e.c(this.f5461g, this.f5459d);
                g(Z1.d.a(this.f5461g.f5703e));
                break;
            case 1:
                t tVarH = q.H(this.f5458c, this.f5462h);
                this.f5460e.c(this.f5461g, tVarH);
                g(new Z1.q(tVarH));
                break;
            default:
                t tVarH2 = q.H(this.f5458c, this.f5462h);
                this.f5460e.c(this.f5461g, tVarH2);
                g(new Z1.q(tVarH2));
                break;
        }
    }

    public C0381z3(j jVar) {
        super(2);
        this.f5701o = jVar;
    }

    public C0381z3(String str) {
        super(1);
        AbstractC0203C.d(str, "refresh token cannot be null");
        this.f5701o = new R2(str);
    }
}
