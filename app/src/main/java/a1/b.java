package A1;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import j0.C0544m;

/* loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f51b;

    public /* synthetic */ b(int i5, Object obj) {
        this.f50a = i5;
        this.f51b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50a) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                O1.g gVar = ((BottomSheetBehavior) this.f51b).f5775i;
                if (gVar != null) {
                    O1.f fVar = gVar.f1931d;
                    if (fVar.f1923i != fFloatValue) {
                        fVar.f1923i = fFloatValue;
                        gVar.f1934h = true;
                        gVar.invalidateSelf();
                        break;
                    }
                }
                break;
            case 1:
                ((TextInputLayout) this.f51b).f6046z0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0544m c0544m = (C0544m) this.f51b;
                c0544m.f7233c.setAlpha(iFloatValue);
                c0544m.f7234d.setAlpha(iFloatValue);
                c0544m.f7247s.invalidate();
                break;
        }
    }
}
