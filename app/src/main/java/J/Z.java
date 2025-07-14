package J;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f1434a;

    public Z(View view) {
        this.f1434a = new WeakReference(view);
    }

    public final void a(float f) {
        View view = (View) this.f1434a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void b() {
        View view = (View) this.f1434a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j5) {
        View view = (View) this.f1434a.get();
        if (view != null) {
            view.animate().setDuration(j5);
        }
    }

    public final void d(a0 a0Var) {
        View view = (View) this.f1434a.get();
        if (view != null) {
            if (a0Var != null) {
                view.animate().setListener(new B0.p(a0Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f) {
        View view = (View) this.f1434a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
