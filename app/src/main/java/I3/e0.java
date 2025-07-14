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

/* loaded from: classes.dex */
public final class e0 extends AbstractC0084p {

    /* renamed from: h, reason: collision with root package name */
    public static final e0 f1228h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0019a f1229i = new C0019a(23);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0073e f1230d;

    /* renamed from: e, reason: collision with root package name */
    public List f1231e;
    public byte f;

    /* renamed from: g, reason: collision with root package name */
    public int f1232g;

    static {
        e0 e0Var = new e0();
        f1228h = e0Var;
        e0Var.f1231e = Collections.emptyList();
    }

    public e0() {
        this.f = (byte) -1;
        this.f1232g = -1;
        this.f1230d = AbstractC0073e.f2065d;
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
        int i5 = this.f1232g;
        if (i5 != -1) {
            return i5;
        }
        int iD = 0;
        for (int i6 = 0; i6 < this.f1231e.size(); i6++) {
            iD += A1.j.d(1, (AbstractC0070b) this.f1231e.get(i6));
        }
        int size = this.f1230d.size() + iD;
        this.f1232g = size;
        return size;
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k d() {
        C0031m c0031m = new C0031m(2);
        c0031m.f1320g = Collections.emptyList();
        return c0031m;
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k e() {
        C0031m c0031m = new C0031m(2);
        c0031m.f1320g = Collections.emptyList();
        c0031m.m(this);
        return c0031m;
    }

    @Override // O3.AbstractC0070b
    public final void f(A1.j jVar) throws IOException {
        c();
        for (int i5 = 0; i5 < this.f1231e.size(); i5++) {
            jVar.o(1, (AbstractC0070b) this.f1231e.get(i5));
        }
        jVar.r(this.f1230d);
    }

    public final C0031m i() {
        C0031m c0031m = new C0031m(2);
        c0031m.f1320g = Collections.emptyList();
        c0031m.m(this);
        return c0031m;
    }

    public e0(C0074f c0074f, C0077i c0077i) {
        this.f = (byte) -1;
        this.f1232g = -1;
        this.f1231e = Collections.emptyList();
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
                                this.f1231e = new ArrayList();
                                z5 = true;
                            }
                            this.f1231e.add(c0074f.g(d0.f1211o, c0077i));
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
                    this.f1231e = Collections.unmodifiableList(this.f1231e);
                }
                try {
                    jVarJ.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f1230d = c0072d.l();
                    throw th2;
                }
                this.f1230d = c0072d.l();
                throw th;
            }
        }
        if (z5) {
            this.f1231e = Collections.unmodifiableList(this.f1231e);
        }
        try {
            jVarJ.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1230d = c0072d.l();
            throw th3;
        }
        this.f1230d = c0072d.l();
    }

    public e0(C0031m c0031m) {
        this.f = (byte) -1;
        this.f1232g = -1;
        this.f1230d = c0031m.f2081d;
    }
}
