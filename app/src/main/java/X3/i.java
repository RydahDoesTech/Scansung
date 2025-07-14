package X3;

import P2.u;
import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import p3.InterfaceC0761e;
import p3.InterfaceC0763g;
import p3.InterfaceC0764h;
import x3.EnumC0915b;

/* loaded from: classes.dex */
public final class i extends o {

    /* renamed from: b, reason: collision with root package name */
    public final n f2783b;

    public i(n nVar) {
        AbstractC0219i.e("workerScope", nVar);
        this.f2783b = nVar;
    }

    @Override // X3.o, X3.n
    public final Set a() {
        return this.f2783b.a();
    }

    @Override // X3.o, X3.n
    public final Set b() {
        return this.f2783b.b();
    }

    @Override // X3.o, X3.p
    public final Collection d(f fVar, InterfaceC0107b interfaceC0107b) {
        AbstractC0219i.e("kindFilter", fVar);
        AbstractC0219i.e("nameFilter", interfaceC0107b);
        int i5 = f.f2769l & fVar.f2777b;
        f fVar2 = i5 == 0 ? null : new f(i5, fVar.f2776a);
        if (fVar2 == null) {
            return u.f2163d;
        }
        Collection collectionD = this.f2783b.d(fVar2, interfaceC0107b);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionD) {
            if (obj instanceof InterfaceC0764h) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // X3.o, X3.n
    public final Set f() {
        return this.f2783b.f();
    }

    @Override // X3.o, X3.p
    public final InterfaceC0763g g(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        AbstractC0219i.e("location", enumC0915b);
        InterfaceC0763g interfaceC0763gG = this.f2783b.g(fVar, enumC0915b);
        if (interfaceC0763gG == null) {
            return null;
        }
        InterfaceC0761e interfaceC0761e = interfaceC0763gG instanceof InterfaceC0761e ? (InterfaceC0761e) interfaceC0763gG : null;
        if (interfaceC0761e != null) {
            return interfaceC0761e;
        }
        if (interfaceC0763gG instanceof c4.s) {
            return (c4.s) interfaceC0763gG;
        }
        return null;
    }

    public final String toString() {
        return "Classes from " + this.f2783b;
    }
}
