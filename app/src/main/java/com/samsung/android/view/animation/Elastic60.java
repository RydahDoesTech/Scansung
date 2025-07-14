package com.samsung.android.view.animation;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public class Elastic60 implements Interpolator {
    private float amplitude = 1.0f;
    private float period = 0.6f;

    private float out(float f, float f5, float f6) {
        float fAsin;
        if (f == 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f6 == 0.0f) {
            f6 = 0.3f;
        }
        if (f5 == 0.0f || f5 < 1.0f) {
            fAsin = f6 / 4.0f;
            f5 = 1.0f;
        } else {
            fAsin = (float) (Math.asin(1.0f / f5) * (f6 / 6.283185307179586d));
        }
        return (float) ((Math.sin(((f - fAsin) * 6.283185307179586d) / f6) * Math.pow(2.0d, (-10.0f) * f) * f5) + 1.0d);
    }

    public float getAmplitude() {
        return this.amplitude;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return out(f, this.amplitude, this.period);
    }

    public float getPeriod() {
        return this.period;
    }
}
