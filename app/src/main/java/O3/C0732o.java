package o3;

import P2.B;
import P2.s;
import b3.AbstractC0219i;
import com.idm.agent.dm.uic.IDMDmUICInterface;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: o3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0732o {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f8289a = B.s0(G3.g.g("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashSet f8290b;

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashSet f8291c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashSet f8292d;

    /* renamed from: e, reason: collision with root package name */
    public static final LinkedHashSet f8293e;
    public static final LinkedHashSet f;

    static {
        List<V3.c> listH0 = P2.n.h0(V3.c.BOOLEAN, V3.c.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (V3.c cVar : listH0) {
            String strB = cVar.e().f().b();
            AbstractC0219i.d("it.wrapperFqName.shortName().asString()", strB);
            s.n0(linkedHashSet, G3.g.f(strB, cVar.f2639e + "Value()" + cVar.c()));
        }
        f8290b = B.t0(B.t0(B.t0(B.t0(B.t0(B.t0(linkedHashSet, G3.g.g("List", "sort(Ljava/util/Comparator;)V")), G3.g.f("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), G3.g.f("Double", "isInfinite()Z", "isNaN()Z")), G3.g.f("Float", "isInfinite()Z", "isNaN()Z")), G3.g.f("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), G3.g.f("CharSequence", "isEmpty()Z"));
        f8291c = B.t0(B.t0(B.t0(B.t0(B.t0(B.t0(G3.g.f("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), G3.g.g("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), G3.g.f("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), G3.g.f("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), G3.g.g("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), G3.g.g("List", "replaceAll(Ljava/util/function/UnaryOperator;)V")), G3.g.g("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f8292d = B.t0(B.t0(G3.g.g("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), G3.g.g("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V")), G3.g.g("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        V3.c cVar2 = V3.c.BOOLEAN;
        V3.c cVar3 = V3.c.BYTE;
        List listH02 = P2.n.h0(cVar2, cVar3, V3.c.DOUBLE, V3.c.FLOAT, cVar3, V3.c.INT, V3.c.LONG, V3.c.SHORT);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = listH02.iterator();
        while (it.hasNext()) {
            String strB2 = ((V3.c) it.next()).e().f().b();
            AbstractC0219i.d("it.wrapperFqName.shortName().asString()", strB2);
            String[] strArrA = G3.g.a("Ljava/lang/String;");
            s.n0(linkedHashSet2, G3.g.f(strB2, (String[]) Arrays.copyOf(strArrA, strArrA.length)));
        }
        String[] strArrA2 = G3.g.a(IDMDmUICInterface.IDM_UIC_OPTION_IT_D);
        LinkedHashSet linkedHashSetT0 = B.t0(linkedHashSet2, G3.g.f("Float", (String[]) Arrays.copyOf(strArrA2, strArrA2.length)));
        String[] strArrA3 = G3.g.a("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f8293e = B.t0(linkedHashSetT0, G3.g.f("String", (String[]) Arrays.copyOf(strArrA3, strArrA3.length)));
        String[] strArrA4 = G3.g.a("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f = G3.g.f("Throwable", (String[]) Arrays.copyOf(strArrA4, strArrA4.length));
    }
}
