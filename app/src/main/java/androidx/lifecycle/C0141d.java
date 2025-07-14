package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0141d {

    /* renamed from: c, reason: collision with root package name */
    public static final C0141d f4013c = new C0141d();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4014a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4015b = new HashMap();

    public static void b(HashMap map, C0140c c0140c, EnumC0153p enumC0153p, Class cls) {
        EnumC0153p enumC0153p2 = (EnumC0153p) map.get(c0140c);
        if (enumC0153p2 == null || enumC0153p == enumC0153p2) {
            if (enumC0153p2 == null) {
                map.put(c0140c, enumC0153p);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0140c.f4012b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0153p2 + ", new value " + enumC0153p);
    }

    public final C0139b a(Class cls, Method[] methodArr) throws SecurityException {
        int i5;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f4014a;
        if (superclass != null) {
            C0139b c0139bA = (C0139b) map2.get(superclass);
            if (c0139bA == null) {
                c0139bA = a(superclass, null);
            }
            map.putAll(c0139bA.f4009b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0139b c0139bA2 = (C0139b) map2.get(cls2);
            if (c0139bA2 == null) {
                c0139bA2 = a(cls2, null);
            }
            for (Map.Entry entry : c0139bA2.f4009b.entrySet()) {
                b(map, (C0140c) entry.getKey(), (EnumC0153p) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e5) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e5);
            }
        }
        boolean z4 = false;
        for (Method method : methodArr) {
            H h3 = (H) method.getAnnotation(H.class);
            if (h3 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i5 = 0;
                } else {
                    if (!InterfaceC0159w.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i5 = 1;
                }
                EnumC0153p enumC0153pValue = h3.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0153p.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC0153pValue != EnumC0153p.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i5 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new C0140c(i5, method), enumC0153pValue, cls);
                z4 = true;
            }
        }
        C0139b c0139b = new C0139b(map);
        map2.put(cls, c0139b);
        this.f4015b.put(cls, Boolean.valueOf(z4));
        return c0139b;
    }
}
