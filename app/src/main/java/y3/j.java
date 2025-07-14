package y3;

import b3.AbstractC0219i;
import e4.AbstractC0438v;
import e4.V;
import java.util.List;
import k.Q0;
import p3.InterfaceC0758b;
import p3.InterfaceC0761e;
import s3.C0837M;
import s3.C0867w;

/* loaded from: classes.dex */
public final class j implements Q3.i {
    @Override // Q3.i
    public Q3.g a() {
        return Q3.g.f2343e;
    }

    @Override // Q3.i
    public Q3.h b(InterfaceC0758b interfaceC0758b, InterfaceC0758b interfaceC0758b2, InterfaceC0761e interfaceC0761e) {
        AbstractC0219i.e("superDescriptor", interfaceC0758b);
        AbstractC0219i.e("subDescriptor", interfaceC0758b2);
        boolean z4 = interfaceC0758b2 instanceof A3.g;
        Q3.h hVar = Q3.h.f;
        if (!z4) {
            return hVar;
        }
        A3.g gVar = (A3.g) interfaceC0758b2;
        if (!gVar.u().isEmpty()) {
            return hVar;
        }
        Q3.o oVarI = Q3.p.i(interfaceC0758b, interfaceC0758b2);
        if ((oVarI != null ? oVarI.c() : 0) != 0) {
            return hVar;
        }
        List listV0 = gVar.v0();
        AbstractC0219i.d("subDescriptor.valueParameters", listV0);
        o4.r rVarI0 = o4.m.i0(P2.m.p0(listV0), C0936e.f9401h);
        AbstractC0438v abstractC0438v = gVar.f8879j;
        AbstractC0219i.b(abstractC0438v);
        o4.h hVarG0 = o4.m.g0(P2.i.j0(new o4.k[]{rVarI0, P2.i.j0(new Object[]{abstractC0438v})}));
        C0867w c0867w = gVar.f8881l;
        o4.g gVar2 = new o4.g(o4.m.g0(P2.i.j0(new o4.k[]{hVarG0, P2.m.p0(P2.n.i0(c0867w != null ? c0867w.d() : null))})));
        while (gVar2.a()) {
            AbstractC0438v abstractC0438v2 = (AbstractC0438v) gVar2.next();
            if (!abstractC0438v2.s0().isEmpty() && !(abstractC0438v2.L0() instanceof D3.g)) {
                return hVar;
            }
        }
        InterfaceC0758b interfaceC0758bI = (InterfaceC0758b) interfaceC0758b.c(new V(new D3.e()));
        if (interfaceC0758bI == null) {
            return hVar;
        }
        if (interfaceC0758bI instanceof C0837M) {
            C0837M c0837m = (C0837M) interfaceC0758bI;
            if (!c0837m.u().isEmpty()) {
                interfaceC0758bI = c0837m.c0().D().i();
                AbstractC0219i.b(interfaceC0758bI);
            }
        }
        int iC = Q3.p.f2358c.n(interfaceC0758bI, interfaceC0758b2, false).c();
        A3.f.u(iC, "DEFAULT.isOverridableByW…Descriptor, false).result");
        return i.f9411a[Q0.c(iC)] == 1 ? Q3.h.f2345d : hVar;
    }
}
