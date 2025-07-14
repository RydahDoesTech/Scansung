package I3;

import O3.AbstractC0073e;
import O3.AbstractC0079k;
import O3.AbstractC0084p;
import O3.C0072d;
import O3.C0074f;
import O3.C0077i;
import O3.C0086s;
import java.io.IOException;

/* loaded from: classes.dex */
public final class O extends AbstractC0084p {

    /* renamed from: k, reason: collision with root package name */
    public static final O f1050k;

    /* renamed from: l, reason: collision with root package name */
    public static final C0019a f1051l = new C0019a(17);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0073e f1052d;

    /* renamed from: e, reason: collision with root package name */
    public int f1053e;
    public N f;

    /* renamed from: g, reason: collision with root package name */
    public Q f1054g;

    /* renamed from: h, reason: collision with root package name */
    public int f1055h;

    /* renamed from: i, reason: collision with root package name */
    public byte f1056i;

    /* renamed from: j, reason: collision with root package name */
    public int f1057j;

    static {
        O o5 = new O();
        f1050k = o5;
        o5.f = N.INV;
        o5.f1054g = Q.f1072w;
        o5.f1055h = 0;
    }

    public O() {
        this.f1056i = (byte) -1;
        this.f1057j = -1;
        this.f1052d = AbstractC0073e.f2065d;
    }

    @Override // O3.x
    public final boolean b() {
        byte b2 = this.f1056i;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if ((this.f1053e & 2) != 2 || this.f1054g.b()) {
            this.f1056i = (byte) 1;
            return true;
        }
        this.f1056i = (byte) 0;
        return false;
    }

    @Override // O3.AbstractC0070b
    public final int c() {
        int i5 = this.f1057j;
        if (i5 != -1) {
            return i5;
        }
        int iA = (this.f1053e & 1) == 1 ? A1.j.a(1, this.f.f1049d) : 0;
        if ((this.f1053e & 2) == 2) {
            iA += A1.j.d(2, this.f1054g);
        }
        if ((this.f1053e & 4) == 4) {
            iA += A1.j.b(3, this.f1055h);
        }
        int size = this.f1052d.size() + iA;
        this.f1057j = size;
        return size;
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k d() {
        return M.g();
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k e() {
        M mG = M.g();
        mG.h(this);
        return mG;
    }

    @Override // O3.AbstractC0070b
    public final void f(A1.j jVar) throws IOException {
        c();
        if ((this.f1053e & 1) == 1) {
            jVar.l(1, this.f.f1049d);
        }
        if ((this.f1053e & 2) == 2) {
            jVar.o(2, this.f1054g);
        }
        if ((this.f1053e & 4) == 4) {
            jVar.m(3, this.f1055h);
        }
        jVar.r(this.f1052d);
    }

    public O(C0074f c0074f, C0077i c0077i) {
        this.f1056i = (byte) -1;
        this.f1057j = -1;
        N n = N.INV;
        this.f = n;
        this.f1054g = Q.f1072w;
        boolean z4 = false;
        this.f1055h = 0;
        C0072d c0072d = new C0072d();
        A1.j jVarJ = A1.j.j(c0072d, 1);
        while (!z4) {
            try {
                try {
                    int iN = c0074f.n();
                    if (iN != 0) {
                        P pR = null;
                        N n2 = null;
                        if (iN == 8) {
                            int iK = c0074f.k();
                            if (iK == 0) {
                                n2 = N.IN;
                            } else if (iK == 1) {
                                n2 = N.OUT;
                            } else if (iK == 2) {
                                n2 = n;
                            } else if (iK == 3) {
                                n2 = N.STAR;
                            }
                            if (n2 == null) {
                                jVarJ.v(iN);
                                jVarJ.v(iK);
                            } else {
                                this.f1053e |= 1;
                                this.f = n2;
                            }
                        } else if (iN == 18) {
                            if ((this.f1053e & 2) == 2) {
                                Q q5 = this.f1054g;
                                q5.getClass();
                                pR = Q.r(q5);
                            }
                            Q q6 = (Q) c0074f.g(Q.f1073x, c0077i);
                            this.f1054g = q6;
                            if (pR != null) {
                                pR.i(q6);
                                this.f1054g = pR.g();
                            }
                            this.f1053e |= 2;
                        } else if (iN != 24) {
                            if (!c0074f.q(iN, jVarJ)) {
                            }
                        } else {
                            this.f1053e |= 4;
                            this.f1055h = c0074f.k();
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
                    this.f1052d = c0072d.l();
                    throw th2;
                }
                this.f1052d = c0072d.l();
                throw th;
            }
        }
        try {
            jVarJ.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1052d = c0072d.l();
            throw th3;
        }
        this.f1052d = c0072d.l();
    }

    public O(M m4) {
        this.f1056i = (byte) -1;
        this.f1057j = -1;
        this.f1052d = m4.f2081d;
    }
}
