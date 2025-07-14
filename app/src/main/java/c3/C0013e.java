package C3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import g3.InterfaceC0466p;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import p3.InterfaceC0761e;
import p3.InterfaceC0763g;
import p3.InterfaceC0764h;
import r0.AbstractC0807a;
import x3.EnumC0915b;

/* renamed from: C3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0013e implements X3.n {
    public static final /* synthetic */ InterfaceC0466p[] f;

    /* renamed from: b, reason: collision with root package name */
    public final B3.g f384b;

    /* renamed from: c, reason: collision with root package name */
    public final t f385c;

    /* renamed from: d, reason: collision with root package name */
    public final y f386d;

    /* renamed from: e, reason: collision with root package name */
    public final d4.i f387e;

    static {
        b3.r rVar = b3.q.f5100a;
        f = new InterfaceC0466p[]{rVar.e(new b3.n(rVar.b(C0013e.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
    }

    public C0013e(B3.g gVar, v3.y yVar, t tVar) {
        AbstractC0219i.e("packageFragment", tVar);
        this.f384b = gVar;
        this.f385c = tVar;
        this.f386d = new y(gVar, yVar, tVar);
        d4.l lVar = ((B3.b) gVar.f255e).f223a;
        C0012d c0012d = new C0012d(0, this);
        lVar.getClass();
        this.f387e = new d4.i(lVar, c0012d);
    }

    @Override // X3.n
    public final Set a() {
        X3.n[] nVarArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (X3.n nVar : nVarArrH) {
            P2.s.n0(linkedHashSet, nVar.a());
        }
        linkedHashSet.addAll(this.f386d.a());
        return linkedHashSet;
    }

    @Override // X3.n
    public final Set b() {
        X3.n[] nVarArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (X3.n nVar : nVarArrH) {
            P2.s.n0(linkedHashSet, nVar.b());
        }
        linkedHashSet.addAll(this.f386d.b());
        return linkedHashSet;
    }

    @Override // X3.n
    public final Collection c(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        i(fVar, enumC0915b);
        X3.n[] nVarArrH = h();
        this.f386d.getClass();
        Collection collectionK = P2.u.f2163d;
        for (X3.n nVar : nVarArrH) {
            collectionK = g3.y.k(collectionK, nVar.c(fVar, enumC0915b));
        }
        return collectionK == null ? P2.w.f2165d : collectionK;
    }

    @Override // X3.p
    public final Collection d(X3.f fVar, InterfaceC0107b interfaceC0107b) {
        AbstractC0219i.e("kindFilter", fVar);
        AbstractC0219i.e("nameFilter", interfaceC0107b);
        X3.n[] nVarArrH = h();
        Collection collectionD = this.f386d.d(fVar, interfaceC0107b);
        for (X3.n nVar : nVarArrH) {
            collectionD = g3.y.k(collectionD, nVar.d(fVar, interfaceC0107b));
        }
        return collectionD == null ? P2.w.f2165d : collectionD;
    }

    @Override // X3.n
    public final Collection e(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        i(fVar, enumC0915b);
        X3.n[] nVarArrH = h();
        Collection collectionE = this.f386d.e(fVar, enumC0915b);
        for (X3.n nVar : nVarArrH) {
            collectionE = g3.y.k(collectionE, nVar.e(fVar, enumC0915b));
        }
        return collectionE == null ? P2.w.f2165d : collectionE;
    }

    @Override // X3.n
    public final Set f() {
        X3.n[] nVarArrH = h();
        AbstractC0219i.e("<this>", nVarArrH);
        HashSet hashSetM = J2.b.m(nVarArrH.length == 0 ? P2.u.f2163d : new P2.k(0, nVarArrH));
        if (hashSetM == null) {
            return null;
        }
        hashSetM.addAll(this.f386d.f());
        return hashSetM;
    }

    @Override // X3.p
    public final InterfaceC0763g g(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        AbstractC0219i.e("location", enumC0915b);
        i(fVar, enumC0915b);
        y yVar = this.f386d;
        yVar.getClass();
        InterfaceC0763g interfaceC0763g = null;
        InterfaceC0761e interfaceC0761eV = yVar.v(fVar, null);
        if (interfaceC0761eV != null) {
            return interfaceC0761eV;
        }
        for (X3.n nVar : h()) {
            InterfaceC0763g interfaceC0763gG = nVar.g(fVar, enumC0915b);
            if (interfaceC0763gG != null) {
                if (!(interfaceC0763gG instanceof InterfaceC0764h) || !((InterfaceC0764h) interfaceC0763gG).z()) {
                    return interfaceC0763gG;
                }
                if (interfaceC0763g == null) {
                    interfaceC0763g = interfaceC0763gG;
                }
            }
        }
        return interfaceC0763g;
    }

    public final X3.n[] h() {
        return (X3.n[]) V1.a.Q(this.f387e, f[0]);
    }

    public final void i(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        AbstractC0219i.e("location", enumC0915b);
        B3.b bVar = (B3.b) this.f384b.f255e;
        AbstractC0807a.e(bVar.n, enumC0915b, this.f385c, fVar);
    }

    public final String toString() {
        return "scope for " + this.f385c;
    }
}
