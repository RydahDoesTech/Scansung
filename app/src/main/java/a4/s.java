package a4;

import I3.C0030l;
import I3.C0042y;
import I3.EnumC0043z;
import I3.G;
import I3.Q;
import I3.Z;
import I3.f0;
import O3.AbstractC0081m;
import b3.AbstractC0219i;
import e1.AbstractC0415a;
import e4.AbstractC0438v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p3.C0753O;
import p3.InterfaceC0742D;
import p3.InterfaceC0752N;
import p3.InterfaceC0758b;
import p3.InterfaceC0761e;
import p3.InterfaceC0766j;
import q3.C0796f;
import q3.C0797g;
import q3.InterfaceC0798h;
import s3.AbstractC0828D;
import s3.C0835K;
import s3.C0836L;
import s3.C0843T;
import s3.C0864t;
import s3.C0867w;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final k f3085a;

    /* renamed from: b, reason: collision with root package name */
    public final E0.d f3086b;

    public s(k kVar) {
        AbstractC0219i.e("c", kVar);
        this.f3085a = kVar;
        i iVar = (i) kVar.f3058d;
        this.f3086b = new E0.d(iVar.f3038b, iVar.f3047l);
    }

    public final v a(InterfaceC0766j interfaceC0766j) {
        if (interfaceC0766j instanceof InterfaceC0742D) {
            N3.c cVar = ((AbstractC0828D) ((InterfaceC0742D) interfaceC0766j)).f8745h;
            k kVar = this.f3085a;
            return new u(cVar, (K3.f) kVar.f3059e, (K3.g) kVar.f3060g, (G3.h) kVar.f3063j);
        }
        if (interfaceC0766j instanceof c4.i) {
            return ((c4.i) interfaceC0766j).f5175y;
        }
        return null;
    }

    public final InterfaceC0798h b(AbstractC0081m abstractC0081m, int i5, int i6) {
        return !K3.e.f1674c.c(i5).booleanValue() ? C0797g.f8481a : new c4.u(((i) this.f3085a.f3058d).f3037a, new o(this, abstractC0081m, i6, 0));
    }

    public final InterfaceC0798h c(G g5, boolean z4) {
        return !K3.e.f1674c.c(g5.f1001g).booleanValue() ? C0797g.f8481a : new c4.u(((i) this.f3085a.f3058d).f3037a, new p(this, z4, g5));
    }

    public final c4.c d(C0030l c0030l, boolean z4) {
        k kVar = this.f3085a;
        InterfaceC0766j interfaceC0766j = (InterfaceC0766j) kVar.f;
        AbstractC0219i.c("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor", interfaceC0766j);
        InterfaceC0761e interfaceC0761e = (InterfaceC0761e) interfaceC0766j;
        c4.c cVar = new c4.c(interfaceC0761e, null, b(c0030l, c0030l.f1314g, 1), z4, 1, c0030l, (K3.f) kVar.f3059e, (K3.g) kVar.f3060g, (K3.h) kVar.f3061h, (G3.h) kVar.f3063j, null);
        k kVarB = kVar.b(cVar, P2.u.f2163d, (K3.f) kVar.f3059e, (K3.g) kVar.f3060g, (K3.h) kVar.f3061h, (K3.a) kVar.f3062i);
        List list = c0030l.f1315h;
        AbstractC0219i.d("proto.valueParameterList", list);
        cVar.c1(((s) kVarB.f3065l).g(list, c0030l, 1), g3.y.q((f0) K3.e.f1675d.c(c0030l.f1314g)));
        cVar.Y0(interfaceC0761e.q());
        cVar.f8889u = interfaceC0761e.z();
        cVar.f8893y = !K3.e.n.c(c0030l.f1314g).booleanValue();
        return cVar;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Map] */
    public final c4.r e(C0042y c0042y) {
        int i5;
        AbstractC0438v abstractC0438vG;
        AbstractC0219i.e("proto", c0042y);
        int i6 = 1;
        if ((c0042y.f & 1) == 1) {
            i5 = c0042y.f1394g;
        } else {
            int i7 = c0042y.f1395h;
            i5 = ((i7 >> 8) << 6) + (i7 & 63);
        }
        int i8 = i5;
        InterfaceC0798h interfaceC0798hB = b(c0042y, i8, 1);
        boolean zP = c0042y.p();
        InterfaceC0798h interfaceC0798h = C0797g.f8481a;
        k kVar = this.f3085a;
        InterfaceC0798h aVar = (zP || (c0042y.f & 64) == 64) ? new c4.a(((i) kVar.f3058d).f3037a, new o(this, c0042y, i6, 1)) : interfaceC0798h;
        N3.c cVarG = U3.f.g((InterfaceC0766j) kVar.f);
        int i9 = c0042y.f1396i;
        K3.f fVar = (K3.f) kVar.f3059e;
        InterfaceC0798h interfaceC0798h2 = aVar;
        c4.r rVar = new c4.r((InterfaceC0766j) kVar.f, null, interfaceC0798hB, AbstractC0415a.x(fVar, c0042y.f1396i), g3.y.Q((EnumC0043z) K3.e.f1684o.c(i8)), c0042y, (K3.f) kVar.f3059e, (K3.g) kVar.f3060g, cVarG.c(AbstractC0415a.x(fVar, i9)).equals(y.f3100a) ? K3.h.f1697a : (K3.h) kVar.f3061h, (G3.h) kVar.f3063j, null);
        List list = c0042y.f1399l;
        AbstractC0219i.d("proto.typeParameterList", list);
        k kVarB = kVar.b(rVar, list, (K3.f) kVar.f3059e, (K3.g) kVar.f3060g, (K3.h) kVar.f3061h, (K3.a) kVar.f3062i);
        K3.g gVar = (K3.g) kVar.f3060g;
        Q qT = g3.y.T(c0042y, gVar);
        G3.c cVar = (G3.c) kVarB.f3064k;
        C0867w c0867wK = (qT == null || (abstractC0438vG = cVar.g(qT)) == null) ? null : Q3.q.k(rVar, abstractC0438vG, interfaceC0798h2);
        InterfaceC0766j interfaceC0766j = (InterfaceC0766j) kVar.f;
        InterfaceC0761e interfaceC0761e = interfaceC0766j instanceof InterfaceC0761e ? (InterfaceC0761e) interfaceC0766j : null;
        C0867w c0867wG0 = interfaceC0761e != null ? interfaceC0761e.G0() : null;
        AbstractC0219i.e("typeTable", gVar);
        List list2 = c0042y.f1401o;
        if (list2.isEmpty()) {
            list2 = null;
        }
        if (list2 == null) {
            List<Integer> list3 = c0042y.f1402p;
            AbstractC0219i.d("contextReceiverTypeIdList", list3);
            ArrayList arrayList = new ArrayList(P2.o.l0(list3));
            for (Integer num : list3) {
                AbstractC0219i.d("it", num);
                arrayList.add(gVar.a(num.intValue()));
            }
            list2 = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        for (Object obj : list2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                P2.n.k0();
                throw null;
            }
            C0867w c0867wE = Q3.q.e(rVar, cVar.g((Q) obj), null, interfaceC0798h, i10);
            if (c0867wE != null) {
                arrayList2.add(c0867wE);
            }
            i10 = i11;
        }
        List listO0 = P2.m.O0(cVar.f745k.values());
        List list4 = c0042y.f1404r;
        AbstractC0219i.d("proto.valueParameterList", list4);
        rVar.c1(c0867wK, c0867wG0, arrayList2, listO0, ((s) kVarB.f3065l).g(list4, c0042y, 1), cVar.g(g3.y.U(c0042y, gVar)), j.e((I3.A) K3.e.f1676e.c(i8)), g3.y.q((f0) K3.e.f1675d.c(i8)), P2.v.f2164d);
        rVar.f8884p = K3.e.f1685p.c(i8).booleanValue();
        rVar.f8885q = K3.e.f1686q.c(i8).booleanValue();
        rVar.f8886r = K3.e.f1689t.c(i8).booleanValue();
        rVar.f8887s = K3.e.f1687r.c(i8).booleanValue();
        rVar.f8888t = K3.e.f1688s.c(i8).booleanValue();
        rVar.f8892x = K3.e.f1690u.c(i8).booleanValue();
        rVar.f8889u = K3.e.f1691v.c(i8).booleanValue();
        rVar.f8893y = !K3.e.f1692w.c(i8).booleanValue();
        ((i) kVar.f3058d).f3048m.getClass();
        AbstractC0219i.e("typeTable", gVar);
        return rVar;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Map] */
    public final c4.q f(G g5) {
        int i5;
        G g6;
        s sVar;
        InterfaceC0798h aVar;
        k kVar;
        Q qA;
        K3.b bVar;
        K3.b bVar2;
        K3.c cVar;
        K3.c cVar2;
        G g7;
        k kVar2;
        K3.b bVar3;
        C0835K c0835k;
        G g8;
        C0835K c0835k2;
        s sVar2;
        C0836L c0836lG;
        C0835K c0835kF;
        AbstractC0438v abstractC0438vG;
        AbstractC0219i.e("proto", g5);
        if ((g5.f & 1) == 1) {
            i5 = g5.f1001g;
        } else {
            int i6 = g5.f1002h;
            i5 = ((i6 >> 8) << 6) + (i6 & 63);
        }
        int i7 = i5;
        k kVar3 = this.f3085a;
        c4.q qVar = new c4.q((InterfaceC0766j) kVar3.f, null, b(g5, i7, 2), j.e((I3.A) K3.e.f1676e.c(i7)), g3.y.q((f0) K3.e.f1675d.c(i7)), K3.e.f1693x.c(i7).booleanValue(), AbstractC0415a.x((K3.f) kVar3.f3059e, g5.f1003i), g3.y.Q((EnumC0043z) K3.e.f1684o.c(i7)), K3.e.f1661B.c(i7).booleanValue(), K3.e.f1660A.c(i7).booleanValue(), K3.e.f1663D.c(i7).booleanValue(), K3.e.E.c(i7).booleanValue(), K3.e.f1664F.c(i7).booleanValue(), g5, (K3.f) kVar3.f3059e, (K3.g) kVar3.f3060g, (K3.h) kVar3.f3061h, (G3.h) kVar3.f3063j);
        List list = g5.f1006l;
        AbstractC0219i.d("proto.typeParameterList", list);
        k kVarB = kVar3.b(qVar, list, (K3.f) kVar3.f3059e, (K3.g) kVar3.f3060g, (K3.h) kVar3.f3061h, (K3.a) kVar3.f3062i);
        boolean zBooleanValue = K3.e.f1694y.c(i7).booleanValue();
        C0796f c0796f = C0797g.f8481a;
        int i8 = 3;
        if (zBooleanValue && (g5.p() || (g5.f & 64) == 64)) {
            d4.o oVar = ((i) kVar3.f3058d).f3037a;
            g6 = g5;
            sVar = this;
            aVar = new c4.a(oVar, new o(sVar, g6, i8, 1));
        } else {
            g6 = g5;
            sVar = this;
            aVar = c0796f;
        }
        K3.g gVar = (K3.g) kVar3.f3060g;
        Q qV = g3.y.V(g6, gVar);
        G3.c cVar3 = (G3.c) kVarB.f3064k;
        AbstractC0438v abstractC0438vG2 = cVar3.g(qV);
        List listO0 = P2.m.O0(cVar3.f745k.values());
        InterfaceC0766j interfaceC0766j = (InterfaceC0766j) kVar3.f;
        InterfaceC0761e interfaceC0761e = interfaceC0766j instanceof InterfaceC0761e ? (InterfaceC0761e) interfaceC0766j : null;
        C0867w c0867wG0 = interfaceC0761e != null ? interfaceC0761e.G0() : null;
        AbstractC0219i.e("typeTable", gVar);
        if (g5.p()) {
            qA = g6.f1007m;
            kVar = kVar3;
        } else {
            kVar = kVar3;
            qA = (g6.f & 64) == 64 ? gVar.a(g6.n) : null;
        }
        C0867w c0867wK = (qA == null || (abstractC0438vG = cVar3.g(qA)) == null) ? null : Q3.q.k(qVar, abstractC0438vG, aVar);
        AbstractC0219i.e("typeTable", gVar);
        List list2 = g6.f1008o;
        if (list2.isEmpty()) {
            list2 = null;
        }
        if (list2 == null) {
            List list3 = g6.f1009p;
            AbstractC0219i.d("contextReceiverTypeIdList", list3);
            ArrayList arrayList = new ArrayList(P2.o.l0(list3));
            for (Iterator it = list3.iterator(); it.hasNext(); it = it) {
                Integer num = (Integer) it.next();
                AbstractC0219i.d("it", num);
                arrayList.add(gVar.a(num.intValue()));
            }
            list2 = arrayList;
        }
        ArrayList arrayList2 = new ArrayList(P2.o.l0(list2));
        Iterator it2 = list2.iterator();
        int i9 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i10 = i9 + 1;
            if (i9 < 0) {
                P2.n.k0();
                throw null;
            }
            arrayList2.add(Q3.q.e(qVar, cVar3.g((Q) next), null, c0796f, i9));
            it2 = it2;
            i9 = i10;
        }
        qVar.V0(abstractC0438vG2, listO0, c0867wG0, c0867wK, arrayList2);
        K3.b bVar4 = K3.e.f1674c;
        boolean zBooleanValue2 = bVar4.c(i7).booleanValue();
        K3.c cVar4 = K3.e.f1675d;
        f0 f0Var = (f0) cVar4.c(i7);
        K3.c cVar5 = K3.e.f1676e;
        I3.A a5 = (I3.A) cVar5.c(i7);
        if (f0Var == null) {
            K3.e.a(10);
            throw null;
        }
        if (a5 == null) {
            K3.e.a(11);
            throw null;
        }
        int iA = (zBooleanValue2 ? 1 << bVar4.f1658a : 0) | (a5.a() << cVar5.f1658a) | (f0Var.a() << cVar4.f1658a);
        K3.b bVar5 = K3.e.f1668J;
        bVar5.getClass();
        K3.b bVar6 = K3.e.f1669K;
        bVar6.getClass();
        K3.b bVar7 = K3.e.f1670L;
        bVar7.getClass();
        C0753O c0753o = InterfaceC0752N.f8400b;
        if (zBooleanValue) {
            int i11 = (g6.f & 256) == 256 ? g6.f1012s : iA;
            boolean zBooleanValue3 = bVar5.c(i11).booleanValue();
            boolean zBooleanValue4 = bVar6.c(i11).booleanValue();
            boolean zBooleanValue5 = bVar7.c(i11).booleanValue();
            InterfaceC0798h interfaceC0798hB = sVar.b(g6, i11, 3);
            if (zBooleanValue3) {
                bVar = bVar7;
                bVar2 = bVar5;
                cVar = cVar5;
                kVar2 = kVarB;
                bVar3 = bVar6;
                cVar2 = cVar4;
                g7 = g6;
                c0835kF = new C0835K(qVar, interfaceC0798hB, j.e((I3.A) cVar5.c(i11)), g3.y.q((f0) cVar4.c(i11)), !zBooleanValue3, zBooleanValue4, zBooleanValue5, qVar.i0(), null, c0753o);
            } else {
                bVar = bVar7;
                bVar2 = bVar5;
                cVar = cVar5;
                cVar2 = cVar4;
                g7 = g6;
                kVar2 = kVarB;
                bVar3 = bVar6;
                c0835kF = Q3.q.f(qVar, interfaceC0798hB);
            }
            c0835kF.R0(qVar.o());
            c0835k = c0835kF;
        } else {
            bVar = bVar7;
            bVar2 = bVar5;
            cVar = cVar5;
            cVar2 = cVar4;
            g7 = g6;
            kVar2 = kVarB;
            bVar3 = bVar6;
            c0835k = null;
        }
        if (K3.e.f1695z.c(i7).booleanValue()) {
            int i12 = (g7.f & 512) == 512 ? g7.f1013t : iA;
            boolean zBooleanValue6 = bVar2.c(i12).booleanValue();
            boolean zBooleanValue7 = bVar3.c(i12).booleanValue();
            boolean zBooleanValue8 = bVar.c(i12).booleanValue();
            g8 = g7;
            sVar2 = this;
            InterfaceC0798h interfaceC0798hB2 = sVar2.b(g8, i12, 4);
            if (zBooleanValue6) {
                c0835k2 = c0835k;
                C0836L c0836l = new C0836L(qVar, interfaceC0798hB2, j.e((I3.A) cVar.c(i12)), g3.y.q((f0) cVar2.c(i12)), !zBooleanValue6, zBooleanValue7, zBooleanValue8, qVar.i0(), null, c0753o);
                k kVar4 = kVar2;
                C0843T c0843t = (C0843T) P2.m.J0(((s) kVar4.b(c0836l, P2.u.f2163d, (K3.f) kVar4.f3059e, (K3.g) kVar4.f3060g, (K3.h) kVar4.f3061h, (K3.a) kVar4.f3062i).f3065l).g(g3.y.N(g8.f1011r), g8, 4));
                if (c0843t == null) {
                    C0836L.H0(6);
                    throw null;
                }
                c0836l.f8790p = c0843t;
                c0836lG = c0836l;
            } else {
                c0835k2 = c0835k;
                c0836lG = Q3.q.g(qVar, interfaceC0798hB2);
            }
        } else {
            g8 = g7;
            c0835k2 = c0835k;
            sVar2 = this;
            c0836lG = null;
        }
        if (K3.e.f1662C.c(i7).booleanValue()) {
            qVar.T0(null, new q(sVar2, g8, qVar, 1));
        }
        InterfaceC0766j interfaceC0766j2 = (InterfaceC0766j) kVar.f;
        InterfaceC0761e interfaceC0761e2 = interfaceC0766j2 instanceof InterfaceC0761e ? (InterfaceC0761e) interfaceC0766j2 : null;
        if ((interfaceC0761e2 != null ? interfaceC0761e2.L() : 0) == 5) {
            qVar.T0(null, new q(sVar2, g8, qVar, 3));
        }
        qVar.S0(c0835k2, c0836lG, new C0864t(sVar2.c(g8, false)), new C0864t(sVar2.c(g8, true)));
        return qVar;
    }

    public final List g(List list, AbstractC0081m abstractC0081m, int i5) {
        k kVar = this.f3085a;
        InterfaceC0766j interfaceC0766j = (InterfaceC0766j) kVar.f;
        AbstractC0219i.c("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor", interfaceC0766j);
        InterfaceC0758b interfaceC0758b = (InterfaceC0758b) interfaceC0766j;
        InterfaceC0766j interfaceC0766jL = interfaceC0758b.l();
        AbstractC0219i.d("callableDescriptor.containingDeclaration", interfaceC0766jL);
        v vVarA = a(interfaceC0766jL);
        ArrayList arrayList = new ArrayList(P2.o.l0(list));
        int i6 = 0;
        for (Object obj : list) {
            int i7 = i6 + 1;
            if (i6 < 0) {
                P2.n.k0();
                throw null;
            }
            Z z4 = (Z) obj;
            int i8 = (z4.f & 1) == 1 ? z4.f1151g : 0;
            InterfaceC0798h uVar = (vVarA == null || !K3.e.f1674c.c(i8).booleanValue()) ? C0797g.f8481a : new c4.u(((i) kVar.f3058d).f3037a, new r(this, vVarA, abstractC0081m, i5, i6, z4));
            N3.f fVarX = AbstractC0415a.x((K3.f) kVar.f3059e, z4.f1152h);
            K3.g gVar = (K3.g) kVar.f3060g;
            Q qE0 = g3.y.e0(z4, gVar);
            G3.c cVar = (G3.c) kVar.f3064k;
            AbstractC0438v abstractC0438vG = cVar.g(qE0);
            boolean zBooleanValue = K3.e.f1665G.c(i8).booleanValue();
            boolean zBooleanValue2 = K3.e.f1666H.c(i8).booleanValue();
            boolean zBooleanValue3 = K3.e.f1667I.c(i8).booleanValue();
            AbstractC0219i.e("typeTable", gVar);
            int i9 = z4.f;
            Q qA = (i9 & 16) == 16 ? z4.f1155k : (i9 & 32) == 32 ? gVar.a(z4.f1156l) : null;
            AbstractC0438v abstractC0438vG2 = qA != null ? cVar.g(qA) : null;
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new C0843T(interfaceC0758b, null, i6, uVar, fVarX, abstractC0438vG, zBooleanValue, zBooleanValue2, zBooleanValue3, abstractC0438vG2, InterfaceC0752N.f8400b));
            arrayList = arrayList2;
            i6 = i7;
        }
        return P2.m.O0(arrayList);
    }
}
