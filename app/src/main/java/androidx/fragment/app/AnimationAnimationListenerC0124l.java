package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import b3.AbstractC0219i;

/* renamed from: androidx.fragment.app.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0124l implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v0 f3883a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0125m f3884b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f3885c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0120h f3886d;

    public AnimationAnimationListenerC0124l(View view, C0120h c0120h, C0125m c0125m, v0 v0Var) {
        this.f3883a = v0Var;
        this.f3884b = c0125m;
        this.f3885c = view;
        this.f3886d = c0120h;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        AbstractC0219i.e("animation", animation);
        C0125m c0125m = this.f3884b;
        c0125m.f3889a.post(new RunnableC0116d(c0125m, this.f3885c, this.f3886d));
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f3883a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        AbstractC0219i.e("animation", animation);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        AbstractC0219i.e("animation", animation);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f3883a + " has reached onAnimationStart.");
        }
    }
}
