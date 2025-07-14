package j3;

import O3.C0083o;
import b3.AbstractC0219i;
import e1.AbstractC0415a;
import g3.InterfaceC0466p;
import java.util.Collection;
import p3.InterfaceC0750L;
import v3.AbstractC0897d;
import x3.EnumC0915b;

/* loaded from: classes.dex */
public final class S extends D {

    /* renamed from: e, reason: collision with root package name */
    public final Class f7352e;
    public final r0 f;

    public S(Class cls) {
        AbstractC0219i.e("jClass", cls);
        this.f7352e = cls;
        this.f = new r0(new M(this, 1));
    }

    @Override // b3.InterfaceC0213c
    public final Class a() {
        return this.f7352e;
    }

    @Override // j3.D
    public final Collection d() {
        return P2.u.f2163d;
    }

    @Override // j3.D
    public final Collection e(N3.f fVar) {
        P p2 = (P) this.f.a();
        p2.getClass();
        InterfaceC0466p interfaceC0466p = P.f7347g[1];
        Object objA = p2.f7349d.a();
        AbstractC0219i.d("<get-scope>(...)", objA);
        return ((X3.n) objA).e(fVar, EnumC0915b.f9316e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof S) {
            if (AbstractC0219i.a(this.f7352e, ((S) obj).f7352e)) {
                return true;
            }
        }
        return false;
    }

    @Override // j3.D
    public final InterfaceC0750L f(int i5) {
        P p2 = (P) this.f.a();
        p2.getClass();
        InterfaceC0466p interfaceC0466p = P.f7347g[3];
        O2.j jVar = (O2.j) p2.f.a();
        if (jVar == null) {
            return null;
        }
        M3.g gVar = (M3.g) jVar.f2013d;
        I3.C c2 = (I3.C) jVar.f2014e;
        M3.f fVar = (M3.f) jVar.f;
        C0083o c0083o = L3.k.n;
        AbstractC0219i.d("packageLocalVariable", c0083o);
        I3.G g5 = (I3.G) AbstractC0415a.t(c2, c0083o, i5);
        if (g5 == null) {
            return null;
        }
        I3.X x4 = c2.f967j;
        AbstractC0219i.d("packageProto.typeTable", x4);
        return (InterfaceC0750L) x0.f(this.f7352e, g5, gVar, new K3.g(x4), fVar, Q.f7351l);
    }

    @Override // j3.D
    public final Class h() {
        P p2 = (P) this.f.a();
        p2.getClass();
        InterfaceC0466p interfaceC0466p = P.f7347g[2];
        Class cls = (Class) p2.f7350e.a();
        return cls == null ? this.f7352e : cls;
    }

    public final int hashCode() {
        return this.f7352e.hashCode();
    }

    @Override // j3.D
    public final Collection i(N3.f fVar) {
        P p2 = (P) this.f.a();
        p2.getClass();
        InterfaceC0466p interfaceC0466p = P.f7347g[1];
        Object objA = p2.f7349d.a();
        AbstractC0219i.d("<get-scope>(...)", objA);
        return ((X3.n) objA).c(fVar, EnumC0915b.f9316e);
    }

    public final String toString() {
        return "file class " + AbstractC0897d.a(this.f7352e).b();
    }
}
