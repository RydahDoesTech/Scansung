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
public final class G extends AbstractC0081m {

    /* renamed from: x, reason: collision with root package name */
    public static final G f998x;

    /* renamed from: y, reason: collision with root package name */
    public static final C0019a f999y = new C0019a(12);

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0073e f1000e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f1001g;

    /* renamed from: h, reason: collision with root package name */
    public int f1002h;

    /* renamed from: i, reason: collision with root package name */
    public int f1003i;

    /* renamed from: j, reason: collision with root package name */
    public Q f1004j;

    /* renamed from: k, reason: collision with root package name */
    public int f1005k;

    /* renamed from: l, reason: collision with root package name */
    public List f1006l;

    /* renamed from: m, reason: collision with root package name */
    public Q f1007m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public List f1008o;

    /* renamed from: p, reason: collision with root package name */
    public List f1009p;

    /* renamed from: q, reason: collision with root package name */
    public int f1010q;

    /* renamed from: r, reason: collision with root package name */
    public Z f1011r;

    /* renamed from: s, reason: collision with root package name */
    public int f1012s;

    /* renamed from: t, reason: collision with root package name */
    public int f1013t;

    /* renamed from: u, reason: collision with root package name */
    public List f1014u;

    /* renamed from: v, reason: collision with root package name */
    public byte f1015v;

    /* renamed from: w, reason: collision with root package name */
    public int f1016w;

    static {
        G g5 = new G();
        f998x = g5;
        g5.q();
    }

    public G(F f) {
        super(f);
        this.f1010q = -1;
        this.f1015v = (byte) -1;
        this.f1016w = -1;
        this.f1000e = f.f2081d;
    }

    @Override // O3.x
    public final AbstractC0070b a() {
        return f998x;
    }

    @Override // O3.x
    public final boolean b() {
        byte b2 = this.f1015v;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        int i5 = this.f;
        if ((i5 & 4) != 4) {
            this.f1015v = (byte) 0;
            return false;
        }
        if ((i5 & 8) == 8 && !this.f1004j.b()) {
            this.f1015v = (byte) 0;
            return false;
        }
        for (int i6 = 0; i6 < this.f1006l.size(); i6++) {
            if (!((W) this.f1006l.get(i6)).b()) {
                this.f1015v = (byte) 0;
                return false;
            }
        }
        if (p() && !this.f1007m.b()) {
            this.f1015v = (byte) 0;
            return false;
        }
        for (int i7 = 0; i7 < this.f1008o.size(); i7++) {
            if (!((Q) this.f1008o.get(i7)).b()) {
                this.f1015v = (byte) 0;
                return false;
            }
        }
        if ((this.f & 128) == 128 && !this.f1011r.b()) {
            this.f1015v = (byte) 0;
            return false;
        }
        if (i()) {
            this.f1015v = (byte) 1;
            return true;
        }
        this.f1015v = (byte) 0;
        return false;
    }

