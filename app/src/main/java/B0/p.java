package B0;

import J.a0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import o.C0704b;

/* loaded from: classes.dex */
public final class p extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f145b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f146c;

    public p(a0 a0Var, View view) {
        this.f145b = a0Var;
        this.f146c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f144a) {
            case 1:
                ((a0) this.f145b).b();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f144a) {
            case 0:
                ((C0704b) this.f145b).remove(animator);
                ((t) this.f146c).f167p.remove(animator);
                break;
            default:
                ((a0) this.f145b).a();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f144a) {
            case 0:
                ((t) this.f146c).f167p.add(animator);
                break;
            default:
                ((a0) this.f145b).c();
                break;
        }
    }

    public p(t tVar, C0704b c0704b) {
        this.f146c = tVar;
        this.f145b = c0704b;
    }
}
