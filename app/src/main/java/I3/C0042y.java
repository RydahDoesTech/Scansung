package I3;

import O3.AbstractC0070b;
import O3.AbstractC0073e;
import O3.AbstractC0079k;
import O3.AbstractC0081m;
import O3.C0072d;
import O3.C0074f;
import O3.C0077i;
import O3.C0086s;
import com.idm.adapter.callback.IDMCallbackStatusInterface;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: I3.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0042y extends AbstractC0081m {

    /* renamed from: x, reason: collision with root package name */
    public static final C0042y f1391x;

    /* renamed from: y, reason: collision with root package name */
    public static final C0019a f1392y = new C0019a(9);

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0073e f1393e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f1394g;

    /* renamed from: h, reason: collision with root package name */
    public int f1395h;

    /* renamed from: i, reason: collision with root package name */
    public int f1396i;

    /* renamed from: j, reason: collision with root package name */
    public Q f1397j;

    /* renamed from: k, reason: collision with root package name */
    public int f1398k;

    /* renamed from: l, reason: collision with root package name */
    public List f1399l;

    /* renamed from: m, reason: collision with root package name */
    public Q f1400m;
    public int n;

    /* renamed from: o, reason: collision with root package name */
    public List f1401o;

    /* renamed from: p, reason: collision with root package name */
    public List f1402p;

    /* renamed from: q, reason: collision with root package name */
    public int f1403q;

    /* renamed from: r, reason: collision with root package name */
    public List f1404r;

    /* renamed from: s, reason: collision with root package name */
    public X f1405s;

    /* renamed from: t, reason: collision with root package name */
    public List f1406t;

    /* renamed from: u, reason: collision with root package name */
    public C0032n f1407u;

    /* renamed from: v, reason: collision with root package name */
    public byte f1408v;

    /* renamed from: w, reason: collision with root package name */
    public int f1409w;

    static {
        C0042y c0042y = new C0042y();
        f1391x = c0042y;
        c0042y.q();
    }

    public C0042y(C0041x c0041x) {
        super(c0041x);
        this.f1403q = -1;
        this.f1408v = (byte) -1;
        this.f1409w = -1;
        this.f1393e = c0041x.f2081d;
    }

    @Override // O3.x
    public final AbstractC0070b a() {
        return f1391x;
    }

    @Override // O3.x
    public final boolean b() {
        byte b2 = this.f1408v;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        int i5 = this.f;
        if ((i5 & 4) != 4) {
            this.f1408v = (byte) 0;
            return false;
        }
        if ((i5 & 8) == 8 && !this.f1397j.b()) {
            this.f1408v = (byte) 0;
            return false;
        }
        for (int i6 = 0; i6 < this.f1399l.size(); i6++) {
            if (!((W) this.f1399l.get(i6)).b()) {
                this.f1408v = (byte) 0;
                return false;
            }
        }
        if (p() && !this.f1400m.b()) {
            this.f1408v = (byte) 0;
            return false;
        }
        for (int i7 = 0; i7 < this.f1401o.size(); i7++) {
            if (!((Q) this.f1401o.get(i7)).b()) {
                this.f1408v = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.f1404r.size(); i8++) {
            if (!((Z) this.f1404r.get(i8)).b()) {
                this.f1408v = (byte) 0;
                return false;
            }
        }
        if ((this.f & 128) == 128 && !this.f1405s.b()) {
            this.f1408v = (byte) 0;
            return false;
        }
        if ((this.f & 256) == 256 && !this.f1407u.b()) {
            this.f1408v = (byte) 0;
            return false;
        }
        if (i()) {
            this.f1408v = (byte) 1;
            return true;
        }
        this.f1408v = (byte) 0;
        return false;
    }

    @Override // O3.AbstractC0070b
    public final int c() {
        int i5 = this.f1409w;
        if (i5 != -1) {
            return i5;
        }
        int iB = (this.f & 2) == 2 ? A1.j.b(1, this.f1395h) : 0;
        if ((this.f & 4) == 4) {
            iB += A1.j.b(2, this.f1396i);
        }
        if ((this.f & 8) == 8) {
            iB += A1.j.d(3, this.f1397j);
        }
        for (int i6 = 0; i6 < this.f1399l.size(); i6++) {
            iB += A1.j.d(4, (AbstractC0070b) this.f1399l.get(i6));
        }
        if ((this.f & 32) == 32) {
            iB += A1.j.d(5, this.f1400m);
        }
        for (int i7 = 0; i7 < this.f1404r.size(); i7++) {
            iB += A1.j.d(6, (AbstractC0070b) this.f1404r.get(i7));
        }
        if ((this.f & 16) == 16) {
            iB += A1.j.b(7, this.f1398k);
        }
        if ((this.f & 64) == 64) {
            iB += A1.j.b(8, this.n);
        }
        if ((this.f & 1) == 1) {
            iB += A1.j.b(9, this.f1394g);
        }
        for (int i8 = 0; i8 < this.f1401o.size(); i8++) {
            iB += A1.j.d(10, (AbstractC0070b) this.f1401o.get(i8));
        }
        int iC = 0;
        for (int i9 = 0; i9 < this.f1402p.size(); i9++) {
            iC += A1.j.c(((Integer) this.f1402p.get(i9)).intValue());
        }
        int iD = iB + iC;
        if (!this.f1402p.isEmpty()) {
            iD = iD + 1 + A1.j.c(iC);
        }
        this.f1403q = iC;
        if ((this.f & 128) == 128) {
            iD += A1.j.d(30, this.f1405s);
        }
        int iC2 = 0;
        for (int i10 = 0; i10 < this.f1406t.size(); i10++) {
            iC2 += A1.j.c(((Integer) this.f1406t.get(i10)).intValue());
        }
        int size = (this.f1406t.size() * 2) + iD + iC2;
        if ((this.f & 256) == 256) {
            size += A1.j.d(32, this.f1407u);
        }
        int size2 = this.f1393e.size() + j() + size;
        this.f1409w = size2;
        return size2;
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k d() {
        return C0041x.h();
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k e() {
        C0041x c0041xH = C0041x.h();
        c0041xH.i(this);
        return c0041xH;
    }

    @Override // O3.AbstractC0070b
    public final void f(A1.j jVar) throws IOException {
        c();
        E0.d dVar = new E0.d((AbstractC0081m) this);
        if ((this.f & 2) == 2) {
            jVar.m(1, this.f1395h);
        }
        if ((this.f & 4) == 4) {
            jVar.m(2, this.f1396i);
        }
        if ((this.f & 8) == 8) {
            jVar.o(3, this.f1397j);
        }
        for (int i5 = 0; i5 < this.f1399l.size(); i5++) {
            jVar.o(4, (AbstractC0070b) this.f1399l.get(i5));
        }
        if ((this.f & 32) == 32) {
            jVar.o(5, this.f1400m);
        }
        for (int i6 = 0; i6 < this.f1404r.size(); i6++) {
            jVar.o(6, (AbstractC0070b) this.f1404r.get(i6));
        }
        if ((this.f & 16) == 16) {
            jVar.m(7, this.f1398k);
        }
        if ((this.f & 64) == 64) {
            jVar.m(8, this.n);
        }
        if ((this.f & 1) == 1) {
            jVar.m(9, this.f1394g);
        }
        for (int i7 = 0; i7 < this.f1401o.size(); i7++) {
            jVar.o(10, (AbstractC0070b) this.f1401o.get(i7));
        }
        if (this.f1402p.size() > 0) {
            jVar.v(90);
            jVar.v(this.f1403q);
        }
        for (int i8 = 0; i8 < this.f1402p.size(); i8++) {
            jVar.n(((Integer) this.f1402p.get(i8)).intValue());
        }
        if ((this.f & 128) == 128) {
            jVar.o(30, this.f1405s);
        }
        for (int i9 = 0; i9 < this.f1406t.size(); i9++) {
            jVar.m(31, ((Integer) this.f1406t.get(i9)).intValue());
        }
        if ((this.f & 256) == 256) {
            jVar.o(32, this.f1407u);
        }
        dVar.P0(19000, jVar);
        jVar.r(this.f1393e);
    }

    public final boolean p() {
        return (this.f & 32) == 32;
    }

    public final void q() {
        this.f1394g = 6;
        this.f1395h = 6;
        this.f1396i = 0;
        Q q5 = Q.f1072w;
        this.f1397j = q5;
        this.f1398k = 0;
        this.f1399l = Collections.emptyList();
        this.f1400m = q5;
        this.n = 0;
        this.f1401o = Collections.emptyList();
        this.f1402p = Collections.emptyList();
        this.f1404r = Collections.emptyList();
        this.f1405s = X.f1134j;
        this.f1406t = Collections.emptyList();
        this.f1407u = C0032n.f1321h;
    }

    public C0042y() {
        this.f1403q = -1;
        this.f1408v = (byte) -1;
        this.f1409w = -1;
        this.f1393e = AbstractC0073e.f2065d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public C0042y(C0074f c0074f, C0077i c0077i) {
        this.f1403q = -1;
        this.f1408v = (byte) -1;
        this.f1409w = -1;
        q();
        C0072d c0072d = new C0072d();
        A1.j jVarJ = A1.j.j(c0072d, 1);
        boolean z4 = false;
        char c2 = 0;
        while (true) {
            ?? N4 = 1024;
            if (!z4) {
                try {
                    try {
                        int iN = c0074f.n();
                        P pR = null;
                        C0031m c0031m = null;
                        C0024f c0024fI = null;
                        P pR2 = null;
                        switch (iN) {
                            case 0:
                                z4 = true;
                            case 8:
                                this.f |= 2;
                                this.f1395h = c0074f.k();
                            case 16:
                                this.f |= 4;
                                this.f1396i = c0074f.k();
                            case 26:
                                if ((this.f & 8) == 8) {
                                    Q q5 = this.f1397j;
                                    q5.getClass();
                                    pR = Q.r(q5);
                                }
                                Q q6 = (Q) c0074f.g(Q.f1073x, c0077i);
                                this.f1397j = q6;
                                if (pR != null) {
                                    pR.i(q6);
                                    this.f1397j = pR.g();
                                }
                                this.f |= 8;
                            case 34:
                                int i5 = (c2 == true ? 1 : 0) & 32;
                                c2 = c2;
                                if (i5 != 32) {
                                    this.f1399l = new ArrayList();
                                    c2 = (c2 == true ? 1 : 0) | ' ';
                                }
                                this.f1399l.add(c0074f.g(W.f1124q, c0077i));
                            case 42:
                                if ((this.f & 32) == 32) {
                                    Q q7 = this.f1400m;
                                    q7.getClass();
                                    pR2 = Q.r(q7);
                                }
                                Q q8 = (Q) c0074f.g(Q.f1073x, c0077i);
                                this.f1400m = q8;
                                if (pR2 != null) {
                                    pR2.i(q8);
                                    this.f1400m = pR2.g();
                                }
                                this.f |= 32;
                            case 50:
                                int i6 = (c2 == true ? 1 : 0) & 1024;
                                c2 = c2;
                                if (i6 != 1024) {
                                    this.f1404r = new ArrayList();
                                    c2 = (c2 == true ? 1 : 0) | 1024;
                                }
                                this.f1404r.add(c0074f.g(Z.f1149p, c0077i));
                            case 56:
                                this.f |= 16;
                                this.f1398k = c0074f.k();
                            case 64:
                                this.f |= 64;
                                this.n = c0074f.k();
                            case 72:
                                this.f |= 1;
                                this.f1394g = c0074f.k();
                            case 82:
                                int i7 = (c2 == true ? 1 : 0) & 256;
                                c2 = c2;
                                if (i7 != 256) {
                                    this.f1401o = new ArrayList();
                                    c2 = (c2 == true ? 1 : 0) | 256;
                                }
                                this.f1401o.add(c0074f.g(Q.f1073x, c0077i));
                            case 88:
                                int i8 = (c2 == true ? 1 : 0) & 512;
                                c2 = c2;
                                if (i8 != 512) {
                                    this.f1402p = new ArrayList();
                                    c2 = (c2 == true ? 1 : 0) | 512;
                                }
                                this.f1402p.add(Integer.valueOf(c0074f.k()));
                            case 90:
                                int iD = c0074f.d(c0074f.k());
                                int i9 = (c2 == true ? 1 : 0) & 512;
                                c2 = c2;
                                if (i9 != 512) {
                                    c2 = c2;
                                    if (c0074f.b() > 0) {
                                        this.f1402p = new ArrayList();
                                        c2 = (c2 == true ? 1 : 0) | 512;
                                    }
                                }
                                while (c0074f.b() > 0) {
                                    this.f1402p.add(Integer.valueOf(c0074f.k()));
                                }
                                c0074f.c(iD);
                            case IDMCallbackStatusInterface.IDM_DL_STATE_DOWNLOAD_PAUSE /* 242 */:
                                if ((this.f & 128) == 128) {
                                    X x4 = this.f1405s;
                                    x4.getClass();
                                    c0024fI = X.i(x4);
                                }
                                X x5 = (X) c0074f.g(X.f1135k, c0077i);
                                this.f1405s = x5;
                                if (c0024fI != null) {
                                    c0024fI.l(x5);
                                    this.f1405s = c0024fI.h();
                                }
                                this.f |= 128;
                            case 248:
                                int i10 = (c2 == true ? 1 : 0) & 4096;
                                c2 = c2;
                                if (i10 != 4096) {
                                    this.f1406t = new ArrayList();
                                    c2 = (c2 == true ? 1 : 0) | 4096;
                                }
                                this.f1406t.add(Integer.valueOf(c0074f.k()));
                            case 250:
                                int iD2 = c0074f.d(c0074f.k());
                                int i11 = (c2 == true ? 1 : 0) & 4096;
                                c2 = c2;
                                if (i11 != 4096) {
                                    c2 = c2;
                                    if (c0074f.b() > 0) {
                                        this.f1406t = new ArrayList();
                                        c2 = (c2 == true ? 1 : 0) | 4096;
                                    }
                                }
                                while (c0074f.b() > 0) {
                                    this.f1406t.add(Integer.valueOf(c0074f.k()));
                                }
                                c0074f.c(iD2);
                            case 258:
                                if ((this.f & 256) == 256) {
                                    C0032n c0032n = this.f1407u;
                                    c0032n.getClass();
                                    c0031m = new C0031m(0);
                                    c0031m.f1320g = Collections.emptyList();
                                    c0031m.j(c0032n);
                                }
                                C0032n c0032n2 = (C0032n) c0074f.g(C0032n.f1322i, c0077i);
                                this.f1407u = c0032n2;
                                if (c0031m != null) {
                                    c0031m.j(c0032n2);
                                    this.f1407u = c0031m.f();
                                }
                                this.f |= 256;
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
                        this.f1399l = Collections.unmodifiableList(this.f1399l);
                    }
                    if (((c2 == true ? 1 : 0) & 1024) == N4) {
                        this.f1404r = Collections.unmodifiableList(this.f1404r);
                    }
                    if (((c2 == true ? 1 : 0) & 256) == 256) {
                        this.f1401o = Collections.unmodifiableList(this.f1401o);
                    }
                    if (((c2 == true ? 1 : 0) & 512) == 512) {
                        this.f1402p = Collections.unmodifiableList(this.f1402p);
                    }
                    if (((c2 == true ? 1 : 0) & 4096) == 4096) {
                        this.f1406t = Collections.unmodifiableList(this.f1406t);
                    }
                    try {
                        jVarJ.i();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f1393e = c0072d.l();
                        throw th2;
                    }
                    this.f1393e = c0072d.l();
                    m();
                    throw th;
                }
            } else {
                if (((c2 == true ? 1 : 0) & 32) == 32) {
                    this.f1399l = Collections.unmodifiableList(this.f1399l);
                }
                if (((c2 == true ? 1 : 0) & 1024) == 1024) {
                    this.f1404r = Collections.unmodifiableList(this.f1404r);
                }
                if (((c2 == true ? 1 : 0) & 256) == 256) {
                    this.f1401o = Collections.unmodifiableList(this.f1401o);
                }
                if (((c2 == true ? 1 : 0) & 512) == 512) {
                    this.f1402p = Collections.unmodifiableList(this.f1402p);
                }
                if (((c2 == true ? 1 : 0) & 4096) == 4096) {
                    this.f1406t = Collections.unmodifiableList(this.f1406t);
                }
                try {
                    jVarJ.i();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f1393e = c0072d.l();
                    throw th3;
                }
                this.f1393e = c0072d.l();
                m();
                return;
            }
        }
    }
}
