package j0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: j0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0538g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f7164a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7165b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f7166c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7167d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f7168e;
    public final /* synthetic */ C0542k f;

    public C0538g(C0542k c0542k, b0 b0Var, int i5, View view, int i6, ViewPropertyAnimator viewPropertyAnimator) {
        this.f = c0542k;
        this.f7164a = b0Var;
        this.f7165b = i5;
        this.f7166c = view;
        this.f7167d = i6;
        this.f7168e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i5 = this.f7165b;
        View view = this.f7166c;
        if (i5 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f7167d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f7168e.setListener(null);
        C0542k c0542k = this.f;
        b0 b0Var = this.f7164a;
        c0542k.c(b0Var);
        c0542k.f7212m.remove(b0Var);
        c0542k.i();
        int i5 = c0542k.f7214p;
        if ((i5 & 2) != 0) {
            c0542k.f7214p = i5 & (-3);
        }
        int i6 = c0542k.f7214p;
        if ((i6 & 8) != 0) {
            c0542k.f7214p = i6 | 16;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f.getClass();
    }
}
