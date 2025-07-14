package v3;

import b3.AbstractC0219i;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import r0.AbstractC0809c;

/* loaded from: classes.dex */
public final class o extends s implements E3.b, E3.e {

    /* renamed from: a, reason: collision with root package name */
    public final Class f9258a;

    public o(Class cls) {
        AbstractC0219i.e("klass", cls);
        this.f9258a = cls;
    }

    public final List a() {
        Field[] declaredFields = this.f9258a.getDeclaredFields();
        AbstractC0219i.d("klass.declaredFields", declaredFields);
        return o4.m.k0(o4.m.i0(new o4.f(P2.i.j0(declaredFields), false, l.f9255l), m.f9256l));
    }

    public final N3.c b() {
        return AbstractC0897d.a(this.f9258a).b();
    }

    public final List c() throws SecurityException {
        Method[] declaredMethods = this.f9258a.getDeclaredMethods();
        AbstractC0219i.d("klass.declaredMethods", declaredMethods);
        return o4.m.k0(o4.m.i0(new o4.f(P2.i.j0(declaredMethods), true, new B3.d(23, this)), n.f9257l));
    }

    public final ArrayList d() {
        Class cls = this.f9258a;
        AbstractC0219i.e("clazz", cls);
        com.google.firebase.messaging.q qVar = AbstractC0809c.f8562a;
        if (qVar == null) {
            try {
                qVar = new com.google.firebase.messaging.q(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 18);
            } catch (NoSuchMethodException unused) {
                qVar = new com.google.firebase.messaging.q(objArr, objArr, objArr, objArr, 18);
            }
            AbstractC0809c.f8562a = qVar;
        }
        Method method = (Method) qVar.f6170h;
        objArr = method != null ? (Object[]) method.invoke(cls, null) : null;
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new C0889A(obj));
        }
        return arrayList;
    }

    public final boolean e() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class cls = this.f9258a;
        AbstractC0219i.e("clazz", cls);
        com.google.firebase.messaging.q qVar = AbstractC0809c.f8562a;
        Boolean bool = null;
        if (qVar == null) {
            try {
                qVar = new com.google.firebase.messaging.q(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 18);
            } catch (NoSuchMethodException unused) {
                qVar = new com.google.firebase.messaging.q(bool, bool, bool, bool, 18);
            }
            AbstractC0809c.f8562a = qVar;
        }
        Method method = (Method) qVar.f6169g;
        if (method != null) {
            Object objInvoke = method.invoke(cls, null);
            AbstractC0219i.c("null cannot be cast to non-null type kotlin.Boolean", objInvoke);
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            if (AbstractC0219i.a(this.f9258a, ((o) obj).f9258a)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class cls = this.f9258a;
        AbstractC0219i.e("clazz", cls);
        com.google.firebase.messaging.q qVar = AbstractC0809c.f8562a;
        Boolean bool = null;
        if (qVar == null) {
            try {
                qVar = new com.google.firebase.messaging.q(Class.class.getMethod("isSealed", null), Class.class.getMethod("getPermittedSubclasses", null), Class.class.getMethod("isRecord", null), Class.class.getMethod("getRecordComponents", null), 18);
            } catch (NoSuchMethodException unused) {
                qVar = new com.google.firebase.messaging.q(bool, bool, bool, bool, 18);
            }
            AbstractC0809c.f8562a = qVar;
        }
        Method method = (Method) qVar.f6168e;
        if (method != null) {
            Object objInvoke = method.invoke(cls, null);
            AbstractC0219i.c("null cannot be cast to non-null type kotlin.Boolean", objInvoke);
            bool = (Boolean) objInvoke;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final int hashCode() {
        return this.f9258a.hashCode();
    }

    @Override // E3.b
    public final Collection s() {
        Annotation[] declaredAnnotations;
        Class cls = this.f9258a;
        return (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) ? P2.u.f2163d : r2.d.g(declaredAnnotations);
    }

    @Override // E3.b
    public final C0898e t(N3.c cVar) {
        Annotation[] declaredAnnotations;
        AbstractC0219i.e("fqName", cVar);
        Class cls = this.f9258a;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return null;
        }
        return r2.d.d(declaredAnnotations, cVar);
    }

    public final String toString() {
        return o.class.getName() + ": " + this.f9258a;
    }

    @Override // E3.e
    public final ArrayList u() {
        TypeVariable[] typeParameters = this.f9258a.getTypeParameters();
        AbstractC0219i.d("klass.typeParameters", typeParameters);
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new C0891C(typeVariable));
        }
        return arrayList;
    }
}
