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

/* renamed from: I3.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0037t extends AbstractC0081m {

    /* renamed from: j, reason: collision with root package name */
    public static final C0037t f1349j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0019a f1350k = new C0019a(7);

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0073e f1351e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f1352g;

    /* renamed from: h, reason: collision with root package name */
    public byte f1353h;

    /* renamed from: i, reason: collision with root package name */
    public int f1354i;

    static {
        C0037t c0037t = new C0037t();
        f1349j = c0037t;
        c0037t.f1352g = 0;
    }

    public C0037t(C0036s c0036s) {
        super(c0036s);
        this.f1353h = (byte) -1;
        this.f1354i = -1;
        this.f1351e = c0036s.f2081d;
    }

    @Override // O3.x
    public final AbstractC0070b a() {
        return f1349j;
    }

    @Override // O3.x
    public final boolean b() {
        byte b2 = this.f1353h;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (i()) {
            this.f1353h = (byte) 1;
            return true;
        }
        this.f1353h = (byte) 0;
        return false;
    }

    @Override // O3.AbstractC0070b
    public final int c() {
        int i5 = this.f1354i;
        if (i5 != -1) {
            return i5;
        }
        int size = this.f1351e.size() + j() + ((this.f & 1) == 1 ? A1.j.b(1, this.f1352g) : 0);
        this.f1354i = size;
        return size;
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k d() {
        return new C0036s();
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k e() {
        C0036s c0036s = new C0036s();
        c0036s.g(this);
        return c0036s;
    }

    @Override // O3.AbstractC0070b
    public final void f(A1.j jVar) throws IOException {
        c();
        E0.d dVar = new E0.d((AbstractC0081m) this);
        if ((this.f & 1) == 1) {
            jVar.m(1, this.f1352g);
        }
        dVar.P0(200, jVar);
        jVar.r(this.f1351e);
    }

    public C0037t() {
        this.f1353h = (byte) -1;
        this.f1354i = -1;
        this.f1351e = AbstractC0073e.f2065d;
    }

    public C0037t(C0074f c0074f, C0077i c0077i) {
        this.f1353h = (byte) -1;
        this.f1354i = -1;
        boolean z4 = false;
        this.f1352g = 0;
        C0072d c0072d = new C0072d();
        A1.j jVarJ = A1.j.j(c0072d, 1);
        while (!z4) {
            try {
                try {
                    int iN = c0074f.n();
                    if (iN != 0) {
                        if (iN != 8) {
                            if (!n(c0074f, jVarJ, c0077i, iN)) {
                            }
                        } else {
                            this.f |= 1;
                            this.f1352g = c0074f.k();
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
                    this.f1351e = c0072d.l();
                    throw th2;
                }
                this.f1351e = c0072d.l();
                m();
                throw th;
            }
        }
        try {
            jVarJ.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1351e = c0072d.l();
            throw th3;
        }
        this.f1351e = c0072d.l();
        m();
    }
}
