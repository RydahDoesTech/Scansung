package R3;

import P2.u;
import b3.AbstractC0219i;
import e4.AbstractC0438v;
import e4.N;
import f4.i;
import g3.y;
import java.util.Collection;
import java.util.List;
import m3.AbstractC0695h;
import p3.InterfaceC0763g;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final N f2487a;

    /* renamed from: b, reason: collision with root package name */
    public i f2488b;

    public c(N n) {
        AbstractC0219i.e("projection", n);
        this.f2487a = n;
        n.a();
    }

    @Override // R3.b
    public final N a() {
        return this.f2487a;
    }

    @Override // e4.J
    public final AbstractC0695h g() {
        AbstractC0695h abstractC0695hG = this.f2487a.b().I0().g();
        AbstractC0219i.d("projection.type.constructor.builtIns", abstractC0695hG);
        return abstractC0695hG;
    }

    @Override // e4.J
    public final boolean h() {
        return false;
    }

    @Override // e4.J
    public final /* bridge */ /* synthetic */ InterfaceC0763g i() {
        return null;
    }

    @Override // e4.J
    public final Collection j() {
        N n = this.f2487a;
        AbstractC0438v abstractC0438vB = n.a() == 3 ? n.b() : g().n();
        AbstractC0219i.d("if (projection.projectio… builtIns.nullableAnyType", abstractC0438vB);
        return y.N(abstractC0438vB);
    }

    @Override // e4.J
    public final List k() {
        return u.f2163d;
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.f2487a + ')';
    }
}
