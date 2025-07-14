package S3;

import C3.C0012d;
import b3.AbstractC0219i;
import e4.C0421d;
import e4.G;
import e4.J;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import m3.AbstractC0695h;
import p3.InterfaceC0763g;

/* loaded from: classes.dex */
public final class m implements J {

    /* renamed from: a, reason: collision with root package name */
    public final Set f2537a;

    /* renamed from: b, reason: collision with root package name */
    public final O2.i f2538b;

    public m(Set set) {
        G.f6646e.getClass();
        G g5 = G.f;
        AbstractC0219i.e("attributes", g5);
        C0421d.s(g4.j.a(2, true, "unknown integer literal type"), g5, this, P2.u.f2163d, false);
        this.f2538b = new O2.i(new C0012d(5, this));
        this.f2537a = set;
    }

    @Override // e4.J
    public final AbstractC0695h g() {
        throw null;
    }

    @Override // e4.J
    public final boolean h() {
        return false;
    }

    @Override // e4.J
    public final InterfaceC0763g i() {
        return null;
    }

    @Override // e4.J
    public final Collection j() {
        return (List) this.f2538b.getValue();
    }

    @Override // e4.J
    public final List k() {
        return P2.u.f2163d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntegerLiteralType");
        sb.append("[" + P2.m.A0(this.f2537a, ",", null, null, l.f2536d, 30) + ']');
        return sb.toString();
    }
}
