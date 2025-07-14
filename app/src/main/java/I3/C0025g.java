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

/* renamed from: I3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0025g extends AbstractC0084p {

    /* renamed from: j, reason: collision with root package name */
    public static final C0025g f1238j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0019a f1239k = new C0019a(0);

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0073e f1240d;

    /* renamed from: e, reason: collision with root package name */
    public int f1241e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public List f1242g;

    /* renamed from: h, reason: collision with root package name */
    public byte f1243h;

    /* renamed from: i, reason: collision with root package name */
    public int f1244i;

    static {
        C0025g c0025g = new C0025g();
        f1238j = c0025g;
        c0025g.f = 0;
        c0025g.f1242g = Collections.emptyList();
    }

    public C0025g() {
        this.f1243h = (byte) -1;
        this.f1244i = -1;
        this.f1240d = AbstractC0073e.f2065d;
    }

    @Override // O3.x
    public final boolean b() {
        byte b2 = this.f1243h;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if ((this.f1241e & 1) != 1) {
            this.f1243h = (byte) 0;
            return false;
        }
        for (int i5 = 0; i5 < this.f1242g.size(); i5++) {
            if (!((C0023e) this.f1242g.get(i5)).b()) {
                this.f1243h = (byte) 0;
                return false;
            }
        }
        this.f1243h = (byte) 1;
        return true;
    }

    @Override // O3.AbstractC0070b
    public final int c() {
        int i5 = this.f1244i;
        if (i5 != -1) {
            return i5;
        }
        int iB = (this.f1241e & 1) == 1 ? A1.j.b(1, this.f) : 0;
        for (int i6 = 0; i6 < this.f1242g.size(); i6++) {
            iB += A1.j.d(2, (AbstractC0070b) this.f1242g.get(i6));
        }
        int size = this.f1240d.size() + iB;
        this.f1244i = size;
        return size;
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k d() {
        C0024f c0024f = new C0024f(0);
        c0024f.f1234g = Collections.emptyList();
        return c0024f;
    }

    @Override // O3.AbstractC0070b
    public final AbstractC0079k e() {
        C0024f c0024f = new C0024f(0);
        c0024f.f1234g = Collections.emptyList();
        c0024f.k(this);
        return c0024f;
    }

    @Override // O3.AbstractC0070b
    public final void f(A1.j jVar) throws IOException {
        c();
        if ((this.f1241e & 1) == 1) {
            jVar.m(1, this.f);
        }
        for (int i5 = 0; i5 < this.f1242g.size(); i5++) {
            jVar.o(2, (AbstractC0070b) this.f1242g.get(i5));
        }
        jVar.r(this.f1240d);
    }

    public C0025g(C0074f c0074f, C0077i c0077i) {
        this.f1243h = (byte) -1;
        this.f1244i = -1;
        boolean z4 = false;
        this.f = 0;
        this.f1242g = Collections.emptyList();
        C0072d c0072d = new C0072d();
        A1.j jVarJ = A1.j.j(c0072d, 1);
        char c2 = 0;
        while (!z4) {
            try {
                try {
                    try {
                        int iN = c0074f.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f1241e |= 1;
                                this.f = c0074f.k();
                            } else if (iN != 18) {
                                if (!c0074f.q(iN, jVarJ)) {
                                }
                            } else {
                                if ((c2 & 2) != 2) {
                                    this.f1242g = new ArrayList();
                                    c2 = 2;
                                }
                                this.f1242g.add(c0074f.g(C0023e.f1222k, c0077i));
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
                if ((c2 & 2) == 2) {
                    this.f1242g = Collections.unmodifiableList(this.f1242g);
                }
                try {
                    jVarJ.i();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f1240d = c0072d.l();
                    throw th2;
                }
                this.f1240d = c0072d.l();
                throw th;
            }
        }
        if ((c2 & 2) == 2) {
            this.f1242g = Collections.unmodifiableList(this.f1242g);
        }
        try {
            jVarJ.i();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f1240d = c0072d.l();
            throw th3;
        }
        this.f1240d = c0072d.l();
    }

    public C0025g(C0024f c0024f) {
        this.f1243h = (byte) -1;
        this.f1244i = -1;
        this.f1240d = c0024f.f2081d;
    }
}
