package C3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p3.InterfaceC0761e;
import p3.InterfaceC0763g;
import p3.InterfaceC0766j;
import x3.EnumC0915b;

/* loaded from: classes.dex */
public final class y extends I {
    public final v3.y n;

    /* renamed from: o, reason: collision with root package name */
    public final t f451o;

    /* renamed from: p, reason: collision with root package name */
    public final d4.h f452p;

    /* renamed from: q, reason: collision with root package name */
    public final d4.j f453q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(B3.g gVar, v3.y yVar, t tVar) {
        super(gVar, null);
        AbstractC0219i.e("ownerDescriptor", tVar);
        this.n = yVar;
        this.f451o = tVar;
        d4.l lVar = ((B3.b) gVar.f255e).f223a;
        B3.a aVar = new B3.a(gVar, 3, this);
        lVar.getClass();
        this.f452p = new d4.h(lVar, aVar);
        this.f453q = lVar.c(new q(this, 2, gVar));
    }

    @Override // C3.D, X3.o, X3.n
    public final Collection c(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        return P2.u.f2163d;
    }

    @Override // C3.D, X3.o, X3.p
    public final Collection d(X3.f fVar, InterfaceC0107b interfaceC0107b) {
        AbstractC0219i.e("kindFilter", fVar);
        AbstractC0219i.e("nameFilter", interfaceC0107b);
        if (!fVar.a(X3.f.f2769l | X3.f.f2763e)) {
            return P2.u.f2163d;
        }
        Iterable iterable = (Iterable) this.f359d.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            InterfaceC0766j interfaceC0766j = (InterfaceC0766j) obj;
            if (interfaceC0766j instanceof InterfaceC0761e) {
                N3.f name = ((InterfaceC0761e) interfaceC0766j).getName();
                AbstractC0219i.d("it.name", name);
                if (((Boolean) interfaceC0107b.d(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // X3.o, X3.p
    public final InterfaceC0763g g(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        AbstractC0219i.e("location", enumC0915b);
        return v(fVar, null);
    }

    @Override // C3.D
    public final Set h(X3.f fVar, X3.k kVar) {
        AbstractC0219i.e("kindFilter", fVar);
        if (!fVar.a(X3.f.f2763e)) {
            return P2.w.f2165d;
        }
        Set set = (Set) this.f452p.a();
        if (set == null) {
            this.n.getClass();
            return new LinkedHashSet();
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(N3.f.e((String) it.next()));
        }
        return hashSet;
    }

    @Override // C3.D
    public final Set i(X3.f fVar, X3.k kVar) {
        AbstractC0219i.e("kindFilter", fVar);
        return P2.w.f2165d;
    }

    @Override // C3.D
    public final InterfaceC0011c k() {
        return C0010b.f381a;
    }

    @Override // C3.D
    public final void m(LinkedHashSet linkedHashSet, N3.f fVar) {
        AbstractC0219i.e("name", fVar);
    }

    @Override // C3.D
    public final Set o(X3.f fVar) {
        AbstractC0219i.e("kindFilter", fVar);
        return P2.w.f2165d;
    }

    @Override // C3.D
    public final InterfaceC0766j q() {
        return this.f451o;
    }

    public final InterfaceC0761e v(N3.f fVar, v3.o oVar) {
        N3.f fVar2 = N3.h.f1845a;
        AbstractC0219i.e("name", fVar);
        String strB = fVar.b();
        AbstractC0219i.d("name.asString()", strB);
        if (strB.length() <= 0 || fVar.f1843e) {
            return null;
        }
        Set set = (Set) this.f452p.a();
        if (oVar != null || set == null || set.contains(fVar.b())) {
            return (InterfaceC0761e) this.f453q.d(new u(fVar, oVar));
        }
        return null;
    }
}
