package e4;

import a3.InterfaceC0106a;
import b3.AbstractC0219i;
import java.util.List;

/* renamed from: e4.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0440x extends AbstractC0438v {

    /* renamed from: e, reason: collision with root package name */
    public final d4.l f6705e;
    public final b3.k f;

    /* renamed from: g, reason: collision with root package name */
    public final d4.i f6706g;

    /* JADX WARN: Multi-variable type inference failed */
    public C0440x(d4.l lVar, InterfaceC0106a interfaceC0106a) {
        AbstractC0219i.e("storageManager", lVar);
        this.f6705e = lVar;
        this.f = (b3.k) interfaceC0106a;
        this.f6706g = new d4.i(lVar, interfaceC0106a);
    }

    @Override // e4.AbstractC0438v
    public final G H0() {
        return M0().H0();
    }

    @Override // e4.AbstractC0438v
    public final J I0() {
        return M0().I0();
    }

    @Override // e4.AbstractC0438v
    public final boolean J0() {
        return M0().J0();
    }

    @Override // e4.AbstractC0438v
    public final AbstractC0438v K0(f4.f fVar) {
        AbstractC0219i.e("kotlinTypeRefiner", fVar);
        return new C0440x(this.f6705e, new B3.a(fVar, 6, this));
    }

    @Override // e4.AbstractC0438v
    public final Z L0() {
        AbstractC0438v abstractC0438vM0 = M0();
        while (abstractC0438vM0 instanceof C0440x) {
            abstractC0438vM0 = ((C0440x) abstractC0438vM0).M0();
        }
        AbstractC0219i.c("null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType", abstractC0438vM0);
        return (Z) abstractC0438vM0;
    }

    public final AbstractC0438v M0() {
        return (AbstractC0438v) this.f6706g.a();
    }

    @Override // e4.AbstractC0438v
    public final X3.n p0() {
        return M0().p0();
    }

    @Override // e4.AbstractC0438v
    public final List s0() {
        return M0().s0();
    }

    public final String toString() {
        d4.i iVar = this.f6706g;
        return (iVar.f == d4.k.f6414d || iVar.f == d4.k.f6415e) ? "<Not computed yet>" : M0().toString();
    }
}
