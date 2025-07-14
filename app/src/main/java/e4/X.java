package e4;

import a3.InterfaceC0107b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p3.InterfaceC0755Q;
import p3.InterfaceC0761e;

/* loaded from: classes.dex */
public abstract class X {

    /* renamed from: a, reason: collision with root package name */
    public static final g4.g f6670a = g4.j.c(g4.i.f6823o, new String[0]);

    /* renamed from: b, reason: collision with root package name */
    public static final g4.g f6671b = g4.j.c(g4.i.f6821l, new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final W f6672c = new W("NO_EXPECTED_TYPE");

    /* renamed from: d, reason: collision with root package name */
    public static final W f6673d = new W("UNIT_EXPECTED_TYPE");

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r27) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.X.a(int):void");
    }

    public static boolean b(AbstractC0438v abstractC0438v) {
        if (abstractC0438v == null) {
            a(28);
            throw null;
        }
        if (abstractC0438v.J0()) {
            return true;
        }
        return AbstractC0420c.j(abstractC0438v) && b(((AbstractC0434q) abstractC0438v.L0()).f);
    }

    public static boolean c(AbstractC0438v abstractC0438v, InterfaceC0107b interfaceC0107b, n4.h hVar) {
        if (abstractC0438v == null) {
            return false;
        }
        Z zL0 = abstractC0438v.L0();
        if (l(abstractC0438v)) {
            return ((Boolean) interfaceC0107b.d(zL0)).booleanValue();
        }
        if (hVar != null && hVar.contains(abstractC0438v)) {
            return false;
        }
        if (((Boolean) interfaceC0107b.d(zL0)).booleanValue()) {
            return true;
        }
        if (hVar == null) {
            hVar = new n4.h();
        }
        hVar.add(abstractC0438v);
        AbstractC0434q abstractC0434q = zL0 instanceof AbstractC0434q ? (AbstractC0434q) zL0 : null;
        if (abstractC0434q != null && (c(abstractC0434q.f6693e, interfaceC0107b, hVar) || c(abstractC0434q.f, interfaceC0107b, hVar))) {
            return true;
        }
        if ((zL0 instanceof C0430m) && c(((C0430m) zL0).f6689e, interfaceC0107b, hVar)) {
            return true;
        }
        J jI0 = abstractC0438v.I0();
        if (jI0 instanceof C0437u) {
            Iterator it = ((C0437u) jI0).f6700b.iterator();
            while (it.hasNext()) {
                if (c((AbstractC0438v) it.next(), interfaceC0107b, hVar)) {
                    return true;
                }
            }
            return false;
        }
        for (N n : abstractC0438v.s0()) {
            if (!n.c() && c(n.b(), interfaceC0107b, hVar)) {
                return true;
            }
        }
        return false;
    }

    public static List d(List list) {
        if (list == null) {
            a(16);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new O(((InterfaceC0755Q) it.next()).q()));
        }
        return P2.m.O0(arrayList);
    }

    public static boolean e(AbstractC0438v abstractC0438v) {
        if (abstractC0438v == null) {
            a(27);
            throw null;
        }
        if (abstractC0438v.J0()) {
            return true;
        }
        if (AbstractC0420c.j(abstractC0438v) && e(((AbstractC0434q) abstractC0438v.L0()).f)) {
            return true;
        }
        if (abstractC0438v.L0() instanceof C0430m) {
            return false;
        }
        if (!f(abstractC0438v)) {
            J jI0 = abstractC0438v.I0();
            if (jI0 instanceof C0437u) {
                Iterator it = ((C0437u) jI0).f6700b.iterator();
                while (it.hasNext()) {
                    if (e((AbstractC0438v) it.next())) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (!(abstractC0438v.I0().i() instanceof InterfaceC0761e)) {
            V vD = V.d(abstractC0438v);
            Collection<AbstractC0438v> collectionJ = abstractC0438v.I0().j();
            ArrayList arrayList = new ArrayList(collectionJ.size());
            for (AbstractC0438v abstractC0438v2 : collectionJ) {
                if (abstractC0438v2 == null) {
                    a(21);
                    throw null;
                }
                AbstractC0438v abstractC0438vI = vD.i(1, abstractC0438v2);
                AbstractC0438v abstractC0438vH = abstractC0438vI != null ? h(abstractC0438vI, abstractC0438v.J0()) : null;
                if (abstractC0438vH != null) {
                    arrayList.add(abstractC0438vH);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (e((AbstractC0438v) it2.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean f(AbstractC0438v abstractC0438v) {
        if (abstractC0438v == null) {
            a(60);
            throw null;
        }
        if ((abstractC0438v.I0().i() instanceof InterfaceC0755Q ? (InterfaceC0755Q) abstractC0438v.I0().i() : null) != null) {
            return true;
        }
        abstractC0438v.I0();
        return false;
    }

    public static Z g(AbstractC0438v abstractC0438v, boolean z4) {
        if (abstractC0438v == null) {
            a(3);
            throw null;
        }
        Z zM0 = abstractC0438v.L0().M0(z4);
        if (zM0 != null) {
            return zM0;
        }
        a(4);
        throw null;
    }

    public static AbstractC0438v h(AbstractC0438v abstractC0438v, boolean z4) {
        if (abstractC0438v != null) {
            return z4 ? g(abstractC0438v, true) : abstractC0438v;
        }
        a(8);
        throw null;
    }

    public static AbstractC0442z i(AbstractC0442z abstractC0442z, boolean z4) {
        if (abstractC0442z == null) {
            a(5);
            throw null;
        }
        if (!z4) {
            return abstractC0442z;
        }
        AbstractC0442z abstractC0442zP0 = abstractC0442z.M0(true);
        if (abstractC0442zP0 != null) {
            return abstractC0442zP0;
        }
        a(6);
        throw null;
    }

    public static E j(InterfaceC0755Q interfaceC0755Q) {
        if (interfaceC0755Q != null) {
            return new E(interfaceC0755Q);
        }
        a(45);
        throw null;
    }

    public static N k(InterfaceC0755Q interfaceC0755Q, D3.a aVar) {
        if (interfaceC0755Q != null) {
            return aVar.f496a == 1 ? new O(1, AbstractC0420c.r(interfaceC0755Q)) : new E(interfaceC0755Q);
        }
        a(46);
        throw null;
    }

    public static boolean l(AbstractC0438v abstractC0438v) {
        if (abstractC0438v != null) {
            return abstractC0438v == f6672c || abstractC0438v == f6673d;
        }
        a(0);
        throw null;
    }
}
