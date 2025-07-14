package d;

import android.view.animation.PathInterpolator;

/* renamed from: d.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0390a {

    /* renamed from: a, reason: collision with root package name */
    public static final PathInterpolator f6383a;

    /* renamed from: b, reason: collision with root package name */
    public static final PathInterpolator f6384b;

    static {
        new PathInterpolator(0.33f, 0.0f, 0.3f, 1.0f);
        f6383a = new PathInterpolator(0.33f, 0.0f, 0.2f, 1.0f);
        f6384b = new PathInterpolator(0.33f, 0.0f, 0.1f, 1.0f);
        new PathInterpolator(0.17f, 0.17f, 0.2f, 1.0f);
        new PathInterpolator(0.17f, 0.17f, 0.3f, 1.0f);
    }
}
