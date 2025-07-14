package b4;

import B.g;
import a4.i;
import a4.j;
import a4.l;
import b3.AbstractC0219i;
import com.google.firebase.messaging.q;
import d4.o;
import g4.f;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import m3.InterfaceC0690c;
import m3.n;
import p3.C0745G;
import p3.InterfaceC0743E;
import p3.InterfaceC0781y;
import r3.InterfaceC0816b;
import r3.InterfaceC0818d;

/* loaded from: classes.dex */
public final class b implements InterfaceC0690c {
    public InterfaceC0743E a(o oVar, InterfaceC0781y interfaceC0781y, Iterable iterable, InterfaceC0818d interfaceC0818d, InterfaceC0816b interfaceC0816b, boolean z4) {
        AbstractC0219i.e("storageManager", oVar);
        AbstractC0219i.e("builtInsModule", interfaceC0781y);
        AbstractC0219i.e("classDescriptorFactories", iterable);
        AbstractC0219i.e("platformDependentDeclarationFilter", interfaceC0818d);
        AbstractC0219i.e("additionalClassPartsProvider", interfaceC0816b);
        Set<N3.c> set = n.f8154o;
        AbstractC0219i.e("packageFqNames", set);
        ArrayList arrayList = new ArrayList(P2.o.l0(set));
        for (N3.c cVar : set) {
            a.f5101m.getClass();
            String strA = a.a(cVar);
            AbstractC0219i.e("p0", strA);
            InputStream inputStreamE = d.e(strA);
            if (inputStreamE == null) {
                throw new IllegalStateException(f.d("Resource not found in classpath: ", strA));
            }
            arrayList.add(V1.a.q(cVar, oVar, interfaceC0781y, inputStreamE));
        }
        C0745G c0745g = new C0745G(arrayList);
        q qVar = new q(oVar, interfaceC0781y);
        g gVar = new g(29, c0745g);
        a aVar = a.f5101m;
        i iVar = new i(oVar, interfaceC0781y, gVar, new E0.d(interfaceC0781y, qVar, aVar), c0745g, l.f3066a, j.f3056c, iterable, qVar, interfaceC0816b, interfaceC0818d, aVar.f2908a, null, new d(oVar), null, 851968);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((c) it.next()).P0(iVar);
        }
        return c0745g;
    }
}
