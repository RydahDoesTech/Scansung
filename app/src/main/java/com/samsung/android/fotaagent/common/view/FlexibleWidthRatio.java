package com.samsung.android.fotaagent.common.view;

import android.content.res.Configuration;

/* loaded from: classes.dex */
public class FlexibleWidthRatio {
    private static float convert(int i5, float f) {
        return 1.0f - ((f * 2.0f) / i5);
    }

    public static float getFrom(Configuration configuration) {
        int i5 = configuration.screenWidthDp;
        int i6 = configuration.screenHeightDp;
        if (i5 >= 960) {
            return 840.0f / i5;
        }
        if (i5 < 589 || i6 < 411) {
            return convert(i5, 10.0f);
        }
        return 0.86f;
    }
}
