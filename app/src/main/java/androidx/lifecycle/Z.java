package androidx.lifecycle;

import android.app.Application;
import b0.C0199d;
import b3.AbstractC0219i;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class Z extends Y {

    /* renamed from: h, reason: collision with root package name */
    public static Z f4006h;

    /* renamed from: g, reason: collision with root package name */
    public final Application f4007g;

    public Z(Application application) {
        this.f4007g = application;
    }

    public final X a(Class cls, Application application) {
        if (!AbstractC0138a.class.isAssignableFrom(cls)) {
            return super.c(cls);
        }
        try {
            X x4 = (X) cls.getConstructor(Application.class).newInstance(application);
            AbstractC0219i.d("{\n                try {\n…          }\n            }", x4);
            return x4;
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("Cannot create an instance of " + cls, e5);
        } catch (InstantiationException e6) {
            throw new RuntimeException("Cannot create an instance of " + cls, e6);
        } catch (NoSuchMethodException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException("Cannot create an instance of " + cls, e8);
        }
    }

    @Override // androidx.lifecycle.Y, androidx.lifecycle.a0
    public final X c(Class cls) {
        Application application = this.f4007g;
        if (application != null) {
            return a(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.a0
    public final X u(Class cls, C0199d c0199d) {
        if (this.f4007g != null) {
            return c(cls);
        }
        Application application = (Application) c0199d.f5000a.get(Y.f4004d);
        if (application != null) {
            return a(cls, application);
        }
        if (AbstractC0138a.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.c(cls);
    }
}
