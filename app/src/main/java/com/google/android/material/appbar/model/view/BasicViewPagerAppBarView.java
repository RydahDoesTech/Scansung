package com.google.android.material.appbar.model.view;

import A.p;
import E1.u;
import P2.n;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import b3.AbstractC0215e;
import b3.AbstractC0219i;
import com.wssyncmldm.R;
import j0.AbstractC0510A;
import j0.b0;
import java.util.ArrayList;
import k.C0614d1;
import k.C0617e1;
import k.C0620f1;
import kotlin.Metadata;
import x1.C0910b;
import x1.C0911c;

@Metadata(d1 = {"\u0000Y\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001-\b'\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\fH\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0010J\u001d\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0019\u0010\u0010R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010#\u001a\n \"*\u0004\u0018\u00010!0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010%\u001a\n \"*\u0004\u0018\u00010!0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lcom/google/android/material/appbar/model/view/BasicViewPagerAppBarView;", "Lcom/google/android/material/appbar/model/view/ViewPagerAppBarView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "", "index", "LO2/l;", "moveNextAndRemove", "(Landroidx/viewpager2/widget/ViewPager2;I)V", "internalRemoveItem", "(I)V", "count", "initIndicator", "addIndicator", "()V", "position", "removeIndicator", "", "animate", "removeItem", "(IZ)V", "", "deleteScaleDuration", "J", "deleteAlphaDuration", "isDeleteAnimatorRunning", "Z", "Landroid/animation/PropertyValuesHolder;", "kotlin.jvm.PlatformType", "deleteScaleX", "Landroid/animation/PropertyValuesHolder;", "deleteScaleY", "Landroid/animation/ValueAnimator;", "deleteScaleAnimator", "Landroid/animation/ValueAnimator;", "deleteAlphaAnimator", "Landroid/animation/AnimatorSet;", "deleteAnimator", "Landroid/animation/AnimatorSet;", "x1/b", "pageChangeCallback", "Lx1/b;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class BasicViewPagerAppBarView extends ViewPagerAppBarView {
    private final ValueAnimator deleteAlphaAnimator;
    private final long deleteAlphaDuration;
    private AnimatorSet deleteAnimator;
    private ValueAnimator deleteScaleAnimator;
    private final long deleteScaleDuration;
    private final PropertyValuesHolder deleteScaleX;
    private final PropertyValuesHolder deleteScaleY;
    private boolean isDeleteAnimatorRunning;
    private final C0910b pageChangeCallback;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BasicViewPagerAppBarView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        AbstractC0219i.e("context", context);
    }

    private final void internalRemoveItem(int index) {
        removeItem(index);
        removeIndicator(index);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveNextAndRemove(ViewPager2 viewPager, int index) {
        AbstractC0510A adapter = viewPager.getAdapter();
        if (adapter == null || index < 0 || index >= adapter.a()) {
            return;
        }
        if (index != viewPager.getCurrentItem()) {
            removeItem(index);
            return;
        }
        int iA = adapter.a();
        int i5 = index == iA + (-1) ? index - 1 : index < iA ? index + 1 : index;
        this.isDeleteAnimatorRunning = true;
        viewPager.c(i5);
        viewPager.postDelayed(new p(index, this, 3), 250L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void moveNextAndRemove$lambda$11$lambda$10(BasicViewPagerAppBarView basicViewPagerAppBarView, int i5) {
        AbstractC0219i.e("this$0", basicViewPagerAppBarView);
        basicViewPagerAppBarView.isDeleteAnimatorRunning = false;
        basicViewPagerAppBarView.removeItem(i5);
    }

    public final void addIndicator() throws Resources.NotFoundException {
        C0620f1 indicator = getIndicator();
        if (indicator != null) {
            Context context = indicator.getContext();
            AbstractC0219i.d("context", context);
            C0614d1 c0614d1 = new C0614d1(context);
            c0614d1.f7656d = indicator.f;
            c0614d1.a(c0614d1.f);
            c0614d1.f7657e = indicator.f7664g;
            c0614d1.a(c0614d1.f);
            c0614d1.setOnClickListener(new u(5, indicator));
            indicator.f7662d.add(c0614d1);
            c0614d1.setAccessibilityDelegate(new C0617e1(indicator, c0614d1));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            int dimensionPixelSize = indicator.getContext().getResources().getDimensionPixelSize(R.dimen.sesl_viewpager_indicator_horizontal_padding);
            layoutParams.setMargins(dimensionPixelSize, 0, dimensionPixelSize, 0);
            indicator.addView(c0614d1, layoutParams);
            if (indicator.f7665h == -1) {
                indicator.setSelectedPosition(0);
            }
        }
    }

    public final void initIndicator(int count) throws Resources.NotFoundException {
        if (count > 1) {
            for (int i5 = 0; i5 < count; i5++) {
                addIndicator();
            }
        }
        ViewPager2 viewpager = getViewpager();
        if (viewpager != null) {
            ((ArrayList) viewpager.f.f721b).add(this.pageChangeCallback);
        }
    }

    public final void removeIndicator(int position) {
        AbstractC0510A adapter;
        C0620f1 indicator = getIndicator();
        if (indicator != null) {
            indicator.b(position);
            ViewPager2 viewpager = getViewpager();
            if (viewpager == null || (adapter = viewpager.getAdapter()) == null || adapter.a() != 1) {
                return;
            }
            indicator.b(position);
        }
    }

    public abstract void removeItem(int index);

    public final void removeItem(int index, boolean animate) {
        AbstractC0510A adapter;
        b0 b0VarQ;
        View view;
        if (!animate) {
            internalRemoveItem(index);
            return;
        }
        ViewPager2 viewpager = getViewpager();
        if (viewpager == null || (adapter = viewpager.getAdapter()) == null || index < 0 || index >= adapter.a() || viewpager.getChildCount() < 0) {
            return;
        }
        View childAt = viewpager.getChildAt(0);
        if (childAt == null) {
            throw new IndexOutOfBoundsException("Index: 0, Size: " + viewpager.getChildCount());
        }
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView == null || (b0VarQ = recyclerView.Q(index)) == null || (view = b0VarQ.f7128a) == null) {
            internalRemoveItem(index);
            return;
        }
        if (this.deleteAnimator == null) {
            if (this.deleteScaleAnimator == null) {
                ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, this.deleteScaleX, this.deleteScaleY);
                objectAnimatorOfPropertyValuesHolder.setDuration(this.deleteScaleDuration);
                objectAnimatorOfPropertyValuesHolder.setInterpolator(AnimationUtils.loadInterpolator(getContext(), R.interpolator.sesl_interpolator_22_25_0_1));
                this.deleteScaleAnimator = objectAnimatorOfPropertyValuesHolder;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            ValueAnimator valueAnimator = this.deleteScaleAnimator;
            if (valueAnimator == null) {
                AbstractC0219i.g("deleteScaleAnimator");
                throw null;
            }
            animatorSet.playTogether(n.h0(valueAnimator, this.deleteAlphaAnimator));
            this.deleteAnimator = animatorSet;
        }
        ValueAnimator valueAnimator2 = this.deleteAlphaAnimator;
        valueAnimator2.removeAllListeners();
        valueAnimator2.addListener(new C0911c(this, viewpager, index));
        AnimatorSet animatorSet2 = this.deleteAnimator;
        if (animatorSet2 == null) {
            AbstractC0219i.g("deleteAnimator");
            throw null;
        }
        animatorSet2.setTarget(view);
        animatorSet2.start();
    }

    public /* synthetic */ BasicViewPagerAppBarView(Context context, AttributeSet attributeSet, int i5, AbstractC0215e abstractC0215e) {
        this(context, (i5 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicViewPagerAppBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0219i.e("context", context);
        this.deleteScaleDuration = 350L;
        this.deleteAlphaDuration = 150L;
        this.deleteScaleX = PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f, 0.9f);
        this.deleteScaleY = PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f, 0.9f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) View.ALPHA, 0.0f);
        objectAnimatorOfFloat.setDuration(150L);
        objectAnimatorOfFloat.setInterpolator(AnimationUtils.loadInterpolator(context, R.interpolator.sesl_interpolator_0_0_1_1));
        this.deleteAlphaAnimator = objectAnimatorOfFloat;
        this.pageChangeCallback = new C0910b(this);
    }
}
