package s3;

import b3.AbstractC0219i;
import com.google.firebase.messaging.C0388e;
import e4.AbstractC0420c;
import e4.AbstractC0438v;
import e4.AbstractC0442z;
import e4.C0421d;
import e4.C0425h;
import e4.C0427j;
import e4.V;
import e4.X;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p3.AbstractC0756S;
import p3.C0770n;
import p3.C0777u;
import p3.C0782z;
import p3.InterfaceC0752N;
import p3.InterfaceC0755Q;
import p3.InterfaceC0761e;
import p3.InterfaceC0766j;
import p3.InterfaceC0767k;
import p3.InterfaceC0768l;
import q3.InterfaceC0798h;

/* loaded from: classes.dex */
public final class z extends AbstractC0825A {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0825A f8904d;

    /* renamed from: e, reason: collision with root package name */
    public final V f8905e;
    public V f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f8906g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f8907h;

    /* renamed from: i, reason: collision with root package name */
    public C0427j f8908i;

    public z(AbstractC0825A abstractC0825A, V v2) {
        this.f8904d = abstractC0825A;
        this.f8905e = v2;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void G(int r15) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.z.G(int):void");
    }

    @Override // p3.InterfaceC0764h
    public final boolean A() {
        return this.f8904d.A();
    }

    @Override // p3.InterfaceC0761e
    public final boolean D0() {
        return this.f8904d.D0();
    }

    @Override // p3.InterfaceC0780x
    public final boolean E() {
        return this.f8904d.E();
    }

    @Override // p3.InterfaceC0761e
    public final X3.n E0(e4.S s2) {
        U3.f.i(Q3.f.d(this));
        return m(s2, f4.f.f6740a);
    }

    @Override // p3.InterfaceC0761e
    public final C0867w G0() {
        throw new UnsupportedOperationException();
    }

    @Override // p3.InterfaceC0763g
    public final e4.J I() {
        e4.J jI = this.f8904d.I();
        if (this.f8905e.f6668a.e()) {
            if (jI != null) {
                return jI;
            }
            G(0);
            throw null;
        }
        if (this.f8908i == null) {
            V vN0 = n0();
            Collection collectionJ = jI.j();
            ArrayList arrayList = new ArrayList(collectionJ.size());
            Iterator it = collectionJ.iterator();
            while (it.hasNext()) {
                arrayList.add(vN0.i(1, (AbstractC0438v) it.next()));
            }
            this.f8908i = new C0427j(this, this.f8906g, arrayList, d4.l.f6418e);
        }
        C0427j c0427j = this.f8908i;
        if (c0427j != null) {
            return c0427j;
        }
        G(1);
        throw null;
    }

    @Override // p3.InterfaceC0761e
    public final int L() {
        int iL = this.f8904d.L();
        if (iL != 0) {
            return iL;
        }
        G(25);
        throw null;
    }

    @Override // p3.InterfaceC0761e
    public final boolean N() {
        return this.f8904d.N();
    }

    @Override // p3.InterfaceC0761e
    public final X3.n R() {
        X3.n nVarR = this.f8904d.R();
        if (nVarR != null) {
            return nVarR;
        }
        G(28);
        throw null;
    }

    @Override // p3.InterfaceC0761e
    public final AbstractC0756S S() {
        AbstractC0756S abstractC0756SS = this.f8904d.S();
        if (abstractC0756SS == null) {
            return null;
        }
        boolean z4 = abstractC0756SS instanceof C0777u;
        V v2 = this.f8905e;
        if (z4) {
            C0777u c0777u = (C0777u) abstractC0756SS;
            AbstractC0442z abstractC0442z = (AbstractC0442z) c0777u.f8440b;
            if (abstractC0442z != null && !v2.f6668a.e()) {
                abstractC0442z = (AbstractC0442z) n0().i(1, abstractC0442z);
            }
            return new C0777u(c0777u.f8439a, abstractC0442z);
        }
        if (!(abstractC0756SS instanceof C0782z)) {
            throw new O2.d();
        }
        ArrayList arrayList = ((C0782z) abstractC0756SS).f8442a;
        ArrayList arrayList2 = new ArrayList(P2.o.l0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            O2.f fVar = (O2.f) it.next();
            N3.f fVar2 = (N3.f) fVar.f2006d;
            AbstractC0442z abstractC0442z2 = (AbstractC0442z) ((h4.d) fVar.f2007e);
            if (abstractC0442z2 != null && !v2.f6668a.e()) {
                abstractC0442z2 = (AbstractC0442z) n0().i(1, abstractC0442z2);
            }
            arrayList2.add(new O2.f(fVar2, abstractC0442z2));
        }
        return new C0782z(arrayList2);
    }

    @Override // p3.InterfaceC0766j
    public final Object U(InterfaceC0768l interfaceC0768l, Object obj) {
        return interfaceC0768l.J(this, obj);
    }

    @Override // p3.InterfaceC0761e
    public final C0855k V() {
        return this.f8904d.V();
    }

    @Override // p3.InterfaceC0761e
    public final X3.n W() {
        X3.n nVarW = this.f8904d.W();
        if (nVarW != null) {
            return nVarW;
        }
        G(15);
        throw null;
    }

    @Override // s3.AbstractC0825A, p3.InterfaceC0766j, p3.InterfaceC0763g
    public final InterfaceC0761e a() {
        InterfaceC0761e interfaceC0761eA = this.f8904d.a();
        if (interfaceC0761eA != null) {
            return interfaceC0761eA;
        }
        G(21);
        throw null;
    }

