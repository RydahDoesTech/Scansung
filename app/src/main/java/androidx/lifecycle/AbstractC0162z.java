package androidx.lifecycle;

import b3.AbstractC0219i;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* renamed from: androidx.lifecycle.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0162z {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f4036a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f4037b = new HashMap();

    public static void a(Constructor constructor, InterfaceC0158v interfaceC0158v) {
        try {
            AbstractC0219i.d("{\n            constructo…tance(`object`)\n        }", constructor.newInstance(interfaceC0158v));
            throw new ClassCastException();
        } catch (IllegalAccessException e5) {
            throw new RuntimeException(e5);
        } catch (InstantiationException e6) {
            throw new RuntimeException(e6);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0149 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(java.lang.Class r13) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.AbstractC0162z.b(java.lang.Class):int");
    }
}
