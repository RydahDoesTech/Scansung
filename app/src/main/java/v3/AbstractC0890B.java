package v3;

import b3.AbstractC0219i;
import java.lang.reflect.Type;
import java.util.Iterator;

/* renamed from: v3.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0890B implements E3.d {
    public abstract Type a();

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC0890B) && AbstractC0219i.a(a(), ((AbstractC0890B) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // E3.b
    public C0898e t(N3.c cVar) {
        Object next;
        AbstractC0219i.e("fqName", cVar);
        Iterator it = s().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC0897d.a(g3.y.z(g3.y.s(((C0898e) next).f9246a))).b().equals(cVar)) {
                break;
            }
        }
        return (C0898e) next;
    }

    public final String toString() {
        return getClass().getName() + ": " + a();
    }
}
