package f4;

import P2.u;
import a3.InterfaceC0108c;
import b3.AbstractC0219i;
import com.google.firebase.messaging.C0388e;
import e4.AbstractC0420c;
import e4.AbstractC0438v;
import e4.AbstractC0442z;
import e4.C0421d;
import e4.C0425h;
import e4.C0437u;
import e4.G;
import e4.J;
import e4.Z;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f6764a = new t();

    public static ArrayList a(AbstractCollection abstractCollection, InterfaceC0108c interfaceC0108c) {
        ArrayList arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        AbstractC0219i.d("filteredTypes.iterator()", it);
        while (it.hasNext()) {
            AbstractC0442z abstractC0442z = (AbstractC0442z) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AbstractC0442z abstractC0442z2 = (AbstractC0442z) it2.next();
                    if (abstractC0442z2 != abstractC0442z) {
                        AbstractC0219i.d("lower", abstractC0442z2);
                        AbstractC0219i.d("upper", abstractC0442z);
                        if (((Boolean) interfaceC0108c.c(abstractC0442z2, abstractC0442z)).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [e4.G] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [e4.G, java.lang.Object, k4.d] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v18, types: [e4.z] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [e4.v, e4.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final AbstractC0442z b(ArrayList arrayList) {
        AbstractC0442z abstractC0442z;
        AbstractC0442z abstractC0442zB;
        arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC0442z abstractC0442z2 = (AbstractC0442z) it.next();
            if (abstractC0442z2.I0() instanceof C0437u) {
                Collection<AbstractC0438v> collectionJ = abstractC0442z2.I0().j();
                AbstractC0219i.d("type.constructor.supertypes", collectionJ);
                ArrayList arrayList3 = new ArrayList(P2.o.l0(collectionJ));
                for (AbstractC0438v abstractC0438v : collectionJ) {
                    AbstractC0219i.d("it", abstractC0438v);
                    AbstractC0442z abstractC0442zY = AbstractC0420c.y(abstractC0438v);
                    if (abstractC0442z2.J0()) {
                        abstractC0442zY = abstractC0442zY.M0(true);
                    }
                    arrayList3.add(abstractC0442zY);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(abstractC0442z2);
            }
        }
        r rVarA = r.f6759d;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            rVarA = rVarA.a((Z) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            AbstractC0442z abstractC0442zM0 = (AbstractC0442z) it3.next();
            if (rVarA == r.f6761g) {
                if (abstractC0442zM0 instanceof h) {
                    h hVar = (h) abstractC0442zM0;
                    AbstractC0219i.e("<this>", hVar);
                    abstractC0442zM0 = new h(hVar.f6742e, hVar.f, hVar.f6743g, hVar.f6744h, hVar.f6745i, true);
                }
                AbstractC0219i.e("<this>", abstractC0442zM0);
                AbstractC0442z abstractC0442zP = C0421d.p(abstractC0442zM0, false);
                abstractC0442zM0 = (abstractC0442zP == null && (abstractC0442zP = AbstractC0420c.m(abstractC0442zM0)) == null) ? abstractC0442zM0.M0(false) : abstractC0442zP;
            }
            linkedHashSet.add(abstractC0442zM0);
        }
        ArrayList arrayList4 = new ArrayList(P2.o.l0(arrayList));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((AbstractC0442z) it4.next()).H0());
        }
        Iterator it5 = arrayList4.iterator();
        if (!it5.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        ?? next = it5.next();
        while (true) {
            abstractC0442z = null;
            if (!it5.hasNext()) {
                break;
            }
            G g5 = (G) it5.next();
            next = (G) next;
            next.getClass();
            AbstractC0219i.e("other", g5);
            if (!next.isEmpty() || !g5.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                Collection collectionValues = ((ConcurrentHashMap) G.f6646e.f6142e).values();
                AbstractC0219i.d("idPerType.values", collectionValues);
                Iterator it6 = collectionValues.iterator();
                while (it6.hasNext()) {
                    int iIntValue = ((Number) it6.next()).intValue();
                    C0425h c0425h = (C0425h) next.f7942d.get(iIntValue);
                    C0425h c0425h2 = (C0425h) g5.f7942d.get(iIntValue);
                    if (c0425h != null) {
                        if (!AbstractC0219i.a(c0425h2, c0425h)) {
                            c0425h = null;
                        }
                        c0425h2 = c0425h;
                    } else if (c0425h2 == null || !AbstractC0219i.a(c0425h, c0425h2)) {
                        c0425h2 = null;
                    }
                    n4.k.a(arrayList5, c0425h2);
                }
                next = C0388e.l(arrayList5);
            }
        }
        G g6 = (G) next;
        if (linkedHashSet.size() == 1) {
            abstractC0442zB = (AbstractC0442z) P2.m.I0(linkedHashSet);
        } else {
            ArrayList arrayListA = a(linkedHashSet, new s(2, this, 0));
            arrayListA.isEmpty();
            if (!arrayListA.isEmpty()) {
                Iterator it7 = arrayListA.iterator();
                if (!it7.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                AbstractC0442z next2 = it7.next();
                while (it7.hasNext()) {
                    AbstractC0442z abstractC0442z3 = (AbstractC0442z) it7.next();
                    next2 = next2;
                    if (next2 != 0 && abstractC0442z3 != null) {
                        J jI0 = next2.I0();
                        J jI02 = abstractC0442z3.I0();
                        boolean z4 = jI0 instanceof S3.m;
                        if (z4 && (jI02 instanceof S3.m)) {
                            Set set = ((S3.m) jI0).f2537a;
                            Set set2 = ((S3.m) jI02).f2537a;
                            AbstractC0219i.e("<this>", set);
                            AbstractC0219i.e("other", set2);
                            Set setQ0 = P2.m.Q0(set);
                            P2.s.n0(setQ0, set2);
                            S3.m mVar = new S3.m(setQ0);
                            G.f6646e.getClass();
                            G g7 = G.f;
                            AbstractC0219i.e("attributes", g7);
                            next2 = C0421d.s(g4.j.a(2, true, "unknown integer literal type"), g7, mVar, u.f2163d, false);
                        } else if (z4) {
                            if (!((S3.m) jI0).f2537a.contains(abstractC0442z3)) {
                                abstractC0442z3 = null;
                            }
                            next2 = abstractC0442z3;
                        } else if (!(jI02 instanceof S3.m) || !((S3.m) jI02).f2537a.contains(next2)) {
                        }
                    }
                    next2 = 0;
                }
                abstractC0442z = next2;
            }
            if (abstractC0442z != null) {
                abstractC0442zB = abstractC0442z;
            } else {
                k.f6754b.getClass();
                ArrayList arrayListA2 = a(arrayListA, new s(2, j.f6753b, 1));
                arrayListA2.isEmpty();
                abstractC0442zB = arrayListA2.size() < 2 ? (AbstractC0442z) P2.m.I0(arrayListA2) : new C0437u(linkedHashSet).b();
            }
        }
        return abstractC0442zB.O0(g6);
    }
}
