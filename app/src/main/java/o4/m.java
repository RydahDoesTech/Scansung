package o4;

import C3.C0012d;
import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class m extends n {
    public static int f0(k kVar) {
        Iterator it = kVar.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            it.next();
            i5++;
            if (i5 < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i5;
    }

    public static final h g0(k kVar) {
        o oVar = o.f8317e;
        if (!(kVar instanceof r)) {
            return new h(kVar, o.f, oVar);
        }
        r rVar = (r) kVar;
        return new h(rVar.f8323a, rVar.f8324b, oVar);
    }

    public static k h0(Object obj, InterfaceC0107b interfaceC0107b) {
        return obj == null ? d.f8297a : new j(new C0012d(26, obj), interfaceC0107b);
    }

    public static r i0(k kVar, InterfaceC0107b interfaceC0107b) {
        AbstractC0219i.e("transform", interfaceC0107b);
        return new r(kVar, interfaceC0107b);
    }

    public static f j0(k kVar, InterfaceC0107b interfaceC0107b) {
        return new f(new r(kVar, interfaceC0107b), false, o.f8318g);
    }

    public static List k0(k kVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = kVar.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return P2.n.j0(arrayList);
    }
}
