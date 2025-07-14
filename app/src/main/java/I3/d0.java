package I3;

import O3.AbstractC0073e;
import O3.AbstractC0079k;
import O3.AbstractC0084p;
import O3.C0072d;
import O3.C0074f;
import O3.C0086s;
import java.io.IOException;

/* loaded from: classes.dex */
public final class d0 extends AbstractC0084p {
    public static final d0 n;

    /* renamed from: o, reason: collision with root package name */
    public static final C0019a f1211o = new C0019a(22);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0073e f1212d;

    /* renamed from: e, reason: collision with root package name */
    public int f1213e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f1214g;

    /* renamed from: h, reason: collision with root package name */
    public b0 f1215h;

    /* renamed from: i, reason: collision with root package name */
    public int f1216i;

    /* renamed from: j, reason: collision with root package name */
    public int f1217j;

    /* renamed from: k, reason: collision with root package name */
    public c0 f1218k;

    /* renamed from: l, reason: collision with root package name */
    public byte f1219l;

    /* renamed from: m, reason: collision with root package name */
    public int f1220m;

    static {
        d0 d0Var = new d0();
        n = d0Var;
        d0Var.f = 0;
        d0Var.f1214g = 0;
        d0Var.f1215h = b0.ERROR;
        d0Var.f1216i = 0;
        d0Var.f1217j = 0;
        d0Var.f1218k = c0.LANGUAGE_VERSION;
    }

    public d0() {
        this.f1219l = (byte) -1;
        this.f1220m = -1;
        this.f1212d = AbstractC0073e.f2065d;
    }

    @Override // O3.x
    public final boolean b() {
        byte b2 = this.f1219l;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        this.f1219l = (byte) 1;
        return true;
    }

    @Override // O3.AbstractC0070b
    public final int c() {
        int i5 = this.f1220m;
        if (i5 != -1) {
            return i5;
        }
        int iB = (this.f1213e & 1) == 1 ? A1.j.b(1, this.f) : 0;
        if ((this.f1213e & 2) == 2) {
            iB += A1.j.b(2, this.f1214g);
        }
        if ((this.f1213e & 4) == 4) {
            iB += A1.j.a(3, this.f1215h.f1178d);
        }
        if ((this.f1213e & 8) == 8) {
            iB += A1.j.b(4, this.f1216i);
        }
        if ((this.f1213e & 16) == 16) {
            iB += A1.j.b(5, this.f1217j);
        }
        if ((this.f1213e & 32) == 32) {
            iB += A1.j.a(6, this.f1218k.f1195d);
        }
        int size = this.f1212d.size() + iB;
        this.f1220m = size;
        return size;
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k d() {
        return a0.g();
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k e() {
        a0 a0VarG = a0.g();
        a0VarG.h(this);
        return a0VarG;
    }

    @Override // O3.AbstractC0070b
    public final void f(A1.j jVar) throws IOException {
        c();
        if ((this.f1213e & 1) == 1) {
            jVar.m(1, this.f);
        }
        if ((this.f1213e & 2) == 2) {
            jVar.m(2, this.f1214g);
        }
        if ((this.f1213e & 4) == 4) {
            jVar.l(3, this.f1215h.f1178d);
        }
        if ((this.f1213e & 8) == 8) {
            jVar.m(4, this.f1216i);
        }
        if ((this.f1213e & 16) == 16) {
            jVar.m(5, this.f1217j);
        }
        if ((this.f1213e & 32) == 32) {
            jVar.l(6, this.f1218k.f1195d);
        }
        jVar.r(this.f1212d);
    }

    public d0(C0074f c0074f) {
        this.f1219l = (byte) -1;
        this.f1220m = -1;
        boolean z4 = false;
        this.f = 0;
        this.f1214g = 0;
        b0 b0Var = b0.ERROR;
        this.f1215h = b0Var;
        this.f1216i = 0;
        this.f1217j = 0;
        c0 c0Var = c0.LANGUAGE_VERSION;
        this.f1218k = c0Var;
        C0072d c0072d = new C0072d();
        A1.j jVarJ = A1.j.j(c0072d, 1);
        while (!z4) {
            try {
                try {
                    int iN = c0074f.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f1213e |= 1;
                            this.f = c0074f.k();
                        } else if (iN != 16) {
                            c0 c0Var2 = null;
                            b0 b0Var2 = null;
                            if (iN == 24) {
                                int iK = c0074f.k();
                                if (iK == 0) {
                                    b0Var2 = b0.WARNING;
                                } else if (iK == 1) {
                                    b0Var2 = b0Var;
                                } else if (iK == 2) {
                                    b0Var2 = b0.HIDDEN;
                                }
                                if (b0Var2 == null) {
                                    jVarJ.v(iN);
                                    jVarJ.v(iK);
                                } else {
                                    this.f1213e |= 4;
                                    this.f1215h = b0Var2;
                                }
                            } else if (iN == 32) {
                                this.f1213e |= 8;
                                this.f1216i = c0074f.k();
                            } else if (iN == 40) {
                                this.f1213e |= 16;
                                this.f1217j = c0074f.k();
                            } else if (iN != 48) {
                                if (!c0074f.q(iN, jVarJ)) {
                                }
                            } else {
                                int iK2 = c0074f.k();
                                if (iK2 == 0) {
                                    c0Var2 = c0Var;
                                } else if (iK2 == 1) {
                                    c0Var2 = c0.COMPILER_VERSION;
                                } else if (iK2 == 2) {
                                    c0Var2 = c0.API_VERSION;
                                }
                                if (c0Var2 == null) {
                                    jVarJ.v(iN);
                                    jVarJ.v(iK2);
                                } else {
                                    this.f1213e |= 32;
                                    this.f1218k = c0Var2;
                                }
                            }
                        } else {
                            this.f1213e |= 2;
                            this.f1214g = c0074f.k();
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
                    this.f1212d = c0072d.l();
                    throw th2;
                }
                this.f1212d = c0072d.l();
                throw th;
            }
        }
        try {
            jVarJ.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1212d = c0072d.l();
            throw th3;
        }
        this.f1212d = c0072d.l();
    }

    public d0(a0 a0Var) {
        this.f1219l = (byte) -1;
        this.f1220m = -1;
        this.f1212d = a0Var.f2081d;
    }
}
