package j0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: j0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0539h extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7175a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0540i f7176b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f7177c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f7178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0542k f7179e;

    public /* synthetic */ C0539h(C0542k c0542k, C0540i c0540i, ViewPropertyAnimator viewPropertyAnimator, View view, int i5) {
        this.f7175a = i5;
        this.f7179e = c0542k;
        this.f7176b = c0540i;
        this.f7177c = viewPropertyAnimator;
        this.f7178d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f7175a) {
            case 0:
                this.f7177c.setListener(null);
                View view = this.f7178d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0540i c0540i = this.f7176b;
                b0 b0Var = c0540i.f7181a;
                C0542k c0542k = this.f7179e;
                c0542k.c(b0Var);
                c0542k.f7213o.remove(c0540i.f7181a);
                c0542k.i();
                int i5 = c0542k.f7214p;
                if ((i5 & 4) != 0) {
                    c0542k.f7214p = i5 & (-5);
                    break;
                }
                break;
            default:
                this.f7177c.setListener(null);
                View view2 = this.f7178d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0540i c0540i2 = this.f7176b;
                b0 b0Var2 = c0540i2.f7182b;
                C0542k c0542k2 = this.f7179e;
                c0542k2.c(b0Var2);
                c0542k2.f7213o.remove(c0540i2.f7182b);
                c0542k2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f7175a) {
            case 0:
                b0 b0Var = this.f7176b.f7181a;
                this.f7179e.getClass();
                break;
            default:
                b0 b0Var2 = this.f7176b.f7182b;
                this.f7179e.getClass();
                break;
        }
    }
}
