package p3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import q3.InterfaceC0798h;

/* renamed from: p3.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0744F extends b3.k implements InterfaceC0107b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ N3.c f8393e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0744F(N3.c cVar, int i5) {
        super(1);
        this.f8392d = i5;
        this.f8393e = cVar;
    }

    @Override // a3.InterfaceC0107b
    public final Object d(Object obj) {
        switch (this.f8392d) {
            case 0:
                N3.c cVar = (N3.c) obj;
                AbstractC0219i.e("it", cVar);
                return Boolean.valueOf(!cVar.d() && AbstractC0219i.a(cVar.e(), this.f8393e));
            default:
                InterfaceC0798h interfaceC0798h = (InterfaceC0798h) obj;
                AbstractC0219i.e("it", interfaceC0798h);
                return interfaceC0798h.h(this.f8393e);
        }
    }
}
