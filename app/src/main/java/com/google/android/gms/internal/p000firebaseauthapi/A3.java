package com.google.android.gms.internal.p000firebaseauthapi;

import X1.d;
import Z1.t;
import b1.AbstractC0203C;
import com.google.firebase.messaging.q;

/* loaded from: classes.dex */
public final class A3 extends AbstractC0251d4 {
    public final /* synthetic */ int n;

    /* renamed from: o, reason: collision with root package name */
    public final d f5258o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A3(d dVar, int i5) {
        super(2);
        this.n = i5;
        switch (i5) {
            case 1:
                super(2);
                this.f5258o = dVar;
                break;
            default:
                this.f5258o = dVar;
                AbstractC0203C.d(dVar.f2717d, "email cannot be null");
                AbstractC0203C.d(dVar.f2718e, "password cannot be null");
                break;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.AbstractC0251d4
    public final E0.d a() {
        switch (this.n) {
            case 0:
                E0.d dVar = new E0.d(19, false);
                dVar.f520e = new C0306n(15, this);
                return dVar.D0();
            default:
                E0.d dVar2 = new E0.d(19, false);
                dVar2.f520e = new C0306n(18, this);
                return dVar2.D0();
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.AbstractC0251d4
    public final String b() {
        switch (this.n) {
        }
        return "linkEmailAuthCredential";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.AbstractC0251d4
    public final void c() {
        switch (this.n) {
            case 0:
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
}
