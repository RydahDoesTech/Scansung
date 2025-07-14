package M3;

import I3.C;
import I3.C0019a;
import I3.C0028j;
import I3.C0030l;
import I3.C0042y;
import I3.G;
import I3.Q;
import I3.Z;
import L3.j;
import L3.k;
import O3.AbstractC0070b;
import O3.C0074f;
import O3.C0077i;
import O3.C0083o;
import O3.C0086s;
import P2.m;
import P2.n;
import P2.o;
import b3.AbstractC0219i;
import e1.AbstractC0415a;
import g3.y;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final C0077i f1826a;

    static {
        C0077i c0077i = new C0077i();
        c0077i.a(k.f1796a);
        c0077i.a(k.f1797b);
        c0077i.a(k.f1798c);
        c0077i.a(k.f1799d);
        c0077i.a(k.f1800e);
        c0077i.a(k.f);
        c0077i.a(k.f1801g);
        c0077i.a(k.f1802h);
        c0077i.a(k.f1803i);
        c0077i.a(k.f1804j);
        c0077i.a(k.f1805k);
        c0077i.a(k.f1806l);
        c0077i.a(k.f1807m);
        c0077i.a(k.n);
        f1826a = c0077i;
    }

    public static e a(C0030l c0030l, K3.f fVar, K3.g gVar) {
        String strA0;
        AbstractC0219i.e("proto", c0030l);
        AbstractC0219i.e("nameResolver", fVar);
        AbstractC0219i.e("typeTable", gVar);
        C0083o c0083o = k.f1796a;
        AbstractC0219i.d("constructorSignature", c0083o);
        L3.c cVar = (L3.c) AbstractC0415a.s(c0030l, c0083o);
        String strS = (cVar == null || (cVar.f1747e & 1) != 1) ? "<init>" : fVar.s(cVar.f);
        if (cVar == null || (cVar.f1747e & 2) != 2) {
            List<Z> list = c0030l.f1315h;
            AbstractC0219i.d("proto.valueParameterList", list);
            ArrayList arrayList = new ArrayList(o.l0(list));
            for (Z z4 : list) {
                AbstractC0219i.d("it", z4);
                String strE = e(y.e0(z4, gVar), fVar);
                if (strE == null) {
                    return null;
                }
                arrayList.add(strE);
            }
            strA0 = m.A0(arrayList, "", "(", ")V", null, 56);
        } else {
            strA0 = fVar.s(cVar.f1748g);
        }
        return new e(strS, strA0);
    }

    public static d b(G g5, K3.f fVar, K3.g gVar, boolean z4) {
        String strE;
        AbstractC0219i.e("proto", g5);
        AbstractC0219i.e("nameResolver", fVar);
        AbstractC0219i.e("typeTable", gVar);
        C0083o c0083o = k.f1799d;
        AbstractC0219i.d("propertySignature", c0083o);
        L3.e eVar = (L3.e) AbstractC0415a.s(g5, c0083o);
        if (eVar == null) {
            return null;
        }
        L3.b bVar = (eVar.f1758e & 1) == 1 ? eVar.f : null;
        if (bVar == null && z4) {
            return null;
        }
        int i5 = (bVar == null || (bVar.f1740e & 1) != 1) ? g5.f1003i : bVar.f;
        if (bVar == null || (bVar.f1740e & 2) != 2) {
            strE = e(y.V(g5, gVar), fVar);
            if (strE == null) {
                return null;
            }
        } else {
            strE = fVar.s(bVar.f1741g);
        }
        return new d(fVar.s(i5), strE);
    }

    public static e c(C0042y c0042y, K3.f fVar, K3.g gVar) {
        String strConcat;
        AbstractC0219i.e("proto", c0042y);
        AbstractC0219i.e("nameResolver", fVar);
        AbstractC0219i.e("typeTable", gVar);
        C0083o c0083o = k.f1797b;
        AbstractC0219i.d("methodSignature", c0083o);
        L3.c cVar = (L3.c) AbstractC0415a.s(c0042y, c0083o);
        int i5 = (cVar == null || (cVar.f1747e & 1) != 1) ? c0042y.f1396i : cVar.f;
        if (cVar == null || (cVar.f1747e & 2) != 2) {
            List listI0 = n.i0(y.T(c0042y, gVar));
            List<Z> list = c0042y.f1404r;
            AbstractC0219i.d("proto.valueParameterList", list);
            ArrayList arrayList = new ArrayList(o.l0(list));
            for (Z z4 : list) {
                AbstractC0219i.d("it", z4);
                arrayList.add(y.e0(z4, gVar));
            }
            ArrayList arrayListG0 = m.G0(listI0, arrayList);
            ArrayList arrayList2 = new ArrayList(o.l0(arrayListG0));
            Iterator it = arrayListG0.iterator();
            while (it.hasNext()) {
                String strE = e((Q) it.next(), fVar);
                if (strE == null) {
                    return null;
                }
                arrayList2.add(strE);
            }
            String strE2 = e(y.U(c0042y, gVar), fVar);
            if (strE2 == null) {
                return null;
            }
            strConcat = m.A0(arrayList2, "", "(", ")", null, 56).concat(strE2);
        } else {
            strConcat = fVar.s(cVar.f1748g);
        }
        return new e(fVar.s(i5), strConcat);
    }

    public static final boolean d(G g5) {
        AbstractC0219i.e("proto", g5);
        K3.b bVar = c.f1816a;
        Object objK = g5.k(k.f1800e);
        AbstractC0219i.d("proto.getExtension(JvmProtoBuf.flags)", objK);
        return bVar.c(((Number) objK).intValue()).booleanValue();
    }

    public static String e(Q q5, K3.f fVar) {
        if (q5.p()) {
            return b.b(fVar.s0(q5.f1080l));
        }
        return null;
    }

    public static final O2.f f(String[] strArr, String[] strArr2) throws C0086s {
        AbstractC0219i.e("strings", strArr2);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.a(strArr));
        g gVarG = g(byteArrayInputStream, strArr2);
        C0019a c0019a = C0028j.f1275N;
        c0019a.getClass();
        C0074f c0074f = new C0074f(byteArrayInputStream);
        AbstractC0070b abstractC0070b = (AbstractC0070b) c0019a.a(c0074f, f1826a);
        try {
            c0074f.a(0);
            if (abstractC0070b.b()) {
                return new O2.f(gVarG, (C0028j) abstractC0070b);
            }
            C0086s c0086s = new C0086s(new O2.d().getMessage());
            c0086s.f2092d = abstractC0070b;
            throw c0086s;
        } catch (C0086s e5) {
            e5.f2092d = abstractC0070b;
            throw e5;
        }
    }

    public static g g(ByteArrayInputStream byteArrayInputStream, String[] strArr) {
        j jVar = (j) j.f1790k.b(byteArrayInputStream, f1826a);
        AbstractC0219i.d("parseDelimitedFrom(this, EXTENSION_REGISTRY)", jVar);
        return new g(jVar, strArr);
    }

    public static final O2.f h(String[] strArr, String[] strArr2) throws C0086s {
        AbstractC0219i.e("data", strArr);
        AbstractC0219i.e("strings", strArr2);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.a(strArr));
        g gVarG = g(byteArrayInputStream, strArr2);
        C0019a c0019a = C.f962o;
        c0019a.getClass();
        C0074f c0074f = new C0074f(byteArrayInputStream);
        AbstractC0070b abstractC0070b = (AbstractC0070b) c0019a.a(c0074f, f1826a);
        try {
            c0074f.a(0);
            if (abstractC0070b.b()) {
                return new O2.f(gVarG, (C) abstractC0070b);
            }
            C0086s c0086s = new C0086s(new O2.d().getMessage());
            c0086s.f2092d = abstractC0070b;
            throw c0086s;
        } catch (C0086s e5) {
            e5.f2092d = abstractC0070b;
            throw e5;
        }
    }
}
