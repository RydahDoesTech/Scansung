package X3;

import C3.C0012d;
import a3.InterfaceC0106a;
import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import p3.InterfaceC0758b;
import p3.InterfaceC0763g;
import p3.InterfaceC0766j;
import x3.EnumC0915b;

/* loaded from: classes.dex */
public final class j implements n {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2784b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2785c;

    public j(n nVar) {
        this.f2785c = nVar;
    }

    @Override // X3.n
    public final Set a() {
        return l().a();
    }

    @Override // X3.n
    public final Set b() {
        return l().b();
    }

    @Override // X3.n
    public Collection c(N3.f fVar, EnumC0915b enumC0915b) {
        switch (this.f2784b) {
            case 1:
                AbstractC0219i.e("name", fVar);
                return Q3.q.o(k(fVar, enumC0915b), k.f2788h);
            default:
                return k(fVar, enumC0915b);
        }
    }

    @Override // X3.p
    public Collection d(f fVar, InterfaceC0107b interfaceC0107b) {
        switch (this.f2784b) {
            case 1:
                AbstractC0219i.e("kindFilter", fVar);
                AbstractC0219i.e("nameFilter", interfaceC0107b);
                Collection collectionI = i(fVar, interfaceC0107b);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : collectionI) {
                    if (((InterfaceC0766j) obj) instanceof InterfaceC0758b) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                return P2.m.G0(Q3.q.o(arrayList, k.f), arrayList2);
            default:
                return i(fVar, interfaceC0107b);
        }
    }

    @Override // X3.n
    public Collection e(N3.f fVar, EnumC0915b enumC0915b) {
        switch (this.f2784b) {
            case 1:
                AbstractC0219i.e("name", fVar);
                return Q3.q.o(j(fVar, enumC0915b), k.f2787g);
            default:
                return j(fVar, enumC0915b);
        }
    }

    @Override // X3.n
    public final Set f() {
        return l().f();
    }

    @Override // X3.p
    public final InterfaceC0763g g(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        AbstractC0219i.e("location", enumC0915b);
        return l().g(fVar, enumC0915b);
    }

    public final n h() {
        if (!(l() instanceof j)) {
            return l();
        }
        n nVarL = l();
        AbstractC0219i.c("null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter", nVarL);
        return ((j) nVarL).h();
    }

    public final Collection i(f fVar, InterfaceC0107b interfaceC0107b) {
        AbstractC0219i.e("kindFilter", fVar);
        AbstractC0219i.e("nameFilter", interfaceC0107b);
        return l().d(fVar, interfaceC0107b);
    }

    public final Collection j(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        return l().e(fVar, enumC0915b);
    }

    public final Collection k(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        return l().c(fVar, enumC0915b);
    }

    public final n l() {
        switch (this.f2784b) {
            case 0:
                return (n) ((d4.i) this.f2785c).a();
            default:
                return (n) this.f2785c;
        }
    }

    public j(d4.o oVar, InterfaceC0106a interfaceC0106a) {
        AbstractC0219i.e("storageManager", oVar);
        this.f2785c = new d4.i((d4.l) oVar, new C0012d(7, interfaceC0106a));
    }
}
