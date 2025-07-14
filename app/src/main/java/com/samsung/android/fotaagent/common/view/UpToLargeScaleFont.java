package com.samsung.android.fotaagent.common.view;

import android.content.Context;
import android.widget.TextView;
import com.samsung.android.fotaagent.common.log.Log;

/* loaded from: classes.dex */
class UpToLargeScaleFont {
    private static final float LARGE_FONT_SIZE_SCALE = 1.3f;

    public static void limitFontSize(TextView textView) {
        Context context = textView.getContext();
        float f = context.getResources().getConfiguration().fontScale;
        float textSize = textView.getTextSize();
        float f5 = textSize / context.getResources().getDisplayMetrics().density;
        int i5 = (int) ((textSize / context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
        Log.I("fontScale: " + f + ", fontSize: " + i5 + "sp, " + f5 + "dp, " + textSize + "px");
        if (f > LARGE_FONT_SIZE_SCALE) {
            float f6 = i5 * LARGE_FONT_SIZE_SCALE;
            Log.I("fontSize: " + f6 + " dp");
            textView.setTextSize(1, f6);
        }
    }
}
