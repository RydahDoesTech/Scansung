package C3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import v3.C0889A;

/* renamed from: C3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0009a implements InterfaceC0011c {

    /* renamed from: a, reason: collision with root package name */
    public final v3.o f376a;

    /* renamed from: b, reason: collision with root package name */
    public final b3.k f377b;

    /* renamed from: c, reason: collision with root package name */
    public final B3.d f378c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f379d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f380e;
    public final LinkedHashMap f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [a3.b, b3.k] */
    /* JADX WARN: Type inference failed for: r6v6, types: [a3.b, b3.k] */
    public C0009a(v3.o oVar, InterfaceC0107b interfaceC0107b) {
        AbstractC0219i.e("jClass", oVar);
        this.f376a = oVar;
        this.f377b = (b3.k) interfaceC0107b;
        B3.d dVar = new B3.d(2, this);
        this.f378c = dVar;
        o4.f fVar = new o4.f(P2.m.p0(oVar.c()), true, dVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        o4.e eVar = new o4.e(fVar);
        while (eVar.hasNext()) {
            Object next = eVar.next();
            N3.f fVarB = ((v3.x) next).b();
            Object arrayList = linkedHashMap.get(fVarB);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(fVarB, arrayList);
            }
            ((List) arrayList).add(next);
        }
        this.f379d = linkedHashMap;
        o4.f fVar2 = new o4.f(P2.m.p0(this.f376a.a()), true, this.f377b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        o4.e eVar2 = new o4.e(fVar2);
        while (eVar2.hasNext()) {
            Object next2 = eVar2.next();
            linkedHashMap2.put(((v3.u) next2).b(), next2);
        }
        this.f380e = linkedHashMap2;
        ArrayList arrayListD = this.f376a.d();
        ?? r6 = this.f377b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayListD.iterator();
        while (it.hasNext()) {
            Object next3 = it.next();
            if (((Boolean) r6.d(next3)).booleanValue()) {
                arrayList2.add(next3);
            }
        }
        int iG0 = P2.z.g0(P2.o.l0(arrayList2));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iG0 < 16 ? 16 : iG0);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next4 = it2.next();
            linkedHashMap3.put(((C0889A) next4).b(), next4);
        }
        this.f = linkedHashMap3;
    }

    @Override // C3.InterfaceC0011c
    public final C0889A a(N3.f fVar) {
        AbstractC0219i.e("name", fVar);
        return (C0889A) this.f.get(fVar);
    }

    @Override // C3.InterfaceC0011c
    public final Set b() {
        return this.f.keySet();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [a3.b, b3.k] */
    @Override // C3.InterfaceC0011c
    public final Set c() {
        o4.f fVar = new o4.f(P2.m.p0(this.f376a.a()), true, this.f377b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        o4.e eVar = new o4.e(fVar);
        while (eVar.hasNext()) {
            linkedHashSet.add(((v3.u) eVar.next()).b());
        }
        return linkedHashSet;
    }

    @Override // C3.InterfaceC0011c
    public final Set d() {
        o4.f fVar = new o4.f(P2.m.p0(this.f376a.c()), true, this.f378c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        o4.e eVar = new o4.e(fVar);
        while (eVar.hasNext()) {
            linkedHashSet.add(((v3.x) eVar.next()).b());
        }
        return linkedHashSet;
    }

    @Override // C3.InterfaceC0011c
    public final v3.u e(N3.f fVar) {
        AbstractC0219i.e("name", fVar);
        return (v3.u) this.f380e.get(fVar);
    }

    @Override // C3.InterfaceC0011c
    public final Collection f(N3.f fVar) {
        AbstractC0219i.e("name", fVar);
        List list = (List) this.f379d.get(fVar);
        return list != null ? list : P2.u.f2163d;
    }
}
