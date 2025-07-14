package v3;

import b3.AbstractC0219i;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

/* renamed from: v3.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0891C extends s implements E3.b {

    /* renamed from: a, reason: collision with root package name */
    public final TypeVariable f9229a;

    public C0891C(TypeVariable typeVariable) {
        AbstractC0219i.e("typeVariable", typeVariable);
        this.f9229a = typeVariable;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0891C) {
            if (AbstractC0219i.a(this.f9229a, ((C0891C) obj).f9229a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9229a.hashCode();
    }

    @Override // E3.b
    public final Collection s() {
        Annotation[] declaredAnnotations;
        TypeVariable typeVariable = this.f9229a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? P2.u.f2163d : r2.d.g(declaredAnnotations);
    }

    @Override // E3.b
    public final C0898e t(N3.c cVar) {
        Annotation[] declaredAnnotations;
        AbstractC0219i.e("fqName", cVar);
        TypeVariable typeVariable = this.f9229a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return r2.d.d(declaredAnnotations, cVar);
    }

    public final String toString() {
        return C0891C.class.getName() + ": " + this.f9229a;
    }
}
