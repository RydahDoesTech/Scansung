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
public final class X extends AbstractC0084p {

    /* renamed from: j, reason: collision with root package name */
    public static final X f1134j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0019a f1135k = new C0019a(20);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0073e f1136d;

    /* renamed from: e, reason: collision with root package name */
    public int f1137e;
    public List f;

    /* renamed from: g, reason: collision with root package name */
    public int f1138g;

    /* renamed from: h, reason: collision with root package name */
    public byte f1139h;

    /* renamed from: i, reason: collision with root package name */
    public int f1140i;

    static {
        X x4 = new X();
        f1134j = x4;
        x4.f = Collections.emptyList();
        x4.f1138g = -1;
    }

    public X() {
        this.f1139h = (byte) -1;
        this.f1140i = -1;
        this.f1136d = AbstractC0073e.f2065d;
    }

    public static C0024f i(X x4) {
        C0024f c0024fI = C0024f.i();
        c0024fI.l(x4);
        return c0024fI;
    }

    @Override // O3.x
    public final boolean b() {
        byte b2 = this.f1139h;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i5 = 0; i5 < this.f.size(); i5++) {
            if (!((Q) this.f.get(i5)).b()) {
                this.f1139h = (byte) 0;
                return false;
            }
        }
        this.f1139h = (byte) 1;
        return true;
    }

    @Override // O3.AbstractC0070b
    public final int c() {
        int i5 = this.f1140i;
        if (i5 != -1) {
            return i5;
        }
        int iB = 0;
        for (int i6 = 0; i6 < this.f.size(); i6++) {
            iB += A1.j.d(1, (AbstractC0070b) this.f.get(i6));
        }
        if ((this.f1137e & 1) == 1) {
            iB += A1.j.b(2, this.f1138g);
        }
        int size = this.f1136d.size() + iB;
        this.f1140i = size;
        return size;
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k d() {
        return C0024f.i();
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k e() {
        return i(this);
    }

    @Override // O3.AbstractC0070b
    public final void f(A1.j jVar) throws IOException {
        c();
        for (int i5 = 0; i5 < this.f.size(); i5++) {
            jVar.o(1, (AbstractC0070b) this.f.get(i5));
        }
        if ((this.f1137e & 1) == 1) {
            jVar.m(2, this.f1138g);
        }
        jVar.r(this.f1136d);
    }

    public final C0024f j() {
        return i(this);
    }

    public X(C0074f c0074f, C0077i c0077i) {
        this.f1139h = (byte) -1;
        this.f1140i = -1;
        this.f = Collections.emptyList();
        this.f1138g = -1;
        C0072d c0072d = new C0072d();
        A1.j jVarJ = A1.j.j(c0072d, 1);
        boolean z4 = false;
        boolean z5 = false;
        while (!z4) {
            try {
                try {
                    try {
                        int iN = c0074f.n();
                        if (iN != 0) {
                            if (iN == 10) {
                                if (!z5) {
                                    this.f = new ArrayList();
                                    z5 = true;
                                }
                                this.f.add(c0074f.g(Q.f1073x, c0077i));
                            } else if (iN != 16) {
                                if (!c0074f.q(iN, jVarJ)) {
                                }
                            } else {
                                this.f1137e |= 1;
                                this.f1138g = c0074f.k();
                            }
                        }
                        z4 = true;
                    } catch (C0086s e5) {
                        e5.f2092d = this;
                        throw e5;
                    }
                } catch (IOException e6) {
                    C0086s c0086s = new C0086s(e6.getMessage());
                    c0086s.f2092d = this;
                    throw c0086s;
                }
            } catch (Throwable th) {
                if (z5) {
                    this.f = Collections.unmodifiableList(this.f);
                }
                try {
                    jVarJ.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f1136d = c0072d.l();
                    throw th2;
                }
                this.f1136d = c0072d.l();
                throw th;
            }
        }
        if (z5) {
            this.f = Collections.unmodifiableList(this.f);
        }
        try {
            jVarJ.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1136d = c0072d.l();
            throw th3;
        }
        this.f1136d = c0072d.l();
    }

    public X(C0024f c0024f) {
        this.f1139h = (byte) -1;
        this.f1140i = -1;
        this.f1136d = c0024f.f2081d;
    }
}
