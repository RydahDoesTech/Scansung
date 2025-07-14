package e4;

import b3.AbstractC0219i;
import e1.AbstractC0415a;
import java.util.ArrayList;
import java.util.List;
import k.Q0;
import m3.AbstractC0695h;
import p3.InterfaceC0755Q;
import q3.C0799i;
import q3.C0802l;
import q3.InterfaceC0791a;
import q3.InterfaceC0798h;

/* loaded from: classes.dex */
public final class V {

    /* renamed from: b, reason: collision with root package name */
    public static final V f6667b = new V(S.f6666a);

    /* renamed from: a, reason: collision with root package name */
    public final S f6668a;

    public V(S s2) {
        this.f6668a = s2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.V.a(int):void");
    }

    public static int b(int i5, int i6) {
        if (i5 == 0) {
            a(38);
            throw null;
        }
        if (i6 == 0) {
            a(39);
            throw null;
        }
        if (i5 == 1) {
            if (i6 != 0) {
                return i6;
            }
            a(40);
            throw null;
        }
        if (i6 == 1) {
            if (i5 != 0) {
                return i5;
            }
            a(41);
            throw null;
        }
        if (i5 == i6) {
            if (i6 != 0) {
                return i6;
            }
            a(42);
            throw null;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + A3.f.v(i5) + "' and projection kind '" + A3.f.v(i6) + "' cannot be combined");
    }

    public static int c(int i5, int i6) {
        if (i5 == 2 && i6 == 3) {
            return 3;
        }
        return (i5 == 3 && i6 == 2) ? 2 : 1;
    }

    public static V d(AbstractC0438v abstractC0438v) {
        if (abstractC0438v == null) {
            a(6);
            throw null;
        }
        return new V(L.f6660b.f(abstractC0438v.I0(), abstractC0438v.s0()));
    }

    public static V e(S s2, S s4) {
        if (s2 == null) {
            a(3);
            throw null;
        }
        if (s4 == null) {
            a(4);
            throw null;
        }
        if (s2.e()) {
            s2 = s4;
        } else if (!s4.e()) {
            s2 = new C0433p(s2, s4);
        }
        return new V(s2);
    }

