package C3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import e4.AbstractC0438v;
import e4.X;
import e4.Z;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m3.AbstractC0695h;
import p3.AbstractC0771o;
import p3.InterfaceC0750L;
import p3.InterfaceC0759c;
import p3.InterfaceC0761e;
import p3.InterfaceC0763g;
import p3.InterfaceC0766j;
import p3.InterfaceC0775s;
import p3.InterfaceC0776t;
import q3.C0796f;
import q3.C0797g;
import r0.AbstractC0807a;
import r0.AbstractC0808b;
import r0.AbstractC0809c;
import s0.AbstractC0823a;
import s3.C0835K;
import s3.C0836L;
import s3.C0837M;
import s3.C0843T;
import s3.C0867w;
import v3.AbstractC0897d;
import v3.C0889A;
import x3.EnumC0915b;
import y3.AbstractC0935d;
import y3.C0936e;
import y3.C0937f;

/* loaded from: classes.dex */
public final class r extends D {
    public final InterfaceC0761e n;

    /* renamed from: o, reason: collision with root package name */
    public final v3.o f431o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f432p;

    /* renamed from: q, reason: collision with root package name */
    public final d4.i f433q;

    /* renamed from: r, reason: collision with root package name */
    public final d4.i f434r;

    /* renamed from: s, reason: collision with root package name */
    public final d4.i f435s;

    /* renamed from: t, reason: collision with root package name */
    public final d4.i f436t;

    /* renamed from: u, reason: collision with root package name */
    public final d4.j f437u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(B3.g gVar, InterfaceC0761e interfaceC0761e, v3.o oVar, boolean z4, r rVar) {
        super(gVar, rVar);
        AbstractC0219i.e("c", gVar);
        AbstractC0219i.e("ownerDescriptor", interfaceC0761e);
        AbstractC0219i.e("jClass", oVar);
        this.n = interfaceC0761e;
        this.f431o = oVar;
        this.f432p = z4;
        d4.l lVar = ((B3.b) gVar.f255e).f223a;
        o oVar2 = new o(this, gVar);
        lVar.getClass();
        this.f433q = new d4.i(lVar, oVar2);
        p pVar = new p(this, 1);
        lVar.getClass();
        this.f434r = new d4.i(lVar, pVar);
        o oVar3 = new o(gVar, this);
        lVar.getClass();
        this.f435s = new d4.i(lVar, oVar3);
        p pVar2 = new p(this, 0);
        lVar.getClass();
        this.f436t = new d4.i(lVar, pVar2);
        this.f437u = lVar.c(new q(this, gVar));
    }

