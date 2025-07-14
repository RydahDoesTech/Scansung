package e;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import i.AbstractC0476b;
import i.InterfaceC0475a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import o.C0705c;
import o.C0709g;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: d, reason: collision with root package name */
    public static final H f6609d = new H(new I(0));

    /* renamed from: e, reason: collision with root package name */
    public static final int f6610e = -100;
    public static Boolean f = null;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f6611g = false;

    /* renamed from: h, reason: collision with root package name */
    public static final C0705c f6612h = new C0705c(0);

    /* renamed from: i, reason: collision with root package name */
    public static final Object f6613i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public static final Object f6614j = null;

    public static boolean e(Context context) {
        if (f == null) {
            try {
                int i5 = G.f6492d;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) G.class), F.a() | 128).metaData;
                if (bundle != null) {
                    f = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f = Boolean.FALSE;
            }
        }
        return f.booleanValue();
    }

    public static void i(B b2) {
        synchronized (f6613i) {
            try {
                Iterator it = f6612h.iterator();
                while (true) {
                    C0709g c0709g = (C0709g) it;
                    if (c0709g.hasNext()) {
                        r rVar = (r) ((WeakReference) c0709g.next()).get();
                        if (rVar == b2 || rVar == null) {
                            c0709g.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void b();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract boolean j(int i5);

    public abstract void k(int i5);

    public abstract void l(View view);

    public abstract void m(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void n(CharSequence charSequence);

    public abstract AbstractC0476b o(InterfaceC0475a interfaceC0475a);
}
