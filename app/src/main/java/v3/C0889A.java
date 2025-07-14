package v3;

import b3.AbstractC0219i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import r0.AbstractC0808b;

/* renamed from: v3.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0889A extends w {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9228a;

    public C0889A(Object obj) {
        AbstractC0219i.e("recordComponent", obj);
        this.f9228a = obj;
    }

    @Override // v3.w
    public final Member a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object obj = this.f9228a;
        AbstractC0219i.e("recordComponent", obj);
        C0894a c0894a = AbstractC0808b.f8561a;
        Method method = null;
        if (c0894a == null) {
            Class<?> cls = obj.getClass();
            try {
                c0894a = new C0894a(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                c0894a = new C0894a(null, null);
            }
            AbstractC0808b.f8561a = c0894a;
        }
        Method method2 = c0894a.f9236b;
        if (method2 != null) {
            Object objInvoke = method2.invoke(obj, null);
            AbstractC0219i.c("null cannot be cast to non-null type java.lang.reflect.Method", objInvoke);
            method = (Method) objInvoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    public final E3.d e() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object obj = this.f9228a;
        AbstractC0219i.e("recordComponent", obj);
        C0894a c0894a = AbstractC0808b.f8561a;
        Class cls = null;
        if (c0894a == null) {
            Class<?> cls2 = obj.getClass();
            try {
                c0894a = new C0894a(cls2.getMethod("getType", null), cls2.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                c0894a = new C0894a(null, null);
            }
            AbstractC0808b.f8561a = c0894a;
        }
        Method method = c0894a.f9235a;
        if (method != null) {
            Object objInvoke = method.invoke(obj, null);
            AbstractC0219i.c("null cannot be cast to non-null type java.lang.Class<*>", objInvoke);
            cls = (Class) objInvoke;
        }
        if (cls != null) {
            return new q(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
