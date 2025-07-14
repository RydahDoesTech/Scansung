package androidx.preference;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class u implements View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f4684d;

    public u(z zVar) {
        this.f4684d = zVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        z zVar = this.f4684d;
        viewTreeObserver.removeOnPreDrawListener(zVar.mOnPreDrawListener);
        view.removeOnAttachStateChangeListener(this);
        zVar.mOnPreDrawListener = null;
    }
}
