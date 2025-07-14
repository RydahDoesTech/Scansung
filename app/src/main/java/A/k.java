package A;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class k {
    public static Drawable a(Resources resources, int i5, Resources.Theme theme) {
        return resources.getDrawable(i5, theme);
    }

    public static Drawable b(Resources resources, int i5, int i6, Resources.Theme theme) {
        return resources.getDrawableForDensity(i5, i6, theme);
    }
}
