package g4;

import P2.u;
import X3.n;
import b3.AbstractC0219i;
import d4.l;
import e4.S;
import e4.V;
import java.util.List;
import p3.AbstractC0771o;
import p3.C0753O;
import p3.InterfaceC0752N;
import p3.InterfaceC0761e;
import p3.InterfaceC0767k;
import q3.C0797g;
import s3.C0855k;
import s3.C0857m;

/* loaded from: classes.dex */
public final class a extends C0857m {
    /* JADX WARN: Illegal instructions before constructor call */
    public a(N3.f fVar) {
        j jVar = j.f6837a;
        c cVar = j.f6838b;
        List list = u.f2163d;
        C0753O c0753o = InterfaceC0752N.f8400b;
        super(cVar, fVar, 3, 1, list, l.f6418e);
        C0855k c0855k = new C0855k(this, null, C0797g.f8481a, true, 1, c0753o);
        c0855k.c1(list, AbstractC0771o.f8422d);
        String str = c0855k.getName().f1842d;
        AbstractC0219i.d("errorConstructor.name.toString()", str);
        e eVarB = j.b(new String[]{str, ""}, 9);
        i iVar = i.f6833y;
        c0855k.f8879j = new g(j.d(iVar, new String[0]), eVarB, iVar, list, false, new String[0]);
        s0(eVarB, V1.a.l0(c0855k), c0855k);
    }

    @Override // s3.AbstractC0846b, p3.InterfaceC0754P
    public final InterfaceC0767k c(V v2) {
        AbstractC0219i.e("substitutor", v2);
        return this;
    }

    @Override // s3.AbstractC0846b, s3.AbstractC0825A
    public final n m(S s2, f4.f fVar) {
        String str = getName().f1842d;
        AbstractC0219i.d("name.toString()", str);
        return j.b(new String[]{str, s2.toString()}, 9);
    }

    @Override // s3.AbstractC0846b
    /* renamed from: n0 */
    public final InterfaceC0761e c(V v2) {
        AbstractC0219i.e("substitutor", v2);
        return this;
    }

    @Override // s3.C0857m
    public final String toString() {
        String strB = getName().b();
        AbstractC0219i.d("name.asString()", strB);
        return strB;
    }
}
