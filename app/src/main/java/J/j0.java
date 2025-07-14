package J;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class j0 extends i0 {

    /* renamed from: e, reason: collision with root package name */
    public B.c f1470e;

    public j0(p0 p0Var, WindowInsets windowInsets) {
        super(p0Var, windowInsets);
        this.f1470e = null;
    }

    @Override // J.n0
    public p0 b() {
        return p0.f(this.f1465c.consumeStableInsets(), null);
    }

    @Override // J.n0
    public p0 c() {
        return p0.f(this.f1465c.consumeSystemWindowInsets(), null);
    }

    @Override // J.n0
    public final B.c g() {
        if (this.f1470e == null) {
            WindowInsets windowInsets = this.f1465c;
            this.f1470e = B.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f1470e;
    }

    @Override // J.n0
    public boolean j() {
        return this.f1465c.isConsumed();
    }
}
