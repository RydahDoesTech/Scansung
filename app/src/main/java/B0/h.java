package B0;

import android.view.View;

/* loaded from: classes.dex */
public final class h extends u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129a;

    /* renamed from: b, reason: collision with root package name */
    public Object f130b;

    public /* synthetic */ h() {
        this.f129a = 2;
    }

    @Override // B0.u, B0.s
    public void b(t tVar) {
        switch (this.f129a) {
            case 2:
                y yVar = (y) this.f130b;
                if (!yVar.f185D) {
                    yVar.G();
                    yVar.f185D = true;
                    break;
                }
                break;
        }
    }

    @Override // B0.s
    public final void d(t tVar) {
        switch (this.f129a) {
            case 0:
                C0004c c0004c = A.f98a;
                ((View) this.f130b).setTransitionAlpha(1.0f);
                tVar.w(this);
                break;
            case 1:
                ((t) this.f130b).z();
                tVar.w(this);
                break;
            default:
                y yVar = (y) this.f130b;
                int i5 = yVar.f184C - 1;
                yVar.f184C = i5;
                if (i5 == 0) {
                    yVar.f185D = false;
                    yVar.n();
                }
                tVar.w(this);
                break;
        }
    }

    public /* synthetic */ h(int i5, Object obj) {
        this.f129a = i5;
        this.f130b = obj;
    }
}
