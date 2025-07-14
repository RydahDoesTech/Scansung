package J;

import android.view.View;
import com.wssyncmldm.R;
import java.util.Objects;
import o.C0713k;

/* loaded from: classes.dex */
public abstract class L {
    public static void a(View view, O o5) {
        C0713k c0713k = (C0713k) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c0713k == null) {
            c0713k = new C0713k();
            view.setTag(R.id.tag_unhandled_key_listeners, c0713k);
        }
        Objects.requireNonNull(o5);
        View.OnUnhandledKeyEventListener k5 = new K();
        c0713k.put(o5, k5);
        view.addOnUnhandledKeyEventListener(k5);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, O o5) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        C0713k c0713k = (C0713k) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c0713k == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c0713k.getOrDefault(o5, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i5) {
        return (T) view.requireViewById(i5);
    }

    public static void g(View view, boolean z4) {
        view.setAccessibilityHeading(z4);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, M.a aVar) {
        view.setAutofillId(null);
    }

    public static void j(View view, boolean z4) {
        view.setScreenReaderFocusable(z4);
    }
}
