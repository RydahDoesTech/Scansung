package X3;

import P2.u;
import P2.w;
import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import g3.y;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import p3.InterfaceC0763g;
import p3.InterfaceC0764h;
import x3.EnumC0915b;

/* loaded from: classes.dex */
public final class a implements n {

    /* renamed from: b, reason: collision with root package name */
    public final String f2754b;

    /* renamed from: c, reason: collision with root package name */
    public final n[] f2755c;

    public a(String str, n[] nVarArr) {
        this.f2754b = str;
        this.f2755c = nVarArr;
    }

    @Override // X3.n
    public final Set a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (n nVar : this.f2755c) {
            P2.s.n0(linkedHashSet, nVar.a());
        }
        return linkedHashSet;
    }

    @Override // X3.n
    public final Set b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (n nVar : this.f2755c) {
            P2.s.n0(linkedHashSet, nVar.b());
        }
        return linkedHashSet;
    }

    @Override // X3.n
    public final Collection c(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        n[] nVarArr = this.f2755c;
        int length = nVarArr.length;
        if (length == 0) {
            return u.f2163d;
        }
        if (length == 1) {
            return nVarArr[0].c(fVar, enumC0915b);
        }
        Collection collectionK = null;
        for (n nVar : nVarArr) {
            collectionK = y.k(collectionK, nVar.c(fVar, enumC0915b));
        }
        return collectionK == null ? w.f2165d : collectionK;
    }

    @Override // X3.p
    public final Collection d(f fVar, InterfaceC0107b interfaceC0107b) {
        AbstractC0219i.e("kindFilter", fVar);
        AbstractC0219i.e("nameFilter", interfaceC0107b);
        n[] nVarArr = this.f2755c;
        int length = nVarArr.length;
        if (length == 0) {
            return u.f2163d;
        }
        if (length == 1) {
            return nVarArr[0].d(fVar, interfaceC0107b);
        }
        Collection collectionK = null;
        for (n nVar : nVarArr) {
            collectionK = y.k(collectionK, nVar.d(fVar, interfaceC0107b));
        }
        return collectionK == null ? w.f2165d : collectionK;
    }

    @Override // X3.n
    public final Collection e(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        n[] nVarArr = this.f2755c;
        int length = nVarArr.length;
        if (length == 0) {
            return u.f2163d;
        }
        if (length == 1) {
            return nVarArr[0].e(fVar, enumC0915b);
        }
        Collection collectionK = null;
        for (n nVar : nVarArr) {
            collectionK = y.k(collectionK, nVar.e(fVar, enumC0915b));
        }
        return collectionK == null ? w.f2165d : collectionK;
    }

    @Override // X3.n
    public final Set f() {
        n[] nVarArr = this.f2755c;
        AbstractC0219i.e("<this>", nVarArr);
        return J2.b.m(nVarArr.length == 0 ? u.f2163d : new P2.k(0, nVarArr));
    }

    @Override // X3.p
    public final InterfaceC0763g g(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        AbstractC0219i.e("location", enumC0915b);
        InterfaceC0763g interfaceC0763g = null;
        for (n nVar : this.f2755c) {
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

    public final String toString() {
        return this.f2754b;
    }
}
