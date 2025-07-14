package j3;

import C3.C0012d;
import b0.C0198c;
import b3.AbstractC0219i;
import g3.InterfaceC0466p;
import g3.InterfaceC0467q;
import k.Q0;
import p3.InterfaceC0755Q;
import p3.InterfaceC0759c;
import p3.InterfaceC0761e;
import p3.InterfaceC0766j;
import u3.C0881c;

/* loaded from: classes.dex */
public final class n0 implements InterfaceC0467q {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0466p[] f7421g;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0755Q f7422d;

    /* renamed from: e, reason: collision with root package name */
    public final q0 f7423e;
    public final o0 f;

    static {
        b3.r rVar = b3.q.f5100a;
        f7421g = new InterfaceC0466p[]{rVar.e(new b3.n(rVar.b(n0.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};
    }

    public n0(o0 o0Var, InterfaceC0755Q interfaceC0755Q) {
        Class cls;
        C0585z c0585zB;
        Object objU;
        AbstractC0219i.e("descriptor", interfaceC0755Q);
        this.f7422d = interfaceC0755Q;
        this.f7423e = s0.h(null, new C0012d(23, this));
        if (o0Var == null) {
            InterfaceC0766j interfaceC0766jL = interfaceC0755Q.l();
            AbstractC0219i.d("descriptor.containingDeclaration", interfaceC0766jL);
            if (interfaceC0766jL instanceof InterfaceC0761e) {
                objU = b((InterfaceC0761e) interfaceC0766jL);
            } else {
                if (!(interfaceC0766jL instanceof InterfaceC0759c)) {
                    throw new O2.e("Unknown type parameter container: " + interfaceC0766jL, 2);
                }
                InterfaceC0766j interfaceC0766jL2 = ((InterfaceC0759c) interfaceC0766jL).l();
                AbstractC0219i.d("declaration.containingDeclaration", interfaceC0766jL2);
                if (interfaceC0766jL2 instanceof InterfaceC0761e) {
                    c0585zB = b((InterfaceC0761e) interfaceC0766jL2);
                } else {
                    c4.k kVar = interfaceC0766jL instanceof c4.k ? (c4.k) interfaceC0766jL : null;
                    if (kVar == null) {
                        throw new O2.e("Non-class callable descriptor must be deserialized: " + interfaceC0766jL, 2);
                    }
                    c4.j jVarY = kVar.y();
                    G3.h hVar = jVarY instanceof G3.h ? (G3.h) jVarY : null;
                    C0881c c0881c = hVar != null ? hVar.f : null;
                    C0881c c0881c2 = c0881c instanceof C0881c ? c0881c : null;
                    if (c0881c2 == null || (cls = c0881c2.f9187a) == null) {
                        throw new O2.e("Container of deserialized member is not resolved: " + kVar, 2);
                    }
                    c0585zB = (C0585z) g3.y.F(cls);
                }
                objU = interfaceC0766jL.U(new C0198c((D) c0585zB), O2.l.f2016a);
            }
            AbstractC0219i.d("when (val declaration = … $declaration\")\n        }", objU);
            o0Var = (o0) objU;
        }
        this.f = o0Var;
    }

    public static C0585z b(InterfaceC0761e interfaceC0761e) {
        Class clsJ = x0.j(interfaceC0761e);
        C0585z c0585z = (C0585z) (clsJ != null ? g3.y.F(clsJ) : null);
        if (c0585z != null) {
            return c0585z;
        }
        throw new O2.e("Type parameter container is not resolved: " + interfaceC0761e.l(), 2);
    }

    public final String a() {
        String strB = this.f7422d.getName().b();
        AbstractC0219i.d("descriptor.name.asString()", strB);
        return strB;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n0) {
            n0 n0Var = (n0) obj;
            if (AbstractC0219i.a(this.f, n0Var.f) && a().equals(n0Var.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode() + (this.f.hashCode() * 31);
    }

    public final String toString() {
        int i5;
        StringBuilder sb = new StringBuilder();
        int iC = Q0.c(this.f7422d.B());
        if (iC == 0) {
            i5 = 1;
        } else if (iC == 1) {
            i5 = 2;
        } else {
            if (iC != 2) {
                throw new O2.d();
            }
            i5 = 3;
        }
        int iC2 = Q0.c(i5);
        if (iC2 == 1) {
            sb.append("in ");
        } else if (iC2 == 2) {
            sb.append("out ");
        }
        sb.append(a());
        String string = sb.toString();
        AbstractC0219i.d("StringBuilder().apply(builderAction).toString()", string);
        return string;
    }
}
