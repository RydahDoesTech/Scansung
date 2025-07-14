package J;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class i0 extends n0 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f1465c;

    /* renamed from: d, reason: collision with root package name */
    public B.c f1466d;

    public i0(p0 p0Var, WindowInsets windowInsets) {
        super(p0Var);
        this.f1466d = null;
        this.f1465c = windowInsets;
    }

    @Override // J.n0
    public final B.c h() {
        if (this.f1466d == null) {
            WindowInsets windowInsets = this.f1465c;
            this.f1466d = B.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f1466d;
    }

    @Override // J.n0
    public boolean k() {
        return this.f1465c.isRound();
    }

    @Override // J.n0
    public void l(B.c[] cVarArr) {
    }

    @Override // J.n0
    public void m(p0 p0Var) {
    }
}
