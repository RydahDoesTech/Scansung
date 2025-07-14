package d;

import R1.h;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: g, reason: collision with root package name */
    public static Interpolator f6387g;

    /* renamed from: h, reason: collision with root package name */
    public static Interpolator f6388h;

    /* renamed from: a, reason: collision with root package name */
    public View f6389a;

    /* renamed from: b, reason: collision with root package name */
    public float f6390b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6391c;

    /* renamed from: d, reason: collision with root package name */
    public final ValueAnimator f6392d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6393e = false;
    public final Context f;

    public c(View view, Context context) {
        this.f6391c = false;
        this.f6389a = view;
        this.f = context;
        if (view instanceof ViewGroup) {
            this.f6391c = true;
        } else {
            this.f6391c = false;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f);
        this.f6392d = valueAnimatorOfFloat;
        if (f6387g == null) {
            f6387g = AnimationUtils.loadInterpolator(context, R.anim.sesl_recoil_pressed);
        }
        if (f6388h == null) {
            f6388h = AnimationUtils.loadInterpolator(context, R.anim.sesl_recoil_released);
        }
        valueAnimatorOfFloat.addUpdateListener(new h(1, this));
        valueAnimatorOfFloat.addListener(new b(0, this));
    }

    public final void a(float f) {
        if (this.f6391c) {
            View view = this.f6389a;
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                    View childAt = viewGroup.getChildAt(i5);
                    Matrix matrix = new Matrix();
                    float width = (this.f6389a.getWidth() / 2.0f) - childAt.getLeft();
                    float height = (this.f6389a.getHeight() / 2.0f) - childAt.getTop();
                    matrix.setTranslate(-width, -height);
                    matrix.postScale(f, f);
                    matrix.postTranslate(width, height);
                    childAt.setAnimationMatrix(matrix);
                }
                return;
            }
        }
        this.f6389a.setScaleX(f);
        this.f6389a.setScaleY(f);
    }

    public final boolean b() {
        return this.f6393e || this.f6392d.isRunning();
    }
}
