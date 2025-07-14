package com.idm.fotaagent.enabler.ui.common;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class ColoredPaddingView extends FrameLayout {
    public ColoredPaddingView(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(getContext().getColor(R.color.content_background_color));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getPaddingTop(), paint);
        canvas.drawRect(0.0f, 0.0f, getPaddingStart(), getHeight(), paint);
        canvas.drawRect(getWidth() - getPaddingEnd(), 0.0f, getWidth(), getHeight(), paint);
        canvas.drawRect(0.0f, getHeight() - getPaddingBottom(), getWidth(), getHeight(), paint);
    }

    public ColoredPaddingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
    }

    public ColoredPaddingView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        setWillNotDraw(false);
    }
}
