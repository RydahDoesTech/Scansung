package v3;

import b3.AbstractC0219i;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: v3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0898e extends s {

    /* renamed from: a, reason: collision with root package name */
    public final Annotation f9246a;

    public C0898e(Annotation annotation) {
        AbstractC0219i.e("annotation", annotation);
        this.f9246a = annotation;
    }

    public final ArrayList a() throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Annotation annotation = this.f9246a;
        Method[] declaredMethods = g3.y.z(g3.y.s(annotation)).getDeclaredMethods();
        AbstractC0219i.d("annotation.annotationClass.java.declaredMethods", declaredMethods);
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            Object objInvoke = method.invoke(annotation, null);
            AbstractC0219i.d("method.invoke(annotation)", objInvoke);
            N3.f fVarE = N3.f.e(method.getName());
            Class<?> cls = objInvoke.getClass();
            List list = AbstractC0897d.f9243a;
            arrayList.add(Enum.class.isAssignableFrom(cls) ? new t(fVarE, (Enum) objInvoke) : objInvoke instanceof Annotation ? new g(fVarE, (Annotation) objInvoke) : objInvoke instanceof Object[] ? new h(fVarE, (Object[]) objInvoke) : objInvoke instanceof Class ? new p(fVarE, (Class) objInvoke) : new v(fVarE, objInvoke));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0898e) {
            if (this.f9246a == ((C0898e) obj).f9246a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f9246a);
    }

    public final String toString() {
        return C0898e.class.getName() + ": " + this.f9246a;
    }
}
