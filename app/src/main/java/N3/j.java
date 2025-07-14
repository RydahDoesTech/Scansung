package N3;

import P2.o;
import P2.z;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class j {
    static {
        new c("java.lang").c(f.e("annotation"));
    }

    public static final b a(String str) {
        c cVar = i.f1851a;
        return new b(i.f1851a, f.e(str));
    }

    public static final b b(String str) {
        c cVar = i.f1851a;
        return new b(i.f1853c, f.e(str));
    }

    public static final void c(LinkedHashMap linkedHashMap) {
        Set<Map.Entry> setEntrySet = linkedHashMap.entrySet();
        int iG0 = z.g0(o.l0(setEntrySet));
        if (iG0 < 16) {
            iG0 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iG0);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap2.put(entry.getValue(), entry.getKey());
        }
    }

    public static final b d(f fVar) {
        c cVar = i.f1851a;
        b bVar = i.f1857h;
        return new b(bVar.g(), f.e(fVar.c().concat(bVar.i().c())));
    }

    public static final b e(String str) {
        c cVar = i.f1851a;
        return new b(i.f1852b, f.e(str));
    }

    public static final b f(b bVar) {
        c cVar = i.f1851a;
        return new b(i.f1851a, f.e("U".concat(bVar.i().c())));
    }
}
