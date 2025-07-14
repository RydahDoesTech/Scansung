package e4;

import b3.AbstractC0219i;
import q3.InterfaceC0798h;

/* renamed from: e4.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0433p extends S {

    /* renamed from: b, reason: collision with root package name */
    public final S f6691b;

    /* renamed from: c, reason: collision with root package name */
    public final S f6692c;

    public C0433p(S s2, S s4) {
        this.f6691b = s2;
        this.f6692c = s4;
    }

    @Override // e4.S
    public final boolean a() {
        return this.f6691b.a() || this.f6692c.a();
    }

    @Override // e4.S
    public final boolean b() {
        return this.f6691b.b() || this.f6692c.b();
    }

    @Override // e4.S
    public final InterfaceC0798h c(InterfaceC0798h interfaceC0798h) {
        AbstractC0219i.e("annotations", interfaceC0798h);
        return this.f6692c.c(this.f6691b.c(interfaceC0798h));
    }

    @Override // e4.S
    public final N d(AbstractC0438v abstractC0438v) {
        N nD = this.f6691b.d(abstractC0438v);
        return nD == null ? this.f6692c.d(abstractC0438v) : nD;
    }

    @Override // e4.S
    public final AbstractC0438v f(int i5, AbstractC0438v abstractC0438v) {
        AbstractC0219i.e("topLevelType", abstractC0438v);
        A3.f.q(i5, "position");
        return this.f6692c.f(i5, this.f6691b.f(i5, abstractC0438v));
    }
}
