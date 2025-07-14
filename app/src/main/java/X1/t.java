package X1;

import b1.AbstractC0203C;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.C0382z4;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes.dex */
public final class t implements Z1.m, Z1.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Z1.s f2751e;

    public /* synthetic */ t(Z1.s sVar, int i5) {
        this.f2750d = i5;
        this.f2751e = sVar;
    }

    @Override // Z1.j
    public void a(Status status) {
        int i5 = status.f5238e;
        if (i5 == 17011 || i5 == 17021 || i5 == 17005 || i5 == 17091) {
            this.f2751e.a();
        }
    }

    @Override // Z1.m
    public final void c(C0382z4 c0382z4, Z1.t tVar) {
        switch (this.f2750d) {
            case 0:
                AbstractC0203C.e(c0382z4);
                AbstractC0203C.e(tVar);
                tVar.f2896d = c0382z4;
                FirebaseAuth.d(this.f2751e, tVar, c0382z4, true, false);
                break;
            default:
                AbstractC0203C.e(c0382z4);
                AbstractC0203C.e(tVar);
                tVar.f2896d = c0382z4;
                FirebaseAuth.d(this.f2751e, tVar, c0382z4, true, true);
                break;
        }
    }
}