    public static String h(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (n4.k.h(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + "]";
        }
    }

    public final S f() {
        S s2 = this.f6668a;
        if (s2 != null) {
            return s2;
        }
        a(8);
        throw null;
    }

    public final AbstractC0438v g(int i5, AbstractC0438v abstractC0438v) {
        if (abstractC0438v == null) {
            a(9);
            throw null;
        }
        if (i5 == 0) {
            a(10);
            throw null;
        }
        if (this.f6668a.e()) {
            return abstractC0438v;
        }
        try {
            AbstractC0438v abstractC0438vB = j(new O(i5, abstractC0438v), null, 0).b();
            if (abstractC0438vB != null) {
                return abstractC0438vB;
            }
            a(12);
            throw null;
        } catch (U e5) {
            return g4.j.c(g4.i.n, e5.getMessage());
        }
    }

    public final AbstractC0438v i(int i5, AbstractC0438v abstractC0438v) {
        if (abstractC0438v == null) {
            a(14);
            throw null;
        }
        if (i5 == 0) {
            a(15);
            throw null;
        }
        N o5 = new O(i5, f().f(i5, abstractC0438v));
        S s2 = this.f6668a;
        if (!s2.e()) {
            try {
                o5 = j(o5, null, 0);
            } catch (U unused) {
                o5 = null;
            }
        }
        if (s2.a() || s2.b()) {
            boolean zB = s2.b();
            if (o5 == null) {
                o5 = null;
            } else if (!o5.c()) {
                AbstractC0438v abstractC0438vB = o5.b();
                AbstractC0219i.d("typeProjection.type", abstractC0438vB);
                if (X.c(abstractC0438vB, j4.b.f7463d, null)) {
                    int iA = o5.a();
                    A3.f.u(iA, "typeProjection.projectionKind");
                    if (iA == 3) {
                        o5 = new O(iA, (AbstractC0438v) AbstractC0415a.d(abstractC0438vB).f7462b);
                    } else if (zB) {
                        o5 = new O(iA, (AbstractC0438v) AbstractC0415a.d(abstractC0438vB).f7461a);
                    } else {
                        j4.c cVar = new j4.c();
                        V v2 = new V(cVar);
                        if (!cVar.e()) {
                            try {
                                o5 = v2.j(o5, null, 0);
                            } catch (U unused2) {
                            }
                        }
                    }
                }
            }
        }
        if (o5 == null) {
            return null;
        }
        return o5.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final N j(N n, InterfaceC0755Q interfaceC0755Q, int i5) throws U {
        char c2;
        boolean z4;
        V v2;
        AbstractC0438v abstractC0438vI = null;
        if (n == null) {
            a(18);
            throw null;
        }
        S s2 = this.f6668a;
        if (i5 > 100) {
            throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + h(n) + "; substitution: " + h(s2));
        }
        if (n.c()) {
            return n;
        }
        AbstractC0438v abstractC0438vB = n.b();
        if (abstractC0438vB instanceof Y) {
            Y y4 = (Y) abstractC0438vB;
            Z zX = y4.x();
            AbstractC0438v abstractC0438vG = y4.G();
            N nJ = j(new O(n.a(), zX), interfaceC0755Q, i5 + 1);
            if (nJ.c()) {
                return nJ;
            }
            return new O(nJ.a(), AbstractC0420c.A(nJ.b().L0(), i(n.a(), abstractC0438vG)));
        }
        AbstractC0219i.e("<this>", abstractC0438vB);
        abstractC0438vB.L0();
        if (abstractC0438vB.L0() instanceof D3.g) {
            return n;
        }
        N nD = s2.d(abstractC0438vB);
        if (nD == null) {
            nD = null;
        } else if (abstractC0438vB.s().e(m3.m.f8140y)) {
            J jI0 = nD.b().I0();
            if (jI0 instanceof f4.i) {
                N n2 = ((f4.i) jI0).f6747a;
                int iA = n2.a();
                if (c(n.a(), iA) == 3) {
                    nD = new O(n2.b());
                } else if (interfaceC0755Q != null && c(interfaceC0755Q.B(), iA) == 3) {
                    nD = new O(n2.b());
                }
            }
        }
        int iA2 = n.a();
        if (nD == null && AbstractC0420c.j(abstractC0438vB)) {
            InterfaceC0791a interfaceC0791aL0 = abstractC0438vB.L0();
            InterfaceC0428k interfaceC0428k = interfaceC0791aL0 instanceof InterfaceC0428k ? (InterfaceC0428k) interfaceC0791aL0 : null;
            if (!(interfaceC0428k != null ? interfaceC0428k.m() : false)) {
                AbstractC0434q abstractC0434q = (AbstractC0434q) abstractC0438vB.L0();
                AbstractC0442z abstractC0442z = abstractC0434q.f6693e;
                int i6 = i5 + 1;
                N nJ2 = j(new O(iA2, abstractC0442z), interfaceC0755Q, i6);
                AbstractC0442z abstractC0442z2 = abstractC0434q.f;
                N nJ3 = j(new O(iA2, abstractC0442z2), interfaceC0755Q, i6);
                return (nJ2.b() == abstractC0442z && nJ3.b() == abstractC0442z2) ? n : new O(nJ2.a(), C0421d.j(AbstractC0420c.b(nJ2.b()), AbstractC0420c.b(nJ3.b())));
            }
        }
        if (AbstractC0695h.D(abstractC0438vB) || AbstractC0420c.i(abstractC0438vB)) {
            return n;
        }
        if (nD != null) {
            int iC = c(iA2, nD.a());
            if (!(abstractC0438vB.I0() instanceof R3.b)) {
                int iC2 = Q0.c(iC);
                if (iC2 == 1) {
                    return new O(3, abstractC0438vB.I0().g().n());
                }
                if (iC2 == 2) {
                    throw new U("Out-projection in in-position");
                }
            }
            InterfaceC0791a interfaceC0791aL02 = abstractC0438vB.L0();
            InterfaceC0428k interfaceC0428k2 = interfaceC0791aL02 instanceof InterfaceC0428k ? (InterfaceC0428k) interfaceC0791aL02 : null;
            if (interfaceC0428k2 == null || !interfaceC0428k2.m()) {
                interfaceC0428k2 = null;
            }
            if (nD.c()) {
                return nD;
            }
            AbstractC0438v abstractC0438vN0 = interfaceC0428k2 != null ? interfaceC0428k2.n0(nD.b()) : X.h(nD.b(), abstractC0438vB.J0());
            if (!abstractC0438vB.s().isEmpty()) {
                InterfaceC0798h interfaceC0798hC = s2.c(abstractC0438vB.s());
                if (interfaceC0798hC == null) {
                    a(33);
                    throw null;
                }
                if (interfaceC0798hC.e(m3.m.f8140y)) {
                    interfaceC0798hC = new C0802l(interfaceC0798hC, new T());
                }
                abstractC0438vN0 = V1.a.j0(abstractC0438vN0, new C0799i(new InterfaceC0798h[]{abstractC0438vN0.s(), interfaceC0798hC}));
            }
            if (iC == 1) {
                iA2 = b(iA2, nD.a());
            }
            return new O(iA2, abstractC0438vN0);
        }
        AbstractC0438v abstractC0438vB2 = n.b();
        int iA3 = n.a();
        if (abstractC0438vB2.I0().i() instanceof InterfaceC0755Q) {
            return n;
        }
        Z zL0 = abstractC0438vB2.L0();
        C0418a c0418a = zL0 instanceof C0418a ? (C0418a) zL0 : null;
        AbstractC0442z abstractC0442z3 = c0418a != null ? c0418a.f : null;
        if (abstractC0442z3 != null) {
            if ((s2 instanceof C0436t) && s2.b()) {
                C0436t c0436t = (C0436t) s2;
                v2 = new V(new C0436t(c0436t.f6696b, c0436t.f6697c, false));
            } else {
                v2 = this;
            }
            abstractC0438vI = v2.i(1, abstractC0442z3);
        }
        List listK = abstractC0438vB2.I0().k();
        List listS0 = abstractC0438vB2.s0();
        ArrayList arrayList = new ArrayList(listK.size());
        boolean z5 = false;
        for (int i7 = 0; i7 < listK.size(); i7++) {
            InterfaceC0755Q interfaceC0755Q2 = (InterfaceC0755Q) listK.get(i7);
            N n5 = (N) listS0.get(i7);
            N nJ4 = j(n5, interfaceC0755Q2, i5 + 1);
            int iC3 = Q0.c(c(interfaceC0755Q2.B(), nJ4.a()));
            if (iC3 != 0) {
                if (iC3 != 1) {
                    c2 = 2;
                    if (iC3 == 2) {
                    }
                    z4 = true;
                } else {
                    c2 = 2;
                }
                nJ4 = X.j(interfaceC0755Q2);
                z4 = true;
            } else {
                c2 = 2;
                int iB = interfaceC0755Q2.B();
                z4 = true;
                if (iB != 1 && !nJ4.c()) {
                    nJ4 = new O(1, nJ4.b());
                }
            }
            if (nJ4 != n5) {
                z5 = z4;
            }
            arrayList.add(nJ4);
        }
        if (z5) {
            listS0 = arrayList;
        }
        InterfaceC0798h interfaceC0798hC2 = s2.c(abstractC0438vB2.s());
        AbstractC0219i.e("newArguments", listS0);
        AbstractC0219i.e("newAnnotations", interfaceC0798hC2);
        AbstractC0438v abstractC0438vO = AbstractC0420c.o(abstractC0438vB2, listS0, interfaceC0798hC2, 4);
        if ((abstractC0438vO instanceof AbstractC0442z) && (abstractC0438vI instanceof AbstractC0442z)) {
            abstractC0438vO = AbstractC0420c.z((AbstractC0442z) abstractC0438vO, (AbstractC0442z) abstractC0438vI);
        }
        return new O(iA3, abstractC0438vO);
    }
}
