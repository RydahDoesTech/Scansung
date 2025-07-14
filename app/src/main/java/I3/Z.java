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

/* loaded from: classes.dex */
public final class Z extends AbstractC0081m {

    /* renamed from: o, reason: collision with root package name */
    public static final Z f1148o;

    /* renamed from: p, reason: collision with root package name */
    public static final C0019a f1149p = new C0019a(21);

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0073e f1150e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f1151g;

    /* renamed from: h, reason: collision with root package name */
    public int f1152h;

    /* renamed from: i, reason: collision with root package name */
    public Q f1153i;

    /* renamed from: j, reason: collision with root package name */
    public int f1154j;

    /* renamed from: k, reason: collision with root package name */
    public Q f1155k;

    /* renamed from: l, reason: collision with root package name */
    public int f1156l;

    /* renamed from: m, reason: collision with root package name */
    public byte f1157m;
    public int n;

    static {
        Z z4 = new Z();
        f1148o = z4;
        z4.f1151g = 0;
        z4.f1152h = 0;
        Q q5 = Q.f1072w;
        z4.f1153i = q5;
        z4.f1154j = 0;
        z4.f1155k = q5;
        z4.f1156l = 0;
    }

    public Z(Y y4) {
        super(y4);
        this.f1157m = (byte) -1;
        this.n = -1;
        this.f1150e = y4.f2081d;
    }

    @Override // O3.x
    public final AbstractC0070b a() {
        return f1148o;
    }

    @Override // O3.x
    public final boolean b() {
        byte b2 = this.f1157m;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        int i5 = this.f;
        if ((i5 & 2) != 2) {
            this.f1157m = (byte) 0;
            return false;
        }
        if ((i5 & 4) == 4 && !this.f1153i.b()) {
            this.f1157m = (byte) 0;
            return false;
        }
        if ((this.f & 16) == 16 && !this.f1155k.b()) {
            this.f1157m = (byte) 0;
            return false;
        }
        if (i()) {
            this.f1157m = (byte) 1;
            return true;
        }
        this.f1157m = (byte) 0;
        return false;
    }

    @Override // O3.AbstractC0070b
    public final int c() {
        int i5 = this.n;
        if (i5 != -1) {
            return i5;
        }
        int iB = (this.f & 1) == 1 ? A1.j.b(1, this.f1151g) : 0;
        if ((this.f & 2) == 2) {
            iB += A1.j.b(2, this.f1152h);
        }
        if ((this.f & 4) == 4) {
            iB += A1.j.d(3, this.f1153i);
        }
        if ((this.f & 16) == 16) {
            iB += A1.j.d(4, this.f1155k);
        }
        if ((this.f & 8) == 8) {
            iB += A1.j.b(5, this.f1154j);
        }
        if ((this.f & 32) == 32) {
            iB += A1.j.b(6, this.f1156l);
        }
        int size = this.f1150e.size() + j() + iB;
        this.n = size;
        return size;
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k d() {
        Y y4 = new Y();
        Q q5 = Q.f1072w;
        y4.f1144j = q5;
        y4.f1146l = q5;
        return y4;
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k e() {
        Y y4 = new Y();
        Q q5 = Q.f1072w;
        y4.f1144j = q5;
        y4.f1146l = q5;
        y4.h(this);
        return y4;
    }

    @Override // O3.AbstractC0070b
    public final void f(A1.j jVar) throws IOException {
        c();
        E0.d dVar = new E0.d((AbstractC0081m) this);
        if ((this.f & 1) == 1) {
            jVar.m(1, this.f1151g);
        }
        if ((this.f & 2) == 2) {
            jVar.m(2, this.f1152h);
        }
        if ((this.f & 4) == 4) {
            jVar.o(3, this.f1153i);
        }
        if ((this.f & 16) == 16) {
            jVar.o(4, this.f1155k);
        }
        if ((this.f & 8) == 8) {
            jVar.m(5, this.f1154j);
        }
        if ((this.f & 32) == 32) {
            jVar.m(6, this.f1156l);
        }
        dVar.P0(200, jVar);
        jVar.r(this.f1150e);
    }

    public Z() {
        this.f1157m = (byte) -1;
        this.n = -1;
        this.f1150e = AbstractC0073e.f2065d;
    }

    public Z(C0074f c0074f, C0077i c0077i) {
        this.f1157m = (byte) -1;
        this.n = -1;
        boolean z4 = false;
        this.f1151g = 0;
        this.f1152h = 0;
        Q q5 = Q.f1072w;
        this.f1153i = q5;
        this.f1154j = 0;
        this.f1155k = q5;
        this.f1156l = 0;
        C0072d c0072d = new C0072d();
        A1.j jVarJ = A1.j.j(c0072d, 1);
        while (!z4) {
            try {
                try {
                    int iN = c0074f.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f |= 1;
                            this.f1151g = c0074f.k();
                        } else if (iN != 16) {
                            P pR = null;
                            if (iN == 26) {
                                if ((this.f & 4) == 4) {
                                    Q q6 = this.f1153i;
                                    q6.getClass();
                                    pR = Q.r(q6);
                                }
                                Q q7 = (Q) c0074f.g(Q.f1073x, c0077i);
                                this.f1153i = q7;
                                if (pR != null) {
                                    pR.i(q7);
                                    this.f1153i = pR.g();
                                }
                                this.f |= 4;
                            } else if (iN == 34) {
                                if ((this.f & 16) == 16) {
                                    Q q8 = this.f1155k;
                                    q8.getClass();
                                    pR = Q.r(q8);
                                }
                                Q q9 = (Q) c0074f.g(Q.f1073x, c0077i);
                                this.f1155k = q9;
                                if (pR != null) {
                                    pR.i(q9);
                                    this.f1155k = pR.g();
                                }
                                this.f |= 16;
                            } else if (iN == 40) {
                                this.f |= 8;
                                this.f1154j = c0074f.k();
                            } else if (iN != 48) {
                                if (!n(c0074f, jVarJ, c0077i, iN)) {
                                }
                            } else {
                                this.f |= 32;
                                this.f1156l = c0074f.k();
                            }
                        } else {
                            this.f |= 2;
                            this.f1152h = c0074f.k();
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
                try {
                    jVarJ.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f1150e = c0072d.l();
                    throw th2;
                }
                this.f1150e = c0072d.l();
                m();
                throw th;
            }
        }
        try {
            jVarJ.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1150e = c0072d.l();
            throw th3;
        }
        this.f1150e = c0072d.l();
        m();
    }
}
