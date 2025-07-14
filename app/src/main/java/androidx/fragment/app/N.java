package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class N implements View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h0 f3730d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ O f3731e;

    public N(O o5, h0 h0Var) {
        this.f3731e = o5;
        this.f3730d = h0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        h0 h0Var = this.f3730d;
        h0Var.k();
        C0125m.i((ViewGroup) h0Var.f3844c.mView.getParent(), this.f3731e.f3732d).h();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
