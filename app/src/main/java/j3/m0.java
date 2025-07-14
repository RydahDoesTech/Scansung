package j3;

import a3.InterfaceC0106a;
import b3.AbstractC0219i;
import e4.AbstractC0438v;
import g3.InterfaceC0454d;
import g3.InterfaceC0466p;
import java.lang.reflect.Array;
import java.util.List;
import p3.InterfaceC0755Q;
import p3.InterfaceC0761e;
import p3.InterfaceC0763g;
import v3.AbstractC0897d;

/* loaded from: classes.dex */
public final class m0 implements b3.j {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0466p[] f7415e;

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0438v f7416a;

    /* renamed from: b, reason: collision with root package name */
    public final q0 f7417b;

    /* renamed from: c, reason: collision with root package name */
    public final q0 f7418c;

    /* renamed from: d, reason: collision with root package name */
    public final q0 f7419d;

    static {
        b3.r rVar = b3.q.f5100a;
        f7415e = new InterfaceC0466p[]{rVar.e(new b3.n(rVar.b(m0.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), rVar.e(new b3.n(rVar.b(m0.class), "arguments", "getArguments()Ljava/util/List;"))};
    }

    public m0(AbstractC0438v abstractC0438v, InterfaceC0106a interfaceC0106a) {
        AbstractC0219i.e("type", abstractC0438v);
        this.f7416a = abstractC0438v;
        q0 q0Var = interfaceC0106a instanceof q0 ? (q0) interfaceC0106a : null;
        this.f7417b = q0Var == null ? interfaceC0106a != null ? s0.h(null, interfaceC0106a) : null : q0Var;
        this.f7418c = s0.h(null, new l0(1, this));
        this.f7419d = s0.h(null, new B3.a(this, 9, interfaceC0106a));
    }

    public final InterfaceC0454d a(AbstractC0438v abstractC0438v) {
        AbstractC0438v abstractC0438vB;
        InterfaceC0763g interfaceC0763gI = abstractC0438v.I0().i();
        if (!(interfaceC0763gI instanceof InterfaceC0761e)) {
            if (interfaceC0763gI instanceof InterfaceC0755Q) {
                return new n0(null, (InterfaceC0755Q) interfaceC0763gI);
            }
            if (interfaceC0763gI instanceof c4.s) {
                throw new O2.e("An operation is not implemented: Type alias classifiers are not yet supported");
            }
            return null;
        }
        Class clsJ = x0.j((InterfaceC0761e) interfaceC0763gI);
        if (clsJ == null) {
            return null;
        }
        if (!clsJ.isArray()) {
            if (e4.X.e(abstractC0438v)) {
                return new C0585z(clsJ);
            }
            Class cls = (Class) AbstractC0897d.f9244b.get(clsJ);
            if (cls != null) {
                clsJ = cls;
            }
            return new C0585z(clsJ);
        }
        e4.N n = (e4.N) P2.m.L0(abstractC0438v.s0());
        if (n == null || (abstractC0438vB = n.b()) == null) {
            return new C0585z(clsJ);
        }
        InterfaceC0454d interfaceC0454dA = a(abstractC0438vB);
        if (interfaceC0454dA != null) {
            return new C0585z(Array.newInstance((Class<?>) g3.y.z(g3.y.E(interfaceC0454dA)), 0).getClass());
        }
        throw new O2.e("Cannot determine classifier for array element type: " + this, 2);
    }

    public final List b() {
        InterfaceC0466p interfaceC0466p = f7415e[1];
        Object objA = this.f7419d.a();
        AbstractC0219i.d("<get-arguments>(...)", objA);
        return (List) objA;
    }

    public final InterfaceC0454d c() {
        InterfaceC0466p interfaceC0466p = f7415e[0];
        return (InterfaceC0454d) this.f7418c.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m0) {
            m0 m0Var = (m0) obj;
            if (AbstractC0219i.a(this.f7416a, m0Var.f7416a) && AbstractC0219i.a(c(), m0Var.c()) && b().equals(m0Var.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f7416a.hashCode() * 31;
        InterfaceC0454d interfaceC0454dC = c();
        return b().hashCode() + ((iHashCode + (interfaceC0454dC != null ? interfaceC0454dC.hashCode() : 0)) * 31);
    }

    public final String toString() {
        P3.g gVar = u0.f7441a;
        return u0.d(this.f7416a);
    }
}
