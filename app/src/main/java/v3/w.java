package v3;

import b3.AbstractC0219i;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Collection;
import p3.Z;
import p3.c0;
import p3.f0;
import t3.C0875a;

/* loaded from: classes.dex */
public abstract class w extends s implements E3.b, E3.c {
    public abstract Member a();

    public final N3.f b() {
        String name = a().getName();
        N3.f fVarE = name != null ? N3.f.e(name) : null;
        return fVarE == null ? N3.h.f1845a : fVarE;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.ArrayList c(java.lang.reflect.Type[] r13, java.lang.annotation.Annotation[][] r14, boolean r15) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.w.c(java.lang.reflect.Type[], java.lang.annotation.Annotation[][], boolean):java.util.ArrayList");
    }

    public final f0 d() {
        int modifiers = a().getModifiers();
        return Modifier.isPublic(modifiers) ? c0.f8410c : Modifier.isPrivate(modifiers) ? Z.f8407c : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? t3.c.f8977c : t3.b.f8976c : C0875a.f8975c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof w) && AbstractC0219i.a(a(), ((w) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // E3.b
    public final Collection s() {
        Member memberA = a();
        AbstractC0219i.c("null cannot be cast to non-null type java.lang.reflect.AnnotatedElement", memberA);
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberA).getDeclaredAnnotations();
        return declaredAnnotations != null ? r2.d.g(declaredAnnotations) : P2.u.f2163d;
    }

    @Override // E3.b
    public final C0898e t(N3.c cVar) {
        AbstractC0219i.e("fqName", cVar);
        Member memberA = a();
        AbstractC0219i.c("null cannot be cast to non-null type java.lang.reflect.AnnotatedElement", memberA);
        Annotation[] declaredAnnotations = ((AnnotatedElement) memberA).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return r2.d.d(declaredAnnotations, cVar);
        }
        return null;
    }

    public final String toString() {
        return getClass().getName() + ": " + a();
    }
}
