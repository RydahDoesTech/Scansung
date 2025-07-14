package R1;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.BlendMode;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.graphics.drawable.SeslRecoilDrawable;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2383a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2384b;

    public /* synthetic */ h(int i5, Object obj) {
        this.f2383a = i5;
        this.f2384b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object obj = this.f2384b;
        switch (this.f2383a) {
            case 0:
                k kVar = (k) obj;
                kVar.getClass();
                kVar.f2426d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                d.c cVar = (d.c) obj;
                cVar.getClass();
                cVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                LinearInterpolator linearInterpolator = SeslRecoilDrawable.n;
                SeslRecoilDrawable seslRecoilDrawable = (SeslRecoilDrawable) obj;
                int iA = seslRecoilDrawable.a();
                Drawable drawableFindDrawableByLayerId = seslRecoilDrawable.findDrawableByLayerId(R.id.mask);
                if (drawableFindDrawableByLayerId != null) {
                    drawableFindDrawableByLayerId.setTint(iA);
                } else {
                    seslRecoilDrawable.setTintBlendMode(BlendMode.HARD_LIGHT);
                    seslRecoilDrawable.setTint(iA);
                }
                seslRecoilDrawable.invalidateSelf();
                break;
        }
    }
}
