package k;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* renamed from: k.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0654t0 {
    public static void a(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    public static void b(PopupWindow popupWindow, boolean z4) {
        popupWindow.setIsClippedToScreen(z4);
    }
}
