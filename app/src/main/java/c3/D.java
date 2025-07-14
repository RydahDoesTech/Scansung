package C3;

import a3.InterfaceC0107b;
import b3.AbstractC0219i;
import e4.AbstractC0438v;
import e4.Z;
import g3.InterfaceC0466p;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p3.InterfaceC0755Q;
import p3.InterfaceC0766j;
import r0.AbstractC0809c;
import s3.AbstractC0866v;
import s3.C0826B;
import s3.C0843T;
import s3.C0867w;
import v3.AbstractC0890B;
import v3.C0891C;
import v3.C0892D;
import x3.EnumC0915b;

/* loaded from: classes.dex */
public abstract class D extends X3.o {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0466p[] f356m;

    /* renamed from: b, reason: collision with root package name */
    public final B3.g f357b;

    /* renamed from: c, reason: collision with root package name */
    public final D f358c;

    /* renamed from: d, reason: collision with root package name */
    public final d4.c f359d;

    /* renamed from: e, reason: collision with root package name */
    public final d4.i f360e;
    public final d4.e f;

    /* renamed from: g, reason: collision with root package name */
    public final d4.j f361g;

    /* renamed from: h, reason: collision with root package name */
    public final d4.e f362h;

    /* renamed from: i, reason: collision with root package name */
    public final d4.i f363i;

    /* renamed from: j, reason: collision with root package name */
    public final d4.i f364j;

    /* renamed from: k, reason: collision with root package name */
    public final d4.i f365k;

    /* renamed from: l, reason: collision with root package name */
    public final d4.e f366l;

