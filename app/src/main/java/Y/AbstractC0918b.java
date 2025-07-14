package y;

import android.app.Activity;
import android.app.SharedElementCallback;

/* renamed from: y.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0918b {
    public static void a(Object obj) {
        ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
    }

    public static void b(Activity activity, String[] strArr, int i5) {
        activity.requestPermissions(strArr, i5);
    }

    public static boolean c(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }
}
