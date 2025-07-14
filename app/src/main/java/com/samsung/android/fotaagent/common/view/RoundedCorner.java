package com.samsung.android.fotaagent.common.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.appcompat.util.b;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class RoundedCorner extends b {

    public static class LinearLayout extends android.widget.LinearLayout {
        public LinearLayout(Context context) {
            this(context, null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            RoundedCorner.create(getContext()).drawRoundedCorner(canvas);
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

    public static class ScrollView extends android.widget.ScrollView {
        public ScrollView(Context context) {
            this(context, null);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            RoundedCorner.create(getContext()).drawRoundedCorner(canvas);
        }

        public ScrollView(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0);
        }

        public ScrollView(Context context, AttributeSet attributeSet, int i5) {
            this(context, attributeSet, i5, 0);
        }

        public ScrollView(Context context, AttributeSet attributeSet, int i5, int i6) {
            super(context, attributeSet, i5, i6);
        }
    }

    private RoundedCorner(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RoundedCorner create(Context context) {
        RoundedCorner roundedCorner = new RoundedCorner(context);
        roundedCorner.setRoundedCorners(15);
        roundedCorner.setRoundedCornerColor(15, context.getColor(R.color.content_background_color));
        return roundedCorner;
    }
}
