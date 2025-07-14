package T0;

import A3.f;
import H0.c;
import android.util.SparseArray;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f2550a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f2551b;

    static {
        HashMap map = new HashMap();
        f2551b = map;
        map.put(c.f806d, 0);
        map.put(c.f807e, 1);
        map.put(c.f, 2);
        for (c cVar : map.keySet()) {
            f2550a.append(((Integer) f2551b.get(cVar)).intValue(), cVar);
        }
    }

    public static int a(c cVar) {
        Integer num = (Integer) f2551b.get(cVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + cVar);
    }

    public static c b(int i5) {
        c cVar = (c) f2550a.get(i5);
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException(f.l(i5, "Unknown Priority for value "));
    }
}
