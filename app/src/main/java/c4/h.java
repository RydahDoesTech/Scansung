package c4;

import I3.C0028j;
import I3.C0030l;
import I3.Q;
import a3.InterfaceC0106a;
import b3.AbstractC0219i;
import e1.AbstractC0415a;
import e4.AbstractC0442z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p3.AbstractC0771o;
import p3.AbstractC0779w;
import p3.C0770n;
import p3.C0777u;
import p3.C0782z;
import p3.InterfaceC0742D;
import p3.InterfaceC0752N;
import p3.InterfaceC0761e;
import p3.InterfaceC0763g;
import p3.InterfaceC0766j;
import q3.C0797g;
import s3.C0843T;
import s3.C0855k;
import x3.EnumC0915b;

/* loaded from: classes.dex */
public final class h extends b3.k implements InterfaceC0106a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f5158e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, int i5) {
        super(0);
        this.f5157d = i5;
        this.f5158e = iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v48, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v52, types: [java.util.ArrayList] */
    @Override // a3.InterfaceC0106a
    public final Object a() {
        Object next;
        C0770n c0770n;
        Object c0777u;
        AbstractC0442z abstractC0442zH0;
        ?? arrayList;
        int i5 = 1;
        i iVar = this.f5158e;
        switch (this.f5157d) {
            case 0:
                return AbstractC0779w.c(iVar);
            case 1:
                return P2.m.O0(((a4.i) iVar.f5165o.f3058d).f3041e.g(iVar.f5175y));
            case 2:
                C0028j c0028j = iVar.f5159h;
                if (!((c0028j.f & 4) == 4)) {
                    return null;
                }
                InterfaceC0763g interfaceC0763gG = iVar.s0().g(AbstractC0415a.x((K3.f) iVar.f5165o.f3059e, c0028j.f1290i), EnumC0915b.f9320j);
                if (interfaceC0763gG instanceof InterfaceC0761e) {
                    return (InterfaceC0761e) interfaceC0763gG;
                }
                return null;
            case 3:
                List list = iVar.f5159h.f1299s;
                AbstractC0219i.d("classProto.constructorList", list);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (K3.e.f1683m.c(((C0030l) obj).f1314g).booleanValue()) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(P2.o.l0(arrayList2));
                Iterator it = arrayList2.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    a4.k kVar = iVar.f5165o;
                    if (!zHasNext) {
                        return P2.m.G0(P2.m.G0(arrayList3, P2.n.i0(iVar.V())), ((a4.i) kVar.f3058d).n.d(iVar));
                    }
                    C0030l c0030l = (C0030l) it.next();
                    a4.s sVar = (a4.s) kVar.f3065l;
                    AbstractC0219i.d("it", c0030l);
                    arrayList3.add(sVar.d(c0030l, false));
                }
            case 4:
                i iVar2 = this.f5158e;
                if (!g4.f.a(iVar2.n)) {
                    List list2 = iVar2.f5159h.f1299s;
                    AbstractC0219i.d("classProto.constructorList", list2);
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (!K3.e.f1683m.c(((C0030l) next).f1314g).booleanValue()) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    C0030l c0030l2 = (C0030l) next;
                    return c0030l2 != null ? ((a4.s) iVar2.f5165o.f3065l).d(c0030l2, true) : null;
                }
                Q3.e eVar = new Q3.e(iVar2, null, C0797g.f8481a, true, 1, InterfaceC0752N.f8400b);
                List listEmptyList = Collections.emptyList();
                int i6 = Q3.f.f2341a;
                int i7 = iVar2.n;
                if (i7 == 3 || g4.f.a(i7)) {
                    c0770n = AbstractC0771o.f8419a;
                    if (c0770n == null) {
                        Q3.f.a(49);
                        throw null;
                    }
                } else if (Q3.f.r(iVar2)) {
                    c0770n = AbstractC0771o.f8419a;
                    if (c0770n == null) {
                        Q3.f.a(51);
                        throw null;
                    }
                } else if (Q3.f.l(iVar2)) {
                    c0770n = AbstractC0771o.f8427j;
                    if (c0770n == null) {
                        Q3.f.a(52);
                        throw null;
                    }
                } else {
                    c0770n = AbstractC0771o.f8423e;
                    if (c0770n == null) {
                        Q3.f.a(53);
                        throw null;
                    }
                }
                eVar.c1(listEmptyList, c0770n);
                eVar.f8879j = iVar2.q();
                return eVar;
            case 5:
                P2.u uVar = P2.u.f2163d;
                if (iVar.f5163l != 2) {
                    return uVar;
                }
                List<Integer> list3 = iVar.f5159h.f1304x;
                AbstractC0219i.d("fqNames", list3);
                if (list3.isEmpty()) {
                    if (iVar.f5163l != 2) {
                        return uVar;
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    InterfaceC0766j interfaceC0766j = iVar.f5170t;
                    if (interfaceC0766j instanceof InterfaceC0742D) {
                        Q3.q.c(iVar, linkedHashSet, ((InterfaceC0742D) interfaceC0766j).p0(), false);
                    }
                    Q3.q.c(iVar, linkedHashSet, iVar.R(), true);
                    return P2.m.M0(linkedHashSet, new Q3.k(i5));
                }
                ArrayList arrayList4 = new ArrayList();
                for (Integer num : list3) {
                    a4.k kVar2 = iVar.f5165o;
                    a4.i iVar3 = (a4.i) kVar2.f3058d;
                    AbstractC0219i.d("index", num);
                    InterfaceC0761e interfaceC0761eB = iVar3.b(AbstractC0415a.m((K3.f) kVar2.f3059e, num.intValue()));
                    if (interfaceC0761eB != null) {
                        arrayList4.add(interfaceC0761eB);
                    }
                }
                return arrayList4;
            default:
                if (!iVar.j() && !iVar.v()) {
                    return null;
                }
                a4.k kVar3 = iVar.f5165o;
                K3.f fVar = (K3.f) kVar3.f3059e;
                C0028j c0028j2 = iVar.f5159h;
                AbstractC0219i.e("<this>", c0028j2);
                AbstractC0219i.e("nameResolver", fVar);
                K3.g gVar = (K3.g) kVar3.f3060g;
                AbstractC0219i.e("typeTable", gVar);
                int size = c0028j2.f1278C.size();
                G3.c cVar = (G3.c) kVar3.f3064k;
                if (size > 0) {
                    List<Integer> list4 = c0028j2.f1278C;
                    AbstractC0219i.d("multiFieldValueClassUnderlyingNameList", list4);
                    ArrayList arrayList5 = new ArrayList(P2.o.l0(list4));
                    for (Integer num2 : list4) {
                        AbstractC0219i.d("it", num2);
                        arrayList5.add(AbstractC0415a.x(fVar, num2.intValue()));
                    }
                    O2.f fVar2 = new O2.f(Integer.valueOf(c0028j2.f1280F.size()), Integer.valueOf(c0028j2.E.size()));
                    if (fVar2.equals(new O2.f(Integer.valueOf(arrayList5.size()), 0))) {
                        List<Integer> list5 = c0028j2.f1280F;
                        AbstractC0219i.d("multiFieldValueClassUnderlyingTypeIdList", list5);
                        arrayList = new ArrayList(P2.o.l0(list5));
                        for (Integer num3 : list5) {
                            AbstractC0219i.d("it", num3);
                            arrayList.add(gVar.a(num3.intValue()));
                        }
                    } else {
                        if (!fVar2.equals(new O2.f(0, Integer.valueOf(arrayList5.size())))) {
                            throw new IllegalStateException(("class " + AbstractC0415a.x(fVar, c0028j2.f1289h) + " has illegal multi-field value class representation").toString());
                        }
                        arrayList = c0028j2.E;
                    }
                    AbstractC0219i.d("when (typeIdCount to typ…epresentation\")\n        }", arrayList);
                    ArrayList arrayList6 = new ArrayList(P2.o.l0(arrayList));
                    for (Q q5 : arrayList) {
                        AbstractC0219i.e("p0", q5);
                        arrayList6.add(cVar.d(q5, true));
                    }
                    c0777u = new C0782z(P2.m.T0(arrayList5, arrayList6));
                } else if ((c0028j2.f & 8) == 8) {
                    N3.f fVarX = AbstractC0415a.x(fVar, c0028j2.f1306z);
                    int i8 = c0028j2.f;
                    Q qA = (i8 & 16) == 16 ? c0028j2.f1276A : (i8 & 32) == 32 ? gVar.a(c0028j2.f1277B) : null;
                    if ((qA == null || (abstractC0442zH0 = cVar.d(qA, true)) == null) && (abstractC0442zH0 = iVar.H0(fVarX)) == null) {
                        throw new IllegalStateException(("cannot determine underlying type for value class " + AbstractC0415a.x(fVar, c0028j2.f1289h) + " with property " + fVarX).toString());
                    }
                    c0777u = new C0777u(fVarX, abstractC0442zH0);
                } else {
                    c0777u = null;
                }
                if (c0777u != null) {
                    return c0777u;
                }
                if (iVar.f5160i.a(1, 5, 1)) {
                    return null;
                }
                C0855k c0855kV = iVar.V();
                if (c0855kV == null) {
                    throw new IllegalStateException(("Inline class has no primary constructor: " + iVar).toString());
                }
                List listV0 = c0855kV.v0();
                AbstractC0219i.d("constructor.valueParameters", listV0);
                N3.f name = ((C0843T) P2.m.u0(listV0)).getName();
                AbstractC0219i.d("constructor.valueParameters.first().name", name);
                AbstractC0442z abstractC0442zH02 = iVar.H0(name);
                if (abstractC0442zH02 != null) {
                    return new C0777u(name, abstractC0442zH02);
                }
                throw new IllegalStateException(("Value class has no underlying property: " + iVar).toString());
        }
    }
}
