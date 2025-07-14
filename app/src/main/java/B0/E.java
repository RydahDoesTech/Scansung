package B0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class E extends AnimatorListenerAdapter implements s {

    /* renamed from: a, reason: collision with root package name */
    public final View f103a;

    /* renamed from: b, reason: collision with root package name */
    public final int f104b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f105c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f107e;
    public boolean f = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f106d = true;

    public E(int i5, View view) {
        this.f103a = view;
        this.f104b = i5;
        this.f105c = (ViewGroup) view.getParent();
        f(true);
    }

    @Override // B0.s
    public final void a() {
    }

    @Override // B0.s
    public final void b(t tVar) {
    }

    @Override // B0.s
    public final void c() {
        f(false);
    }

    @Override // B0.s
    public final void d(t tVar) {
        if (!this.f) {
            C0004c c0004c = A.f98a;
            this.f103a.setTransitionVisibility(this.f104b);
            ViewGroup viewGroup = this.f105c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
        tVar.w(this);
    }

    @Override // B0.s
    public final void e() {
        f(true);
    }

    public final void f(boolean z4) {
        ViewGroup viewGroup;
        if (!this.f106d || this.f107e == z4 || (viewGroup = this.f105c) == null) {
            return;
        }
        this.f107e = z4;
        viewGroup.suppressLayout(z4);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f) {
            C0004c c0004c = A.f98a;
            this.f103a.setTransitionVisibility(this.f104b);
            ViewGroup viewGroup = this.f105c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        if (this.f) {
            return;
        }
        C0004c c0004c = A.f98a;
        this.f103a.setTransitionVisibility(this.f104b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (this.f) {
            return;
        }
        C0004c c0004c = A.f98a;
        this.f103a.setTransitionVisibility(0);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
