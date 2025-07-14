package X3;

import C3.C0012d;
import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import e4.S;
import e4.V;
import g3.y;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p3.InterfaceC0754P;
import p3.InterfaceC0763g;
import p3.InterfaceC0766j;
import x3.EnumC0915b;

/* loaded from: classes.dex */
public final class s implements n {

    /* renamed from: b, reason: collision with root package name */
    public final n f2799b;

    /* renamed from: c, reason: collision with root package name */
    public final V f2800c;

    /* renamed from: d, reason: collision with root package name */
    public HashMap f2801d;

    /* renamed from: e, reason: collision with root package name */
    public final O2.i f2802e;

    public s(n nVar, V v2) {
        AbstractC0219i.e("workerScope", nVar);
        AbstractC0219i.e("givenSubstitutor", v2);
        this.f2799b = nVar;
        S sF = v2.f();
        AbstractC0219i.d("givenSubstitutor.substitution", sF);
        this.f2800c = new V(y.f0(sF));
        this.f2802e = new O2.i(new C0012d(8, this));
    }

    @Override // X3.n
    public final Set a() {
        return this.f2799b.a();
    }

    @Override // X3.n
    public final Set b() {
        return this.f2799b.b();
    }

    @Override // X3.n
    public final Collection c(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        return h(this.f2799b.c(fVar, enumC0915b));
    }

    @Override // X3.p
    public final Collection d(f fVar, InterfaceC0107b interfaceC0107b) {
        AbstractC0219i.e("kindFilter", fVar);
        AbstractC0219i.e("nameFilter", interfaceC0107b);
        return (Collection) this.f2802e.getValue();
    }

    @Override // X3.n
    public final Collection e(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        return h(this.f2799b.e(fVar, enumC0915b));
    }

    @Override // X3.n
    public final Set f() {
        return this.f2799b.f();
    }

    @Override // X3.p
    public final InterfaceC0763g g(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        AbstractC0219i.e("location", enumC0915b);
        InterfaceC0763g interfaceC0763gG = this.f2799b.g(fVar, enumC0915b);
        if (interfaceC0763gG != null) {
            return (InterfaceC0763g) i(interfaceC0763gG);
        }
        return null;
    }

    public final Collection h(Collection collection) {
        if (this.f2800c.f6668a.e() || collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        LinkedHashSet linkedHashSet = new LinkedHashSet(size >= 3 ? (size / 3) + size + 1 : 3);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(i((InterfaceC0766j) it.next()));
        }
        return linkedHashSet;
    }

    public final InterfaceC0766j i(InterfaceC0766j interfaceC0766j) {
        V v2 = this.f2800c;
        if (v2.f6668a.e()) {
            return interfaceC0766j;
        }
        if (this.f2801d == null) {
            this.f2801d = new HashMap();
        }
        HashMap map = this.f2801d;
        AbstractC0219i.b(map);
        Object objC = map.get(interfaceC0766j);
        if (objC == null) {
            if (!(interfaceC0766j instanceof InterfaceC0754P)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + interfaceC0766j).toString());
            }
            objC = ((InterfaceC0754P) interfaceC0766j).c(v2);
            if (objC == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + interfaceC0766j + " substitution fails");
            }
            map.put(interfaceC0766j, objC);
        }
        return (InterfaceC0766j) objC;
    }
}
