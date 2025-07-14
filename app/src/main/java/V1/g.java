package V1;

import F.k;
import a1.ComponentCallbacks2C0095c;
import a2.C0104b;
import a2.o;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import b1.AbstractC0203C;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import g1.AbstractC0449a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.C0704b;
import o.C0712j;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f2607i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public static final e f2608j = new e();

    /* renamed from: k, reason: collision with root package name */
    public static final C0704b f2609k = new C0704b();

    /* renamed from: a, reason: collision with root package name */
    public final Context f2610a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2611b;

    /* renamed from: c, reason: collision with root package name */
    public final j f2612c;

    /* renamed from: d, reason: collision with root package name */
    public final a2.h f2613d;

    /* renamed from: g, reason: collision with root package name */
    public final o f2615g;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f2614e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArrayList f2616h = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.List] */
    public g(Context context, String str, j jVar) throws PackageManager.NameNotFoundException {
        ?? arrayList;
        new CopyOnWriteArrayList();
        this.f2610a = context;
        AbstractC0203C.c(str);
        this.f2611b = str;
        this.f2612c = jVar;
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new a2.d(0, (String) it.next()));
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        arrayList3.add(new a2.d(1, new FirebaseCommonRegistrar()));
        arrayList4.add(C0104b.b(context, Context.class, new Class[0]));
        arrayList4.add(C0104b.b(this, g.class, new Class[0]));
        arrayList4.add(C0104b.b(jVar, j.class, new Class[0]));
        this.f2613d = new a2.h(f2608j, arrayList3, arrayList4);
        this.f2615g = new o(new c(this, 0, context));
    }

    public static ArrayList c() {
        ArrayList arrayList = new ArrayList();
        synchronized (f2607i) {
            try {
                Iterator it = ((C0712j) f2609k.values()).iterator();
                while (it.hasNext()) {
                    g gVar = (g) it.next();
                    gVar.a();
                    arrayList.add(gVar.f2611b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static g d() {
        g gVar;
        synchronized (f2607i) {
            try {
                gVar = (g) f2609k.getOrDefault("[DEFAULT]", null);
                if (gVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + AbstractC0449a.b() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static g e(String str) {
        g gVar;
        String str2;
        synchronized (f2607i) {
            try {
                gVar = (g) f2609k.getOrDefault(str.trim(), null);
                if (gVar == null) {
                    ArrayList arrayListC = c();
                    if (arrayListC.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", arrayListC);
                    }
                    throw new IllegalStateException("FirebaseApp with name " + str + " doesn't exist. " + str2);
                }
            } finally {
            }
        }
        return gVar;
    }

    public static g h(Context context, j jVar) {
        g gVar;
        AtomicReference atomicReference = d.f2603a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = d.f2603a;
            if (atomicReference2.get() == null) {
                d dVar = new d();
                if (atomicReference2.compareAndSet(null, dVar)) {
                    ComponentCallbacks2C0095c.b(application);
                    ComponentCallbacks2C0095c.f2929h.a(dVar);
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f2607i) {
            C0704b c0704b = f2609k;
            AbstractC0203C.g("FirebaseApp name [DEFAULT] already exists!", !c0704b.containsKey("[DEFAULT]"));
            AbstractC0203C.f("Application context cannot be null.", context);
            gVar = new g(context, "[DEFAULT]", jVar);
            c0704b.put("[DEFAULT]", gVar);
        }
        gVar.g();
        return gVar;
    }

    public final void a() {
        AbstractC0203C.g("FirebaseApp was deleted", !this.f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.f2613d.a(cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.f2611b.equals(gVar.f2611b);
    }

    public final String f() {
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.f2611b.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        a();
        byte[] bytes2 = this.f2612c.f2618b.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    public final void g() {
        HashMap map;
        if (k.a(this.f2610a)) {
            StringBuilder sb = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
            a();
            sb.append(this.f2611b);
            Log.i("FirebaseApp", sb.toString());
            a2.h hVar = this.f2613d;
            a();
            boolean zEquals = "[DEFAULT]".equals(this.f2611b);
            if (hVar.f2997m.compareAndSet(null, Boolean.valueOf(zEquals))) {
                synchronized (hVar) {
                    map = new HashMap(hVar.f2993i);
                }
                hVar.f0(map, zEquals);
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
        a();
        sb2.append(this.f2611b);
        Log.i("FirebaseApp", sb2.toString());
        Context context = this.f2610a;
        AtomicReference atomicReference = f.f2605b;
        if (atomicReference.get() == null) {
            f fVar = new f(context);
            if (atomicReference.compareAndSet(null, fVar)) {
                context.registerReceiver(fVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
            }
        }
    }

    public final int hashCode() {
        return this.f2611b.hashCode();
    }

    public final String toString() {
        E0.d dVar = new E0.d(this);
        dVar.C0("name", this.f2611b);
        dVar.C0("options", this.f2612c);
        return dVar.toString();
    }
}
