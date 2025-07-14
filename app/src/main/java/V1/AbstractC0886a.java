package v1;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: v1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0886a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f9217a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final a0.a f9218b = new a0.a(a0.a.f2922d);

    /* renamed from: c, reason: collision with root package name */
    public static final a0.a f9219c = new a0.a(a0.a.f2921c);

    /* renamed from: d, reason: collision with root package name */
    public static final a0.a f9220d = new a0.a(a0.a.f2923e);

    static {
        new DecelerateInterpolator();
    }

    public static float a(float f, float f5, float f6) {
        return ((f5 - f) * f6) + f;
    }

    public static float b(float f, float f5, float f6, float f7, float f8) {
        return f8 <= f6 ? f : f8 >= f7 ? f5 : a(f, f5, (f8 - f6) / (f7 - f6));
    }

    public static int c(int i5, float f, int i6) {
        return Math.round(f * (i6 - i5)) + i5;
    }
}
