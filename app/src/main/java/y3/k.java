package y3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f9412a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f9413b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f9412a = linkedHashMap;
        b(N3.i.f1865q, a("java.util.ArrayList", "java.util.LinkedList"));
        b(N3.i.f1866r, a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b(N3.i.f1867s, a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        b(N3.b.j(new N3.c("java.util.function.Function")), a("java.util.function.UnaryOperator"));
        b(N3.b.j(new N3.c("java.util.function.BiFunction")), a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new O2.f(((N3.b) entry.getKey()).b(), ((N3.b) entry.getValue()).b()));
        }
        f9413b = P2.z.k0(arrayList);
    }

    public static ArrayList a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(N3.b.j(new N3.c(str)));
        }
        return arrayList;
    }

    public static void b(N3.b bVar, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            f9412a.put(next, bVar);
        }
    }
}
