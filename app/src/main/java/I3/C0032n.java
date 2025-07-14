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

/* renamed from: I3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0032n extends AbstractC0084p {

    /* renamed from: h, reason: collision with root package name */
    public static final C0032n f1321h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0019a f1322i = new C0019a(5);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0073e f1323d;

    /* renamed from: e, reason: collision with root package name */
    public List f1324e;
    public byte f;

    /* renamed from: g, reason: collision with root package name */
    public int f1325g;

    static {
        C0032n c0032n = new C0032n();
        f1321h = c0032n;
        c0032n.f1324e = Collections.emptyList();
    }

    public C0032n() {
        this.f = (byte) -1;
        this.f1325g = -1;
        this.f1323d = AbstractC0073e.f2065d;
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
        for (int i5 = 0; i5 < this.f1324e.size(); i5++) {
            if (!((r) this.f1324e.get(i5)).b()) {
                this.f = (byte) 0;
                return false;
            }
        }
        this.f = (byte) 1;
        return true;
    }

    @Override // O3.AbstractC0070b
    public final int c() {
        int i5 = this.f1325g;
        if (i5 != -1) {
            return i5;
        }
        int iD = 0;
        for (int i6 = 0; i6 < this.f1324e.size(); i6++) {
            iD += A1.j.d(1, (AbstractC0070b) this.f1324e.get(i6));
        }
        int size = this.f1323d.size() + iD;
        this.f1325g = size;
        return size;
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k d() {
        C0031m c0031m = new C0031m(0);
        c0031m.f1320g = Collections.emptyList();
        return c0031m;
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k e() {
        C0031m c0031m = new C0031m(0);
        c0031m.f1320g = Collections.emptyList();
        c0031m.j(this);
        return c0031m;
    }

    @Override // O3.AbstractC0070b
    public final void f(A1.j jVar) throws IOException {
        c();
        for (int i5 = 0; i5 < this.f1324e.size(); i5++) {
            jVar.o(1, (AbstractC0070b) this.f1324e.get(i5));
        }
        jVar.r(this.f1323d);
    }

    public C0032n(C0074f c0074f, C0077i c0077i) {
        this.f = (byte) -1;
        this.f1325g = -1;
        this.f1324e = Collections.emptyList();
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
                            if (!z5) {
                                this.f1324e = new ArrayList();
                                z5 = true;
                            }
                            this.f1324e.add(c0074f.g(r.f1339m, c0077i));
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
                    this.f1324e = Collections.unmodifiableList(this.f1324e);
                }
                try {
                    jVarJ.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f1323d = c0072d.l();
                    throw th2;
                }
                this.f1323d = c0072d.l();
                throw th;
            }
        }
        if (z5) {
            this.f1324e = Collections.unmodifiableList(this.f1324e);
        }
        try {
            jVarJ.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1323d = c0072d.l();
            throw th3;
        }
        this.f1323d = c0072d.l();
    }

    public C0032n(C0031m c0031m) {
        this.f = (byte) -1;
        this.f1325g = -1;
        this.f1323d = c0031m.f2081d;
    }
}
