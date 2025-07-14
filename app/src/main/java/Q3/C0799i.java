package q3;

import P2.t;
import b3.AbstractC0219i;
import java.util.Iterator;
import java.util.List;
import o4.p;
import p3.C0744F;

/* renamed from: q3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0799i implements InterfaceC0798h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8482d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f8483e;

    public /* synthetic */ C0799i(int i5, List list) {
        this.f8482d = i5;
        this.f8483e = list;
    }

    @Override // q3.InterfaceC0798h
    public final boolean e(N3.c cVar) {
        switch (this.f8482d) {
            case 1:
                AbstractC0219i.e("fqName", cVar);
                Iterator it = ((Iterable) P2.m.p0((List) this.f8483e).f2161b).iterator();
                while (it.hasNext()) {
                    if (((InterfaceC0798h) it.next()).e(cVar)) {
                        break;
                    }
                }
                break;
        }
        return V1.a.T(this, cVar);
    }

    @Override // q3.InterfaceC0798h
    public final InterfaceC0792b h(N3.c cVar) {
        switch (this.f8482d) {
            case 0:
                return V1.a.w(this, cVar);
            case 1:
                AbstractC0219i.e("fqName", cVar);
                o4.e eVar = new o4.e(o4.m.j0(P2.m.p0((List) this.f8483e), new C0744F(cVar, 1)));
                return (InterfaceC0792b) (!eVar.hasNext() ? null : eVar.next());
            default:
                AbstractC0219i.e("fqName", cVar);
                if (cVar.equals((N3.c) this.f8483e)) {
                    return F3.b.f631a;
                }
                return null;
        }
    }

    @Override // q3.InterfaceC0798h
    public final boolean isEmpty() {
        switch (this.f8482d) {
            case 0:
                return ((List) this.f8483e).isEmpty();
            case 1:
                List list = (List) this.f8483e;
                if (list != null && list.isEmpty()) {
                    return true;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (!((InterfaceC0798h) it.next()).isEmpty()) {
                        return false;
                    }
                }
                return true;
            default:
                return false;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f8482d) {
            case 0:
                return ((List) this.f8483e).iterator();
            case 1:
                return new o4.g(new o4.h(P2.m.p0((List) this.f8483e), C0801k.f8488d, p.f8320l));
            default:
                return t.f2162d;
        }
    }

    public String toString() {
        switch (this.f8482d) {
            case 0:
                return ((List) this.f8483e).toString();
            default:
                return super.toString();
        }
    }

    public C0799i(InterfaceC0798h[] interfaceC0798hArr) {
        this.f8482d = 1;
        this.f8483e = P2.i.w0(interfaceC0798hArr);
    }

    public C0799i(N3.c cVar) {
        this.f8482d = 2;
        AbstractC0219i.e("fqNameToMatch", cVar);
        this.f8483e = cVar;
    }
}
