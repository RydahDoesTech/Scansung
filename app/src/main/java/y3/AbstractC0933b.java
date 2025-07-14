package y3;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: y3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0933b {

    /* renamed from: a, reason: collision with root package name */
    public static final N3.c f9389a = new N3.c("javax.annotation.meta.TypeQualifierNickname");

    /* renamed from: b, reason: collision with root package name */
    public static final N3.c f9390b = new N3.c("javax.annotation.meta.TypeQualifier");

    /* renamed from: c, reason: collision with root package name */
    public static final N3.c f9391c = new N3.c("javax.annotation.meta.TypeQualifierDefault");

    /* renamed from: d, reason: collision with root package name */
    public static final N3.c f9392d = new N3.c("kotlin.annotations.jvm.UnderMigration");

    /* renamed from: e, reason: collision with root package name */
    public static final Object f9393e;
    public static final LinkedHashMap f;

    /* renamed from: g, reason: collision with root package name */
    public static final Set f9394g;

    static {
        EnumC0932a enumC0932a = EnumC0932a.FIELD;
        EnumC0932a enumC0932a2 = EnumC0932a.METHOD_RETURN_TYPE;
        EnumC0932a enumC0932a3 = EnumC0932a.VALUE_PARAMETER;
        List listH0 = P2.n.h0(enumC0932a, enumC0932a2, enumC0932a3, EnumC0932a.TYPE_PARAMETER_BOUNDS, EnumC0932a.TYPE_USE);
        N3.c cVar = y.f9458c;
        F3.h hVar = F3.h.f;
        Map mapI0 = P2.z.i0(new O2.f(cVar, new n(new F3.i(hVar), listH0, false)), new O2.f(y.f, new n(new F3.i(hVar), listH0, false)));
        f9393e = mapI0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(P2.z.i0(new O2.f(new N3.c("javax.annotation.ParametersAreNullableByDefault"), new n(new F3.i(F3.h.f644e), g3.y.N(enumC0932a3))), new O2.f(new N3.c("javax.annotation.ParametersAreNonnullByDefault"), new n(new F3.i(hVar), g3.y.N(enumC0932a3)))));
        linkedHashMap.putAll(mapI0);
        f = linkedHashMap;
        f9394g = P2.B.u0(y.f9462h, y.f9463i);
    }
}
