package S3;

import b3.AbstractC0219i;
import e4.AbstractC0438v;
import e4.AbstractC0442z;
import e4.C0421d;
import e4.G;
import e4.O;
import e4.Z;
import g3.y;
import m3.AbstractC0695h;
import p3.AbstractC0779w;
import p3.InterfaceC0761e;
import p3.InterfaceC0781y;

/* loaded from: classes.dex */
public final class r extends g {
    public r(N3.b bVar, int i5) {
        super(new p(new f(bVar, i5)));
    }

    @Override // S3.g
    public final AbstractC0438v a(InterfaceC0781y interfaceC0781y) {
        AbstractC0438v abstractC0438vC;
        AbstractC0219i.e("module", interfaceC0781y);
        G.f6646e.getClass();
        G g5 = G.f;
        AbstractC0695h abstractC0695hG = interfaceC0781y.g();
        abstractC0695hG.getClass();
        InterfaceC0761e interfaceC0761eI = abstractC0695hG.i(m3.m.f8104P.g());
        Object obj = this.f2531a;
        q qVar = (q) obj;
        if (qVar instanceof o) {
            abstractC0438vC = ((o) obj).f2539a;
        } else {
            if (!(qVar instanceof p)) {
                throw new O2.d();
            }
            f fVar = ((p) obj).f2540a;
            N3.b bVar = fVar.f2529a;
            InterfaceC0761e interfaceC0761eD = AbstractC0779w.d(interfaceC0781y, bVar);
            int i5 = fVar.f2530b;
            if (interfaceC0761eD == null) {
                g4.i iVar = g4.i.f6816g;
                String string = bVar.toString();
                AbstractC0219i.d("classId.toString()", string);
                abstractC0438vC = g4.j.c(iVar, string, String.valueOf(i5));
            } else {
                AbstractC0442z abstractC0442zQ = interfaceC0761eD.q();
                AbstractC0219i.d("descriptor.defaultType", abstractC0442zQ);
                Z zK0 = V1.a.k0(abstractC0442zQ);
                for (int i6 = 0; i6 < i5; i6++) {
                    zK0 = interfaceC0781y.g().h(zK0);
                }
                abstractC0438vC = zK0;
            }
        }
        return C0421d.q(g5, interfaceC0761eI, y.N(new O(abstractC0438vC)));
    }
}
