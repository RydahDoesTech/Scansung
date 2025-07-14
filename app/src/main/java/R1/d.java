package R1;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.wssyncmldm.R;
import v1.AbstractC0886a;

/* loaded from: classes.dex */
public final class d extends p {

    /* renamed from: e, reason: collision with root package name */
    public final int f2371e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f2372g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f2373h;

    /* renamed from: i, reason: collision with root package name */
    public EditText f2374i;

    /* renamed from: j, reason: collision with root package name */
    public final E1.u f2375j;

    /* renamed from: k, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0089a f2376k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f2377l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f2378m;

    public d(o oVar) {
        super(oVar);
        this.f2375j = new E1.u(1, this);
        this.f2376k = new ViewOnFocusChangeListenerC0089a(this, 0);
        this.f2371e = J2.b.T(oVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f = J2.b.T(oVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f2372g = J2.b.U(oVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0886a.f9217a);
        this.f2373h = J2.b.U(oVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0886a.f9220d);
    }

    @Override // R1.p
    public final void a() {
        if (this.f2424b.f2416s != null) {
            return;
        }
        t(u());
    }

    @Override // R1.p
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // R1.p
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // R1.p
    public final View.OnFocusChangeListener e() {
        return this.f2376k;
    }

    @Override // R1.p
    public final View.OnClickListener f() {
        return this.f2375j;
    }

    @Override // R1.p
    public final View.OnFocusChangeListener g() {
        return this.f2376k;
    }

    @Override // R1.p
    public final void m(EditText editText) {
        this.f2374i = editText;
        this.f2423a.setEndIconVisible(u());
    }

    @Override // R1.p
    public final void p(boolean z4) {
        if (this.f2424b.f2416s == null) {
            return;
        }
        t(z4);
    }

    @Override // R1.p
    public final void r() {
        final int i5 = 1;
        final int i6 = 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f2373h);
        valueAnimatorOfFloat.setDuration(this.f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: R1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f2368b;

            {
                this.f2368b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i7 = i5;
                d dVar = this.f2368b;
                dVar.getClass();
                switch (i7) {
                    case 0:
                        dVar.f2426d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar.f2426d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f2372g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i7 = this.f2371e;
        valueAnimatorOfFloat2.setDuration(i7);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: R1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f2368b;

            {
                this.f2368b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i72 = i6;
                d dVar = this.f2368b;
                dVar.getClass();
                switch (i72) {
                    case 0:
                        dVar.f2426d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar.f2426d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f2377l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f2377l.addListener(new c(this, i6));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i7);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: R1.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f2368b;

            {
                this.f2368b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i72 = i6;
                d dVar = this.f2368b;
                dVar.getClass();
                switch (i72) {
                    case 0:
                        dVar.f2426d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar.f2426d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.f2378m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new c(this, i5));
    }

    @Override // R1.p
    public final void s() {
        EditText editText = this.f2374i;
        if (editText != null) {
            editText.post(new C1.b(4, this));
        }
    }

    public final void t(boolean z4) {
        boolean z5 = this.f2424b.d() == z4;
        if (z4 && !this.f2377l.isRunning()) {
            this.f2378m.cancel();
            this.f2377l.start();
            if (z5) {
                this.f2377l.end();
                return;
            }
            return;
        }
        if (z4) {
            return;
        }
        this.f2377l.cancel();
        this.f2378m.start();
        if (z5) {
            this.f2378m.end();
        }
    }

    public final boolean u() {
        EditText editText = this.f2374i;
        return editText != null && (editText.hasFocus() || this.f2426d.hasFocus()) && this.f2374i.getText().length() > 0;
    }
}
