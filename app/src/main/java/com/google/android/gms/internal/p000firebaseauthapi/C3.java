package com.google.android.gms.internal.p000firebaseauthapi;

import X1.d;
import Z1.t;
import com.google.android.gms.common.api.Status;
import com.google.firebase.messaging.q;

/* loaded from: classes.dex */
public final class C3 extends AbstractC0251d4 {
    public final /* synthetic */ int n;

    /* renamed from: o, reason: collision with root package name */
    public final C0262f3 f5281o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3(d dVar, int i5) {
        super(2);
        this.n = i5;
        switch (i5) {
            case 1:
                super(2);
                this.f5281o = new C0262f3(dVar);
                break;
            default:
                this.f5281o = new C0262f3(dVar);
                break;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.AbstractC0251d4
    public final E0.d a() {
        switch (this.n) {
            case 0:
                E0.d dVar = new E0.d(19, false);
                dVar.f520e = new C0306n(20, this);
                return dVar.D0();
            default:
                E0.d dVar2 = new E0.d(19, false);
                dVar2.f520e = new C0306n(25, this);
                return dVar2.D0();
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.AbstractC0251d4
    public final String b() {
        switch (this.n) {
            case 0:
                return "reauthenticateWithEmailLinkWithData";
            default:
                return "sendSignInLinkToEmail";
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.AbstractC0251d4
    public final void c() {
        switch (this.n) {
            case 0:
                t tVarH = q.H(this.f5458c, this.f5462h);
                if (!this.f5459d.f2897e.f2889d.equalsIgnoreCase(tVarH.f2897e.f2889d)) {
                    f(new Status(17024, null));
                    break;
                } else {
                    this.f5460e.c(this.f5461g, tVarH);
                    g(new Z1.q(tVarH));
                    break;
                }
            default:
                t tVarH2 = q.H(this.f5458c, this.f5462h);
                this.f5460e.c(this.f5461g, tVarH2);
                g(new Z1.q(tVarH2));
                break;
        }
    }
}
