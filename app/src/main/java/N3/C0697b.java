package n3;

import P2.m;
import P2.n;
import P2.o;
import P2.u;
import b3.AbstractC0219i;
import e4.AbstractC0419b;
import e4.C0421d;
import e4.G;
import e4.O;
import g3.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p3.AbstractC0779w;
import p3.C0753O;
import p3.InterfaceC0755Q;
import p3.InterfaceC0761e;
import p3.InterfaceC0763g;
import p3.InterfaceC0781y;

/* renamed from: n3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0697b extends AbstractC0419b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0698c f8170c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0697b(C0698c c0698c) {
        super(c0698c.f8173h);
        this.f8170c = c0698c;
    }

    @Override // e4.AbstractC0424g
    public final Collection b() {
        List<N3.b> listN;
        Iterable iterableN;
        C0698c c0698c = this.f8170c;
        int iOrdinal = c0698c.f8175j.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            listN = y.N(C0698c.f8171o);
        } else {
            int i5 = c0698c.f8176k;
            if (iOrdinal == 2) {
                listN = n.h0(C0698c.f8172p, new N3.b(m3.n.f8150j, EnumC0700e.f8181g.a(i5)));
            } else {
                if (iOrdinal != 3) {
                    throw new O2.d();
                }
                listN = n.h0(C0698c.f8172p, new N3.b(m3.n.f8146e, EnumC0700e.f8182h.a(i5)));
            }
        }
        InterfaceC0781y interfaceC0781yL = c0698c.f8174i.l();
        ArrayList arrayList = new ArrayList(o.l0(listN));
        for (N3.b bVar : listN) {
            InterfaceC0761e interfaceC0761eD = AbstractC0779w.d(interfaceC0781yL, bVar);
            if (interfaceC0761eD == null) {
                throw new IllegalStateException(("Built-in class " + bVar + " not found").toString());
            }
            int size = interfaceC0761eD.I().k().size();
            List list = c0698c.n;
            AbstractC0219i.e("<this>", list);
            if (size < 0) {
                throw new IllegalArgumentException(("Requested element count " + size + " is less than zero.").toString());
            }
            if (size == 0) {
                iterableN = u.f2163d;
            } else {
                int size2 = list.size();
                if (size >= size2) {
                    iterableN = m.O0(list);
                } else if (size == 1) {
                    iterableN = y.N(m.C0(list));
                } else {
                    ArrayList arrayList2 = new ArrayList(size);
                    if (list instanceof RandomAccess) {
                        for (int i6 = size2 - size; i6 < size2; i6++) {
                            arrayList2.add(list.get(i6));
                        }
                    } else {
                        ListIterator listIterator = list.listIterator(size2 - size);
                        while (listIterator.hasNext()) {
                            arrayList2.add(listIterator.next());
                        }
                    }
                    iterableN = arrayList2;
                }
            }
            ArrayList arrayList3 = new ArrayList(o.l0(iterableN));
            Iterator it = iterableN.iterator();
            while (it.hasNext()) {
                arrayList3.add(new O(((InterfaceC0755Q) it.next()).q()));
            }
            G.f6646e.getClass();
            arrayList.add(C0421d.q(G.f, interfaceC0761eD, arrayList3));
        }
        return m.O0(arrayList);
    }

    @Override // e4.AbstractC0424g
    public final C0753O d() {
        return C0753O.f;
    }

    @Override // e4.J
    public final boolean h() {
        return true;
    }

    @Override // e4.AbstractC0419b, e4.J
    public final InterfaceC0763g i() {
        return this.f8170c;
    }

    @Override // e4.J
    public final List k() {
        return this.f8170c.n;
    }

    @Override // e4.AbstractC0419b
    /* renamed from: n */
    public final InterfaceC0761e i() {
        return this.f8170c;
    }

    public final String toString() {
        return this.f8170c.toString();
    }
}
