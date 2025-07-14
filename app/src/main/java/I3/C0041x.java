package I3;

import O3.AbstractC0070b;
import O3.AbstractC0079k;
import O3.AbstractC0080l;
import O3.AbstractC0084p;
import com.samsung.android.knox.container.KnoxContainerManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: I3.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0041x extends AbstractC0080l {

    /* renamed from: g, reason: collision with root package name */
    public int f1377g;

    /* renamed from: h, reason: collision with root package name */
    public int f1378h;

    /* renamed from: i, reason: collision with root package name */
    public int f1379i;

    /* renamed from: j, reason: collision with root package name */
    public int f1380j;

    /* renamed from: k, reason: collision with root package name */
    public Q f1381k;

    /* renamed from: l, reason: collision with root package name */
    public int f1382l;

    /* renamed from: m, reason: collision with root package name */
    public List f1383m;
    public Q n;

    /* renamed from: o, reason: collision with root package name */
    public int f1384o;

    /* renamed from: p, reason: collision with root package name */
    public List f1385p;

    /* renamed from: q, reason: collision with root package name */
    public List f1386q;

    /* renamed from: r, reason: collision with root package name */
    public List f1387r;

    /* renamed from: s, reason: collision with root package name */
    public X f1388s;

    /* renamed from: t, reason: collision with root package name */
    public List f1389t;

    /* renamed from: u, reason: collision with root package name */
    public C0032n f1390u;

    public static C0041x h() {
        C0041x c0041x = new C0041x();
        c0041x.f1378h = 6;
        c0041x.f1379i = 6;
        Q q5 = Q.f1072w;
        c0041x.f1381k = q5;
        c0041x.f1383m = Collections.emptyList();
        c0041x.n = q5;
        c0041x.f1385p = Collections.emptyList();
        c0041x.f1386q = Collections.emptyList();
        c0041x.f1387r = Collections.emptyList();
        c0041x.f1388s = X.f1134j;
        c0041x.f1389t = Collections.emptyList();
        c0041x.f1390u = C0032n.f1321h;
        return c0041x;
    }

    @Override // O3.AbstractC0079k
    public final AbstractC0070b c() {
        C0042y c0042yG = g();
        if (c0042yG.b()) {
            return c0042yG;
        }
        throw new O2.d();
    }

    public final Object clone() {
        C0041x c0041xH = h();
        c0041xH.i(g());
        return c0041xH;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    @Override // O3.AbstractC0079k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final O3.AbstractC0079k d(O3.C0074f r3, O3.C0077i r4) throws java.lang.Throwable {
        /*
            r2 = this;
            r0 = 0
            I3.a r1 = I3.C0042y.f1392y     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            I3.y r1 = new I3.y     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            O3.b r4 = r3.f2092d     // Catch: java.lang.Throwable -> Lf
            I3.y r4 = (I3.C0042y) r4     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> L17
        L17:
            r3 = move-exception
            r0 = r4
        L19:
            if (r0 == 0) goto L1e
            r2.i(r0)
        L1e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.C0041x.d(O3.f, O3.i):O3.k");
    }

    @Override // O3.AbstractC0079k
    public final /* bridge */ /* synthetic */ AbstractC0079k e(AbstractC0084p abstractC0084p) {
        i((C0042y) abstractC0084p);
        return this;
    }

    public final C0042y g() {
        C0042y c0042y = new C0042y(this);
        int i5 = this.f1377g;
        int i6 = (i5 & 1) != 1 ? 0 : 1;
        c0042y.f1394g = this.f1378h;
        if ((i5 & 2) == 2) {
            i6 |= 2;
        }
        c0042y.f1395h = this.f1379i;
        if ((i5 & 4) == 4) {
            i6 |= 4;
        }
        c0042y.f1396i = this.f1380j;
        if ((i5 & 8) == 8) {
            i6 |= 8;
        }
        c0042y.f1397j = this.f1381k;
        if ((i5 & 16) == 16) {
            i6 |= 16;
        }
        c0042y.f1398k = this.f1382l;
        if ((i5 & 32) == 32) {
            this.f1383m = Collections.unmodifiableList(this.f1383m);
            this.f1377g &= -33;
        }
        c0042y.f1399l = this.f1383m;
        if ((i5 & 64) == 64) {
            i6 |= 32;
        }
        c0042y.f1400m = this.n;
        if ((i5 & 128) == 128) {
            i6 |= 64;
        }
        c0042y.n = this.f1384o;
        if ((this.f1377g & 256) == 256) {
            this.f1385p = Collections.unmodifiableList(this.f1385p);
            this.f1377g &= -257;
        }
        c0042y.f1401o = this.f1385p;
        if ((this.f1377g & 512) == 512) {
            this.f1386q = Collections.unmodifiableList(this.f1386q);
            this.f1377g &= -513;
        }
        c0042y.f1402p = this.f1386q;
        if ((this.f1377g & 1024) == 1024) {
            this.f1387r = Collections.unmodifiableList(this.f1387r);
            this.f1377g &= KnoxContainerManager.ERROR_INVALID_PASSWORD_RESET_TOKEN;
        }
        c0042y.f1404r = this.f1387r;
        if ((i5 & 2048) == 2048) {
            i6 |= 128;
        }
        c0042y.f1405s = this.f1388s;
        if ((this.f1377g & 4096) == 4096) {
            this.f1389t = Collections.unmodifiableList(this.f1389t);
            this.f1377g &= -4097;
        }
        c0042y.f1406t = this.f1389t;
        if ((i5 & 8192) == 8192) {
            i6 |= 256;
        }
        c0042y.f1407u = this.f1390u;
        c0042y.f = i6;
        return c0042y;
    }

    public final void i(C0042y c0042y) {
        C0032n c0032n;
        X x4;
        Q q5;
        Q q6;
        if (c0042y == C0042y.f1391x) {
            return;
        }
        int i5 = c0042y.f;
        if ((i5 & 1) == 1) {
            int i6 = c0042y.f1394g;
            this.f1377g = 1 | this.f1377g;
            this.f1378h = i6;
        }
        if ((i5 & 2) == 2) {
            int i7 = c0042y.f1395h;
            this.f1377g = 2 | this.f1377g;
            this.f1379i = i7;
        }
        if ((i5 & 4) == 4) {
            int i8 = c0042y.f1396i;
            this.f1377g = 4 | this.f1377g;
            this.f1380j = i8;
        }
        if ((i5 & 8) == 8) {
            Q q7 = c0042y.f1397j;
            if ((this.f1377g & 8) != 8 || (q6 = this.f1381k) == Q.f1072w) {
                this.f1381k = q7;
            } else {
                P pR = Q.r(q6);
                pR.i(q7);
                this.f1381k = pR.g();
            }
            this.f1377g |= 8;
        }
        if ((c0042y.f & 16) == 16) {
            int i9 = c0042y.f1398k;
            this.f1377g = 16 | this.f1377g;
            this.f1382l = i9;
        }
        if (!c0042y.f1399l.isEmpty()) {
            if (this.f1383m.isEmpty()) {
                this.f1383m = c0042y.f1399l;
                this.f1377g &= -33;
            } else {
                if ((this.f1377g & 32) != 32) {
                    this.f1383m = new ArrayList(this.f1383m);
                    this.f1377g |= 32;
                }
                this.f1383m.addAll(c0042y.f1399l);
            }
        }
        if (c0042y.p()) {
            Q q8 = c0042y.f1400m;
            if ((this.f1377g & 64) != 64 || (q5 = this.n) == Q.f1072w) {
                this.n = q8;
            } else {
                P pR2 = Q.r(q5);
                pR2.i(q8);
                this.n = pR2.g();
            }
            this.f1377g |= 64;
        }
        if ((c0042y.f & 64) == 64) {
            int i10 = c0042y.n;
            this.f1377g |= 128;
            this.f1384o = i10;
        }
        if (!c0042y.f1401o.isEmpty()) {
            if (this.f1385p.isEmpty()) {
                this.f1385p = c0042y.f1401o;
                this.f1377g &= -257;
            } else {
                if ((this.f1377g & 256) != 256) {
                    this.f1385p = new ArrayList(this.f1385p);
                    this.f1377g |= 256;
                }
                this.f1385p.addAll(c0042y.f1401o);
            }
        }
        if (!c0042y.f1402p.isEmpty()) {
            if (this.f1386q.isEmpty()) {
                this.f1386q = c0042y.f1402p;
                this.f1377g &= -513;
            } else {
                if ((this.f1377g & 512) != 512) {
                    this.f1386q = new ArrayList(this.f1386q);
                    this.f1377g |= 512;
                }
                this.f1386q.addAll(c0042y.f1402p);
            }
        }
        if (!c0042y.f1404r.isEmpty()) {
            if (this.f1387r.isEmpty()) {
                this.f1387r = c0042y.f1404r;
                this.f1377g &= KnoxContainerManager.ERROR_INVALID_PASSWORD_RESET_TOKEN;
            } else {
                if ((this.f1377g & 1024) != 1024) {
                    this.f1387r = new ArrayList(this.f1387r);
                    this.f1377g |= 1024;
                }
                this.f1387r.addAll(c0042y.f1404r);
            }
        }
        if ((c0042y.f & 128) == 128) {
            X x5 = c0042y.f1405s;
            if ((this.f1377g & 2048) != 2048 || (x4 = this.f1388s) == X.f1134j) {
                this.f1388s = x5;
            } else {
                C0024f c0024fI = X.i(x4);
                c0024fI.l(x5);
                this.f1388s = c0024fI.h();
            }
            this.f1377g |= 2048;
        }
        if (!c0042y.f1406t.isEmpty()) {
            if (this.f1389t.isEmpty()) {
                this.f1389t = c0042y.f1406t;
                this.f1377g &= -4097;
            } else {
                if ((this.f1377g & 4096) != 4096) {
                    this.f1389t = new ArrayList(this.f1389t);
                    this.f1377g |= 4096;
                }
                this.f1389t.addAll(c0042y.f1406t);
            }
        }
        if ((c0042y.f & 256) == 256) {
            C0032n c0032n2 = c0042y.f1407u;
            if ((this.f1377g & 8192) != 8192 || (c0032n = this.f1390u) == C0032n.f1321h) {
                this.f1390u = c0032n2;
            } else {
                C0031m c0031m = new C0031m(0);
                c0031m.f1320g = Collections.emptyList();
                c0031m.j(c0032n);
                c0031m.j(c0032n2);
                this.f1390u = c0031m.f();
            }
            this.f1377g |= 8192;
        }
        f(c0042y);
        this.f2081d = this.f2081d.m(c0042y.f1393e);
    }
}
