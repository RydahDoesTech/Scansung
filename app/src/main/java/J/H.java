package J;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.wssyncmldm.R;

/* loaded from: classes.dex */
public abstract class H {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static p0 b(View view, p0 p0Var, Rect rect) {
        WindowInsets windowInsetsE = p0Var.e();
        if (windowInsetsE != null) {
            return p0.f(view.computeSystemWindowInsets(windowInsetsE, rect), view);
        }
        rect.setEmpty();
        return p0Var;
    }

    public static boolean c(View view, float f, float f5, boolean z4) {
        return view.dispatchNestedFling(f, f5, z4);
    }

    public static boolean d(View view, float f, float f5) {
        return view.dispatchNestedPreFling(f, f5);
    }

    public static boolean e(View view, int i5, int i6, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i5, i6, iArr, iArr2);
    }

    public static boolean f(View view, int i5, int i6, int i7, int i8, int[] iArr) {
        return view.dispatchNestedScroll(i5, i6, i7, i8, iArr);
    }

    public static ColorStateList g(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode h(View view) {
        return view.getBackgroundTintMode();
    }

    public static float i(View view) {
        return view.getElevation();
    }

    public static p0 j(View view) throws IllegalAccessException, IllegalArgumentException {
        if (!e0.f1455d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = e0.f1452a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) e0.f1453b.get(obj);
            Rect rect2 = (Rect) e0.f1454c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            g0 g0Var = new g0();
            g0Var.g(B.c.b(rect.left, rect.top, rect.right, rect.bottom));
            g0Var.e(B.c.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
            p0 p0VarB = g0Var.b();
            p0VarB.f1481a.m(p0VarB);
            p0VarB.f1481a.d(view.getRootView());
            return p0VarB;
        } catch (IllegalAccessException e5) {
            Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e5.getMessage(), e5);
            return null;
        }
    }

    public static String k(View view) {
        return view.getTransitionName();
    }

    public static float l(View view) {
        return view.getTranslationZ();
    }

    public static float m(View view) {
        return view.getZ();
    }

    public static boolean n(View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean o(View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean p(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void s(View view, float f) {
        view.setElevation(f);
    }

    public static void t(View view, boolean z4) {
        view.setNestedScrollingEnabled(z4);
    }

    public static void u(View view, InterfaceC0060q interfaceC0060q) {
        if (interfaceC0060q == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new G(view, interfaceC0060q));
        }
    }

    public static void v(View view, String str) {
        view.setTransitionName(str);
    }

    public static void w(View view, float f) {
        view.setTranslationZ(f);
    }

    public static void x(View view, float f) {
        view.setZ(f);
    }

    public static boolean y(View view, int i5) {
        return view.startNestedScroll(i5);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}
