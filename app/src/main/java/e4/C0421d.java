package e4;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import com.google.firebase.messaging.C0388e;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import k.Q0;
import p3.InterfaceC0755Q;
import p3.InterfaceC0761e;
import p3.InterfaceC0763g;
import q3.InterfaceC0791a;
import q3.InterfaceC0792b;
import q3.InterfaceC0798h;
import s3.C0841Q;
import s3.C0849e;

/* renamed from: e4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0421d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0421d f6675a = new C0421d();

    public static final boolean b(f4.b bVar, h4.d dVar) {
        if (!bVar.x0(dVar)) {
            if (dVar instanceof h4.b) {
                N nV = bVar.v(bVar.M((h4.b) dVar));
                if (bVar.W(nV) || !bVar.x0(bVar.b0(bVar.l0(nV)))) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean c(f4.b bVar, I i5, h4.d dVar, h4.d dVar2, boolean z4) {
        Set<h4.c> setG = bVar.G(dVar);
        if (setG != null && setG.isEmpty()) {
            return false;
        }
        for (h4.c cVar : setG) {
            if (AbstractC0219i.a(bVar.E(cVar), bVar.d0(dVar2)) || (z4 && n(f6675a, i5, dVar2, cVar))) {
                return true;
            }
        }
        return false;
    }

    public static List d(I i5, h4.d dVar, h4.f fVar) {
        AbstractC0420c abstractC0420cY;
        f4.b bVar = i5.f6653c;
        bVar.a(dVar, fVar);
        boolean zN = bVar.n(fVar);
        P2.u uVar = P2.u.f2163d;
        if (!zN && bVar.f0(dVar)) {
            return uVar;
        }
        if (bVar.e0(fVar)) {
            if (!bVar.H(bVar.d0(dVar), fVar)) {
                return uVar;
            }
            AbstractC0442z abstractC0442zC = bVar.C(dVar);
            if (abstractC0442zC != null) {
                dVar = abstractC0442zC;
            }
            return g3.y.N(dVar);
        }
        n4.f fVar2 = new n4.f();
        i5.b();
        ArrayDeque arrayDeque = i5.f6656g;
        AbstractC0219i.b(arrayDeque);
        n4.h hVar = i5.f6657h;
        AbstractC0219i.b(hVar);
        arrayDeque.push(dVar);
        while (!arrayDeque.isEmpty()) {
            if (hVar.f8197e > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + dVar + ". Supertypes = " + P2.m.A0(hVar, null, null, null, null, 63)).toString());
            }
            h4.d dVar2 = (h4.d) arrayDeque.pop();
            AbstractC0219i.d("current", dVar2);
            if (hVar.add(dVar2)) {
                AbstractC0442z abstractC0442zC2 = bVar.C(dVar2);
                if (abstractC0442zC2 == null) {
                    abstractC0442zC2 = dVar2;
                }
                boolean zH = bVar.H(bVar.d0(abstractC0442zC2), fVar);
                H h3 = H.f6648c;
                if (zH) {
                    fVar2.add(abstractC0442zC2);
                    abstractC0420cY = h3;
                } else {
                    abstractC0420cY = bVar.p(abstractC0442zC2) == 0 ? H.f6647b : bVar.y(abstractC0442zC2);
                }
                if (abstractC0420cY.equals(h3)) {
                    abstractC0420cY = null;
                }
                if (abstractC0420cY != null) {
                    Iterator it = bVar.j0(bVar.d0(dVar2)).iterator();
                    while (it.hasNext()) {
                        arrayDeque.add(abstractC0420cY.x(i5, (h4.c) it.next()));
                    }
                }
            }
        }
        i5.a();
        return fVar2;
    }

    public static List e(I i5, h4.d dVar, h4.f fVar) {
        int i6;
        List listD = d(i5, dVar, fVar);
        if (listD.size() < 2) {
            return listD;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            f4.b bVar = i5.f6653c;
            h4.e eVarO = bVar.O((h4.d) obj);
            int iO = bVar.o(eVarO);
            while (true) {
                if (i6 >= iO) {
                    arrayList.add(obj);
                    break;
                }
                i6 = bVar.B0(bVar.l0(bVar.X(eVarO, i6))) == null ? i6 + 1 : 0;
            }
        }
        return !arrayList.isEmpty() ? arrayList : listD;
    }

    public static boolean g(I i5, h4.c cVar, h4.c cVar2) {
        AbstractC0219i.e("a", cVar);
        AbstractC0219i.e("b", cVar2);
        if (cVar == cVar2) {
            return true;
        }
        C0421d c0421d = f6675a;
        f4.b bVar = i5.f6653c;
        if (l(bVar, cVar) && l(bVar, cVar2)) {
            Z zC = i5.c(i5.d(cVar));
            Z zC2 = i5.c(i5.d(cVar2));
            AbstractC0442z abstractC0442zZ = bVar.z(zC);
            if (!bVar.H(bVar.E(zC), bVar.E(zC2))) {
                return false;
            }
            if (bVar.p(abstractC0442zZ) == 0) {
                return bVar.b(zC) || bVar.b(zC2) || bVar.r0(abstractC0442zZ) == bVar.r0(bVar.z(zC2));
            }
        }
        return n(c0421d, i5, cVar, cVar2) && n(c0421d, i5, cVar2, cVar);
    }

    public static final Z j(AbstractC0442z abstractC0442z, AbstractC0442z abstractC0442z2) {
        AbstractC0219i.e("lowerBound", abstractC0442z);
        AbstractC0219i.e("upperBound", abstractC0442z2);
        return abstractC0442z.equals(abstractC0442z2) ? abstractC0442z : new r(abstractC0442z, abstractC0442z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
    
        return r6.z0(r6.E(r7), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p3.InterfaceC0755Q k(f4.b r6, h4.c r7, h4.d r8) {
        /*
            int r0 = r6.p(r7)
            r1 = 0
            r2 = r1
        L6:
            r3 = 0
            if (r2 >= r0) goto L66
            e4.N r4 = r6.u(r7, r2)
            boolean r5 = r6.W(r4)
            if (r5 != 0) goto L14
            r3 = r4
        L14:
            if (r3 == 0) goto L63
            e4.Z r3 = r6.l0(r3)
            if (r3 != 0) goto L1d
            goto L63
        L1d:
            e4.z r4 = r6.z(r3)
            h4.d r4 = r6.D(r4)
            boolean r4 = r6.x(r4)
            if (r4 == 0) goto L3b
            e4.z r4 = r6.z(r8)
            h4.d r4 = r6.D(r4)
            boolean r4 = r6.x(r4)
            if (r4 == 0) goto L3b
            r4 = 1
            goto L3c
        L3b:
            r4 = r1
        L3c:
            boolean r5 = r3.equals(r8)
            if (r5 != 0) goto L5a
            if (r4 == 0) goto L53
            e4.J r4 = r6.E(r3)
            e4.J r5 = r6.E(r8)
            boolean r4 = b3.AbstractC0219i.a(r4, r5)
            if (r4 == 0) goto L53
            goto L5a
        L53:
            p3.Q r3 = k(r6, r3, r8)
            if (r3 == 0) goto L63
            return r3
        L5a:
            e4.J r7 = r6.E(r7)
            p3.Q r6 = r6.z0(r7, r2)
            return r6
        L63:
            int r2 = r2 + 1
            goto L6
        L66:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.C0421d.k(f4.b, h4.c, h4.d):p3.Q");
    }

    public static boolean l(f4.b bVar, h4.c cVar) {
        if (bVar.I(bVar.E(cVar))) {
            bVar.Q(cVar);
            if (!bVar.m(cVar) && !bVar.o0(cVar) && AbstractC0219i.a(bVar.d0(bVar.z(cVar)), bVar.d0(bVar.b0(cVar)))) {
                return true;
            }
        }
        return false;
    }

    public static boolean m(I i5, h4.e eVar, h4.d dVar) {
        boolean zN;
        AbstractC0219i.e("capturedSubArguments", eVar);
        f4.b bVar = i5.f6653c;
        J jD0 = bVar.d0(dVar);
        int iO = bVar.o(eVar);
        int iA = bVar.A(jD0);
        if (iO != iA || iO != bVar.p(dVar)) {
            return false;
        }
        for (int i6 = 0; i6 < iA; i6++) {
            N nU = bVar.u(dVar, i6);
            if (!bVar.W(nU)) {
                Z zL0 = bVar.l0(nU);
                N nX = bVar.X(eVar, i6);
                bVar.v0(nX);
                Z zL02 = bVar.l0(nX);
                int iQ = bVar.q(bVar.z0(jD0, i6));
                int iV0 = bVar.v0(nU);
                A3.f.q(iQ, "declared");
                A3.f.q(iV0, "useSite");
                if (iQ == 3) {
                    iQ = iV0;
                } else if (iV0 != 3 && iQ != iV0) {
                    iQ = 0;
                }
                if (iQ == 0) {
                    return i5.f6651a;
                }
                C0421d c0421d = f6675a;
                if (iQ == 3) {
                    o(bVar, zL02, zL0);
                    o(bVar, zL0, zL02);
                }
                int i7 = i5.f;
                if (i7 > 100) {
                    throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + zL02).toString());
                }
                i5.f = i7 + 1;
                int iC = Q0.c(iQ);
                if (iC == 0) {
                    zN = n(c0421d, i5, zL0, zL02);
                } else if (iC == 1) {
                    zN = n(c0421d, i5, zL02, zL0);
                } else {
                    if (iC != 2) {
                        throw new O2.d();
                    }
                    zN = g(i5, zL02, zL0);
                }
                i5.f--;
                if (!zN) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean n(e4.C0421d r25, e4.I r26, h4.c r27, h4.c r28) {
        /*
            Method dump skipped, instructions count: 1410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.C0421d.n(e4.d, e4.I, h4.c, h4.c):boolean");
    }

    public static void o(f4.b bVar, h4.c cVar, h4.c cVar2) {
        InterfaceC0791a interfaceC0791aA0 = bVar.A0(cVar);
        if (interfaceC0791aA0 instanceof h4.b) {
            h4.b bVar2 = (h4.b) interfaceC0791aA0;
            if (!bVar.l(bVar2) && bVar.W(bVar.v(bVar.M(bVar2))) && bVar.t(bVar2) == 1) {
                bVar.E(cVar2);
            }
        }
    }

    public static C0430m p(Z z4, boolean z5) {
        boolean zE;
        AbstractC0219i.e("type", z4);
        if (z4 instanceof C0430m) {
            return (C0430m) z4;
        }
        z4.I0();
        if ((z4.I0().i() instanceof InterfaceC0755Q) || (z4 instanceof f4.h)) {
            InterfaceC0763g interfaceC0763gI = z4.I0().i();
            C0841Q c0841q = interfaceC0763gI instanceof C0841Q ? (C0841Q) interfaceC0763gI : null;
            zE = true;
            if (c0841q == null || c0841q.f8798o) {
                zE = (z5 && (z4.I0().i() instanceof InterfaceC0755Q)) ? X.e(z4) : true ^ AbstractC0420c.f(f4.g.l(false, true, f4.e.f6739e, null, null, 24), AbstractC0420c.k(z4), H.f6647b);
            }
        } else {
            zE = false;
        }
        if (!zE) {
            return null;
        }
        if (z4 instanceof AbstractC0434q) {
            AbstractC0434q abstractC0434q = (AbstractC0434q) z4;
            AbstractC0219i.a(abstractC0434q.f6693e.I0(), abstractC0434q.f.I0());
        }
        return new C0430m(AbstractC0420c.k(z4).M0(false), z5);
    }

    public static final AbstractC0442z q(G g5, InterfaceC0761e interfaceC0761e, List list) {
        AbstractC0219i.e("attributes", g5);
        AbstractC0219i.e("descriptor", interfaceC0761e);
        AbstractC0219i.e("arguments", list);
        J jI = interfaceC0761e.I();
        AbstractC0219i.d("descriptor.typeConstructor", jI);
        return r(g5, jI, list, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0074 A[PHI: r1
  0x0074: PHI (r1v11 X3.n) = (r1v10 X3.n), (r1v13 X3.n) binds: [B:31:0x0098, B:22:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static e4.AbstractC0442z r(e4.G r7, e4.J r8, java.util.List r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.C0421d.r(e4.G, e4.J, java.util.List, boolean):e4.z");
    }

    public static final AbstractC0442z s(X3.n nVar, G g5, J j5, List list, boolean z4) {
        AbstractC0219i.e("attributes", g5);
        AbstractC0219i.e("constructor", j5);
        AbstractC0219i.e("arguments", list);
        AbstractC0219i.e("memberScope", nVar);
        A a5 = new A(j5, list, z4, nVar, new C0439w(nVar, g5, j5, list, z4));
        return g5.isEmpty() ? a5 : new B(a5, g5);
    }

    public static final AbstractC0442z t(G g5, J j5, List list, boolean z4, X3.n nVar, InterfaceC0107b interfaceC0107b) {
        AbstractC0219i.e("attributes", g5);
        AbstractC0219i.e("constructor", j5);
        AbstractC0219i.e("arguments", list);
        AbstractC0219i.e("memberScope", nVar);
        A a5 = new A(j5, list, z4, nVar, interfaceC0107b);
        return g5.isEmpty() ? a5 : new B(a5, g5);
    }

    public void a(InterfaceC0798h interfaceC0798h, InterfaceC0798h interfaceC0798h2) {
        HashSet hashSet = new HashSet();
        Iterator it = interfaceC0798h.iterator();
        while (it.hasNext()) {
            hashSet.add(((InterfaceC0792b) it.next()).a());
        }
        Iterator it2 = interfaceC0798h2.iterator();
        while (it2.hasNext()) {
            hashSet.contains(((InterfaceC0792b) it2.next()).a());
        }
    }

    public S f(J j5, List list) {
        AbstractC0219i.e("typeConstructor", j5);
        AbstractC0219i.e("arguments", list);
        List listK = j5.k();
        AbstractC0219i.d("typeConstructor.parameters", listK);
        InterfaceC0755Q interfaceC0755Q = (InterfaceC0755Q) P2.m.D0(listK);
        if (interfaceC0755Q == null || !interfaceC0755Q.k0()) {
            return new C0436t((InterfaceC0755Q[]) listK.toArray(new InterfaceC0755Q[0]), (N[]) list.toArray(new N[0]), false);
        }
        List listK2 = j5.k();
        AbstractC0219i.d("typeConstructor.parameters", listK2);
        ArrayList arrayList = new ArrayList(P2.o.l0(listK2));
        Iterator it = listK2.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC0755Q) it.next()).I());
        }
        return new K(P2.z.k0(P2.m.T0(arrayList, list)), false);
    }

    public AbstractC0442z h(com.google.firebase.messaging.q qVar, G g5, boolean z4, int i5, boolean z5) {
        G gL;
        c4.s sVar = (c4.s) qVar.f;
        N nI = i(new O(1, sVar.Q0()), qVar, null, i5);
        AbstractC0438v abstractC0438vB = nI.b();
        AbstractC0219i.d("expandedProjection.type", abstractC0438vB);
        AbstractC0442z abstractC0442zB = AbstractC0420c.b(abstractC0438vB);
        if (AbstractC0420c.i(abstractC0442zB)) {
            return abstractC0442zB;
        }
        nI.a();
        a(abstractC0442zB.s(), AbstractC0426i.a(g5));
        if (!AbstractC0420c.i(abstractC0442zB)) {
            if (AbstractC0420c.i(abstractC0442zB)) {
                gL = abstractC0442zB.H0();
            } else {
                G gH0 = abstractC0442zB.H0();
                AbstractC0219i.e("other", gH0);
                if (g5.isEmpty() && gH0.isEmpty()) {
                    gL = g5;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Collection collectionValues = ((ConcurrentHashMap) G.f6646e.f6142e).values();
                    AbstractC0219i.d("idPerType.values", collectionValues);
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        C0425h c0425h = (C0425h) g5.f7942d.get(iIntValue);
                        C0425h c0425h2 = (C0425h) gH0.f7942d.get(iIntValue);
                        if (c0425h != null) {
                            if (c0425h2 != null) {
                                c0425h = new C0425h(Y0.j.h(c0425h.f6682a, c0425h2.f6682a));
                            }
                            c0425h2 = c0425h;
                        } else if (c0425h2 == null) {
                            c0425h2 = null;
                        } else if (c0425h != null) {
                            c0425h2 = new C0425h(Y0.j.h(c0425h2.f6682a, c0425h.f6682a));
                        }
                        n4.k.a(arrayList, c0425h2);
                    }
                    gL = C0388e.l(arrayList);
                }
            }
            abstractC0442zB = AbstractC0420c.p(abstractC0442zB, null, gL, 1);
        }
        AbstractC0442z abstractC0442zI = X.i(abstractC0442zB, z4);
        if (!z5) {
            return abstractC0442zI;
        }
        C0849e c0849e = sVar.f5208j;
        AbstractC0219i.d("descriptor.typeConstructor", c0849e);
        return AbstractC0420c.z(abstractC0442zI, s(X3.m.f2791b, g5, c0849e, (List) qVar.f6169g, z4));
    }

    public N i(N n, com.google.firebase.messaging.q qVar, InterfaceC0755Q interfaceC0755Q, int i5) {
        int iB;
        N o5;
        c4.s sVar = (c4.s) qVar.f;
        if (i5 > 100) {
            throw new AssertionError("Too deep recursion while expanding type alias " + sVar.getName());
        }
        if (n.c()) {
            AbstractC0219i.b(interfaceC0755Q);
            return X.j(interfaceC0755Q);
        }
        AbstractC0438v abstractC0438vB = n.b();
        AbstractC0219i.d("underlyingProjection.type", abstractC0438vB);
        J jI0 = abstractC0438vB.I0();
        AbstractC0219i.e("constructor", jI0);
        InterfaceC0763g interfaceC0763gI = jI0.i();
        N n2 = interfaceC0763gI instanceof InterfaceC0755Q ? (N) ((Map) qVar.f6170h).get(interfaceC0763gI) : null;
        if (n2 != null) {
            if (n2.c()) {
                AbstractC0219i.b(interfaceC0755Q);
                return X.j(interfaceC0755Q);
            }
            Z zL0 = n2.b().L0();
            int iA = n2.a();
            A3.f.u(iA, "argument.projectionKind");
            int iA2 = n.a();
            A3.f.u(iA2, "underlyingProjection.projectionKind");
            if (iA2 != iA && iA2 != 1) {
                if (iA == 1) {
                    iA = iA2;
                } else {
                    AbstractC0219i.e("typeAlias", sVar);
                }
            }
            if (interfaceC0755Q == null || (iB = interfaceC0755Q.B()) == 0) {
                iB = 1;
            }
            if (iB != iA && iB != 1) {
                if (iA == 1) {
                    iA = 1;
                } else {
                    AbstractC0219i.e("typeAlias", sVar);
                }
            }
            a(abstractC0438vB.s(), zL0.s());
            AbstractC0442z abstractC0442zI = X.i(AbstractC0420c.b(zL0), abstractC0438vB.J0());
            G gH0 = abstractC0438vB.H0();
            if (!AbstractC0420c.i(abstractC0442zI)) {
                if (AbstractC0420c.i(abstractC0442zI)) {
                    gH0 = abstractC0442zI.H0();
                } else {
                    G gH02 = abstractC0442zI.H0();
                    gH0.getClass();
                    AbstractC0219i.e("other", gH02);
                    if (!gH0.isEmpty() || !gH02.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        Collection collectionValues = ((ConcurrentHashMap) G.f6646e.f6142e).values();
                        AbstractC0219i.d("idPerType.values", collectionValues);
                        Iterator it = collectionValues.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Number) it.next()).intValue();
                            C0425h c0425h = (C0425h) gH0.f7942d.get(iIntValue);
                            C0425h c0425h2 = (C0425h) gH02.f7942d.get(iIntValue);
                            if (c0425h != null) {
                                if (c0425h2 != null) {
                                    c0425h = new C0425h(Y0.j.h(c0425h.f6682a, c0425h2.f6682a));
                                }
                                c0425h2 = c0425h;
                            } else if (c0425h2 == null) {
                                c0425h2 = null;
                            } else if (c0425h != null) {
                                c0425h2 = new C0425h(Y0.j.h(c0425h2.f6682a, c0425h.f6682a));
                            }
                            n4.k.a(arrayList, c0425h2);
                        }
                        gH0 = C0388e.l(arrayList);
                    }
                }
                abstractC0442zI = AbstractC0420c.p(abstractC0442zI, null, gH0, 1);
            }
            return new O(iA, abstractC0442zI);
        }
        AbstractC0442z abstractC0442zB = AbstractC0420c.b(n.b().L0());
        if (AbstractC0420c.i(abstractC0442zB) || !X.c(abstractC0442zB, i4.a.f, null)) {
            return n;
        }
        J jI02 = abstractC0442zB.I0();
        InterfaceC0763g interfaceC0763gI2 = jI02.i();
        jI02.k().size();
        abstractC0442zB.s0().size();
        if (interfaceC0763gI2 instanceof InterfaceC0755Q) {
            o5 = n;
        } else {
            int i6 = 0;
            if (interfaceC0763gI2 instanceof c4.s) {
                c4.s sVar2 = (c4.s) interfaceC0763gI2;
                if (qVar.y(sVar2)) {
                    g4.i iVar = g4.i.f6818i;
                    String str = sVar2.getName().f1842d;
                    AbstractC0219i.d("typeDescriptor.name.toString()", str);
                    return new O(1, g4.j.c(iVar, str));
                }
                List listS0 = abstractC0442zB.s0();
                ArrayList arrayList2 = new ArrayList(P2.o.l0(listS0));
                for (Object obj : listS0) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        P2.n.k0();
                        throw null;
                    }
                    arrayList2.add(i((N) obj, qVar, (InterfaceC0755Q) jI02.k().get(i6), i5 + 1));
                    i6 = i7;
                }
                List listK = sVar2.f5208j.k();
                ArrayList arrayList3 = new ArrayList(P2.o.l0(listK));
                Iterator it2 = listK.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((InterfaceC0755Q) it2.next()).a());
                }
                o5 = new O(n.a(), AbstractC0420c.z(h(new com.google.firebase.messaging.q(qVar, sVar2, arrayList2, P2.z.k0(P2.m.T0(arrayList3, arrayList2)), 15), abstractC0442zB.H0(), abstractC0442zB.J0(), i5 + 1, false), u(abstractC0442zB, qVar, i5)));
            } else {
                AbstractC0442z abstractC0442zU = u(abstractC0442zB, qVar, i5);
                V.d(abstractC0442zU);
                for (Object obj2 : abstractC0442zU.s0()) {
                    int i8 = i6 + 1;
                    if (i6 < 0) {
                        P2.n.k0();
                        throw null;
                    }
                    N n5 = (N) obj2;
                    if (!n5.c()) {
                        AbstractC0438v abstractC0438vB2 = n5.b();
                        AbstractC0219i.d("substitutedArgument.type", abstractC0438vB2);
                        if (!X.c(abstractC0438vB2, i4.a.f6921e, null)) {
                        }
                    }
                    i6 = i8;
                }
                o5 = new O(n.a(), abstractC0442zU);
            }
        }
        return o5;
    }

    public AbstractC0442z u(AbstractC0442z abstractC0442z, com.google.firebase.messaging.q qVar, int i5) {
        J jI0 = abstractC0442z.I0();
        List listS0 = abstractC0442z.s0();
        ArrayList arrayList = new ArrayList(P2.o.l0(listS0));
        int i6 = 0;
        for (Object obj : listS0) {
            int i7 = i6 + 1;
            if (i6 < 0) {
                P2.n.k0();
                throw null;
            }
            N n = (N) obj;
            N nI = i(n, qVar, (InterfaceC0755Q) jI0.k().get(i6), i5 + 1);
            if (!nI.c()) {
                nI = new O(nI.a(), X.h(nI.b(), n.b().J0()));
            }
            arrayList.add(nI);
            i6 = i7;
        }
        return AbstractC0420c.p(abstractC0442z, arrayList, null, 2);
    }
}
