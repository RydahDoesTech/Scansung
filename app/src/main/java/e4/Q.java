package e4;

import b3.AbstractC0219i;
import q3.InterfaceC0798h;

/* loaded from: classes.dex */
public final class Q extends S {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S f6665b;

    public Q(S s2) {
        this.f6665b = s2;
    }

    @Override // e4.S
    public final InterfaceC0798h c(InterfaceC0798h interfaceC0798h) {
        AbstractC0219i.e("annotations", interfaceC0798h);
        return this.f6665b.c(interfaceC0798h);
    }

    @Override // e4.S
    public final N d(AbstractC0438v abstractC0438v) {
        return this.f6665b.d(abstractC0438v);
    }

    @Override // e4.S
    public final boolean e() {
        return this.f6665b.e();
    }

    @Override // e4.S
    public final AbstractC0438v f(int i5, AbstractC0438v abstractC0438v) {
        AbstractC0219i.e("topLevelType", abstractC0438v);
        A3.f.q(i5, "position");
        return this.f6665b.f(i5, abstractC0438v);
    }
}
