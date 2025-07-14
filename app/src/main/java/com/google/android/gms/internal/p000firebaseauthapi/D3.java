package com.google.android.gms.internal.p000firebaseauthapi;

import E0.d;
import Z1.t;
import b1.AbstractC0203C;
import com.google.android.gms.common.api.Status;
import com.google.firebase.messaging.q;

/* loaded from: classes.dex */
public final class D3 extends AbstractC0251d4 {
    public final /* synthetic */ int n;

    /* renamed from: o, reason: collision with root package name */
    public final C0256e3 f5290o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D3(int i5, String str, String str2, String str3) {
        super(2);
        this.n = i5;
        switch (i5) {
            case 1:
                super(2);
                AbstractC0203C.d(str, "email cannot be null or empty");
                AbstractC0203C.d(str2, "password cannot be null or empty");
                this.f5290o = new C0256e3(str, str2, str3);
                break;
            default:
                AbstractC0203C.d(str, "email cannot be null or empty");
                AbstractC0203C.d(str2, "password cannot be null or empty");
                this.f5290o = new C0256e3(str, str2, str3);
                break;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.AbstractC0251d4
    public final d a() {
        switch (this.n) {
            case 0:
                d dVar = new d(19, false);
                dVar.f520e = new C0306n(21, this);
                return dVar.D0();
            default:
                d dVar2 = new d(19, false);
                dVar2.f520e = new C0306n(24, this);
                return dVar2.D0();
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.AbstractC0251d4
    public final String b() {
        switch (this.n) {
            case 0:
                return "reauthenticateWithEmailPasswordWithData";
            default:
                return "signInWithEmailAndPassword";
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
