package J;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class X {
    public static boolean a(ViewParent viewParent, View view, float f, float f5, boolean z4) {
        return viewParent.onNestedFling(view, f, f5, z4);
    }

    public static boolean b(ViewParent viewParent, View view, float f, float f5) {
        return viewParent.onNestedPreFling(view, f, f5);
    }

    public static void c(ViewParent viewParent, View view, int i5, int i6, int[] iArr) {
        viewParent.onNestedPreScroll(view, i5, i6, iArr);
    }

    public static void d(ViewParent viewParent, View view, int i5, int i6, int i7, int i8) {
        viewParent.onNestedScroll(view, i5, i6, i7, i8);
    }

    public static void e(ViewParent viewParent, View view, View view2, int i5) {
        viewParent.onNestedScrollAccepted(view, view2, i5);
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i5) {
        return viewParent.onStartNestedScroll(view, view2, i5);
    }

    public static void g(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}
