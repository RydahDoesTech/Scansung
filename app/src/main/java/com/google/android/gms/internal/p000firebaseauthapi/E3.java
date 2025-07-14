package com.google.android.gms.internal.p000firebaseauthapi;

import E0.d;
import X1.j;
import Z1.t;
import b1.AbstractC0203C;
import com.google.android.gms.common.api.Status;
import com.google.firebase.messaging.q;

/* loaded from: classes.dex */
public final class E3 extends AbstractC0251d4 {
    public final /* synthetic */ int n;

    /* renamed from: o, reason: collision with root package name */
    public final C0268g3 f5292o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E3(j jVar, String str, int i5) {
        super(2);
        this.n = i5;
        switch (i5) {
            case 1:
                super(2);
                AbstractC0203C.e(jVar);
                this.f5292o = new C0268g3(jVar, str);
                break;
            default:
                AbstractC0203C.f("credential cannot be null", jVar);
                jVar.f2728h = false;
                this.f5292o = new C0268g3(jVar, str);
                break;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.AbstractC0251d4
    public final d a() {
        switch (this.n) {
            case 0:
                d dVar = new d(19, false);
                dVar.f520e = new C0306n(22, this);
                return dVar.D0();
            default:
                d dVar2 = new d(19, false);
                dVar2.f520e = new C0306n(26, this);
                return dVar2.D0();
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.AbstractC0251d4
    public final String b() {
        switch (this.n) {
            case 0:
                return "reauthenticateWithPhoneCredentialWithData";
            default:
                return "signInWithPhoneNumber";
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
