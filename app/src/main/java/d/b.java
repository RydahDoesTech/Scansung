package d;

import android.animation.Animator;
import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import j0.AbstractC0515F;
import j0.C0542k;

/* loaded from: classes.dex */
public final class b implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6385a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6386b;

    public /* synthetic */ b(int i5, Object obj) {
        this.f6385a = i5;
        this.f6386b = obj;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i5 = this.f6385a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f6385a) {
            case 0:
                ((c) this.f6386b).a(((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue());
                break;
            default:
                RecyclerView recyclerView = (RecyclerView) this.f6386b;
                recyclerView.f4740F0 = null;
                recyclerView.f4742G0 = false;
                recyclerView.f4745H0 = false;
                AbstractC0515F itemAnimator = recyclerView.getItemAnimator();
                if (itemAnimator instanceof C0542k) {
                    ((C0542k) itemAnimator).f7214p = 0;
                }
                recyclerView.invalidate();
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i5 = this.f6385a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i5 = this.f6385a;
    }
}
