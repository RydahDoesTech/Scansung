package androidx.lifecycle;

import android.app.Application;
import b3.AbstractC0219i;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class V {

    /* renamed from: a, reason: collision with root package name */
    public static final List f4001a = P2.n.h0(Application.class, O.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List f4002b = g3.y.N(O.class);

    public static final Constructor a(Class cls, List list) throws SecurityException {
        AbstractC0219i.e("signature", list);
        Constructor<?>[] constructors = cls.getConstructors();
        AbstractC0219i.d("modelClass.constructors", constructors);
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            AbstractC0219i.d("constructor.parameterTypes", parameterTypes);
            List listW0 = P2.i.w0(parameterTypes);
            if (list.equals(listW0)) {
                return constructor;
            }
            if (list.size() == listW0.size() && listW0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final X b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (X) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("Failed to access " + cls, e5);
        } catch (InstantiationException e6) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e6);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e7.getCause());
        }
    }
}
