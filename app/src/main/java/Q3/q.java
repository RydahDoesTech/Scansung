package Q3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import c4.s;
import e4.AbstractC0438v;
import e4.C0421d;
import e4.G;
import e4.J;
import e4.O;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import p3.AbstractC0771o;
import p3.AbstractC0779w;
import p3.C0770n;
import p3.InterfaceC0750L;
import p3.InterfaceC0752N;
import p3.InterfaceC0758b;
import p3.InterfaceC0759c;
import p3.InterfaceC0761e;
import p3.InterfaceC0763g;
import p3.InterfaceC0766j;
import p3.InterfaceC0776t;
import q3.C0796f;
import q3.C0797g;
import q3.InterfaceC0798h;
import s3.AbstractC0846b;
import s3.C0834J;
import s3.C0835K;
import s3.C0836L;
import s3.C0837M;
import s3.C0843T;
import s3.C0867w;
import x3.EnumC0915b;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final G2.a f2361a = new G2.a("ResolutionAnchorProvider");

    public static /* synthetic */ void a(int i5) {
        String str = (i5 == 12 || i5 == 23 || i5 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i5 == 12 || i5 == 23 || i5 == 25) ? 2 : 3];
        switch (i5) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i5 == 12) {
            objArr[1] = "createSetter";
        } else if (i5 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i5 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i5) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i5 != 12 && i5 != 23 && i5 != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static final void c(InterfaceC0761e interfaceC0761e, LinkedHashSet linkedHashSet, X3.n nVar, boolean z4) {
        for (InterfaceC0766j interfaceC0766j : V1.a.A(nVar, X3.f.f2771o, 2)) {
            if (interfaceC0766j instanceof InterfaceC0761e) {
                InterfaceC0761e interfaceC0761eO0 = (InterfaceC0761e) interfaceC0766j;
                if (interfaceC0761eO0.z()) {
                    N3.f name = interfaceC0761eO0.getName();
                    AbstractC0219i.d("descriptor.name", name);
                    InterfaceC0763g interfaceC0763gG = nVar.g(name, EnumC0915b.f9317g);
                    interfaceC0761eO0 = interfaceC0763gG instanceof InterfaceC0761e ? (InterfaceC0761e) interfaceC0763gG : interfaceC0763gG instanceof s ? ((s) interfaceC0763gG).O0() : null;
                }
                if (interfaceC0761eO0 == null) {
                    continue;
                } else {
                    if (interfaceC0761e == null) {
                        f.a(27);
                        throw null;
                    }
                    int i5 = f.f2341a;
                    Iterator it = interfaceC0761eO0.I().j().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (f.q((AbstractC0438v) it.next(), interfaceC0761e.a())) {
                                linkedHashSet.add(interfaceC0761eO0);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z4) {
                        X3.n nVarR = interfaceC0761eO0.R();
                        AbstractC0219i.d("refinedDescriptor.unsubstitutedInnerClassesScope", nVarR);
                        c(interfaceC0761e, linkedHashSet, nVarR, z4);
                    }
                }
            }
        }
    }

    public static C0867w e(InterfaceC0758b interfaceC0758b, AbstractC0438v abstractC0438v, N3.f fVar, InterfaceC0798h interfaceC0798h, int i5) {
        if (interfaceC0798h == null) {
            a(33);
            throw null;
        }
        if (abstractC0438v == null) {
            return null;
        }
        Y3.a aVar = new Y3.a(interfaceC0758b, abstractC0438v, fVar);
        b3.p pVar = N3.g.f1844a;
        return new C0867w(interfaceC0758b, aVar, interfaceC0798h, N3.f.e("_context_receiver_" + i5));
    }

    public static C0835K f(InterfaceC0750L interfaceC0750L, InterfaceC0798h interfaceC0798h) {
        return l(interfaceC0750L, interfaceC0798h, true, interfaceC0750L.n());
    }

    public static C0836L g(InterfaceC0750L interfaceC0750L, InterfaceC0798h interfaceC0798h) {
        C0796f c0796f = C0797g.f8481a;
        InterfaceC0752N interfaceC0752NN = interfaceC0750L.n();
        if (interfaceC0752NN != null) {
            return m(interfaceC0750L, interfaceC0798h, c0796f, true, interfaceC0750L.b(), interfaceC0752NN);
        }
        a(6);
        throw null;
    }

    public static C0834J h(AbstractC0846b abstractC0846b) {
        if (abstractC0846b == null) {
            a(26);
            throw null;
        }
        InterfaceC0761e interfaceC0761eD = AbstractC0779w.d(f.d(abstractC0846b), N3.i.f1868t);
        if (interfaceC0761eD == null) {
            return null;
        }
        C0796f c0796f = C0797g.f8481a;
        C0770n c0770n = AbstractC0771o.f8423e;
        C0834J c0834jP0 = C0834J.P0(abstractC0846b, 1, c0770n, false, m3.n.f8143b, 4, abstractC0846b.n());
        C0835K c0835k = new C0835K(c0834jP0, c0796f, 1, c0770n, false, false, false, 4, null, abstractC0846b.n());
        c0834jP0.S0(c0835k, null, null, null);
        G.f6646e.getClass();
        G g5 = G.f;
        J jI = interfaceC0761eD.I();
        List listSingletonList = Collections.singletonList(new O(1, abstractC0846b.q()));
        AbstractC0219i.e("attributes", g5);
        AbstractC0219i.e("constructor", jI);
        AbstractC0219i.e("arguments", listSingletonList);
        c0834jP0.V0(C0421d.r(g5, jI, listSingletonList, false), Collections.emptyList(), null, null, Collections.emptyList());
        c0835k.R0(c0834jP0.o());
        return c0834jP0;
    }

    public static C0837M i(AbstractC0846b abstractC0846b) {
        if (abstractC0846b == null) {
            a(24);
            throw null;
        }
        C0796f c0796f = C0797g.f8481a;
        C0837M c0837mZ0 = C0837M.Z0(abstractC0846b, m3.n.f8144c, 4, abstractC0846b.n());
        return c0837mZ0.T0(null, null, Collections.emptyList(), Collections.emptyList(), Collections.singletonList(new C0843T(c0837mZ0, null, 0, c0796f, N3.f.e("value"), U3.f.e(abstractC0846b).t(), false, false, false, null, abstractC0846b.n())), abstractC0846b.q(), 1, AbstractC0771o.f8423e);
    }

    public static C0837M j(AbstractC0846b abstractC0846b) {
        if (abstractC0846b != null) {
            return C0837M.Z0(abstractC0846b, m3.n.f8142a, 4, abstractC0846b.n()).T0(null, null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), U3.f.e(abstractC0846b).h(abstractC0846b.q()), 1, AbstractC0771o.f8423e);
        }
        a(22);
        throw null;
    }

    public static C0867w k(InterfaceC0758b interfaceC0758b, AbstractC0438v abstractC0438v, InterfaceC0798h interfaceC0798h) {
        if (abstractC0438v == null) {
            return null;
        }
        return new C0867w(interfaceC0758b, new Y3.b(interfaceC0758b, abstractC0438v), interfaceC0798h);
    }

    public static C0835K l(InterfaceC0750L interfaceC0750L, InterfaceC0798h interfaceC0798h, boolean z4, InterfaceC0752N interfaceC0752N) {
        if (interfaceC0798h == null) {
            a(18);
            throw null;
        }
        if (interfaceC0752N != null) {
            return new C0835K(interfaceC0750L, interfaceC0798h, interfaceC0750L.i(), interfaceC0750L.b(), z4, false, false, 1, null, interfaceC0752N);
        }
        a(19);
        throw null;
    }

    public static C0836L m(InterfaceC0750L interfaceC0750L, InterfaceC0798h interfaceC0798h, InterfaceC0798h interfaceC0798h2, boolean z4, C0770n c0770n, InterfaceC0752N interfaceC0752N) {
        if (interfaceC0798h == null) {
            a(8);
            throw null;
        }
        if (interfaceC0798h2 == null) {
            a(9);
            throw null;
        }
        if (c0770n == null) {
            a(10);
            throw null;
        }
        if (interfaceC0752N == null) {
            a(11);
            throw null;
        }
        C0836L c0836l = new C0836L(interfaceC0750L, interfaceC0798h, interfaceC0750L.i(), c0770n, z4, false, false, 1, null, interfaceC0752N);
        c0836l.f8790p = C0836L.Q0(c0836l, interfaceC0750L.d(), interfaceC0798h2);
        return c0836l;
    }

    public static boolean n(InterfaceC0776t interfaceC0776t) {
        return interfaceC0776t.i0() == 4 && f.o(interfaceC0776t.l(), 3);
    }

    public static final Collection o(Collection collection, InterfaceC0107b interfaceC0107b) {
        AbstractC0219i.e("<this>", collection);
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        n4.h hVar = new n4.h();
        while (!linkedList.isEmpty()) {
            Object objU0 = P2.m.u0(linkedList);
            n4.h hVar2 = new n4.h();
            ArrayList arrayListG = p.g(objU0, linkedList, interfaceC0107b, new B3.d(9, hVar2));
            if (arrayListG.size() == 1 && hVar2.isEmpty()) {
                Object objI0 = P2.m.I0(arrayListG);
                AbstractC0219i.d("overridableGroup.single()", objI0);
                hVar.add(objI0);
            } else {
                Object objS = p.s(arrayListG, interfaceC0107b);
                InterfaceC0758b interfaceC0758b = (InterfaceC0758b) interfaceC0107b.d(objS);
                Iterator it = arrayListG.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    AbstractC0219i.d("it", next);
                    if (!p.k(interfaceC0758b, (InterfaceC0758b) interfaceC0107b.d(next))) {
                        hVar2.add(next);
                    }
                }
                if (!hVar2.isEmpty()) {
                    hVar.addAll(hVar2);
                }
                hVar.add(objS);
            }
        }
        return hVar;
    }

    public abstract void b(InterfaceC0759c interfaceC0759c);

    public abstract void d(InterfaceC0759c interfaceC0759c, InterfaceC0759c interfaceC0759c2);

    public void p(InterfaceC0759c interfaceC0759c, Collection collection) {
        AbstractC0219i.e("member", interfaceC0759c);
        interfaceC0759c.M(collection);
    }
}
