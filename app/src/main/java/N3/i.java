package N3;

import P2.B;
import P2.o;
import P2.z;
import b3.AbstractC0219i;
import java.util.LinkedHashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final c f1851a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f1852b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f1853c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f1854d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f1855e;
    public static final c f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f1856g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f1857h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f1858i;

    /* renamed from: j, reason: collision with root package name */
    public static final b f1859j;

    /* renamed from: k, reason: collision with root package name */
    public static final b f1860k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f1861l;

    /* renamed from: m, reason: collision with root package name */
    public static final b f1862m;
    public static final b n;

    /* renamed from: o, reason: collision with root package name */
    public static final Set f1863o;

    /* renamed from: p, reason: collision with root package name */
    public static final Set f1864p;

    /* renamed from: q, reason: collision with root package name */
    public static final b f1865q;

    /* renamed from: r, reason: collision with root package name */
    public static final b f1866r;

    /* renamed from: s, reason: collision with root package name */
    public static final b f1867s;

    /* renamed from: t, reason: collision with root package name */
    public static final b f1868t;

    static {
        c cVar = new c("kotlin");
        f1851a = cVar;
        c cVarC = cVar.c(f.e("reflect"));
        f1852b = cVarC;
        c cVarC2 = cVar.c(f.e("collections"));
        f1853c = cVarC2;
        c cVarC3 = cVar.c(f.e("ranges"));
        f1854d = cVarC3;
        cVar.c(f.e("jvm")).c(f.e("internal"));
        c cVarC4 = cVar.c(f.e("annotation"));
        f1855e = cVarC4;
        c cVarC5 = cVar.c(f.e("internal"));
        cVarC5.c(f.e("ir"));
        c cVarC6 = cVar.c(f.e("coroutines"));
        f = cVarC6;
        f1856g = cVar.c(f.e("enums"));
        B.u0(cVar, cVarC2, cVarC3, cVarC4, cVarC, cVarC5, cVarC6);
        j.a("Nothing");
        j.a("Unit");
        j.a("Any");
        j.a("Enum");
        j.a("Annotation");
        f1857h = j.a("Array");
        b bVarA = j.a("Boolean");
        b bVarA2 = j.a("Char");
        b bVarA3 = j.a("Byte");
        b bVarA4 = j.a("Short");
        b bVarA5 = j.a("Int");
        b bVarA6 = j.a("Long");
        b bVarA7 = j.a("Float");
        b bVarA8 = j.a("Double");
        f1858i = j.f(bVarA3);
        f1859j = j.f(bVarA4);
        f1860k = j.f(bVarA5);
        f1861l = j.f(bVarA6);
        j.a("CharSequence");
        f1862m = j.a("String");
        j.a("Throwable");
        j.a("Cloneable");
        j.e("KProperty");
        j.e("KMutableProperty");
        j.e("KProperty0");
        j.e("KMutableProperty0");
        j.e("KProperty1");
        j.e("KMutableProperty1");
        j.e("KProperty2");
        j.e("KMutableProperty2");
        n = j.e("KFunction");
        j.e("KClass");
        j.e("KCallable");
        j.a("Comparable");
        j.a("Number");
        j.a("Function");
        Set setU0 = B.u0(bVarA, bVarA2, bVarA3, bVarA4, bVarA5, bVarA6, bVarA7, bVarA8);
        f1863o = setU0;
        int iG0 = z.g0(o.l0(setU0));
        if (iG0 < 16) {
            iG0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iG0);
        for (Object obj : setU0) {
            f fVarI = ((b) obj).i();
            AbstractC0219i.d("id.shortClassName", fVarI);
            linkedHashMap.put(obj, j.d(fVarI));
        }
        j.c(linkedHashMap);
        Set setU02 = B.u0(f1858i, f1859j, f1860k, f1861l);
        f1864p = setU02;
        int iG02 = z.g0(o.l0(setU02));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iG02 >= 16 ? iG02 : 16);
        for (Object obj2 : setU02) {
            f fVarI2 = ((b) obj2).i();
            AbstractC0219i.d("id.shortClassName", fVarI2);
            linkedHashMap2.put(obj2, j.d(fVarI2));
        }
        j.c(linkedHashMap2);
        B.s0(B.t0(f1863o, f1864p), f1862m);
        c cVar2 = f;
        f fVarE = f.e("Continuation");
        if (cVar2 == null) {
            b.a(3);
            throw null;
        }
        c.j(fVarE);
        j.b("Iterator");
        j.b("Iterable");
        j.b("Collection");
        j.b("List");
        j.b("ListIterator");
        j.b("Set");
        b bVarB = j.b("Map");
        j.b("MutableIterator");
        j.b("CharIterator");
        j.b("MutableIterable");
        j.b("MutableCollection");
        f1865q = j.b("MutableList");
        j.b("MutableListIterator");
        f1866r = j.b("MutableSet");
        b bVarB2 = j.b("MutableMap");
        f1867s = bVarB2;
        bVarB.d(f.e("Entry"));
        bVarB2.d(f.e("MutableEntry"));
        j.a("Result");
        c cVar3 = f1854d;
        f fVarE2 = f.e("IntRange");
        if (cVar3 == null) {
            b.a(3);
            throw null;
        }
        c.j(fVarE2);
        c.j(f.e("LongRange"));
        c.j(f.e("CharRange"));
        c cVar4 = f1855e;
        f fVarE3 = f.e("AnnotationRetention");
        if (cVar4 == null) {
            b.a(3);
            throw null;
        }
        c.j(fVarE3);
        c.j(f.e("AnnotationTarget"));
        f1868t = new b(f1856g, f.e("EnumEntries"));
    }
}
