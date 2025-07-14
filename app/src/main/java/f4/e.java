package f4;

import b3.AbstractC0219i;
import e4.AbstractC0420c;
import e4.AbstractC0434q;
import e4.AbstractC0438v;
import e4.AbstractC0442z;
import e4.C0421d;
import e4.C0430m;
import e4.C0437u;
import e4.J;
import e4.N;
import e4.O;
import e4.X;
import e4.Z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p3.InterfaceC0755Q;

/* loaded from: classes.dex */
public final class e implements b {

    /* renamed from: d, reason: collision with root package name */
    public static final e f6738d = new e();

    /* renamed from: e, reason: collision with root package name */
    public static final e f6739e = new e();

    /* JADX WARN: Multi-variable type inference failed */
    public static AbstractC0442z j(AbstractC0442z abstractC0442z) {
        AbstractC0438v abstractC0438vB;
        J jI0 = abstractC0442z.I0();
        if (jI0 instanceof R3.c) {
            R3.c cVar = (R3.c) jI0;
            N n = cVar.f2487a;
            if (n.a() != 2) {
                n = null;
            }
            if (n != null && (abstractC0438vB = n.b()) != null) {
                zG = abstractC0438vB.L0();
            }
            Z z4 = zG;
            if (cVar.f2488b == null) {
                Collection collectionJ = cVar.j();
                ArrayList arrayList = new ArrayList(P2.o.l0(collectionJ));
                Iterator it = collectionJ.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC0438v) it.next()).L0());
                }
                N n2 = cVar.f2487a;
                AbstractC0219i.e("projection", n2);
                cVar.f2488b = new i(n2, new c4.d(arrayList, 1), null, null, 8);
            }
            i iVar = cVar.f2488b;
            AbstractC0219i.b(iVar);
            return new h(1, iVar, z4, abstractC0442z.H0(), abstractC0442z.J0(), 32);
        }
        if (!(jI0 instanceof C0437u) || !abstractC0442z.J0()) {
            return abstractC0442z;
        }
        C0437u c0437u = (C0437u) jI0;
        LinkedHashSet<AbstractC0438v> linkedHashSet = c0437u.f6700b;
        ArrayList arrayList2 = new ArrayList(P2.o.l0(linkedHashSet));
        boolean z5 = false;
        for (AbstractC0438v abstractC0438v : linkedHashSet) {
            AbstractC0219i.e("<this>", abstractC0438v);
            arrayList2.add(X.g(abstractC0438v, true));
            z5 = true;
        }
        if (z5) {
            AbstractC0438v abstractC0438v2 = c0437u.f6699a;
            zG = abstractC0438v2 != null ? X.g(abstractC0438v2, true) : null;
            arrayList2.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList2);
            linkedHashSet2.hashCode();
            C0437u c0437u2 = new C0437u(linkedHashSet2);
            c0437u2.f6699a = zG;
            zG = c0437u2;
        }
        if (zG != null) {
            c0437u = zG;
        }
        return c0437u.b();
    }

    @Override // f4.b
    public int A(h4.f fVar) {
        return g.R(fVar);
    }

    @Override // f4.b
    public AbstractC0442z A0(h4.c cVar) {
        return g.h(cVar);
    }

    @Override // f4.b
    public void B(h4.d dVar) {
        g.M(dVar);
    }

    @Override // f4.b
    public AbstractC0434q B0(h4.c cVar) {
        return g.g(cVar);
    }

    @Override // f4.b
    public AbstractC0442z C(h4.d dVar) {
        return g.j(dVar);
    }

    @Override // f4.b
    public h4.d D(h4.d dVar) {
        AbstractC0442z abstractC0442zQ;
        AbstractC0219i.e("<this>", dVar);
        C0430m c0430mF = g.f(dVar);
        return (c0430mF == null || (abstractC0442zQ = g.Q(c0430mF)) == null) ? dVar : abstractC0442zQ;
    }

    @Override // f4.b
    public J E(h4.c cVar) {
        AbstractC0219i.e("<this>", cVar);
        AbstractC0442z abstractC0442zH = g.h(cVar);
        if (abstractC0442zH == null) {
            abstractC0442zH = z(cVar);
        }
        return g.W(abstractC0442zH);
    }

    @Override // f4.b
    public Set G(h4.d dVar) {
        return g.S(this, dVar);
    }

    @Override // f4.b
    public boolean H(h4.f fVar, h4.f fVar2) {
        return g.b(fVar, fVar2);
    }

    @Override // f4.b
    public boolean I(h4.f fVar) {
        return g.A(fVar);
    }

    @Override // f4.b
    public boolean J(h4.b bVar) {
        return g.J(bVar);
    }

    @Override // f4.b
    public i M(h4.b bVar) {
        return g.X(bVar);
    }

    @Override // f4.b
    public boolean N(h4.d dVar) {
        AbstractC0219i.e("<this>", dVar);
        return g.G(E(dVar)) && !g.H(dVar);
    }

    @Override // f4.b
    public h4.e O(h4.d dVar) {
        return g.d(dVar);
    }

    @Override // f4.b
    public void Q(h4.c cVar) {
        AbstractC0219i.e("<this>", cVar);
        g.g(cVar);
    }

    @Override // f4.b
    public AbstractC0442z T(C0430m c0430m) {
        return g.Q(c0430m);
    }

    @Override // f4.b
    public h4.b U(h4.d dVar) {
        return g.e(this, dVar);
    }

    @Override // f4.b
    public Z V(ArrayList arrayList) {
        AbstractC0442z abstractC0442z;
        int size = arrayList.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (Z) P2.m.J0(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(P2.o.l0(arrayList));
        Iterator it = arrayList.iterator();
        boolean z4 = false;
        boolean z5 = false;
        while (it.hasNext()) {
            Z z6 = (Z) it.next();
            z4 = z4 || AbstractC0420c.i(z6);
            if (z6 instanceof AbstractC0442z) {
                abstractC0442z = (AbstractC0442z) z6;
            } else {
                if (!(z6 instanceof AbstractC0434q)) {
                    throw new O2.d();
                }
                AbstractC0219i.e("<this>", z6);
                abstractC0442z = ((AbstractC0434q) z6).f6693e;
                z5 = true;
            }
            arrayList2.add(abstractC0442z);
        }
        if (z4) {
            return g4.j.c(g4.i.f6808A, arrayList.toString());
        }
        t tVar = t.f6764a;
        if (!z5) {
            return tVar.b(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(P2.o.l0(arrayList));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(AbstractC0420c.y((Z) it2.next()));
        }
        return C0421d.j(tVar.b(arrayList2), tVar.b(arrayList3));
    }

    @Override // f4.b
    public boolean W(N n) {
        return g.K(n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f4.b
    public N X(h4.e eVar, int i5) {
        AbstractC0219i.e("<this>", eVar);
        if (eVar instanceof h4.d) {
            return g.p((h4.c) eVar, i5);
        }
        if (eVar instanceof h4.a) {
            E e5 = ((h4.a) eVar).get(i5);
            AbstractC0219i.d("get(index)", e5);
            return (N) e5;
        }
        throw new IllegalStateException(("unknown type argument list type: " + eVar + ", " + b3.q.f5100a.b(eVar.getClass())).toString());
    }

    @Override // f4.b
    public O Y(h4.c cVar) {
        return g.i(cVar);
    }

    @Override // f4.b
    public void a(h4.d dVar, h4.f fVar) {
    }

    @Override // f4.b
    public AbstractC0442z a0(AbstractC0434q abstractC0434q) {
        return g.N(abstractC0434q);
    }

    @Override // f4.b
    public boolean b(Z z4) {
        AbstractC0219i.e("<this>", z4);
        return g.F(z(z4)) != g.F(b0(z4));
    }

    @Override // f4.b
    public AbstractC0442z b0(h4.c cVar) {
        AbstractC0442z abstractC0442zY;
        AbstractC0219i.e("<this>", cVar);
        AbstractC0434q abstractC0434qG = g.g(cVar);
        if (abstractC0434qG != null && (abstractC0442zY = g.Y(abstractC0434qG)) != null) {
            return abstractC0442zY;
        }
        AbstractC0442z abstractC0442zH = g.h(cVar);
        AbstractC0219i.b(abstractC0442zH);
        return abstractC0442zH;
    }

    @Override // f4.b
    public boolean c(h4.f fVar) {
        return g.D(fVar);
    }

    @Override // f4.b
    public void c0(h4.d dVar) {
        g.L(dVar);
    }

    public h4.c d(h4.c cVar) {
        AbstractC0442z abstractC0442zZ;
        AbstractC0219i.e("<this>", cVar);
        AbstractC0442z abstractC0442zH = g.h(cVar);
        return (abstractC0442zH == null || (abstractC0442zZ = g.Z(abstractC0442zH, true)) == null) ? cVar : abstractC0442zZ;
    }

    @Override // f4.b
    public J d0(h4.d dVar) {
        return g.W(dVar);
    }

    @Override // f4.b
    public Z e(h4.d dVar, h4.d dVar2) {
        return g.m(this, dVar, dVar2);
    }

    @Override // f4.b
    public boolean e0(h4.f fVar) {
        return g.z(fVar);
    }

    @Override // f4.b
    public boolean f(h4.f fVar) {
        return g.G(fVar);
    }

    @Override // f4.b
    public boolean f0(h4.d dVar) {
        AbstractC0219i.e("<this>", dVar);
        return g.y(g.W(dVar));
    }

    public Z g(h4.c cVar) {
        Z zJ;
        AbstractC0219i.e("type", cVar);
        if (!(cVar instanceof AbstractC0438v)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Z zL0 = ((AbstractC0438v) cVar).L0();
        if (zL0 instanceof AbstractC0442z) {
            zJ = j((AbstractC0442z) zL0);
        } else {
            if (!(zL0 instanceof AbstractC0434q)) {
                throw new O2.d();
            }
            AbstractC0434q abstractC0434q = (AbstractC0434q) zL0;
            AbstractC0442z abstractC0442z = abstractC0434q.f6693e;
            AbstractC0442z abstractC0442zJ = j(abstractC0442z);
            AbstractC0442z abstractC0442z2 = abstractC0434q.f;
            AbstractC0442z abstractC0442zJ2 = j(abstractC0442z2);
            zJ = (abstractC0442zJ == abstractC0442z && abstractC0442zJ2 == abstractC0442z2) ? zL0 : C0421d.j(abstractC0442zJ, abstractC0442zJ2);
        }
        AbstractC0438v abstractC0438vE = AbstractC0420c.e(zL0);
        return AbstractC0420c.A(zJ, abstractC0438vE != null ? g(abstractC0438vE) : null);
    }

    @Override // f4.b
    public AbstractC0442z g0(AbstractC0434q abstractC0434q) {
        return g.Y(abstractC0434q);
    }

    @Override // f4.b
    public AbstractC0442z h(h4.d dVar, boolean z4) {
        return g.Z(dVar, z4);
    }

    @Override // f4.b
    public boolean h0(h4.f fVar) {
        return g.E(fVar);
    }

    @Override // f4.b
    public boolean i(h4.d dVar, h4.d dVar2) {
        return g.w(dVar, dVar2);
    }

    @Override // f4.b
    public Z i0(h4.c cVar) {
        return g.P(cVar);
    }

    @Override // f4.b
    public Collection j0(h4.f fVar) {
        return g.V(fVar);
    }

    @Override // f4.b
    public boolean k0(h4.f fVar) {
        return g.x(fVar);
    }

    @Override // f4.b
    public boolean l(h4.b bVar) {
        AbstractC0219i.e("$receiver", bVar);
        return bVar instanceof R3.a;
    }

    @Override // f4.b
    public Z l0(N n) {
        return g.r(n);
    }

    @Override // f4.b
    public boolean m(h4.c cVar) {
        AbstractC0219i.e("<this>", cVar);
        AbstractC0442z abstractC0442zH = g.h(cVar);
        return (abstractC0442zH != null ? g.f(abstractC0442zH) : null) != null;
    }

    @Override // f4.b
    public N m0(h4.d dVar, int i5) {
        AbstractC0219i.e("<this>", dVar);
        if (i5 < 0 || i5 >= g.c(dVar)) {
            return null;
        }
        return g.p(dVar, i5);
    }

    @Override // f4.b
    public boolean n(h4.f fVar) {
        return g.y(fVar);
    }

    @Override // f4.b
    public int o(h4.e eVar) {
        AbstractC0219i.e("<this>", eVar);
        if (eVar instanceof h4.d) {
            return g.c((h4.c) eVar);
        }
        if (eVar instanceof h4.a) {
            return ((h4.a) eVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + eVar + ", " + b3.q.f5100a.b(eVar.getClass())).toString());
    }

    @Override // f4.b
    public boolean o0(h4.c cVar) {
        AbstractC0219i.e("$receiver", cVar);
        return cVar instanceof F3.g;
    }

    @Override // f4.b
    public int p(h4.c cVar) {
        return g.c(cVar);
    }

    @Override // f4.b
    public h4.c p0(h4.c cVar) {
        return g.a0(this, cVar);
    }

    @Override // f4.b
    public int q(InterfaceC0755Q interfaceC0755Q) {
        AbstractC0219i.e("$receiver", interfaceC0755Q);
        int iB = interfaceC0755Q.B();
        A3.f.u(iB, "this.variance");
        return Y0.j.n(iB);
    }

    @Override // f4.b
    public boolean q0(h4.d dVar) {
        return g.B(dVar);
    }

    @Override // f4.b
    public Z r(h4.b bVar) {
        return g.O(bVar);
    }

    @Override // f4.b
    public boolean r0(h4.d dVar) {
        return g.F(dVar);
    }

    @Override // f4.b
    public int t(h4.b bVar) {
        return g.k(bVar);
    }

    @Override // f4.b
    public N u(h4.c cVar, int i5) {
        return g.p(cVar, i5);
    }

    @Override // f4.b
    public boolean u0(InterfaceC0755Q interfaceC0755Q, h4.f fVar) {
        return g.v(interfaceC0755Q, fVar);
    }

    @Override // f4.b
    public N v(R3.b bVar) {
        return g.T(bVar);
    }

    @Override // f4.b
    public int v0(N n) {
        return g.t(n);
    }

    @Override // f4.b
    public boolean x(h4.d dVar) {
        AbstractC0219i.e("<this>", dVar);
        AbstractC0442z abstractC0442zH = g.h(dVar);
        return (abstractC0442zH != null ? g.e(this, abstractC0442zH) : null) != null;
    }

    @Override // f4.b
    public boolean x0(h4.d dVar) {
        AbstractC0219i.e("<this>", dVar);
        return g.D(g.W(dVar));
    }

    @Override // f4.b
    public a y(h4.d dVar) {
        return g.U(this, dVar);
    }

    @Override // f4.b
    public C0430m y0(h4.d dVar) {
        return g.f(dVar);
    }

    @Override // f4.b
    public AbstractC0442z z(h4.c cVar) {
        AbstractC0442z abstractC0442zN;
        AbstractC0219i.e("<this>", cVar);
        AbstractC0434q abstractC0434qG = g.g(cVar);
        if (abstractC0434qG != null && (abstractC0442zN = g.N(abstractC0434qG)) != null) {
            return abstractC0442zN;
        }
        AbstractC0442z abstractC0442zH = g.h(cVar);
        AbstractC0219i.b(abstractC0442zH);
        return abstractC0442zH;
    }

    @Override // f4.b
    public InterfaceC0755Q z0(h4.f fVar, int i5) {
        return g.q(fVar, i5);
    }
}
