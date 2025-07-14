package B0;

import J.P;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import j0.C0544m;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f132b = false;

    /* renamed from: c, reason: collision with root package name */
    public final Object f133c;

    public i(View view) {
        this.f133c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f131a) {
            case 1:
                this.f132b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Object obj = this.f133c;
        switch (this.f131a) {
            case 0:
                C0004c c0004c = A.f98a;
                View view = (View) obj;
                view.setTransitionAlpha(1.0f);
                if (this.f132b) {
                    view.setLayerType(0, null);
                    break;
                }
                break;
            default:
                if (!this.f132b) {
                    C0544m c0544m = (C0544m) obj;
                    if (((Float) c0544m.f7254z.getAnimatedValue()).floatValue() != 0.0f) {
                        c0544m.f7229A = 2;
                        c0544m.f7247s.invalidate();
                        break;
                    } else {
                        c0544m.f7229A = 0;
                        c0544m.g(0);
                        break;
                    }
                } else {
                    this.f132b = false;
                    break;
                }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f131a) {
            case 0:
                WeakHashMap weakHashMap = P.f1421a;
                View view = (View) this.f133c;
                if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
                    this.f132b = true;
                    view.setLayerType(2, null);
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public i(C0544m c0544m) {
        this.f133c = c0544m;
    }
}
