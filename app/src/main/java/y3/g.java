package y3;

import b3.AbstractC0219i;
import com.idm.core.dd.IDMDDConstants;
import com.samsung.android.lib.episode.EternalContract;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f9407a;

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f9408b;

    /* renamed from: c, reason: collision with root package name */
    public static final Set f9409c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f9410d;

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.util.Map] */
    static {
        N3.e eVar = m3.m.f8126j;
        N3.c cVarG = eVar.b(N3.f.e("name")).g();
        AbstractC0219i.d("child(Name.identifier(name)).toSafe()", cVarG);
        O2.f fVar = new O2.f(cVarG, N3.f.e("name"));
        N3.c cVarG2 = eVar.b(N3.f.e("ordinal")).g();
        AbstractC0219i.d("child(Name.identifier(name)).toSafe()", cVarG2);
        O2.f fVar2 = new O2.f(cVarG2, N3.f.e("ordinal"));
        O2.f fVar3 = new O2.f(m3.m.f8091B.c(N3.f.e(IDMDDConstants.tagSize)), N3.f.e(IDMDDConstants.tagSize));
        N3.c cVar = m3.m.f8094F;
        O2.f fVar4 = new O2.f(cVar.c(N3.f.e(IDMDDConstants.tagSize)), N3.f.e(IDMDDConstants.tagSize));
        N3.c cVarG3 = m3.m.f8122e.b(N3.f.e("length")).g();
        AbstractC0219i.d("child(Name.identifier(name)).toSafe()", cVarG3);
        Map mapI0 = P2.z.i0(fVar, fVar2, fVar3, fVar4, new O2.f(cVarG3, N3.f.e("length")), new O2.f(cVar.c(N3.f.e("keys")), N3.f.e("keySet")), new O2.f(cVar.c(N3.f.e("values")), N3.f.e("values")), new O2.f(cVar.c(N3.f.e(EternalContract.EXTRA_ENTRIES)), N3.f.e("entrySet")));
        f9407a = mapI0;
        Set<Map.Entry> setEntrySet = mapI0.entrySet();
        ArrayList arrayList = new ArrayList(P2.o.l0(setEntrySet));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new O2.f(((N3.c) entry.getKey()).f(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            O2.f fVar5 = (O2.f) it.next();
            N3.f fVar6 = (N3.f) fVar5.f2007e;
            Object arrayList2 = linkedHashMap.get(fVar6);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(fVar6, arrayList2);
            }
            ((List) arrayList2).add((N3.f) fVar5.f2006d);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(P2.z.g0(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Iterable iterable = (Iterable) entry2.getValue();
            AbstractC0219i.e("<this>", iterable);
            linkedHashMap2.put(key, P2.m.O0(P2.m.Q0(iterable)));
        }
        f9408b = linkedHashMap2;
        Set setKeySet = f9407a.keySet();
        f9409c = setKeySet;
        ArrayList arrayList3 = new ArrayList(P2.o.l0(setKeySet));
        Iterator it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((N3.c) it2.next()).f());
        }
        f9410d = P2.m.R0(arrayList3);
    }
}
