package androidx.fragment.app;

import o.C0713k;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: b, reason: collision with root package name */
    public static final C0713k f3742b = new C0713k();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f3743a;

    public U(a0 a0Var) {
        this.f3743a = a0Var;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C0713k c0713k = f3742b;
        C0713k c0713k2 = (C0713k) c0713k.getOrDefault(classLoader, null);
        if (c0713k2 == null) {
            c0713k2 = new C0713k();
            c0713k.put(classLoader, c0713k2);
        }
        Class cls = (Class) c0713k2.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c0713k2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e5) {
            throw new O2.d(A3.f.o("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e5);
        } catch (ClassNotFoundException e6) {
            throw new O2.d(A3.f.o("Unable to instantiate fragment ", str, ": make sure class name exists"), e6);
        }
    }

    public final Fragment a(String str) {
        return Fragment.instantiate(this.f3743a.f3782t.f3728e, str, null);
    }
}
