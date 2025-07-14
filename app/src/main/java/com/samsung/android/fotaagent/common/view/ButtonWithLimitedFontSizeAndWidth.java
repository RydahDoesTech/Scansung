package com.samsung.android.fotaagent.common.view;

import android.content.Context;
import android.os.SemSystemProperties;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.Button;
import com.samsung.android.lib.episode.EternalContract;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public class ButtonWithLimitedFontSizeAndWidth extends Button {
    public ButtonWithLimitedFontSizeAndWidth(Context context) {
        this(context, null);
    }

    private int convertDpToPx(Context context, int i5) {
        return (int) (TypedValue.applyDimension(1, i5, context.getResources().getDisplayMetrics()) + 0.5f);
    }

    private boolean isTablet() {
        return EternalContract.DEVICE_TYPE_TABLET.equals(SemSystemProperties.get("ro.build.characteristics", ""));
    }

    private boolean needsListWidth() {
        if (isTablet()) {
            return true;
        }
        return getResources().getConfiguration().screenWidthDp >= 589 && getResources().getConfiguration().screenHeightDp >= 411;
    }

    private void setButtonWidth() {
        int from = getResources().getConfiguration().screenWidthDp;
        if (needsListWidth()) {
            from = ((int) (FlexibleWidthRatio.getFrom(getResources().getConfiguration()) * from)) - ((int) getResources().getFloat(R.dimen.horizontal_margin_between_buttons));
        }
        float f = from;
        int i5 = (int) (getResources().getFloat(R.dimen.button_min_width_ratio) * f);
        int i6 = (int) (getResources().getFloat(R.dimen.button_max_width_ratio) * f);
        setMinWidth(convertDpToPx(getContext(), i5));
        setMaxWidth(convertDpToPx(getContext(), i6));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setButtonWidth();
        UpToLargeScaleFont.limitFontSize(this);
    }

    public ButtonWithLimitedFontSizeAndWidth(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.buttonStyle);
    }

    public ButtonWithLimitedFontSizeAndWidth(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
    }
}
