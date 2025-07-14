package b3;

import P2.z;
import a3.InterfaceC0106a;
import a3.InterfaceC0107b;
import a3.InterfaceC0108c;
import a3.InterfaceC0109d;
import g3.InterfaceC0453c;
import g3.y;
import j3.InterfaceC0565e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: b3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0214d implements InterfaceC0453c, InterfaceC0213c {

    /* renamed from: e, reason: collision with root package name */
    public static final Map f5091e;
    public static final HashMap f;

    /* renamed from: d, reason: collision with root package name */
    public final Class f5092d;

    static {
        List listH0 = P2.n.h0(InterfaceC0106a.class, InterfaceC0107b.class, InterfaceC0108c.class, InterfaceC0109d.class, InterfaceC0565e.class, InterfaceC0565e.class, InterfaceC0565e.class, InterfaceC0565e.class, InterfaceC0565e.class, InterfaceC0565e.class, InterfaceC0565e.class, InterfaceC0565e.class, InterfaceC0565e.class, InterfaceC0565e.class, InterfaceC0565e.class, InterfaceC0565e.class, InterfaceC0565e.class, InterfaceC0565e.class, InterfaceC0565e.class, InterfaceC0565e.class, InterfaceC0565e.class, InterfaceC0565e.class, InterfaceC0565e.class);
        ArrayList arrayList = new ArrayList(P2.o.l0(listH0));
        int i5 = 0;
        for (Object obj : listH0) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                P2.n.k0();
                throw null;
            }
            arrayList.add(new O2.f((Class) obj, Integer.valueOf(i5)));
            i5 = i6;
        }
        f5091e = z.k0(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        AbstractC0219i.d("primitiveFqNames.values", collectionValues);
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            AbstractC0219i.d("kotlinName", str);
            sb.append(p4.h.q0(str, '.'));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f5091e.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        f = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(z.g0(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), p4.h.q0((String) entry2.getValue(), '.'));
        }
    }

    public C0214d(Class cls) {
        AbstractC0219i.e("jClass", cls);
        this.f5092d = cls;
    }

    @Override // b3.InterfaceC0213c
    public final Class a() {
        return this.f5092d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0214d) && y.A(this).equals(y.A((InterfaceC0453c) obj));
    }

    public final int hashCode() {
        return y.A(this).hashCode();
    }

    @Override // g3.InterfaceC0453c
    public final Collection k() {
        throw new O2.e();
    }

    @Override // g3.InterfaceC0453c
    public final String l() {
        String str;
        Class cls = this.f5092d;
        AbstractC0219i.e("jClass", cls);
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        boolean zIsArray = cls.isArray();
        HashMap map = f;
        if (!zIsArray) {
            String str2 = (String) map.get(cls.getName());
            return str2 == null ? cls.getCanonicalName() : str2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (str = (String) map.get(componentType.getName())) != null) {
            strConcat = str.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    public final String toString() {
        return this.f5092d.toString() + " (Kotlin reflection is not available)";
    }
}
