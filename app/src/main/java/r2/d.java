package r2;

import G3.n;
import P0.h;
import P2.i;
import Q3.p;
import S3.f;
import a2.C0103a;
import a2.C0104b;
import a2.k;
import a4.l;
import android.content.Context;
import b3.AbstractC0219i;
import g3.y;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import m3.j;
import m3.m;
import o3.C0721d;
import p3.InterfaceC0761e;
import s3.C0843T;
import s3.C0855k;
import u3.AbstractC0882d;
import u3.C0883e;
import v3.AbstractC0897d;
import v3.C0898e;
import z3.C0946a;

/* loaded from: classes.dex */
public abstract class d {
    public static /* synthetic */ void a(int i5) {
        String str = i5 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i5 != 18 ? 3 : 2];
        switch (i5) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "name";
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i5 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i5) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i5 == 18) {
            throw new IllegalStateException(str2);
        }
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [O2.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [O2.c, java.lang.Object] */
    public static f b(Class cls) {
        int i5 = 0;
        while (cls.isArray()) {
            i5++;
            cls = cls.getComponentType();
            AbstractC0219i.d("currentClass.componentType", cls);
        }
        if (cls.isPrimitive()) {
            if (cls.equals(Void.TYPE)) {
                return new f(N3.b.j(m.f8121d.g()), i5);
            }
            j jVarD = V3.c.b(cls.getName()).d();
            AbstractC0219i.d("get(currentClass.name).primitiveType", jVarD);
            return i5 > 0 ? new f(N3.b.j((N3.c) jVarD.f8082g.getValue()), i5 - 1) : new f(N3.b.j((N3.c) jVarD.f.getValue()), i5);
        }
        N3.b bVarA = AbstractC0897d.a(cls);
        String str = C0721d.f8248a;
        N3.b bVar = (N3.b) C0721d.f8254h.get(bVarA.b().i());
        if (bVar != null) {
            bVarA = bVar;
        }
        return new f(bVarA, i5);
    }

    public static C0104b c(String str, String str2) {
        a aVar = new a(str, str2);
        C0103a c0103aA = C0104b.a(a.class);
        c0103aA.f2981b = 1;
        c0103aA.f = new I0.b(4, aVar);
        return c0103aA.b();
    }

    public static final C0898e d(Annotation[] annotationArr, N3.c cVar) {
        Annotation annotation;
        AbstractC0219i.e("<this>", annotationArr);
        AbstractC0219i.e("fqName", cVar);
        int length = annotationArr.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i5];
            if (AbstractC0897d.a(y.z(y.s(annotation))).b().equals(cVar)) {
                break;
            }
            i5++;
        }
        if (annotation != null) {
            return new C0898e(annotation);
        }
        return null;
    }

    public static C0104b e(String str, C2.a aVar) {
        C0103a c0103aA = C0104b.a(a.class);
        c0103aA.f2981b = 1;
        c0103aA.a(new k(1, 0, Context.class));
        c0103aA.f = new h(str, aVar);
        return c0103aA.b();
    }

    public static C0843T f(N3.f fVar, InterfaceC0761e interfaceC0761e) {
        if (fVar == null) {
            a(19);
            throw null;
        }
        if (interfaceC0761e == null) {
            a(20);
            throw null;
        }
        Collection collectionK = interfaceC0761e.k();
        if (collectionK.size() != 1) {
            return null;
        }
        for (C0843T c0843t : ((C0855k) collectionK.iterator().next()).v0()) {
            if (c0843t.getName().equals(fVar)) {
                return c0843t;
            }
        }
        return null;
    }

    public static final ArrayList g(Annotation[] annotationArr) {
        AbstractC0219i.e("<this>", annotationArr);
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new C0898e(annotation));
        }
        return arrayList;
    }

    public static void h(G3.m mVar, Annotation annotation, Class cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        AbstractC0219i.d("annotationType.declaredMethods", declaredMethods);
        for (Method method : declaredMethods) {
            try {
                Object objInvoke = method.invoke(annotation, null);
                AbstractC0219i.b(objInvoke);
                N3.f fVarE = N3.f.e(method.getName());
                Class<?> enclosingClass = objInvoke.getClass();
                if (enclosingClass.equals(Class.class)) {
                    mVar.o(fVarE, b((Class) objInvoke));
                } else if (AbstractC0882d.f9189a.contains(enclosingClass)) {
                    mVar.n(fVarE, objInvoke);
                } else {
                    List list = AbstractC0897d.f9243a;
                    if (Enum.class.isAssignableFrom(enclosingClass)) {
                        if (!enclosingClass.isEnum()) {
                            enclosingClass = enclosingClass.getEnclosingClass();
                        }
                        AbstractC0219i.d("if (clazz.isEnum) clazz else clazz.enclosingClass", enclosingClass);
                        mVar.q(fVarE, AbstractC0897d.a(enclosingClass), N3.f.e(((Enum) objInvoke).name()));
                    } else if (Annotation.class.isAssignableFrom(enclosingClass)) {
                        Class<?>[] interfaces = enclosingClass.getInterfaces();
                        AbstractC0219i.d("clazz.interfaces", interfaces);
                        Class cls2 = (Class) i.v0(interfaces);
                        AbstractC0219i.d("annotationClass", cls2);
                        G3.m mVarP = mVar.p(AbstractC0897d.a(cls2), fVarE);
                        if (mVarP != null) {
                            h(mVarP, (Annotation) objInvoke, cls2);
                        }
                    } else {
                        if (!enclosingClass.isArray()) {
                            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + objInvoke);
                        }
                        n nVarR = mVar.r(fVarE);
                        if (nVarR != null) {
                            Class<?> componentType = enclosingClass.getComponentType();
                            if (componentType.isEnum()) {
                                N3.b bVarA = AbstractC0897d.a(componentType);
                                for (Object obj : (Object[]) objInvoke) {
                                    AbstractC0219i.c("null cannot be cast to non-null type kotlin.Enum<*>", obj);
                                    nVarR.n0(bVarA, N3.f.e(((Enum) obj).name()));
                                }
                            } else if (componentType.equals(Class.class)) {
                                for (Object obj2 : (Object[]) objInvoke) {
                                    AbstractC0219i.c("null cannot be cast to non-null type java.lang.Class<*>", obj2);
                                    nVarR.x(b((Class) obj2));
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                for (Object obj3 : (Object[]) objInvoke) {
                                    G3.m mVarG = nVarR.G(AbstractC0897d.a(componentType));
                                    if (mVarG != null) {
                                        AbstractC0219i.c("null cannot be cast to non-null type kotlin.Annotation", obj3);
                                        h(mVarG, (Annotation) obj3, componentType);
                                    }
                                }
                            } else {
                                for (Object obj4 : (Object[]) objInvoke) {
                                    nVarR.s0(obj4);
                                }
                            }
                            nVarR.m();
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        mVar.m();
    }

    public static LinkedHashSet i(N3.f fVar, Collection collection, Collection collection2, InterfaceC0761e interfaceC0761e, l lVar, p pVar, boolean z4) {
        if (fVar == null) {
            a(12);
            throw null;
        }
        if (collection == null) {
            a(13);
            throw null;
        }
        if (interfaceC0761e == null) {
            a(15);
            throw null;
        }
        if (lVar == null) {
            a(16);
            throw null;
        }
        if (pVar == null) {
            a(17);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        pVar.h(fVar, collection, collection2, interfaceC0761e, new C0946a(lVar, linkedHashSet, z4));
        return linkedHashSet;
    }

    public static LinkedHashSet j(N3.f fVar, AbstractCollection abstractCollection, Collection collection, InterfaceC0761e interfaceC0761e, l lVar, p pVar) {
        if (fVar == null) {
            a(0);
            throw null;
        }
        if (interfaceC0761e == null) {
            a(3);
            throw null;
        }
        if (lVar == null) {
            a(4);
            throw null;
        }
        if (pVar != null) {
            return i(fVar, abstractCollection, collection, interfaceC0761e, lVar, pVar, false);
        }
        a(5);
        throw null;
    }

    public static LinkedHashSet k(N3.f fVar, Collection collection, AbstractCollection abstractCollection, C3.k kVar, C0883e c0883e, p pVar) {
        if (fVar == null) {
            a(6);
            throw null;
        }
        if (collection == null) {
            a(7);
            throw null;
        }
        if (kVar == null) {
            a(9);
            throw null;
        }
        if (c0883e == null) {
            a(10);
            throw null;
        }
        if (pVar != null) {
            return i(fVar, collection, abstractCollection, kVar, c0883e, pVar, true);
        }
        a(11);
        throw null;
    }
}
