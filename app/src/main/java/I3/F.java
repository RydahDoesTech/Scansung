package I3;

import O3.AbstractC0070b;
import O3.AbstractC0079k;
import O3.AbstractC0080l;
import O3.AbstractC0084p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class F extends AbstractC0080l {

    /* renamed from: g, reason: collision with root package name */
    public int f984g;

    /* renamed from: h, reason: collision with root package name */
    public int f985h;

    /* renamed from: i, reason: collision with root package name */
    public int f986i;

    /* renamed from: j, reason: collision with root package name */
    public int f987j;

    /* renamed from: k, reason: collision with root package name */
    public Q f988k;

    /* renamed from: l, reason: collision with root package name */
    public int f989l;

    /* renamed from: m, reason: collision with root package name */
    public List f990m;
    public Q n;

    /* renamed from: o, reason: collision with root package name */
    public int f991o;

    /* renamed from: p, reason: collision with root package name */
    public List f992p;

    /* renamed from: q, reason: collision with root package name */
    public List f993q;

    /* renamed from: r, reason: collision with root package name */
    public Z f994r;

    /* renamed from: s, reason: collision with root package name */
    public int f995s;

    /* renamed from: t, reason: collision with root package name */
    public int f996t;

    /* renamed from: u, reason: collision with root package name */
    public List f997u;

    public static F h() {
        F f = new F();
        f.f985h = 518;
        f.f986i = 2054;
        Q q5 = Q.f1072w;
        f.f988k = q5;
        f.f990m = Collections.emptyList();
        f.n = q5;
        f.f992p = Collections.emptyList();
        f.f993q = Collections.emptyList();
        f.f994r = Z.f1148o;
        f.f997u = Collections.emptyList();
        return f;
    }

    @Override // O3.AbstractC0079k
    public final AbstractC0070b c() {
        G g5 = g();
        if (g5.b()) {
            return g5;
        }
        throw new O2.d();
    }

    public final Object clone() {
        F fH = h();
        fH.i(g());
        return fH;
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
            I3.a r1 = I3.G.f999y     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.getClass()     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            I3.G r1 = new I3.G     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lf O3.C0086s -> L11
            r2.i(r1)
            return r2
        Lf:
            r3 = move-exception
            goto L19
        L11:
            r3 = move-exception
            O3.b r4 = r3.f2092d     // Catch: java.lang.Throwable -> Lf
            I3.G r4 = (I3.G) r4     // Catch: java.lang.Throwable -> Lf
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
        throw new UnsupportedOperationException("Method not decompiled: I3.F.d(O3.f, O3.i):O3.k");
    }

    @Override // O3.AbstractC0079k
    public final /* bridge */ /* synthetic */ AbstractC0079k e(AbstractC0084p abstractC0084p) {
        i((G) abstractC0084p);
        return this;
    }

    public final G g() {
        G g5 = new G(this);
        int i5 = this.f984g;
        int i6 = (i5 & 1) != 1 ? 0 : 1;
        g5.f1001g = this.f985h;
        if ((i5 & 2) == 2) {
            i6 |= 2;
        }
        g5.f1002h = this.f986i;
        if ((i5 & 4) == 4) {
            i6 |= 4;
        }
        g5.f1003i = this.f987j;
        if ((i5 & 8) == 8) {
            i6 |= 8;
        }
        g5.f1004j = this.f988k;
        if ((i5 & 16) == 16) {
            i6 |= 16;
        }
        g5.f1005k = this.f989l;
        if ((i5 & 32) == 32) {
            this.f990m = Collections.unmodifiableList(this.f990m);
            this.f984g &= -33;
        }
        g5.f1006l = this.f990m;
        if ((i5 & 64) == 64) {
            i6 |= 32;
        }
        g5.f1007m = this.n;
        if ((i5 & 128) == 128) {
            i6 |= 64;
        }
        g5.n = this.f991o;
        if ((this.f984g & 256) == 256) {
            this.f992p = Collections.unmodifiableList(this.f992p);
            this.f984g &= -257;
        }
        g5.f1008o = this.f992p;
        if ((this.f984g & 512) == 512) {
            this.f993q = Collections.unmodifiableList(this.f993q);
            this.f984g &= -513;
        }
        g5.f1009p = this.f993q;
        if ((i5 & 1024) == 1024) {
            i6 |= 128;
        }
        g5.f1011r = this.f994r;
        if ((i5 & 2048) == 2048) {
            i6 |= 256;
        }
        g5.f1012s = this.f995s;
        if ((i5 & 4096) == 4096) {
            i6 |= 512;
        }
        g5.f1013t = this.f996t;
        if ((this.f984g & 8192) == 8192) {
            this.f997u = Collections.unmodifiableList(this.f997u);
            this.f984g &= -8193;
        }
        g5.f1014u = this.f997u;
        g5.f = i6;
        return g5;
    }

    public final void i(G g5) {
        Z z4;
        Q q5;
        Q q6;
        if (g5 == G.f998x) {
            return;
        }
        int i5 = g5.f;
        if ((i5 & 1) == 1) {
            int i6 = g5.f1001g;
            this.f984g = 1 | this.f984g;
            this.f985h = i6;
        }
        if ((i5 & 2) == 2) {
            int i7 = g5.f1002h;
            this.f984g = 2 | this.f984g;
            this.f986i = i7;
        }
        if ((i5 & 4) == 4) {
            int i8 = g5.f1003i;
            this.f984g = 4 | this.f984g;
            this.f987j = i8;
        }
        if ((i5 & 8) == 8) {
            Q q7 = g5.f1004j;
            if ((this.f984g & 8) != 8 || (q6 = this.f988k) == Q.f1072w) {
                this.f988k = q7;
            } else {
                P pR = Q.r(q6);
                pR.i(q7);
                this.f988k = pR.g();
            }
            this.f984g |= 8;
        }
        if ((g5.f & 16) == 16) {
            int i9 = g5.f1005k;
            this.f984g = 16 | this.f984g;
            this.f989l = i9;
        }
        if (!g5.f1006l.isEmpty()) {
            if (this.f990m.isEmpty()) {
                this.f990m = g5.f1006l;
                this.f984g &= -33;
            } else {
                if ((this.f984g & 32) != 32) {
                    this.f990m = new ArrayList(this.f990m);
                    this.f984g |= 32;
                }
                this.f990m.addAll(g5.f1006l);
            }
        }
        if (g5.p()) {
            Q q8 = g5.f1007m;
            if ((this.f984g & 64) != 64 || (q5 = this.n) == Q.f1072w) {
                this.n = q8;
            } else {
                P pR2 = Q.r(q5);
                pR2.i(q8);
                this.n = pR2.g();
            }
            this.f984g |= 64;
        }
        if ((g5.f & 64) == 64) {
            int i10 = g5.n;
            this.f984g |= 128;
            this.f991o = i10;
        }
        if (!g5.f1008o.isEmpty()) {
            if (this.f992p.isEmpty()) {
                this.f992p = g5.f1008o;
                this.f984g &= -257;
            } else {
                if ((this.f984g & 256) != 256) {
                    this.f992p = new ArrayList(this.f992p);
                    this.f984g |= 256;
                }
                this.f992p.addAll(g5.f1008o);
            }
        }
        if (!g5.f1009p.isEmpty()) {
            if (this.f993q.isEmpty()) {
                this.f993q = g5.f1009p;
                this.f984g &= -513;
            } else {
                if ((this.f984g & 512) != 512) {
                    this.f993q = new ArrayList(this.f993q);
                    this.f984g |= 512;
                }
                this.f993q.addAll(g5.f1009p);
            }
        }
        if ((g5.f & 128) == 128) {
            Z z5 = g5.f1011r;
            if ((this.f984g & 1024) != 1024 || (z4 = this.f994r) == Z.f1148o) {
                this.f994r = z5;
            } else {
                Y y4 = new Y();
                Q q9 = Q.f1072w;
                y4.f1144j = q9;
                y4.f1146l = q9;
                y4.h(z4);
                y4.h(z5);
                this.f994r = y4.g();
            }
            this.f984g |= 1024;
        }
        int i11 = g5.f;
        if ((i11 & 256) == 256) {
            int i12 = g5.f1012s;
            this.f984g |= 2048;
            this.f995s = i12;
        }
        if ((i11 & 512) == 512) {
            int i13 = g5.f1013t;
            this.f984g |= 4096;
            this.f996t = i13;
        }
        if (!g5.f1014u.isEmpty()) {
            if (this.f997u.isEmpty()) {
                this.f997u = g5.f1014u;
                this.f984g &= -8193;
            } else {
                if ((this.f984g & 8192) != 8192) {
                    this.f997u = new ArrayList(this.f997u);
                    this.f984g |= 8192;
                }
                this.f997u.addAll(g5.f1014u);
            }
        }
        f(g5);
        this.f2081d = this.f2081d.m(g5.f1000e);
    }
}
