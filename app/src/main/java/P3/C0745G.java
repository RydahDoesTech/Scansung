package p3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import s3.AbstractC0828D;

/* renamed from: p3.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0745G implements InterfaceC0746H {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f8394a;

    public C0745G(ArrayList arrayList) {
        this.f8394a = arrayList;
    }

    @Override // p3.InterfaceC0743E
    public final List a(N3.c cVar) {
        AbstractC0219i.e("fqName", cVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f8394a.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (AbstractC0219i.a(((AbstractC0828D) ((InterfaceC0742D) next)).f8745h, cVar)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    @Override // p3.InterfaceC0746H
    public final boolean b(N3.c cVar) {
        AbstractC0219i.e("fqName", cVar);
        ArrayList arrayList = this.f8394a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (AbstractC0219i.a(((AbstractC0828D) ((InterfaceC0742D) it.next())).f8745h, cVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // p3.InterfaceC0746H
    public final void c(N3.c cVar, ArrayList arrayList) {
        AbstractC0219i.e("fqName", cVar);
        Iterator it = this.f8394a.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (AbstractC0219i.a(((AbstractC0828D) ((InterfaceC0742D) next)).f8745h, cVar)) {
                arrayList.add(next);
            }
        }
    }

    @Override // p3.InterfaceC0743E
    public final Collection t(N3.c cVar, InterfaceC0107b interfaceC0107b) {
        AbstractC0219i.e("fqName", cVar);
        AbstractC0219i.e("nameFilter", interfaceC0107b);
        return o4.m.k0(new o4.f(o4.m.i0(P2.m.p0(this.f8394a), C0774r.f), true, new C0744F(cVar, 0)));
    }
}
