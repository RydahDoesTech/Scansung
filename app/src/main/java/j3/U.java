package j3;

import a3.InterfaceC0106a;
import b3.AbstractC0219i;
import e4.AbstractC0438v;
import g3.InterfaceC0461k;
import g3.InterfaceC0466p;
import k.Q0;
import p3.InterfaceC0748J;
import p3.InterfaceC0750L;
import p3.InterfaceC0759c;
import p3.InterfaceC0776t;
import s3.C0843T;

/* loaded from: classes.dex */
public final class U implements InterfaceC0461k {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0466p[] f7355e;

    /* renamed from: a, reason: collision with root package name */
    public final r f7356a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7357b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7358c;

    /* renamed from: d, reason: collision with root package name */
    public final q0 f7359d;

    static {
        b3.r rVar = b3.q.f5100a;
        f7355e = new InterfaceC0466p[]{rVar.e(new b3.n(rVar.b(U.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), rVar.e(new b3.n(rVar.b(U.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public U(r rVar, int i5, int i6, InterfaceC0106a interfaceC0106a) {
        AbstractC0219i.e("callable", rVar);
        A3.f.q(i6, "kind");
        this.f7356a = rVar;
        this.f7357b = i5;
        this.f7358c = i6;
        this.f7359d = s0.h(null, interfaceC0106a);
        s0.h(null, new T(this, 0));
    }

    public final InterfaceC0748J a() {
        InterfaceC0466p interfaceC0466p = f7355e[0];
        Object objA = this.f7359d.a();
        AbstractC0219i.d("<get-descriptor>(...)", objA);
        return (InterfaceC0748J) objA;
    }

    public final String b() {
        InterfaceC0748J interfaceC0748JA = a();
        C0843T c0843t = interfaceC0748JA instanceof C0843T ? (C0843T) interfaceC0748JA : null;
        if (c0843t == null || c0843t.l().o0()) {
            return null;
        }
        N3.f name = c0843t.getName();
        AbstractC0219i.d("valueParameter.name", name);
        if (name.f1843e) {
            return null;
        }
        return name.b();
    }

    public final m0 c() {
        AbstractC0438v abstractC0438vD = a().d();
        AbstractC0219i.d("descriptor.type", abstractC0438vD);
        return new m0(abstractC0438vD, new T(this, 1));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof U) {
            U u4 = (U) obj;
            if (AbstractC0219i.a(this.f7356a, u4.f7356a)) {
                if (this.f7357b == u4.f7357b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7357b) + (this.f7356a.hashCode() * 31);
    }

    public final String toString() {
        String strB;
        P3.g gVar = u0.f7441a;
        StringBuilder sb = new StringBuilder();
        int iC = Q0.c(this.f7358c);
        if (iC == 0) {
            sb.append("instance parameter");
        } else if (iC == 1) {
            sb.append("extension receiver parameter");
        } else if (iC == 2) {
            sb.append("parameter #" + this.f7357b + ' ' + b());
        }
        sb.append(" of ");
        InterfaceC0759c interfaceC0759cL = this.f7356a.l();
        if (interfaceC0759cL instanceof InterfaceC0750L) {
            strB = u0.c((InterfaceC0750L) interfaceC0759cL);
        } else {
            if (!(interfaceC0759cL instanceof InterfaceC0776t)) {
                throw new IllegalStateException(("Illegal callable: " + interfaceC0759cL).toString());
            }
            strB = u0.b((InterfaceC0776t) interfaceC0759cL);
        }
        sb.append(strB);
        String string = sb.toString();
        AbstractC0219i.d("StringBuilder().apply(builderAction).toString()", string);
        return string;
    }
}
