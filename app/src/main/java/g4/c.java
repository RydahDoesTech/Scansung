package g4;

import P2.u;
import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import java.util.Collection;
import java.util.List;
import m3.AbstractC0695h;
import m3.C0692e;
import p3.InterfaceC0747I;
import p3.InterfaceC0766j;
import p3.InterfaceC0768l;
import p3.InterfaceC0781y;
import q3.C0797g;
import q3.InterfaceC0798h;

/* loaded from: classes.dex */
public final class c implements InterfaceC0781y {

    /* renamed from: d, reason: collision with root package name */
    public static final c f6794d = new c();

    /* renamed from: e, reason: collision with root package name */
    public static final N3.f f6795e = N3.f.g("<Error module>");
    public static final u f = u.f2163d;

    /* renamed from: g, reason: collision with root package name */
    public static final C0692e f6796g = C0692e.f;

    @Override // p3.InterfaceC0781y
    public final InterfaceC0747I D(N3.c cVar) {
        AbstractC0219i.e("fqName", cVar);
        throw new IllegalStateException("Should not be called!");
    }

    @Override // p3.InterfaceC0781y
    public final List F0() {
        return f;
    }

    @Override // p3.InterfaceC0766j
    public final Object U(InterfaceC0768l interfaceC0768l, Object obj) {
        return null;
    }

    @Override // p3.InterfaceC0766j, p3.InterfaceC0763g
    public final InterfaceC0766j a() {
        return this;
    }

    @Override // p3.InterfaceC0781y
    public final AbstractC0695h g() {
        return f6796g;
    }

    @Override // p3.InterfaceC0766j
    public final N3.f getName() {
        return f6795e;
    }

    @Override // p3.InterfaceC0766j
    public final InterfaceC0766j l() {
        return null;
    }

    @Override // p3.InterfaceC0781y
    public final boolean m0(InterfaceC0781y interfaceC0781y) {
        AbstractC0219i.e("targetModule", interfaceC0781y);
        return false;
    }

    @Override // q3.InterfaceC0791a
    public final InterfaceC0798h s() {
        return C0797g.f8481a;
    }

    @Override // p3.InterfaceC0781y
    public final Collection t(N3.c cVar, InterfaceC0107b interfaceC0107b) {
        AbstractC0219i.e("fqName", cVar);
        AbstractC0219i.e("nameFilter", interfaceC0107b);
        return u.f2163d;
    }

    @Override // p3.InterfaceC0781y
    public final Object y0(G2.a aVar) {
        AbstractC0219i.e("capability", aVar);
        return null;
    }
}
