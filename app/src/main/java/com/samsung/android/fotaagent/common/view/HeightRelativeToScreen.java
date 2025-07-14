package com.samsung.android.fotaagent.common.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
interface HeightRelativeToScreen {
    public static final float HEIGHT_RATIO_IN_LANDSCAPE = 0.475f;
    public static final float HEIGHT_RATIO_IN_PORTRAIT = 0.225f;

    public static class LinearLayout extends android.widget.LinearLayout implements HeightRelativeToScreen {
        public LinearLayout(Context context) {
            this(context, null);
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i5, int i6) {
            super.onMeasure(i5, HeightRelativeToScreen.getHeightMeasureSpec(this));
        }

        public LinearLayout(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        public LinearLayout(Context context, AttributeSet attributeSet, int i5) {
            this(context, attributeSet, i5, 0);
        }

        public LinearLayout(Context context, AttributeSet attributeSet, int i5, int i6) {
            super(context, attributeSet, i5, i6);
        }
    }

    static int getHeightMeasureSpec(View view) {
        Resources resources = view.getContext().getResources();
        float f = resources.getConfiguration().orientation == 1 ? 0.225f : 0.475f;
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int i5 = (int) ((displayMetrics.heightPixels * f) + 0.5f);
        Log.V("screen size (" + displayMetrics.widthPixels + "px x " + displayMetrics.heightPixels + "px) layout height: " + i5 + "px");
        return View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
    }
}
