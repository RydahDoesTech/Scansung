package s3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import m3.AbstractC0695h;
import p3.AbstractC0779w;
import p3.C0778v;
import p3.InterfaceC0743E;
import p3.InterfaceC0747I;
import p3.InterfaceC0766j;
import p3.InterfaceC0768l;
import p3.InterfaceC0781y;
import q3.C0797g;

/* renamed from: s3.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0826B extends AbstractC0859o implements InterfaceC0781y {
    public final d4.l f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC0695h f8732g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f8733h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC0831G f8734i;

    /* renamed from: j, reason: collision with root package name */
    public K3.g f8735j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0743E f8736k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f8737l;

    /* renamed from: m, reason: collision with root package name */
    public final d4.e f8738m;
    public final O2.i n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0826B(N3.f fVar, d4.l lVar, AbstractC0695h abstractC0695h, int i5) {
        super(C0797g.f8481a, fVar);
        P2.v vVar = P2.v.f2164d;
        AbstractC0219i.e("moduleName", fVar);
        this.f = lVar;
        this.f8732g = abstractC0695h;
        if (!fVar.f1843e) {
            throw new IllegalArgumentException("Module name must be special: " + fVar);
        }
        this.f8733h = vVar;
        InterfaceC0831G.f8750a.getClass();
        InterfaceC0831G interfaceC0831G = (InterfaceC0831G) y0(C0829E.f8748b);
        this.f8734i = interfaceC0831G == null ? C0830F.f8749b : interfaceC0831G;
        this.f8737l = true;
        this.f8738m = lVar.b(new B3.d(22, this));
        this.n = new O2.i(new m3.k(this, 2));
    }

    @Override // p3.InterfaceC0781y
    public final InterfaceC0747I D(N3.c cVar) {
        AbstractC0219i.e("fqName", cVar);
        N0();
        return (InterfaceC0747I) this.f8738m.d(cVar);
    }

    @Override // p3.InterfaceC0781y
    public final List F0() {
        if (this.f8735j != null) {
            return P2.u.f2163d;
        }
        StringBuilder sb = new StringBuilder("Dependencies of module ");
        String str = getName().f1842d;
        AbstractC0219i.d("name.toString()", str);
        sb.append(str);
        sb.append(" were not set");
        throw new AssertionError(sb.toString());
    }

    public final void N0() {
        if (this.f8737l) {
            return;
        }
        if (y0(AbstractC0779w.f8441a) != null) {
            throw new ClassCastException();
        }
        String str = "Accessing invalid module descriptor " + this;
        AbstractC0219i.e("message", str);
        throw new C0778v(str);
    }

    @Override // p3.InterfaceC0766j
    public final Object U(InterfaceC0768l interfaceC0768l, Object obj) {
        return interfaceC0768l.b(this, obj);
    }

    @Override // p3.InterfaceC0781y
    public final AbstractC0695h g() {
        return this.f8732g;
    }

    @Override // p3.InterfaceC0766j
    public final InterfaceC0766j l() {
        return null;
    }

    @Override // p3.InterfaceC0781y
    public final boolean m0(InterfaceC0781y interfaceC0781y) {
        AbstractC0219i.e("targetModule", interfaceC0781y);
        if (equals(interfaceC0781y)) {
            return true;
        }
        AbstractC0219i.b(this.f8735j);
        if (P2.m.q0(P2.w.f2165d, interfaceC0781y)) {
            return true;
        }
        F0();
        P2.u.f2163d.contains(interfaceC0781y);
        return interfaceC0781y.F0().contains(this);
    }

    @Override // p3.InterfaceC0781y
    public final Collection t(N3.c cVar, InterfaceC0107b interfaceC0107b) {
        AbstractC0219i.e("fqName", cVar);
        AbstractC0219i.e("nameFilter", interfaceC0107b);
        N0();
        N0();
        return ((C0858n) this.n.getValue()).t(cVar, interfaceC0107b);
    }

    @Override // s3.AbstractC0859o
    public final String toString() {
        String strM0 = AbstractC0859o.M0(this);
        return this.f8737l ? strM0 : strM0.concat(" !isValid");
    }

    @Override // p3.InterfaceC0781y
    public final Object y0(G2.a aVar) {
        AbstractC0219i.e("capability", aVar);
        Object obj = this.f8733h.get(aVar);
        if (obj == null) {
            return null;
        }
        return obj;
    }
}
