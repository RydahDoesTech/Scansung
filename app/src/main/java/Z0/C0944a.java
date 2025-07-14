package z0;

import O2.d;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.wssyncmldm.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: z0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0944a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0944a f9473d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f9474e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f9477c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f9476b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f9475a = new HashMap();

    public C0944a(Context context) {
        this.f9477c = context.getApplicationContext();
    }

    public static C0944a c(Context context) {
        if (f9473d == null) {
            synchronized (f9474e) {
                try {
                    if (f9473d == null) {
                        f9473d = new C0944a(context);
                    }
                } finally {
                }
            }
        }
        return f9473d;
    }

    public final void a(Bundle bundle) throws ClassNotFoundException {
        HashSet hashSet;
        String string = this.f9477c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f9476b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC0945b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e5) {
                throw new d(e5);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object objB;
        if (J2.b.G()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap map = this.f9475a;
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC0945b interfaceC0945b = (InterfaceC0945b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = interfaceC0945b.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objB = interfaceC0945b.b(this.f9477c);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new d(th2);
            }
        }
        Trace.endSection();
        return objB;
    }
}
