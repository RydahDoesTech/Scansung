package X3;

import P2.u;
import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import p3.InterfaceC0763g;
import s3.C0837M;
import x3.EnumC0915b;

/* loaded from: classes.dex */
public abstract class o implements n {
    @Override // X3.n
    public Set a() {
        Collection collectionD = d(f.f2772p, n4.b.f8188d);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionD) {
            if (obj instanceof C0837M) {
                N3.f name = ((C0837M) obj).getName();
                AbstractC0219i.d("it.name", name);
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // X3.n
    public Set b() {
        Collection collectionD = d(f.f2773q, n4.b.f8188d);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionD) {
            if (obj instanceof C0837M) {
                N3.f name = ((C0837M) obj).getName();
                AbstractC0219i.d("it.name", name);
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // X3.n
    public Collection c(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        return u.f2163d;
    }

    @Override // X3.p
    public Collection d(f fVar, InterfaceC0107b interfaceC0107b) {
        AbstractC0219i.e("kindFilter", fVar);
        AbstractC0219i.e("nameFilter", interfaceC0107b);
        return u.f2163d;
    }

    @Override // X3.n
    public Collection e(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        return u.f2163d;
    }

    @Override // X3.n
    public Set f() {
        return null;
    }

    @Override // X3.p
    public InterfaceC0763g g(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        AbstractC0219i.e("location", enumC0915b);
        return null;
    }
}
