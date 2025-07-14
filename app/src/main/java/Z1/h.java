package Z1;

import a1.C0099g;
import a1.InterfaceC0094b;
import com.google.android.gms.internal.p000firebaseauthapi.R1;

/* loaded from: classes.dex */
public final class h implements InterfaceC0094b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2872a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2873b;

    public /* synthetic */ h(int i5, Object obj) {
        this.f2872a = i5;
        this.f2873b = obj;
    }

    @Override // a1.InterfaceC0094b
    public final void a(boolean z4) {
        switch (this.f2872a) {
            case 0:
                B.g gVar = (B.g) this.f2873b;
                if (!z4) {
                    gVar.getClass();
                    gVar.getClass();
                    break;
                } else {
                    gVar.getClass();
                    c cVar = (c) gVar.f95e;
                    cVar.f2865c.removeCallbacks(cVar.f2866d);
                    break;
                }
            default:
                R1 r12 = ((C0099g) this.f2873b).f2962i;
                r12.sendMessage(r12.obtainMessage(1, Boolean.valueOf(z4)));
                break;
        }
    }
}
