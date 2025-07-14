package j3;

import b3.AbstractC0219i;
import b3.C0211a;
import b3.InterfaceC0216f;
import e4.AbstractC0438v;
import g3.InterfaceC0456f;
import g3.InterfaceC0466p;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;
import k3.C0674f;
import k3.C0675g;
import k3.InterfaceC0673e;
import p3.AbstractC0771o;
import p3.InterfaceC0761e;
import p3.InterfaceC0776t;
import s3.AbstractC0859o;
import s3.C0843T;
import s3.C0855k;

/* loaded from: classes.dex */
public final class F extends r implements InterfaceC0216f, InterfaceC0456f, InterfaceC0565e {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0466p[] f7329k;

    /* renamed from: e, reason: collision with root package name */
    public final D f7330e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f7331g;

    /* renamed from: h, reason: collision with root package name */
    public final q0 f7332h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f7333i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f7334j;

    static {
        b3.r rVar = b3.q.f5100a;
        f7329k = new InterfaceC0466p[]{rVar.e(new b3.n(rVar.b(F.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"))};
    }

    public F(D d5, String str, String str2, InterfaceC0776t interfaceC0776t, Object obj) {
        this.f7330e = d5;
        this.f = str2;
        this.f7331g = obj;
        this.f7332h = s0.h(interfaceC0776t, new B3.a(this, 8, str));
        this.f7333i = g3.y.M(2, new E(this, 0));
        this.f7334j = g3.y.M(2, new E(this, 1));
    }

    public static final k3.t p(F f, Constructor constructor, InterfaceC0776t interfaceC0776t, boolean z4) {
        Class<?> cls = null;
        if (!z4) {
            f.getClass();
            C0855k c0855k = interfaceC0776t instanceof C0855k ? (C0855k) interfaceC0776t : null;
            if (c0855k != null) {
                C0855k c0855k2 = c0855k;
                if (!AbstractC0771o.e(c0855k2.b())) {
                    InterfaceC0761e interfaceC0761eX = c0855k.X();
                    AbstractC0219i.d("constructorDescriptor.constructedClass", interfaceC0761eX);
                    if (!Q3.j.b(interfaceC0761eX) && !Q3.f.r(c0855k.X())) {
                        List listV0 = c0855k2.v0();
                        AbstractC0219i.d("constructorDescriptor.valueParameters", listV0);
                        if (!listV0.isEmpty()) {
                            Iterator it = listV0.iterator();
                            while (it.hasNext()) {
                                AbstractC0438v abstractC0438vD = ((C0843T) it.next()).d();
                                AbstractC0219i.d("it.type", abstractC0438vD);
                                if (Y0.j.M(abstractC0438vD)) {
                                    if (f.o()) {
                                        return new C0674f(constructor, g3.y.i(f.f7331g, f.l()), 0);
                                    }
                                    AbstractC0219i.e("constructor", constructor);
                                    Class declaringClass = constructor.getDeclaringClass();
                                    AbstractC0219i.d("constructor.declaringClass", declaringClass);
                                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                                    AbstractC0219i.d("constructor.genericParameterTypes", genericParameterTypes);
                                    return new C0675g(constructor, declaringClass, cls, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : P2.i.m0(genericParameterTypes, 0, genericParameterTypes.length - 1)), 0);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (f.o()) {
            return new C0674f(constructor, g3.y.i(f.f7331g, f.l()), 1);
        }
        AbstractC0219i.e("constructor", constructor);
        Class declaringClass2 = constructor.getDeclaringClass();
        AbstractC0219i.d("constructor.declaringClass", declaringClass2);
        Class declaringClass3 = constructor.getDeclaringClass();
        Class<?> declaringClass4 = declaringClass3.getDeclaringClass();
        if (declaringClass4 != null && !Modifier.isStatic(declaringClass3.getModifiers())) {
            cls = declaringClass4;
        }
        Type[] genericParameterTypes2 = constructor.getGenericParameterTypes();
        AbstractC0219i.d("constructor.genericParameterTypes", genericParameterTypes2);
        return new C0675g(constructor, declaringClass2, cls, genericParameterTypes2, 1);
    }

    @Override // a3.InterfaceC0106a
    public final Object a() {
        return i(new Object[0]);
    }

    @Override // a3.InterfaceC0109d
    public final Object b(AbstractC0438v abstractC0438v, Object obj, G3.r rVar) {
        return i(abstractC0438v, obj, rVar);
    }

    @Override // a3.InterfaceC0108c
    public final Object c(Object obj, Object obj2) {
        return i(obj, obj2);
    }

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        return i(obj);
    }

    public final boolean equals(Object obj) {
        F fB = x0.b(obj);
        return fB != null && AbstractC0219i.a(this.f7330e, fB.f7330e) && getName().equals(fB.getName()) && AbstractC0219i.a(this.f, fB.f) && AbstractC0219i.a(this.f7331g, fB.f7331g);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [O2.c, java.lang.Object] */
    @Override // j3.r
    public final InterfaceC0673e g() {
        return (InterfaceC0673e) this.f7333i.getValue();
    }

    @Override // g3.InterfaceC0452b
    public final String getName() {
        String strB = ((AbstractC0859o) l()).getName().b();
        AbstractC0219i.d("descriptor.name.asString()", strB);
        return strB;
    }

    @Override // g3.InterfaceC0452b
    public final boolean h() {
        return l().h();
    }

    public final int hashCode() {
        return this.f.hashCode() + ((getName().hashCode() + (this.f7330e.hashCode() * 31)) * 31);
    }

    @Override // j3.r
    public final D j() {
        return this.f7330e;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [O2.c, java.lang.Object] */
    @Override // j3.r
    public final InterfaceC0673e k() {
        return (InterfaceC0673e) this.f7334j.getValue();
    }

    @Override // j3.r
    public final boolean o() {
        return !AbstractC0219i.a(this.f7331g, C0211a.f5085d);
    }

    @Override // j3.r
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0776t l() {
        InterfaceC0466p interfaceC0466p = f7329k[0];
        Object objA = this.f7332h.a();
        AbstractC0219i.d("<get-descriptor>(...)", objA);
        return (InterfaceC0776t) objA;
    }

    public final String toString() {
        P3.g gVar = u0.f7441a;
        return u0.b(l());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public F(D d5, InterfaceC0776t interfaceC0776t) {
        AbstractC0219i.e("container", d5);
        AbstractC0219i.e("descriptor", interfaceC0776t);
        String strB = ((AbstractC0859o) interfaceC0776t).getName().b();
        AbstractC0219i.d("descriptor.name.asString()", strB);
        this(d5, strB, v0.c(interfaceC0776t).d(), interfaceC0776t, C0211a.f5085d);
    }
}
