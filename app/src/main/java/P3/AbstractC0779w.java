package p3;

import b3.AbstractC0219i;
import e4.AbstractC0442z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s3.C0826B;
import x3.EnumC0915b;

/* renamed from: p3.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0779w {

    /* renamed from: a, reason: collision with root package name */
    public static final G2.a f8441a = new G2.a("InvalidModuleNotifier");

    public static final D3.c a(AbstractC0442z abstractC0442z, InterfaceC0764h interfaceC0764h, int i5) {
        if (interfaceC0764h == null || g4.j.f(interfaceC0764h)) {
            return null;
        }
        int size = interfaceC0764h.r().size() + i5;
        if (interfaceC0764h.A()) {
            List listSubList = abstractC0442z.s0().subList(i5, size);
            InterfaceC0766j interfaceC0766jL = interfaceC0764h.l();
            return new D3.c(interfaceC0764h, listSubList, a(abstractC0442z, interfaceC0766jL instanceof InterfaceC0764h ? (InterfaceC0764h) interfaceC0766jL : null, size));
        }
        if (size != abstractC0442z.s0().size()) {
            Q3.f.p(interfaceC0764h);
        }
        return new D3.c(interfaceC0764h, abstractC0442z.s0().subList(i5, abstractC0442z.s0().size()), (D3.c) null);
    }

    public static final void b(InterfaceC0743E interfaceC0743E, N3.c cVar, ArrayList arrayList) {
        AbstractC0219i.e("<this>", interfaceC0743E);
        AbstractC0219i.e("fqName", cVar);
        if (interfaceC0743E instanceof InterfaceC0746H) {
            ((InterfaceC0746H) interfaceC0743E).c(cVar, arrayList);
        } else {
            arrayList.addAll(interfaceC0743E.a(cVar));
        }
    }

    public static final List c(InterfaceC0764h interfaceC0764h) {
        List listK;
        Object next;
        e4.J jI;
        AbstractC0219i.e("<this>", interfaceC0764h);
        List listR = interfaceC0764h.r();
        AbstractC0219i.d("declaredTypeParameters", listR);
        if (!interfaceC0764h.A() && !(interfaceC0764h.l() instanceof InterfaceC0758b)) {
            return listR;
        }
        int i5 = U3.f.f2570a;
        U3.e eVar = U3.e.f2569d;
        o4.k kVarH0 = o4.m.h0(interfaceC0764h, eVar);
        List listK0 = o4.m.k0(new o4.h(new o4.f(new P2.l(2, kVarH0 instanceof o4.c ? ((o4.c) kVarH0).a() : new o4.b(kVarH0, 1)), true, C0774r.f8436h), C0774r.f8437i, o4.p.f8320l));
        o4.k kVarH02 = o4.m.h0(interfaceC0764h, eVar);
        Iterator it = (kVarH02 instanceof o4.c ? ((o4.c) kVarH02).a() : new o4.b(kVarH02, 1)).iterator();
        while (true) {
            listK = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof InterfaceC0761e) {
                break;
            }
        }
        InterfaceC0761e interfaceC0761e = (InterfaceC0761e) next;
        if (interfaceC0761e != null && (jI = interfaceC0761e.I()) != null) {
            listK = jI.k();
        }
        if (listK == null) {
            listK = P2.u.f2163d;
        }
        if (listK0.isEmpty() && listK.isEmpty()) {
            List listR2 = interfaceC0764h.r();
            AbstractC0219i.d("declaredTypeParameters", listR2);
            return listR2;
        }
        ArrayList arrayListG0 = P2.m.G0(listK0, listK);
        ArrayList arrayList = new ArrayList(P2.o.l0(arrayListG0));
        Iterator it2 = arrayListG0.iterator();
        while (it2.hasNext()) {
            InterfaceC0755Q interfaceC0755Q = (InterfaceC0755Q) it2.next();
            AbstractC0219i.d("it", interfaceC0755Q);
            arrayList.add(new C0760d(interfaceC0755Q, interfaceC0764h, listR.size()));
        }
        return P2.m.G0(listR, arrayList);
    }

    public static final InterfaceC0761e d(InterfaceC0781y interfaceC0781y, N3.b bVar) {
        AbstractC0219i.e("<this>", interfaceC0781y);
        AbstractC0219i.e("classId", bVar);
        InterfaceC0763g interfaceC0763gE = e(interfaceC0781y, bVar);
        if (interfaceC0763gE instanceof InterfaceC0761e) {
            return (InterfaceC0761e) interfaceC0763gE;
        }
        return null;
    }

    public static final InterfaceC0763g e(InterfaceC0781y interfaceC0781y, N3.b bVar) {
        AbstractC0219i.e("<this>", interfaceC0781y);
        AbstractC0219i.e("classId", bVar);
        if (interfaceC0781y.y0(Q3.q.f2361a) != null) {
            throw new ClassCastException();
        }
        N3.c cVarG = bVar.g();
        AbstractC0219i.d("classId.packageFqName", cVarG);
        InterfaceC0747I interfaceC0747ID = interfaceC0781y.D(cVarG);
        List listE = bVar.h().f1834a.e();
        X3.j jVar = ((s3.y) interfaceC0747ID).f8903j;
        Object objU0 = P2.m.u0(listE);
        AbstractC0219i.d("segments.first()", objU0);
        EnumC0915b enumC0915b = EnumC0915b.f9320j;
        InterfaceC0763g interfaceC0763gG = jVar.g((N3.f) objU0, enumC0915b);
        if (interfaceC0763gG == null) {
            return null;
        }
        for (N3.f fVar : listE.subList(1, listE.size())) {
            if (!(interfaceC0763gG instanceof InterfaceC0761e)) {
                return null;
            }
            X3.n nVarR = ((InterfaceC0761e) interfaceC0763gG).R();
            AbstractC0219i.d("name", fVar);
            InterfaceC0763g interfaceC0763gG2 = nVarR.g(fVar, enumC0915b);
            interfaceC0763gG = interfaceC0763gG2 instanceof InterfaceC0761e ? (InterfaceC0761e) interfaceC0763gG2 : null;
            if (interfaceC0763gG == null) {
                return null;
            }
        }
        return interfaceC0763gG;
    }

    public static final InterfaceC0761e f(InterfaceC0781y interfaceC0781y, N3.b bVar, com.google.firebase.messaging.q qVar) {
        AbstractC0219i.e("<this>", interfaceC0781y);
        AbstractC0219i.e("classId", bVar);
        AbstractC0219i.e("notFoundClasses", qVar);
        InterfaceC0761e interfaceC0761eD = d(interfaceC0781y, bVar);
        return interfaceC0761eD != null ? interfaceC0761eD : qVar.t(bVar, o4.m.k0(o4.m.i0(o4.m.h0(bVar, C0773q.f8433l), C0774r.f8434e)));
    }

    public static final InterfaceC0763g g(InterfaceC0766j interfaceC0766j) {
        AbstractC0219i.e("<this>", interfaceC0766j);
        InterfaceC0766j interfaceC0766jL = interfaceC0766j.l();
        if (interfaceC0766jL == null || (interfaceC0766j instanceof InterfaceC0742D)) {
            return null;
        }
        if (!(interfaceC0766jL.l() instanceof InterfaceC0742D)) {
            return g(interfaceC0766jL);
        }
        if (interfaceC0766jL instanceof InterfaceC0763g) {
            return (InterfaceC0763g) interfaceC0766jL;
        }
        return null;
    }

    public static final boolean h(InterfaceC0743E interfaceC0743E, N3.c cVar) {
        AbstractC0219i.e("<this>", interfaceC0743E);
        AbstractC0219i.e("fqName", cVar);
        return interfaceC0743E instanceof InterfaceC0746H ? ((InterfaceC0746H) interfaceC0743E).b(cVar) : i(interfaceC0743E, cVar).isEmpty();
    }

    public static final ArrayList i(InterfaceC0743E interfaceC0743E, N3.c cVar) {
        AbstractC0219i.e("<this>", interfaceC0743E);
        AbstractC0219i.e("fqName", cVar);
        ArrayList arrayList = new ArrayList();
        b(interfaceC0743E, cVar, arrayList);
        return arrayList;
    }

    public static final InterfaceC0761e j(C0826B c0826b, N3.c cVar) {
        InterfaceC0763g interfaceC0763gG;
        X3.n nVarR;
        EnumC0915b enumC0915b = EnumC0915b.f9315d;
        AbstractC0219i.e("<this>", c0826b);
        AbstractC0219i.e("fqName", cVar);
        if (cVar.d()) {
            return null;
        }
        N3.c cVarE = cVar.e();
        AbstractC0219i.d("fqName.parent()", cVarE);
        s3.y yVar = (s3.y) c0826b.D(cVarE);
        N3.f fVarF = cVar.f();
        AbstractC0219i.d("fqName.shortName()", fVarF);
        InterfaceC0763g interfaceC0763gG2 = yVar.f8903j.g(fVarF, enumC0915b);
        InterfaceC0761e interfaceC0761e = interfaceC0763gG2 instanceof InterfaceC0761e ? (InterfaceC0761e) interfaceC0763gG2 : null;
        if (interfaceC0761e != null) {
            return interfaceC0761e;
        }
        N3.c cVarE2 = cVar.e();
        AbstractC0219i.d("fqName.parent()", cVarE2);
        InterfaceC0761e interfaceC0761eJ = j(c0826b, cVarE2);
        if (interfaceC0761eJ == null || (nVarR = interfaceC0761eJ.R()) == null) {
            interfaceC0763gG = null;
        } else {
            N3.f fVarF2 = cVar.f();
            AbstractC0219i.d("fqName.shortName()", fVarF2);
            interfaceC0763gG = nVarR.g(fVarF2, enumC0915b);
        }
        if (interfaceC0763gG instanceof InterfaceC0761e) {
            return (InterfaceC0761e) interfaceC0763gG;
        }
        return null;
    }
}
