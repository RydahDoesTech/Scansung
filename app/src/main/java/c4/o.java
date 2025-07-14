package c4;

import C3.C0012d;
import a3.InterfaceC0106a;
import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import g3.InterfaceC0466p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import p3.InterfaceC0763g;
import x3.EnumC0915b;

/* loaded from: classes.dex */
public abstract class o extends X3.o {
    public static final /* synthetic */ InterfaceC0466p[] f;

    /* renamed from: b, reason: collision with root package name */
    public final a4.k f5190b;

    /* renamed from: c, reason: collision with root package name */
    public final n f5191c;

    /* renamed from: d, reason: collision with root package name */
    public final d4.i f5192d;

    /* renamed from: e, reason: collision with root package name */
    public final d4.h f5193e;

    static {
        b3.r rVar = b3.q.f5100a;
        f = new InterfaceC0466p[]{rVar.e(new b3.n(rVar.b(o.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), rVar.e(new b3.n(rVar.b(o.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};
    }

    public o(a4.k kVar, List list, List list2, List list3, InterfaceC0106a interfaceC0106a) {
        AbstractC0219i.e("c", kVar);
        AbstractC0219i.e("functionList", list);
        AbstractC0219i.e("propertyList", list2);
        AbstractC0219i.e("typeAliasList", list3);
        this.f5190b = kVar;
        a4.i iVar = (a4.i) kVar.f3058d;
        iVar.f3039c.getClass();
        this.f5191c = new n(this, list, list2, list3);
        C0012d c0012d = new C0012d(interfaceC0106a);
        d4.o oVar = iVar.f3037a;
        d4.l lVar = (d4.l) oVar;
        lVar.getClass();
        this.f5192d = new d4.i(lVar, c0012d);
        C0012d c0012d2 = new C0012d(13, this);
        d4.l lVar2 = (d4.l) oVar;
        lVar2.getClass();
        this.f5193e = new d4.h(lVar2, c0012d2);
    }

    @Override // X3.o, X3.n
    public final Set a() {
        return (Set) V1.a.Q(this.f5191c.f5187g, n.f5181j[0]);
    }

    @Override // X3.o, X3.n
    public final Set b() {
        return (Set) V1.a.Q(this.f5191c.f5188h, n.f5181j[1]);
    }

    @Override // X3.o, X3.n
    public Collection c(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        return this.f5191c.b(fVar, enumC0915b);
    }

    @Override // X3.o, X3.n
    public Collection e(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        return this.f5191c.a(fVar, enumC0915b);
    }

    @Override // X3.o, X3.n
    public final Set f() {
        d4.h hVar = this.f5193e;
        InterfaceC0466p interfaceC0466p = f[1];
        AbstractC0219i.e("<this>", hVar);
        AbstractC0219i.e("p", interfaceC0466p);
        return (Set) hVar.a();
    }

    @Override // X3.o, X3.p
    public InterfaceC0763g g(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        AbstractC0219i.e("location", enumC0915b);
        if (q(fVar)) {
            return ((a4.i) this.f5190b.f3058d).b(l(fVar));
        }
        n nVar = this.f5191c;
        if (!nVar.f5184c.keySet().contains(fVar)) {
            return null;
        }
        nVar.getClass();
        return (s) nVar.f.d(fVar);
    }

    public abstract void h(ArrayList arrayList, InterfaceC0107b interfaceC0107b);

    public final List i(X3.f fVar, InterfaceC0107b interfaceC0107b) {
        EnumC0915b enumC0915b = EnumC0915b.f9317g;
        AbstractC0219i.e("kindFilter", fVar);
        AbstractC0219i.e("nameFilter", interfaceC0107b);
        ArrayList arrayList = new ArrayList(0);
        if (fVar.a(X3.f.f)) {
            h(arrayList, interfaceC0107b);
        }
        n nVar = this.f5191c;
        nVar.getClass();
        boolean zA = fVar.a(X3.f.f2767j);
        Q3.k kVar = Q3.k.f2348b;
        if (zA) {
            Set<N3.f> set = (Set) V1.a.Q(nVar.f5188h, n.f5181j[1]);
            ArrayList arrayList2 = new ArrayList();
            for (N3.f fVar2 : set) {
                if (((Boolean) interfaceC0107b.d(fVar2)).booleanValue()) {
                    arrayList2.addAll(nVar.b(fVar2, enumC0915b));
                }
            }
            P2.r.m0(arrayList2, kVar);
            arrayList.addAll(arrayList2);
        }
        if (fVar.a(X3.f.f2766i)) {
            Set<N3.f> set2 = (Set) V1.a.Q(nVar.f5187g, n.f5181j[0]);
            ArrayList arrayList3 = new ArrayList();
            for (N3.f fVar3 : set2) {
                if (((Boolean) interfaceC0107b.d(fVar3)).booleanValue()) {
                    arrayList3.addAll(nVar.a(fVar3, enumC0915b));
                }
            }
            P2.r.m0(arrayList3, kVar);
            arrayList.addAll(arrayList3);
        }
        if (fVar.a(X3.f.f2769l)) {
            for (N3.f fVar4 : m()) {
                if (((Boolean) interfaceC0107b.d(fVar4)).booleanValue()) {
                    n4.k.a(arrayList, ((a4.i) this.f5190b.f3058d).b(l(fVar4)));
                }
            }
        }
        if (fVar.a(X3.f.f2764g)) {
            for (Object obj : nVar.f5184c.keySet()) {
                if (((Boolean) interfaceC0107b.d(obj)).booleanValue()) {
                    nVar.getClass();
                    AbstractC0219i.e("name", obj);
                    n4.k.a(arrayList, (s) nVar.f.d(obj));
                }
            }
        }
        return n4.k.d(arrayList);
    }

    public void j(N3.f fVar, ArrayList arrayList) {
        AbstractC0219i.e("name", fVar);
    }

    public void k(N3.f fVar, ArrayList arrayList) {
        AbstractC0219i.e("name", fVar);
    }

    public abstract N3.b l(N3.f fVar);

    public final Set m() {
        return (Set) V1.a.Q(this.f5192d, f[0]);
    }

    public abstract Set n();

    public abstract Set o();

    public abstract Set p();

    public boolean q(N3.f fVar) {
        AbstractC0219i.e("name", fVar);
        return m().contains(fVar);
    }

    public boolean r(r rVar) {
        return true;
    }
}
