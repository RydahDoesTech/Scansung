package I3;

import O3.AbstractC0073e;
import O3.AbstractC0079k;
import O3.AbstractC0084p;
import O3.C0072d;
import O3.C0074f;
import O3.C0086s;
import java.io.IOException;

/* loaded from: classes.dex */
public final class L extends AbstractC0084p {

    /* renamed from: h, reason: collision with root package name */
    public static final L f1037h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0019a f1038i = new C0019a(15);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0073e f1039d;

    /* renamed from: e, reason: collision with root package name */
    public O3.u f1040e;
    public byte f;

    /* renamed from: g, reason: collision with root package name */
    public int f1041g;

    static {
        L l4 = new L();
        f1037h = l4;
        l4.f1040e = O3.t.f2093e;
    }

    public L() {
        this.f = (byte) -1;
        this.f1041g = -1;
        this.f1039d = AbstractC0073e.f2065d;
    }

    @Override // O3.x
    public final boolean b() {
        byte b2 = this.f;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        this.f = (byte) 1;
        return true;
    }

    @Override // O3.AbstractC0070b
    public final int c() {
        int i5 = this.f1041g;
        if (i5 != -1) {
            return i5;
        }
        int size = 0;
        for (int i6 = 0; i6 < this.f1040e.size(); i6++) {
            AbstractC0073e abstractC0073eJ = this.f1040e.j(i6);
            size += abstractC0073eJ.size() + A1.j.f(abstractC0073eJ.size());
        }
        int size2 = this.f1039d.size() + this.f1040e.size() + size;
        this.f1041g = size2;
        return size2;
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k d() {
        C0031m c0031m = new C0031m(3);
        c0031m.f1320g = O3.t.f2093e;
        return c0031m;
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k e() {
        C0031m c0031m = new C0031m(3);
        c0031m.f1320g = O3.t.f2093e;
        c0031m.l(this);
        return c0031m;
    }

    @Override // O3.AbstractC0070b
    public final void f(A1.j jVar) throws IOException {
        c();
        for (int i5 = 0; i5 < this.f1040e.size(); i5++) {
            AbstractC0073e abstractC0073eJ = this.f1040e.j(i5);
            jVar.x(1, 2);
            jVar.v(abstractC0073eJ.size());
            jVar.r(abstractC0073eJ);
        }
        jVar.r(this.f1039d);
    }

    public L(C0074f c0074f) {
        this.f = (byte) -1;
        this.f1041g = -1;
        this.f1040e = O3.t.f2093e;
        C0072d c0072d = new C0072d();
        A1.j jVarJ = A1.j.j(c0072d, 1);
        boolean z4 = false;
        boolean z5 = false;
        while (!z4) {
            try {
                try {
                    int iN = c0074f.n();
                    if (iN != 0) {
                        if (iN != 10) {
                            if (!c0074f.q(iN, jVarJ)) {
                            }
                        } else {
                            O3.w wVarE = c0074f.e();
                            if (!z5) {
                                this.f1040e = new O3.t();
                                z5 = true;
                            }
                            this.f1040e.c(wVarE);
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
                if (z5) {
                    this.f1040e = this.f1040e.b();
                }
                try {
                    jVarJ.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f1039d = c0072d.l();
                    throw th2;
                }
                this.f1039d = c0072d.l();
                throw th;
            }
        }
        if (z5) {
            this.f1040e = this.f1040e.b();
        }
        try {
            jVarJ.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1039d = c0072d.l();
            throw th3;
        }
        this.f1039d = c0072d.l();
    }

    public L(C0031m c0031m) {
        this.f = (byte) -1;
        this.f1041g = -1;
        this.f1039d = c0031m.f2081d;
    }
}
