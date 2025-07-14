package c4;

import I3.C0028j;
import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import e1.AbstractC0415a;
import e4.AbstractC0438v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p3.InterfaceC0761e;
import p3.InterfaceC0763g;
import x3.EnumC0915b;

/* loaded from: classes.dex */
public final class g extends o {

    /* renamed from: g, reason: collision with root package name */
    public final f4.f f5153g;

    /* renamed from: h, reason: collision with root package name */
    public final d4.i f5154h;

    /* renamed from: i, reason: collision with root package name */
    public final d4.i f5155i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f5156j;

    public g(i iVar, f4.f fVar) {
        AbstractC0219i.e("kotlinTypeRefiner", fVar);
        this.f5156j = iVar;
        a4.k kVar = iVar.f5165o;
        C0028j c0028j = iVar.f5159h;
        List list = c0028j.f1300t;
        AbstractC0219i.d("classProto.functionList", list);
        List list2 = c0028j.f1301u;
        AbstractC0219i.d("classProto.propertyList", list2);
        List list3 = c0028j.f1302v;
        AbstractC0219i.d("classProto.typeAliasList", list3);
        List list4 = c0028j.n;
        AbstractC0219i.d("classProto.nestedClassNameList", list4);
        K3.f fVar2 = (K3.f) iVar.f5165o.f3059e;
        ArrayList arrayList = new ArrayList(P2.o.l0(list4));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC0415a.x(fVar2, ((Number) it.next()).intValue()));
        }
        super(kVar, list, list2, list3, new d(arrayList, 0));
        this.f5153g = fVar;
        a4.i iVar2 = (a4.i) kVar.f3058d;
        d4.o oVar = iVar2.f3037a;
        e eVar = new e(this, 0);
        d4.l lVar = (d4.l) oVar;
        lVar.getClass();
        this.f5154h = new d4.i(lVar, eVar);
        d4.o oVar2 = iVar2.f3037a;
        e eVar2 = new e(this, 1);
        d4.l lVar2 = (d4.l) oVar2;
        lVar2.getClass();
        this.f5155i = new d4.i(lVar2, eVar2);
    }

    @Override // c4.o, X3.o, X3.n
    public final Collection c(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        s(fVar, enumC0915b);
        return super.c(fVar, enumC0915b);
    }

    @Override // X3.o, X3.p
    public final Collection d(X3.f fVar, InterfaceC0107b interfaceC0107b) {
        AbstractC0219i.e("kindFilter", fVar);
        AbstractC0219i.e("nameFilter", interfaceC0107b);
        return (Collection) this.f5154h.a();
    }

    @Override // c4.o, X3.o, X3.n
    public final Collection e(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        s(fVar, enumC0915b);
        return super.e(fVar, enumC0915b);
    }

    @Override // c4.o, X3.o, X3.p
    public final InterfaceC0763g g(N3.f fVar, EnumC0915b enumC0915b) {
        InterfaceC0761e interfaceC0761e;
        AbstractC0219i.e("name", fVar);
        AbstractC0219i.e("location", enumC0915b);
        s(fVar, enumC0915b);
        com.google.firebase.messaging.q qVar = this.f5156j.f5169s;
        return (qVar == null || (interfaceC0761e = (InterfaceC0761e) ((d4.j) qVar.f).d(fVar)) == null) ? super.g(fVar, enumC0915b) : interfaceC0761e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v4, types: [P2.u] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    @Override // c4.o
    public final void h(ArrayList arrayList, InterfaceC0107b interfaceC0107b) {
        ?? arrayList2;
        AbstractC0219i.e("nameFilter", interfaceC0107b);
        com.google.firebase.messaging.q qVar = this.f5156j.f5169s;
        if (qVar != null) {
            Set<N3.f> setKeySet = ((LinkedHashMap) qVar.f6168e).keySet();
            arrayList2 = new ArrayList();
            for (N3.f fVar : setKeySet) {
                AbstractC0219i.e("name", fVar);
                InterfaceC0761e interfaceC0761e = (InterfaceC0761e) ((d4.j) qVar.f).d(fVar);
                if (interfaceC0761e != null) {
                    arrayList2.add(interfaceC0761e);
                }
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = P2.u.f2163d;
        }
        arrayList.addAll(arrayList2);
    }

    @Override // c4.o
    public final void j(N3.f fVar, ArrayList arrayList) {
        AbstractC0219i.e("name", fVar);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.f5155i.a()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((AbstractC0438v) it.next()).p0().e(fVar, EnumC0915b.f));
        }
        a4.k kVar = this.f5190b;
        arrayList.addAll(((a4.i) kVar.f3058d).n.a(fVar, this.f5156j));
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((f4.l) ((a4.i) kVar.f3058d).f3051q).f6756d.h(fVar, arrayList2, arrayList3, this.f5156j, new f(arrayList, 0));
    }

    @Override // c4.o
    public final void k(N3.f fVar, ArrayList arrayList) {
        AbstractC0219i.e("name", fVar);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.f5155i.a()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((AbstractC0438v) it.next()).p0().c(fVar, EnumC0915b.f));
        }
        ArrayList arrayList3 = new ArrayList(arrayList);
        ((f4.l) ((a4.i) this.f5190b.f3058d).f3051q).f6756d.h(fVar, arrayList2, arrayList3, this.f5156j, new f(arrayList, 0));
    }

    @Override // c4.o
    public final N3.b l(N3.f fVar) {
        AbstractC0219i.e("name", fVar);
        return this.f5156j.f5162k.d(fVar);
    }

    @Override // c4.o
    public final Set n() {
        List listJ = this.f5156j.f5167q.j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            Set setF = ((AbstractC0438v) it.next()).p0().f();
            if (setF == null) {
                return null;
            }
            P2.s.n0(linkedHashSet, setF);
        }
        return linkedHashSet;
    }

    @Override // c4.o
    public final Set o() {
        i iVar = this.f5156j;
        List listJ = iVar.f5167q.j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            P2.s.n0(linkedHashSet, ((AbstractC0438v) it.next()).p0().a());
        }
        linkedHashSet.addAll(((a4.i) this.f5190b.f3058d).n.c(iVar));
        return linkedHashSet;
    }

    @Override // c4.o
    public final Set p() {
        List listJ = this.f5156j.f5167q.j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            P2.s.n0(linkedHashSet, ((AbstractC0438v) it.next()).p0().b());
        }
        return linkedHashSet;
    }

    @Override // c4.o
    public final boolean r(r rVar) {
        return ((a4.i) this.f5190b.f3058d).f3049o.e(this.f5156j, rVar);
    }

    public final void s(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        AbstractC0219i.e("location", enumC0915b);
        AbstractC0219i.e("<this>", ((a4.i) this.f5190b.f3058d).f3044i);
        AbstractC0219i.e("scopeOwner", this.f5156j);
    }
}
