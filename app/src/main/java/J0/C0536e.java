package j0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: j0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0536e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7154a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f7155b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f7156c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f7157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0542k f7158e;

    public C0536e(C0542k c0542k, b0 b0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f7158e = c0542k;
        this.f7155b = b0Var;
        this.f7157d = viewPropertyAnimator;
        this.f7156c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f7154a) {
            case 1:
                this.f7156c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f7154a) {
            case 0:
                this.f7157d.setListener(null);
                this.f7156c.setAlpha(1.0f);
                b0 b0Var = this.f7155b;
                C0542k c0542k = this.f7158e;
                c0542k.c(b0Var);
                c0542k.n.remove(b0Var);
                c0542k.i();
                int i5 = c0542k.f7214p;
                if ((i5 & 1) != 0) {
                    c0542k.f7214p = i5 & (-2);
                    break;
                }
                break;
            default:
                this.f7157d.setListener(null);
                b0 b0Var2 = this.f7155b;
                C0542k c0542k2 = this.f7158e;
                c0542k2.c(b0Var2);
                c0542k2.f7211l.remove(b0Var2);
                c0542k2.i();
                int i6 = c0542k2.f7214p;
                if ((i6 & 8) != 0) {
                    c0542k2.f7214p = i6 & (-9);
                }
                int i7 = c0542k2.f7214p;
                if ((i7 & 16) != 0) {
                    c0542k2.f7214p = i7 & (-17);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f7154a) {
            case 0:
                this.f7158e.getClass();
                break;
            default:
                this.f7158e.getClass();
                break;
        }
    }

    public C0536e(C0542k c0542k, b0 b0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f7158e = c0542k;
        this.f7155b = b0Var;
        this.f7156c = view;
        this.f7157d = viewPropertyAnimator;
    }
}