    @Override // O3.AbstractC0070b
    public final int c() {
        int i5 = this.f1016w;
        if (i5 != -1) {
            return i5;
        }
        int iB = (this.f & 2) == 2 ? A1.j.b(1, this.f1002h) : 0;
        if ((this.f & 4) == 4) {
            iB += A1.j.b(2, this.f1003i);
        }
        if ((this.f & 8) == 8) {
            iB += A1.j.d(3, this.f1004j);
        }
        for (int i6 = 0; i6 < this.f1006l.size(); i6++) {
            iB += A1.j.d(4, (AbstractC0070b) this.f1006l.get(i6));
        }
        if ((this.f & 32) == 32) {
            iB += A1.j.d(5, this.f1007m);
        }
        if ((this.f & 128) == 128) {
            iB += A1.j.d(6, this.f1011r);
        }
        if ((this.f & 256) == 256) {
            iB += A1.j.b(7, this.f1012s);
        }
        if ((this.f & 512) == 512) {
            iB += A1.j.b(8, this.f1013t);
        }
        if ((this.f & 16) == 16) {
            iB += A1.j.b(9, this.f1005k);
        }
        if ((this.f & 64) == 64) {
            iB += A1.j.b(10, this.n);
        }
        if ((this.f & 1) == 1) {
            iB += A1.j.b(11, this.f1001g);
        }
        for (int i7 = 0; i7 < this.f1008o.size(); i7++) {
            iB += A1.j.d(12, (AbstractC0070b) this.f1008o.get(i7));
        }
        int iC = 0;
        for (int i8 = 0; i8 < this.f1009p.size(); i8++) {
            iC += A1.j.c(((Integer) this.f1009p.get(i8)).intValue());
        }
        int iC2 = iB + iC;
        if (!this.f1009p.isEmpty()) {
            iC2 = iC2 + 1 + A1.j.c(iC);
        }
        this.f1010q = iC;
        int iC3 = 0;
        for (int i9 = 0; i9 < this.f1014u.size(); i9++) {
            iC3 += A1.j.c(((Integer) this.f1014u.get(i9)).intValue());
        }
        int size = this.f1000e.size() + j() + (this.f1014u.size() * 2) + iC2 + iC3;
        this.f1016w = size;
        return size;
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k d() {
        return F.h();
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k e() {
        F fH = F.h();
        fH.i(this);
        return fH;
    }

    @Override // O3.AbstractC0070b
    public final void f(A1.j jVar) throws IOException {
        c();
        E0.d dVar = new E0.d((AbstractC0081m) this);
        if ((this.f & 2) == 2) {
            jVar.m(1, this.f1002h);
        }
        if ((this.f & 4) == 4) {
            jVar.m(2, this.f1003i);
        }
        if ((this.f & 8) == 8) {
            jVar.o(3, this.f1004j);
        }
        for (int i5 = 0; i5 < this.f1006l.size(); i5++) {
            jVar.o(4, (AbstractC0070b) this.f1006l.get(i5));
        }
        if ((this.f & 32) == 32) {
            jVar.o(5, this.f1007m);
        }
        if ((this.f & 128) == 128) {
            jVar.o(6, this.f1011r);
        }
        if ((this.f & 256) == 256) {
            jVar.m(7, this.f1012s);
        }
        if ((this.f & 512) == 512) {
            jVar.m(8, this.f1013t);
        }
        if ((this.f & 16) == 16) {
            jVar.m(9, this.f1005k);
        }
        if ((this.f & 64) == 64) {
            jVar.m(10, this.n);
        }
        if ((this.f & 1) == 1) {
            jVar.m(11, this.f1001g);
        }
        for (int i6 = 0; i6 < this.f1008o.size(); i6++) {
            jVar.o(12, (AbstractC0070b) this.f1008o.get(i6));
        }
        if (this.f1009p.size() > 0) {
            jVar.v(106);
            jVar.v(this.f1010q);
        }
        for (int i7 = 0; i7 < this.f1009p.size(); i7++) {
            jVar.n(((Integer) this.f1009p.get(i7)).intValue());
        }
        for (int i8 = 0; i8 < this.f1014u.size(); i8++) {
            jVar.m(31, ((Integer) this.f1014u.get(i8)).intValue());
        }
        dVar.P0(19000, jVar);
        jVar.r(this.f1000e);
    }

    public final boolean p() {
        return (this.f & 32) == 32;
    }

    public final void q() {
        this.f1001g = 518;
        this.f1002h = 2054;
        this.f1003i = 0;
        Q q5 = Q.f1072w;
        this.f1004j = q5;
        this.f1005k = 0;
        this.f1006l = Collections.emptyList();
        this.f1007m = q5;
        this.n = 0;
        this.f1008o = Collections.emptyList();
        this.f1009p = Collections.emptyList();
        this.f1011r = Z.f1148o;
        this.f1012s = 0;
        this.f1013t = 0;
        this.f1014u = Collections.emptyList();
    }

    public G() {
        this.f1010q = -1;
        this.f1015v = (byte) -1;
        this.f1016w = -1;
        this.f1000e = AbstractC0073e.f2065d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public G(C0074f c0074f, C0077i c0077i) {
        this.f1010q = -1;
        this.f1015v = (byte) -1;
        this.f1016w = -1;
        q();
        C0072d c0072d = new C0072d();
        A1.j jVarJ = A1.j.j(c0072d, 1);
        boolean z4 = false;
        char c2 = 0;
        while (true) {
            ?? N4 = 256;
            if (!z4) {
                try {
                    try {
                        int iN = c0074f.n();
                        P pR = null;
                        Y y4 = null;
                        P pR2 = null;
                        switch (iN) {
                            case 0:
                                z4 = true;
                            case 8:
                                this.f |= 2;
                                this.f1002h = c0074f.k();
                            case 16:
                                this.f |= 4;
                                this.f1003i = c0074f.k();
                            case 26:
                                if ((this.f & 8) == 8) {
                                    Q q5 = this.f1004j;
                                    q5.getClass();
                                    pR = Q.r(q5);
                                }
                                Q q6 = (Q) c0074f.g(Q.f1073x, c0077i);
                                this.f1004j = q6;
                                if (pR != null) {
                                    pR.i(q6);
                                    this.f1004j = pR.g();
                                }
                                this.f |= 8;
                            case 34:
                                int i5 = (c2 == true ? 1 : 0) & 32;
                                c2 = c2;
                                if (i5 != 32) {
                                    this.f1006l = new ArrayList();
                                    c2 = (c2 == true ? 1 : 0) | ' ';
                                }
                                this.f1006l.add(c0074f.g(W.f1124q, c0077i));
                            case 42:
                                if ((this.f & 32) == 32) {
                                    Q q7 = this.f1007m;
                                    q7.getClass();
                                    pR2 = Q.r(q7);
                                }
                                Q q8 = (Q) c0074f.g(Q.f1073x, c0077i);
                                this.f1007m = q8;
                                if (pR2 != null) {
                                    pR2.i(q8);
                                    this.f1007m = pR2.g();
                                }
                                this.f |= 32;
                            case 50:
                                if ((this.f & 128) == 128) {
                                    Z z5 = this.f1011r;
                                    z5.getClass();
                                    y4 = new Y();
                                    Q q9 = Q.f1072w;
                                    y4.f1144j = q9;
                                    y4.f1146l = q9;
                                    y4.h(z5);
                                }
                                Z z6 = (Z) c0074f.g(Z.f1149p, c0077i);
                                this.f1011r = z6;
                                if (y4 != null) {
                                    y4.h(z6);
                                    this.f1011r = y4.g();
                                }
                                this.f |= 128;
                            case 56:
                                this.f |= 256;
                                this.f1012s = c0074f.k();
                            case 64:
                                this.f |= 512;
                                this.f1013t = c0074f.k();
                            case 72:
                                this.f |= 16;
                                this.f1005k = c0074f.k();
                            case 80:
                                this.f |= 64;
                                this.n = c0074f.k();
                            case 88:
                                this.f |= 1;
                                this.f1001g = c0074f.k();
                            case 98:
                                int i6 = (c2 == true ? 1 : 0) & 256;
                                c2 = c2;
                                if (i6 != 256) {
                                    this.f1008o = new ArrayList();
                                    c2 = (c2 == true ? 1 : 0) | 256;
                                }
                                this.f1008o.add(c0074f.g(Q.f1073x, c0077i));
                            case 104:
                                int i7 = (c2 == true ? 1 : 0) & 512;
                                c2 = c2;
                                if (i7 != 512) {
                                    this.f1009p = new ArrayList();
                                    c2 = (c2 == true ? 1 : 0) | 512;
                                }
                                this.f1009p.add(Integer.valueOf(c0074f.k()));
                            case 106:
                                int iD = c0074f.d(c0074f.k());
                                int i8 = (c2 == true ? 1 : 0) & 512;
                                c2 = c2;
                                if (i8 != 512) {
                                    c2 = c2;
                                    if (c0074f.b() > 0) {
                                        this.f1009p = new ArrayList();
                                        c2 = (c2 == true ? 1 : 0) | 512;
                                    }
                                }
                                while (c0074f.b() > 0) {
                                    this.f1009p.add(Integer.valueOf(c0074f.k()));
                                }
                                c0074f.c(iD);
                            case 248:
                                int i9 = (c2 == true ? 1 : 0) & 8192;
                                c2 = c2;
                                if (i9 != 8192) {
                                    this.f1014u = new ArrayList();
                                    c2 = (c2 == true ? 1 : 0) | 8192;
                                }
                                this.f1014u.add(Integer.valueOf(c0074f.k()));
                            case 250:
                                int iD2 = c0074f.d(c0074f.k());
                                int i10 = (c2 == true ? 1 : 0) & 8192;
                                c2 = c2;
                                if (i10 != 8192) {
                                    c2 = c2;
                                    if (c0074f.b() > 0) {
                                        this.f1014u = new ArrayList();
                                        c2 = (c2 == true ? 1 : 0) | 8192;
                                    }
                                }
                                while (c0074f.b() > 0) {
                                    this.f1014u.add(Integer.valueOf(c0074f.k()));
                                }
                                c0074f.c(iD2);
                            default:
                                N4 = n(c0074f, jVarJ, c0077i, iN);
                                if (N4 == 0) {
                                    z4 = true;
                                }
                        }
                    } catch (C0086s e5) {
                        e5.f2092d = this;
                        throw e5;
                    } catch (IOException e6) {
                        C0086s c0086s = new C0086s(e6.getMessage());
                        c0086s.f2092d = this;
                        throw c0086s;
                    }
                } catch (Throwable th) {
                    if (((c2 == true ? 1 : 0) & 32) == 32) {
                        this.f1006l = Collections.unmodifiableList(this.f1006l);
                    }
                    if (((c2 == true ? 1 : 0) & 256) == N4) {
                        this.f1008o = Collections.unmodifiableList(this.f1008o);
                    }
                    if (((c2 == true ? 1 : 0) & 512) == 512) {
                        this.f1009p = Collections.unmodifiableList(this.f1009p);
                    }
                    if (((c2 == true ? 1 : 0) & 8192) == 8192) {
                        this.f1014u = Collections.unmodifiableList(this.f1014u);
                    }
                    try {
                        jVarJ.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f1000e = c0072d.l();
                        throw th2;
                    }
                    this.f1000e = c0072d.l();
                    m();
                    throw th;
                }
            } else {
                if (((c2 == true ? 1 : 0) & 32) == 32) {
                    this.f1006l = Collections.unmodifiableList(this.f1006l);
                }
                if (((c2 == true ? 1 : 0) & 256) == 256) {
                    this.f1008o = Collections.unmodifiableList(this.f1008o);
                }
                if (((c2 == true ? 1 : 0) & 512) == 512) {
                    this.f1009p = Collections.unmodifiableList(this.f1009p);
                }
                if (((c2 == true ? 1 : 0) & 8192) == 8192) {
                    this.f1014u = Collections.unmodifiableList(this.f1014u);
                }
                try {
                    jVarJ.i();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f1000e = c0072d.l();
                    throw th3;
                }
                this.f1000e = c0072d.l();
                m();
                return;
            }
        }
    }
}
