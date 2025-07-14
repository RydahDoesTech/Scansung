package C3;

import a3.InterfaceC0106a;
import b3.AbstractC0219i;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import o3.C0722e;
import p3.AbstractC0779w;
import p3.InterfaceC0761e;
import v3.AbstractC0897d;
import v3.C0898e;

/* renamed from: C3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0014f extends b3.k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0015g f389e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0014f(C0015g c0015g, int i5) {
        super(0);
        this.f388d = i5;
        this.f389e = c0015g;
    }

    @Override // a3.InterfaceC0106a
    public final Object a() throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        switch (this.f388d) {
            case 0:
                C0015g c0015g = this.f389e;
                ArrayList arrayListA = c0015g.f392b.a();
                ArrayList arrayList = new ArrayList();
                Iterator it = arrayListA.iterator();
                while (it.hasNext()) {
                    E3.a aVar = (E3.a) it.next();
                    N3.f fVar = ((v3.f) aVar).f9247a;
                    if (fVar == null) {
                        fVar = y3.x.f9442b;
                    }
                    S3.g gVarC = c0015g.c(aVar);
                    O2.f fVar2 = gVarC != null ? new O2.f(fVar, gVarC) : null;
                    if (fVar2 != null) {
                        arrayList.add(fVar2);
                    }
                }
                return P2.z.k0(arrayList);
            case 1:
                return AbstractC0897d.a(g3.y.z(g3.y.s(this.f389e.f392b.f9246a))).b();
            default:
                C0015g c0015g2 = this.f389e;
                N3.c cVarA = c0015g2.a();
                C0898e c0898e = c0015g2.f392b;
                if (cVarA == null) {
                    return g4.j.c(g4.i.f6814H, c0898e.toString());
                }
                B3.g gVar = c0015g2.f391a;
                InterfaceC0761e interfaceC0761eB = C0722e.b(cVarA, ((B3.b) gVar.f255e).f235o.f8732g);
                if (interfaceC0761eB == null) {
                    v3.o oVar = new v3.o(g3.y.z(g3.y.s(c0898e.f9246a)));
                    B3.b bVar = (B3.b) gVar.f255e;
                    B.g gVar2 = bVar.f232k;
                    gVar2.getClass();
                    B.g gVar3 = (B.g) gVar2.f95e;
                    if (gVar3 == null) {
                        AbstractC0219i.g("resolver");
                        throw null;
                    }
                    interfaceC0761eB = gVar3.j(oVar);
                    if (interfaceC0761eB == null) {
                        interfaceC0761eB = AbstractC0779w.f(bVar.f235o, N3.b.j(cVarA), bVar.f226d.c().f3047l);
                    }
                }
                return interfaceC0761eB.q();
        }
    }
}
