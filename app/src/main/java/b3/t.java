package b3;

import P2.C0087a;
import c3.InterfaceC0226a;
import c3.InterfaceC0227b;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class t {
    public static Set a(Object obj) {
        if (!(obj instanceof InterfaceC0226a) || (obj instanceof InterfaceC0227b)) {
            try {
                return (Set) obj;
            } catch (ClassCastException e5) {
                AbstractC0219i.f(e5, t.class.getName());
                throw e5;
            }
        }
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to kotlin.collections.MutableSet");
        AbstractC0219i.f(classCastException, t.class.getName());
        throw classCastException;
    }

    public static final C0087a b(Object[] objArr) {
        AbstractC0219i.e("array", objArr);
        return new C0087a(objArr);
    }
}
