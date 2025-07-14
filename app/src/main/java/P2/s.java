package P2;

import b3.AbstractC0219i;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class s extends r {
    public static void n0(Collection collection, Iterable iterable) {
        AbstractC0219i.e("elements", iterable);
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }
}
