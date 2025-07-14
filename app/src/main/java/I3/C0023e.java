package I3;

import O3.AbstractC0073e;
import O3.AbstractC0079k;
import O3.AbstractC0084p;
import O3.C0072d;
import O3.C0074f;
import O3.C0077i;
import O3.C0086s;
import java.io.IOException;

/* renamed from: I3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0023e extends AbstractC0084p {

    /* renamed from: j, reason: collision with root package name */
    public static final C0023e f1221j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0019a f1222k = new C0019a(1);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0073e f1223d;

    /* renamed from: e, reason: collision with root package name */
    public int f1224e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public C0022d f1225g;

    /* renamed from: h, reason: collision with root package name */
    public byte f1226h;

    /* renamed from: i, reason: collision with root package name */
    public int f1227i;

    static {
        C0023e c0023e = new C0023e();
        f1221j = c0023e;
        c0023e.f = 0;
        c0023e.f1225g = C0022d.f1196s;
    }

    public C0023e() {
        this.f1226h = (byte) -1;
        this.f1227i = -1;
        this.f1223d = AbstractC0073e.f2065d;
    }

    @Override // O3.x
    public final boolean b() {
        byte b2 = this.f1226h;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        int i5 = this.f1224e;
        if ((i5 & 1) != 1) {
            this.f1226h = (byte) 0;
            return false;
        }
        if ((i5 & 2) != 2) {
            this.f1226h = (byte) 0;
            return false;
        }
        if (this.f1225g.b()) {
            this.f1226h = (byte) 1;
            return true;
        }
        this.f1226h = (byte) 0;
        return false;
    }

    @Override // O3.AbstractC0070b
    public final int c() {
        int i5 = this.f1227i;
        if (i5 != -1) {
            return i5;
        }
        int iB = (this.f1224e & 1) == 1 ? A1.j.b(1, this.f) : 0;
        if ((this.f1224e & 2) == 2) {
            iB += A1.j.d(2, this.f1225g);
        }
        int size = this.f1223d.size() + iB;
        this.f1227i = size;
        return size;
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k d() {
        C0024f c0024f = new C0024f(2);
        c0024f.f1234g = C0022d.f1196s;
        return c0024f;
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k e() {
        C0024f c0024f = new C0024f(2);
        c0024f.f1234g = C0022d.f1196s;
        c0024f.j(this);
        return c0024f;
    }

    @Override // O3.AbstractC0070b
    public final void f(A1.j jVar) throws IOException {
        c();
        if ((this.f1224e & 1) == 1) {
            jVar.m(1, this.f);
        }
        if ((this.f1224e & 2) == 2) {
            jVar.o(2, this.f1225g);
        }
        jVar.r(this.f1223d);
    }

    public C0023e(C0074f c0074f, C0077i c0077i) {
        C0020b c0020bG;
        this.f1226h = (byte) -1;
        this.f1227i = -1;
        boolean z4 = false;
        this.f = 0;
        this.f1225g = C0022d.f1196s;
        C0072d c0072d = new C0072d();
        A1.j jVarJ = A1.j.j(c0072d, 1);
        while (!z4) {
            try {
                try {
                    int iN = c0074f.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f1224e |= 1;
                            this.f = c0074f.k();
                        } else if (iN != 18) {
                            if (!c0074f.q(iN, jVarJ)) {
                            }
                        } else {
                            if ((this.f1224e & 2) == 2) {
                                C0022d c0022d = this.f1225g;
                                c0022d.getClass();
                                c0020bG = C0020b.g();
                                c0020bG.h(c0022d);
                            } else {
                                c0020bG = null;
                            }
                            C0022d c0022d2 = (C0022d) c0074f.g(C0022d.f1197t, c0077i);
                            this.f1225g = c0022d2;
                            if (c0020bG != null) {
                                c0020bG.h(c0022d2);
                                this.f1225g = c0020bG.f();
                            }
                            this.f1224e |= 2;
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
                    this.f1223d = c0072d.l();
                    throw th2;
                }
                this.f1223d = c0072d.l();
                throw th;
            }
        }
        try {
            jVarJ.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1223d = c0072d.l();
            throw th3;
        }
        this.f1223d = c0072d.l();
    }

    public C0023e(C0024f c0024f) {
        this.f1226h = (byte) -1;
        this.f1227i = -1;
        this.f1223d = c0024f.f2081d;
    }
}
