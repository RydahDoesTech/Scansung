package D3;

import P2.o;
import X3.n;
import b3.AbstractC0219i;
import com.google.firebase.messaging.C0388e;
import e4.AbstractC0420c;
import e4.AbstractC0438v;
import e4.AbstractC0442z;
import e4.C0421d;
import e4.G;
import e4.J;
import e4.N;
import e4.O;
import e4.S;
import g3.y;
import g4.i;
import g4.j;
import java.util.ArrayList;
import java.util.List;
import m3.AbstractC0695h;
import p3.InterfaceC0755Q;
import p3.InterfaceC0761e;
import p3.InterfaceC0763g;

/* loaded from: classes.dex */
public final class e extends S {

    /* renamed from: c, reason: collision with root package name */
    public static final a f510c = V1.a.n0(2, false, true, null, 5).b(3);

    /* renamed from: d, reason: collision with root package name */
    public static final a f511d = V1.a.n0(2, false, true, null, 5).b(2);

    /* renamed from: b, reason: collision with root package name */
    public final C0388e f512b = new C0388e(new O1.e(2));

    @Override // e4.S
    public final N d(AbstractC0438v abstractC0438v) {
        return new O(h(abstractC0438v, new a(2, false, false, null, 62)));
    }

    public final O2.f g(AbstractC0442z abstractC0442z, InterfaceC0761e interfaceC0761e, a aVar) {
        if (abstractC0442z.I0().k().isEmpty()) {
            return new O2.f(abstractC0442z, Boolean.FALSE);
        }
        if (AbstractC0695h.x(abstractC0442z)) {
            N n = (N) abstractC0442z.s0().get(0);
            int iA = n.a();
            AbstractC0438v abstractC0438vB = n.b();
            AbstractC0219i.d("componentTypeProjection.type", abstractC0438vB);
            return new O2.f(C0421d.r(abstractC0442z.H0(), abstractC0442z.I0(), y.N(new O(iA, h(abstractC0438vB, aVar))), abstractC0442z.J0()), Boolean.FALSE);
        }
        if (AbstractC0420c.i(abstractC0442z)) {
            return new O2.f(j.c(i.f6825q, abstractC0442z.I0().toString()), Boolean.FALSE);
        }
        n nVarE0 = interfaceC0761e.E0(this);
        AbstractC0219i.d("declaration.getMemberScope(this)", nVarE0);
        G gH0 = abstractC0442z.H0();
        J jI = interfaceC0761e.I();
        AbstractC0219i.d("declaration.typeConstructor", jI);
        List<InterfaceC0755Q> listK = interfaceC0761e.I().k();
        AbstractC0219i.d("declaration.typeConstructor.parameters", listK);
        ArrayList arrayList = new ArrayList(o.l0(listK));
        for (InterfaceC0755Q interfaceC0755Q : listK) {
            AbstractC0219i.d("parameter", interfaceC0755Q);
            C0388e c0388e = this.f512b;
            arrayList.add(O1.e.e(interfaceC0755Q, aVar, c0388e, c0388e.p(interfaceC0755Q, aVar)));
        }
        return new O2.f(C0421d.t(gH0, jI, arrayList, abstractC0442z.J0(), nVarE0, new B3.d(interfaceC0761e, this, abstractC0442z, aVar)), Boolean.TRUE);
    }

    public final AbstractC0438v h(AbstractC0438v abstractC0438v, a aVar) {
        InterfaceC0763g interfaceC0763gI = abstractC0438v.I0().i();
        if (interfaceC0763gI instanceof InterfaceC0755Q) {
            aVar.getClass();
            return h(this.f512b.p((InterfaceC0755Q) interfaceC0763gI, a.a(aVar, 0, true, null, null, 59)), aVar);
        }
        if (!(interfaceC0763gI instanceof InterfaceC0761e)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + interfaceC0763gI).toString());
        }
        InterfaceC0763g interfaceC0763gI2 = AbstractC0420c.y(abstractC0438v).I0().i();
        if (interfaceC0763gI2 instanceof InterfaceC0761e) {
            O2.f fVarG = g(AbstractC0420c.k(abstractC0438v), (InterfaceC0761e) interfaceC0763gI, f510c);
            AbstractC0442z abstractC0442z = (AbstractC0442z) fVarG.f2006d;
            boolean zBooleanValue = ((Boolean) fVarG.f2007e).booleanValue();
            O2.f fVarG2 = g(AbstractC0420c.y(abstractC0438v), (InterfaceC0761e) interfaceC0763gI2, f511d);
            AbstractC0442z abstractC0442z2 = (AbstractC0442z) fVarG2.f2006d;
            return (zBooleanValue || ((Boolean) fVarG2.f2007e).booleanValue()) ? new g(abstractC0442z, abstractC0442z2) : C0421d.j(abstractC0442z, abstractC0442z2);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + interfaceC0763gI2 + "\" while for lower it's \"" + interfaceC0763gI + '\"').toString());
    }
}
