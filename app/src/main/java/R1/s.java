package R1;

import J.P;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;
import com.wssyncmldm.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import v1.AbstractC0886a;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f2434A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f2435B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2436a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2437b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2438c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f2439d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f2440e;
    public final TimeInterpolator f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f2441g;

    /* renamed from: h, reason: collision with root package name */
    public final TextInputLayout f2442h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f2443i;

    /* renamed from: j, reason: collision with root package name */
    public int f2444j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f2445k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f2446l;

    /* renamed from: m, reason: collision with root package name */
    public final float f2447m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public int f2448o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f2449p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2450q;

    /* renamed from: r, reason: collision with root package name */
    public AppCompatTextView f2451r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f2452s;

    /* renamed from: t, reason: collision with root package name */
    public int f2453t;

    /* renamed from: u, reason: collision with root package name */
    public int f2454u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f2455v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f2456w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f2457x;

    /* renamed from: y, reason: collision with root package name */
    public AppCompatTextView f2458y;

    /* renamed from: z, reason: collision with root package name */
    public int f2459z;

    public s(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f2441g = context;
        this.f2442h = textInputLayout;
        this.f2447m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f2436a = J2.b.T(context, R.attr.motionDurationShort4, 217);
        this.f2437b = J2.b.T(context, R.attr.motionDurationMedium4, 167);
        this.f2438c = J2.b.T(context, R.attr.motionDurationShort4, 167);
        this.f2439d = J2.b.U(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC0886a.f9220d);
        LinearInterpolator linearInterpolator = AbstractC0886a.f9217a;
        this.f2440e = J2.b.U(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f = J2.b.U(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(AppCompatTextView appCompatTextView, int i5) {
        if (this.f2443i == null && this.f2445k == null) {
            Context context = this.f2441g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f2443i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f2443i;
            TextInputLayout textInputLayout = this.f2442h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f2445k = new FrameLayout(context);
            this.f2443i.addView(this.f2445k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i5 == 0 || i5 == 1) {
            this.f2445k.setVisibility(0);
            this.f2445k.addView(appCompatTextView);
        } else {
            this.f2443i.addView(appCompatTextView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f2443i.setVisibility(0);
        this.f2444j++;
    }

    public final void b() {
        if (this.f2443i != null) {
            TextInputLayout textInputLayout = this.f2442h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f2441g;
                boolean zY = V1.a.Y(context);
                LinearLayout linearLayout = this.f2443i;
                WeakHashMap weakHashMap = P.f1421a;
                int paddingStart = editText.getPaddingStart();
                if (zY) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zY) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zY) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f2446l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z4, AppCompatTextView appCompatTextView, int i5, int i6, int i7) {
        if (appCompatTextView == null || !z4) {
            return;
        }
        if (i5 == i7 || i5 == i6) {
            boolean z5 = i7 == i5;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.ALPHA, z5 ? 1.0f : 0.0f);
            int i8 = this.f2438c;
            objectAnimatorOfFloat.setDuration(z5 ? this.f2437b : i8);
            objectAnimatorOfFloat.setInterpolator(z5 ? this.f2440e : this.f);
            if (i5 == i7 && i6 != 0) {
                objectAnimatorOfFloat.setStartDelay(i8);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i7 != i5 || i6 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.TRANSLATION_Y, -this.f2447m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f2436a);
            objectAnimatorOfFloat2.setInterpolator(this.f2439d);
            objectAnimatorOfFloat2.setStartDelay(i8);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    public final TextView e(int i5) {
        if (i5 == 1) {
            return this.f2451r;
        }
        if (i5 != 2) {
            return null;
        }
        return this.f2458y;
    }

    public final void f() {
        this.f2449p = null;
        c();
        if (this.n == 1) {
            if (!this.f2457x || TextUtils.isEmpty(this.f2456w)) {
                this.f2448o = 0;
            } else {
                this.f2448o = 2;
            }
        }
        i(this.n, h(this.f2451r, ""), this.f2448o);
    }

    public final void g(AppCompatTextView appCompatTextView, int i5) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f2443i;
        if (linearLayout == null) {
            return;
        }
        if ((i5 == 0 || i5 == 1) && (frameLayout = this.f2445k) != null) {
            frameLayout.removeView(appCompatTextView);
        } else {
            linearLayout.removeView(appCompatTextView);
        }
        int i6 = this.f2444j - 1;
        this.f2444j = i6;
        LinearLayout linearLayout2 = this.f2443i;
        if (i6 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(AppCompatTextView appCompatTextView, CharSequence charSequence) {
        WeakHashMap weakHashMap = P.f1421a;
        TextInputLayout textInputLayout = this.f2442h;
        return textInputLayout.isLaidOut() && textInputLayout.isEnabled() && !(this.f2448o == this.n && appCompatTextView != null && TextUtils.equals(appCompatTextView.getText(), charSequence));
    }

    public final void i(int i5, boolean z4, int i6) {
        TextView textViewE;
        TextView textViewE2;
        if (i5 == i6) {
            return;
        }
        if (z4) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f2446l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f2457x, this.f2458y, 2, i5, i6);
            d(arrayList, this.f2450q, this.f2451r, 1, i5, i6);
            int size = arrayList.size();
            long jMax = 0;
            for (int i7 = 0; i7 < size; i7++) {
                Animator animator = (Animator) arrayList.get(i7);
                jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
            valueAnimatorOfInt.setDuration(jMax);
            arrayList.add(0, valueAnimatorOfInt);
            animatorSet.playTogether(arrayList);
            animatorSet.addListener(new q(this, i6, e(i5), i5, e(i6)));
            animatorSet.start();
        } else if (i5 != i6) {
            if (i6 != 0 && (textViewE2 = e(i6)) != null) {
                textViewE2.setVisibility(0);
                textViewE2.setAlpha(1.0f);
            }
            if (i5 != 0 && (textViewE = e(i5)) != null) {
                textViewE.setVisibility(4);
                if (i5 == 1) {
                    textViewE.setText((CharSequence) null);
                }
            }
            this.n = i6;
        }
        TextInputLayout textInputLayout = this.f2442h;
        textInputLayout.r();
        textInputLayout.u(z4, false);
        textInputLayout.x();
    }
}
