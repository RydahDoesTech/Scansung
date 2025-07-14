package F3;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final e f652a = new e(h.f644e, false);

    /* renamed from: b, reason: collision with root package name */
    public static final e f653b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f654c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f655d;

    static {
        h hVar = h.f;
        f653b = new e(hVar, false);
        f654c = new e(hVar, true);
        String strConcat = "java/lang/".concat("Object");
        String strConcat2 = "java/util/function/".concat("Predicate");
        String strConcat3 = "java/util/function/".concat("Function");
        String strConcat4 = "java/util/function/".concat("Consumer");
        String strConcat5 = "java/util/function/".concat("BiFunction");
        String strConcat6 = "java/util/function/".concat("BiConsumer");
        String strConcat7 = "java/util/function/".concat("UnaryOperator");
        String strConcat8 = "java/util/".concat("stream/Stream");
        String strConcat9 = "java/util/".concat("Optional");
        B.g gVar = new B.g(6);
        new E0.d(gVar, "java/util/".concat("Iterator")).H0("forEachRemaining", new j(strConcat4, 0));
        new E0.d(gVar, "java/lang/".concat("Iterable")).H0("spliterator", new n(1, 4));
        E0.d dVar = new E0.d(gVar, "java/util/".concat("Collection"));
        dVar.H0("removeIf", new j(strConcat2, 6));
        dVar.H0("stream", new j(strConcat8, 7));
        dVar.H0("parallelStream", new j(strConcat8, 8));
        new E0.d(gVar, "java/util/".concat("List")).H0("replaceAll", new j(strConcat7, 9));
        E0.d dVar2 = new E0.d(gVar, "java/util/".concat("Map"));
        dVar2.H0("forEach", new j(strConcat6, 10));
        dVar2.H0("putIfAbsent", new j(strConcat, 11));
        dVar2.H0("replace", new j(strConcat, 12));
        dVar2.H0("replace", new j(strConcat, 13));
        dVar2.H0("replaceAll", new j(strConcat5, 14));
        dVar2.H0("compute", new k(0, strConcat, strConcat5));
        dVar2.H0("computeIfAbsent", new k(1, strConcat, strConcat3));
        dVar2.H0("computeIfPresent", new k(2, strConcat, strConcat5));
        dVar2.H0("merge", new k(3, strConcat, strConcat5));
        E0.d dVar3 = new E0.d(gVar, strConcat9);
        dVar3.H0("empty", new j(strConcat9, 15));
        dVar3.H0("of", new k(4, strConcat, strConcat9));
        dVar3.H0("ofNullable", new k(5, strConcat, strConcat9));
        dVar3.H0("get", new j(strConcat, 16));
        dVar3.H0("ifPresent", new j(strConcat4, 17));
        new E0.d(gVar, "java/lang/".concat("ref/Reference")).H0("get", new j(strConcat, 18));
        new E0.d(gVar, strConcat2).H0("test", new j(strConcat, 19));
        new E0.d(gVar, "java/util/function/".concat("BiPredicate")).H0("test", new j(strConcat, 20));
        new E0.d(gVar, strConcat4).H0("accept", new j(strConcat, 1));
        new E0.d(gVar, strConcat6).H0("accept", new j(strConcat, 2));
        new E0.d(gVar, strConcat3).H0("apply", new j(strConcat, 3));
        new E0.d(gVar, strConcat5).H0("apply", new j(strConcat, 4));
        new E0.d(gVar, "java/util/function/".concat("Supplier")).H0("get", new j(strConcat, 5));
        f655d = (LinkedHashMap) gVar.f95e;
    }
}
