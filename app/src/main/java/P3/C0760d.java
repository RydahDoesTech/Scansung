package p3;

import b3.AbstractC0219i;
import e4.AbstractC0442z;
import java.util.List;
import q3.InterfaceC0798h;

/* renamed from: p3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0760d implements InterfaceC0755Q {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0755Q f8411d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0764h f8412e;
    public final int f;

    public C0760d(InterfaceC0755Q interfaceC0755Q, InterfaceC0764h interfaceC0764h, int i5) {
        AbstractC0219i.e("declarationDescriptor", interfaceC0764h);
        this.f8411d = interfaceC0755Q;
        this.f8412e = interfaceC0764h;
        this.f = i5;
    }

    @Override // p3.InterfaceC0755Q
    public final int B() {
        return this.f8411d.B();
    }

    @Override // p3.InterfaceC0763g
    public final e4.J I() {
        return this.f8411d.I();
    }

    @Override // p3.InterfaceC0755Q
    public final d4.o K() {
        return this.f8411d.K();
    }

    @Override // p3.InterfaceC0766j
    public final Object U(InterfaceC0768l interfaceC0768l, Object obj) {
        return this.f8411d.U(interfaceC0768l, obj);
    }

    @Override // p3.InterfaceC0763g
    public final InterfaceC0763g a() {
        return this.f8411d.a();
    }

    @Override // p3.InterfaceC0766j
    public final N3.f getName() {
        return this.f8411d.getName();
    }

    @Override // p3.InterfaceC0755Q
    public final List getUpperBounds() {
        return this.f8411d.getUpperBounds();
    }

    @Override // p3.InterfaceC0755Q
    public final boolean k0() {
        return true;
    }

    @Override // p3.InterfaceC0766j
    public final InterfaceC0766j l() {
        return this.f8412e;
    }

    @Override // p3.InterfaceC0755Q
    public final boolean l0() {
        return this.f8411d.l0();
    }

    @Override // p3.InterfaceC0767k
    public final InterfaceC0752N n() {
        return this.f8411d.n();
    }

    @Override // p3.InterfaceC0763g
    public final AbstractC0442z q() {
        return this.f8411d.q();
    }

    @Override // q3.InterfaceC0791a
    public final InterfaceC0798h s() {
        return this.f8411d.s();
    }

    public final String toString() {
        return this.f8411d + "[inner-copy]";
    }

    @Override // p3.InterfaceC0755Q
    public final int x0() {
        return this.f8411d.x0() + this.f;
    }

    @Override // p3.InterfaceC0766j, p3.InterfaceC0763g
    public final InterfaceC0766j a() {
        return this.f8411d.a();
    }

    @Override // p3.InterfaceC0755Q, p3.InterfaceC0763g
    public final InterfaceC0755Q a() {
        return this.f8411d.a();
    }
}
