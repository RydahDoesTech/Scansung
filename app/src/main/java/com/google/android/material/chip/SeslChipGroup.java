package com.google.android.material.chip;

import B0.q;
import E1.k;
import E1.n;
import E1.o;
import E1.p;
import E1.r;
import J.P;
import android.animation.AnimatorListenerAdapter;
import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.google.android.material.chip.SeslChipGroup;
import com.wssyncmldm.R;
import java.util.Locale;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SeslChipGroup extends k {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f5839r = 0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5840m;
    public final LayoutTransition n;

    /* renamed from: o, reason: collision with root package name */
    public int f5841o;

    /* renamed from: p, reason: collision with root package name */
    public int f5842p;

    /* renamed from: q, reason: collision with root package name */
    public int f5843q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeslChipGroup(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        final int i5 = 0;
        final int i6 = 1;
        this.f5840m = true;
        LayoutTransition layoutTransition = new LayoutTransition();
        this.n = layoutTransition;
        this.f5843q = 0;
        getResources().getDimension(R.dimen.chip_start_width);
        setLayoutDirection(TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()));
        layoutTransition.enableTransitionType(2);
        layoutTransition.enableTransitionType(3);
        layoutTransition.enableTransitionType(4);
        layoutTransition.enableTransitionType(0);
        layoutTransition.enableTransitionType(1);
        layoutTransition.setStartDelay(2, 0L);
        layoutTransition.setStartDelay(3, 0L);
        layoutTransition.setStartDelay(4, 0L);
        layoutTransition.setStartDelay(0, 0L);
        layoutTransition.setStartDelay(1, 0L);
        int integer = getContext().getResources().getInteger(R.integer.sesl_chip_default_anim_duration);
        r rVarB = r.b(0.0f, 1.0f);
        long j5 = integer;
        rVarB.setDuration(j5);
        rVarB.setStartDelay(0L);
        rVarB.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: E1.l
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i5) {
                    case 0:
                        int i7 = SeslChipGroup.f5839r;
                        View view = (View) ((r) valueAnimator).f601d.get();
                        if (view != null) {
                            view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            break;
                        }
                        break;
                    default:
                        int i8 = SeslChipGroup.f5839r;
                        View view2 = (View) ((r) valueAnimator).f601d.get();
                        if (view2 != null) {
                            view2.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            break;
                        }
                        break;
                }
            }
        });
        rVarB.addListener(getAddRemAnimListener());
        layoutTransition.setAnimator(2, rVarB);
        r rVarB2 = r.b(1.0f, 0.0f);
        rVarB2.setDuration(j5);
        rVarB2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: E1.l
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i6) {
                    case 0:
                        int i7 = SeslChipGroup.f5839r;
                        View view = (View) ((r) valueAnimator).f601d.get();
                        if (view != null) {
                            view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            break;
                        }
                        break;
                    default:
                        int i8 = SeslChipGroup.f5839r;
                        View view2 = (View) ((r) valueAnimator).f601d.get();
                        if (view2 != null) {
                            view2.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            break;
                        }
                        break;
                }
            }
        });
        rVarB2.addListener(getAddRemAnimListener());
        layoutTransition.setAnimator(3, rVarB2);
        Interpolator interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(getContext(), R.interpolator.sesl_chip_default_interpolator);
        layoutTransition.setInterpolator(3, interpolatorLoadInterpolator);
        layoutTransition.setInterpolator(2, interpolatorLoadInterpolator);
        layoutTransition.setInterpolator(4, interpolatorLoadInterpolator);
        layoutTransition.setInterpolator(0, interpolatorLoadInterpolator);
        layoutTransition.setInterpolator(1, interpolatorLoadInterpolator);
        layoutTransition.addTransitionListener(getChipTransitionListener());
        setLayoutTransition(null);
    }

    private AnimatorListenerAdapter getAddRemAnimListener() {
        return new o();
    }

    private LayoutTransition.TransitionListener getChipTransitionListener() {
        return new n();
    }

    public final void a() {
        if (!c()) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.height = -2;
            this.f5843q = 0;
            setLayoutParams(layoutParams);
            return;
        }
        final int height = getHeight();
        final int iB = b(getWidth()) - height;
        if (Math.abs(iB) < getContext().getResources().getDimension(R.dimen.chip_height)) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(getContext().getResources().getInteger(R.integer.sesl_chip_default_anim_duration));
        valueAnimatorOfFloat.setInterpolator(AnimationUtils.loadInterpolator(getContext(), R.interpolator.sesl_chip_default_interpolator));
        valueAnimatorOfFloat.addListener(new q(2, this));
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: E1.m
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i5 = SeslChipGroup.f5839r;
                SeslChipGroup seslChipGroup = this.f598a;
                ViewGroup.LayoutParams layoutParams2 = seslChipGroup.getLayoutParams();
                int iFloatValue = height + ((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * iB));
                layoutParams2.height = iFloatValue;
                seslChipGroup.f5843q = iFloatValue;
                seslChipGroup.setLayoutParams(layoutParams2);
            }
        });
        valueAnimatorOfFloat.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            setLayoutTransition(this.n);
        } else {
            setLayoutTransition(null);
        }
        super.addView(view, i5, layoutParams);
        if (c()) {
            setLayoutTransition(null);
        }
        a();
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (this.f5840m) {
                int i6 = this.f5841o;
                if (i6 > 0) {
                    chip.setMaxWidth(i6);
                }
                chip.setEllipsize(TextUtils.TruncateAt.END);
            }
        }
    }

    public final int b(float f) {
        int i5;
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        int paddingStart = getPaddingStart();
        int paddingEnd = getPaddingEnd();
        int chipSpacingHorizontal = getChipSpacingHorizontal();
        int width = getChildAt(0).getWidth() + paddingStart + paddingEnd + chipSpacingHorizontal;
        int i6 = 1;
        for (int i7 = 1; i7 < childCount; i7++) {
            int intrinsicWidth = ((Chip) getChildAt(i7)).getChipDrawable().getIntrinsicWidth();
            if (width + intrinsicWidth < f) {
                i5 = intrinsicWidth + chipSpacingHorizontal + width;
            } else {
                i5 = intrinsicWidth + chipSpacingHorizontal + paddingStart + paddingEnd;
                i6++;
            }
            width = i5;
        }
        int chipSpacingVertical = getChipSpacingVertical();
        return (getPaddingTop() + (getPaddingBottom() + ((getChildAt(0).getHeight() + chipSpacingVertical) * i6))) - chipSpacingVertical;
    }

    public final boolean c() {
        boolean z4;
        return getHeight() != b((float) getWidth()) && (!(z4 = this.f) || (z4 && getChildCount() == 0));
    }

    public final void d() {
        this.f5843q = getHeight();
    }

    @Override // I1.d
    public int getRowCount() {
        return this.f5842p;
    }

    public int getTotalWidth() {
        int paddingEnd = getPaddingEnd() + getPaddingStart();
        int childCount = getChildCount();
        if (childCount <= 0) {
            return paddingEnd;
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            paddingEnd += getChildAt(i5).getWidth();
        }
        if (childCount <= 1) {
            return paddingEnd;
        }
        return paddingEnd + ((childCount - 2) * getChipSpacingHorizontal());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i5, int i6, int i7, int i8) {
        int marginEnd;
        int marginStart;
        int i9;
        int i10 = 1;
        if (getChildCount() == 0) {
            this.f5842p = 0;
            return;
        }
        this.f5842p = 1;
        WeakHashMap weakHashMap = P.f1421a;
        boolean z5 = getLayoutDirection() == 1;
        int paddingRight = z5 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z5 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int lineSpacing = getLineSpacing();
        int itemSpacing = getItemSpacing();
        int i11 = i7 - i5;
        int i12 = i11 - paddingLeft;
        if (!z5) {
            i11 = i12;
        }
        int measuredWidth = paddingRight;
        int i13 = paddingTop;
        for (int i14 = 0; i14 < getChildCount(); i14 += i10) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginStart = marginLayoutParams.getMarginStart();
                    marginEnd = marginLayoutParams.getMarginEnd();
                } else {
                    marginEnd = 0;
                    marginStart = 0;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + measuredWidth + marginStart;
                if (this.f || measuredWidth2 <= i12) {
                    i9 = 1;
                } else {
                    i13 = paddingTop + lineSpacing;
                    i9 = 1;
                    this.f5842p++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f5842p - i9));
                int i15 = measuredWidth + marginStart;
                int measuredWidth3 = childAt.getMeasuredWidth() + i15;
                paddingTop = childAt.getMeasuredHeight() + i13;
                if (z5) {
                    childAt.layout(i11 - measuredWidth3, i13, (i11 - measuredWidth) - marginStart, paddingTop);
                } else {
                    childAt.layout(i15, i13, measuredWidth3, paddingTop);
                }
                measuredWidth += childAt.getMeasuredWidth() + marginStart + marginEnd + itemSpacing;
                i10 = 1;
            }
        }
    }

    @Override // I1.d, android.view.View
    public final void onMeasure(int i5, int i6) {
        super.onMeasure(i5, i6);
        if (getChildCount() <= 0) {
            setMeasuredDimension(getWidth(), this.f5843q);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        d();
        super.removeAllViews();
        a();
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        d();
        super.removeAllViewsInLayout();
        a();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (getChildCount() > 1) {
            setLayoutTransition(this.n);
        } else {
            setLayoutTransition(null);
        }
        d();
        super.removeView(view);
        a();
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i5) {
        d();
        super.removeViewAt(i5);
        a();
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        d();
        super.removeViewInLayout(view);
        a();
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i5, int i6) {
        d();
        super.removeViews(i5, i6);
        a();
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i5, int i6) {
        d();
        super.removeViewsInLayout(i5, i6);
        a();
    }

    public void setDynamicTruncation(boolean z4) {
        this.f5840m = z4;
        Log.i("SeslChipGroup", "dynamic truncation state: " + z4);
    }

    public void setMaxChipWidth(int i5) {
        this.f5841o = i5 - (getPaddingEnd() + getPaddingStart());
    }

    public void setOnChipAddListener(p pVar) {
    }

    public void setOnChipRemovedListener(E1.q qVar) {
    }
}
