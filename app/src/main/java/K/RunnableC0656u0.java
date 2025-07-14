package k;

import java.util.WeakHashMap;

/* renamed from: k.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0656u0 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7820d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0662x0 f7821e;

    public /* synthetic */ RunnableC0656u0(C0662x0 c0662x0, int i5) {
        this.f7820d = i5;
        this.f7821e = c0662x0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0662x0 c0662x0 = this.f7821e;
        switch (this.f7820d) {
            case 0:
                C0637l0 c0637l0 = c0662x0.f;
                if (c0637l0 != null) {
                    c0637l0.setListSelectionHidden(true);
                    c0637l0.requestLayout();
                    break;
                }
                break;
            default:
                C0637l0 c0637l02 = c0662x0.f;
                if (c0637l02 != null) {
                    WeakHashMap weakHashMap = J.P.f1421a;
                    if (c0637l02.isAttachedToWindow() && c0662x0.f.getCount() > c0662x0.f.getChildCount() && c0662x0.f.getChildCount() <= c0662x0.n) {
                        c0662x0.f7836A.setInputMethodMode(2);
                        c0662x0.r();
                        break;
                    }
                }
                break;
        }
    }
}
