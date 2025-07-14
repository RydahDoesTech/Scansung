package R1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2369a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f2370b;

    public /* synthetic */ c(d dVar, int i5) {
        this.f2369a = i5;
        this.f2370b = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) throws Resources.NotFoundException {
        switch (this.f2369a) {
            case 1:
                this.f2370b.f2424b.h(false);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) throws Resources.NotFoundException {
        switch (this.f2369a) {
            case 0:
                this.f2370b.f2424b.h(true);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
