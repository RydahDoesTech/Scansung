package j0;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: j0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0537f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7160a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f7161b;

    public /* synthetic */ C0537f(RecyclerView recyclerView, int i5) {
        this.f7160a = i5;
        this.f7161b = recyclerView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f7160a) {
            case 0:
                this.f7161b.invalidate();
                break;
            default:
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                RecyclerView recyclerView = this.f7161b;
                recyclerView.f4842t1 = iIntValue;
                recyclerView.invalidate();
                break;
        }
    }
}
