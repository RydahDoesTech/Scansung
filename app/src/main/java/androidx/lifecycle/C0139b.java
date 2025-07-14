package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0139b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4008a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4009b;

    public C0139b(HashMap map) {
        this.f4009b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC0153p enumC0153p = (EnumC0153p) entry.getValue();
            List arrayList = (List) this.f4008a.get(enumC0153p);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f4008a.put(enumC0153p, arrayList);
            }
            arrayList.add((C0140c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0159w interfaceC0159w, EnumC0153p enumC0153p, InterfaceC0158v interfaceC0158v) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0140c c0140c = (C0140c) list.get(size);
                c0140c.getClass();
                try {
                    int i5 = c0140c.f4011a;
                    Method method = c0140c.f4012b;
                    if (i5 == 0) {
                        method.invoke(interfaceC0158v, null);
                    } else if (i5 == 1) {
                        method.invoke(interfaceC0158v, interfaceC0159w);
                    } else if (i5 == 2) {
                        method.invoke(interfaceC0158v, interfaceC0159w, enumC0153p);
                    }
                } catch (IllegalAccessException e5) {
                    throw new RuntimeException(e5);
                } catch (InvocationTargetException e6) {
                    throw new RuntimeException("Failed to call observer method", e6.getCause());
                }
            }
        }
    }
}
