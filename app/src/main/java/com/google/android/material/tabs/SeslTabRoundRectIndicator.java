package com.google.android.material.tabs;

import J.P;
import J2.b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import com.wssyncmldm.R;
import java.util.WeakHashMap;
import z.AbstractC0938a;

/* loaded from: classes.dex */
public class SeslTabRoundRectIndicator extends View {
    public SeslTabRoundRectIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        new LinearInterpolator();
        new PathInterpolator(0.22f, 0.25f, 0.0f, 1.0f);
        Drawable drawableB = AbstractC0938a.b(context, b.I(context) ? R.drawable.sesl_tablayout_subtab_indicator_background_light : R.drawable.sesl_tablayout_subtab_indicator_background_dark);
        WeakHashMap weakHashMap = P.f1421a;
        setBackground(drawableB);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i5) {
        super.onVisibilityChanged(view, i5);
        if (i5 == 0 || isSelected()) {
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
        alphaAnimation.setDuration(0L);
        alphaAnimation.setFillAfter(true);
        startAnimation(alphaAnimation);
        setAlpha(0.0f);
    }

    public void setSelectedIndicatorColor(int i5) {
        if (getBackground() instanceof NinePatchDrawable) {
            return;
        }
        getBackground().setTint(i5);
        if (isSelected()) {
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
        alphaAnimation.setDuration(0L);
        alphaAnimation.setFillAfter(true);
        startAnimation(alphaAnimation);
        setAlpha(0.0f);
    }
}
