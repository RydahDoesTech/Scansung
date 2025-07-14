package e4;

import C3.C0012d;
import b3.AbstractC0219i;
import java.util.Collection;
import java.util.List;
import p3.C0753O;
import p3.InterfaceC0763g;

/* renamed from: e4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0424g implements J {

    /* renamed from: a, reason: collision with root package name */
    public int f6680a;

    /* renamed from: b, reason: collision with root package name */
    public final d4.d f6681b;

    public AbstractC0424g(d4.o oVar) {
        AbstractC0219i.e("storageManager", oVar);
        this.f6681b = new d4.d((d4.l) oVar, new C0012d(15, this), new B3.d(15, this));
    }

    public abstract Collection b();

    public abstract AbstractC0438v c();

    public abstract C0753O d();

    @Override // e4.J
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final List j() {
        return ((C0422e) this.f6681b.a()).f6677b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J) || obj.hashCode() != hashCode()) {
            return false;
        }
        J j5 = (J) obj;
        if (j5.k().size() != k().size()) {
            return false;
        }
        InterfaceC0763g interfaceC0763gI = i();
        InterfaceC0763g interfaceC0763gI2 = j5.i();
        if (interfaceC0763gI2 == null || g4.j.f(interfaceC0763gI) || Q3.f.p(interfaceC0763gI) || g4.j.f(interfaceC0763gI2) || Q3.f.p(interfaceC0763gI2)) {
            return false;
        }
        return f(interfaceC0763gI2);
    }

    public abstract boolean f(InterfaceC0763g interfaceC0763g);

    public final int hashCode() {
        int i5 = this.f6680a;
        if (i5 != 0) {
            return i5;
        }
        InterfaceC0763g interfaceC0763gI = i();
        int iIdentityHashCode = (g4.j.f(interfaceC0763gI) || Q3.f.p(interfaceC0763gI)) ? System.identityHashCode(this) : Q3.f.g(interfaceC0763gI).f1838a.hashCode();
        this.f6680a = iIdentityHashCode;
        return iIdentityHashCode;
    }

    public List l(List list) {
        return list;
    }
}
