package e4;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import java.util.List;

/* loaded from: classes.dex */
public final class A extends AbstractC0442z {

    /* renamed from: e, reason: collision with root package name */
    public final J f6637e;
    public final List f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6638g;

    /* renamed from: h, reason: collision with root package name */
    public final X3.n f6639h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC0107b f6640i;

    public A(J j5, List list, boolean z4, X3.n nVar, InterfaceC0107b interfaceC0107b) {
        AbstractC0219i.e("constructor", j5);
        AbstractC0219i.e("arguments", list);
        AbstractC0219i.e("memberScope", nVar);
        this.f6637e = j5;
        this.f = list;
        this.f6638g = z4;
        this.f6639h = nVar;
        this.f6640i = interfaceC0107b;
        if (!(nVar instanceof g4.e) || (nVar instanceof g4.k)) {
            return;
        }
        throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + nVar + '\n' + j5);
    }

    @Override // e4.AbstractC0438v
    public final G H0() {
        G.f6646e.getClass();
        return G.f;
    }

    @Override // e4.AbstractC0438v
    public final J I0() {
        return this.f6637e;
    }

    @Override // e4.AbstractC0438v
    public final boolean J0() {
        return this.f6638g;
    }

    @Override // e4.AbstractC0438v
    public final AbstractC0438v K0(f4.f fVar) {
        AbstractC0219i.e("kotlinTypeRefiner", fVar);
        AbstractC0442z abstractC0442z = (AbstractC0442z) this.f6640i.d(fVar);
        return abstractC0442z == null ? this : abstractC0442z;
    }

    @Override // e4.Z
    /* renamed from: N0 */
    public final Z K0(f4.f fVar) {
        AbstractC0219i.e("kotlinTypeRefiner", fVar);
        AbstractC0442z abstractC0442z = (AbstractC0442z) this.f6640i.d(fVar);
        return abstractC0442z == null ? this : abstractC0442z;
    }

    @Override // e4.AbstractC0442z
    /* renamed from: P0 */
    public final AbstractC0442z M0(boolean z4) {
        if (z4 == this.f6638g) {
            return this;
        }
        return z4 ? new C0441y(this, 1) : new C0441y(this, 0);
    }

    @Override // e4.AbstractC0442z
    /* renamed from: Q0 */
    public final AbstractC0442z O0(G g5) {
        AbstractC0219i.e("newAttributes", g5);
        return g5.isEmpty() ? this : new B(this, g5);
    }

    @Override // e4.AbstractC0438v
    public final X3.n p0() {
        return this.f6639h;
    }

    @Override // e4.AbstractC0438v
    public final List s0() {
        return this.f;
    }
}
