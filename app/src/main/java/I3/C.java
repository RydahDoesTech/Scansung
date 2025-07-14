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
public final class C extends AbstractC0081m {
    public static final C n;

    /* renamed from: o, reason: collision with root package name */
    public static final C0019a f962o = new C0019a(10);

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0073e f963e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public List f964g;

    /* renamed from: h, reason: collision with root package name */
    public List f965h;

    /* renamed from: i, reason: collision with root package name */
    public List f966i;

    /* renamed from: j, reason: collision with root package name */
    public X f967j;

    /* renamed from: k, reason: collision with root package name */
    public e0 f968k;

    /* renamed from: l, reason: collision with root package name */
    public byte f969l;

    /* renamed from: m, reason: collision with root package name */
    public int f970m;

    static {
        C c2 = new C();
        n = c2;
        c2.f964g = Collections.emptyList();
        c2.f965h = Collections.emptyList();
        c2.f966i = Collections.emptyList();
        c2.f967j = X.f1134j;
        c2.f968k = e0.f1228h;
    }

    public C(B b2) {
        super(b2);
        this.f969l = (byte) -1;
        this.f970m = -1;
        this.f963e = b2.f2081d;
    }

    @Override // O3.x
    public final AbstractC0070b a() {
        return n;
    }

    @Override // O3.x
    public final boolean b() {
        byte b2 = this.f969l;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i5 = 0; i5 < this.f964g.size(); i5++) {
            if (!((C0042y) this.f964g.get(i5)).b()) {
                this.f969l = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < this.f965h.size(); i6++) {
            if (!((G) this.f965h.get(i6)).b()) {
                this.f969l = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < this.f966i.size(); i7++) {
            if (!((T) this.f966i.get(i7)).b()) {
                this.f969l = (byte) 0;
                return false;
            }
        }
        if ((this.f & 1) == 1 && !this.f967j.b()) {
            this.f969l = (byte) 0;
            return false;
        }
        if (i()) {
            this.f969l = (byte) 1;
            return true;
        }
        this.f969l = (byte) 0;
        return false;
    }

    @Override // O3.AbstractC0070b
    public final int c() {
        int i5 = this.f970m;
        if (i5 != -1) {
            return i5;
        }
        int iD = 0;
        for (int i6 = 0; i6 < this.f964g.size(); i6++) {
            iD += A1.j.d(3, (AbstractC0070b) this.f964g.get(i6));
        }
        for (int i7 = 0; i7 < this.f965h.size(); i7++) {
            iD += A1.j.d(4, (AbstractC0070b) this.f965h.get(i7));
        }
        for (int i8 = 0; i8 < this.f966i.size(); i8++) {
            iD += A1.j.d(5, (AbstractC0070b) this.f966i.get(i8));
        }
        if ((this.f & 1) == 1) {
            iD += A1.j.d(30, this.f967j);
        }
        if ((this.f & 2) == 2) {
            iD += A1.j.d(32, this.f968k);
        }
        int size = this.f963e.size() + j() + iD;
        this.f970m = size;
        return size;
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k d() {
        return B.h();
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k e() {
        B bH = B.h();
        bH.i(this);
        return bH;
    }

    @Override // O3.AbstractC0070b
    public final void f(A1.j jVar) throws IOException {
        c();
        E0.d dVar = new E0.d((AbstractC0081m) this);
        for (int i5 = 0; i5 < this.f964g.size(); i5++) {
            jVar.o(3, (AbstractC0070b) this.f964g.get(i5));
        }
        for (int i6 = 0; i6 < this.f965h.size(); i6++) {
            jVar.o(4, (AbstractC0070b) this.f965h.get(i6));
        }
        for (int i7 = 0; i7 < this.f966i.size(); i7++) {
            jVar.o(5, (AbstractC0070b) this.f966i.get(i7));
        }
        if ((this.f & 1) == 1) {
            jVar.o(30, this.f967j);
        }
        if ((this.f & 2) == 2) {
            jVar.o(32, this.f968k);
        }
        dVar.P0(200, jVar);
        jVar.r(this.f963e);
    }

    public C() {
        this.f969l = (byte) -1;
        this.f970m = -1;
        this.f963e = AbstractC0073e.f2065d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public C(C0074f c0074f, C0077i c0077i) {
        this.f969l = (byte) -1;
        this.f970m = -1;
        this.f964g = Collections.emptyList();
        this.f965h = Collections.emptyList();
        this.f966i = Collections.emptyList();
        this.f967j = X.f1134j;
        this.f968k = e0.f1228h;
        C0072d c0072d = new C0072d();
        A1.j jVarJ = A1.j.j(c0072d, 1);
        boolean z4 = false;
        char c2 = 0;
        while (!z4) {
            try {
                try {
                    int iN = c0074f.n();
                    if (iN != 0) {
                        if (iN == 26) {
                            int i5 = (c2 == true ? 1 : 0) & 1;
                            c2 = c2;
                            if (i5 != 1) {
                                this.f964g = new ArrayList();
                                c2 = (c2 == true ? 1 : 0) | 1;
                            }
                            this.f964g.add(c0074f.g(C0042y.f1392y, c0077i));
                        } else if (iN == 34) {
                            int i6 = (c2 == true ? 1 : 0) & 2;
                            c2 = c2;
                            if (i6 != 2) {
                                this.f965h = new ArrayList();
                                c2 = (c2 == true ? 1 : 0) | 2;
                            }
                            this.f965h.add(c0074f.g(G.f999y, c0077i));
                        } else if (iN != 42) {
                            C0031m c0031m = null;
                            C0024f c0024fI = null;
                            if (iN == 242) {
                                if ((this.f & 1) == 1) {
                                    X x4 = this.f967j;
                                    x4.getClass();
                                    c0024fI = X.i(x4);
                                }
                                X x5 = (X) c0074f.g(X.f1135k, c0077i);
                                this.f967j = x5;
                                if (c0024fI != null) {
                                    c0024fI.l(x5);
                                    this.f967j = c0024fI.h();
                                }
                                this.f |= 1;
                            } else if (iN != 258) {
                                if (!n(c0074f, jVarJ, c0077i, iN)) {
                                }
                            } else {
                                if ((this.f & 2) == 2) {
                                    e0 e0Var = this.f968k;
                                    e0Var.getClass();
                                    c0031m = new C0031m(2);
                                    c0031m.f1320g = Collections.emptyList();
                                    c0031m.m(e0Var);
                                }
                                e0 e0Var2 = (e0) c0074f.g(e0.f1229i, c0077i);
                                this.f968k = e0Var2;
                                if (c0031m != null) {
                                    c0031m.m(e0Var2);
                                    this.f968k = c0031m.i();
                                }
                                this.f |= 2;
                            }
                        } else {
                            int i7 = (c2 == true ? 1 : 0) & 4;
                            c2 = c2;
                            if (i7 != 4) {
                                this.f966i = new ArrayList();
                                c2 = (c2 == true ? 1 : 0) | 4;
                            }
                            this.f966i.add(c0074f.g(T.f1100s, c0077i));
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
                if (((c2 == true ? 1 : 0) & 1) == 1) {
                    this.f964g = Collections.unmodifiableList(this.f964g);
                }
                if (((c2 == true ? 1 : 0) & 2) == 2) {
                    this.f965h = Collections.unmodifiableList(this.f965h);
                }
                if (((c2 == true ? 1 : 0) & 4) == 4) {
                    this.f966i = Collections.unmodifiableList(this.f966i);
                }
                try {
                    jVarJ.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f963e = c0072d.l();
                    throw th2;
                }
                this.f963e = c0072d.l();
                m();
                throw th;
            }
        }
        if (((c2 == true ? 1 : 0) & 1) == 1) {
            this.f964g = Collections.unmodifiableList(this.f964g);
        }
        if (((c2 == true ? 1 : 0) & 2) == 2) {
            this.f965h = Collections.unmodifiableList(this.f965h);
        }
        if (((c2 == true ? 1 : 0) & 4) == 4) {
            this.f966i = Collections.unmodifiableList(this.f966i);
        }
        try {
            jVarJ.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f963e = c0072d.l();
            throw th3;
        }
        this.f963e = c0072d.l();
        m();
    }
}
