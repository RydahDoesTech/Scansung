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
public final class W extends AbstractC0081m {

    /* renamed from: p, reason: collision with root package name */
    public static final W f1123p;

    /* renamed from: q, reason: collision with root package name */
    public static final C0019a f1124q = new C0019a(19);

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0073e f1125e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f1126g;

    /* renamed from: h, reason: collision with root package name */
    public int f1127h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1128i;

    /* renamed from: j, reason: collision with root package name */
    public V f1129j;

    /* renamed from: k, reason: collision with root package name */
    public List f1130k;

    /* renamed from: l, reason: collision with root package name */
    public List f1131l;

    /* renamed from: m, reason: collision with root package name */
    public int f1132m;
    public byte n;

    /* renamed from: o, reason: collision with root package name */
    public int f1133o;

    static {
        W w3 = new W();
        f1123p = w3;
        w3.f1126g = 0;
        w3.f1127h = 0;
        w3.f1128i = false;
        w3.f1129j = V.INV;
        w3.f1130k = Collections.emptyList();
        w3.f1131l = Collections.emptyList();
    }

    public W(U u4) {
        super(u4);
        this.f1132m = -1;
        this.n = (byte) -1;
        this.f1133o = -1;
        this.f1125e = u4.f2081d;
    }

    @Override // O3.x
    public final AbstractC0070b a() {
        return f1123p;
    }

