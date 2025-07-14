package androidx.lifecycle;

import b3.AbstractC0219i;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/DefaultLifecycleObserverAdapter;", "Landroidx/lifecycle/u;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements InterfaceC0157u {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0145h f3963a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0157u f3964b;

    public DefaultLifecycleObserverAdapter(InterfaceC0145h interfaceC0145h, InterfaceC0157u interfaceC0157u) {
        AbstractC0219i.e("defaultLifecycleObserver", interfaceC0145h);
        this.f3963a = interfaceC0145h;
        this.f3964b = interfaceC0157u;
    }

    @Override // androidx.lifecycle.InterfaceC0157u
    public final void a(InterfaceC0159w interfaceC0159w, EnumC0153p enumC0153p) {
        int i5 = AbstractC0146i.f4019a[enumC0153p.ordinal()];
        InterfaceC0145h interfaceC0145h = this.f3963a;
        switch (i5) {
            case 1:
                interfaceC0145h.getClass();
                break;
            case 2:
                interfaceC0145h.getClass();
                break;
            case 3:
                interfaceC0145h.onResume();
                break;
            case 4:
                interfaceC0145h.getClass();
                break;
            case 5:
                interfaceC0145h.getClass();
                break;
            case 6:
                interfaceC0145h.getClass();
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC0157u interfaceC0157u = this.f3964b;
        if (interfaceC0157u != null) {
            interfaceC0157u.a(interfaceC0159w, enumC0153p);
        }
    }
}
