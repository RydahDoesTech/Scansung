package a1;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: a1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C0095c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: h, reason: collision with root package name */
    public static final ComponentCallbacks2C0095c f2929h = new ComponentCallbacks2C0095c();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f2930d = new AtomicBoolean();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f2931e = new AtomicBoolean();
    public final ArrayList f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public boolean f2932g = false;

    public static void b(Application application) {
        ComponentCallbacks2C0095c componentCallbacks2C0095c = f2929h;
        synchronized (componentCallbacks2C0095c) {
            try {
                if (!componentCallbacks2C0095c.f2932g) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C0095c);
                    application.registerComponentCallbacks(componentCallbacks2C0095c);
                    componentCallbacks2C0095c.f2932g = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(InterfaceC0094b interfaceC0094b) {
        synchronized (f2929h) {
            this.f.add(interfaceC0094b);
        }
    }

    public final void c(boolean z4) {
        synchronized (f2929h) {
            try {
                ArrayList arrayList = this.f;
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    ((InterfaceC0094b) obj).a(z4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.f2930d.compareAndSet(true, false);
        this.f2931e.set(true);
        if (zCompareAndSet) {
            c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean zCompareAndSet = this.f2930d.compareAndSet(true, false);
        this.f2931e.set(true);
        if (zCompareAndSet) {
            c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i5) {
        if (i5 == 20 && this.f2930d.compareAndSet(false, true)) {
            this.f2931e.set(true);
            c(true);
        }
    }
}
