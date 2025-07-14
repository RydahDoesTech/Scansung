package s3;

import a3.InterfaceC0107b;
import e4.AbstractC0424g;
import e4.AbstractC0438v;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import x3.EnumC0915b;

/* renamed from: s3.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0862r extends X3.o {

    /* renamed from: b, reason: collision with root package name */
    public final d4.e f8842b;

    /* renamed from: c, reason: collision with root package name */
    public final d4.e f8843c;

    /* renamed from: d, reason: collision with root package name */
    public final d4.i f8844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0863s f8845e;

    public C0862r(C0863s c0863s, d4.o oVar) {
        if (oVar == null) {
            h(0);
            throw null;
        }
        this.f8845e = c0863s;
        d4.l lVar = (d4.l) oVar;
        this.f8842b = lVar.b(new C0861q(this, 0));
        int i5 = 1;
        this.f8843c = lVar.b(new C0861q(this, i5));
        this.f8844d = new d4.i(lVar, new C0851g(i5, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void h(int r13) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.C0862r.h(int):void");
    }

    @Override // X3.o, X3.n
    public final Set a() {
        Set set = (Set) this.f8845e.f8848l.a();
        if (set != null) {
            return set;
        }
        h(17);
        throw null;
    }

    @Override // X3.o, X3.n
    public final Set b() {
        Set set = (Set) this.f8845e.f8848l.a();
        if (set != null) {
            return set;
        }
        h(19);
        throw null;
    }

    @Override // X3.o, X3.n
    public final Collection c(N3.f fVar, EnumC0915b enumC0915b) {
        if (fVar != null) {
            return (Collection) this.f8843c.d(fVar);
        }
        h(1);
        throw null;
    }

    @Override // X3.o, X3.p
    public final Collection d(X3.f fVar, InterfaceC0107b interfaceC0107b) {
        if (fVar == null) {
            h(13);
            throw null;
        }
        if (interfaceC0107b == null) {
            h(14);
            throw null;
        }
        Collection collection = (Collection) this.f8844d.a();
        if (collection != null) {
            return collection;
        }
        h(15);
        throw null;
    }

    @Override // X3.o, X3.n
    public final Collection e(N3.f fVar, EnumC0915b enumC0915b) {
        if (fVar != null) {
            return (Collection) this.f8842b.d(fVar);
        }
        h(5);
        throw null;
    }

    @Override // X3.o, X3.n
    public final Set f() {
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet != null) {
            return setEmptySet;
        }
        h(18);
        throw null;
    }

    public final X3.n i() {
        X3.n nVarP0 = ((AbstractC0438v) ((AbstractC0424g) this.f8845e.I()).j().iterator().next()).p0();
        if (nVarP0 != null) {
            return nVarP0;
        }
        h(9);
        throw null;
    }

    public final LinkedHashSet j(N3.f fVar, Collection collection) {
        if (fVar == null) {
            h(10);
            throw null;
        }
        if (collection == null) {
            h(11);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Q3.p.f2358c.h(fVar, collection, Collections.emptySet(), this.f8845e, new c4.f(linkedHashSet, 1));
        return linkedHashSet;
    }
}
