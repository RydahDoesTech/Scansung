package c4;

import I3.C0042y;
import I3.G;
import I3.T;
import O3.AbstractC0070b;
import P2.z;
import b3.AbstractC0219i;
import e1.AbstractC0415a;
import g3.InterfaceC0466p;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import x3.EnumC0915b;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0466p[] f5181j;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f5182a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f5183b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f5184c;

    /* renamed from: d, reason: collision with root package name */
    public final d4.e f5185d;

    /* renamed from: e, reason: collision with root package name */
    public final d4.e f5186e;
    public final d4.j f;

    /* renamed from: g, reason: collision with root package name */
    public final d4.i f5187g;

    /* renamed from: h, reason: collision with root package name */
    public final d4.i f5188h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o f5189i;

    static {
        b3.r rVar = b3.q.f5100a;
        f5181j = new InterfaceC0466p[]{rVar.e(new b3.n(rVar.b(n.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), rVar.e(new b3.n(rVar.b(n.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};
    }

    public n(o oVar, List list, List list2, List list3) {
        AbstractC0219i.e("functionList", list);
        AbstractC0219i.e("propertyList", list2);
        AbstractC0219i.e("typeAliasList", list3);
        this.f5189i = oVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            N3.f fVarX = AbstractC0415a.x((K3.f) oVar.f5190b.f3059e, ((C0042y) ((AbstractC0070b) obj)).f1396i);
            Object arrayList = linkedHashMap.get(fVarX);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(fVarX, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f5182a = c(linkedHashMap);
        o oVar2 = this.f5189i;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : list2) {
            N3.f fVarX2 = AbstractC0415a.x((K3.f) oVar2.f5190b.f3059e, ((G) ((AbstractC0070b) obj2)).f1003i);
            Object arrayList2 = linkedHashMap2.get(fVarX2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap2.put(fVarX2, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        this.f5183b = c(linkedHashMap2);
        ((a4.i) this.f5189i.f5190b.f3058d).f3039c.getClass();
        o oVar3 = this.f5189i;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object obj3 : list3) {
            N3.f fVarX3 = AbstractC0415a.x((K3.f) oVar3.f5190b.f3059e, ((T) ((AbstractC0070b) obj3)).f1103h);
            Object arrayList3 = linkedHashMap3.get(fVarX3);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap3.put(fVarX3, arrayList3);
            }
            ((List) arrayList3).add(obj3);
        }
        this.f5184c = c(linkedHashMap3);
        this.f5185d = ((d4.l) ((a4.i) this.f5189i.f5190b.f3058d).f3037a).b(new m(this, 0));
        this.f5186e = ((d4.l) ((a4.i) this.f5189i.f5190b.f3058d).f3037a).b(new m(this, 1));
        this.f = ((d4.l) ((a4.i) this.f5189i.f5190b.f3058d).f3037a).c(new m(this, 2));
        o oVar4 = this.f5189i;
        d4.o oVar5 = ((a4.i) oVar4.f5190b.f3058d).f3037a;
        l lVar = new l(this, oVar4, 0);
        d4.l lVar2 = (d4.l) oVar5;
        lVar2.getClass();
        this.f5187g = new d4.i(lVar2, lVar);
        o oVar6 = this.f5189i;
        d4.o oVar7 = ((a4.i) oVar6.f5190b.f3058d).f3037a;
        l lVar3 = new l(this, oVar6, 1);
        d4.l lVar4 = (d4.l) oVar7;
        lVar4.getClass();
        this.f5188h = new d4.i(lVar4, lVar3);
    }

    public static LinkedHashMap c(LinkedHashMap linkedHashMap) throws IOException {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(z.g0(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable<AbstractC0070b> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(P2.o.l0(iterable));
            for (AbstractC0070b abstractC0070b : iterable) {
                int iC = abstractC0070b.c();
                int iF = A1.j.f(iC) + iC;
                if (iF > 4096) {
                    iF = 4096;
                }
                A1.j jVarJ = A1.j.j(byteArrayOutputStream, iF);
                jVarJ.v(iC);
                abstractC0070b.f(jVarJ);
                jVarJ.i();
                arrayList.add(O2.l.f2016a);
            }
            linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap2;
    }

    public final Collection a(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        return !((Set) V1.a.Q(this.f5187g, f5181j[0])).contains(fVar) ? P2.u.f2163d : (Collection) this.f5185d.d(fVar);
    }

    public final Collection b(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        return !((Set) V1.a.Q(this.f5188h, f5181j[1])).contains(fVar) ? P2.u.f2163d : (Collection) this.f5186e.d(fVar);
    }
}
