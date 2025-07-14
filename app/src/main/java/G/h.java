package G;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.C0708f;
import o.C0713k;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final C0708f f689a = new C0708f(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f690b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f691c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0713k f692d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, IDMCallbackStatusInterface.IDM_RESULTS, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new k(0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f690b = threadPoolExecutor;
        f691c = new Object();
        f692d = new C0713k();
    }

    public static g a(String str, Context context, B3.g gVar, int i5) {
        C0708f c0708f = f689a;
        Typeface typeface = (Typeface) c0708f.a(str);
        if (typeface != null) {
            return new g(typeface);
        }
        try {
            A1.e eVarA = d.a(context, gVar);
            int i6 = 1;
            i[] iVarArr = (i[]) eVarA.f57e;
            int i7 = eVarA.f56d;
            if (i7 != 0) {
                i6 = i7 != 1 ? -3 : -2;
            } else if (iVarArr != null && iVarArr.length != 0) {
                int length = iVarArr.length;
                i6 = 0;
                int i8 = 0;
                while (true) {
                    if (i8 >= length) {
                        break;
                    }
                    int i9 = iVarArr[i8].f697e;
                    if (i9 == 0) {
                        i8++;
                    } else if (i9 >= 0) {
                        i6 = i9;
                    }
                }
            }
            if (i6 != 0) {
                return new g(i6);
            }
            Typeface typefaceA = B.h.a(context, iVarArr, i5);
            if (typefaceA == null) {
                return new g(-3);
            }
            c0708f.b(str, typefaceA);
            return new g(typefaceA);
        } catch (PackageManager.NameNotFoundException unused) {
            return new g(-1);
        }
    }
}
