package com.samsung.android.fotaagent.common.view;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
public class TextViewWithLimitedFontSize extends TextView {
    public TextViewWithLimitedFontSize(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        UpToLargeScaleFont.limitFontSize(this);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i5) {
        super.setTextAppearance(i5);
        UpToLargeScaleFont.limitFontSize(this);
    }

    public TextViewWithLimitedFontSize(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public TextViewWithLimitedFontSize(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
    }
}
