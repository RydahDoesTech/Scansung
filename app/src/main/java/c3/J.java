package C3;

import b3.AbstractC0219i;
import e4.AbstractC0438v;
import e4.C0421d;
import e4.X;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p3.InterfaceC0767k;
import s3.AbstractC0847c;
import v3.C0891C;
import y3.EnumC0932a;

/* loaded from: classes.dex */
public final class J extends AbstractC0847c {
    public final B3.g n;

    /* renamed from: o, reason: collision with root package name */
    public final C0891C f375o;

    /* JADX WARN: Illegal instructions before constructor call */
    public J(B3.g gVar, C0891C c0891c, int i5, InterfaceC0767k interfaceC0767k) {
        AbstractC0219i.e("javaTypeParameter", c0891c);
        B3.b bVar = (B3.b) gVar.f255e;
        super(bVar.f223a, interfaceC0767k, new B3.e(gVar, c0891c, false), N3.f.e(c0891c.f9229a.getName()), 1, false, i5, bVar.f234m);
        this.n = gVar;
        this.f375o = c0891c;
    }

    @Override // s3.AbstractC0854j
    public final List O0(List list) {
        B3.g gVar = this.n;
        F3.d dVar = ((B3.b) gVar.f255e).f238r;
        dVar.getClass();
        ArrayList arrayList = new ArrayList(P2.o.l0(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC0438v abstractC0438vB = (AbstractC0438v) it.next();
            F3.n nVar = F3.n.f660h;
            AbstractC0219i.e("<this>", abstractC0438vB);
            if (!X.c(abstractC0438vB, nVar, null) && (abstractC0438vB = dVar.b(new F3.p(this, false, gVar, EnumC0932a.TYPE_PARAMETER_BOUNDS, false), abstractC0438vB, P2.u.f2163d, null, false)) == null) {
                abstractC0438vB = abstractC0438vB;
            }
            arrayList.add(abstractC0438vB);
        }
        return arrayList;
    }

    @Override // s3.AbstractC0854j
    public final List P0() {
        Type[] bounds = this.f375o.f9229a.getBounds();
        AbstractC0219i.d("typeVariable.bounds", bounds);
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new v3.q(type));
        }
        v3.q qVar = (v3.q) P2.m.L0(arrayList);
        List list = arrayList;
        if (AbstractC0219i.a(qVar != null ? qVar.f9260a : null, Object.class)) {
            list = P2.u.f2163d;
        }
        boolean zIsEmpty = list.isEmpty();
        B3.g gVar = this.n;
        if (zIsEmpty) {
            return g3.y.N(C0421d.j(((B3.b) gVar.f255e).f235o.f8732g.e(), ((B3.b) gVar.f255e).f235o.f8732g.n()));
        }
        ArrayList arrayList2 = new ArrayList(P2.o.l0(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((D3.c) gVar.f258i).r((v3.q) it.next(), V1.a.n0(2, false, false, this, 3)));
        }
        return arrayList2;
    }
}
