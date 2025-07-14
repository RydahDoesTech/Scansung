package Q3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import e4.AbstractC0420c;
import e4.AbstractC0438v;
import e4.C0421d;
import e4.I;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ServiceLoader;
import k.Q0;
import p3.AbstractC0771o;
import p3.C0770n;
import p3.InterfaceC0749K;
import p3.InterfaceC0750L;
import p3.InterfaceC0755Q;
import p3.InterfaceC0758b;
import p3.InterfaceC0759c;
import p3.InterfaceC0761e;
import p3.InterfaceC0766j;
import p3.InterfaceC0776t;
import s3.AbstractC0832H;
import s3.AbstractC0866v;
import s3.C0834J;
import s3.C0836L;
import s3.C0843T;
import s3.C0867w;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final List f2357b = P2.m.O0(ServiceLoader.load(i.class, i.class.getClassLoader()));

    /* renamed from: c, reason: collision with root package name */
    public static final p f2358c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f2359d;

    /* renamed from: a, reason: collision with root package name */
    public final f4.c f2360a;

    static {
        d dVar = new d();
        f2359d = dVar;
        f2358c = new p(dVar);
    }

    public p(f4.c cVar) {
        if (cVar != null) {
            this.f2360a = cVar;
        } else {
            a(5);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(int r25) {
        /*
            Method dump skipped, instructions count: 1320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q3.p.a(int):void");
    }

    public static boolean b(AbstractC0438v abstractC0438v, AbstractC0438v abstractC0438v2, I i5) {
        if (abstractC0438v == null) {
            a(46);
            throw null;
        }
        if (abstractC0438v2 == null) {
            a(47);
            throw null;
        }
        if (AbstractC0420c.i(abstractC0438v) && AbstractC0420c.i(abstractC0438v2)) {
            return true;
        }
        return C0421d.g(i5, abstractC0438v.L0(), abstractC0438v2.L0());
    }

    public static void c(InterfaceC0759c interfaceC0759c, LinkedHashSet linkedHashSet) {
        if (interfaceC0759c == null) {
            a(17);
            throw null;
        }
        if (interfaceC0759c.i0() != 2) {
            linkedHashSet.add(interfaceC0759c);
            return;
        }
        if (interfaceC0759c.p().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + interfaceC0759c);
        }
        Iterator it = interfaceC0759c.p().iterator();
        while (it.hasNext()) {
            c((InterfaceC0759c) it.next(), linkedHashSet);
        }
    }

    public static ArrayList d(InterfaceC0758b interfaceC0758b) {
        C0867w c0867wB0 = interfaceC0758b.b0();
        ArrayList arrayList = new ArrayList();
        if (c0867wB0 != null) {
            arrayList.add(c0867wB0.d());
        }
        Iterator it = interfaceC0758b.v0().iterator();
        while (it.hasNext()) {
            arrayList.add(((C0843T) it.next()).d());
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x016c, code lost:
    
        if (r1 == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x016e, code lost:
    
        r0 = p3.AbstractC0771o.f8425h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0171, code lost:
    
        r0 = p3.AbstractC0771o.f8424g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0173, code lost:
    
        r12 = ((p3.InterfaceC0759c) s(r11, new Q3.l(0))).a0(r12, r7, r0);
        r13.p(r12, r11);
        r13.b(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0189, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(java.util.Collection r11, p3.InterfaceC0761e r12, Q3.q r13) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q3.p.e(java.util.Collection, p3.e, Q3.q):void");
    }

    public static ArrayList g(Object obj, LinkedList linkedList, InterfaceC0107b interfaceC0107b, InterfaceC0107b interfaceC0107b2) {
        if (obj == null) {
            a(99);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        InterfaceC0758b interfaceC0758b = (InterfaceC0758b) interfaceC0107b.d(obj);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            InterfaceC0758b interfaceC0758b2 = (InterfaceC0758b) interfaceC0107b.d(next);
            if (obj == next) {
                it.remove();
            } else {
                int iJ = j(interfaceC0758b, interfaceC0758b2);
                if (iJ == 1) {
                    arrayList.add(next);
                    it.remove();
                } else if (iJ == 3) {
                    interfaceC0107b2.d(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static o i(InterfaceC0758b interfaceC0758b, InterfaceC0758b interfaceC0758b2) {
        boolean z4;
        if (interfaceC0758b == null) {
            a(40);
            throw null;
        }
        if (interfaceC0758b2 == null) {
            a(41);
            throw null;
        }
        boolean z5 = interfaceC0758b instanceof InterfaceC0776t;
        if ((z5 && !(interfaceC0758b2 instanceof InterfaceC0776t)) || (((z4 = interfaceC0758b instanceof InterfaceC0750L)) && !(interfaceC0758b2 instanceof InterfaceC0750L))) {
            return o.d("Member kind mismatch");
        }
        if (!z5 && !z4) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + interfaceC0758b);
        }
        if (!interfaceC0758b.getName().equals(interfaceC0758b2.getName())) {
            return o.d("Name mismatch");
        }
        o oVarD = (interfaceC0758b.b0() == null) != (interfaceC0758b2.b0() == null) ? o.d("Receiver presence mismatch") : interfaceC0758b.v0().size() != interfaceC0758b2.v0().size() ? o.d("Value parameter number mismatch") : null;
        if (oVarD != null) {
            return oVarD;
        }
        return null;
    }

    public static int j(InterfaceC0758b interfaceC0758b, InterfaceC0758b interfaceC0758b2) {
        p pVar = f2358c;
        int iC = pVar.l(interfaceC0758b2, interfaceC0758b, null).c();
        int iC2 = pVar.m(interfaceC0758b, interfaceC0758b2, null, false).c();
        if (iC == 1 && iC2 == 1) {
            return 1;
        }
        return (iC == 3 || iC2 == 3) ? 3 : 2;
    }

    public static boolean k(InterfaceC0758b interfaceC0758b, InterfaceC0758b interfaceC0758b2) {
        if (interfaceC0758b == null) {
            a(67);
            throw null;
        }
        if (interfaceC0758b2 == null) {
            a(68);
            throw null;
        }
        AbstractC0438v abstractC0438vO = interfaceC0758b.o();
        AbstractC0438v abstractC0438vO2 = interfaceC0758b2.o();
        if (!p(interfaceC0758b, interfaceC0758b2)) {
            return false;
        }
        I iF = f2358c.f(interfaceC0758b.u(), interfaceC0758b2.u());
        if (interfaceC0758b instanceof InterfaceC0776t) {
            return o(interfaceC0758b, abstractC0438vO, interfaceC0758b2, abstractC0438vO2, iF);
        }
        if (!(interfaceC0758b instanceof InterfaceC0750L)) {
            throw new IllegalArgumentException("Unexpected callable: " + interfaceC0758b.getClass());
        }
        InterfaceC0750L interfaceC0750L = (InterfaceC0750L) interfaceC0758b;
        InterfaceC0750L interfaceC0750L2 = (InterfaceC0750L) interfaceC0758b2;
        C0836L c0836lE = interfaceC0750L.e();
        C0836L c0836lE2 = interfaceC0750L2.e();
        if ((c0836lE == null || c0836lE2 == null) ? true : p(c0836lE, c0836lE2)) {
            return (interfaceC0750L.T() && interfaceC0750L2.T()) ? C0421d.g(iF, abstractC0438vO.L0(), abstractC0438vO2.L0()) : (interfaceC0750L.T() || !interfaceC0750L2.T()) && o(interfaceC0758b, abstractC0438vO, interfaceC0758b2, abstractC0438vO2, iF);
        }
        return false;
    }

    public static boolean o(InterfaceC0758b interfaceC0758b, AbstractC0438v abstractC0438v, InterfaceC0758b interfaceC0758b2, AbstractC0438v abstractC0438v2, I i5) {
        if (interfaceC0758b == null) {
            a(73);
            throw null;
        }
        if (abstractC0438v == null) {
            a(74);
            throw null;
        }
        if (interfaceC0758b2 == null) {
            a(75);
            throw null;
        }
        if (abstractC0438v2 != null) {
            return C0421d.n(C0421d.f6675a, i5, abstractC0438v.L0(), abstractC0438v2.L0());
        }
        a(76);
        throw null;
    }

    public static boolean p(InterfaceC0758b interfaceC0758b, InterfaceC0758b interfaceC0758b2) {
        if (interfaceC0758b == null) {
            a(69);
            throw null;
        }
        if (interfaceC0758b2 != null) {
            Integer numB = AbstractC0771o.b(interfaceC0758b.b(), interfaceC0758b2.b());
            return numB == null || numB.intValue() >= 0;
        }
        a(70);
        throw null;
    }

    public static boolean q(InterfaceC0758b interfaceC0758b, InterfaceC0758b interfaceC0758b2) {
        if (interfaceC0758b == null) {
            a(13);
            throw null;
        }
        if (interfaceC0758b2 == null) {
            a(14);
            throw null;
        }
        boolean zEquals = interfaceC0758b.equals(interfaceC0758b2);
        d dVar = d.f2340a;
        if (!zEquals && dVar.c(interfaceC0758b.a(), interfaceC0758b2.a(), false, true)) {
            return true;
        }
        InterfaceC0758b interfaceC0758bA = interfaceC0758b2.a();
        int i5 = f.f2341a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        f.b(interfaceC0758b.a(), linkedHashSet);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (dVar.c(interfaceC0758bA, (InterfaceC0758b) it.next(), false, true)) {
                return true;
            }
        }
        return false;
    }

    public static void r(InterfaceC0759c interfaceC0759c, InterfaceC0107b interfaceC0107b) {
        C0770n c0770n;
        C0770n c0770nF;
        C0770n c0770n2;
        if (interfaceC0759c == null) {
            a(107);
            throw null;
        }
        for (InterfaceC0759c interfaceC0759c2 : interfaceC0759c.p()) {
            if (interfaceC0759c2.b() == AbstractC0771o.f8424g) {
                r(interfaceC0759c2, interfaceC0107b);
            }
        }
        if (interfaceC0759c.b() != AbstractC0771o.f8424g) {
            return;
        }
        Collection<InterfaceC0759c> collectionP = interfaceC0759c.p();
        if (collectionP == null) {
            a(109);
            throw null;
        }
        if (collectionP.isEmpty()) {
            c0770nF = AbstractC0771o.f8427j;
        } else {
            Iterator it = collectionP.iterator();
            loop3: while (true) {
                c0770n = null;
                while (it.hasNext()) {
                    C0770n c0770nB = ((InterfaceC0759c) it.next()).b();
                    if (c0770n != null) {
                        Integer numB = AbstractC0771o.b(c0770nB, c0770n);
                        if (numB == null) {
                            break;
                        } else if (numB.intValue() > 0) {
                        }
                    }
                    c0770n = c0770nB;
                }
            }
            if (c0770n == null) {
                c0770nF = null;
                break;
            }
            Iterator it2 = collectionP.iterator();
            while (it2.hasNext()) {
                Integer numB2 = AbstractC0771o.b(c0770n, ((InterfaceC0759c) it2.next()).b());
                if (numB2 == null || numB2.intValue() < 0) {
                    c0770nF = null;
                    break;
                }
            }
            c0770nF = c0770n;
        }
        if (c0770nF == null) {
            c0770nF = null;
            break;
        }
        if (interfaceC0759c.i0() == 2) {
            for (InterfaceC0759c interfaceC0759c3 : collectionP) {
                if (interfaceC0759c3.i() != 4 && !interfaceC0759c3.b().equals(c0770nF)) {
                    c0770nF = null;
                    break;
                }
            }
        } else {
            c0770nF = AbstractC0771o.f(c0770nF.f8417a.c());
        }
        if (c0770nF == null) {
            if (interfaceC0107b != null) {
                interfaceC0107b.d(interfaceC0759c);
            }
            c0770n2 = AbstractC0771o.f8423e;
        } else {
            c0770n2 = c0770nF;
        }
        if (interfaceC0759c instanceof C0834J) {
            C0834J c0834j = (C0834J) interfaceC0759c;
            if (c0770n2 == null) {
                C0834J.H0(20);
                throw null;
            }
            c0834j.f8775m = c0770n2;
            Iterator it3 = ((InterfaceC0750L) interfaceC0759c).w().iterator();
            while (it3.hasNext()) {
                r((InterfaceC0749K) it3.next(), c0770nF == null ? null : interfaceC0107b);
            }
            return;
        }
        if (interfaceC0759c instanceof AbstractC0866v) {
            AbstractC0866v abstractC0866v = (AbstractC0866v) interfaceC0759c;
            if (c0770n2 != null) {
                abstractC0866v.f8883o = c0770n2;
                return;
            } else {
                AbstractC0866v.H0(10);
                throw null;
            }
        }
        AbstractC0832H abstractC0832H = (AbstractC0832H) interfaceC0759c;
        abstractC0832H.n = c0770n2;
        if (c0770n2 != abstractC0832H.O0().b()) {
            abstractC0832H.f8751h = false;
        }
    }

    public static Object s(Collection collection, InterfaceC0107b interfaceC0107b) {
        Object next;
        if (collection.size() == 1) {
            Object objT0 = P2.m.t0(collection);
            if (objT0 != null) {
                return objT0;
            }
            a(80);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(P2.o.l0(collection));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(interfaceC0107b.d(it.next()));
        }
        Object objT02 = P2.m.t0(collection);
        InterfaceC0758b interfaceC0758b = (InterfaceC0758b) interfaceC0107b.d(objT02);
        for (Object obj : collection) {
            InterfaceC0758b interfaceC0758b2 = (InterfaceC0758b) interfaceC0107b.d(obj);
            if (interfaceC0758b2 == null) {
                a(71);
                throw null;
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    arrayList.add(obj);
                    break;
                }
                if (!k(interfaceC0758b2, (InterfaceC0758b) it2.next())) {
                    break;
                }
            }
            if (k(interfaceC0758b2, interfaceC0758b) && !k(interfaceC0758b, interfaceC0758b2)) {
                objT02 = obj;
            }
        }
        if (arrayList.isEmpty()) {
            if (objT02 != null) {
                return objT02;
            }
            a(81);
            throw null;
        }
        if (arrayList.size() == 1) {
            Object objT03 = P2.m.t0(arrayList);
            if (objT03 != null) {
                return objT03;
            }
            a(82);
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            if (!AbstractC0420c.j(((InterfaceC0758b) interfaceC0107b.d(next)).o())) {
                break;
            }
        }
        if (next != null) {
            return next;
        }
        Object objT04 = P2.m.t0(arrayList);
        if (objT04 != null) {
            return objT04;
        }
        a(84);
        throw null;
    }

    public final I f(List list, List list2) {
        if (list == null) {
            a(42);
            throw null;
        }
        if (list2 == null) {
            a(43);
            throw null;
        }
        boolean zIsEmpty = list.isEmpty();
        f4.e eVar = f4.e.f6738d;
        f4.f fVar = f4.f.f6740a;
        f4.c cVar = this.f2360a;
        if (zIsEmpty) {
            return new I(true, true, new E0.d((HashMap) null, cVar), eVar, fVar);
        }
        HashMap map = new HashMap();
        for (int i5 = 0; i5 < list.size(); i5++) {
            map.put(((InterfaceC0755Q) list.get(i5)).I(), ((InterfaceC0755Q) list2.get(i5)).I());
        }
        return new I(true, true, new E0.d(map, cVar), eVar, fVar);
    }

    public final void h(N3.f fVar, Collection collection, Collection collection2, InterfaceC0761e interfaceC0761e, q qVar) {
        Integer numB;
        if (fVar == null) {
            a(52);
            throw null;
        }
        if (collection == null) {
            a(53);
            throw null;
        }
        if (collection2 == null) {
            a(54);
            throw null;
        }
        if (interfaceC0761e == null) {
            a(55);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            InterfaceC0759c interfaceC0759c = (InterfaceC0759c) it.next();
            if (interfaceC0759c == null) {
                a(59);
                throw null;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            n4.h hVar = new n4.h();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                InterfaceC0759c interfaceC0759c2 = (InterfaceC0759c) it2.next();
                int iC = l(interfaceC0759c2, interfaceC0759c, interfaceC0761e).c();
                boolean z4 = !AbstractC0771o.e(interfaceC0759c2.b()) && AbstractC0771o.c(AbstractC0771o.f8429l, interfaceC0759c2, interfaceC0759c) == null;
                int iC2 = Q0.c(iC);
                if (iC2 == 0) {
                    if (z4) {
                        hVar.add(interfaceC0759c2);
                    }
                    arrayList.add(interfaceC0759c2);
                } else if (iC2 == 2) {
                    if (z4) {
                        qVar.d(interfaceC0759c2, interfaceC0759c);
                    }
                    arrayList.add(interfaceC0759c2);
                }
            }
            qVar.p(interfaceC0759c, hVar);
            linkedHashSet.removeAll(arrayList);
        }
        if (linkedHashSet.size() >= 2) {
            InterfaceC0766j interfaceC0766jL = ((InterfaceC0759c) linkedHashSet.iterator().next()).l();
            if (!linkedHashSet.isEmpty()) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    if (((InterfaceC0759c) it3.next()).l() != interfaceC0766jL) {
                        LinkedList<InterfaceC0759c> linkedList = new LinkedList(linkedHashSet);
                        while (!linkedList.isEmpty()) {
                            linkedList.isEmpty();
                            InterfaceC0759c interfaceC0759c3 = null;
                            for (InterfaceC0759c interfaceC0759c4 : linkedList) {
                                if (interfaceC0759c3 == null || ((numB = AbstractC0771o.b(interfaceC0759c3.b(), interfaceC0759c4.b())) != null && numB.intValue() < 0)) {
                                    interfaceC0759c3 = interfaceC0759c4;
                                }
                            }
                            AbstractC0219i.b(interfaceC0759c3);
                            e(g(interfaceC0759c3, linkedList, new l(1), new n(qVar, interfaceC0759c3)), interfaceC0761e, qVar);
                        }
                        return;
                    }
                }
            }
        }
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            e(Collections.singleton((InterfaceC0759c) it4.next()), interfaceC0761e, qVar);
        }
    }

    public final o l(InterfaceC0758b interfaceC0758b, InterfaceC0758b interfaceC0758b2, InterfaceC0761e interfaceC0761e) {
        if (interfaceC0758b == null) {
            a(19);
            throw null;
        }
        if (interfaceC0758b2 != null) {
            return m(interfaceC0758b, interfaceC0758b2, interfaceC0761e, false);
        }
        a(20);
        throw null;
    }

    public final o m(InterfaceC0758b interfaceC0758b, InterfaceC0758b interfaceC0758b2, InterfaceC0761e interfaceC0761e, boolean z4) {
        if (interfaceC0758b == null) {
            a(22);
            throw null;
        }
        if (interfaceC0758b2 == null) {
            a(23);
            throw null;
        }
        o oVarN = n(interfaceC0758b, interfaceC0758b2, z4);
        boolean z5 = oVarN.c() == 1;
        List<i> list = f2357b;
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            g gVar = g.f2342d;
            if (!zHasNext) {
                if (!z5) {
                    return oVarN;
                }
                for (i iVar : list) {
                    if (iVar.a() == gVar) {
                        int iOrdinal = iVar.b(interfaceC0758b, interfaceC0758b2, interfaceC0761e).ordinal();
                        if (iOrdinal == 0) {
                            throw new IllegalStateException("Contract violation in " + iVar.getClass().getName() + " condition. It's not supposed to end with success");
                        }
                        if (iOrdinal == 1) {
                            return o.b("External condition failed");
                        }
                        if (iOrdinal == 2) {
                            return o.d("External condition");
                        }
                    }
                }
                o oVar = o.f2355b;
                if (oVar != null) {
                    return oVar;
                }
                o.a(0);
                throw null;
            }
            i iVar2 = (i) it.next();
            if (iVar2.a() != gVar && (!z5 || iVar2.a() != g.f2343e)) {
                int iOrdinal2 = iVar2.b(interfaceC0758b, interfaceC0758b2, interfaceC0761e).ordinal();
                if (iOrdinal2 == 0) {
                    z5 = true;
                } else {
                    if (iOrdinal2 == 1) {
                        return o.b("External condition failed");
                    }
                    if (iOrdinal2 == 2) {
                        return o.d("External condition");
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a9, code lost:
    
        r10.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final Q3.o n(p3.InterfaceC0758b r13, p3.InterfaceC0758b r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q3.p.n(p3.b, p3.b, boolean):Q3.o");
    }
}
