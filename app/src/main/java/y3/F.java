package y3;

import b3.AbstractC0219i;
import com.samsung.android.fotaagent.common.feature.CarrierFeature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f9373a;

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f9374b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f9375c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f9376d;

    /* renamed from: e, reason: collision with root package name */
    public static final Set f9377e;
    public static final Set f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0929C f9378g;

    /* renamed from: h, reason: collision with root package name */
    public static final Object f9379h;

    /* renamed from: i, reason: collision with root package name */
    public static final LinkedHashMap f9380i;

    /* renamed from: j, reason: collision with root package name */
    public static final ArrayList f9381j;

    /* renamed from: k, reason: collision with root package name */
    public static final LinkedHashMap f9382k;

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, java.util.Map] */
    static {
        Set<String> setU0 = P2.B.u0("containsAll", "removeAll", "retainAll");
        ArrayList arrayList = new ArrayList(P2.o.l0(setU0));
        for (String str : setU0) {
            String strC = V3.c.BOOLEAN.c();
            AbstractC0219i.d("BOOLEAN.desc", strC);
            arrayList.add(m.a("java/util/Collection", str, "Ljava/util/Collection;", strC));
        }
        f9373a = arrayList;
        ArrayList arrayList2 = new ArrayList(P2.o.l0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C0929C) it.next()).f9367b);
        }
        f9374b = arrayList2;
        ArrayList arrayList3 = f9373a;
        ArrayList arrayList4 = new ArrayList(P2.o.l0(arrayList3));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((C0929C) it2.next()).f9366a.b());
        }
        String strConcat = "java/util/".concat("Collection");
        V3.c cVar = V3.c.BOOLEAN;
        String strC2 = cVar.c();
        AbstractC0219i.d("BOOLEAN.desc", strC2);
        C0929C c0929cA = m.a(strConcat, "contains", "Ljava/lang/Object;", strC2);
        EnumC0931E enumC0931E = EnumC0931E.f9369g;
        O2.f fVar = new O2.f(c0929cA, enumC0931E);
        String strConcat2 = "java/util/".concat("Collection");
        String strC3 = cVar.c();
        AbstractC0219i.d("BOOLEAN.desc", strC3);
        O2.f fVar2 = new O2.f(m.a(strConcat2, CarrierFeature.VALUE_AUTO_DOWNLOAD_REMOVE, "Ljava/lang/Object;", strC3), enumC0931E);
        String strConcat3 = "java/util/".concat("Map");
        String strC4 = cVar.c();
        AbstractC0219i.d("BOOLEAN.desc", strC4);
        O2.f fVar3 = new O2.f(m.a(strConcat3, "containsKey", "Ljava/lang/Object;", strC4), enumC0931E);
        String strConcat4 = "java/util/".concat("Map");
        String strC5 = cVar.c();
        AbstractC0219i.d("BOOLEAN.desc", strC5);
        O2.f fVar4 = new O2.f(m.a(strConcat4, "containsValue", "Ljava/lang/Object;", strC5), enumC0931E);
        String strConcat5 = "java/util/".concat("Map");
        String strC6 = cVar.c();
        AbstractC0219i.d("BOOLEAN.desc", strC6);
        O2.f fVar5 = new O2.f(m.a(strConcat5, CarrierFeature.VALUE_AUTO_DOWNLOAD_REMOVE, "Ljava/lang/Object;Ljava/lang/Object;", strC6), enumC0931E);
        O2.f fVar6 = new O2.f(m.a("java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), EnumC0931E.f9370h);
        C0929C c0929cA2 = m.a("java/util/".concat("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        EnumC0931E enumC0931E2 = EnumC0931E.f9368e;
        O2.f fVar7 = new O2.f(c0929cA2, enumC0931E2);
        O2.f fVar8 = new O2.f(m.a("java/util/".concat("Map"), CarrierFeature.VALUE_AUTO_DOWNLOAD_REMOVE, "Ljava/lang/Object;", "Ljava/lang/Object;"), enumC0931E2);
        String strConcat6 = "java/util/".concat("List");
        V3.c cVar2 = V3.c.INT;
        String strC7 = cVar2.c();
        AbstractC0219i.d("INT.desc", strC7);
        C0929C c0929cA3 = m.a(strConcat6, "indexOf", "Ljava/lang/Object;", strC7);
        EnumC0931E enumC0931E3 = EnumC0931E.f;
        O2.f fVar9 = new O2.f(c0929cA3, enumC0931E3);
        String strConcat7 = "java/util/".concat("List");
        String strC8 = cVar2.c();
        AbstractC0219i.d("INT.desc", strC8);
        Map mapI0 = P2.z.i0(fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, new O2.f(m.a(strConcat7, "lastIndexOf", "Ljava/lang/Object;", strC8), enumC0931E3));
        f9375c = mapI0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(P2.z.g0(mapI0.size()));
        for (Map.Entry entry : mapI0.entrySet()) {
            linkedHashMap.put(((C0929C) entry.getKey()).f9367b, entry.getValue());
        }
        f9376d = linkedHashMap;
        LinkedHashSet linkedHashSetT0 = P2.B.t0(f9375c.keySet(), f9373a);
        ArrayList arrayList5 = new ArrayList(P2.o.l0(linkedHashSetT0));
        Iterator it3 = linkedHashSetT0.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((C0929C) it3.next()).f9366a);
        }
        f9377e = P2.m.R0(arrayList5);
        ArrayList arrayList6 = new ArrayList(P2.o.l0(linkedHashSetT0));
        Iterator it4 = linkedHashSetT0.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((C0929C) it4.next()).f9367b);
        }
        f = P2.m.R0(arrayList6);
        V3.c cVar3 = V3.c.INT;
        String strC9 = cVar3.c();
        AbstractC0219i.d("INT.desc", strC9);
        C0929C c0929cA4 = m.a("java/util/List", "removeAt", strC9, "Ljava/lang/Object;");
        f9378g = c0929cA4;
        String strConcat8 = "java/lang/".concat("Number");
        String strC10 = V3.c.BYTE.c();
        AbstractC0219i.d("BYTE.desc", strC10);
        O2.f fVar10 = new O2.f(m.a(strConcat8, "toByte", "", strC10), N3.f.e("byteValue"));
        String strConcat9 = "java/lang/".concat("Number");
        String strC11 = V3.c.SHORT.c();
        AbstractC0219i.d("SHORT.desc", strC11);
        O2.f fVar11 = new O2.f(m.a(strConcat9, "toShort", "", strC11), N3.f.e("shortValue"));
        String strConcat10 = "java/lang/".concat("Number");
        String strC12 = cVar3.c();
        AbstractC0219i.d("INT.desc", strC12);
        O2.f fVar12 = new O2.f(m.a(strConcat10, "toInt", "", strC12), N3.f.e("intValue"));
        String strConcat11 = "java/lang/".concat("Number");
        String strC13 = V3.c.LONG.c();
        AbstractC0219i.d("LONG.desc", strC13);
        O2.f fVar13 = new O2.f(m.a(strConcat11, "toLong", "", strC13), N3.f.e("longValue"));
        String strConcat12 = "java/lang/".concat("Number");
        String strC14 = V3.c.FLOAT.c();
        AbstractC0219i.d("FLOAT.desc", strC14);
        O2.f fVar14 = new O2.f(m.a(strConcat12, "toFloat", "", strC14), N3.f.e("floatValue"));
        String strConcat13 = "java/lang/".concat("Number");
        String strC15 = V3.c.DOUBLE.c();
        AbstractC0219i.d("DOUBLE.desc", strC15);
        O2.f fVar15 = new O2.f(m.a(strConcat13, "toDouble", "", strC15), N3.f.e("doubleValue"));
        O2.f fVar16 = new O2.f(c0929cA4, N3.f.e(CarrierFeature.VALUE_AUTO_DOWNLOAD_REMOVE));
        String strConcat14 = "java/lang/".concat("CharSequence");
        String strC16 = cVar3.c();
        AbstractC0219i.d("INT.desc", strC16);
        String strC17 = V3.c.CHAR.c();
        AbstractC0219i.d("CHAR.desc", strC17);
        Map mapI02 = P2.z.i0(fVar10, fVar11, fVar12, fVar13, fVar14, fVar15, fVar16, new O2.f(m.a(strConcat14, "get", strC16, strC17), N3.f.e("charAt")));
        f9379h = mapI02;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(P2.z.g0(mapI02.size()));
        for (Map.Entry entry2 : mapI02.entrySet()) {
            linkedHashMap2.put(((C0929C) entry2.getKey()).f9367b, entry2.getValue());
        }
        f9380i = linkedHashMap2;
        Set setKeySet = f9379h.keySet();
        ArrayList arrayList7 = new ArrayList(P2.o.l0(setKeySet));
        Iterator it5 = setKeySet.iterator();
        while (it5.hasNext()) {
            arrayList7.add(((C0929C) it5.next()).f9366a);
        }
        f9381j = arrayList7;
        Set<Map.Entry> setEntrySet = f9379h.entrySet();
        ArrayList arrayList8 = new ArrayList(P2.o.l0(setEntrySet));
        for (Map.Entry entry3 : setEntrySet) {
            arrayList8.add(new O2.f(((C0929C) entry3.getKey()).f9366a, entry3.getValue()));
        }
        int iG0 = P2.z.g0(P2.o.l0(arrayList8));
        if (iG0 < 16) {
            iG0 = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iG0);
        Iterator it6 = arrayList8.iterator();
        while (it6.hasNext()) {
            O2.f fVar17 = (O2.f) it6.next();
            linkedHashMap3.put((N3.f) fVar17.f2007e, (N3.f) fVar17.f2006d);
        }
        f9382k = linkedHashMap3;
    }
}