    @Override // O3.x
    public final boolean b() {
        byte b2 = this.n;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        int i5 = this.f;
        if ((i5 & 1) != 1) {
            this.n = (byte) 0;
            return false;
        }
        if ((i5 & 2) != 2) {
            this.n = (byte) 0;
            return false;
        }
        for (int i6 = 0; i6 < this.f1130k.size(); i6++) {
            if (!((Q) this.f1130k.get(i6)).b()) {
                this.n = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.n = (byte) 1;
            return true;
        }
        this.n = (byte) 0;
        return false;
    }

    @Override // O3.AbstractC0070b
    public final int c() {
        int i5 = this.f1133o;
        if (i5 != -1) {
            return i5;
        }
        int iB = (this.f & 1) == 1 ? A1.j.b(1, this.f1126g) : 0;
        if ((this.f & 2) == 2) {
            iB += A1.j.b(2, this.f1127h);
        }
        if ((this.f & 4) == 4) {
            iB += A1.j.h(3) + 1;
        }
        if ((this.f & 8) == 8) {
            iB += A1.j.a(4, this.f1129j.f1122d);
        }
        for (int i6 = 0; i6 < this.f1130k.size(); i6++) {
            iB += A1.j.d(5, (AbstractC0070b) this.f1130k.get(i6));
        }
        int iC = 0;
        for (int i7 = 0; i7 < this.f1131l.size(); i7++) {
            iC += A1.j.c(((Integer) this.f1131l.get(i7)).intValue());
        }
        int iC2 = iB + iC;
        if (!this.f1131l.isEmpty()) {
            iC2 = iC2 + 1 + A1.j.c(iC);
        }
        this.f1132m = iC;
        int size = this.f1125e.size() + j() + iC2;
        this.f1133o = size;
        return size;
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k d() {
        return U.h();
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k e() {
        U uH = U.h();
        uH.i(this);
        return uH;
    }

    @Override // O3.AbstractC0070b
    public final void f(A1.j jVar) throws IOException {
        c();
        E0.d dVar = new E0.d((AbstractC0081m) this);
        if ((this.f & 1) == 1) {
            jVar.m(1, this.f1126g);
        }
        if ((this.f & 2) == 2) {
            jVar.m(2, this.f1127h);
        }
        if ((this.f & 4) == 4) {
            boolean z4 = this.f1128i;
            jVar.x(3, 0);
            jVar.q(z4 ? 1 : 0);
        }
        if ((this.f & 8) == 8) {
            jVar.l(4, this.f1129j.f1122d);
        }
        for (int i5 = 0; i5 < this.f1130k.size(); i5++) {
            jVar.o(5, (AbstractC0070b) this.f1130k.get(i5));
        }
        if (this.f1131l.size() > 0) {
            jVar.v(50);
            jVar.v(this.f1132m);
        }
        for (int i6 = 0; i6 < this.f1131l.size(); i6++) {
            jVar.n(((Integer) this.f1131l.get(i6)).intValue());
        }
        dVar.P0(1000, jVar);
        jVar.r(this.f1125e);
    }

    public W() {
        this.f1132m = -1;
        this.n = (byte) -1;
        this.f1133o = -1;
        this.f1125e = AbstractC0073e.f2065d;
    }

    public W(C0074f c0074f, C0077i c0077i) {
        V v2;
        this.f1132m = -1;
        this.n = (byte) -1;
        this.f1133o = -1;
        this.f1126g = 0;
        this.f1127h = 0;
        this.f1128i = false;
        V v4 = V.INV;
        this.f1129j = v4;
        this.f1130k = Collections.emptyList();
        this.f1131l = Collections.emptyList();
        C0072d c0072d = new C0072d();
        A1.j jVarJ = A1.j.j(c0072d, 1);
        boolean z4 = false;
        int i5 = 0;
        while (!z4) {
            try {
                try {
                    int iN = c0074f.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f |= 1;
                            this.f1126g = c0074f.k();
                        } else if (iN == 16) {
                            this.f |= 2;
                            this.f1127h = c0074f.k();
                        } else if (iN == 24) {
                            this.f |= 4;
                            this.f1128i = c0074f.l() != 0;
                        } else if (iN == 32) {
                            int iK = c0074f.k();
                            if (iK == 0) {
                                v2 = V.IN;
                            } else if (iK != 1) {
                                v2 = iK != 2 ? null : v4;
                            } else {
                                v2 = V.OUT;
                            }
                            if (v2 == null) {
                                jVarJ.v(iN);
                                jVarJ.v(iK);
                            } else {
                                this.f |= 8;
                                this.f1129j = v2;
                            }
                        } else if (iN == 42) {
                            if ((i5 & 16) != 16) {
                                this.f1130k = new ArrayList();
                                i5 |= 16;
                            }
                            this.f1130k.add(c0074f.g(Q.f1073x, c0077i));
                        } else if (iN == 48) {
                            if ((i5 & 32) != 32) {
                                this.f1131l = new ArrayList();
                                i5 |= 32;
                            }
                            this.f1131l.add(Integer.valueOf(c0074f.k()));
                        } else if (iN != 50) {
                            if (!n(c0074f, jVarJ, c0077i, iN)) {
                            }
                        } else {
                            int iD = c0074f.d(c0074f.k());
                            if ((i5 & 32) != 32 && c0074f.b() > 0) {
                                this.f1131l = new ArrayList();
                                i5 |= 32;
                            }
                            while (c0074f.b() > 0) {
                                this.f1131l.add(Integer.valueOf(c0074f.k()));
                            }
                            c0074f.c(iD);
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
                if ((i5 & 16) == 16) {
                    this.f1130k = Collections.unmodifiableList(this.f1130k);
                }
                if ((i5 & 32) == 32) {
                    this.f1131l = Collections.unmodifiableList(this.f1131l);
                }
                try {
                    jVarJ.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f1125e = c0072d.l();
                    throw th2;
                }
                this.f1125e = c0072d.l();
                m();
                throw th;
            }
        }
        if ((i5 & 16) == 16) {
            this.f1130k = Collections.unmodifiableList(this.f1130k);
        }
        if ((i5 & 32) == 32) {
            this.f1131l = Collections.unmodifiableList(this.f1131l);
        }
        try {
            jVarJ.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1125e = c0072d.l();
            throw th3;
        }
        this.f1125e = c0072d.l();
        m();
    }
}
