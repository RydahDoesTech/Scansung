package k;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.SeslSeekBar;

/* loaded from: classes.dex */
public final class S0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7544a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X0 f7545b;

    public /* synthetic */ S0(X0 x02, int i5) {
        this.f7544a = i5;
        this.f7545b = x02;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) throws NoSuchFieldException, SecurityException {
        switch (this.f7544a) {
            case 0:
                X0.v((SeslSeekBar) this.f7545b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                X0 x02 = this.f7545b;
                x02.f7600Q0 = iIntValue;
                int i5 = x02.f7600Q0;
                Drawable drawable = x02.f3385H;
                if (drawable != null) {
                    Drawable drawableFindDrawableByLayerId = drawable instanceof LayerDrawable ? ((LayerDrawable) drawable).findDrawableByLayerId(R.id.progress) : null;
                    if (drawableFindDrawableByLayerId != null) {
                        drawableFindDrawableByLayerId.setLevel(i5);
                    }
                }
                float f = i5 / 10000.0f;
                Drawable drawable2 = x02.f7614h0;
                if (drawable2 != null) {
                    x02.E(x02.getWidth(), drawable2, f, Integer.MIN_VALUE);
                    x02.invalidate();
                    break;
                }
                break;
        }
    }
}
