package com.google.android.material.appbar.model.view;

import G0.h;
import J2.b;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import b0.C0198c;
import b3.AbstractC0215e;
import b3.AbstractC0219i;
import com.wssyncmldm.R;
import java.util.ArrayList;
import k.C0620f1;
import kotlin.Metadata;
import x1.AbstractC0909a;
import z.AbstractC0939b;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010#\u001a\u0004\u0018\u00010\"8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/google/android/material/appbar/model/view/ViewPagerAppBarView;", "Lx1/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/content/res/ColorStateList;", "getViewPagerBackgroundColorStateList", "(Landroid/content/Context;)Landroid/content/res/ColorStateList;", "", "getViewPagerIndicatorOffColor", "(Landroid/content/Context;)I", "getViewPagerIndicatorOnColor", "LO2/l;", "inflate", "()V", "updateResource", "(Landroid/content/Context;)V", "Landroidx/viewpager2/widget/ViewPager2;", "viewpager", "Landroidx/viewpager2/widget/ViewPager2;", "getViewpager", "()Landroidx/viewpager2/widget/ViewPager2;", "setViewpager", "(Landroidx/viewpager2/widget/ViewPager2;)V", "Landroid/view/ViewGroup;", "bottomLayout", "Landroid/view/ViewGroup;", "getBottomLayout", "()Landroid/view/ViewGroup;", "setBottomLayout", "(Landroid/view/ViewGroup;)V", "Lk/f1;", "indicator", "Lk/f1;", "getIndicator", "()Lk/f1;", "setIndicator", "(Lk/f1;)V", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class ViewPagerAppBarView extends AbstractC0909a {
    private ViewGroup bottomLayout;
    private C0620f1 indicator;
    private ViewPager2 viewpager;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewPagerAppBarView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        AbstractC0219i.e("context", context);
    }

    private final ColorStateList getViewPagerBackgroundColorStateList(Context context) {
        int i5;
        AbstractC0219i.e("context", context);
        if (TextUtils.isEmpty(Settings.System.getString(context.getContentResolver(), "current_sec_active_themepackage"))) {
            i5 = b.I(context) ? R.color.sesl_viewpager_background : R.color.sesl_viewpager_background_dark;
        } else {
            b.I(context);
            i5 = R.color.sesl_viewpager_background_for_theme;
        }
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(AbstractC0939b.a(context, i5));
        AbstractC0219i.d("valueOf(\n            Ses…)\n            )\n        )", colorStateListValueOf);
        return colorStateListValueOf;
    }

    private final int getViewPagerIndicatorOffColor(Context context) {
        AbstractC0219i.e("context", context);
        return AbstractC0939b.a(context, TextUtils.isEmpty(Settings.System.getString(context.getContentResolver(), "current_sec_active_themepackage")) ? b.I(context) ? R.color.sesl_appbar_viewpager_indicator_off : R.color.sesl_appbar_viewpager_indicator_off_dark : b.I(context) ? R.color.sesl_appbar_viewpager_indicator_off_for_theme : R.color.sesl_appbar_viewpager_indicator_off_dark_for_theme);
    }

    private final int getViewPagerIndicatorOnColor(Context context) {
        int i5;
        AbstractC0219i.e("context", context);
        if (TextUtils.isEmpty(Settings.System.getString(context.getContentResolver(), "current_sec_active_themepackage"))) {
            b.I(context);
            i5 = R.color.sesl_appbar_viewpager_indicator_on;
        } else {
            b.I(context);
            i5 = R.color.sesl_appbar_viewpager_indicator_on_for_theme;
        }
        return AbstractC0939b.a(context, i5);
    }

    public final ViewGroup getBottomLayout() {
        return this.bottomLayout;
    }

    public final C0620f1 getIndicator() {
        return this.indicator;
    }

    public final ViewPager2 getViewpager() {
        return this.viewpager;
    }

    public void inflate() {
        Drawable drawableMutate;
        Drawable drawableMutate2;
        int i5;
        int i6 = 1;
        int i7 = 0;
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.sesl_app_bar_viewpager, (ViewGroup) this, false);
        ViewGroup viewGroup = viewInflate instanceof ViewGroup ? (ViewGroup) viewInflate : null;
        if (viewGroup == null) {
            return;
        }
        this.viewpager = (ViewPager2) viewGroup.findViewById(R.id.app_bar_viewpager);
        this.bottomLayout = (ViewGroup) viewGroup.findViewById(R.id.bottom_layout);
        Context context = getContext();
        AbstractC0219i.d("context", context);
        C0620f1 c0620f1 = new C0620f1(context, null);
        c0620f1.f7662d = new ArrayList();
        Drawable drawable = context.getDrawable(R.drawable.sesl_viewpager_indicator_on_off);
        if (drawable == null || (drawableMutate = drawable.mutate()) == null) {
            drawableMutate = null;
        } else {
            drawableMutate.setTint(AbstractC0939b.a(context, TextUtils.isEmpty(Settings.System.getString(context.getContentResolver(), "current_sec_active_themepackage")) ? b.I(context) ? R.color.sesl_appbar_viewpager_indicator_off : R.color.sesl_appbar_viewpager_indicator_off_dark : b.I(context) ? R.color.sesl_appbar_viewpager_indicator_off_for_theme : R.color.sesl_appbar_viewpager_indicator_off_dark_for_theme));
        }
        c0620f1.f = drawableMutate;
        Drawable drawable2 = context.getDrawable(R.drawable.sesl_viewpager_indicator_on_off);
        if (drawable2 == null || (drawableMutate2 = drawable2.mutate()) == null) {
            drawableMutate2 = null;
        } else {
            if (TextUtils.isEmpty(Settings.System.getString(context.getContentResolver(), "current_sec_active_themepackage"))) {
                b.I(context);
                i5 = R.color.sesl_appbar_viewpager_indicator_on;
            } else {
                b.I(context);
                i5 = R.color.sesl_appbar_viewpager_indicator_on_for_theme;
            }
            drawableMutate2.setTint(AbstractC0939b.a(context, i5));
        }
        c0620f1.f7664g = drawableMutate2;
        c0620f1.f7665h = -1;
        c0620f1.setOnItemClickListener(new C0198c(this));
        this.indicator = c0620f1;
        ViewPager2 viewPager2 = this.viewpager;
        if (viewPager2 != null) {
            viewPager2.f4975A = true;
            viewPager2.f4986m.setEdgeEffectEnabled(false);
            ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.95f).setDuration(400L);
            viewPager2.f4996x = duration;
            PathInterpolator pathInterpolator = ViewPager2.f4974D;
            duration.setInterpolator(pathInterpolator);
            viewPager2.f4996x.addUpdateListener(new h(viewPager2, i7));
            ValueAnimator duration2 = ValueAnimator.ofFloat(0.95f, 1.0f).setDuration(400L);
            viewPager2.f4997y = duration2;
            duration2.setInterpolator(pathInterpolator);
            viewPager2.f4997y.addUpdateListener(new h(viewPager2, i6));
            if (viewPager2.f4986m.getClipChildren()) {
                viewPager2.f4986m.setClipChildren(false);
            }
            Drawable drawable3 = viewPager2.getContext().getDrawable(R.drawable.sesl_viewpager_background);
            viewPager2.setBackground(drawable3 != null ? drawable3.mutate() : null);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        ViewGroup viewGroup2 = this.bottomLayout;
        if (viewGroup2 != null) {
            viewGroup2.addView(this.indicator, layoutParams);
        }
        Context context2 = getContext();
        AbstractC0219i.d("context", context2);
        updateResource(context2);
        addView(viewGroup);
    }

    public final void setBottomLayout(ViewGroup viewGroup) {
        this.bottomLayout = viewGroup;
    }

    public final void setIndicator(C0620f1 c0620f1) {
        this.indicator = c0620f1;
    }

    public final void setViewpager(ViewPager2 viewPager2) {
        this.viewpager = viewPager2;
    }

    public void updateResource(Context context) {
        Drawable drawableMutate;
        Drawable drawableMutate2;
        AbstractC0219i.e("context", context);
        ViewPager2 viewPager2 = this.viewpager;
        if (viewPager2 != null) {
            viewPager2.setBackgroundTintList(getViewPagerBackgroundColorStateList(context));
        }
        C0620f1 c0620f1 = this.indicator;
        if (c0620f1 != null) {
            Drawable drawable = context.getDrawable(R.drawable.sesl_viewpager_indicator_on_off);
            Drawable drawable2 = null;
            if (drawable == null || (drawableMutate = drawable.mutate()) == null) {
                drawableMutate = null;
            } else {
                drawableMutate.setTint(getViewPagerIndicatorOffColor(context));
            }
            c0620f1.setDefaultCircle(drawableMutate);
            Drawable drawable3 = context.getDrawable(R.drawable.sesl_viewpager_indicator_on_off);
            if (drawable3 != null && (drawableMutate2 = drawable3.mutate()) != null) {
                drawableMutate2.setTint(getViewPagerIndicatorOnColor(context));
                drawable2 = drawableMutate2;
            }
            c0620f1.setSelectCircle(drawable2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewPagerAppBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0219i.e("context", context);
        inflate();
    }

    public /* synthetic */ ViewPagerAppBarView(Context context, AttributeSet attributeSet, int i5, AbstractC0215e abstractC0215e) {
        this(context, (i5 & 2) != 0 ? null : attributeSet);
    }
}
