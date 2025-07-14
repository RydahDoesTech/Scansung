package I3;

import O3.AbstractC0070b;
import O3.AbstractC0073e;
import O3.AbstractC0079k;
import O3.AbstractC0081m;
import O3.C0072d;
import O3.C0074f;
import O3.C0077i;
import O3.C0086s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class Q extends AbstractC0081m {

    /* renamed from: w, reason: collision with root package name */
    public static final Q f1072w;

    /* renamed from: x, reason: collision with root package name */
    public static final C0019a f1073x = new C0019a(16);

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0073e f1074e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public List f1075g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1076h;

    /* renamed from: i, reason: collision with root package name */
    public int f1077i;

    /* renamed from: j, reason: collision with root package name */
    public Q f1078j;

    /* renamed from: k, reason: collision with root package name */
    public int f1079k;

    /* renamed from: l, reason: collision with root package name */
    public int f1080l;

    /* renamed from: m, reason: collision with root package name */
    public int f1081m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public int f1082o;

    /* renamed from: p, reason: collision with root package name */
    public Q f1083p;

    /* renamed from: q, reason: collision with root package name */
    public int f1084q;

    /* renamed from: r, reason: collision with root package name */
    public Q f1085r;

    /* renamed from: s, reason: collision with root package name */
    public int f1086s;

    /* renamed from: t, reason: collision with root package name */
    public int f1087t;

    /* renamed from: u, reason: collision with root package name */
    public byte f1088u;

    /* renamed from: v, reason: collision with root package name */
    public int f1089v;

    static {
        Q q5 = new Q();
        f1072w = q5;
        q5.q();
    }

    public Q(P p2) {
        super(p2);
        this.f1088u = (byte) -1;
        this.f1089v = -1;
        this.f1074e = p2.f2081d;
    }

    public static P r(Q q5) {
        P pH = P.h();
        pH.i(q5);
        return pH;
    }

    @Override // O3.x
    public final AbstractC0070b a() {
        return f1072w;
    }

    @Override // O3.x
    public final boolean b() {
        byte b2 = this.f1088u;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i5 = 0; i5 < this.f1075g.size(); i5++) {
            if (!((O) this.f1075g.get(i5)).b()) {
                this.f1088u = (byte) 0;
                return false;
            }
        }
        if ((this.f & 4) == 4 && !this.f1078j.b()) {
            this.f1088u = (byte) 0;
            return false;
        }
        if ((this.f & 256) == 256 && !this.f1083p.b()) {
            this.f1088u = (byte) 0;
            return false;
        }
        if ((this.f & 1024) == 1024 && !this.f1085r.b()) {
            this.f1088u = (byte) 0;
            return false;
        }
        if (i()) {
            this.f1088u = (byte) 1;
            return true;
        }
        this.f1088u = (byte) 0;
        return false;
    }

    @Override // O3.AbstractC0070b
    public final int c() {
        int i5 = this.f1089v;
        if (i5 != -1) {
            return i5;
        }
        int iB = (this.f & 4096) == 4096 ? A1.j.b(1, this.f1087t) : 0;
        for (int i6 = 0; i6 < this.f1075g.size(); i6++) {
            iB += A1.j.d(2, (AbstractC0070b) this.f1075g.get(i6));
        }
        if ((this.f & 1) == 1) {
            iB += A1.j.h(3) + 1;
        }
        if ((this.f & 2) == 2) {
            iB += A1.j.b(4, this.f1077i);
        }
        if ((this.f & 4) == 4) {
            iB += A1.j.d(5, this.f1078j);
        }
        if ((this.f & 16) == 16) {
            iB += A1.j.b(6, this.f1080l);
        }
        if ((this.f & 32) == 32) {
            iB += A1.j.b(7, this.f1081m);
        }
        if ((this.f & 8) == 8) {
            iB += A1.j.b(8, this.f1079k);
        }
        if ((this.f & 64) == 64) {
            iB += A1.j.b(9, this.n);
        }
        if ((this.f & 256) == 256) {
            iB += A1.j.d(10, this.f1083p);
        }
        if ((this.f & 512) == 512) {
            iB += A1.j.b(11, this.f1084q);
        }
        if ((this.f & 128) == 128) {
            iB += A1.j.b(12, this.f1082o);
        }
        if ((this.f & 1024) == 1024) {
            iB += A1.j.d(13, this.f1085r);
        }
        if ((this.f & 2048) == 2048) {
            iB += A1.j.b(14, this.f1086s);
        }
        int size = this.f1074e.size() + j() + iB;
        this.f1089v = size;
        return size;
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k d() {
        return P.h();
    }

    @Override // O3.AbstractC0070b
    public final void f(A1.j jVar) throws IOException {
        c();
        E0.d dVar = new E0.d((AbstractC0081m) this);
        if ((this.f & 4096) == 4096) {
            jVar.m(1, this.f1087t);
        }
        for (int i5 = 0; i5 < this.f1075g.size(); i5++) {
            jVar.o(2, (AbstractC0070b) this.f1075g.get(i5));
        }
        if ((this.f & 1) == 1) {
            boolean z4 = this.f1076h;
            jVar.x(3, 0);
            jVar.q(z4 ? 1 : 0);
        }
        if ((this.f & 2) == 2) {
            jVar.m(4, this.f1077i);
        }
        if ((this.f & 4) == 4) {
            jVar.o(5, this.f1078j);
        }
        if ((this.f & 16) == 16) {
            jVar.m(6, this.f1080l);
        }
        if ((this.f & 32) == 32) {
            jVar.m(7, this.f1081m);
        }
        if ((this.f & 8) == 8) {
            jVar.m(8, this.f1079k);
        }
        if ((this.f & 64) == 64) {
            jVar.m(9, this.n);
        }
        if ((this.f & 256) == 256) {
            jVar.o(10, this.f1083p);
        }
        if ((this.f & 512) == 512) {
            jVar.m(11, this.f1084q);
        }
        if ((this.f & 128) == 128) {
            jVar.m(12, this.f1082o);
        }
        if ((this.f & 1024) == 1024) {
            jVar.o(13, this.f1085r);
        }
        if ((this.f & 2048) == 2048) {
            jVar.m(14, this.f1086s);
        }
        dVar.P0(200, jVar);
        jVar.r(this.f1074e);
    }

    public final boolean p() {
        return (this.f & 16) == 16;
    }

    public final void q() {
        this.f1075g = Collections.emptyList();
        this.f1076h = false;
        this.f1077i = 0;
        Q q5 = f1072w;
        this.f1078j = q5;
        this.f1079k = 0;
        this.f1080l = 0;
        this.f1081m = 0;
        this.n = 0;
        this.f1082o = 0;
        this.f1083p = q5;
        this.f1084q = 0;
        this.f1085r = q5;
        this.f1086s = 0;
        this.f1087t = 0;
    }

    @Override // O3.AbstractC0070b
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final P e() {
        return r(this);
    }

    public Q() {
        this.f1088u = (byte) -1;
        this.f1089v = -1;
        this.f1074e = AbstractC0073e.f2065d;
    }

    public Q(C0074f c0074f, C0077i c0077i) {
        this.f1088u = (byte) -1;
        this.f1089v = -1;
        q();
        C0072d c0072d = new C0072d();
        A1.j jVarJ = A1.j.j(c0072d, 1);
        boolean z4 = false;
        boolean z5 = false;
        while (!z4) {
            try {
                try {
                    int iN = c0074f.n();
                    C0019a c0019a = f1073x;
                    P pR = null;
                    switch (iN) {
                        case 0:
                            break;
                        case 8:
                            this.f |= 4096;
                            this.f1087t = c0074f.k();
                            continue;
                        case 18:
                            if (!z5) {
                                this.f1075g = new ArrayList();
                                z5 = true;
                            }
                            this.f1075g.add(c0074f.g(O.f1051l, c0077i));
                            continue;
                        case 24:
                            this.f |= 1;
                            this.f1076h = c0074f.l() != 0;
                            continue;
                        case 32:
                            this.f |= 2;
                            this.f1077i = c0074f.k();
                            continue;
                        case 42:
                            if ((this.f & 4) == 4) {
                                Q q5 = this.f1078j;
                                q5.getClass();
                                pR = r(q5);
                            }
                            Q q6 = (Q) c0074f.g(c0019a, c0077i);
                            this.f1078j = q6;
                            if (pR != null) {
                                pR.i(q6);
                                this.f1078j = pR.g();
                            }
                            this.f |= 4;
                            continue;
                        case 48:
                            this.f |= 16;
                            this.f1080l = c0074f.k();
                            continue;
                        case 56:
                            this.f |= 32;
                            this.f1081m = c0074f.k();
                            continue;
                        case 64:
                            this.f |= 8;
                            this.f1079k = c0074f.k();
                            continue;
                        case 72:
                            this.f |= 64;
                            this.n = c0074f.k();
                            continue;
                        case 82:
                            if ((this.f & 256) == 256) {
                                Q q7 = this.f1083p;
                                q7.getClass();
                                pR = r(q7);
                            }
                            Q q8 = (Q) c0074f.g(c0019a, c0077i);
                            this.f1083p = q8;
                            if (pR != null) {
                                pR.i(q8);
                                this.f1083p = pR.g();
                            }
                            this.f |= 256;
                            continue;
                        case 88:
                            this.f |= 512;
                            this.f1084q = c0074f.k();
                            continue;
                        case 96:
                            this.f |= 128;
                            this.f1082o = c0074f.k();
                            continue;
                        case 106:
                            if ((this.f & 1024) == 1024) {
                                Q q9 = this.f1085r;
                                q9.getClass();
                                pR = r(q9);
                            }
                            Q q10 = (Q) c0074f.g(c0019a, c0077i);
                            this.f1085r = q10;
                            if (pR != null) {
                                pR.i(q10);
                                this.f1085r = pR.g();
                            }
                            this.f |= 1024;
                            continue;
                        case 112:
                            this.f |= 2048;
                            this.f1086s = c0074f.k();
                            continue;
                        default:
                            if (!n(c0074f, jVarJ, c0077i, iN)) {
                                break;
                            }
                    }
                    z4 = true;
                } catch (C0086s e5) {
                    e5.f2092d = this;
                    throw e5;
                } catch (IOException e6) {
                    C0086s c0086s = new C0086s(e6.getMessage());
                    c0086s.f2092d = this;
                    throw c0086s;
                }
            } catch (Throwable th) {
                if (z5) {
                    this.f1075g = Collections.unmodifiableList(this.f1075g);
                }
                try {
                    jVarJ.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f1074e = c0072d.l();
                    throw th2;
                }
                this.f1074e = c0072d.l();
                m();
                throw th;
            }
        }
        if (z5) {
            this.f1075g = Collections.unmodifiableList(this.f1075g);
        }
        try {
            jVarJ.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1074e = c0072d.l();
            throw th3;
        }
        this.f1074e = c0072d.l();
        m();
    }
}
