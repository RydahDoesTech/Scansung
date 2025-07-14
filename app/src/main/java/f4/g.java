package f4;

import b3.AbstractC0219i;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseInterface;
import e4.AbstractC0420c;
import e4.AbstractC0434q;
import e4.AbstractC0438v;
import e4.AbstractC0442z;
import e4.C;
import e4.C0421d;
import e4.C0430m;
import e4.C0437u;
import e4.G;
import e4.I;
import e4.J;
import e4.L;
import e4.N;
import e4.O;
import e4.V;
import e4.X;
import e4.Z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m3.AbstractC0695h;
import p3.C0777u;
import p3.InterfaceC0755Q;
import p3.InterfaceC0761e;
import p3.InterfaceC0763g;
import p3.InterfaceC0766j;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final G2.a f6741a = new G2.a("KotlinTypeRefiner");

    public static boolean A(h4.f fVar) {
        AbstractC0219i.e("$receiver", fVar);
        if (fVar instanceof J) {
            return ((J) fVar).h();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fVar);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, fVar.getClass(), sb).toString());
    }

    public static boolean B(h4.c cVar) {
        AbstractC0219i.e("$receiver", cVar);
        if (cVar instanceof AbstractC0438v) {
            return AbstractC0420c.i((AbstractC0438v) cVar);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(cVar);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, cVar.getClass(), sb).toString());
    }

    public static boolean C(h4.f fVar) {
        AbstractC0219i.e("$receiver", fVar);
        if (fVar instanceof J) {
            InterfaceC0763g interfaceC0763gI = ((J) fVar).i();
            InterfaceC0761e interfaceC0761e = interfaceC0763gI instanceof InterfaceC0761e ? (InterfaceC0761e) interfaceC0763gI : null;
            return (interfaceC0761e != null ? interfaceC0761e.S() : null) instanceof C0777u;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fVar);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, fVar.getClass(), sb).toString());
    }

    public static boolean D(h4.f fVar) {
        AbstractC0219i.e("$receiver", fVar);
        if (fVar instanceof J) {
            return fVar instanceof S3.m;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fVar);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, fVar.getClass(), sb).toString());
    }

    public static boolean E(h4.f fVar) {
        AbstractC0219i.e("$receiver", fVar);
        if (fVar instanceof J) {
            return fVar instanceof C0437u;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fVar);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, fVar.getClass(), sb).toString());
    }

    public static boolean F(h4.d dVar) {
        AbstractC0219i.e("$receiver", dVar);
        if (dVar instanceof AbstractC0442z) {
            return ((AbstractC0442z) dVar).J0();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, dVar.getClass(), sb).toString());
    }

    public static boolean G(h4.f fVar) {
        AbstractC0219i.e("$receiver", fVar);
        if (fVar instanceof J) {
            return AbstractC0695h.F((J) fVar, m3.m.f8117b);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fVar);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, fVar.getClass(), sb).toString());
    }

    public static boolean H(h4.c cVar) {
        AbstractC0219i.e("$receiver", cVar);
        if (cVar instanceof AbstractC0438v) {
            return X.e((AbstractC0438v) cVar);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(cVar);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, cVar.getClass(), sb).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean I(h4.d dVar) {
        AbstractC0219i.e("$receiver", dVar);
        if (dVar instanceof AbstractC0438v) {
            return AbstractC0695h.E((AbstractC0438v) dVar);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, dVar.getClass(), sb).toString());
    }

    public static boolean J(h4.b bVar) {
        if (bVar instanceof h) {
            return ((h) bVar).f6746j;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(bVar);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, bVar.getClass(), sb).toString());
    }

    public static boolean K(N n) {
        AbstractC0219i.e("$receiver", n);
        if (n instanceof N) {
            return n.c();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(n);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, n.getClass(), sb).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void L(h4.d dVar) {
        AbstractC0219i.e("$receiver", dVar);
        if (dVar instanceof AbstractC0442z) {
            boolean z4 = ((AbstractC0438v) dVar) instanceof C0430m;
            return;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, dVar.getClass(), sb).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void M(h4.d dVar) {
        AbstractC0219i.e("$receiver", dVar);
        if (dVar instanceof AbstractC0442z) {
            boolean z4 = ((AbstractC0438v) dVar) instanceof C0430m;
            return;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, dVar.getClass(), sb).toString());
    }

    public static AbstractC0442z N(AbstractC0434q abstractC0434q) {
        if (abstractC0434q instanceof AbstractC0434q) {
            return abstractC0434q.f6693e;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(abstractC0434q);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, abstractC0434q.getClass(), sb).toString());
    }

    public static Z O(h4.b bVar) {
        if (bVar instanceof h) {
            return ((h) bVar).f6743g;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(bVar);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, bVar.getClass(), sb).toString());
    }

    public static Z P(h4.c cVar) {
        if (cVar instanceof Z) {
            return AbstractC0420c.l((Z) cVar, false);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(cVar);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, cVar.getClass(), sb).toString());
    }

    public static AbstractC0442z Q(C0430m c0430m) {
        if (c0430m instanceof C0430m) {
            return c0430m.f6689e;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(c0430m);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, c0430m.getClass(), sb).toString());
    }

    public static int R(h4.f fVar) {
        AbstractC0219i.e("$receiver", fVar);
        if (fVar instanceof J) {
            return ((J) fVar).k().size();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fVar);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, fVar.getClass(), sb).toString());
    }

    public static Set S(b bVar, h4.d dVar) {
        AbstractC0219i.e("$receiver", dVar);
        J jD0 = bVar.d0(dVar);
        if (jD0 instanceof S3.m) {
            return ((S3.m) jD0).f2537a;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, dVar.getClass(), sb).toString());
    }

    public static N T(R3.b bVar) {
        AbstractC0219i.e("$receiver", bVar);
        if (bVar instanceof i) {
            return ((i) bVar).f6747a;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(bVar);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, bVar.getClass(), sb).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a U(b bVar, h4.d dVar) {
        if (dVar instanceof AbstractC0442z) {
            AbstractC0438v abstractC0438v = (AbstractC0438v) dVar;
            return new a(bVar, new V(L.f6660b.f(abstractC0438v.I0(), abstractC0438v.s0())));
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, dVar.getClass(), sb).toString());
    }

    public static Collection V(h4.f fVar) {
        AbstractC0219i.e("$receiver", fVar);
        if (fVar instanceof J) {
            Collection collectionJ = ((J) fVar).j();
            AbstractC0219i.d("this.supertypes", collectionJ);
            return collectionJ;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fVar);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, fVar.getClass(), sb).toString());
    }

    public static J W(h4.d dVar) {
        AbstractC0219i.e("$receiver", dVar);
        if (dVar instanceof AbstractC0442z) {
            return ((AbstractC0442z) dVar).I0();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, dVar.getClass(), sb).toString());
    }

    public static i X(h4.b bVar) {
        AbstractC0219i.e("$receiver", bVar);
        if (bVar instanceof h) {
            return ((h) bVar).f;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(bVar);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, bVar.getClass(), sb).toString());
    }

    public static AbstractC0442z Y(AbstractC0434q abstractC0434q) {
        if (abstractC0434q instanceof AbstractC0434q) {
            return abstractC0434q.f;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(abstractC0434q);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, abstractC0434q.getClass(), sb).toString());
    }

    public static AbstractC0442z Z(h4.d dVar, boolean z4) {
        AbstractC0219i.e("$receiver", dVar);
        if (dVar instanceof AbstractC0442z) {
            return ((AbstractC0442z) dVar).M0(z4);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, dVar.getClass(), sb).toString());
    }

    public static /* synthetic */ void a(int i5) {
        Object[] objArr = new Object[3];
        switch (i5) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i5) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static h4.c a0(b bVar, h4.c cVar) {
        if (cVar instanceof h4.d) {
            return bVar.h((h4.d) cVar, true);
        }
        if (!(cVar instanceof AbstractC0434q)) {
            throw new IllegalStateException("sealed");
        }
        AbstractC0434q abstractC0434q = (AbstractC0434q) cVar;
        return bVar.e(bVar.h(bVar.a0(abstractC0434q), true), bVar.h(bVar.g0(abstractC0434q), true));
    }

    public static boolean b(h4.f fVar, h4.f fVar2) {
        AbstractC0219i.e("c1", fVar);
        AbstractC0219i.e("c2", fVar2);
        if (!(fVar instanceof J)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(fVar);
            sb.append(", ");
            throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, fVar.getClass(), sb).toString());
        }
        if (fVar2 instanceof J) {
            return fVar.equals(fVar2);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(fVar2);
        sb2.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, fVar2.getClass(), sb2).toString());
    }

    public static int c(h4.c cVar) {
        AbstractC0219i.e("$receiver", cVar);
        if (cVar instanceof AbstractC0438v) {
            return ((AbstractC0438v) cVar).s0().size();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(cVar);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, cVar.getClass(), sb).toString());
    }

    public static h4.e d(h4.d dVar) {
        AbstractC0219i.e("$receiver", dVar);
        if (dVar instanceof AbstractC0442z) {
            return (h4.e) dVar;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, dVar.getClass(), sb).toString());
    }

    public static h4.b e(b bVar, h4.d dVar) {
        AbstractC0219i.e("$receiver", dVar);
        if (dVar instanceof AbstractC0442z) {
            if (dVar instanceof C) {
                return bVar.U(((C) dVar).f6641e);
            }
            if (dVar instanceof h) {
                return (h) dVar;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, dVar.getClass(), sb).toString());
    }

    public static C0430m f(h4.d dVar) {
        AbstractC0219i.e("$receiver", dVar);
        if (dVar instanceof AbstractC0442z) {
            if (dVar instanceof C0430m) {
                return (C0430m) dVar;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(dVar);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, dVar.getClass(), sb).toString());
    }

    public static AbstractC0434q g(h4.c cVar) {
        AbstractC0219i.e("$receiver", cVar);
        if (cVar instanceof AbstractC0438v) {
            Z zL0 = ((AbstractC0438v) cVar).L0();
            if (zL0 instanceof AbstractC0434q) {
                return (AbstractC0434q) zL0;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(cVar);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, cVar.getClass(), sb).toString());
    }

    public static AbstractC0442z h(h4.c cVar) {
        AbstractC0219i.e("$receiver", cVar);
        if (cVar instanceof AbstractC0438v) {
            Z zL0 = ((AbstractC0438v) cVar).L0();
            if (zL0 instanceof AbstractC0442z) {
                return (AbstractC0442z) zL0;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(cVar);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, cVar.getClass(), sb).toString());
    }

    public static O i(h4.c cVar) {
        AbstractC0219i.e("$receiver", cVar);
        if (cVar instanceof AbstractC0438v) {
            return V1.a.a((AbstractC0438v) cVar);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(cVar);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, cVar.getClass(), sb).toString());
    }

    public static AbstractC0442z j(h4.d dVar) {
        List listS0;
        ArrayList arrayList;
        e eVar;
        A3.f.q(1, IDMDatabaseInterface.IDM_DB_NOTIINFO_STATUS);
        if (!(dVar instanceof AbstractC0442z)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(dVar);
            sb.append(", ");
            throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, dVar.getClass(), sb).toString());
        }
        AbstractC0442z abstractC0442z = (AbstractC0442z) dVar;
        if (abstractC0442z.s0().size() == abstractC0442z.I0().k().size() && ((listS0 = abstractC0442z.s0()) == null || !listS0.isEmpty())) {
            Iterator it = listS0.iterator();
            while (it.hasNext()) {
                if (((N) it.next()).a() != 1) {
                    List listK = abstractC0442z.I0().k();
                    AbstractC0219i.d("type.constructor.parameters", listK);
                    ArrayList arrayListT0 = P2.m.T0(listS0, listK);
                    arrayList = new ArrayList(P2.o.l0(arrayListT0));
                    Iterator it2 = arrayListT0.iterator();
                    while (it2.hasNext()) {
                        O2.f fVar = (O2.f) it2.next();
                        N nA = (N) fVar.f2006d;
                        InterfaceC0755Q interfaceC0755Q = (InterfaceC0755Q) fVar.f2007e;
                        if (nA.a() != 1) {
                            Z zL0 = (nA.c() || nA.a() != 2) ? null : nA.b().L0();
                            AbstractC0219i.d("parameter", interfaceC0755Q);
                            nA = V1.a.a(new h(1, new i(nA, null, null, interfaceC0755Q, 6), zL0, (G) null, false, 56));
                        }
                        arrayList.add(nA);
                    }
                    V v2 = new V(L.f6660b.f(abstractC0442z.I0(), arrayList));
                    int size = listS0.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        N n = (N) listS0.get(i5);
                        N n2 = (N) arrayList.get(i5);
                        if (n.a() != 1) {
                            List upperBounds = ((InterfaceC0755Q) abstractC0442z.I0().k().get(i5)).getUpperBounds();
                            AbstractC0219i.d("type.constructor.parameters[index].upperBounds", upperBounds);
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it3 = upperBounds.iterator();
                            while (true) {
                                boolean zHasNext = it3.hasNext();
                                eVar = e.f6738d;
                                if (!zHasNext) {
                                    break;
                                }
                                arrayList2.add(eVar.g(v2.g(1, (AbstractC0438v) it3.next()).L0()));
                            }
                            if (!n.c() && n.a() == 3) {
                                arrayList2.add(eVar.g(n.b().L0()));
                            }
                            AbstractC0438v abstractC0438vB = n2.b();
                            AbstractC0219i.c("null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType", abstractC0438vB);
                            i iVar = ((h) abstractC0438vB).f;
                            iVar.getClass();
                            iVar.f6748b = new c4.d(arrayList2, 2);
                        }
                    }
                }
            }
            arrayList = null;
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            return C0421d.r(abstractC0442z.H0(), abstractC0442z.I0(), arrayList, abstractC0442z.J0());
        }
        return null;
    }

    public static int k(h4.b bVar) {
        AbstractC0219i.e("$receiver", bVar);
        if (bVar instanceof h) {
            return ((h) bVar).f6742e;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(bVar);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, bVar.getClass(), sb).toString());
    }

    public static I l(boolean z4, boolean z5, e eVar, e eVar2, f fVar, int i5) {
        if ((i5 & 2) != 0) {
            z5 = true;
        }
        boolean z6 = z5;
        if ((i5 & 4) != 0) {
            eVar = e.f6739e;
        }
        e eVar3 = eVar;
        if ((i5 & 8) != 0) {
            eVar2 = e.f6738d;
        }
        e eVar4 = eVar2;
        if ((i5 & 16) != 0) {
            fVar = f.f6740a;
        }
        f fVar2 = fVar;
        AbstractC0219i.e("typeSystemContext", eVar3);
        AbstractC0219i.e("kotlinTypePreparator", eVar4);
        AbstractC0219i.e("kotlinTypeRefiner", fVar2);
        return new I(z4, z6, eVar3, eVar4, fVar2);
    }

    public static Z m(b bVar, h4.d dVar, h4.d dVar2) {
        AbstractC0219i.e("lowerBound", dVar);
        AbstractC0219i.e("upperBound", dVar2);
        if (!(dVar instanceof AbstractC0442z)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(bVar);
            sb.append(", ");
            throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, bVar.getClass(), sb).toString());
        }
        if (dVar2 instanceof AbstractC0442z) {
            return C0421d.j((AbstractC0442z) dVar, (AbstractC0442z) dVar2);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(bVar);
        sb2.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, bVar.getClass(), sb2).toString());
    }

    public static final String n(J j5) {
        StringBuilder sb = new StringBuilder();
        o("type: " + j5, sb);
        o("hashCode: " + j5.hashCode(), sb);
        o("javaClass: " + j5.getClass().getCanonicalName(), sb);
        for (InterfaceC0766j interfaceC0766jI = j5.i(); interfaceC0766jI != null; interfaceC0766jI = interfaceC0766jI.l()) {
            o("fqName: ".concat(P3.g.f2193c.u(interfaceC0766jI)), sb);
            o("javaClass: " + interfaceC0766jI.getClass().getCanonicalName(), sb);
        }
        String string = sb.toString();
        AbstractC0219i.d("StringBuilder().apply(builderAction).toString()", string);
        return string;
    }

    public static final void o(String str, StringBuilder sb) {
        AbstractC0219i.e("<this>", str);
        sb.append(str);
        sb.append('\n');
    }

    public static N p(h4.c cVar, int i5) {
        AbstractC0219i.e("$receiver", cVar);
        if (cVar instanceof AbstractC0438v) {
            return (N) ((AbstractC0438v) cVar).s0().get(i5);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(cVar);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, cVar.getClass(), sb).toString());
    }

    public static InterfaceC0755Q q(h4.f fVar, int i5) {
        AbstractC0219i.e("$receiver", fVar);
        if (fVar instanceof J) {
            Object obj = ((J) fVar).k().get(i5);
            AbstractC0219i.d("this.parameters[index]", obj);
            return (InterfaceC0755Q) obj;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fVar);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, fVar.getClass(), sb).toString());
    }

    public static Z r(N n) {
        AbstractC0219i.e("$receiver", n);
        if (n instanceof N) {
            return n.b().L0();
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(n);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, n.getClass(), sb).toString());
    }

    public static InterfaceC0755Q s(h4.f fVar) {
        AbstractC0219i.e("$receiver", fVar);
        if (fVar instanceof J) {
            InterfaceC0763g interfaceC0763gI = ((J) fVar).i();
            if (interfaceC0763gI instanceof InterfaceC0755Q) {
                return (InterfaceC0755Q) interfaceC0763gI;
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fVar);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, fVar.getClass(), sb).toString());
    }

    public static int t(N n) {
        AbstractC0219i.e("$receiver", n);
        if (n instanceof N) {
            int iA = n.a();
            A3.f.u(iA, "this.projectionKind");
            return Y0.j.n(iA);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(n);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, n.getClass(), sb).toString());
    }

    public static boolean u(AbstractC0438v abstractC0438v, N3.c cVar) {
        AbstractC0219i.e("$receiver", abstractC0438v);
        AbstractC0219i.e("fqName", cVar);
        return abstractC0438v.s().e(cVar);
    }

    public static boolean v(InterfaceC0755Q interfaceC0755Q, h4.f fVar) {
        if (fVar == null ? true : fVar instanceof J) {
            return V1.a.U(interfaceC0755Q, (J) fVar, null);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(interfaceC0755Q);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, interfaceC0755Q.getClass(), sb).toString());
    }

    public static boolean w(h4.d dVar, h4.d dVar2) {
        AbstractC0219i.e("a", dVar);
        AbstractC0219i.e("b", dVar2);
        if (!(dVar instanceof AbstractC0442z)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(dVar);
            sb.append(", ");
            throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, dVar.getClass(), sb).toString());
        }
        if (dVar2 instanceof AbstractC0442z) {
            return ((AbstractC0442z) dVar).s0() == ((AbstractC0442z) dVar2).s0();
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(dVar2);
        sb2.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, dVar2.getClass(), sb2).toString());
    }

    public static boolean x(h4.f fVar) {
        AbstractC0219i.e("$receiver", fVar);
        if (fVar instanceof J) {
            return AbstractC0695h.F((J) fVar, m3.m.f8115a);
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fVar);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, fVar.getClass(), sb).toString());
    }

    public static boolean y(h4.f fVar) {
        AbstractC0219i.e("$receiver", fVar);
        if (fVar instanceof J) {
            return ((J) fVar).i() instanceof InterfaceC0761e;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fVar);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, fVar.getClass(), sb).toString());
    }

    public static boolean z(h4.f fVar) {
        if (fVar instanceof J) {
            InterfaceC0763g interfaceC0763gI = ((J) fVar).i();
            InterfaceC0761e interfaceC0761e = interfaceC0763gI instanceof InterfaceC0761e ? (InterfaceC0761e) interfaceC0763gI : null;
            return (interfaceC0761e == null || interfaceC0761e.i() != 1 || interfaceC0761e.L() == 3 || interfaceC0761e.L() == 4 || interfaceC0761e.L() == 5) ? false : true;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(fVar);
        sb.append(", ");
        throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, fVar.getClass(), sb).toString());
    }
}
