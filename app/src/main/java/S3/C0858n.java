package s3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p3.AbstractC0779w;
import p3.InterfaceC0743E;
import p3.InterfaceC0746H;

/* renamed from: s3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0858n implements InterfaceC0746H {

    /* renamed from: a, reason: collision with root package name */
    public final List f8836a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8837b;

    public C0858n(String str, List list) {
        AbstractC0219i.e("debugName", str);
        this.f8836a = list;
        this.f8837b = str;
        list.size();
        P2.m.R0(list).size();
    }

    @Override // p3.InterfaceC0743E
    public final List a(N3.c cVar) {
        AbstractC0219i.e("fqName", cVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f8836a.iterator();
        while (it.hasNext()) {
            AbstractC0779w.b((InterfaceC0743E) it.next(), cVar, arrayList);
        }
        return P2.m.O0(arrayList);
    }

    @Override // p3.InterfaceC0746H
    public final boolean b(N3.c cVar) {
        AbstractC0219i.e("fqName", cVar);
        List list = this.f8836a;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!AbstractC0779w.h((InterfaceC0743E) it.next(), cVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // p3.InterfaceC0746H
    public final void c(N3.c cVar, ArrayList arrayList) {
        AbstractC0219i.e("fqName", cVar);
        Iterator it = this.f8836a.iterator();
        while (it.hasNext()) {
            AbstractC0779w.b((InterfaceC0743E) it.next(), cVar, arrayList);
        }
    }

    @Override // p3.InterfaceC0743E
    public final Collection t(N3.c cVar, InterfaceC0107b interfaceC0107b) {
        AbstractC0219i.e("fqName", cVar);
        AbstractC0219i.e("nameFilter", interfaceC0107b);
        HashSet hashSet = new HashSet();
        Iterator it = this.f8836a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((InterfaceC0743E) it.next()).t(cVar, interfaceC0107b));
        }
        return hashSet;
    }

    public final String toString() {
        return this.f8837b;
    }
}
