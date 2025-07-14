package B3;

import C3.t;
import P2.n;
import P2.u;
import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import d4.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import n4.k;
import p3.InterfaceC0746H;
import v3.y;

/* loaded from: classes.dex */
public final class f implements InterfaceC0746H {

    /* renamed from: a, reason: collision with root package name */
    public final g f252a;

    /* renamed from: b, reason: collision with root package name */
    public final d4.e f253b;

    public f(b bVar) {
        this.f252a = new g(bVar, c.f246b, new O2.a());
        l lVar = bVar.f223a;
        lVar.getClass();
        this.f253b = new d4.e(lVar, new ConcurrentHashMap(3, 1.0f, 2), new d4.f(), 0);
    }

    @Override // p3.InterfaceC0743E
    public final List a(N3.c cVar) {
        AbstractC0219i.e("fqName", cVar);
        return n.i0(d(cVar));
    }

    @Override // p3.InterfaceC0746H
    public final boolean b(N3.c cVar) {
        AbstractC0219i.e("fqName", cVar);
        ((b) this.f252a.f255e).f224b.getClass();
        return false;
    }

    @Override // p3.InterfaceC0746H
    public final void c(N3.c cVar, ArrayList arrayList) {
        AbstractC0219i.e("fqName", cVar);
        k.a(arrayList, d(cVar));
    }

    public final t d(N3.c cVar) throws Throwable {
        ((b) this.f252a.f255e).f224b.getClass();
        AbstractC0219i.e("fqName", cVar);
        a aVar = new a(this, 2, new y(cVar));
        d4.e eVar = this.f253b;
        eVar.getClass();
        Object objD = eVar.d(new d4.g(cVar, aVar));
        if (objD != null) {
            return (t) objD;
        }
        d4.e.a(3);
        throw null;
    }

    @Override // p3.InterfaceC0743E
    public final Collection t(N3.c cVar, InterfaceC0107b interfaceC0107b) {
        AbstractC0219i.e("fqName", cVar);
        AbstractC0219i.e("nameFilter", interfaceC0107b);
        List list = (List) d(cVar).n.a();
        return list == null ? u.f2163d : list;
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + ((b) this.f252a.f255e).f235o;
    }
}
