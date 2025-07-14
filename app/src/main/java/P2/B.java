package P2;

import b3.AbstractC0219i;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class B extends V1.a {
    public static LinkedHashSet s0(Set set, Object obj) {
        AbstractC0219i.e("<this>", set);
        LinkedHashSet linkedHashSet = new LinkedHashSet(z.g0(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }

    public static LinkedHashSet t0(Set set, Collection collection) {
        AbstractC0219i.e("<this>", set);
        AbstractC0219i.e("elements", collection);
        LinkedHashSet linkedHashSet = new LinkedHashSet(z.g0(set.size() + Integer.valueOf(collection.size()).intValue()));
        linkedHashSet.addAll(set);
        s.n0(linkedHashSet, collection);
        return linkedHashSet;
    }

    public static Set u0(Object... objArr) {
        return objArr.length > 0 ? i.x0(objArr) : w.f2165d;
    }
}
