package o3;

import C3.C0012d;
import P2.u;
import P2.w;
import Q3.p;
import b3.AbstractC0219i;
import b3.q;
import b3.r;
import com.samsung.android.knox.ex.KnoxContract;
import e4.AbstractC0442z;
import e4.C0440x;
import e4.S;
import e4.V;
import g3.InterfaceC0466p;
import g3.y;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import m3.AbstractC0695h;
import p3.AbstractC0779w;
import p3.InterfaceC0761e;
import p3.InterfaceC0763g;
import q3.InterfaceC0798h;
import r3.InterfaceC0816b;
import r3.InterfaceC0818d;
import s3.AbstractC0866v;
import s3.C0826B;
import s3.C0837M;
import s3.C0843T;
import s3.C0855k;
import s3.C0857m;
import s3.C0865u;
import x3.EnumC0915b;

/* renamed from: o3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0730m implements InterfaceC0816b, InterfaceC0818d {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC0466p[] f8279g;

    /* renamed from: a, reason: collision with root package name */
    public final C0826B f8280a;

    /* renamed from: b, reason: collision with root package name */
    public final d4.i f8281b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0442z f8282c;

    /* renamed from: d, reason: collision with root package name */
    public final d4.i f8283d;

    /* renamed from: e, reason: collision with root package name */
    public final d4.e f8284e;
    public final d4.i f;

    static {
        r rVar = q.f5100a;
        f8279g = new InterfaceC0466p[]{rVar.e(new b3.n(rVar.b(C0730m.class), KnoxContract.Config.Settings.ID, "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;")), rVar.e(new b3.n(rVar.b(C0730m.class), "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;")), rVar.e(new b3.n(rVar.b(C0730m.class), "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;"))};
    }

    public C0730m(C0826B c0826b, d4.l lVar, C0012d c0012d) {
        this.f8280a = c0826b;
        this.f8281b = new d4.i(lVar, c0012d);
        C0857m c0857m = new C0857m(new C0728k(c0826b, new N3.c("java.io"), 0), N3.f.e("Serializable"), 4, 2, y.N(new C0440x(lVar, new C0729l(this, 0))), lVar);
        c0857m.s0(X3.m.f2791b, w.f2165d, null);
        this.f8282c = c0857m.q();
        this.f8283d = new d4.i(lVar, new B3.a(this, 13, lVar));
        this.f8284e = new d4.e(lVar, new ConcurrentHashMap(3, 1.0f, 2), new d4.f(), 0);
        this.f = new d4.i(lVar, new C0729l(this, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b0 A[EDGE_INSN: B:120:0x01b0->B:59:0x01b0 BREAK  A[LOOP:3: B:70:0x01d4->B:121:?]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x022c  */
    @Override // r3.InterfaceC0816b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Collection a(N3.f r17, p3.InterfaceC0761e r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 745
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.C0730m.a(N3.f, p3.e):java.util.Collection");
    }

    @Override // r3.InterfaceC0816b
    public final Collection b(InterfaceC0761e interfaceC0761e) {
        AbstractC0219i.e("classDescriptor", interfaceC0761e);
        N3.e eVarH = U3.f.h(interfaceC0761e);
        LinkedHashSet linkedHashSet = C0732o.f8289a;
        N3.e eVar = m3.m.f8123g;
        boolean zIsAssignableFrom = false;
        boolean z4 = eVarH.equals(eVar) || m3.m.f8120c0.get(eVarH) != null;
        AbstractC0442z abstractC0442z = this.f8282c;
        if (z4) {
            AbstractC0442z abstractC0442z2 = (AbstractC0442z) V1.a.Q(this.f8283d, f8279g[1]);
            AbstractC0219i.d("cloneableType", abstractC0442z2);
            return P2.n.h0(abstractC0442z2, abstractC0442z);
        }
        if (eVarH.equals(eVar) || m3.m.f8120c0.get(eVarH) != null) {
            zIsAssignableFrom = true;
        } else {
            String str = C0721d.f8248a;
            N3.b bVarF = C0721d.f(eVarH);
            if (bVarF != null) {
                try {
                    zIsAssignableFrom = Serializable.class.isAssignableFrom(Class.forName(bVarF.b().b()));
                } catch (ClassNotFoundException unused) {
                }
            }
        }
        return zIsAssignableFrom ? y.N(abstractC0442z) : u.f2163d;
    }

    @Override // r3.InterfaceC0816b
    public final Collection c(InterfaceC0761e interfaceC0761e) {
        Set setA;
        AbstractC0219i.e("classDescriptor", interfaceC0761e);
        g().getClass();
        w wVar = w.f2165d;
        C3.k kVarF = f(interfaceC0761e);
        return (kVarF == null || (setA = kVarF.s0().a()) == null) ? wVar : setA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [P2.u, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    @Override // r3.InterfaceC0816b
    public final Collection d(InterfaceC0761e interfaceC0761e) {
        InterfaceC0761e interfaceC0761eB;
        AbstractC0219i.e("classDescriptor", interfaceC0761e);
        int iL = interfaceC0761e.L();
        ?? arrayList = u.f2163d;
        if (iL == 1) {
            g().getClass();
            C3.k kVarF = f(interfaceC0761e);
            if (kVarF == null || (interfaceC0761eB = C0722e.b(U3.f.g(kVarF), C0719b.f)) == null) {
                return arrayList;
            }
            V v2 = new V(y.o(interfaceC0761eB, kVarF));
            List list = (List) kVarF.f411t.f433q.a();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                C0855k c0855k = (C0855k) next;
                C0855k c0855k2 = c0855k;
                if (c0855k2.b().f8417a.f8416b) {
                    Collection<C0855k> collectionK = interfaceC0761eB.k();
                    AbstractC0219i.d("defaultKotlinVersion.constructors", collectionK);
                    if (!collectionK.isEmpty()) {
                        for (C0855k c0855k3 : collectionK) {
                            AbstractC0219i.d("it", c0855k3);
                            if (p.j(c0855k3, c0855k.c(v2)) == 1) {
                                break;
                            }
                        }
                    }
                    if (c0855k2.v0().size() == 1) {
                        List listV0 = c0855k2.v0();
                        AbstractC0219i.d("valueParameters", listV0);
                        InterfaceC0763g interfaceC0763gI = ((C0843T) P2.m.J0(listV0)).d().I0().i();
                        if (AbstractC0219i.a(interfaceC0763gI != null ? U3.f.h(interfaceC0763gI) : null, U3.f.h(interfaceC0761e))) {
                        }
                    }
                    if (!AbstractC0695h.B(c0855k) && !C0732o.f8293e.contains(J2.b.Z(kVarF, V1.a.j(c0855k, 3)))) {
                        arrayList2.add(next);
                    }
                }
            }
            arrayList = new ArrayList(P2.o.l0(arrayList2));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C0855k c0855k4 = (C0855k) it2.next();
                C0855k c0855k5 = c0855k4;
                c0855k5.getClass();
                C0865u c0865uU0 = c0855k5.U0(V.f6667b);
                c0865uU0.f8852e = interfaceC0761e;
                c0865uU0.m(interfaceC0761e.q());
                c0865uU0.f8863r = true;
                S sF = v2.f();
                if (sF == null) {
                    C0865u.b(37);
                    throw null;
                }
                c0865uU0.f8851d = sF;
                if (!C0732o.f.contains(J2.b.Z(kVarF, V1.a.j(c0855k4, 3)))) {
                    c0865uU0.y((InterfaceC0798h) V1.a.Q(this.f, f8279g[2]));
                }
                AbstractC0866v abstractC0866vR0 = c0865uU0.f8850A.R0(c0865uU0);
                AbstractC0219i.c("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor", abstractC0866vR0);
                arrayList.add((C0855k) abstractC0866vR0);
            }
        }
        return arrayList;
    }

    @Override // r3.InterfaceC0818d
    public final boolean e(InterfaceC0761e interfaceC0761e, c4.r rVar) {
        AbstractC0219i.e("classDescriptor", interfaceC0761e);
        C3.k kVarF = f(interfaceC0761e);
        if (kVarF == null || !rVar.s().e(r3.e.f8585a)) {
            return true;
        }
        g().getClass();
        String strJ = V1.a.j(rVar, 3);
        C3.r rVarS0 = kVarF.s0();
        N3.f name = rVar.getName();
        AbstractC0219i.d("functionDescriptor.name", name);
        Collection collectionE = rVarS0.e(name, EnumC0915b.f9315d);
        if (!collectionE.isEmpty()) {
            Iterator it = collectionE.iterator();
            while (it.hasNext()) {
                if (V1.a.j((C0837M) it.next(), 3).equals(strJ)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final C3.k f(InterfaceC0761e interfaceC0761e) {
        if (interfaceC0761e == null) {
            AbstractC0695h.a(108);
            throw null;
        }
        N3.f fVar = AbstractC0695h.f8064e;
        if (AbstractC0695h.b(interfaceC0761e, m3.m.f8115a) || !AbstractC0695h.G(interfaceC0761e)) {
            return null;
        }
        N3.e eVarH = U3.f.h(interfaceC0761e);
        if (!eVarH.d()) {
            return null;
        }
        String str = C0721d.f8248a;
        N3.b bVarF = C0721d.f(eVarH);
        if (bVarF == null) {
            return null;
        }
        InterfaceC0761e interfaceC0761eJ = AbstractC0779w.j(g().f8269a, bVarF.b());
        if (interfaceC0761eJ instanceof C3.k) {
            return (C3.k) interfaceC0761eJ;
        }
        return null;
    }

    public final C0725h g() {
        return (C0725h) V1.a.Q(this.f8281b, f8279g[0]);
    }
}
