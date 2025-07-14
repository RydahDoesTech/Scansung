package J;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class f0 extends h0 {

    /* renamed from: b, reason: collision with root package name */
    public final WindowInsets.Builder f1456b;

    public f0() {
        this.f1456b = new WindowInsets.Builder();
    }

    @Override // J.h0
    public p0 b() {
        a();
        p0 p0VarF = p0.f(this.f1456b.build(), null);
        p0VarF.f1481a.l(null);
        return p0VarF;
    }

    @Override // J.h0
    public void c(B.c cVar) {
        this.f1456b.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // J.h0
    public void d(B.c cVar) {
        this.f1456b.setSystemGestureInsets(cVar.d());
    }

    @Override // J.h0
    public void e(B.c cVar) {
        this.f1456b.setSystemWindowInsets(cVar.d());
    }

    @Override // J.h0
    public void f(B.c cVar) {
        this.f1456b.setTappableElementInsets(cVar.d());
    }

    public void g(B.c cVar) {
        this.f1456b.setStableInsets(cVar.d());
    }

    public f0(p0 p0Var) {
        WindowInsets.Builder builder;
        super(p0Var);
        WindowInsets windowInsetsE = p0Var.e();
        if (windowInsetsE != null) {
            builder = new WindowInsets.Builder(windowInsetsE);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.f1456b = builder;
    }
}
