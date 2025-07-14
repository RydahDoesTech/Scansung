package I3;

import O3.AbstractC0070b;
import O3.AbstractC0079k;
import O3.AbstractC0084p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: I3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0024f extends AbstractC0079k implements O3.x {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1233e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1234g;

    /* renamed from: h, reason: collision with root package name */
    public int f1235h;

    public /* synthetic */ C0024f(int i5) {
        this.f1233e = i5;
    }

    public static C0024f i() {
        C0024f c0024f = new C0024f(1);
        c0024f.f1234g = Collections.emptyList();
        c0024f.f1235h = -1;
        return c0024f;
    }

    @Override // O3.AbstractC0079k
    public final AbstractC0070b c() {
        switch (this.f1233e) {
            case 0:
                C0025g c0025gG = g();
                if (c0025gG.b()) {
                    return c0025gG;
                }
                throw new O2.d();
            case 1:
                X xH = h();
                if (xH.b()) {
                    return xH;
                }
                throw new O2.d();
            default:
                C0023e c0023eF = f();
                if (c0023eF.b()) {
                    return c0023eF;
                }
                throw new O2.d();
        }
    }

    public final Object clone() {
        switch (this.f1233e) {
            case 0:
                C0024f c0024f = new C0024f(0);
                c0024f.f1234g = Collections.emptyList();
                c0024f.k(g());
                return c0024f;
            case 1:
                C0024f c0024fI = i();
                c0024fI.l(h());
                return c0024fI;
            default:
                C0024f c0024f2 = new C0024f(2);
                c0024f2.f1234g = C0022d.f1196s;
                c0024f2.j(f());
                return c0024f2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005c  */
    @Override // O3.AbstractC0079k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final O3.AbstractC0079k d(O3.C0074f r3, O3.C0077i r4) throws java.lang.Throwable {
        /*
            r2 = this;
            int r0 = r2.f1233e
            switch(r0) {
                case 0: goto L43;
                case 1: goto L24;
                default: goto L5;
            }
        L5:
            r0 = 0
            I3.a r1 = I3.C0023e.f1222k     // Catch: java.lang.Throwable -> L14 O3.C0086s -> L16
            r1.getClass()     // Catch: java.lang.Throwable -> L14 O3.C0086s -> L16
            I3.e r1 = new I3.e     // Catch: java.lang.Throwable -> L14 O3.C0086s -> L16
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L14 O3.C0086s -> L16
            r2.j(r1)
            return r2
        L14:
            r3 = move-exception
            goto L1e
        L16:
            r3 = move-exception
            O3.b r4 = r3.f2092d     // Catch: java.lang.Throwable -> L14
            I3.e r4 = (I3.C0023e) r4     // Catch: java.lang.Throwable -> L14
            throw r3     // Catch: java.lang.Throwable -> L1c
        L1c:
            r3 = move-exception
            r0 = r4
        L1e:
            if (r0 == 0) goto L23
            r2.j(r0)
        L23:
            throw r3
        L24:
            r0 = 0
            I3.a r1 = I3.X.f1135k     // Catch: java.lang.Throwable -> L33 O3.C0086s -> L35
            r1.getClass()     // Catch: java.lang.Throwable -> L33 O3.C0086s -> L35
            I3.X r1 = new I3.X     // Catch: java.lang.Throwable -> L33 O3.C0086s -> L35
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L33 O3.C0086s -> L35
            r2.l(r1)
            return r2
        L33:
            r3 = move-exception
            goto L3d
        L35:
            r3 = move-exception
            O3.b r4 = r3.f2092d     // Catch: java.lang.Throwable -> L33
            I3.X r4 = (I3.X) r4     // Catch: java.lang.Throwable -> L33
            throw r3     // Catch: java.lang.Throwable -> L3b
        L3b:
            r3 = move-exception
            r0 = r4
        L3d:
            if (r0 == 0) goto L42
            r2.l(r0)
        L42:
            throw r3
        L43:
            r0 = 0
            I3.a r1 = I3.C0025g.f1239k     // Catch: java.lang.Throwable -> L50 O3.C0086s -> L52
            java.lang.Object r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> L50 O3.C0086s -> L52
            I3.g r3 = (I3.C0025g) r3     // Catch: java.lang.Throwable -> L50 O3.C0086s -> L52
            r2.k(r3)
            return r2
        L50:
            r3 = move-exception
            goto L5a
        L52:
            r3 = move-exception
            O3.b r4 = r3.f2092d     // Catch: java.lang.Throwable -> L50
            I3.g r4 = (I3.C0025g) r4     // Catch: java.lang.Throwable -> L50
            throw r3     // Catch: java.lang.Throwable -> L58
        L58:
            r3 = move-exception
            r0 = r4
        L5a:
            if (r0 == 0) goto L5f
            r2.k(r0)
        L5f:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.C0024f.d(O3.f, O3.i):O3.k");
    }

    @Override // O3.AbstractC0079k
    public final /* bridge */ /* synthetic */ AbstractC0079k e(AbstractC0084p abstractC0084p) {
        switch (this.f1233e) {
            case 0:
                k((C0025g) abstractC0084p);
                break;
            case 1:
                l((X) abstractC0084p);
                break;
            default:
                j((C0023e) abstractC0084p);
                break;
        }
        return this;
    }

    public C0023e f() {
        C0023e c0023e = new C0023e(this);
        int i5 = this.f;
        int i6 = (i5 & 1) != 1 ? 0 : 1;
        c0023e.f = this.f1235h;
        if ((i5 & 2) == 2) {
            i6 |= 2;
        }
        c0023e.f1225g = (C0022d) this.f1234g;
        c0023e.f1224e = i6;
        return c0023e;
    }

    public C0025g g() {
        C0025g c0025g = new C0025g(this);
        int i5 = this.f;
        int i6 = (i5 & 1) != 1 ? 0 : 1;
        c0025g.f = this.f1235h;
        if ((i5 & 2) == 2) {
            this.f1234g = Collections.unmodifiableList((List) this.f1234g);
            this.f &= -3;
        }
        c0025g.f1242g = (List) this.f1234g;
        c0025g.f1241e = i6;
        return c0025g;
    }

    public X h() {
        X x4 = new X(this);
        int i5 = this.f;
        if ((i5 & 1) == 1) {
            this.f1234g = Collections.unmodifiableList((List) this.f1234g);
            this.f &= -2;
        }
        x4.f = (List) this.f1234g;
        int i6 = (i5 & 2) != 2 ? 0 : 1;
        x4.f1138g = this.f1235h;
        x4.f1137e = i6;
        return x4;
    }

    public void j(C0023e c0023e) {
        C0022d c0022d;
        if (c0023e == C0023e.f1221j) {
            return;
        }
        int i5 = c0023e.f1224e;
        if ((i5 & 1) == 1) {
            int i6 = c0023e.f;
            this.f = 1 | this.f;
            this.f1235h = i6;
        }
        if ((i5 & 2) == 2) {
            C0022d c0022d2 = c0023e.f1225g;
            if ((this.f & 2) != 2 || (c0022d = (C0022d) this.f1234g) == C0022d.f1196s) {
                this.f1234g = c0022d2;
            } else {
                C0020b c0020bG = C0020b.g();
                c0020bG.h(c0022d);
                c0020bG.h(c0022d2);
                this.f1234g = c0020bG.f();
            }
            this.f |= 2;
        }
        this.f2081d = this.f2081d.m(c0023e.f1223d);
    }

    public void k(C0025g c0025g) {
        if (c0025g == C0025g.f1238j) {
            return;
        }
        if ((c0025g.f1241e & 1) == 1) {
            int i5 = c0025g.f;
            this.f = 1 | this.f;
            this.f1235h = i5;
        }
        if (!c0025g.f1242g.isEmpty()) {
            if (((List) this.f1234g).isEmpty()) {
                this.f1234g = c0025g.f1242g;
                this.f &= -3;
            } else {
                if ((this.f & 2) != 2) {
                    this.f1234g = new ArrayList((List) this.f1234g);
                    this.f |= 2;
                }
                ((List) this.f1234g).addAll(c0025g.f1242g);
            }
        }
        this.f2081d = this.f2081d.m(c0025g.f1240d);
    }

    public void l(X x4) {
        if (x4 == X.f1134j) {
            return;
        }
        if (!x4.f.isEmpty()) {
            if (((List) this.f1234g).isEmpty()) {
                this.f1234g = x4.f;
                this.f &= -2;
            } else {
                if ((this.f & 1) != 1) {
                    this.f1234g = new ArrayList((List) this.f1234g);
                    this.f |= 1;
                }
                ((List) this.f1234g).addAll(x4.f);
            }
        }
        if ((x4.f1137e & 1) == 1) {
            int i5 = x4.f1138g;
            this.f |= 2;
            this.f1235h = i5;
        }
        this.f2081d = this.f2081d.m(x4.f1136d);
    }
}
