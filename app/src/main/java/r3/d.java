package R3;

import A3.f;
import b3.AbstractC0219i;
import e4.AbstractC0438v;
import e4.N;
import e4.S;
import g3.y;
import p3.InterfaceC0755Q;
import p3.InterfaceC0763g;
import q3.InterfaceC0798h;

/* loaded from: classes.dex */
public final class d extends S {

    /* renamed from: b, reason: collision with root package name */
    public final S f2489b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f2490c;

    public d(S s2, boolean z4) {
        this.f2490c = z4;
        this.f2489b = s2;
    }

    @Override // e4.S
    public final boolean a() {
        return this.f2489b.a();
    }

    @Override // e4.S
    public final boolean b() {
        return this.f2490c;
    }

    @Override // e4.S
    public final InterfaceC0798h c(InterfaceC0798h interfaceC0798h) {
        AbstractC0219i.e("annotations", interfaceC0798h);
        return this.f2489b.c(interfaceC0798h);
    }

    @Override // e4.S
    public final N d(AbstractC0438v abstractC0438v) {
        N nD = this.f2489b.d(abstractC0438v);
        if (nD == null) {
            return null;
        }
        InterfaceC0763g interfaceC0763gI = abstractC0438v.I0().i();
        return y.m(nD, interfaceC0763gI instanceof InterfaceC0755Q ? (InterfaceC0755Q) interfaceC0763gI : null);
    }

    @Override // e4.S
    public final boolean e() {
        return this.f2489b.e();
    }

    @Override // e4.S
    public final AbstractC0438v f(int i5, AbstractC0438v abstractC0438v) {
        AbstractC0219i.e("topLevelType", abstractC0438v);
        f.q(i5, "position");
        return this.f2489b.f(i5, abstractC0438v);
    }
}