    static {
        b3.r rVar = b3.q.f5100a;
        f356m = new InterfaceC0466p[]{rVar.e(new b3.n(rVar.b(D.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), rVar.e(new b3.n(rVar.b(D.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), rVar.e(new b3.n(rVar.b(D.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};
    }

    public D(B3.g gVar, D d5) {
        AbstractC0219i.e("c", gVar);
        this.f357b = gVar;
        this.f358c = d5;
        d4.l lVar = ((B3.b) gVar.f255e).f223a;
        A a5 = new A(this, 0);
        lVar.getClass();
        this.f359d = new d4.c(lVar, a5);
        A a6 = new A(this, 2);
        lVar.getClass();
        this.f360e = new d4.i(lVar, a6);
        this.f = lVar.b(new B(this, 1));
        this.f361g = lVar.c(new B(this, 0));
        this.f362h = lVar.b(new B(this, 2));
        A a7 = new A(this, 3);
        lVar.getClass();
        this.f363i = new d4.i(lVar, a7);
        A a8 = new A(this, 4);
        lVar.getClass();
        this.f364j = new d4.i(lVar, a8);
        A a9 = new A(this, 1);
        lVar.getClass();
        this.f365k = new d4.i(lVar, a9);
        this.f366l = lVar.b(new B(this, 3));
    }

    public static AbstractC0438v l(v3.x xVar, B3.g gVar) {
        AbstractC0219i.e("method", xVar);
        Class<?> declaringClass = ((Method) xVar.a()).getDeclaringClass();
        AbstractC0219i.d("member.declaringClass", declaringClass);
        D3.a aVarN0 = V1.a.n0(2, declaringClass.isAnnotation(), false, null, 6);
        return ((D3.c) gVar.f258i).r(xVar.e(), aVarN0);
    }

    public static A1.c u(B3.g gVar, AbstractC0866v abstractC0866v, List list) {
        O2.f fVar;
        N3.f fVar2;
        N3.f fVarE;
        P2.k kVarS0 = P2.m.S0(list);
        ArrayList arrayList = new ArrayList(P2.o.l0(kVarS0));
        Iterator it = kVarS0.iterator();
        boolean z4 = false;
        while (true) {
            P2.y yVar = (P2.y) it;
            if (!yVar.f2169e.hasNext()) {
                return new A1.c(P2.m.O0(arrayList), z4, 1);
            }
            P2.x xVar = (P2.x) yVar.next();
            int i5 = xVar.f2166a;
            C0892D c0892d = (C0892D) xVar.f2167b;
            B3.e eVarN = Y0.j.N(gVar, c0892d);
            D3.a aVarN0 = V1.a.n0(2, false, false, null, 7);
            B3.b bVar = (B3.b) gVar.f255e;
            AbstractC0890B abstractC0890B = c0892d.f9230a;
            boolean z5 = c0892d.f9233d;
            D3.c cVar = (D3.c) gVar.f258i;
            C0826B c0826b = bVar.f235o;
            if (z5) {
                v3.i iVar = abstractC0890B instanceof v3.i ? (v3.i) abstractC0890B : null;
                if (iVar == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + c0892d);
                }
                Z zQ = cVar.q(iVar, aVarN0, true);
                fVar = new O2.f(zQ, c0826b.f8732g.f(zQ));
            } else {
                fVar = new O2.f(cVar.r(abstractC0890B, aVarN0), null);
            }
            AbstractC0438v abstractC0438v = (AbstractC0438v) fVar.f2006d;
            AbstractC0438v abstractC0438v2 = (AbstractC0438v) fVar.f2007e;
            if (AbstractC0219i.a(abstractC0866v.getName().b(), "equals") && list.size() == 1 && c0826b.f8732g.n().equals(abstractC0438v)) {
                fVarE = N3.f.e("other");
            } else {
                String str = c0892d.f9232c;
                N3.f fVarD = str != null ? N3.f.d(str) : null;
                if (fVarD == null) {
                    z4 = true;
                }
                if (fVarD == null) {
                    fVarE = N3.f.e("p" + i5);
                } else {
                    fVar2 = fVarD;
                    arrayList.add(new C0843T(abstractC0866v, null, i5, eVarN, fVar2, abstractC0438v, false, false, false, abstractC0438v2, bVar.f231j.c(c0892d)));
                }
            }
            fVar2 = fVarE;
            arrayList.add(new C0843T(abstractC0866v, null, i5, eVarN, fVar2, abstractC0438v, false, false, false, abstractC0438v2, bVar.f231j.c(c0892d)));
        }
    }

    @Override // X3.o, X3.n
    public final Set a() {
        return (Set) V1.a.Q(this.f363i, f356m[0]);
    }

    @Override // X3.o, X3.n
    public final Set b() {
        return (Set) V1.a.Q(this.f364j, f356m[1]);
    }

    @Override // X3.o, X3.n
    public Collection c(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        return !b().contains(fVar) ? P2.u.f2163d : (Collection) this.f366l.d(fVar);
    }

    @Override // X3.o, X3.p
    public Collection d(X3.f fVar, InterfaceC0107b interfaceC0107b) {
        AbstractC0219i.e("kindFilter", fVar);
        AbstractC0219i.e("nameFilter", interfaceC0107b);
        return (Collection) this.f359d.a();
    }

    @Override // X3.o, X3.n
    public Collection e(N3.f fVar, EnumC0915b enumC0915b) {
        AbstractC0219i.e("name", fVar);
        AbstractC0219i.e("location", enumC0915b);
        return !a().contains(fVar) ? P2.u.f2163d : (Collection) this.f362h.d(fVar);
    }

    @Override // X3.o, X3.n
    public final Set f() {
        return (Set) V1.a.Q(this.f365k, f356m[2]);
    }

    public abstract Set h(X3.f fVar, X3.k kVar);

    public abstract Set i(X3.f fVar, X3.k kVar);

    public void j(N3.f fVar, ArrayList arrayList) {
        AbstractC0219i.e("name", fVar);
    }

    public abstract InterfaceC0011c k();

    public abstract void m(LinkedHashSet linkedHashSet, N3.f fVar);

    public abstract void n(N3.f fVar, ArrayList arrayList);

    public abstract Set o(X3.f fVar);

    public abstract C0867w p();

    public abstract InterfaceC0766j q();

    public boolean r(A3.g gVar) {
        return true;
    }

    public abstract z s(v3.x xVar, ArrayList arrayList, AbstractC0438v abstractC0438v, List list);

    /* JADX WARN: Type inference failed for: r4v2, types: [O2.c, java.lang.Object] */
    public final A3.g t(v3.x xVar) {
        AbstractC0219i.e("method", xVar);
        B3.g gVar = this.f357b;
        int i5 = 1;
        A3.g gVarD1 = A3.g.d1(q(), Y0.j.N(gVar, xVar), xVar.b(), ((B3.b) gVar.f255e).f231j.c(xVar), ((InterfaceC0011c) this.f360e.a()).a(xVar.b()) != null && ((ArrayList) xVar.f()).isEmpty());
        AbstractC0219i.e("<this>", gVar);
        B3.g gVar2 = new B3.g((B3.b) gVar.f255e, new B3.h(gVar, gVarD1, xVar, 0), gVar.f256g);
        ArrayList arrayListU = xVar.u();
        ArrayList arrayList = new ArrayList(P2.o.l0(arrayListU));
        Iterator it = arrayListU.iterator();
        while (it.hasNext()) {
            InterfaceC0755Q interfaceC0755QA = ((B3.i) gVar2.f).a((C0891C) it.next());
            AbstractC0219i.b(interfaceC0755QA);
            arrayList.add(interfaceC0755QA);
        }
        A1.c cVarU = u(gVar2, gVarD1, xVar.f());
        z zVarS = s(xVar, arrayList, l(xVar, gVar2), (List) cVarU.f);
        C0867w c0867wP = p();
        P2.u uVar = P2.u.f2163d;
        boolean zIsAbstract = Modifier.isAbstract(((Method) xVar.a()).getModifiers());
        boolean zIsFinal = Modifier.isFinal(((Method) xVar.a()).getModifiers());
        if (zIsAbstract) {
            i5 = 4;
        } else if (!zIsFinal) {
            i5 = 3;
        }
        gVarD1.c1(null, c0867wP, uVar, zVarS.f456c, zVarS.f455b, zVarS.f454a, i5, AbstractC0809c.j(xVar.d()), P2.v.f2164d);
        gVarD1.e1(false, cVarU.f53e);
        if (zVarS.f457d.isEmpty()) {
            return gVarD1;
        }
        ((B3.b) gVar2.f255e).f227e.getClass();
        throw new UnsupportedOperationException("Should not be called");
    }

    public String toString() {
        return "Lazy scope for " + q();
    }
}