    @Override // p3.InterfaceC0761e, p3.InterfaceC0769m, p3.InterfaceC0780x
    public final C0770n b() {
        C0770n c0770nB = this.f8904d.b();
        if (c0770nB != null) {
            return c0770nB;
        }
        G(27);
        throw null;
    }

    @Override // p3.InterfaceC0754P
    public final InterfaceC0767k c(V v2) {
        if (v2 != null) {
            return v2.f6668a.e() ? this : new z(this, V.e(v2.f(), n0().f()));
        }
        G(23);
        throw null;
    }

    @Override // p3.InterfaceC0761e
    public final X3.n d0() {
        U3.f.i(Q3.f.d(this.f8904d));
        return x(f4.f.f6740a);
    }

    @Override // p3.InterfaceC0761e
    public final boolean f0() {
        return this.f8904d.f0();
    }

    @Override // p3.InterfaceC0766j
    public final N3.f getName() {
        N3.f name = this.f8904d.getName();
        if (name != null) {
            return name;
        }
        G(20);
        throw null;
    }

    @Override // p3.InterfaceC0780x
    public final boolean h0() {
        return this.f8904d.h0();
    }

    @Override // p3.InterfaceC0761e, p3.InterfaceC0780x
    public final int i() {
        int i5 = this.f8904d.i();
        if (i5 != 0) {
            return i5;
        }
        G(26);
        throw null;
    }

    @Override // p3.InterfaceC0761e
    public final boolean j() {
        return this.f8904d.j();
    }

    @Override // p3.InterfaceC0761e
    public final Collection k() {
        Collection<C0855k> collectionK = this.f8904d.k();
        ArrayList arrayList = new ArrayList(collectionK.size());
        for (C0855k c0855k : collectionK) {
            C0855k c0855k2 = c0855k;
            c0855k2.getClass();
            C0865u c0865uU0 = c0855k2.U0(V.f6667b);
            c0865uU0.f8854h = c0855k.N0();
            c0865uU0.x(c0855k2.i());
            c0865uU0.n(c0855k2.b());
            c0865uU0.a(c0855k2.i0());
            c0865uU0.f8861p = false;
            arrayList.add(((C0855k) c0865uU0.f8850A.R0(c0865uU0)).c(n0()));
        }
        return arrayList;
    }

    @Override // p3.InterfaceC0766j
    public final InterfaceC0766j l() {
        InterfaceC0766j interfaceC0766jL = this.f8904d.l();
        if (interfaceC0766jL != null) {
            return interfaceC0766jL;
        }
        G(22);
        throw null;
    }

    @Override // s3.AbstractC0825A
    public final X3.n m(e4.S s2, f4.f fVar) {
        X3.n nVarM = this.f8904d.m(s2, fVar);
        if (!this.f8905e.f6668a.e()) {
            return new X3.s(nVarM, n0());
        }
        if (nVarM != null) {
            return nVarM;
        }
        G(7);
        throw null;
    }

    @Override // p3.InterfaceC0767k
    public final InterfaceC0752N n() {
        return InterfaceC0752N.f8400b;
    }

    public final V n0() {
        if (this.f == null) {
            V v2 = this.f8905e;
            if (v2.f6668a.e()) {
                this.f = v2;
            } else {
                List listK = this.f8904d.I().k();
                this.f8906g = new ArrayList(listK.size());
                this.f = AbstractC0420c.u(listK, v2.f(), this, this.f8906g);
                ArrayList arrayList = this.f8906g;
                AbstractC0219i.e("<this>", arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (!((InterfaceC0755Q) obj).k0()) {
                        arrayList2.add(obj);
                    }
                }
                this.f8907h = arrayList2;
            }
        }
        return this.f;
    }

    @Override // p3.InterfaceC0761e, p3.InterfaceC0763g
    public final AbstractC0442z q() {
        e4.G gL;
        List listD = X.d(I().k());
        InterfaceC0798h interfaceC0798hS = s();
        if (interfaceC0798hS.isEmpty()) {
            e4.G.f6646e.getClass();
            gL = e4.G.f;
        } else {
            C0388e c0388e = e4.G.f6646e;
            List listN = g3.y.N(new C0425h(interfaceC0798hS));
            c0388e.getClass();
            gL = C0388e.l(listN);
        }
        return C0421d.s(d0(), gL, I(), listD, false);
    }

    @Override // p3.InterfaceC0761e, p3.InterfaceC0764h
    public final List r() {
        n0();
        ArrayList arrayList = this.f8907h;
        if (arrayList != null) {
            return arrayList;
        }
        G(30);
        throw null;
    }

    @Override // p3.InterfaceC0761e
    public final List r0() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        G(17);
        throw null;
    }

    @Override // q3.InterfaceC0791a
    public final InterfaceC0798h s() {
        InterfaceC0798h interfaceC0798hS = this.f8904d.s();
        if (interfaceC0798hS != null) {
            return interfaceC0798hS;
        }
        G(19);
        throw null;
    }

    @Override // p3.InterfaceC0761e
    public final boolean v() {
        return this.f8904d.v();
    }

    @Override // s3.AbstractC0825A
    public final X3.n x(f4.f fVar) {
        X3.n nVarX = this.f8904d.x(fVar);
        if (!this.f8905e.f6668a.e()) {
            return new X3.s(nVarX, n0());
        }
        if (nVarX != null) {
            return nVarX;
        }
        G(14);
        throw null;
    }

    @Override // p3.InterfaceC0780x
    public final boolean z() {
        return this.f8904d.z();
    }

    @Override // p3.InterfaceC0761e
    public final Collection z0() {
        Collection collectionZ0 = this.f8904d.z0();
        if (collectionZ0 != null) {
            return collectionZ0;
        }
        G(31);
        throw null;
    }
}
