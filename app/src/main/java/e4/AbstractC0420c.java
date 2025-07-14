package e4;

import b3.AbstractC0219i;
import com.google.firebase.messaging.C0388e;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import m3.AbstractC0695h;
import p3.InterfaceC0755Q;
import p3.InterfaceC0764h;
import p3.InterfaceC0766j;
import p3.InterfaceC0776t;
import q3.C0797g;
import q3.C0802l;
import q3.InterfaceC0798h;

/* renamed from: e4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0420c {
    /* JADX WARN: Multi-variable type inference failed */
    public static final Z A(Z z4, AbstractC0438v abstractC0438v) {
        AbstractC0219i.e("<this>", z4);
        if (z4 instanceof Y) {
            return A(((Y) z4).x(), abstractC0438v);
        }
        if (abstractC0438v == null || abstractC0438v.equals(z4)) {
            return z4;
        }
        if (z4 instanceof AbstractC0442z) {
            return new C((AbstractC0442z) z4, abstractC0438v);
        }
        if (z4 instanceof AbstractC0434q) {
            return new C0435s((AbstractC0434q) z4, abstractC0438v);
        }
        throw new O2.d();
    }

    public static /* synthetic */ void a(int i5) {
        String str = i5 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i5 != 4 ? 3 : 2];
        switch (i5) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i5 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i5 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i5 == 4) {
            throw new IllegalStateException(str2);
        }
    }

    public static final AbstractC0442z b(AbstractC0438v abstractC0438v) {
        AbstractC0219i.e("<this>", abstractC0438v);
        Z zL0 = abstractC0438v.L0();
        AbstractC0442z abstractC0442z = zL0 instanceof AbstractC0442z ? (AbstractC0442z) zL0 : null;
        if (abstractC0442z != null) {
            return abstractC0442z;
        }
        throw new IllegalStateException(("This is should be simple type: " + abstractC0438v).toString());
    }

    public static final AbstractC0438v c(ArrayList arrayList, List list, AbstractC0695h abstractC0695h) {
        AbstractC0438v abstractC0438vI = new V(new F(arrayList)).i(3, (AbstractC0438v) P2.m.u0(list));
        return abstractC0438vI == null ? abstractC0695h.n() : abstractC0438vI;
    }

    public static final h4.c d(h4.c cVar, HashSet hashSet) {
        h4.c cVarD;
        f4.e eVar = f4.e.f6739e;
        J jE = eVar.E(cVar);
        if (!hashSet.add(jE)) {
            return null;
        }
        InterfaceC0755Q interfaceC0755QS = f4.g.s(jE);
        if (interfaceC0755QS != null) {
            h4.c cVarN = V1.a.N(interfaceC0755QS);
            cVarD = d(cVarN, hashSet);
            if (cVarD == null) {
                return null;
            }
            boolean z4 = f4.g.C(eVar.E(cVarN)) || ((cVarN instanceof h4.d) && f4.g.I((h4.d) cVarN));
            if ((cVarD instanceof h4.d) && f4.g.I((h4.d) cVarD) && f4.g.H(cVar) && z4) {
                return eVar.d(cVarN);
            }
            if (!f4.g.H(cVarD) && (cVar instanceof h4.d) && f4.g.F((h4.d) cVar)) {
                return eVar.d(cVarD);
            }
        } else {
            if (!f4.g.C(jE)) {
                return cVar;
            }
            AbstractC0219i.e("$receiver", cVar);
            if (!(cVar instanceof AbstractC0438v)) {
                StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(cVar);
                sb.append(", ");
                throw new IllegalArgumentException(A3.f.m(b3.q.f5100a, cVar.getClass(), sb).toString());
            }
            AbstractC0442z abstractC0442zF = Q3.j.f((AbstractC0438v) cVar);
            if (abstractC0442zF == null || (cVarD = d(abstractC0442zF, hashSet)) == null) {
                return null;
            }
            if (f4.g.H(cVar)) {
                return f4.g.H(cVarD) ? cVar : ((cVarD instanceof h4.d) && f4.g.I((h4.d) cVarD)) ? cVar : eVar.d(cVarD);
            }
        }
        return cVarD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final AbstractC0438v e(AbstractC0438v abstractC0438v) {
        AbstractC0219i.e("<this>", abstractC0438v);
        if (abstractC0438v instanceof Y) {
            return ((Y) abstractC0438v).G();
        }
        return null;
    }

    public static boolean f(I i5, h4.d dVar, AbstractC0420c abstractC0420c) {
        AbstractC0219i.e("type", dVar);
        f4.b bVar = i5.f6653c;
        if ((bVar.f0(dVar) && !bVar.r0(dVar)) || bVar.m(dVar)) {
            return true;
        }
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
                boolean zR0 = bVar.r0(dVar2);
                H h3 = H.f6648c;
                AbstractC0420c abstractC0420c2 = zR0 ? h3 : abstractC0420c;
                if (abstractC0420c2.equals(h3)) {
                    abstractC0420c2 = null;
                }
                if (abstractC0420c2 == null) {
                    continue;
                } else {
                    Iterator it = bVar.j0(bVar.d0(dVar2)).iterator();
                    while (it.hasNext()) {
                        h4.d dVarX = abstractC0420c2.x(i5, (h4.c) it.next());
                        if ((bVar.f0(dVarX) && !bVar.r0(dVarX)) || bVar.m(dVarX)) {
                            i5.a();
                            return true;
                        }
                        arrayDeque.add(dVarX);
                    }
                }
            }
        }
        i5.a();
        return false;
    }

    public static final Z g(Z z4, AbstractC0438v abstractC0438v) {
        AbstractC0219i.e("<this>", z4);
        AbstractC0219i.e("origin", abstractC0438v);
        return A(z4, e(abstractC0438v));
    }

    public static boolean h(I i5, h4.d dVar, h4.f fVar) {
        f4.b bVar = i5.f6653c;
        if (bVar.N(dVar)) {
            return true;
        }
        if (bVar.r0(dVar)) {
            return false;
        }
        if (i5.f6652b) {
            bVar.c0(dVar);
        }
        return bVar.H(bVar.d0(dVar), fVar);
    }

    public static final boolean i(AbstractC0438v abstractC0438v) {
        AbstractC0219i.e("<this>", abstractC0438v);
        Z zL0 = abstractC0438v.L0();
        return (zL0 instanceof g4.g) || ((zL0 instanceof AbstractC0434q) && (((AbstractC0434q) zL0).P0() instanceof g4.g));
    }

    public static final boolean j(AbstractC0438v abstractC0438v) {
        AbstractC0219i.e("<this>", abstractC0438v);
        return abstractC0438v.L0() instanceof AbstractC0434q;
    }

    public static final AbstractC0442z k(AbstractC0438v abstractC0438v) {
        AbstractC0219i.e("<this>", abstractC0438v);
        Z zL0 = abstractC0438v.L0();
        if (zL0 instanceof AbstractC0434q) {
            return ((AbstractC0434q) zL0).f6693e;
        }
        if (zL0 instanceof AbstractC0442z) {
            return (AbstractC0442z) zL0;
        }
        throw new O2.d();
    }

    public static final Z l(Z z4, boolean z5) {
        AbstractC0219i.e("<this>", z4);
        C0430m c0430mP = C0421d.p(z4, z5);
        if (c0430mP != null) {
            return c0430mP;
        }
        AbstractC0442z abstractC0442zM = m(z4);
        return abstractC0442zM != null ? abstractC0442zM : z4.M0(false);
    }

    public static final AbstractC0442z m(Z z4) {
        C0437u c0437u;
        J jI0 = z4.I0();
        C0437u c0437u2 = jI0 instanceof C0437u ? (C0437u) jI0 : null;
        if (c0437u2 == null) {
            return null;
        }
        LinkedHashSet<AbstractC0438v> linkedHashSet = c0437u2.f6700b;
        ArrayList arrayList = new ArrayList(P2.o.l0(linkedHashSet));
        boolean z5 = false;
        for (AbstractC0438v abstractC0438vL : linkedHashSet) {
            if (X.e(abstractC0438vL)) {
                abstractC0438vL = l(abstractC0438vL.L0(), false);
                z5 = true;
            }
            arrayList.add(abstractC0438vL);
        }
        if (z5) {
            AbstractC0438v abstractC0438vL2 = c0437u2.f6699a;
            if (abstractC0438vL2 == null) {
                abstractC0438vL2 = null;
            } else if (X.e(abstractC0438vL2)) {
                abstractC0438vL2 = l(abstractC0438vL2.L0(), false);
            }
            arrayList.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
            linkedHashSet2.hashCode();
            c0437u = new C0437u(linkedHashSet2);
            c0437u.f6699a = abstractC0438vL2;
        } else {
            c0437u = null;
        }
        if (c0437u == null) {
            return null;
        }
        return c0437u.b();
    }

    public static final AbstractC0442z n(AbstractC0442z abstractC0442z, List list, G g5) {
        AbstractC0219i.e("<this>", abstractC0442z);
        AbstractC0219i.e("newArguments", list);
        AbstractC0219i.e("newAttributes", g5);
        if (list.isEmpty() && g5 == abstractC0442z.H0()) {
            return abstractC0442z;
        }
        if (list.isEmpty()) {
            return abstractC0442z.O0(g5);
        }
        if (!(abstractC0442z instanceof g4.g)) {
            return C0421d.r(g5, abstractC0442z.I0(), list, abstractC0442z.J0());
        }
        g4.g gVar = (g4.g) abstractC0442z;
        String[] strArr = gVar.f6803j;
        return new g4.g(gVar.f6799e, gVar.f, gVar.f6800g, list, gVar.f6802i, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static AbstractC0438v o(AbstractC0438v abstractC0438v, List list, InterfaceC0798h interfaceC0798h, int i5) {
        if ((i5 & 2) != 0) {
            interfaceC0798h = abstractC0438v.s();
        }
        AbstractC0219i.e("<this>", abstractC0438v);
        AbstractC0219i.e("newAnnotations", interfaceC0798h);
        if ((list.isEmpty() || list == abstractC0438v.s0()) && interfaceC0798h == abstractC0438v.s()) {
            return abstractC0438v;
        }
        G gH0 = abstractC0438v.H0();
        if ((interfaceC0798h instanceof C0802l) && interfaceC0798h.isEmpty()) {
            interfaceC0798h = C0797g.f8481a;
        }
        G gQ = q(gH0, interfaceC0798h);
        Z zL0 = abstractC0438v.L0();
        if (zL0 instanceof AbstractC0434q) {
            AbstractC0434q abstractC0434q = (AbstractC0434q) zL0;
            return C0421d.j(n(abstractC0434q.f6693e, list, gQ), n(abstractC0434q.f, list, gQ));
        }
        if (zL0 instanceof AbstractC0442z) {
            return n((AbstractC0442z) zL0, list, gQ);
        }
        throw new O2.d();
    }

    public static /* synthetic */ AbstractC0442z p(AbstractC0442z abstractC0442z, List list, G g5, int i5) {
        if ((i5 & 1) != 0) {
            list = abstractC0442z.s0();
        }
        if ((i5 & 2) != 0) {
            g5 = abstractC0442z.H0();
        }
        return n(abstractC0442z, list, g5);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final e4.G q(e4.G r5, q3.InterfaceC0798h r6) {
        /*
            java.lang.String r0 = "<this>"
            b3.AbstractC0219i.e(r0, r5)
            q3.h r0 = e4.AbstractC0426i.a(r5)
            if (r0 != r6) goto Lc
            return r5
        Lc:
            g3.p[] r0 = e4.AbstractC0426i.f6683a
            r1 = 0
            r0 = r0[r1]
            com.google.android.gms.internal.firebase-auth-api.a4 r1 = e4.AbstractC0426i.f6684b
            r1.getClass()
            java.lang.String r2 = "property"
            b3.AbstractC0219i.e(r2, r0)
            k4.a r0 = r5.f7942d
            int r1 = r1.f5423a
            java.lang.Object r0 = r0.get(r1)
            e4.h r0 = (e4.C0425h) r0
            if (r0 == 0) goto L6b
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L2f
        L2d:
            r0 = r5
            goto L67
        L2f:
            k4.a r1 = r5.f7942d
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L3a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L51
            java.lang.Object r3 = r1.next()
            r4 = r3
            e4.h r4 = (e4.C0425h) r4
            boolean r4 = b3.AbstractC0219i.a(r4, r0)
            if (r4 != 0) goto L3a
            r2.add(r3)
            goto L3a
        L51:
            int r0 = r2.size()
            k4.a r1 = r5.f7942d
            int r1 = r1.l()
            if (r0 != r1) goto L5e
            goto L2d
        L5e:
            com.google.firebase.messaging.e r0 = e4.G.f6646e
            r0.getClass()
            e4.G r0 = com.google.firebase.messaging.C0388e.l(r2)
        L67:
            if (r0 != 0) goto L6a
            goto L6b
        L6a:
            r5 = r0
        L6b:
            java.util.Iterator r0 = r6.iterator()
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L7c
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L7c
            return r5
        L7c:
            e4.h r0 = new e4.h
            r0.<init>(r6)
            b3.r r6 = b3.q.f5100a
            java.lang.Class<e4.h> r1 = e4.C0425h.class
            g3.c r6 = r6.b(r1)
            com.google.firebase.messaging.e r1 = e4.G.f6646e
            int r6 = r1.q(r6)
            k4.a r1 = r5.f7942d
            java.lang.Object r6 = r1.get(r6)
            if (r6 == 0) goto L98
            goto Lb4
        L98:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto La8
            e4.G r5 = new e4.G
            java.util.List r6 = g3.y.N(r0)
            r5.<init>(r6)
            goto Lb4
        La8:
            java.util.List r5 = P2.m.O0(r5)
            java.util.ArrayList r5 = P2.m.H0(r5, r0)
            e4.G r5 = com.google.firebase.messaging.C0388e.l(r5)
        Lb4:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.AbstractC0420c.q(e4.G, q3.h):e4.G");
    }

    public static final AbstractC0438v r(InterfaceC0755Q interfaceC0755Q) {
        AbstractC0219i.e("<this>", interfaceC0755Q);
        InterfaceC0766j interfaceC0766jL = interfaceC0755Q.l();
        AbstractC0219i.d("this.containingDeclaration", interfaceC0766jL);
        if (interfaceC0766jL instanceof InterfaceC0764h) {
            List listK = ((InterfaceC0764h) interfaceC0766jL).I().k();
            AbstractC0219i.d("descriptor.typeConstructor.parameters", listK);
            ArrayList arrayList = new ArrayList(P2.o.l0(listK));
            Iterator it = listK.iterator();
            while (it.hasNext()) {
                J jI = ((InterfaceC0755Q) it.next()).I();
                AbstractC0219i.d("it.typeConstructor", jI);
                arrayList.add(jI);
            }
            List upperBounds = interfaceC0755Q.getUpperBounds();
            AbstractC0219i.d("upperBounds", upperBounds);
            return c(arrayList, upperBounds, U3.f.e(interfaceC0755Q));
        }
        if (!(interfaceC0766jL instanceof InterfaceC0776t)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List listU = ((InterfaceC0776t) interfaceC0766jL).u();
        AbstractC0219i.d("descriptor.typeParameters", listU);
        ArrayList arrayList2 = new ArrayList(P2.o.l0(listU));
        Iterator it2 = listU.iterator();
        while (it2.hasNext()) {
            J jI2 = ((InterfaceC0755Q) it2.next()).I();
            AbstractC0219i.d("it.typeConstructor", jI2);
            arrayList2.add(jI2);
        }
        List upperBounds2 = interfaceC0755Q.getUpperBounds();
        AbstractC0219i.d("upperBounds", upperBounds2);
        return c(arrayList2, upperBounds2, U3.f.e(interfaceC0755Q));
    }

    public static boolean s(f4.b bVar, h4.d dVar, h4.d dVar2) {
        if (bVar.p(dVar) == bVar.p(dVar2) && bVar.r0(dVar) == bVar.r0(dVar2)) {
            if ((bVar.y0(dVar) == null) == (bVar.y0(dVar2) == null) && bVar.H(bVar.d0(dVar), bVar.d0(dVar2))) {
                if (bVar.i(dVar, dVar2)) {
                    return true;
                }
                int iP = bVar.p(dVar);
                for (int i5 = 0; i5 < iP; i5++) {
                    N nU = bVar.u(dVar, i5);
                    N nU2 = bVar.u(dVar2, i5);
                    if (bVar.W(nU) != bVar.W(nU2)) {
                        return false;
                    }
                    if (!bVar.W(nU) && (bVar.v0(nU) != bVar.v0(nU2) || !t(bVar, bVar.l0(nU), bVar.l0(nU2)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean t(f4.b bVar, h4.c cVar, h4.c cVar2) {
        if (cVar == cVar2) {
            return true;
        }
        AbstractC0442z abstractC0442zA0 = bVar.A0(cVar);
        AbstractC0442z abstractC0442zA02 = bVar.A0(cVar2);
        if (abstractC0442zA0 != null && abstractC0442zA02 != null) {
            return s(bVar, abstractC0442zA0, abstractC0442zA02);
        }
        AbstractC0434q abstractC0434qB0 = bVar.B0(cVar);
        AbstractC0434q abstractC0434qB02 = bVar.B0(cVar2);
        if (abstractC0434qB0 == null || abstractC0434qB02 == null) {
            return false;
        }
        return s(bVar, bVar.a0(abstractC0434qB0), bVar.a0(abstractC0434qB02)) && s(bVar, bVar.g0(abstractC0434qB0), bVar.g0(abstractC0434qB02));
    }

    public static V u(List list, S s2, InterfaceC0766j interfaceC0766j, ArrayList arrayList) {
        if (s2 == null) {
            a(1);
            throw null;
        }
        if (interfaceC0766j == null) {
            a(2);
            throw null;
        }
        if (arrayList == null) {
            a(3);
            throw null;
        }
        V v2 = v(list, s2, interfaceC0766j, arrayList, null);
        if (v2 != null) {
            return v2;
        }
        throw new AssertionError("Substitution failed");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static e4.V v(java.util.List r17, e4.S r18, p3.InterfaceC0766j r19, java.util.ArrayList r20, boolean[] r21) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.AbstractC0420c.v(java.util.List, e4.S, p3.j, java.util.ArrayList, boolean[]):e4.V");
    }

    public static final G w(InterfaceC0798h interfaceC0798h) {
        AbstractC0219i.e("<this>", interfaceC0798h);
        if (interfaceC0798h.isEmpty()) {
            G.f6646e.getClass();
            return G.f;
        }
        C0388e c0388e = G.f6646e;
        List listN = g3.y.N(new C0425h(interfaceC0798h));
        c0388e.getClass();
        return C0388e.l(listN);
    }

    public static final AbstractC0442z y(AbstractC0438v abstractC0438v) {
        AbstractC0219i.e("<this>", abstractC0438v);
        Z zL0 = abstractC0438v.L0();
        if (zL0 instanceof AbstractC0434q) {
            return ((AbstractC0434q) zL0).f;
        }
        if (zL0 instanceof AbstractC0442z) {
            return (AbstractC0442z) zL0;
        }
        throw new O2.d();
    }

    public static final AbstractC0442z z(AbstractC0442z abstractC0442z, AbstractC0442z abstractC0442z2) {
        AbstractC0219i.e("<this>", abstractC0442z);
        AbstractC0219i.e("abbreviatedType", abstractC0442z2);
        return i(abstractC0442z) ? abstractC0442z : new C0418a(abstractC0442z, abstractC0442z2);
    }

    public abstract h4.d x(I i5, h4.c cVar);
}
