package C3;

import b3.AbstractC0219i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p3.InterfaceC0750L;
import p3.InterfaceC0763g;
import p3.InterfaceC0766j;
import x3.EnumC0915b;

/* loaded from: classes.dex */
public final class H extends I {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f373p = 0;
    public final v3.o n;

    /* renamed from: o, reason: collision with root package name */
    public final k f374o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(B3.g gVar, v3.o oVar, k kVar) {
        super(gVar, null);
        AbstractC0219i.e("jClass", oVar);
        this.n = oVar;
        this.f374o = kVar;
    }

    public static InterfaceC0750L v(InterfaceC0750L interfaceC0750L) {
        if (interfaceC0750L.i0() != 2) {
            return interfaceC0750L;
        }
        Collection<InterfaceC0750L> collectionP = interfaceC0750L.p();
        AbstractC0219i.d("this.overriddenDescriptors", collectionP);
        ArrayList arrayList = new ArrayList(P2.o.l0(collectionP));
        for (InterfaceC0750L interfaceC0750L2 : collectionP) {
            AbstractC0219i.d("it", interfaceC0750L2);
            arrayList.add(v(interfaceC0750L2));
        }
        return (InterfaceC0750L) P2.m.J0(P2.m.O0(P2.m.Q0(arrayList)));
    }

    @Override // X3.o, X3.p
    public final InterfaceC0763g g(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        AbstractC0219i.e("location", enumC0915b);
        return null;
    }

    @Override // C3.D
    public final Set h(X3.f fVar, X3.k kVar) {
        AbstractC0219i.e("kindFilter", fVar);
        return P2.w.f2165d;
    }

    @Override // C3.D
    public final Set i(X3.f fVar, X3.k kVar) {
        AbstractC0219i.e("kindFilter", fVar);
        Set setQ0 = P2.m.Q0(((InterfaceC0011c) this.f360e.a()).d());
        k kVar2 = this.f374o;
        H hJ = V1.a.J(kVar2);
        Set setA = hJ != null ? hJ.a() : null;
        if (setA == null) {
            setA = P2.w.f2165d;
        }
        setQ0.addAll(setA);
        if (this.n.f9258a.isEnum()) {
            setQ0.addAll(P2.n.h0(m3.n.f8144c, m3.n.f8142a));
        }
        B3.g gVar = this.f357b;
        ((V3.a) ((B3.b) gVar.f255e).f244x).getClass();
        AbstractC0219i.e("_context_receiver_0", gVar);
        AbstractC0219i.e("thisDescriptor", kVar2);
        setQ0.addAll(new ArrayList());
        return setQ0;
    }

    @Override // C3.D
    public final void j(N3.f fVar, ArrayList arrayList) {
        AbstractC0219i.e("name", fVar);
        B3.g gVar = this.f357b;
        V3.a aVar = (V3.a) ((B3.b) gVar.f255e).f244x;
        k kVar = this.f374o;
        aVar.getClass();
        AbstractC0219i.e("_context_receiver_0", gVar);
        AbstractC0219i.e("thisDescriptor", kVar);
        AbstractC0219i.e("name", fVar);
    }

    @Override // C3.D
    public final InterfaceC0011c k() {
        return new C0009a(this.n, l.f418g);
    }

    @Override // C3.D
    public final void m(LinkedHashSet linkedHashSet, N3.f fVar) {
        AbstractC0219i.e("name", fVar);
        k kVar = this.f374o;
        H hJ = V1.a.J(kVar);
        Collection collectionR0 = hJ == null ? P2.w.f2165d : P2.m.R0(hJ.e(fVar, EnumC0915b.f9318h));
        B3.b bVar = (B3.b) this.f357b.f255e;
        linkedHashSet.addAll(r2.d.k(fVar, collectionR0, linkedHashSet, this.f374o, bVar.f, bVar.f241u.f6756d));
        if (this.n.f9258a.isEnum()) {
            if (fVar.equals(m3.n.f8144c)) {
                linkedHashSet.add(Q3.q.i(kVar));
            } else if (fVar.equals(m3.n.f8142a)) {
                linkedHashSet.add(Q3.q.j(kVar));
            }
        }
    }

    @Override // C3.I, C3.D
    public final void n(N3.f fVar, ArrayList arrayList) {
        AbstractC0219i.e("name", fVar);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        F f = new F(fVar, 0);
        k kVar = this.f374o;
        n4.k.e(g3.y.N(kVar), E.f367d, new G(kVar, linkedHashSet, f));
        boolean zIsEmpty = arrayList.isEmpty();
        B3.g gVar = this.f357b;
        if (zIsEmpty) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                InterfaceC0750L interfaceC0750LV = v((InterfaceC0750L) obj);
                Object arrayList2 = linkedHashMap.get(interfaceC0750LV);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(interfaceC0750LV, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) ((Map.Entry) it.next()).getValue();
                B3.b bVar = (B3.b) gVar.f255e;
                P2.s.n0(arrayList3, r2.d.k(fVar, collection, arrayList, this.f374o, bVar.f, bVar.f241u.f6756d));
            }
            arrayList.addAll(arrayList3);
        } else {
            B3.b bVar2 = (B3.b) gVar.f255e;
            arrayList.addAll(r2.d.k(fVar, linkedHashSet, arrayList, this.f374o, bVar2.f, bVar2.f241u.f6756d));
        }
        if (this.n.f9258a.isEnum() && fVar.equals(m3.n.f8143b)) {
            n4.k.a(arrayList, Q3.q.h(kVar));
        }
    }

    @Override // C3.D
    public final Set o(X3.f fVar) {
        AbstractC0219i.e("kindFilter", fVar);
        Set setQ0 = P2.m.Q0(((InterfaceC0011c) this.f360e.a()).c());
        l lVar = l.f419h;
        k kVar = this.f374o;
        n4.k.e(g3.y.N(kVar), E.f367d, new G(kVar, setQ0, lVar));
        if (this.n.f9258a.isEnum()) {
            setQ0.add(m3.n.f8143b);
        }
        return setQ0;
    }

    @Override // C3.D
    public final InterfaceC0766j q() {
        return this.f374o;
    }
}
