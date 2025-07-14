package Q3;

import a3.InterfaceC0108c;
import b3.AbstractC0219i;
import p3.InterfaceC0758b;
import p3.InterfaceC0766j;

/* loaded from: classes.dex */
public final class c extends b3.k implements InterfaceC0108c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0758b f2338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0758b f2339e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC0758b interfaceC0758b, InterfaceC0758b interfaceC0758b2) {
        super(2);
        this.f2338d = interfaceC0758b;
        this.f2339e = interfaceC0758b2;
    }

    @Override // a3.InterfaceC0108c
    public final Object c(Object obj, Object obj2) {
        return Boolean.valueOf(AbstractC0219i.a((InterfaceC0766j) obj, this.f2338d) && AbstractC0219i.a((InterfaceC0766j) obj2, this.f2339e));
    }
}
