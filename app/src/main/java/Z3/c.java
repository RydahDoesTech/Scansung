package z3;

import C3.C0015g;
import P2.z;
import b3.AbstractC0219i;
import g3.y;
import m3.m;
import v3.AbstractC0897d;
import v3.C0898e;
import y3.x;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final N3.f f9487a = N3.f.e("message");

    /* renamed from: b, reason: collision with root package name */
    public static final N3.f f9488b = N3.f.e("allowedTargets");

    /* renamed from: c, reason: collision with root package name */
    public static final N3.f f9489c = N3.f.e("value");

    /* renamed from: d, reason: collision with root package name */
    public static final Object f9490d = z.i0(new O2.f(m.f8135t, x.f9443c), new O2.f(m.f8138w, x.f9444d), new O2.f(m.f8139x, x.f));

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    public static A3.i a(N3.c cVar, E3.b bVar, B3.g gVar) {
        C0898e c0898eT;
        AbstractC0219i.e("kotlinName", cVar);
        AbstractC0219i.e("annotationOwner", bVar);
        AbstractC0219i.e("c", gVar);
        if (cVar.equals(m.f8129m)) {
            N3.c cVar2 = x.f9445e;
            AbstractC0219i.d("DEPRECATED_ANNOTATION", cVar2);
            C0898e c0898eT2 = bVar.t(cVar2);
            if (c0898eT2 != null) {
                return new g(c0898eT2, gVar);
            }
        }
        N3.c cVar3 = (N3.c) f9490d.get(cVar);
        if (cVar3 == null || (c0898eT = bVar.t(cVar3)) == null) {
            return null;
        }
        return b(gVar, c0898eT, false);
    }

    public static A3.i b(B3.g gVar, C0898e c0898e, boolean z4) {
        AbstractC0219i.e("annotation", c0898e);
        AbstractC0219i.e("c", gVar);
        N3.b bVarA = AbstractC0897d.a(y.z(y.s(c0898e.f9246a)));
        if (bVarA.equals(N3.b.j(x.f9443c))) {
            return new k(c0898e, gVar);
        }
        if (bVarA.equals(N3.b.j(x.f9444d))) {
            return new j(c0898e, gVar);
        }
        if (bVarA.equals(N3.b.j(x.f))) {
            return new b(gVar, c0898e, m.f8139x);
        }
        if (bVarA.equals(N3.b.j(x.f9445e))) {
            return null;
        }
        return new C0015g(gVar, c0898e, z4);
    }
}
