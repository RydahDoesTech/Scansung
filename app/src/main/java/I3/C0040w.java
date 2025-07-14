package I3;

import O3.AbstractC0070b;
import O3.AbstractC0073e;
import O3.AbstractC0079k;
import O3.AbstractC0084p;
import O3.C0072d;
import O3.C0074f;
import O3.C0077i;
import O3.C0086s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: I3.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0040w extends AbstractC0084p {

    /* renamed from: o, reason: collision with root package name */
    public static final C0040w f1366o;

    /* renamed from: p, reason: collision with root package name */
    public static final C0019a f1367p = new C0019a(8);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0073e f1368d;

    /* renamed from: e, reason: collision with root package name */
    public int f1369e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f1370g;

    /* renamed from: h, reason: collision with root package name */
    public EnumC0039v f1371h;

    /* renamed from: i, reason: collision with root package name */
    public Q f1372i;

    /* renamed from: j, reason: collision with root package name */
    public int f1373j;

    /* renamed from: k, reason: collision with root package name */
    public List f1374k;

    /* renamed from: l, reason: collision with root package name */
    public List f1375l;

    /* renamed from: m, reason: collision with root package name */
    public byte f1376m;
    public int n;

    static {
        C0040w c0040w = new C0040w();
        f1366o = c0040w;
        c0040w.f = 0;
        c0040w.f1370g = 0;
        c0040w.f1371h = EnumC0039v.TRUE;
        c0040w.f1372i = Q.f1072w;
        c0040w.f1373j = 0;
        c0040w.f1374k = Collections.emptyList();
        c0040w.f1375l = Collections.emptyList();
    }

    public C0040w() {
        this.f1376m = (byte) -1;
        this.n = -1;
        this.f1368d = AbstractC0073e.f2065d;
    }

    @Override // O3.x
    public final boolean b() {
        byte b2 = this.f1376m;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if ((this.f1369e & 8) == 8 && !this.f1372i.b()) {
            this.f1376m = (byte) 0;
            return false;
        }
        for (int i5 = 0; i5 < this.f1374k.size(); i5++) {
            if (!((C0040w) this.f1374k.get(i5)).b()) {
                this.f1376m = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < this.f1375l.size(); i6++) {
            if (!((C0040w) this.f1375l.get(i6)).b()) {
                this.f1376m = (byte) 0;
                return false;
            }
        }
        this.f1376m = (byte) 1;
        return true;
    }

    @Override // O3.AbstractC0070b
    public final int c() {
        int i5 = this.n;
        if (i5 != -1) {
            return i5;
        }
        int iB = (this.f1369e & 1) == 1 ? A1.j.b(1, this.f) : 0;
        if ((this.f1369e & 2) == 2) {
            iB += A1.j.b(2, this.f1370g);
        }
        if ((this.f1369e & 4) == 4) {
            iB += A1.j.a(3, this.f1371h.f1365d);
        }
        if ((this.f1369e & 8) == 8) {
            iB += A1.j.d(4, this.f1372i);
        }
        if ((this.f1369e & 16) == 16) {
            iB += A1.j.b(5, this.f1373j);
        }
        for (int i6 = 0; i6 < this.f1374k.size(); i6++) {
            iB += A1.j.d(6, (AbstractC0070b) this.f1374k.get(i6));
        }
        for (int i7 = 0; i7 < this.f1375l.size(); i7++) {
            iB += A1.j.d(7, (AbstractC0070b) this.f1375l.get(i7));
        }
        int size = this.f1368d.size() + iB;
        this.n = size;
        return size;
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k d() {
        return C0038u.g();
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k e() {
        C0038u c0038uG = C0038u.g();
        c0038uG.h(this);
        return c0038uG;
    }

    @Override // O3.AbstractC0070b
    public final void f(A1.j jVar) throws IOException {
        c();
        if ((this.f1369e & 1) == 1) {
            jVar.m(1, this.f);
        }
        if ((this.f1369e & 2) == 2) {
            jVar.m(2, this.f1370g);
        }
        if ((this.f1369e & 4) == 4) {
            jVar.l(3, this.f1371h.f1365d);
        }
        if ((this.f1369e & 8) == 8) {
            jVar.o(4, this.f1372i);
        }
        if ((this.f1369e & 16) == 16) {
            jVar.m(5, this.f1373j);
        }
        for (int i5 = 0; i5 < this.f1374k.size(); i5++) {
            jVar.o(6, (AbstractC0070b) this.f1374k.get(i5));
        }
        for (int i6 = 0; i6 < this.f1375l.size(); i6++) {
            jVar.o(7, (AbstractC0070b) this.f1375l.get(i6));
        }
        jVar.r(this.f1368d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public C0040w(C0074f c0074f, C0077i c0077i) {
        EnumC0039v enumC0039v;
        this.f1376m = (byte) -1;
        this.n = -1;
        boolean z4 = false;
        this.f = 0;
        this.f1370g = 0;
        EnumC0039v enumC0039v2 = EnumC0039v.TRUE;
        this.f1371h = enumC0039v2;
        this.f1372i = Q.f1072w;
        this.f1373j = 0;
        this.f1374k = Collections.emptyList();
        this.f1375l = Collections.emptyList();
        C0072d c0072d = new C0072d();
        A1.j jVarJ = A1.j.j(c0072d, 1);
        char c2 = 0;
        while (!z4) {
            try {
                try {
                    int iN = c0074f.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f1369e |= 1;
                            this.f = c0074f.k();
                        } else if (iN != 16) {
                            P pR = null;
                            EnumC0039v enumC0039v3 = null;
                            if (iN == 24) {
                                int iK = c0074f.k();
                                if (iK != 0) {
                                    if (iK == 1) {
                                        enumC0039v3 = EnumC0039v.FALSE;
                                    } else if (iK == 2) {
                                        enumC0039v3 = EnumC0039v.NULL;
                                    }
                                    enumC0039v = enumC0039v3;
                                } else {
                                    enumC0039v = enumC0039v2;
                                }
                                if (enumC0039v == null) {
                                    jVarJ.v(iN);
                                    jVarJ.v(iK);
                                } else {
                                    this.f1369e |= 4;
                                    this.f1371h = enumC0039v;
                                }
                            } else if (iN == 34) {
                                if ((this.f1369e & 8) == 8) {
                                    Q q5 = this.f1372i;
                                    q5.getClass();
                                    pR = Q.r(q5);
                                }
                                P p2 = pR;
                                Q q6 = (Q) c0074f.g(Q.f1073x, c0077i);
                                this.f1372i = q6;
                                if (p2 != null) {
                                    p2.i(q6);
                                    this.f1372i = p2.g();
                                }
                                this.f1369e |= 8;
                            } else if (iN != 40) {
                                C0019a c0019a = f1367p;
                                if (iN == 50) {
                                    int i5 = (c2 == true ? 1 : 0) & 32;
                                    c2 = c2;
                                    if (i5 != 32) {
                                        this.f1374k = new ArrayList();
                                        c2 = (c2 == true ? 1 : 0) | ' ';
                                    }
                                    this.f1374k.add(c0074f.g(c0019a, c0077i));
                                } else if (iN != 58) {
                                    if (!c0074f.q(iN, jVarJ)) {
                                    }
                                } else {
                                    int i6 = (c2 == true ? 1 : 0) & 64;
                                    c2 = c2;
                                    if (i6 != 64) {
                                        this.f1375l = new ArrayList();
                                        c2 = (c2 == true ? 1 : 0) | '@';
                                    }
                                    this.f1375l.add(c0074f.g(c0019a, c0077i));
                                }
                            } else {
                                this.f1369e |= 16;
                                this.f1373j = c0074f.k();
                            }
                        } else {
                            this.f1369e |= 2;
                            this.f1370g = c0074f.k();
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
                if (((c2 == true ? 1 : 0) & 32) == 32) {
                    this.f1374k = Collections.unmodifiableList(this.f1374k);
                }
                if (((c2 == true ? 1 : 0) & 64) == 64) {
                    this.f1375l = Collections.unmodifiableList(this.f1375l);
                }
                try {
                    jVarJ.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f1368d = c0072d.l();
                    throw th2;
                }
                this.f1368d = c0072d.l();
                throw th;
            }
        }
        if (((c2 == true ? 1 : 0) & 32) == 32) {
            this.f1374k = Collections.unmodifiableList(this.f1374k);
        }
        if (((c2 == true ? 1 : 0) & 64) == 64) {
            this.f1375l = Collections.unmodifiableList(this.f1375l);
        }
        try {
            jVarJ.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1368d = c0072d.l();
            throw th3;
        }
        this.f1368d = c0072d.l();
    }

    public C0040w(C0038u c0038u) {
        this.f1376m = (byte) -1;
        this.n = -1;
        this.f1368d = c0038u.f2081d;
    }
}
