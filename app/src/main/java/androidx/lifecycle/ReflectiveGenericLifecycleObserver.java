package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements InterfaceC0157u {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0158v f3986a;

    /* renamed from: b, reason: collision with root package name */
    public final C0139b f3987b;

    public ReflectiveGenericLifecycleObserver(InterfaceC0158v interfaceC0158v) {
        this.f3986a = interfaceC0158v;
        C0141d c0141d = C0141d.f4013c;
        Class<?> cls = interfaceC0158v.getClass();
        C0139b c0139b = (C0139b) c0141d.f4014a.get(cls);
        this.f3987b = c0139b == null ? c0141d.a(cls, null) : c0139b;
    }

    @Override // androidx.lifecycle.InterfaceC0157u
    public final void a(InterfaceC0159w interfaceC0159w, EnumC0153p enumC0153p) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        HashMap map = this.f3987b.f4008a;
        List list = (List) map.get(enumC0153p);
        InterfaceC0158v interfaceC0158v = this.f3986a;
        C0139b.a(list, interfaceC0159w, enumC0153p, interfaceC0158v);
        C0139b.a((List) map.get(EnumC0153p.ON_ANY), interfaceC0159w, enumC0153p, interfaceC0158v);
    }
}