    public static C0837M C(C0837M c0837m, InterfaceC0776t interfaceC0776t, AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return c0837m;
        }
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            C0837M c0837m2 = (C0837M) it.next();
            if (!c0837m.equals(c0837m2) && c0837m2.E == null && F(c0837m2, interfaceC0776t)) {
                InterfaceC0776t interfaceC0776tI = c0837m.c0().N().i();
                AbstractC0219i.b(interfaceC0776tI);
                return (C0837M) interfaceC0776tI;
            }
        }
        return c0837m;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static s3.C0837M D(s3.C0837M r5) {
        /*
            java.util.List r0 = r5.v0()
            java.lang.String r1 = "valueParameters"
            b3.AbstractC0219i.d(r1, r0)
            java.lang.Object r0 = P2.m.D0(r0)
            s3.T r0 = (s3.C0843T) r0
            r2 = 0
            if (r0 == 0) goto L7d
            r3 = r0
            s3.U r3 = (s3.AbstractC0844U) r3
            e4.v r3 = r3.d()
            e4.J r3 = r3.I0()
            p3.g r3 = r3.i()
            if (r3 == 0) goto L36
            N3.e r3 = U3.f.h(r3)
            boolean r4 = r3.d()
            if (r4 == 0) goto L2e
            goto L2f
        L2e:
            r3 = r2
        L2f:
            if (r3 == 0) goto L36
            N3.c r3 = r3.g()
            goto L37
        L36:
            r3 = r2
        L37:
            N3.c r4 = m3.n.f
            boolean r3 = b3.AbstractC0219i.a(r3, r4)
            if (r3 == 0) goto L40
            goto L41
        L40:
            r0 = r2
        L41:
            if (r0 != 0) goto L44
            goto L7d
        L44:
            p3.s r2 = r5.c0()
            java.util.List r5 = r5.v0()
            b3.AbstractC0219i.d(r1, r5)
            java.util.List r5 = P2.m.s0(r5)
            p3.s r5 = r2.o(r5)
            s3.U r0 = (s3.AbstractC0844U) r0
            e4.v r0 = r0.d()
            java.util.List r0 = r0.s0()
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            e4.N r0 = (e4.N) r0
            e4.v r0 = r0.b()
            p3.s r5 = r5.m(r0)
            p3.t r5 = r5.i()
            s3.M r5 = (s3.C0837M) r5
            if (r5 != 0) goto L79
            goto L7c
        L79:
            r0 = 1
            r5.f8892x = r0
        L7c:
            return r5
        L7d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: C3.r.D(s3.M):s3.M");
    }

    public static boolean F(InterfaceC0776t interfaceC0776t, InterfaceC0776t interfaceC0776t2) {
        int iC = Q3.p.f2358c.n(interfaceC0776t2, interfaceC0776t, true).c();
        A3.f.u(iC, "DEFAULT.isOverridableByW…iptor, this, true).result");
        return iC == 1 && !AbstractC0823a.a(interfaceC0776t2, interfaceC0776t);
    }

    public static boolean G(C0837M c0837m, C0837M c0837m2) {
        int i5 = AbstractC0935d.f9398l;
        AbstractC0219i.e("<this>", c0837m);
        if (AbstractC0219i.a(c0837m.getName().b(), "removeAt") && AbstractC0219i.a(V1.a.k(c0837m), y3.F.f9378g.f9367b)) {
            c0837m2 = c0837m2.a();
        }
        AbstractC0219i.d("if (superDescriptor.isRe…iginal else subDescriptor", c0837m2);
        return F(c0837m2, c0837m);
    }

    public static C0837M H(InterfaceC0750L interfaceC0750L, String str, InterfaceC0107b interfaceC0107b) {
        C0837M c0837m;
        Iterator it = ((Iterable) interfaceC0107b.d(N3.f.e(str))).iterator();
        do {
            c0837m = null;
            if (!it.hasNext()) {
                break;
            }
            C0837M c0837m2 = (C0837M) it.next();
            if (c0837m2.v0().size() == 0) {
                f4.l lVar = f4.d.f6737a;
                AbstractC0438v abstractC0438v = c0837m2.f8879j;
                if (abstractC0438v == null ? false : lVar.b(abstractC0438v, interfaceC0750L.d())) {
                    c0837m = c0837m2;
                }
            }
        } while (c0837m == null);
        return c0837m;
    }

    public static C0837M J(InterfaceC0750L interfaceC0750L, InterfaceC0107b interfaceC0107b) {
        C0837M c0837m;
        AbstractC0438v abstractC0438v;
        String strB = interfaceC0750L.getName().b();
        AbstractC0219i.d("name.asString()", strB);
        Iterator it = ((Iterable) interfaceC0107b.d(N3.f.e(y3.w.b(strB)))).iterator();
        do {
            c0837m = null;
            if (!it.hasNext()) {
                break;
            }
            C0837M c0837m2 = (C0837M) it.next();
            if (c0837m2.v0().size() == 1 && (abstractC0438v = c0837m2.f8879j) != null) {
                N3.f fVar = AbstractC0695h.f8064e;
                if (AbstractC0695h.C(abstractC0438v, m3.m.f8121d)) {
                    f4.l lVar = f4.d.f6737a;
                    List listV0 = c0837m2.v0();
                    AbstractC0219i.d("descriptor.valueParameters", listV0);
                    if (lVar.a(((C0843T) P2.m.J0(listV0)).d(), interfaceC0750L.d())) {
                        c0837m = c0837m2;
                    }
                }
            }
        } while (c0837m == null);
        return c0837m;
    }

    public static boolean M(C0837M c0837m, InterfaceC0776t interfaceC0776t) {
        String strJ = V1.a.j(c0837m, 2);
        InterfaceC0776t interfaceC0776tA = interfaceC0776t.a();
        AbstractC0219i.d("builtinWithErasedParameters.original", interfaceC0776tA);
        return strJ.equals(V1.a.j(interfaceC0776tA, 2)) && !F(c0837m, interfaceC0776t);
    }

    public static final ArrayList v(r rVar, N3.f fVar) {
        Collection collectionF = ((InterfaceC0011c) rVar.f360e.a()).f(fVar);
        ArrayList arrayList = new ArrayList(P2.o.l0(collectionF));
        Iterator it = collectionF.iterator();
        while (it.hasNext()) {
            arrayList.add(rVar.t((v3.x) it.next()));
        }
        return arrayList;
    }

    public static final ArrayList w(r rVar, N3.f fVar) {
        LinkedHashSet linkedHashSetK = rVar.K(fVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSetK) {
            C0837M c0837m = (C0837M) obj;
            AbstractC0219i.e("<this>", c0837m);
            if (AbstractC0808b.b(c0837m) == null && C0937f.a(c0837m) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void A(Set set, AbstractCollection abstractCollection, n4.h hVar, InterfaceC0107b interfaceC0107b) {
        C0837M c0837mJ;
        C0836L c0836lM;
        A3.d dVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            InterfaceC0750L interfaceC0750L = (InterfaceC0750L) it.next();
            if (E(interfaceC0750L, interfaceC0107b)) {
                C0837M c0837mI = I(interfaceC0750L, interfaceC0107b);
                AbstractC0219i.b(c0837mI);
                if (interfaceC0750L.T()) {
                    c0837mJ = J(interfaceC0750L, interfaceC0107b);
                    AbstractC0219i.b(c0837mJ);
                } else {
                    c0837mJ = null;
                }
                if (c0837mJ != null) {
                    c0837mJ.i();
                    c0837mI.i();
                }
                InterfaceC0761e interfaceC0761e = this.n;
                AbstractC0219i.e("ownerDescriptor", interfaceC0761e);
                A3.d dVar2 = new A3.d(interfaceC0761e, C0797g.f8481a, c0837mI.i(), c0837mI.b(), c0837mJ != null, interfaceC0750L.getName(), c0837mI.n(), null, 1, false, null);
                AbstractC0438v abstractC0438v = c0837mI.f8879j;
                AbstractC0219i.b(abstractC0438v);
                P2.u uVar = P2.u.f2163d;
                dVar2.V0(abstractC0438v, uVar, p(), null, uVar);
                C0835K c0835kL = Q3.q.l(dVar2, c0837mI.s(), false, c0837mI.n());
                c0835kL.f8757o = c0837mI;
                c0835kL.R0(dVar2.d());
                if (c0837mJ != null) {
                    List listV0 = c0837mJ.v0();
                    AbstractC0219i.d("setterMethod.valueParameters", listV0);
                    C0843T c0843t = (C0843T) P2.m.w0(listV0);
                    if (c0843t == null) {
                        throw new AssertionError("No parameter found for " + c0837mJ);
                    }
                    c0836lM = Q3.q.m(dVar2, c0837mJ.s(), c0843t.s(), false, c0837mJ.b(), c0837mJ.n());
                    c0836lM.f8757o = c0837mJ;
                } else {
                    c0836lM = null;
                }
                dVar2.S0(c0835kL, c0836lM, null, null);
                dVar = dVar2;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                abstractCollection.add(dVar);
                if (hVar != null) {
                    hVar.add(interfaceC0750L);
                    return;
                }
                return;
            }
        }
    }

    public final Collection B() {
        boolean z4 = this.f432p;
        InterfaceC0761e interfaceC0761e = this.n;
        if (z4) {
            Collection collectionJ = interfaceC0761e.I().j();
            AbstractC0219i.d("ownerDescriptor.typeConstructor.supertypes", collectionJ);
            return collectionJ;
        }
        ((B3.b) this.f357b.f255e).f241u.getClass();
        AbstractC0219i.e("classDescriptor", interfaceC0761e);
        Collection collectionJ2 = interfaceC0761e.I().j();
        AbstractC0219i.d("classDescriptor.typeConstructor.supertypes", collectionJ2);
        return collectionJ2;
    }

    public final boolean E(InterfaceC0750L interfaceC0750L, InterfaceC0107b interfaceC0107b) {
        if (g3.y.K(interfaceC0750L)) {
            return false;
        }
        C0837M c0837mI = I(interfaceC0750L, interfaceC0107b);
        C0837M c0837mJ = J(interfaceC0750L, interfaceC0107b);
        if (c0837mI == null) {
            return false;
        }
        if (interfaceC0750L.T()) {
            return c0837mJ != null && c0837mJ.i() == c0837mI.i();
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final C0837M I(InterfaceC0750L interfaceC0750L, InterfaceC0107b interfaceC0107b) {
        N3.f fVar;
        C0835K c0835kF = interfaceC0750L.f();
        String strB = null;
        C0835K c0835k = c0835kF != null ? (C0835K) AbstractC0808b.b(c0835kF) : null;
        if (c0835k != null) {
            AbstractC0695h.y(c0835k);
            InterfaceC0759c interfaceC0759cB = U3.f.b(U3.f.k(c0835k), C0936e.f9400g);
            if (interfaceC0759cB != null && (fVar = (N3.f) y3.g.f9407a.get(U3.f.g(interfaceC0759cB))) != null) {
                strB = fVar.b();
            }
        }
        if (strB != null && !AbstractC0808b.g(this.n, c0835k)) {
            return H(interfaceC0750L, strB, interfaceC0107b);
        }
        String strB2 = interfaceC0750L.getName().b();
        AbstractC0219i.d("name.asString()", strB2);
        return H(interfaceC0750L, y3.w.a(strB2), interfaceC0107b);
    }

    public final LinkedHashSet K(N3.f fVar) {
        Collection collectionB = B();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            P2.s.n0(linkedHashSet, ((AbstractC0438v) it.next()).p0().e(fVar, EnumC0915b.f9318h));
        }
        return linkedHashSet;
    }

    public final Set L(N3.f fVar) {
        Collection collectionB = B();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            Collection collectionC = ((AbstractC0438v) it.next()).p0().c(fVar, EnumC0915b.f9318h);
            ArrayList arrayList2 = new ArrayList(P2.o.l0(collectionC));
            Iterator it2 = collectionC.iterator();
            while (it2.hasNext()) {
                arrayList2.add((InterfaceC0750L) it2.next());
            }
            P2.s.n0(arrayList, arrayList2);
        }
        return P2.m.R0(arrayList);
    }

    public final boolean N(C0837M c0837m) {
        Collection collectionI0;
        int i5 = 0;
        N3.f name = c0837m.getName();
        AbstractC0219i.d("function.name", name);
        String strB = name.b();
        AbstractC0219i.d("name.asString()", strB);
        N3.c cVar = y3.w.f9439a;
        if (p4.h.o0(strB, "get") || p4.h.o0(strB, "is")) {
            N3.f fVarD = AbstractC0807a.d(name, "get", null, 12);
            if (fVarD == null) {
                fVarD = AbstractC0807a.d(name, "is", null, 8);
            }
            collectionI0 = P2.n.i0(fVarD);
        } else if (p4.h.o0(strB, "set")) {
            collectionI0 = P2.i.n0(new N3.f[]{AbstractC0807a.d(name, "set", null, 4), AbstractC0807a.d(name, "set", "is", 4)});
        } else {
            collectionI0 = (List) y3.g.f9408b.get(name);
            if (collectionI0 == null) {
                collectionI0 = P2.u.f2163d;
            }
        }
        if (!collectionI0.isEmpty()) {
            Iterator it = collectionI0.iterator();
            while (it.hasNext()) {
                Set<InterfaceC0750L> setL = L((N3.f) it.next());
                if (!setL.isEmpty()) {
                    for (InterfaceC0750L interfaceC0750L : setL) {
                        if (E(interfaceC0750L, new q(c0837m, i5, this))) {
                            if (!interfaceC0750L.T()) {
                                String strB2 = c0837m.getName().b();
                                AbstractC0219i.d("function.name.asString()", strB2);
                                if (!p4.h.o0(strB2, "set")) {
                                }
                            }
                            return false;
                        }
                    }
                }
            }
        }
        ArrayList arrayList = y3.F.f9373a;
        N3.f name2 = c0837m.getName();
        AbstractC0219i.d("name", name2);
        N3.f fVar = (N3.f) y3.F.f9382k.get(name2);
        if (fVar != null) {
            LinkedHashSet linkedHashSetK = K(fVar);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : linkedHashSetK) {
                C0837M c0837m2 = (C0837M) obj;
                AbstractC0219i.e("<this>", c0837m2);
                if (AbstractC0808b.b(c0837m2) != null) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                InterfaceC0775s interfaceC0775sC0 = c0837m.c0();
                interfaceC0775sC0.v(fVar);
                interfaceC0775sC0.O();
                interfaceC0775sC0.k();
                InterfaceC0776t interfaceC0776tI = interfaceC0775sC0.i();
                AbstractC0219i.b(interfaceC0776tI);
                C0837M c0837m3 = (C0837M) interfaceC0776tI;
                if (!arrayList2.isEmpty()) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        if (G((C0837M) it2.next(), c0837m3)) {
                            return false;
                        }
                    }
                }
            }
        }
        int i6 = C0937f.f9406l;
        N3.f name3 = c0837m.getName();
        AbstractC0219i.d("name", name3);
        if (C0937f.b(name3)) {
            N3.f name4 = c0837m.getName();
            AbstractC0219i.d("name", name4);
            LinkedHashSet linkedHashSetK2 = K(name4);
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = linkedHashSetK2.iterator();
            while (it3.hasNext()) {
                InterfaceC0776t interfaceC0776tA = C0937f.a((C0837M) it3.next());
                if (interfaceC0776tA != null) {
                    arrayList3.add(interfaceC0776tA);
                }
            }
            if (!arrayList3.isEmpty()) {
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    if (M(c0837m, (InterfaceC0776t) it4.next())) {
                        return false;
                    }
                }
            }
        }
        C0837M c0837mD = D(c0837m);
        if (c0837mD != null) {
            N3.f name5 = c0837m.getName();
            AbstractC0219i.d("name", name5);
            LinkedHashSet<C0837M> linkedHashSetK3 = K(name5);
            if (!linkedHashSetK3.isEmpty()) {
                for (C0837M c0837m4 : linkedHashSetK3) {
                    if (c0837m4.h() && F(c0837mD, c0837m4)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final void O(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        AbstractC0219i.e("location", enumC0915b);
        AbstractC0219i.e("<this>", ((B3.b) this.f357b.f255e).n);
        AbstractC0219i.e("scopeOwner", this.n);
    }

    @Override // C3.D, X3.o, X3.n
    public final Collection c(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        O(fVar, enumC0915b);
        return super.c(fVar, enumC0915b);
    }

    @Override // C3.D, X3.o, X3.n
    public final Collection e(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        O(fVar, enumC0915b);
        return super.e(fVar, enumC0915b);
    }

    @Override // X3.o, X3.p
    public final InterfaceC0763g g(N3.f fVar, EnumC0915b enumC0915b) {
        d4.j jVar;
        InterfaceC0761e interfaceC0761e;
        AbstractC0219i.e("name", fVar);
        AbstractC0219i.e("location", enumC0915b);
        O(fVar, enumC0915b);
        r rVar = (r) this.f358c;
        return (rVar == null || (jVar = rVar.f437u) == null || (interfaceC0761e = (InterfaceC0761e) jVar.d(fVar)) == null) ? (InterfaceC0763g) this.f437u.d(fVar) : interfaceC0761e;
    }

    @Override // C3.D
    public final Set h(X3.f fVar, X3.k kVar) {
        AbstractC0219i.e("kindFilter", fVar);
        return P2.B.t0((Set) this.f434r.a(), ((Map) this.f436t.a()).keySet());
    }

    @Override // C3.D
    public final Set i(X3.f fVar, X3.k kVar) {
        AbstractC0219i.e("kindFilter", fVar);
        InterfaceC0761e interfaceC0761e = this.n;
        Collection collectionJ = interfaceC0761e.I().j();
        AbstractC0219i.d("ownerDescriptor.typeConstructor.supertypes", collectionJ);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionJ.iterator();
        while (it.hasNext()) {
            P2.s.n0(linkedHashSet, ((AbstractC0438v) it.next()).p0().a());
        }
        d4.i iVar = this.f360e;
        linkedHashSet.addAll(((InterfaceC0011c) iVar.a()).d());
        linkedHashSet.addAll(((InterfaceC0011c) iVar.a()).b());
        linkedHashSet.addAll(h(fVar, kVar));
        B3.g gVar = this.f357b;
        ((V3.a) ((B3.b) gVar.f255e).f244x).getClass();
        AbstractC0219i.e("_context_receiver_0", gVar);
        AbstractC0219i.e("thisDescriptor", interfaceC0761e);
        linkedHashSet.addAll(new ArrayList());
        return linkedHashSet;
    }

    @Override // C3.D
    public final void j(N3.f fVar, ArrayList arrayList) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC0219i.e("name", fVar);
        boolean zE = this.f431o.e();
        InterfaceC0761e interfaceC0761e = this.n;
        B3.g gVar = this.f357b;
        if (zE) {
            d4.i iVar = this.f360e;
            if (((InterfaceC0011c) iVar.a()).a(fVar) != null) {
                if (arrayList.isEmpty()) {
                    C0889A c0889aA = ((InterfaceC0011c) iVar.a()).a(fVar);
                    AbstractC0219i.b(c0889aA);
                    B3.e eVarN = Y0.j.N(gVar, c0889aA);
                    N3.f fVarB = c0889aA.b();
                    B3.b bVar = (B3.b) gVar.f255e;
                    A3.g gVarD1 = A3.g.d1(interfaceC0761e, eVarN, fVarB, bVar.f231j.c(c0889aA), true);
                    D3.a aVarN0 = V1.a.n0(2, false, false, null, 6);
                    AbstractC0438v abstractC0438vR = ((D3.c) gVar.f258i).r(c0889aA.e(), aVarN0);
                    C0867w c0867wP = p();
                    P2.u uVar = P2.u.f2163d;
                    gVarD1.c1(null, c0867wP, uVar, uVar, uVar, abstractC0438vR, 3, AbstractC0771o.f8423e, null);
                    gVarD1.f82G = 1;
                    bVar.f228g.getClass();
                    arrayList.add(gVarD1);
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((C0837M) it.next()).v0().isEmpty()) {
                            break;
                        }
                    }
                    C0889A c0889aA2 = ((InterfaceC0011c) iVar.a()).a(fVar);
                    AbstractC0219i.b(c0889aA2);
                    B3.e eVarN2 = Y0.j.N(gVar, c0889aA2);
                    N3.f fVarB2 = c0889aA2.b();
                    B3.b bVar2 = (B3.b) gVar.f255e;
                    A3.g gVarD12 = A3.g.d1(interfaceC0761e, eVarN2, fVarB2, bVar2.f231j.c(c0889aA2), true);
                    D3.a aVarN02 = V1.a.n0(2, false, false, null, 6);
                    AbstractC0438v abstractC0438vR2 = ((D3.c) gVar.f258i).r(c0889aA2.e(), aVarN02);
                    C0867w c0867wP2 = p();
                    P2.u uVar2 = P2.u.f2163d;
                    gVarD12.c1(null, c0867wP2, uVar2, uVar2, uVar2, abstractC0438vR2, 3, AbstractC0771o.f8423e, null);
                    gVarD12.f82G = 1;
                    bVar2.f228g.getClass();
                    arrayList.add(gVarD12);
                }
            }
        }
        ((V3.a) ((B3.b) gVar.f255e).f244x).getClass();
        AbstractC0219i.e("_context_receiver_0", gVar);
        AbstractC0219i.e("thisDescriptor", interfaceC0761e);
        AbstractC0219i.e("name", fVar);
    }

    @Override // C3.D
    public final InterfaceC0011c k() {
        return new C0009a(this.f431o, l.f417e);
    }

    @Override // C3.D
    public final void m(LinkedHashSet linkedHashSet, N3.f fVar) {
        AbstractC0219i.e("name", fVar);
        LinkedHashSet linkedHashSetK = K(fVar);
        ArrayList arrayList = y3.F.f9373a;
        if (!y3.F.f9381j.contains(fVar)) {
            int i5 = C0937f.f9406l;
            if (!C0937f.b(fVar)) {
                if (!linkedHashSetK.isEmpty()) {
                    Iterator it = linkedHashSetK.iterator();
                    while (it.hasNext()) {
                        if (((InterfaceC0776t) it.next()).h()) {
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : linkedHashSetK) {
                    if (N((C0837M) obj)) {
                        arrayList2.add(obj);
                    }
                }
                y(linkedHashSet, fVar, arrayList2, false);
                return;
            }
        }
        n4.h hVar = new n4.h();
        LinkedHashSet linkedHashSetJ = r2.d.j(fVar, linkedHashSetK, P2.u.f2163d, this.n, a4.l.f3066a, ((B3.b) this.f357b.f255e).f241u.f6756d);
        z(fVar, linkedHashSet, linkedHashSetJ, linkedHashSet, new m(1, this, 0));
        z(fVar, linkedHashSet, linkedHashSetJ, hVar, new m(1, this, 1));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : linkedHashSetK) {
            if (N((C0837M) obj2)) {
                arrayList3.add(obj2);
            }
        }
        y(linkedHashSet, fVar, P2.m.G0(arrayList3, hVar), true);
    }

    /* JADX WARN: Type inference failed for: r8v6, types: [O2.c, java.lang.Object] */
    @Override // C3.D
    public final void n(N3.f fVar, ArrayList arrayList) {
        Set setR0;
        v3.x xVar;
        AbstractC0219i.e("name", fVar);
        boolean zIsAnnotation = this.f431o.f9258a.isAnnotation();
        B3.g gVar = this.f357b;
        if (zIsAnnotation && (xVar = (v3.x) P2.m.K0(((InterfaceC0011c) this.f360e.a()).f(fVar))) != null) {
            A3.h hVarW0 = A3.h.W0(this.n, Y0.j.N(gVar, xVar), AbstractC0809c.j(xVar.d()), false, xVar.b(), ((B3.b) gVar.f255e).f231j.c(xVar), false);
            C0835K c0835kF = Q3.q.f(hVarW0, C0797g.f8481a);
            hVarW0.S0(c0835kF, null, null, null);
            AbstractC0219i.e("<this>", gVar);
            AbstractC0438v abstractC0438vL = D.l(xVar, new B3.g((B3.b) gVar.f255e, new B3.h(gVar, hVarW0, xVar, 0), gVar.f256g));
            P2.u uVar = P2.u.f2163d;
            hVarW0.V0(abstractC0438vL, uVar, p(), null, uVar);
            c0835kF.f8788p = abstractC0438vL;
            arrayList.add(hVarW0);
        }
        Set setL = L(fVar);
        if (setL.isEmpty()) {
            return;
        }
        n4.h hVar = new n4.h();
        n4.h hVar2 = new n4.h();
        A(setL, arrayList, hVar, new n(this, 0));
        if (hVar.isEmpty()) {
            setR0 = P2.m.R0(setL);
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj : setL) {
                if (!hVar.contains(obj)) {
                    linkedHashSet.add(obj);
                }
            }
            setR0 = linkedHashSet;
        }
        A(setR0, hVar2, null, new n(this, 1));
        LinkedHashSet linkedHashSetT0 = P2.B.t0(setL, hVar2);
        B3.b bVar = (B3.b) gVar.f255e;
        arrayList.addAll(r2.d.j(fVar, linkedHashSetT0, arrayList, this.n, bVar.f, bVar.f241u.f6756d));
    }

    @Override // C3.D
    public final Set o(X3.f fVar) {
        AbstractC0219i.e("kindFilter", fVar);
        if (this.f431o.f9258a.isAnnotation()) {
            return a();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((InterfaceC0011c) this.f360e.a()).c());
        Collection collectionJ = this.n.I().j();
        AbstractC0219i.d("ownerDescriptor.typeConstructor.supertypes", collectionJ);
        Iterator it = collectionJ.iterator();
        while (it.hasNext()) {
            P2.s.n0(linkedHashSet, ((AbstractC0438v) it.next()).p0().b());
        }
        return linkedHashSet;
    }

    @Override // C3.D
    public final C0867w p() {
        InterfaceC0761e interfaceC0761e = this.n;
        if (interfaceC0761e != null) {
            int i5 = Q3.f.f2341a;
            return interfaceC0761e.G0();
        }
        Q3.f.a(0);
        throw null;
    }

    @Override // C3.D
    public final InterfaceC0766j q() {
        return this.n;
    }

    @Override // C3.D
    public final boolean r(A3.g gVar) {
        if (this.f431o.f9258a.isAnnotation()) {
            return false;
        }
        return N(gVar);
    }

    @Override // C3.D
    public final z s(v3.x xVar, ArrayList arrayList, AbstractC0438v abstractC0438v, List list) {
        AbstractC0219i.e("method", xVar);
        ((B3.b) this.f357b.f255e).f227e.getClass();
        if (this.n != null) {
            List listEmptyList = Collections.emptyList();
            if (listEmptyList != null) {
                return new z(abstractC0438v, list, arrayList, listEmptyList);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "signatureErrors", "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature", "<init>"));
        }
        Object[] objArr = new Object[3];
        switch (1) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "returnType";
                break;
            case 3:
                objArr[0] = "valueParameters";
                break;
            case 4:
                objArr[0] = "typeParameters";
                break;
            case 5:
                objArr[0] = "descriptor";
                break;
            case 6:
                objArr[0] = "signatureErrors";
                break;
            default:
                objArr[0] = "method";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
        objArr[2] = "resolvePropagatedSignature";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // C3.D
    public final String toString() {
        return "Lazy Java member scope for " + this.f431o.b();
    }

    public final void x(ArrayList arrayList, A3.b bVar, int i5, v3.x xVar, AbstractC0438v abstractC0438v, AbstractC0438v abstractC0438v2) {
        E3.a tVar;
        r rVar;
        Z zG;
        C0796f c0796f = C0797g.f8481a;
        N3.f fVarB = xVar.b();
        if (abstractC0438v == null) {
            X.a(2);
            throw null;
        }
        Z zG2 = X.g(abstractC0438v, false);
        Object defaultValue = xVar.f9266a.getDefaultValue();
        if (defaultValue != null) {
            Class<?> cls = defaultValue.getClass();
            List list = AbstractC0897d.f9243a;
            tVar = Enum.class.isAssignableFrom(cls) ? new v3.t(null, (Enum) defaultValue) : defaultValue instanceof Annotation ? new v3.g(null, (Annotation) defaultValue) : defaultValue instanceof Object[] ? new v3.h(null, (Object[]) defaultValue) : defaultValue instanceof Class ? new v3.p(null, (Class) defaultValue) : new v3.v(null, defaultValue);
        } else {
            tVar = null;
        }
        boolean z4 = tVar != null;
        if (abstractC0438v2 != null) {
            zG = X.g(abstractC0438v2, false);
            rVar = this;
        } else {
            rVar = this;
            zG = null;
        }
        arrayList.add(new C0843T(bVar, null, i5, c0796f, fVarB, zG2, z4, false, false, zG, ((B3.b) rVar.f357b.f255e).f231j.c(xVar)));
    }

    public final void y(LinkedHashSet linkedHashSet, N3.f fVar, ArrayList arrayList, boolean z4) {
        B3.b bVar = (B3.b) this.f357b.f255e;
        LinkedHashSet<C0837M> linkedHashSetJ = r2.d.j(fVar, arrayList, linkedHashSet, this.n, bVar.f, bVar.f241u.f6756d);
        if (!z4) {
            linkedHashSet.addAll(linkedHashSetJ);
            return;
        }
        ArrayList arrayListG0 = P2.m.G0(linkedHashSet, linkedHashSetJ);
        ArrayList arrayList2 = new ArrayList(P2.o.l0(linkedHashSetJ));
        for (C0837M c0837mC : linkedHashSetJ) {
            C0837M c0837m = (C0837M) AbstractC0808b.c(c0837mC);
            if (c0837m != null) {
                c0837mC = C(c0837mC, c0837m, arrayListG0);
            }
            arrayList2.add(c0837mC);
        }
        linkedHashSet.addAll(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(N3.f r9, java.util.LinkedHashSet r10, java.util.LinkedHashSet r11, java.util.AbstractSet r12, a3.InterfaceC0107b r13) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C3.r.z(N3.f, java.util.LinkedHashSet, java.util.LinkedHashSet, java.util.AbstractSet, a3.b):void");
    }
}
