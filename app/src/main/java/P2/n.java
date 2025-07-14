package P2;

import b3.AbstractC0219i;
import java.util.List;

/* loaded from: classes.dex */
public abstract class n extends g3.y {
    public static int g0(List list) {
        AbstractC0219i.e("<this>", list);
        return list.size() - 1;
    }

    public static List h0(Object... objArr) {
        AbstractC0219i.e("elements", objArr);
        return objArr.length > 0 ? i.i0(objArr) : u.f2163d;
    }

    public static List i0(Object obj) {
        return obj != null ? g3.y.N(obj) : u.f2163d;
    }

    public static List j0(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : g3.y.N(list.get(0)) : u.f2163d;
    }

    public static void k0() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
