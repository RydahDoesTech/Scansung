package j3;

import b3.AbstractC0219i;
import b3.C0211a;
import g3.InterfaceC0466p;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import k3.InterfaceC0673e;
import p3.InterfaceC0750L;
import s3.C0834J;

/* loaded from: classes.dex */
public abstract class k0 extends r implements InterfaceC0466p {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f7401k = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final D f7402e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7403g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f7404h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f7405i;

    /* renamed from: j, reason: collision with root package name */
    public final q0 f7406j;

    public k0(D d5, String str, String str2, C0834J c0834j, Object obj) {
        this.f7402e = d5;
        this.f = str;
        this.f7403g = str2;
        this.f7404h = obj;
        this.f7405i = g3.y.M(2, new j0(this, 1));
        this.f7406j = s0.h(c0834j, new j0(this, 0));
    }

    public final boolean equals(Object obj) {
        k0 k0VarC = x0.c(obj);
        return k0VarC != null && AbstractC0219i.a(this.f7402e, k0VarC.f7402e) && AbstractC0219i.a(this.f, k0VarC.f) && AbstractC0219i.a(this.f7403g, k0VarC.f7403g) && AbstractC0219i.a(this.f7404h, k0VarC.f7404h);
    }

    @Override // j3.r
    public final InterfaceC0673e g() {
        return r().g();
    }

    @Override // g3.InterfaceC0452b
    public final String getName() {
        return this.f;
    }

    @Override // g3.InterfaceC0452b
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return this.f7403g.hashCode() + ((this.f.hashCode() + (this.f7402e.hashCode() * 31)) * 31);
    }

    @Override // j3.r
    public final D j() {
        return this.f7402e;
    }

    @Override // j3.r
    public final InterfaceC0673e k() {
        r().getClass();
        return null;
    }

    @Override // j3.r
    public final boolean o() {
        return !AbstractC0219i.a(this.f7404h, C0211a.f5085d);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [O2.c, java.lang.Object] */
    public final Member p() {
        if (!l().H()) {
            return null;
        }
        N3.b bVar = v0.f7443a;
        s0 s0VarB = v0.b(l());
        if (s0VarB instanceof C0573m) {
            C0573m c0573m = (C0573m) s0VarB;
            L3.e eVar = c0573m.f7411g;
            if ((eVar.f1758e & 16) == 16) {
                L3.c cVar = eVar.f1762j;
                int i5 = cVar.f1747e;
                if ((i5 & 1) != 1 || (i5 & 2) != 2) {
                    return null;
                }
                int i6 = cVar.f;
                K3.f fVar = c0573m.f7412h;
                return this.f7402e.c(fVar.s(i6), fVar.s(cVar.f1748g));
            }
        }
        return (Field) this.f7405i.getValue();
    }

    @Override // j3.r
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0750L l() {
        Object objA = this.f7406j.a();
        AbstractC0219i.d("_descriptor()", objA);
        return (InterfaceC0750L) objA;
    }

    public abstract g0 r();

    public final String toString() {
        P3.g gVar = u0.f7441a;
        return u0.c(l());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k0(D d5, C0834J c0834j) {
        AbstractC0219i.e("container", d5);
        AbstractC0219i.e("descriptor", c0834j);
        String strB = c0834j.getName().b();
        AbstractC0219i.d("descriptor.name.asString()", strB);
        this(d5, strB, v0.b(c0834j).d(), c0834j, C0211a.f5085d);
    }
}
