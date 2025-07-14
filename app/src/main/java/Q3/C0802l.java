package q3;

import b3.AbstractC0219i;
import e4.T;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: q3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0802l implements InterfaceC0798h {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0798h f8489d;

    /* renamed from: e, reason: collision with root package name */
    public final T f8490e;

    public C0802l(InterfaceC0798h interfaceC0798h, T t4) {
        this.f8489d = interfaceC0798h;
        this.f8490e = t4;
    }

    @Override // q3.InterfaceC0798h
    public final boolean e(N3.c cVar) {
        AbstractC0219i.e("fqName", cVar);
        if (((Boolean) this.f8490e.d(cVar)).booleanValue()) {
            return this.f8489d.e(cVar);
        }
        return false;
    }

    @Override // q3.InterfaceC0798h
    public final InterfaceC0792b h(N3.c cVar) {
        AbstractC0219i.e("fqName", cVar);
        if (((Boolean) this.f8490e.d(cVar)).booleanValue()) {
            return this.f8489d.h(cVar);
        }
        return null;
    }

    @Override // q3.InterfaceC0798h
    public final boolean isEmpty() {
        InterfaceC0798h interfaceC0798h = this.f8489d;
        if ((interfaceC0798h instanceof Collection) && ((Collection) interfaceC0798h).isEmpty()) {
            return false;
        }
        Iterator it = interfaceC0798h.iterator();
        while (it.hasNext()) {
            N3.c cVarA = ((InterfaceC0792b) it.next()).a();
            if (cVarA != null && ((Boolean) this.f8490e.d(cVarA)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f8489d) {
            N3.c cVarA = ((InterfaceC0792b) obj).a();
            if (cVarA != null && ((Boolean) this.f8490e.d(cVarA)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }
}
