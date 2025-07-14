package J;

import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: b, reason: collision with root package name */
    public static final p0 f1480b = m0.f;

    /* renamed from: a, reason: collision with root package name */
    public final n0 f1481a;

    public p0(WindowInsets windowInsets) {
        this.f1481a = new m0(this, windowInsets);
    }

    public static p0 f(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        p0 p0Var = new p0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = P.f1421a;
            p0 p0VarA = I.a(view);
            n0 n0Var = p0Var.f1481a;
            n0Var.m(p0VarA);
            n0Var.d(view.getRootView());
        }
        return p0Var;
    }

    public final int a() {
        return this.f1481a.h().f90d;
    }

    public final int b() {
        return this.f1481a.h().f87a;
    }

    public final int c() {
        return this.f1481a.h().f89c;
    }

    public final int d() {
        return this.f1481a.h().f88b;
    }

    public final WindowInsets e() {
        n0 n0Var = this.f1481a;
        if (n0Var instanceof i0) {
            return ((i0) n0Var).f1465c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        return Objects.equals(this.f1481a, ((p0) obj).f1481a);
    }

    public final int hashCode() {
        n0 n0Var = this.f1481a;
        if (n0Var == null) {
            return 0;
        }
        return n0Var.hashCode();
    }

    public p0() {
        this.f1481a = new n0(this);
    }
}
