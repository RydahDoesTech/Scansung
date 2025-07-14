package androidx.lifecycle;

import b3.AbstractC0219i;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class Y implements a0 {

    /* renamed from: d, reason: collision with root package name */
    public static final Y f4004d = new Y();

    /* renamed from: e, reason: collision with root package name */
    public static final Y f4005e = new Y();
    public static Y f;

    @Override // androidx.lifecycle.a0
    public X c(Class cls) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            AbstractC0219i.d("{\n                modelC…wInstance()\n            }", objNewInstance);
            return (X) objNewInstance;
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("Cannot create an instance of " + cls, e5);
        } catch (InstantiationException e6) {
            throw new RuntimeException("Cannot create an instance of " + cls, e6);
        } catch (NoSuchMethodException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        }
    }
}
