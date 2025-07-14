package b1;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.idm.providers.mo.IDMMoInterface;

/* renamed from: b1.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0203C {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f5003a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f5004b;

    /* renamed from: c, reason: collision with root package name */
    public static int f5005c;

    public static void a(String str, boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void b(Handler handler) {
        String name = Looper.myLooper() != null ? Looper.myLooper().getThread().getName() : "null current looper";
        String name2 = handler.getLooper().getThread().getName();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 36);
        sb.append("Must be called on ");
        sb.append(name2);
        sb.append(" thread, but got ");
        sb.append(name);
        sb.append(IDMMoInterface.IDM_MO_ROOT_PATH);
        String string = sb.toString();
        if (Looper.myLooper() != handler.getLooper()) {
            throw new IllegalStateException(string);
        }
    }

    public static void c(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void e(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void f(String str, Object obj) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void g(String str, boolean z4) {
        if (!z4) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static boolean h(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
