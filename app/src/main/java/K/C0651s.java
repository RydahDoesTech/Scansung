package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* renamed from: k.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0651s {

    /* renamed from: b, reason: collision with root package name */
    public static C0651s f7795b;

    /* renamed from: a, reason: collision with root package name */
    public D0 f7796a;

    static {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
    }

    public static synchronized C0651s a() {
        try {
            if (f7795b == null) {
                c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f7795b;
    }

    public static synchronized void c() {
        if (f7795b == null) {
            C0651s c0651s = new C0651s();
            f7795b = c0651s;
            c0651s.f7796a = D0.a();
            synchronized (f7795b.f7796a) {
            }
        }
    }

    public static void d(Drawable drawable, x1 x1Var, int[] iArr) {
        PorterDuff.Mode mode = D0.f7480d;
        int[] state = drawable.getState();
        Rect rect = AbstractC0622g0.f7667a;
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z4 = x1Var.f7862d;
        if (!z4 && !x1Var.f7861c) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterE = null;
        ColorStateList colorStateList = z4 ? x1Var.f7859a : null;
        PorterDuff.Mode mode2 = x1Var.f7861c ? x1Var.f7860b : D0.f7480d;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterE = D0.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterE);
    }

    public final synchronized Drawable b(Context context, int i5) {
        return this.f7796a.c(context, i5);
    }
}
