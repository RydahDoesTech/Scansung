package I3;

import O3.AbstractC0070b;
import O3.AbstractC0079k;
import O3.AbstractC0084p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: I3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0031m extends AbstractC0079k implements O3.x {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1319e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public List f1320g;

    public /* synthetic */ C0031m(int i5) {
        this.f1319e = i5;
    }

    @Override // O3.AbstractC0079k
    public final AbstractC0070b c() {
        switch (this.f1319e) {
            case 0:
                C0032n c0032nF = f();
                if (c0032nF.b()) {
                    return c0032nF;
                }
                throw new O2.d();
            case 1:
                K kG = g();
                if (kG.b()) {
                    return kG;
                }
                throw new O2.d();
            case 2:
                e0 e0VarI = i();
                if (e0VarI.b()) {
                    return e0VarI;
                }
                throw new O2.d();
            default:
                L lH = h();
                if (lH.b()) {
                    return lH;
                }
                throw new O2.d();
        }
    }

    public final Object clone() {
        switch (this.f1319e) {
            case 0:
                C0031m c0031m = new C0031m(0);
                c0031m.f1320g = Collections.emptyList();
                c0031m.j(f());
                return c0031m;
            case 1:
                C0031m c0031m2 = new C0031m(1);
                c0031m2.f1320g = Collections.emptyList();
                c0031m2.k(g());
                return c0031m2;
            case 2:
                C0031m c0031m3 = new C0031m(2);
                c0031m3.f1320g = Collections.emptyList();
                c0031m3.m(i());
                return c0031m3;
            default:
                C0031m c0031m4 = new C0031m(3);
                c0031m4.f1320g = O3.t.f2093e;
                c0031m4.l(h());
                return c0031m4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x007d  */
    @Override // O3.AbstractC0079k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final O3.AbstractC0079k d(O3.C0074f r3, O3.C0077i r4) throws java.lang.Throwable {
        /*
            r2 = this;
            int r0 = r2.f1319e
            switch(r0) {
                case 0: goto L62;
                case 1: goto L43;
                case 2: goto L24;
                default: goto L5;
            }
        L5:
            r4 = 0
            I3.a r0 = I3.L.f1038i     // Catch: java.lang.Throwable -> L14 O3.C0086s -> L16
            r0.getClass()     // Catch: java.lang.Throwable -> L14 O3.C0086s -> L16
            I3.L r0 = new I3.L     // Catch: java.lang.Throwable -> L14 O3.C0086s -> L16
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L14 O3.C0086s -> L16
            r2.l(r0)
            return r2
        L14:
            r3 = move-exception
            goto L1e
        L16:
            r3 = move-exception
            O3.b r0 = r3.f2092d     // Catch: java.lang.Throwable -> L14
            I3.L r0 = (I3.L) r0     // Catch: java.lang.Throwable -> L14
            throw r3     // Catch: java.lang.Throwable -> L1c
        L1c:
            r3 = move-exception
            r4 = r0
        L1e:
            if (r4 == 0) goto L23
            r2.l(r4)
        L23:
            throw r3
        L24:
            r0 = 0
            I3.a r1 = I3.e0.f1229i     // Catch: java.lang.Throwable -> L33 O3.C0086s -> L35
            r1.getClass()     // Catch: java.lang.Throwable -> L33 O3.C0086s -> L35
            I3.e0 r1 = new I3.e0     // Catch: java.lang.Throwable -> L33 O3.C0086s -> L35
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L33 O3.C0086s -> L35
            r2.m(r1)
            return r2
        L33:
            r3 = move-exception
            goto L3d
        L35:
            r3 = move-exception
            O3.b r4 = r3.f2092d     // Catch: java.lang.Throwable -> L33
            I3.e0 r4 = (I3.e0) r4     // Catch: java.lang.Throwable -> L33
            throw r3     // Catch: java.lang.Throwable -> L3b
        L3b:
            r3 = move-exception
            r0 = r4
        L3d:
            if (r0 == 0) goto L42
            r2.m(r0)
        L42:
            throw r3
        L43:
            r0 = 0
            I3.a r1 = I3.K.f1033i     // Catch: java.lang.Throwable -> L52 O3.C0086s -> L54
            r1.getClass()     // Catch: java.lang.Throwable -> L52 O3.C0086s -> L54
            I3.K r1 = new I3.K     // Catch: java.lang.Throwable -> L52 O3.C0086s -> L54
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L52 O3.C0086s -> L54
            r2.k(r1)
            return r2
        L52:
            r3 = move-exception
            goto L5c
        L54:
            r3 = move-exception
            O3.b r4 = r3.f2092d     // Catch: java.lang.Throwable -> L52
            I3.K r4 = (I3.K) r4     // Catch: java.lang.Throwable -> L52
            throw r3     // Catch: java.lang.Throwable -> L5a
        L5a:
            r3 = move-exception
            r0 = r4
        L5c:
            if (r0 == 0) goto L61
            r2.k(r0)
        L61:
            throw r3
        L62:
            r0 = 0
            I3.a r1 = I3.C0032n.f1322i     // Catch: java.lang.Throwable -> L71 O3.C0086s -> L73
            r1.getClass()     // Catch: java.lang.Throwable -> L71 O3.C0086s -> L73
            I3.n r1 = new I3.n     // Catch: java.lang.Throwable -> L71 O3.C0086s -> L73
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L71 O3.C0086s -> L73
            r2.j(r1)
            return r2
        L71:
            r3 = move-exception
            goto L7b
        L73:
            r3 = move-exception
            O3.b r4 = r3.f2092d     // Catch: java.lang.Throwable -> L71
            I3.n r4 = (I3.C0032n) r4     // Catch: java.lang.Throwable -> L71
            throw r3     // Catch: java.lang.Throwable -> L79
        L79:
            r3 = move-exception
            r0 = r4
        L7b:
            if (r0 == 0) goto L80
            r2.j(r0)
        L80:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.C0031m.d(O3.f, O3.i):O3.k");
    }

    @Override // O3.AbstractC0079k
    public final /* bridge */ /* synthetic */ AbstractC0079k e(AbstractC0084p abstractC0084p) {
        switch (this.f1319e) {
            case 0:
                j((C0032n) abstractC0084p);
                break;
            case 1:
                k((K) abstractC0084p);
                break;
            case 2:
                m((e0) abstractC0084p);
                break;
            default:
                l((L) abstractC0084p);
                break;
        }
        return this;
    }

    public C0032n f() {
        C0032n c0032n = new C0032n(this);
        if ((this.f & 1) == 1) {
            this.f1320g = Collections.unmodifiableList(this.f1320g);
            this.f &= -2;
        }
        c0032n.f1324e = this.f1320g;
        return c0032n;
    }

    public K g() {
        K k5 = new K(this);
        if ((this.f & 1) == 1) {
            this.f1320g = Collections.unmodifiableList(this.f1320g);
            this.f &= -2;
        }
        k5.f1035e = this.f1320g;
        return k5;
    }

    public L h() {
        L l4 = new L(this);
        if ((this.f & 1) == 1) {
            this.f1320g = ((O3.u) this.f1320g).b();
            this.f &= -2;
        }
        l4.f1040e = (O3.u) this.f1320g;
        return l4;
    }

    public e0 i() {
        e0 e0Var = new e0(this);
        if ((this.f & 1) == 1) {
            this.f1320g = Collections.unmodifiableList(this.f1320g);
            this.f &= -2;
        }
        e0Var.f1231e = this.f1320g;
        return e0Var;
    }

    public void j(C0032n c0032n) {
        if (c0032n == C0032n.f1321h) {
            return;
        }
        if (!c0032n.f1324e.isEmpty()) {
            if (this.f1320g.isEmpty()) {
                this.f1320g = c0032n.f1324e;
                this.f &= -2;
            } else {
                if ((this.f & 1) != 1) {
                    this.f1320g = new ArrayList(this.f1320g);
                    this.f |= 1;
                }
                this.f1320g.addAll(c0032n.f1324e);
            }
        }
        this.f2081d = this.f2081d.m(c0032n.f1323d);
    }

    public void k(K k5) {
        if (k5 == K.f1032h) {
            return;
        }
        if (!k5.f1035e.isEmpty()) {
            if (this.f1320g.isEmpty()) {
                this.f1320g = k5.f1035e;
                this.f &= -2;
            } else {
                if ((this.f & 1) != 1) {
                    this.f1320g = new ArrayList(this.f1320g);
                    this.f |= 1;
                }
                this.f1320g.addAll(k5.f1035e);
            }
        }
        this.f2081d = this.f2081d.m(k5.f1034d);
    }

    public void l(L l4) {
        if (l4 == L.f1037h) {
            return;
        }
        if (!l4.f1040e.isEmpty()) {
            if (((O3.u) this.f1320g).isEmpty()) {
                this.f1320g = l4.f1040e;
                this.f &= -2;
            } else {
                if ((this.f & 1) != 1) {
                    this.f1320g = new O3.t((O3.u) this.f1320g);
                    this.f |= 1;
                }
                ((O3.u) this.f1320g).addAll(l4.f1040e);
            }
        }
        this.f2081d = this.f2081d.m(l4.f1039d);
    }

    public void m(e0 e0Var) {
        if (e0Var == e0.f1228h) {
            return;
        }
        if (!e0Var.f1231e.isEmpty()) {
            if (this.f1320g.isEmpty()) {
                this.f1320g = e0Var.f1231e;
                this.f &= -2;
            } else {
                if ((this.f & 1) != 1) {
                    this.f1320g = new ArrayList(this.f1320g);
                    this.f |= 1;
                }
                this.f1320g.addAll(e0Var.f1231e);
            }
        }
        this.f2081d = this.f2081d.m(e0Var.f1230d);
    }
}
