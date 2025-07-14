package L;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* loaded from: classes.dex */
public abstract class a {
    public static Interpolator a(float f, float f5) {
        return new PathInterpolator(f, f5);
    }

    public static Interpolator b(float f, float f5, float f6, float f7) {
        return new PathInterpolator(f, f5, f6, f7);
    }

    public static Interpolator c(Path path) {
        return new PathInterpolator(path);
    }
}
