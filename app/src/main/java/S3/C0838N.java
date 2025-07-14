package s3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import com.idm.fotaagent.database.sqlite.database.IDMDatabaseInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p3.InterfaceC0781y;

/* renamed from: s3.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0838N extends X3.o {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0781y f8792b;

    /* renamed from: c, reason: collision with root package name */
    public final N3.c f8793c;

    public C0838N(InterfaceC0781y interfaceC0781y, N3.c cVar) {
        AbstractC0219i.e("moduleDescriptor", interfaceC0781y);
        AbstractC0219i.e("fqName", cVar);
        this.f8792b = interfaceC0781y;
        this.f8793c = cVar;
    }

    @Override // X3.o, X3.p
    public final Collection d(X3.f fVar, InterfaceC0107b interfaceC0107b) {
        AbstractC0219i.e("kindFilter", fVar);
        AbstractC0219i.e("nameFilter", interfaceC0107b);
        boolean zA = fVar.a(X3.f.f2765h);
        P2.u uVar = P2.u.f2163d;
        if (!zA) {
            return uVar;
        }
        N3.c cVar = this.f8793c;
        if (cVar.d()) {
            if (fVar.f2776a.contains(X3.c.f2758a)) {
                return uVar;
            }
        }
        InterfaceC0781y interfaceC0781y = this.f8792b;
        Collection collectionT = interfaceC0781y.t(cVar, interfaceC0107b);
        ArrayList arrayList = new ArrayList(collectionT.size());
        Iterator it = collectionT.iterator();
        while (it.hasNext()) {
            N3.f fVarF = ((N3.c) it.next()).f();
            AbstractC0219i.d("subFqName.shortName()", fVarF);
            if (((Boolean) interfaceC0107b.d(fVarF)).booleanValue()) {
                y yVar = null;
                if (!fVarF.f1843e) {
                    y yVar2 = (y) interfaceC0781y.D(cVar.c(fVarF));
                    if (!((Boolean) V1.a.Q(yVar2.f8902i, y.f8899k[1])).booleanValue()) {
                        yVar = yVar2;
                    }
                }
                n4.k.a(arrayList, yVar);
            }
        }
        return arrayList;
    }

    @Override // X3.o, X3.n
    public final Set f() {
        return P2.w.f2165d;
    }

    public final String toString() {
        return "subpackages of " + this.f8793c + IDMDatabaseInterface.IDM_SQL_FROM + this.f8792b;
    }
}
