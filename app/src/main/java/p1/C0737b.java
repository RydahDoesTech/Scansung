package p1;

import java.util.Collections;
import java.util.HashMap;
import q2.C0790e;

/* renamed from: p1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0737b implements d2.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0737b f8358a = new C0737b();

    /* renamed from: b, reason: collision with root package name */
    public static final d2.c f8359b;

    static {
        i iVar = new i(1);
        HashMap map = new HashMap();
        map.put(m.class, iVar);
        f8359b = new d2.c("messagingClientEvent", Collections.unmodifiableMap(new HashMap(map)));
    }

    @Override // d2.InterfaceC0392a
    public final void a(Object obj, Object obj2) {
        ((d2.e) obj2).e(f8359b, ((C0790e) obj).f8463a);
    }
}
